@echo off
setlocal EnableExtensions DisableDelayedExpansion

rem Keep installer.bat and space-engine-installer.bat in sync.
set "REPO_URL=https://github.com/Purplegon2/aron-system-SE.git"
set "UPDATER_NAME=space-engine-installer.bat"

for %%I in ("%~f0") do (
	set "SELF_PATH=%%~fI"
	set "SELF_NAME=%%~nxI"
)

for %%I in ("%~dp0.") do set "INSTALL_DIR=%%~fI"

set "CLONE_DIR=%TEMP%\space-engine-clone-%RANDOM%-%RANDOM%"
set "UPDATE_PAYLOAD=%TEMP%\space-engine-installer-update-%RANDOM%-%RANDOM%.bat"
set "APPLY_UPDATE_CMD=%TEMP%\apply-space-engine-installer-update-%RANDOM%-%RANDOM%.cmd"

where git >nul 2>&1
if errorlevel 1 (
	echo git was not found in PATH.
	exit /b 1
)

echo Cloning repository...
git clone "%REPO_URL%" "%CLONE_DIR%"
if errorlevel 1 (
	echo Clone failed.
	call :cleanup
	exit /b 1
)

if not exist "%CLONE_DIR%\catalogs\" (
	echo The cloned repository does not contain a catalogs folder.
	call :cleanup
	exit /b 1
)

if exist "%CLONE_DIR%\%UPDATER_NAME%" (
	copy /y "%CLONE_DIR%\%UPDATER_NAME%" "%UPDATE_PAYLOAD%" >nul
	if errorlevel 1 (
		echo Failed to stage the installer update.
		call :cleanup
		exit /b 1
	)
)

echo Installing repo contents into "%INSTALL_DIR%"...
call :install_repo_contents
if errorlevel 1 (
	echo Installation failed.
	call :cleanup
	exit /b 1
)

if exist "%UPDATE_PAYLOAD%" (
	fc /b "%SELF_PATH%" "%UPDATE_PAYLOAD%" >nul
	if errorlevel 2 (
		echo Failed to compare the installer files.
		call :cleanup
		exit /b 1
	)
	if errorlevel 1 set "UPDATE_AVAILABLE=1"
)

call :cleanup_clone

if defined UPDATE_AVAILABLE (
	echo.
	<nul set /p "=Update current installer y/n "
	choice /C YN /N >nul
	echo.
	if errorlevel 1 if not errorlevel 2 (
		call :queue_self_update
		if errorlevel 1 (
			call :cleanup
			exit /b 1
		)
		echo Installer update queued. Closing.
		exit /b 0
	)
)

if exist "%UPDATE_PAYLOAD%" del /q "%UPDATE_PAYLOAD%" >nul 2>&1
if exist "%APPLY_UPDATE_CMD%" del /q "%APPLY_UPDATE_CMD%" >nul 2>&1

echo Install complete.
exit /b 0

:install_repo_contents
setlocal EnableDelayedExpansion
set "FAILED="
pushd "%CLONE_DIR%" >nul
if errorlevel 1 (
	echo Failed to access the cloned repository.
	endlocal & exit /b 1
)

for /d %%D in (*) do (
	if not defined FAILED (
		set "ITEM_NAME=%%~nxD"
		if not "!ITEM_NAME:~0,1!"=="." (
			if /I "!ITEM_NAME!"=="catalogs" (
				if exist "%INSTALL_DIR%\catalogs\" (
					echo Replacing existing catalogs folder...
					rmdir /s /q "%INSTALL_DIR%\catalogs"
					if exist "%INSTALL_DIR%\catalogs\" (
						echo Failed to remove the existing catalogs folder.
						set "FAILED=1"
					)
				)
			)

			if not defined FAILED (
				echo Copying !ITEM_NAME!...
				robocopy "%CLONE_DIR%\!ITEM_NAME!" "%INSTALL_DIR%\!ITEM_NAME!" /MIR /R:2 /W:1 /NFL /NDL /NJH /NJS /NP >nul
				set "ROBOCODE=!ERRORLEVEL!"
				if !ROBOCODE! GEQ 8 (
					echo Failed to copy !ITEM_NAME!.
					set "FAILED=1"
				)
			)
		)
	)
)

for %%F in (*) do (
	if not defined FAILED (
		set "ITEM_NAME=%%~nxF"
		if not "!ITEM_NAME:~0,1!"=="." (
			if /I not "!ITEM_NAME!"=="%UPDATER_NAME%" (
				if /I not "!ITEM_NAME!"=="%SELF_NAME%" (
					echo Copying !ITEM_NAME!...
					copy /y "%CLONE_DIR%\!ITEM_NAME!" "%INSTALL_DIR%\!ITEM_NAME!" >nul
					if errorlevel 1 (
						echo Failed to copy !ITEM_NAME!.
						set "FAILED=1"
					)
				)
			)
		)
	)
)

popd >nul

if defined FAILED (
	endlocal & exit /b 1
)

endlocal & exit /b 0

:queue_self_update
(
	echo @echo off
	echo setlocal EnableExtensions
	echo ping 127.0.0.1 -n 2 ^>nul
	echo copy /y "%UPDATE_PAYLOAD%" "%SELF_PATH%" ^>nul
	echo if errorlevel 1 exit /b 1
	echo del /q "%UPDATE_PAYLOAD%" ^>nul 2^>^&1
	echo del /q "%%~f0" ^>nul 2^>^&1
) > "%APPLY_UPDATE_CMD%"
if errorlevel 1 (
	echo Failed to create the installer update helper.
	exit /b 1
)

start "" cmd /c ""%APPLY_UPDATE_CMD%""
if errorlevel 1 (
	echo Failed to launch the installer update helper.
	exit /b 1
)

exit /b 0

:cleanup_clone
if exist "%CLONE_DIR%\" rmdir /s /q "%CLONE_DIR%" >nul 2>&1
exit /b 0

:cleanup
call :cleanup_clone
if exist "%UPDATE_PAYLOAD%" del /q "%UPDATE_PAYLOAD%" >nul 2>&1
if exist "%APPLY_UPDATE_CMD%" del /q "%APPLY_UPDATE_CMD%" >nul 2>&1
exit /b 0
