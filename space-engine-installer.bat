@echo off
setlocal EnableExtensions EnableDelayedExpansion

rem --- Settings ---
set "REPO_URL=https://github.com/Purplegon2/aron-system-SE.git"
set "GAME_REL=SteamLibrary\steamapps\common\SpaceEngine\Addons"

rem --- Check git ---
where git >nul 2>&1
if errorlevel 1 (
  echo ERROR: git was not found in PATH.
  echo Install Git for Windows, then re-run this script.
  goto :error_pause
)

rem --- Check robocopy ---
where robocopy >nul 2>&1
if errorlevel 1 (
  echo ERROR: robocopy was not found.
  goto :error_pause
)

rem --- Find SpaceEngine Addons folder under any SteamLibrary drive ---
set "ADDONS_DIR="
for %%D in (C D E F G H I J K L M N O P Q R S T U V W X Y Z) do (
  if exist "%%D:\%GAME_REL%\" (
    set "ADDONS_DIR=%%D:\%GAME_REL%"
    goto :found_addons
  )
)

:found_addons
if not defined ADDONS_DIR (
  echo ERROR: Could not find "%GAME_REL%" on any drive.
  echo Checked drives C: through Z: for SteamLibrary.
  goto :error_pause
)

echo Found Addons folder:
echo   "%ADDONS_DIR%"

rem --- Timestamp ---
for /f "usebackq delims=" %%T in (`powershell -NoProfile -Command "Get-Date -Format 'yyyyMMdd_HHmmss'"`) do set "TS=%%T"
if not defined TS (
  echo ERROR: Failed to generate timestamp.
  goto :error_pause
)

rem --- Archive existing catalogs folder ---
if exist "%ADDONS_DIR%\catalogs\" (
  set "ARCHIVE_NAME=catalogs-archive%TS%"
  echo Archiving existing catalogs as "%ARCHIVE_NAME%"...
  ren "%ADDONS_DIR%\catalogs" "%ARCHIVE_NAME%" >nul 2>&1
  if errorlevel 1 (
    echo ERROR: Failed to rename existing catalogs folder.
    goto :error_pause
  )
)

rem --- Temp workspace ---
set "TMPROOT=%TEMP%\se_catalogs_pull_%RANDOM%_%TS%"
mkdir "%TMPROOT%" >nul 2>&1
if errorlevel 1 (
  echo ERROR: Could not create temp folder.
  goto :error_pause
)

rem --- Clone repo ---
echo Cloning repo...
git clone --depth 1 "%REPO_URL%" "%TMPROOT%\repo" >nul 2>&1
if errorlevel 1 (
  echo ERROR: Failed to clone repo.
  goto :error_pause
)

rem --- Locate catalogs folder in repo ---
set "CAT_SRC="
for /f "delims=" %%P in ('dir /ad /b /s "%TMPROOT%\repo\catalogs" 2^>nul') do (
  set "CAT_SRC=%%P"
  goto :got_catalogs
)

:got_catalogs
if not defined CAT_SRC (
  echo ERROR: No catalogs folder found in repo.
  goto :error_pause
)

rem --- Copy catalogs tree ---
robocopy "%CAT_SRC%" "%ADDONS_DIR%\catalogs" /E /COPY:DAT /R:1 /W:1 >nul
set "RC=%ERRORLEVEL%"
if %RC% GEQ 8 (
  echo ERROR: robocopy failed with exit code %RC%.
  goto :error_pause
)

rem --- Create planets and stars folders ---
set "CAT_DEST=%ADDONS_DIR%\catalogs"

mkdir "%CAT_DEST%\planets" >nul 2>&1
if errorlevel 1 (
  echo ERROR: Failed to create planets folder.
  goto :error_pause
)

mkdir "%CAT_DEST%\stars" >nul 2>&1
if errorlevel 1 (
  echo ERROR: Failed to create stars folder.
  goto :error_pause
)

rem --- Create stars.sc with specified contents ---
(
echo StarBarycenter "Hope ^& Fate System"
echo {
echo     RA       09 31 14  // right ascension
echo     Dec      64 16 38  // declination
echo     Dist     421.0     // distance from the Sun
echo     Class   "X"        // spectral class - black hole
echo     Lum      150       // luminosity of the whole system ^(accretion disk^)^^// That's enough, accretion disks will be described in the planets catalog ^(see below^).
echo }
) > "%CAT_DEST%\stars\stars.sc"

if errorlevel 1 (
  echo ERROR: Failed to create stars.sc.
  goto :error_pause
)

rem --- Move all other .sc files into planets ---
for %%F in ("%CAT_DEST%\*.sc") do (
  move /Y "%%~fF" "%CAT_DEST%\planets\" >nul 2>&1
  if errorlevel 1 (
    echo ERROR: Failed to move "%%~nxF" into planets folder.
    goto :error_pause
  )
)

rem --- Cleanup ---
rmdir /s /q "%TMPROOT%" >nul 2>&1

echo Done successfully.
exit /b 0

:error_pause
echo.
echo Script stopped due to an error.
echo Press any key to close this window.
pause >nul
exit /b 1
