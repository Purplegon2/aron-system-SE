Planet	"Tiberius"
{
	ParentBody     "Fate"
	Class          "Neptune"
	Mass            6.444271
	Radius          19543.6484
	InertiaMoment   0.194705158
	Oblateness      0.0302526616
	RotationPeriod  1.85036311
	RotationEpoch   0
	Obliquity       -68.1207531
	EqAscendNode    -102.378115

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.68
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cool_default.cfg"
		SurfStyle       0.535
		Randomize      (-0.848, -0.295, 0.418)
		detailScale     256
		tropicLatitude  0.922
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.72
		stripeFluct     0.331
		stripeTwist     10.2
		cycloneMagn     7.65
		cycloneFreq     0.686
		cycloneDensity  0.506
		cycloneOctaves  0
		cycloneMagn2     0.462
		cycloneFreq2     0.505
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      15
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.964
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          90.1
		Velocity        691
		BumpHeight      20
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.964
		ModulateBright  1
		mainFreq        0.966
		mainOctaves     12
		Coverage        0.594
		stripeZones     1.72
		stripeFluct     0.331
		stripeTwist     10.2
	}

	Clouds
	{
		Height          90.1
		Velocity        1.33e+03
		BumpHeight      18.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.964
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.966
		mainOctaves     12
		Coverage        0.594
		stripeZones     1.72
		stripeFluct     0.331
		stripeTwist     10.2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          390.780975
		Density         0.00645037275
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.0145
		Saturation      1.02

		Composition
		{
			H2        	92.1
			He        	7.47
			CH4       	0.357
			N2        	0.0418
			NH3       	0.0257
			O2        	0.00901
			C2H2      	0.00304
			C2H4      	0.00134
			Ne        	0.00109
			Ar        	0.000843
			C2H6      	0.00062
			C8H18     	0.000323
			C3H8      	0.000314
			H2O       	3.19e-06
			CO2       	1.59e-06
			H2S       	1.5e-06
			Kr        	3.74e-07
			Xe        	3.95e-08
			SO2       	9.9e-09
			Cl2       	3.8e-10
			CO        	3.79e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  353
	}

	Aurora
	{
		Height         547
		NorthLat       68.5
		NorthLon       -71.2
		NorthRadius    7.15e+03
		NorthWidth     1.89e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 70.8
		NorthMoveSpeed 0.617
		NorthParticles 10000
		SouthLat       -61.6
		SouthLon       97.2
		SouthRadius    5.8e+03
		SouthWidth     1.62e+03
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 67.6
		SouthMoveSpeed 0.762
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     2.54e+04
		OuterRadius     1.02e+05
		EdgeRadius      6.02e+04
		MeanRadius      3.9e+04
		Thickness       0.367
		RocksMaxSize    0.00316
		RocksSpacing    1
		DustDrawDist    1.1e+03
		ChartRadius     6.02e+04
		RotationPeriod  5.46
		Brightness      0.916
		FrontBright     2.9
		BackBright      6.03
		Density         0.964
		Opacity         0.964
		SelfShadow      0.964
		PlanetShadow    0.473
		Hapke           1
		SpotBright      2.56
		SpotWidth       0.0269
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       5.8
		densityScale    1.59
		densityOffset   -0.157
		densityPower    0.998
		colorContrast   0.168
		FrontColor      (0.513 0.622 0.738)
		BackThickColor  (0.652 0.556 0.459)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (0.533 0.699 0.637)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.62323586
		SemiMajorAxis   1.06362732
		Eccentricity    0.0610687023
		Inclination     4.34232
		AscendingNode   -165.642303
		ArgOfPericenter 75.5421467
		MeanAnomaly     51.2263922
	}
}

Moon	"Varelia"
{
	ParentBody     "Tiberius"
	Class          "Terra"
	Mass            0.017510578
	Radius          1834.09375
	InertiaMoment   0.369014353
	Obliquity       0.75172051
	EqAscendNode    152.056478
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_mercury.cfg"
		SurfStyle       0.841
		Randomize      (0.551, 0.747, -0.659)
		colorDistMagn   0.0772
		colorDistFreq   189
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.206
		snowLevel       2
		tropicLatitude  0.203
		icecapLatitude  2
		icecapHeight    0.486
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.219
		heightTempGrad  0.625
		beachWidth      0.000701
		tropicWidth     0.07
		mainFreq        1.64
		venusFreq       0.222
		venusMagn       0
		mareFreq        0.807
		mareDensity     0.107
		terraceProb     0.454
		erosion         0
		montesMagn      0.0801
		montesFreq      87.2
		montesSpiky     0.985
		montesFraction  0.0987
		dunesMagn       0.0343
		dunesFreq       17.1
		dunesFraction   0.987
		hillsMagn       0.108
		hillsFreq       177
		hillsFraction   0.212
		hills2Fraction  0
		riversMagn      60.9
		riversFreq      2.72
		riversSin       4.89
		riftsMagn       66.9
		riftsFreq       3.38
		riftsSin        7.06
		canyonsMagn     0.715
		canyonsFreq     0.642
		canyonsFraction 0.507
		cracksMagn      0.0288
		cracksFreq      0.995
		cracksOctaves   0
		craterMagn      0.553
		craterFreq      4.17
		craterDensity   0.828
		craterOctaves   19
		craterRayedFactor 0.24
		volcanoMagn     0.296
		volcanoFreq     0.868
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.211
		volcanoRadius   0.263
		volcanoTemp     1.24e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          137.652496
		Density         5.68312771e-06
		Pressure        9.78700427e-07
		Bright          0.996
		Opacity         0
		SkyLight        0.332
		Hue             -0.0128
		Saturation      0.866

		Composition
		{
			C8H18     	64
			Xe        	36
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.7717006
		SemiMajorAxisKm 410154.792
		Eccentricity    0.0273717032
		Inclination     0.75172051
		AscendingNode   152.056478
		ArgOfPericenter -123.136839
		MeanAnomaly     -66.2341558
	}
}



