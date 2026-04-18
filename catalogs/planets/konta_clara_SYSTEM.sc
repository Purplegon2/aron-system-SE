Star	"Konta Clara"
{
	ParentBody     "Konta Clara System"
	Class          "M2.6 V"
	Luminosity      0.00584662287
	LumBol          0.0124195283
	MassSol         0.28109923
	RadSol          0.280202031
	Teff            3514

	Age             0.0138

	InertiaMoment   0.0475503653
	RotationPeriod  296.716026
	RotationEpoch   0
	Obliquity       197.696762
	EqAscendNode    73.9074249

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.572 0.262)

	Surface
	{
		SurfStyle       0.205
		Randomize      (0.098, 0.919, -0.770)
		colorDistMagn   0
		colorDistFreq   0
		detailScale     8.19e+03
		tropicLatitude  0.95
		icecapLatitude  1.05
		climatePole     0.46
		climateTropic   0.0691
		mareFreq        30.4
		mareDensity     0.013
		erosion         1
		montesMagn      0.03
		montesFreq      537
		dunesMagn       0.557
		hillsMagn       0.03
		hillsFreq       1.15e+03
		canyonsMagn     0.277
		cracksOctaves   5
		BumpHeight      318
		BumpOffset      318
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.7
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          1949.36548
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      1.08e+06
		Period      0.0245
		Brightness  0.5
		RayDensity  2.99
		RayCurv     9.21
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		Period          0
		SemiMajorAxis   0
		Eccentricity    0
		Inclination     197.696762
		AscendingNode   73.9074249
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "Konta Clara"
	Class          "Neptune"
	Mass            5.67432642
	Radius          10141.4121
	InertiaMoment   0.331450313
	Obliquity       -0.671399882
	EqAscendNode    -144.391068
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_temperate_default.cfg"
		SurfStyle       0.867
		Randomize      (-0.834, 0.716, -0.865)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 2
		lavaCoverTidal  0.158
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.28
		stripeFluct     0.474
		stripeTwist     11.7
		cycloneMagn     14.3
		cycloneFreq     1
		cycloneDensity  0.379
		cycloneOctaves  1
		cycloneMagn2     0.318
		cycloneFreq2     0.752
		cycloneLatitude2 0.85
		cycloneOctaves2  0
		BumpHeight      13.4
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          48
		Velocity        167
		BumpHeight      8.31
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.31
		mainOctaves     12
		Coverage        0.46
		stripeZones     1.28
		stripeFluct     0.474
		stripeTwist     11.7
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         1079.91748
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.0148
		Saturation      0.817

		Composition
		{
			CO2       	70.7
			N2        	26.7
			H2O       	1.83
			SO2       	0.743
			CO        	0.0155
			NH3       	0.000183
			H2        	0.000165
			Ar        	7.04e-05
			C2H2      	1.73e-05
			CH4       	1.28e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  17.4
	}

	Aurora
	{
		Height         113
		NorthLat       52.2
		NorthLon       -22.3
		NorthRadius    3.01e+03
		NorthWidth     972
		NorthRings     2
		NorthBright    0.709
		NorthFlashFreq 60.2
		NorthMoveSpeed 0.869
		NorthParticles 10000
		SouthLat       -24.1
		SouthLon       167
		SouthRadius    2.71e+03
		SouthWidth     713
		SouthRings     5
		SouthBright    0.709
		SouthFlashFreq 71.3
		SouthMoveSpeed 1.02
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0333825875
		SemiMajorAxis   0.0679164354
		Eccentricity    0.00979234689
		Inclination     -0.671399882
		AscendingNode   -144.391068
		ArgOfPericenter 132.62094
		MeanAnomaly     32.668808
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            1.66715797e-08
	Radius          19.8976402
	InertiaMoment   0.399106383
	Oblateness     (0.136, 0.038, 0.000)
	Obliquity       0.0128802455
	EqAscendNode    -61.9414087
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.717 0.713 0.711)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0391
		Randomize      (-0.060, -0.361, -0.189)
		colorDistMagn   0.786
		colorDistFreq   0.152
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.000225
		icecapLatitude  2
		icecapHeight    0.452
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.435
		heightTempGrad  0.625
		beachWidth      0.000541
		tropicWidth     0.07
		mainFreq        0.518
		venusFreq       0.596
		venusMagn       0.48
		mareDensity     0
		terraceProb     0.628
		erosion         0
		montesMagn      0.473
		montesFreq      3.36
		montesSpiky     0.925
		montesFraction  0.399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.966
		hillsFraction   0.499
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.274
		craterDensity   0.812
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406
		volcanoTemp     1.04e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.9
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

	NoAtmosphere    true

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
		PeriodDays      0.40775748
		SemiMajorAxisKm 41430.399
		Eccentricity    4.2219918e-05
		Inclination     0.0128802455
		AscendingNode   -61.9414087
		ArgOfPericenter -65.6272606
		MeanAnomaly     -18.3804693
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            2.26469172e-08
	Radius          22.646204
	InertiaMoment   0.399039298
	Oblateness     (0.120, 0.022, 0.000)
	Obliquity       141.802916
	EqAscendNode    -43.1108782
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.501 0.495 0.489)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.608
		Randomize      (0.210, -0.531, 0.144)
		colorDistMagn   0.8
		colorDistFreq   0.341
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.618
		icecapLatitude  2
		icecapHeight    0.828
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.333
		heightTempGrad  0.625
		beachWidth      0.000589
		tropicWidth     0.07
		mainFreq        0.338
		venusFreq       0.612
		venusMagn       0.443
		mareDensity     0
		terraceProb     0.214
		erosion         0
		montesMagn      0.593
		montesFreq      2.71
		montesSpiky     0.872
		montesFraction  0.481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13
		hillsFraction   0.623
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.224
		craterDensity   0.917
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485
		volcanoTemp     1.19e+03
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

	NoAtmosphere    true

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
		PeriodDays      0.620422987
		SemiMajorAxisKm 54807.8895
		Eccentricity    0.00439327874
		Inclination     141.802916
		AscendingNode   -43.1108782
		ArgOfPericenter -81.3976743
		MeanAnomaly     110.452816
	}
}

Planet	"2"
{
	ParentBody     "Konta Clara"
	Class          "Jupiter"
	Mass            37.5069237
	Radius          26340.6211
	InertiaMoment   0.260734081
	Oblateness      0.0330747478
	RotationPeriod  9.21139211
	RotationEpoch   0
	Obliquity       -7.92041735
	EqAscendNode    54.1278676

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_II.cfg"
		SurfStyle       0.236
		Randomize      (-0.069, -0.690, -0.024)
		detailScale     256
		tropicLatitude  0.159
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.0651
		lavaCoverSun    0
		lavaCoverYoung  0.31
		stripeZones     1.46
		stripeFluct     0.427
		stripeTwist     2.4
		cycloneMagn     2.72
		cycloneFreq     0.711
		cycloneDensity  0.221
		cycloneOctaves  2
		BumpHeight      13.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          260
		Velocity        -95
		BumpHeight      22
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.0789
		mainOctaves     10
		Coverage        0.55
		stripeZones     1.46
		stripeFluct     0.427
		stripeTwist     2.4
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          630.314819
		Density         0.00536718592
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.00994
		Saturation      1.07

		Composition
		{
			H2        	93.2
			He        	6.42
			CH4       	0.303
			N2        	0.0309
			NH3       	0.0243
			O2        	0.0077
			C2H2      	0.00274
			C2H4      	0.00118
			Ne        	0.000929
			Ar        	0.000766
			C2H6      	0.000629
			C8H18     	0.000341
			C3H8      	0.000282
			H2O       	3.32e-06
			CO2       	1.4e-06
			H2S       	1.36e-06
			Kr        	3.75e-07
			Xe        	3.29e-08
			SO2       	8.44e-09
			Cl2       	3.19e-10
			CO        	3.18e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  369
	}

	Aurora
	{
		Height         791
		NorthLat       82
		NorthLon       177
		NorthRadius    5.61e+03
		NorthWidth     2.93e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 70.7
		NorthMoveSpeed 1.39
		NorthParticles 10000
		SouthLat       -82.9
		SouthLon       -5.89
		SouthRadius    7.63e+03
		SouthWidth     3.94e+03
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 75.5
		SouthMoveSpeed 1.25
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0932636767
		SemiMajorAxis   0.134736669
		Eccentricity    0.131674573
		Inclination     1.21792077
		AscendingNode   53.5102938
		ArgOfPericenter 357.446496
		MeanAnomaly     41.6029513
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            4.59597686e-07
	Radius          60.6490822
	InertiaMoment   0.398816854
	Oblateness     (0.224, 0.004, 0.000)
	Obliquity       156.039619
	EqAscendNode    -70.0891269
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.512 0.504 0.501)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.363
		Randomize      (0.120, 0.062, -0.611)
		colorDistMagn   0.511
		colorDistFreq   3.22
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.475
		icecapLatitude  1.99
		icecapHeight    0.743
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39
		heightTempGrad  0.625
		beachWidth      0.000786
		tropicWidth     0.07
		mainFreq        0.473
		venusFreq       0.453
		venusMagn       0.557
		mareDensity     0
		terraceProb     0.268
		erosion         0
		montesMagn      0.325
		montesFreq      2.66
		montesSpiky     0.87
		montesFraction  0.593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.69
		hillsFraction   0.398
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.245
		craterDensity   0.904
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452
		volcanoTemp     1.1e+03
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

	NoAtmosphere    true

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
		PeriodDays      1.42360214
		SemiMajorAxisKm 178940.763
		Eccentricity    0.0114820531
		Inclination     156.039619
		AscendingNode   -70.0891269
		ArgOfPericenter -66.1653909
		MeanAnomaly     -178.952981
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            6.48939704e-07
	Radius          65.9721375
	InertiaMoment   0.398744315
	Oblateness     (0.173, 0.002, 0.000)
	Obliquity       47.3070768
	EqAscendNode    -23.4070161
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.691 0.687 0.684)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.933
		Randomize      (0.391, -0.108, -0.278)
		colorDistMagn   0.525
		colorDistFreq   2.19
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.63
		icecapLatitude  1.98
		icecapHeight    0.66
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.287
		heightTempGrad  0.625
		beachWidth      0.00113
		tropicWidth     0.07
		mainFreq        0.755
		venusFreq       0.543
		venusMagn       0.547
		mareDensity     0
		terraceProb     0.424
		erosion         0
		montesMagn      0.493
		montesFreq      3.36
		montesSpiky     0.993
		montesFraction  0.67
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.5
		hillsFraction   0.588
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.271
		craterFreq      0.203
		craterDensity   1.02
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     1.15e+03
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

	NoAtmosphere    true

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
		PeriodDays      1.87585261
		SemiMajorAxisKm 215071.404
		Eccentricity    0.0244777806
		Inclination     47.3070768
		AscendingNode   -23.4070161
		ArgOfPericenter 42.0022176
		MeanAnomaly     -118.409374
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            9.26621226e-07
	Radius          76.8913803
	InertiaMoment   0.398670077
	Oblateness     (0.055, 0.000, 0.000)
	Obliquity       213.537281
	EqAscendNode    -16.4695726
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.475 0.468 0.462)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.502
		Randomize      (0.661, -0.278, 0.055)
		colorDistMagn   0.539
		colorDistFreq   4.79
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.421
		icecapLatitude  1.96
		icecapHeight    0.596
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.185
		heightTempGrad  0.625
		beachWidth      0.00118
		tropicWidth     0.07
		mainFreq        0.541
		venusFreq       0.566
		venusMagn       0.537
		mareDensity     0
		terraceProb     0.156
		erosion         0
		montesMagn      0.63
		montesFreq      2.71
		montesSpiky     0.96
		montesFraction  0.771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.2
		hillsFraction   0.691
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.261
		craterDensity   0.845
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556
		volcanoTemp     1.3e+03
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

	NoAtmosphere    true

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
		PeriodDays      3.15372215
		SemiMajorAxisKm 304087.906
		Eccentricity    0.0597233581
		Inclination     213.537281
		AscendingNode   -16.4695726
		ArgOfPericenter -88.3983267
		MeanAnomaly     69.6121876
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.34101833e-06
	Radius          84.6437912
	InertiaMoment   0.398593962
	Obliquity       135.031936
	EqAscendNode    -85.453831
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.688 0.652 0.612)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0706
		Randomize      (0.931, -0.448, 0.388)
		colorDistMagn   0.554
		colorDistFreq   3.36
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.724
		icecapLatitude  1.95
		icecapHeight    0.53
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.483
		heightTempGrad  0.625
		beachWidth      0.00093
		tropicWidth     0.07
		mainFreq        0.372
		venusFreq       0.584
		venusMagn       0.525
		mareDensity     0
		terraceProb     0.277
		erosion         0
		montesMagn      0.464
		montesFreq      3.42
		montesSpiky     0.922
		montesFraction  0.189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4
		hillsFraction   0.877
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.213
		craterFreq      0.242
		craterDensity   0.944
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     1.04e+03
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

	NoAtmosphere    true

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
		PeriodDays      4.74993162
		SemiMajorAxisKm 399553.649
		Eccentricity    0.201983434
		Inclination     135.031936
		AscendingNode   -85.453831
		ArgOfPericenter -147.799506
		MeanAnomaly     6.96357653
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.97232998e-06
	Radius          99.4456177
	InertiaMoment   0.398515761
	RotationPeriod  120.896072
	Obliquity       130.428225
	EqAscendNode    -163.409067

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.493 0.444 0.369)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.64
		Randomize      (-0.798, -0.618, 0.721)
		colorDistMagn   0.568
		colorDistFreq   7.51
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.654
		icecapLatitude  2
		icecapHeight    0.442
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38
		heightTempGrad  0.625
		beachWidth      0.000978
		tropicWidth     0.07
		mainFreq        0.615
		venusFreq       0.6
		venusMagn       0.51
		mareDensity     0
		terraceProb     0.441
		erosion         0
		montesMagn      0.581
		montesFreq      2.76
		montesSpiky     0.867
		montesFraction  0.364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23
		hillsFraction   0.57
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.236
		craterDensity   0.752
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509
		volcanoTemp     1.19e+03
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

	NoAtmosphere    true

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
		PeriodDays      7.5560043
		SemiMajorAxisKm 544475.504
		Eccentricity    0.158397895
		Inclination     130.428225
		AscendingNode   -163.409067
		ArgOfPericenter -60.1184605
		MeanAnomaly     -32.4982233
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.95805603e-06
	Radius          110.234528
	InertiaMoment   0.398435205
	Obliquity       223.189422
	EqAscendNode    -73.4053245
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.682 0.579 0.543)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.209
		Randomize      (-0.528, -0.788, -0.946)
		colorDistMagn   0.582
		colorDistFreq   5.28
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.66
		icecapLatitude  2
		icecapHeight    0.809
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.278
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.452
		venusFreq       0.615
		venusMagn       0.491
		mareDensity     0
		terraceProb     0.165
		erosion         0
		montesMagn      0.432
		montesFreq      3.48
		montesSpiky     0.991
		montesFraction  0.455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.2
		hillsFraction   0.674
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.225
		craterFreq      0.435
		craterDensity   0.887
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57
		volcanoTemp     1.14e+03
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

	NoAtmosphere    true

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
		PeriodDays      9.33646357
		SemiMajorAxisKm 626958.054
		Eccentricity    0.00713139644
		Inclination     223.189422
		AscendingNode   -73.4053245
		ArgOfPericenter 67.5094837
		MeanAnomaly     167.298528
	}
}

Planet	"3"
{
	ParentBody     "Konta Clara"
	Class          "Neptune"
	Mass            4.3559823
	Radius          14056.9688
	InertiaMoment   0.219015688
	Oblateness      0.0183505379
	RotationPeriod  13.1865246
	RotationEpoch   0
	Obliquity       16.4023805
	EqAscendNode    174.642392

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cool_default.cfg"
		SurfStyle       0.399
		Randomize      (-0.296, -0.459, -0.580)
		detailScale     256
		tropicLatitude  0.288
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.59
		stripeFluct     0.326
		stripeTwist     11.3
		cycloneMagn     8.18
		cycloneFreq     1.04
		cycloneDensity  0.369
		cycloneOctaves  1
		cycloneMagn2     0.732
		cycloneFreq2     0.814
		cycloneLatitude2 0.977
		cycloneOctaves2  0
		BumpHeight      20
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          288
		Velocity        347
		BumpHeight      12.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.601
		mainOctaves     12
		Coverage        0.579
		stripeZones     1.59
		stripeFluct     0.326
		stripeTwist     11.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          690.427734
		Density         0.0125910612
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0145
		Saturation      0.934

		Composition
		{
			He        	82.7
			H2        	13.2
			CH4       	3.2
			N2        	0.433
			NH3       	0.351
			O2        	0.0981
			C2H2      	0.0353
			C2H4      	0.0154
			Ne        	0.0142
			Ar        	0.00968
			C2H6      	0.00804
			C3H8      	0.00428
			C8H18     	0.00367
			H2O       	3.93e-05
			CO2       	2.05e-05
			H2S       	1.71e-05
			Kr        	4.14e-06
			Xe        	4.42e-07
			SO2       	1.14e-07
			CO        	4.38e-09
			Cl2       	3.72e-09
		}
	}

	Climate
	{
		GlobalWindSpeed  299
	}

	Aurora
	{
		Height         180
		NorthLat       50.1
		NorthLon       43.6
		NorthRadius    4.47e+03
		NorthWidth     847
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 68.5
		NorthMoveSpeed 1.09
		NorthParticles 10000
		SouthLat       -40.9
		SouthLon       -152
		SouthRadius    3.45e+03
		SouthWidth     771
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 70
		SouthMoveSpeed 1.55
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     1.8e+04
		OuterRadius     2.95e+04
		EdgeRadius      2.95e+04
		MeanRadius      2.19e+04
		Thickness       0.0945
		RocksMaxSize    0.00378
		RocksSpacing    1
		DustDrawDist    284
		ChartRadius     2.95e+04
		RotationPeriod  4.85
		Brightness      1
		FrontBright     2.76
		BackBright      1.91
		Density         0.234
		Opacity         0.234
		SelfShadow      0.117
		PlanetShadow    0.117
		Hapke           1
		SpotBright      0.989
		SpotWidth       0.0234
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       763
		densityScale    2.06
		densityOffset   -1.51
		densityPower    0.994
		colorContrast   0.0882
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.139662706
		SemiMajorAxis   0.176338236
		Eccentricity    0.00363777109
		Inclination     -0.358692778
		AscendingNode   173.201016
		ArgOfPericenter 199.1586
		MeanAnomaly     230.706318
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            6.10616446e-10
	Radius          6.39228106
	InertiaMoment   0.398158342
	Oblateness     (0.073, 0.124, 0.000)
	Obliquity       0.00206923383
	EqAscendNode    -174.048201
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.672 0.620 0.576)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.964
		Randomize      (-0.618, -0.195, 0.300)
		colorDistMagn   0.242
		colorDistFreq   0.0236
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.288
		icecapLatitude  0.906
		icecapHeight    0.075
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.335
		heightTempGrad  0.625
		beachWidth      0.000923
		tropicWidth     0.07
		mainFreq        0.565
		venusFreq       0.507
		venusMagn       0.0258
		mareDensity     0
		terraceProb     0.217
		erosion         0
		montesMagn      0.485
		montesFreq      3.42
		montesSpiky     0.99
		montesFraction  0.568
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0795
		hillsFraction   0.526
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.252
		craterDensity   0.873
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.75
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

	NoAtmosphere    true

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
		PeriodDays      0.161347118
		SemiMajorAxisKm 20446.355
		Eccentricity    4.50665471e-05
		Inclination     0.00206923383
		AscendingNode   -174.048201
		ArgOfPericenter -9.66693937
		MeanAnomaly     -16.9158016
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            8.90863106e-10
	Radius          7.56623602
	InertiaMoment   0.398064256
	Oblateness     (0.073, 0.120, 0.000)
	Obliquity       0.00740441007
	EqAscendNode    115.962118
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.471 0.410 0.339)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.533
		Randomize      (-0.348, -0.365, 0.633)
		colorDistMagn   0.262
		colorDistFreq   0.0107
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.288
		icecapLatitude  0.886
		icecapHeight    0.0766
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.232
		heightTempGrad  0.625
		beachWidth      0.000671
		tropicWidth     0.07
		mainFreq        0.401
		venusFreq       0.549
		venusMagn       0.0357
		mareDensity     0
		terraceProb     0.348
		erosion         0
		montesMagn      0.613
		montesFreq      2.76
		montesSpiky     0.957
		montesFraction  0.641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2
		hillsFraction   0.64
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.209
		craterDensity   0.975
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421
		volcanoTemp     901
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.81
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

	NoAtmosphere    true

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
		PeriodDays      0.198740111
		SemiMajorAxisKm 23494.4586
		Eccentricity    2.58630423e-05
		Inclination     0.00740441007
		AscendingNode   115.962118
		ArgOfPericenter 96.2407745
		MeanAnomaly     10.1983757
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            1.28065558e-09
	Radius          8.19796658
	InertiaMoment   0.397965699
	Oblateness     (0.073, 0.117, 0.000)
	Obliquity       0.000817696676
	EqAscendNode    138.453967
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.668 0.605 0.505)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.102
		Randomize      (-0.077, -0.535, 0.966)
		colorDistMagn   0.281
		colorDistFreq   0.0367
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.288
		icecapLatitude  0.865
		icecapHeight    0.0763
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13
		heightTempGrad  0.625
		beachWidth      0.000719
		tropicWidth     0.07
		mainFreq        0.643
		venusFreq       0.571
		venusMagn       0.0412
		mareDensity     0
		terraceProb     0.104
		erosion         0
		montesMagn      0.455
		montesFreq      3.48
		montesSpiky     0.919
		montesFraction  0.731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.183
		hillsFraction   0.754
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.268
		craterFreq      0.27
		craterDensity   0.806
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488
		volcanoTemp     1.05e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.38
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

	NoAtmosphere    true

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
		PeriodDays      0.219260682
		SemiMajorAxisKm 25085.0862
		Eccentricity    9.54702973e-05
		Inclination     0.000817696676
		AscendingNode   138.453967
		ArgOfPericenter -7.4242336
		MeanAnomaly     54.6274208
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            1.8184475e-09
	Radius          9.59583855
	InertiaMoment   0.397861898
	Oblateness     (0.072, 0.111, 0.000)
	Obliquity       0.013669298
	EqAscendNode    57.2705373
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.770 0.766 0.765)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.671
		Randomize      (0.193, -0.705, -0.701)
		colorDistMagn   0.3
		colorDistFreq   0.00445
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.289
		icecapLatitude  0.839
		icecapHeight    0.0725
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.428
		heightTempGrad  0.625
		beachWidth      0.000766
		tropicWidth     0.07
		mainFreq        0.476
		venusFreq       0.588
		venusMagn       0.0554
		mareDensity     0
		terraceProb     0.226
		erosion         0
		montesMagn      0.57
		montesFreq      2.8
		montesSpiky     0.861
		montesFraction  0.894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.226
		hillsFraction   0.501
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24
		craterFreq      0.222
		craterDensity   0.913
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535
		volcanoTemp     1.1e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.64
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

	NoAtmosphere    true

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
		PeriodDays      0.263711102
		SemiMajorAxisKm 28370.0891
		Eccentricity    3.46850945e-05
		Inclination     0.013669298
		AscendingNode   57.2705373
		ArgOfPericenter -26.5315736
		MeanAnomaly     -33.950293
	}
}

Moon	"3.1"
{
	ParentBody     "3"
	Class          "Ferria"
	Mass            0.00351802935
	Radius          906.168945
	InertiaMoment   0.397628605
	Oblateness      0.0136623709
	Obliquity       -1.15533809
	EqAscendNode    72.7505306
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.555 0.547 0.543)

	Surface
	{
		Preset         "ferria_airless_mercury.cfg"
		SurfStyle       0.24
		Randomize      (0.464, -0.875, -0.368)
		colorDistMagn   0.0517
		colorDistFreq   111
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.135
		snowLevel       2
		tropicLatitude  0.283
		icecapLatitude  1
		icecapHeight    0.327
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.325
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        2.09
		venusFreq       1.03
		venusMagn       0
		mareFreq        0.203
		mareDensity     0.178
		terraceProb     0.359
		erosion         0
		montesMagn      0.0491
		montesFreq      54.1
		montesSpiky     0.914
		montesFraction  0.0721
		dunesMagn       0.0388
		dunesFreq       5.78
		dunesFraction   0.599
		hillsMagn       0.106
		hillsFreq       85.3
		hillsFraction   0.453
		hills2Fraction  0
		riversMagn      65.2
		riversFreq      2.41
		riversSin       6.06
		riftsMagn       65.9
		riftsFreq       3.39
		riftsSin        5.16
		canyonsMagn     0.371
		canyonsFreq     0.258
		canyonsFraction 0.635
		cracksMagn      0.0684
		cracksFreq      0.504
		cracksOctaves   0
		craterMagn      0.552
		craterFreq      2.17
		craterDensity   0.849
		craterOctaves   18
		craterRayedFactor 0.145
		volcanoMagn     0.17
		volcanoFreq     0.753
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.978
		volcanoFlows    0.309
		volcanoRadius   0.145
		volcanoTemp     956
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

	NoAtmosphere    true

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
		PeriodDays      0.504454808
		SemiMajorAxisKm 43729.3952
		Eccentricity    7.49673798e-05
		Inclination     -1.15533809
		AscendingNode   72.7505306
		ArgOfPericenter 3.48170243
		MeanAnomaly     161.926146
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            3.56099106e-09
	Radius          12.4249182
	InertiaMoment   0.397634894
	Oblateness     (0.027, 0.003, 0.000)
	Obliquity       14.5191386
	EqAscendNode    -151.863711
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.731 0.730 0.728)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.809
		Randomize      (0.734, 0.955, -0.035)
		colorDistMagn   0.336
		colorDistFreq   0.128
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.136
		icecapLatitude  0.65
		icecapHeight    0.307
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.223
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        0.545
		venusFreq       0.619
		venusMagn       0.0887
		mareDensity     0
		terraceProb     0.113
		erosion         0
		montesMagn      0.538
		montesFreq      2.85
		montesSpiky     0.956
		montesFraction  0.426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.297
		hillsFraction   0.732
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.234
		craterDensity   0.855
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494
		volcanoTemp     992
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.2
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

	NoAtmosphere    true

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
		PeriodDays      2.61988211
		SemiMajorAxisKm 131108.12
		Eccentricity    0.155149865
		Inclination     14.5191386
		AscendingNode   -151.863711
		ArgOfPericenter -144.10424
		MeanAnomaly     -18.0119788
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            4.92673546e-09
	Radius          13.6229973
	InertiaMoment   0.397509038
	Oblateness     (0.003, 0.003, 0.000)
	RotationPeriod  42.7206374
	Obliquity       196.142256
	EqAscendNode    130.463415

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.514 0.511 0.508)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.378
		Randomize      (-0.996, 0.785, 0.298)
		colorDistMagn   0.354
		colorDistFreq   0.0892
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.236
		icecapLatitude  0.753
		icecapHeight    0.18
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.121
		heightTempGrad  0.625
		beachWidth      0.00061
		tropicWidth     0.07
		mainFreq        0.377
		venusFreq       0.638
		venusMagn       0.501
		mareDensity     0
		terraceProb     0.234
		erosion         0
		montesMagn      0.373
		montesFreq      3.63
		montesSpiky     0.917
		montesFraction  0.504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.615
		hillsFraction   0.468
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.19
		craterDensity   0.954
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543
		volcanoTemp     1.14e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.3
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

	NoAtmosphere    true

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
		PeriodDays      4.45006633
		SemiMajorAxisKm 186646.312
		Eccentricity    0.425086631
		Inclination     196.142256
		AscendingNode   130.463415
		ArgOfPericenter -72.5825885
		MeanAnomaly     140.035315
	}
}

Planet	"4"
{
	ParentBody     "Konta Clara"
	Class          "Neptune"
	Mass            2.77284241
	Radius          8843.68066
	InertiaMoment   0.328865558
	Oblateness      0.0112658767
	RotationPeriod  12.7440346
	RotationEpoch   0
	Obliquity       -350.597223
	EqAscendNode    156.868219

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cold_default.cfg"
		SurfStyle       0.382
		Randomize      (-0.561, -0.246, 0.310)
		detailScale     256
		tropicLatitude  0.226
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.25
		stripeFluct     0.494
		stripeTwist     2.79
		cycloneMagn     2.9
		cycloneFreq     0.62
		cycloneDensity  0.453
		cycloneOctaves  3
		BumpHeight      16.7
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.989
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          33.3
		Velocity        92
		BumpHeight      7.68
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.989
		ModulateBright  1
		mainFreq        0.0776
		mainOctaves     10
		Coverage        0.607
		stripeZones     1.25
		stripeFluct     0.494
		stripeTwist     2.79
	}

	Clouds
	{
		Height          50
		Velocity        179
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.989
		ModulateBright  1
		Opacity         0.19
		mainFreq        0.0776
		mainOctaves     10
		Coverage        0.607
		stripeZones     1.25
		stripeFluct     0.494
		stripeTwist     2.79
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          100
		Density         1212.10901
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0198
		Saturation      1.82

		Composition
		{
			N2        	84.9
			CO2       	14.7
			SO2       	0.315
			H2O       	0.0286
			CO        	0.0285
			H2        	0.00301
			C2H2      	0.00184
			C2H4      	0.00166
			H2S       	0.00119
			NH3       	0.000893
			CH4       	0.000642
			C2H6      	0.000119
			He        	2.29e-05
			Ar        	1.9e-05
			Ne        	1.4e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  16.9
	}

	Aurora
	{
		Height         98.3
		NorthLat       64.8
		NorthLon       153
		NorthRadius    2.29e+03
		NorthWidth     651
		NorthRings     5
		NorthBright    0.567
		NorthFlashFreq 74.3
		NorthMoveSpeed 0.783
		NorthParticles 10000
		SouthLat       -72.7
		SouthLon       -17.7
		SouthRadius    2.46e+03
		SouthWidth     596
		SouthRings     4
		SouthBright    0.567
		SouthFlashFreq 68.9
		SouthMoveSpeed 0.874
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     1.38e+04
		OuterRadius     5.22e+04
		EdgeRadius      1.86e+04
		MeanRadius      1.54e+04
		Thickness       0.0625
		RocksMaxSize    0.0025
		RocksSpacing    1
		DustDrawDist    188
		ChartRadius     1.86e+04
		RotationPeriod  3.42
		Brightness      1
		FrontBright     2.57
		BackBright      4.33
		Density         0.989
		Opacity         0.989
		SelfShadow      0.989
		PlanetShadow    0.989
		Hapke           1
		SpotBright      2.3
		SpotWidth       0.0356
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.5
		densityScale    1.5
		densityOffset   -0.214
		densityPower    0.991
		colorContrast   0.0776
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.404866182
		SemiMajorAxis   0.358507357
		Eccentricity    0.0179858099
		Inclination     -3.66325123
		AscendingNode   156.917851
		ArgOfPericenter 175.14893
		MeanAnomaly     81.7909555
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.46173415e-08
	Radius          41.6470222
	InertiaMoment   0.397019148
	Oblateness     (0.009, 0.014, 0.000)
	Obliquity       -0.0149904574
	EqAscendNode    4.6490754
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.529 0.520 0.516)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.134
		Randomize      (0.914, -0.623, -0.457)
		colorDistMagn   0.91
		colorDistFreq   1.08
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.226
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.177
		heightTempGrad  0.625
		beachWidth      0.00141
		tropicWidth     0.07
		mainFreq        0.499
		venusFreq       0.555
		venusMagn       0.573
		mareDensity     0
		terraceProb     0.289
		erosion         0
		montesMagn      0.446
		montesFreq      3.55
		montesSpiky     0.916
		montesFraction  0.615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.09
		hillsFraction   0.692
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.214
		craterDensity   0.939
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512
		volcanoTemp     101
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

	NoAtmosphere    true

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
		PeriodDays      0.164049857
		SemiMajorAxisKm 17784.3784
		Eccentricity    7.01280209e-05
		Inclination     -0.0149904574
		AscendingNode   4.6490754
		ArgOfPericenter -87.5823319
		MeanAnomaly     27.2147955
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.29330658e-07
	Radius          41.6192818
	InertiaMoment   0.396822184
	Oblateness     (0.008, 0.005, 0.000)
	Obliquity       -0.00232192987
	EqAscendNode    -45.6462691
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.705 0.703 0.702)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.703
		Randomize      (-0.815, -0.792, -0.124)
		colorDistMagn   0.925
		colorDistFreq   0.487
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.226
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.475
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        0.305
		venusFreq       0.575
		venusMagn       0.565
		mareDensity     0
		terraceProb     0.466
		erosion         0
		montesMagn      0.56
		montesFreq      2.85
		montesSpiky     0.855
		montesFraction  0.696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47
		hillsFraction   0.882
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.142
		craterDensity   0.739
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579
		volcanoTemp     275
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

	NoAtmosphere    true

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
		PeriodDays      0.375758457
		SemiMajorAxisKm 30902.5258
		Eccentricity    3.92369658e-05
		Inclination     -0.00232192987
		AscendingNode   -45.6462691
		ArgOfPericenter -97.4293241
		MeanAnomaly     168.867742
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.77525564e-07
	Radius          51.9103966
	InertiaMoment   0.396588475
	Oblateness      0.00146019587
	RotationPeriod  71.3396695
	Obliquity       226.18446
	EqAscendNode    19.6105475

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.489 0.484 0.481)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.272
		Randomize      (-0.545, -0.962, 0.209)
		colorDistMagn   0.94
		colorDistFreq   1.59
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.854
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.373
		heightTempGrad  0.625
		beachWidth      0.0018
		tropicWidth     0.07
		mainFreq        0.568
		venusFreq       0.592
		venusMagn       0.556
		mareDensity     0
		terraceProb     0.176
		erosion         0
		montesMagn      0.409
		montesFreq      3.63
		montesSpiky     0.987
		montesFraction  0.816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.29
		hillsFraction   0.571
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.265
		craterFreq      0.227
		craterDensity   0.883
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473
		volcanoTemp     238
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

	NoAtmosphere    true

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
		PeriodDays      7.43121546
		SemiMajorAxisKm 225992.852
		Eccentricity    0.430663659
		Inclination     226.18446
		AscendingNode   19.6105475
		ArgOfPericenter 107.545372
		MeanAnomaly     51.5738619
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.44978622e-07
	Radius          50.6899185
	InertiaMoment   0.396295935
	Obliquity       151.22554
	EqAscendNode    -91.7075844
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.669 0.666 0.663)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.841
		Randomize      (-0.275, 0.868, 0.542)
		colorDistMagn   0.955
		colorDistFreq   0.554
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.526
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        0.405
		venusFreq       0.607
		venusMagn       0.547
		mareDensity     0
		terraceProb     0.299
		erosion         0
		montesMagn      0.529
		montesFreq      2.89
		montesSpiky     0.954
		montesFraction  0.266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.36
		hillsFraction   0.675
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.179
		craterDensity   0.987
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518
		volcanoTemp     998
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

	NoAtmosphere    true

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
		PeriodDays      9.29347686
		SemiMajorAxisKm 262325.363
		Eccentricity    0.409237761
		Inclination     151.22554
		AscendingNode   -91.7075844
		ArgOfPericenter -6.79434598
		MeanAnomaly     -121.879582
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4028119e-07
	Radius          59.2104416
	InertiaMoment   0.395892292
	RotationPeriod  187.998166
	Obliquity       37.0507355
	EqAscendNode    -128.889883

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.452 0.448 0.442)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.41
		Randomize      (-0.004, 0.698, 0.875)
		colorDistMagn   0.971
		colorDistFreq   1.95
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.505
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.168
		heightTempGrad  0.625
		beachWidth      0.000999
		tropicWidth     0.07
		mainFreq        0.648
		venusFreq       0.624
		venusMagn       0.536
		mareDensity     0
		terraceProb     0.488
		erosion         0
		montesMagn      0.352
		montesFreq      3.73
		montesSpiky     0.914
		montesFraction  0.395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6
		hillsFraction   0.821
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.206
		craterFreq      0.24
		craterDensity   0.819
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.625
		volcanoTemp     235
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

	NoAtmosphere    true

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
		PeriodDays      11.749885
		SemiMajorAxisKm 306721.26
		Eccentricity    0.161434682
		Inclination     37.0507355
		AscendingNode   -128.889883
		ArgOfPericenter 99.6571047
		MeanAnomaly     -147.271844
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.76424162e-07
	Radius          61.2343407
	InertiaMoment   0.395180315
	Obliquity       162.173641
	EqAscendNode    11.9348354
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.633 0.626 0.624)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.979
		Randomize      (0.266, 0.528, -0.792)
		colorDistMagn   0.986
		colorDistFreq   0.418
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0993
		icecapLatitude  0.992
		icecapHeight    0.00548
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.466
		heightTempGrad  0.625
		beachWidth      0.00135
		tropicWidth     0.07
		mainFreq        0.479
		venusFreq       0.643
		venusMagn       0.524
		mareDensity     0
		terraceProb     0.185
		erosion         0
		montesMagn      0.5
		montesFreq      2.93
		montesSpiky     0.852
		montesFraction  0.478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9
		hillsFraction   0.552
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.197
		craterDensity   0.922
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48
		volcanoTemp     1.19e+03
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

	NoAtmosphere    true

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
		PeriodDays      15.0783112
		SemiMajorAxisKm 362206.803
		Eccentricity    0.471215121
		Inclination     162.173641
		AscendingNode   11.9348354
		ArgOfPericenter 20.2410462
		MeanAnomaly     36.9382828
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.73432794e-07
	Radius          78.8905792
	InertiaMoment   0.39997977
	RotationPeriod  205.550182
	Obliquity       45.7971737
	EqAscendNode    16.071012

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.415 0.408 0.404)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.548
		Randomize      (0.537, 0.358, -0.459)
		colorDistMagn   0.00542
		colorDistFreq   3.27
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.852
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.363
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.261
		venusFreq       0.674
		venusMagn       0.509
		mareDensity     0
		terraceProb     0.309
		erosion         0
		montesMagn      0.65
		montesFreq      3.88
		montesSpiky     0.986
		montesFraction  0.55
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16
		hillsFraction   0.659
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.222
		craterFreq      0.254
		craterDensity   1.08
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525
		volcanoTemp     232
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

	NoAtmosphere    true

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
		PeriodDays      21.411477
		SemiMajorAxisKm 457599.88
		Eccentricity    0.410993834
		Inclination     45.7971737
		AscendingNode   16.071012
		ArgOfPericenter 46.6131619
		MeanAnomaly     166.158731
	}
}

Planet	"5"
{
	ParentBody     "Konta Clara"
	Class          "Terra"
	Mass            0.0663663298
	Radius          2897.95654
	InertiaMoment   0.33518514
	Oblateness      0.00371095119
	RotationPeriod  27.2357841
	RotationEpoch   0
	Obliquity       290.569653
	EqAscendNode    1.94119957

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.699 0.593 0.510)

	Surface
	{
		Preset         "terra_arid_sandy_green.cfg"
		SurfStyle       0.666
		Randomize      (-0.847, -0.962, 0.824)
		colorDistMagn   0.0606
		colorDistFreq   363
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.161
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35
		heightTempGrad  0.625
		beachWidth      0.000986
		tropicWidth     0.07
		mainFreq        1.85
		venusFreq       1.79
		venusMagn       0
		mareFreq        1.97
		mareDensity     0.159
		terraceProb     0.197
		erosion         0
		montesMagn      0.189
		montesFreq      149
		montesSpiky     0.987
		montesFraction  0.395
		dunesMagn       0.0445
		dunesFreq       20.6
		dunesFraction   0.334
		hillsMagn       0.114
		hillsFreq       328
		hillsFraction   0.932
		hills2Fraction  0
		riversMagn      49.6
		riversFreq      2.16
		riversSin       5.12
		riftsMagn       62.6
		riftsFreq       2.63
		riftsSin        5.11
		canyonsMagn     0.44
		canyonsFreq     1.05
		canyonsFraction 0.781
		cracksMagn      0.0734
		cracksFreq      1.5
		cracksOctaves   0
		craterMagn      0.662
		craterFreq      9.36
		craterDensity   0.99
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.57
		volcanoFreq     0.519
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.276
		volcanoRadius   0.374
		volcanoTemp     1.18e+03
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
		Hapke           0.997
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
		Height          155.766647
		Density         0.000314190314
		Pressure        0.000105182269
		Greenhouse      0.190094754
		Bright          2.54
		Opacity         0
		SkyLight        0.846
		Hue             0.000824
		Saturation      0.886

		Composition
		{
			N2        	97.1
			CO2       	1.14
			C2H4      	0.939
			H2S       	0.361
			CO        	0.205
			C2H6      	0.146
			SO2       	0.0872
			C2H2      	0.0498
			C3H8      	0.00152
			Ar        	0.000232
			O2        	0.000116
			C8H18     	1.14e-05
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
		Period          0.882781975
		SemiMajorAxis   0.602821197
		Eccentricity    0.0450172462
		Inclination     -1.94723356
		AscendingNode   -1.28688608
		ArgOfPericenter 110.224799
		MeanAnomaly     50.7511424
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.13626844e-10
	Radius          3.84997535
	InertiaMoment   0.399786741
	Oblateness      0.248999998
	Obliquity       -0.00205014856
	EqAscendNode    -176.653648
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.426 0.421 0.416)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.303
		Randomize      (0.447, 0.950, 0.787)
		colorDistMagn   0.701
		colorDistFreq   0.00994
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42
		heightTempGrad  0.625
		beachWidth      0.000992
		tropicWidth     0.07
		mainFreq        0.432
		venusFreq       0.579
		venusMagn       0.576
		mareDensity     0
		terraceProb     0.376
		erosion         0
		montesMagn      0.396
		montesFreq      3.73
		montesSpiky     0.985
		montesFraction  0.666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0364
		hillsFraction   0.502
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.163
		craterDensity   1.03
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498
		volcanoTemp     1.16e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.46
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

	NoAtmosphere    true

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
		PeriodDays      0.136910652
		SemiMajorAxisKm 4543.1159
		Eccentricity    9.51894947e-05
		Inclination     -0.00205014856
		AscendingNode   -176.653648
		ArgOfPericenter -165.497724
		MeanAnomaly     71.3453925
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.82397444e-10
	Radius          4.59828758
	InertiaMoment   0.399726063
	Oblateness      0.248999998
	Obliquity       -0.0120482698
	EqAscendNode    152.745343
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.712 0.630 0.492)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.873
		Randomize      (0.717, 0.780, -0.880)
		colorDistMagn   0.714
		colorDistFreq   0.00737
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.318
		heightTempGrad  0.625
		beachWidth      0.00074
		tropicWidth     0.07
		mainFreq        0.681
		venusFreq       0.596
		venusMagn       0.569
		mareDensity     0
		terraceProb     0.126
		erosion         0
		montesMagn      0.52
		montesFreq      2.93
		montesSpiky     0.951
		montesFraction  0.765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0469
		hillsFraction   0.625
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.232
		craterDensity   0.851
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548
		volcanoTemp     1.2e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.14
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

	NoAtmosphere    true

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
		PeriodDays      0.163237421
		SemiMajorAxisKm 5108.28916
		Eccentricity    5.26108894e-05
		Inclination     -0.0120482698
		AscendingNode   152.745343
		ArgOfPericenter 68.9005773
		MeanAnomaly     -32.4628925
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.83422646e-10
	Radius          5.23837852
	InertiaMoment   0.399665117
	Oblateness      0.145587012
	Obliquity       0.00684483283
	EqAscendNode    -17.4648051
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.808 0.773 0.759)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.442
		Randomize      (0.987, 0.610, -0.547)
		colorDistMagn   0.728
		colorDistFreq   0.0174
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.215
		heightTempGrad  0.625
		beachWidth      0.000787
		tropicWidth     0.07
		mainFreq        0.503
		venusFreq       0.611
		venusMagn       0.56
		mareDensity     0
		terraceProb     0.246
		erosion         0
		montesMagn      0.321
		montesFreq      3.88
		montesSpiky     0.911
		montesFraction  0.171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0532
		hillsFraction   0.733
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.263
		craterFreq      0.187
		craterDensity   0.949
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455
		volcanoTemp     1.05e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.71
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

	NoAtmosphere    true

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
		PeriodDays      0.240212884
		SemiMajorAxisKm 6608.85953
		Eccentricity    5.81465415e-05
		Inclination     0.00684483283
		AscendingNode   -17.4648051
		ArgOfPericenter -72.6263799
		MeanAnomaly     -159.734097
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            4.29079577e-10
	Radius          5.91123152
	InertiaMoment   0.399603873
	Oblateness      0.0598898269
	Obliquity       0.000742789765
	EqAscendNode    -157.114868
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.628 0.547 0.501)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0107
		Randomize      (-0.742, 0.441, -0.214)
		colorDistMagn   0.741
		colorDistFreq   0.0105
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.113
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.312
		venusFreq       0.628
		venusMagn       0.551
		mareDensity     0
		terraceProb     0.389
		erosion         0
		montesMagn      0.492
		montesFreq      2.97
		montesSpiky     0.845
		montesFraction  0.359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119
		hillsFraction   0.47
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.245
		craterDensity   0.765
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     1.2e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.32
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

	NoAtmosphere    true

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
		PeriodDays      0.364838921
		SemiMajorAxisKm 8732.32246
		Eccentricity    8.07207182e-05
		Inclination     0.000742789765
		AscendingNode   -157.114868
		ArgOfPericenter 65.7526686
		MeanAnomaly     99.0846883
	}
}

DwarfMoon	"5.1"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.54480801e-05
	Radius          232.864059
	InertiaMoment   0.397909343
	Oblateness      0.0110466061
	Obliquity       1.03755377
	EqAscendNode    -167.552269
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.792 0.741 0.700)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.58
		Randomize      (-0.472, 0.271, 0.119)
		colorDistMagn   0.755
		colorDistFreq   32.6
		detailScale     1.02e+03
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.93
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.411
		heightTempGrad  0.625
		beachWidth      0.000583
		tropicWidth     0.07
		mainFreq        0.572
		venusFreq       0.649
		venusMagn       0.541
		mareDensity     0
		terraceProb     0.135
		erosion         0
		montesMagn      0.629
		montesFreq      4.24
		montesSpiky     0.983
		montesFraction  0.451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       147
		hillsFraction   0.609
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2
		craterFreq      1.72
		craterDensity   0.892
		craterOctaves   17
		volcanoActivity 0.0219
		volcanoFlows    0
		volcanoRadius   0.559
		volcanoTemp     1.05e+03
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

	NoAtmosphere    true

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
		PeriodDays      0.859729068
		SemiMajorAxisKm 15465.3197
		Eccentricity    0.00081967343
		Inclination     1.03755377
		AscendingNode   -167.552269
		ArgOfPericenter -109.518285
		MeanAnomaly     24.9254805
	}
}

DwarfMoon	"5.2"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            4.44078687e-05
	Radius          275.828888
	InertiaMoment   0.399815291
	Oblateness      0.0029270337
	Obliquity       -0.619851722
	EqAscendNode    34.0517221
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.629 0.532 0.425)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.149
		Randomize      (-0.202, 0.101, 0.452)
		colorDistMagn   0.769
		colorDistFreq   18.3
		detailScale     1.02e+03
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.927
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.309
		heightTempGrad  0.625
		beachWidth      0.00183
		tropicWidth     0.07
		mainFreq        0.409
		venusFreq       0.688
		venusMagn       0.53
		mareDensity     0
		terraceProb     0.255
		erosion         0
		montesMagn      0.463
		montesFreq      3.01
		montesSpiky     0.95
		montesFraction  0.525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       186
		hillsFraction   0.714
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      3.1
		craterDensity   1
		craterOctaves   17
		volcanoActivity 0.0939
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     1.19e+03
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

	NoAtmosphere    true

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
		PeriodDays      1.63575274
		SemiMajorAxisKm 23748.5767
		Eccentricity    0.00351941422
		Inclination     -0.619851722
		AscendingNode   34.0517221
		ArgOfPericenter 37.8786223
		MeanAnomaly     -172.268417
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.32967914e-09
	Radius          8.84532356
	InertiaMoment   0.399417609
	Obliquity       21.1168593
	EqAscendNode    63.3383269
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.781 0.723 0.635)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.718
		Randomize      (0.069, -0.069, 0.785)
		colorDistMagn   0.782
		colorDistFreq   0.0445
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.862
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.206
		heightTempGrad  0.625
		beachWidth      0.000979
		tropicWidth     0.07
		mainFreq        0.652
		venusFreq       0.531
		venusMagn       0.517
		mareDensity     0
		terraceProb     0.403
		erosion         0
		montesMagn      0.58
		montesFreq      2.02
		montesSpiky     0.909
		montesFraction  0.596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.172
		hillsFraction   0.42
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.216
		craterDensity   0.831
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     1.04e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.96
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

	NoAtmosphere    true

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
		PeriodDays      15.5386112
		SemiMajorAxisKm 106496.938
		Eccentricity    0.230778501
		Inclination     21.1168593
		AscendingNode   63.3383269
		ArgOfPericenter 27.8283956
		MeanAnomaly     153.575887
	}
}

DwarfMoon	"5.D6"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.88584104e-09
	Radius          9.78663254
	InertiaMoment   0.399354458
	Obliquity       52.4816386
	EqAscendNode    157.35244
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.628 0.424 0.350)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.287
		Randomize      (0.339, -0.239, -0.882)
		colorDistMagn   0.796
		colorDistFreq   0.0148
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.897
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.104
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.483
		venusFreq       0.559
		venusMagn       0.5
		mareDensity     0
		terraceProb     0.144
		erosion         0
		montesMagn      0.431
		montesFreq      3.05
		montesSpiky     0.841
		montesFraction  0.674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.184
		hillsFraction   0.593
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.152
		craterDensity   0.931
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574
		volcanoTemp     1.09e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.81
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

	NoAtmosphere    true

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
		PeriodDays      29.9445929
		SemiMajorAxisKm 164920.483
		Eccentricity    0.0976526854
		Inclination     52.4816386
		AscendingNode   157.35244
		ArgOfPericenter 16.9398846
		MeanAnomaly     -124.633002
	}
}

DwarfMoon	"5.D7"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.64774624e-09
	Radius          11.2197771
	InertiaMoment   0.399290681
	RotationPeriod  705.1442
	Obliquity       223.106434
	EqAscendNode    40.4363758

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.710 0.658 0.631)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.856
		Randomize      (0.610, -0.409, -0.549)
		colorDistMagn   0.81
		colorDistFreq   0.0675
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.649
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.402
		heightTempGrad  0.625
		beachWidth      0.000175
		tropicWidth     0.07
		mainFreq        0.27
		venusFreq       0.578
		venusMagn       0.477
		mareDensity     0
		terraceProb     0.264
		erosion         0
		montesMagn      0.546
		montesFreq      2.21
		montesSpiky     0.982
		montesFraction  0.778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.412
		hillsFraction   0.696
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.229
		craterDensity   0.697
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471
		volcanoTemp     1.14e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.1
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

	NoAtmosphere    true

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
		PeriodDays      58.7620166
		SemiMajorAxisKm 258499.744
		Eccentricity    0.179620102
		Inclination     223.106434
		AscendingNode   40.4363758
		ArgOfPericenter -45.2532498
		MeanAnomaly     43.339421
	}
}

DwarfMoon	"5.D8"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            3.68632924e-09
	Radius          12.2823772
	InertiaMoment   0.399226159
	RotationPeriod  624.797671
	RotationEpoch   0
	Obliquity       278.90751
	EqAscendNode    98.3179362

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.521 0.441 0.382)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.425
		Randomize      (0.880, -0.579, -0.217)
		colorDistMagn   0.824
		colorDistFreq   0.132
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.982
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.299
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        0.552
		venusFreq       0.594
		venusMagn       0.437
		mareDensity     0
		terraceProb     0.418
		erosion         0
		montesMagn      0.388
		montesFreq      3.09
		montesSpiky     0.949
		montesFraction  0.206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.407
		hillsFraction   0.906
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.264
		craterFreq      0.183
		craterDensity   0.874
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517
		volcanoTemp     1.19e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.1
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

	NoAtmosphere    true

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
		PeriodDays      83.2497508
		SemiMajorAxisKm 326075.086
		Eccentricity    0.225067015
		Inclination     219.81552
		AscendingNode   96.3967344
		ArgOfPericenter 122.621129
		MeanAnomaly     -20.6919346
	}
}

Planet	"6"
{
	ParentBody     "Konta Clara"
	Class          "Aquaria"
	Mass            8.27473831
	Radius          13020.8701
	InertiaMoment   0.331066638
	Oblateness      0.0166327693
	RotationPeriod  10.8904978
	RotationEpoch   0
	Obliquity       305.530167
	EqAscendNode    -160.409408

	AlbedoBond      0.781
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.745 0.742 0.738)

	Surface
	{
		Preset         "aquaria_wet_white_blue_seas.cfg"
		SurfStyle       0.933
		Randomize      (-0.720, 0.807, -0.738)
		colorDistMagn   0.0611
		colorDistFreq   1.74e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.0355
		snowLevel       0.85
		tropicLatitude  0.814
		icecapLatitude  2
		icecapHeight    0.718
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.262
		heightTempGrad  0.375
		beachWidth      0.00121
		tropicWidth     0.5
		mainFreq        1.56
		venusFreq       0.456
		venusMagn       0.967
		mareFreq        2.06
		mareDensity     0
		terraceProb     0.52
		erosion         0.119
		montesMagn      0.262
		montesFreq      672
		montesSpiky     0.999
		montesFraction  0.927
		dunesMagn       0.0466
		dunesFreq       117
		dunesFraction   0.809
		hillsMagn       0.143
		hillsFreq       1.66e+03
		hillsFraction   0.508
		hills2Fraction  0.523
		riversMagn      57
		riversFreq      2.06
		riversSin       7.02
		riftsMagn       0
		riftsFreq       3.16
		riftsSin        6.73
		canyonsMagn     0.0338
		canyonsFreq     360
		canyonsFraction 0.671
		cracksMagn      0.0411
		cracksFreq      3.74
		cracksOctaves   6
		craterMagn      0.741
		craterFreq      40.3
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.595
		volcanoFreq     0.654
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.559
		volcanoRadius   0.525
		volcanoTemp     266
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.69
		stripeTwist     0.0985
		cycloneMagn     2.64
		cycloneFreq     0.758
		cycloneDensity  0.243
		cycloneOctaves  2
		BumpHeight      14.2
		BumpOffset      0.505
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.25
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.505
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			N2        	93.7
			CO        	6.33
		}
	}

	Clouds
	{
		Height          12.4
		Velocity        153
		BumpHeight      2.91
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.963
		ModulateBright  1
		mainFreq        0.98
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.69
		stripeTwist     0.0985
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          28.4194221
		Density         84.018158
		Pressure        13.4148197
		Greenhouse      4.40028048
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             -0.0964
		Saturation      0.817

		Composition
		{
			N2        	91.5
			CO        	8.11
			H2        	0.3
			He        	0.0889
			Ar        	0.00326
			Ne        	0.000752
			CH4       	0.000139
			Kr        	4.63e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  2.28
	}

	Aurora
	{
		Height         9.01
		NorthLat       78.4
		NorthLon       -88.6
		NorthRadius    3.56e+03
		NorthWidth     938
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 64.6
		NorthMoveSpeed 1.35
		NorthParticles 50000
		SouthLat       -82.6
		SouthLon       82.6
		SouthRadius    4.41e+03
		SouthWidth     1.27e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 70.4
		SouthMoveSpeed 1.48
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     2.05e+04
		OuterRadius     9.72e+04
		EdgeRadius      4.81e+04
		MeanRadius      2.97e+04
		Thickness       0.0441
		RocksMaxSize    0.00176
		RocksSpacing    1
		DustDrawDist    132
		ChartRadius     4.81e+04
		RotationPeriod  6.11
		Brightness      1
		FrontBright     2.77
		BackBright      4.43
		Density         0.963
		Opacity         0.963
		SelfShadow      0.963
		PlanetShadow    0.963
		Hapke           1
		SpotBright      2.24
		SpotWidth       0.0337
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.07
		densityScale    1.69
		densityOffset   -0.178
		densityPower    1
		colorContrast   0.0803
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.09621059
		SemiMajorAxis   1.07297314
		Eccentricity    0.100934634
		Inclination     0.0434299595
		AscendingNode   -157.449572
		ArgOfPericenter 277.383745
		MeanAnomaly     45.0348012
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.17401818e-08
	Radius          45.95718
	InertiaMoment   0.399013877
	Oblateness     (0.293, 0.274, 0.000)
	Obliquity       -0.00617996056
	EqAscendNode    159.842301
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.465 0.464 0.461)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.18
		Randomize      (0.790, 0.013, -0.971)
		colorDistMagn   0.535
		colorDistFreq   0.767
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.814
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.356
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.686
		venusFreq       0.655
		venusMagn       0.556
		mareDensity     0
		terraceProb     0.563
		erosion         0
		montesMagn      0.454
		montesFreq      3.05
		montesSpiky     0.947
		montesFraction  0.422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.44
		hillsFraction   0.66
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.209
		craterDensity   0.861
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49
		volcanoTemp     133
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

	NoAtmosphere    true

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
		PeriodDays      0.317074565
		SemiMajorAxisKm 39728.7968
		Eccentricity    7.74179675e-05
		Inclination     -0.00617996056
		AscendingNode   159.842301
		ArgOfPericenter 126.206473
		MeanAnomaly     -8.86304428
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            9.77756187e-08
	Radius          38.1056328
	InertiaMoment   0.398945272
	Oblateness     (0.276, 0.096, 0.000)
	Obliquity       0.0100563661
	EqAscendNode    119.750595
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.647 0.643 0.642)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.749
		Randomize      (-0.940, -0.157, -0.638)
		colorDistMagn   0.55
		colorDistFreq   0.939
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.814
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.254
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.506
		venusFreq       0.717
		venusMagn       0.546
		mareDensity     0
		terraceProb     0.205
		erosion         0
		montesMagn      0.569
		montesFreq      2.22
		montesSpiky     0.906
		montesFraction  0.5
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38
		hillsFraction   0.787
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.181
		craterFreq      0.27
		craterDensity   0.96
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537
		volcanoTemp     236
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

	NoAtmosphere    true

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
		PeriodDays      0.469982447
		SemiMajorAxisKm 51647.8484
		Eccentricity    8.28613363e-05
		Inclination     0.0100563661
		AscendingNode   119.750595
		ArgOfPericenter 93.0851443
		MeanAnomaly     -95.4241912
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.000122998666
	Radius          489.06488
	InertiaMoment   0.398364216
	Oblateness      0.00917966291
	Obliquity       -0.768769815
	EqAscendNode    -86.3529421
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.514 0.395 0.337)

	Surface
	{
		Preset         "aquaria_airless_ganymede.cfg"
		SurfStyle       0.319
		Randomize      (-0.669, -0.326, -0.305)
		colorDistMagn   0.0627
		colorDistFreq   52.7
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.138
		snowLevel       2
		tropicLatitude  0.815
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.151
		heightTempGrad  0.625
		beachWidth      0.000815
		tropicWidth     0.07
		mainFreq        1.58
		venusFreq       0.553
		venusMagn       0
		mareFreq        0
		mareDensity     0.155
		terraceProb     0.333
		erosion         0
		montesMagn      0.0621
		montesFreq      17.3
		montesSpiky     0.893
		montesFraction  0.633
		dunesMagn       0.032
		dunesFreq       4.47
		dunesFraction   0.593
		hillsMagn       0.125
		hillsFreq       15.7
		hillsFraction   0.311
		hills2Fraction  0.138
		riversMagn      0
		riversFreq      2.14
		riversSin       6.45
		riftsMagn       0
		riftsFreq       4.02
		riftsSin        5.71
		canyonsMagn     0.453
		canyonsFreq     0.141
		canyonsFraction 0
		cracksMagn      0.0267
		cracksFreq      0.15
		cracksOctaves   0
		craterMagn      0.629
		craterFreq      1.49
		craterDensity   0.939
		craterOctaves   17
		craterRayedFactor 0.0991
		volcanoMagn     0.183
		volcanoFreq     0.759
		volcanoDensity  0.21
		volcanoOctaves  3
		volcanoActivity 0.225
		volcanoFlows    0.435
		volcanoRadius   0.14
		volcanoTemp     320
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     644
		OuterRadius     1.86e+03
		EdgeRadius      812
		MeanRadius      700
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     812
		RotationPeriod  4.9
		Brightness      1
		FrontBright     2.99
		BackBright      4.11
		Density         0.987
		Opacity         0.987
		SelfShadow      0.987
		PlanetShadow    0.987
		Hapke           1
		SpotBright      2.45
		SpotWidth       0.0292
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.89
		densityScale    1.41
		densityOffset   -0.137
		densityPower    4.9
		colorContrast   0.0777
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.30679171
		SemiMajorAxisKm 102126.287
		Eccentricity    0.000868303263
		Inclination     -0.768769815
		AscendingNode   -86.3529421
		ArgOfPericenter 61.7185844
		MeanAnomaly     -66.0448015
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.000179359587
	Radius          488.078156
	InertiaMoment   0.39604333
	Oblateness      0.00234719017
	Obliquity       1.0611094
	EqAscendNode    69.2067923
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.709 0.591 0.504)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.888
		Randomize      (-0.399, -0.496, 0.028)
		colorDistMagn   0.0634
		colorDistFreq   63.2
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.132
		snowLevel       2
		tropicLatitude  0.81
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.449
		heightTempGrad  0.625
		beachWidth      0.000863
		tropicWidth     0.07
		mainFreq        1.87
		venusFreq       0.73
		venusMagn       0
		mareFreq        0
		mareDensity     0.116
		terraceProb     0.621
		erosion         0
		montesMagn      0.0668
		montesFreq      27.9
		montesSpiky     0.826
		montesFraction  0.136
		dunesMagn       0.0403
		dunesFreq       3.46
		dunesFraction   0.324
		hillsMagn       0.106
		hillsFreq       13.9
		hillsFraction   0.846
		hills2Fraction  0.197
		riversMagn      0
		riversFreq      4.25
		riversSin       6.62
		riftsMagn       0
		riftsFreq       1.21
		riftsSin        6.06
		canyonsMagn     0.391
		canyonsFreq     0.169
		canyonsFraction 0
		cracksMagn      0.0461
		cracksFreq      0.249
		cracksOctaves   0
		craterMagn      0.591
		craterFreq      1.25
		craterDensity   0.788
		craterOctaves   17
		craterRayedFactor 0.232
		volcanoMagn     0.182
		volcanoFreq     0.553
		volcanoDensity  0.284
		volcanoOctaves  3
		volcanoActivity 0.283
		volcanoFlows    0.238
		volcanoRadius   0.131
		volcanoTemp     255
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      2.12435969
		SemiMajorAxisKm 141195.107
		Eccentricity    0.00311663645
		Inclination     1.0611094
		AscendingNode   69.2067923
		ArgOfPericenter -49.3465651
		MeanAnomaly     120.895166
	}
}

Moon	"6.3"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.00261410396
	Radius          1232.21094
	InertiaMoment   0.399181515
	Obliquity       -0.185917859
	EqAscendNode    -39.6137935
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.854 0.790 0.721)

	Surface
	{
		Preset         "aquaria_airless_triton.cfg"
		SurfStyle       0.457
		Randomize      (-0.129, -0.666, 0.361)
		colorDistMagn   0.0641
		colorDistFreq   128
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.124
		snowLevel       2
		tropicLatitude  0.816
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.347
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        1.69
		venusFreq       0.866
		venusMagn       0
		mareFreq        0.388
		mareDensity     0.157
		terraceProb     0.214
		erosion         0
		montesMagn      0.0719
		montesFreq      61.4
		montesSpiky     0.985
		montesFraction  0.64
		dunesMagn       0.049
		dunesFreq       12.1
		dunesFraction   0.0559
		hillsMagn       0.131
		hillsFreq       30.1
		hillsFraction   0.382
		hills2Fraction  0.256
		riversMagn      0
		riversFreq      3.64
		riversSin       6.81
		riftsMagn       0
		riftsFreq       2.01
		riftsSin        6.41
		canyonsMagn     0.669
		canyonsFreq     0.491
		canyonsFraction 0
		cracksMagn      0.0618
		cracksFreq      0.378
		cracksOctaves   0
		craterMagn      0.545
		craterFreq      4.38
		craterDensity   0.882
		craterOctaves   19
		craterRayedFactor 0.152
		volcanoMagn     0.181
		volcanoFreq     0.679
		volcanoDensity  0.357
		volcanoOctaves  3
		volcanoActivity 0.89
		volcanoFlows    0.393
		volcanoRadius   0.172
		volcanoTemp     190
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      3.45292647
		SemiMajorAxisKm 195209.86
		Eccentricity    0.00360341784
		Inclination     -0.185917859
		AscendingNode   -39.6137935
		ArgOfPericenter 106.435608
		MeanAnomaly     -104.581823
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.52449746e-07
	Radius          78.0262222
	InertiaMoment   0.398656726
	RotationPeriod  269.647448
	Obliquity       151.676895
	EqAscendNode    103.299548

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.575 0.570 0.563)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0257
		Randomize      (0.142, -0.836, 0.694)
		colorDistMagn   0.605
		colorDistFreq   3.53
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.8
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.244
		heightTempGrad  0.625
		beachWidth      0.00126
		tropicWidth     0.07
		mainFreq        0.657
		venusFreq       0.598
		venusMagn       0.489
		mareDensity     0
		terraceProb     0.343
		erosion         0
		montesMagn      0.508
		montesFreq      2.42
		montesSpiky     0.904
		montesFraction  0.911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6
		hillsFraction   0.508
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.19
		craterDensity   0.842
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452
		volcanoTemp     370
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

	NoAtmosphere    true

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
		PeriodDays      33.70593
		SemiMajorAxisKm 891528.748
		Eccentricity    0.447079158
		Inclination     151.676895
		AscendingNode   103.299548
		ArgOfPericenter 127.79938
		MeanAnomaly     124.548855
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.93919288e-07
	Radius          72.569252
	InertiaMoment   0.398580253
	Obliquity       -10.3787461
	EqAscendNode    15.5316146
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.751 0.749 0.749)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.595
		Randomize      (0.412, 0.994, -0.973)
		colorDistMagn   0.619
		colorDistFreq   0.996
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.903
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.142
		heightTempGrad  0.625
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        0.486
		venusFreq       0.614
		venusMagn       0.46
		mareDensity     0
		terraceProb     0.873
		erosion         0
		montesMagn      0.679
		montesFreq      3.18
		montesSpiky     0.828
		montesFraction  0.329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2
		hillsFraction   0.629
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.262
		craterFreq      0.248
		craterDensity   0.94
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     263
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

	NoAtmosphere    true

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
		PeriodDays      35.856321
		SemiMajorAxisKm 929055.477
		Eccentricity    0.197219005
		Inclination     -10.3787461
		AscendingNode   15.5316146
		ArgOfPericenter -98.2896776
		MeanAnomaly     165.79162
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.98939346e-07
	Radius          97.9558258
	InertiaMoment   0.398501664
	RotationPeriod  612.611582
	Obliquity       -35.8923441
	EqAscendNode    75.4557069

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.535 0.530 0.528)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.164
		Randomize      (0.683, 0.824, -0.640)
		colorDistMagn   0.633
		colorDistFreq   5.25
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.937
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44
		heightTempGrad  0.625
		beachWidth      0.00165
		tropicWidth     0.07
		mainFreq        0.278
		venusFreq       0.631
		venusMagn       0.371
		mareDensity     0
		terraceProb     0.222
		erosion         0
		montesMagn      0.48
		montesFreq      2.49
		montesSpiky     0.979
		montesFraction  0.43
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8
		hillsFraction   0.738
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.308
		craterDensity   0.742
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556
		volcanoTemp     297
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

	NoAtmosphere    true

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
		PeriodDays      38.2882227
		SemiMajorAxisKm 970602.267
		Eccentricity    0.159236235
		Inclination     -35.8923441
		AscendingNode   75.4557069
		ArgOfPericenter 84.0909971
		MeanAnomaly     115.453261
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.00065245e-06
	Radius          94.3663788
	InertiaMoment   0.398420662
	RotationPeriod  512.820178
	Obliquity       152.634903
	EqAscendNode    -84.6873556

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.715 0.712 0.710)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.733
		Randomize      (0.953, 0.654, -0.307)
		colorDistMagn   0.646
		colorDistFreq   0.489
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.877
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.337
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.555
		venusFreq       0.654
		venusMagn       0.866
		mareDensity     0
		terraceProb     0.355
		erosion         0
		montesMagn      0.604
		montesFreq      3.22
		montesSpiky     0.945
		montesFraction  0.507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.8
		hillsFraction   0.478
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.197
		craterFreq      0.368
		craterDensity   0.883
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     260
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

	NoAtmosphere    true

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
		PeriodDays      42.7350148
		SemiMajorAxisKm 1044368.43
		Eccentricity    0.310068024
		Inclination     152.634903
		AscendingNode   -84.6873556
		ArgOfPericenter -95.5690117
		MeanAnomaly     -15.670525
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.45274851e-06
	Radius          124.889999
	InertiaMoment   0.398337007
	Obliquity       220.209629
	EqAscendNode    -60.6186365
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.499 0.494 0.488)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.302
		Randomize      (-0.777, 0.484, 0.026)
		colorDistMagn   0.66
		colorDistFreq   8.03
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.713
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.235
		heightTempGrad  0.625
		beachWidth      0.00055
		tropicWidth     0.07
		mainFreq        0.39
		venusFreq       0.705
		venusMagn       0.834
		mareDensity     0
		terraceProb     0.109
		erosion         0
		montesMagn      0.449
		montesFreq      2.56
		montesSpiky     0.902
		montesFraction  0.578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.7
		hillsFraction   0.613
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.532
		craterDensity   0.988
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509
		volcanoTemp     154
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

	NoAtmosphere    true

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
		PeriodDays      45.4205896
		SemiMajorAxisKm 1087676.35
		Eccentricity    0.201841135
		Inclination     220.209629
		AscendingNode   -60.6186365
		ArgOfPericenter -11.6196894
		MeanAnomaly     9.00834977
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.14482702e-06
	Radius          114.134415
	InertiaMoment   0.398250312
	Obliquity       189.183144
	EqAscendNode    -25.8672744
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.679 0.675 0.671)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.871
		Randomize      (-0.506, 0.314, 0.359)
		colorDistMagn   0.674
		colorDistFreq   10.8
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.724
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.133
		heightTempGrad  0.625
		beachWidth      0.000598
		tropicWidth     0.07
		mainFreq        0.631
		venusFreq       0.538
		venusMagn       0.814
		mareDensity     0
		terraceProb     0.231
		erosion         0
		montesMagn      0.564
		montesFreq      3.27
		montesSpiky     0.822
		montesFraction  0.653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.1
		hillsFraction   0.718
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.325
		craterDensity   0.82
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57
		volcanoTemp     327
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

	NoAtmosphere    true

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
		PeriodDays      49.4055494
		SemiMajorAxisKm 1150398.56
		Eccentricity    0.00236875215
		Inclination     189.183144
		AscendingNode   -25.8672744
		ArgOfPericenter -23.7569376
		MeanAnomaly     80.1198728
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.23172367e-06
	Radius          162.821503
	InertiaMoment   0.398160219
	Obliquity       144.926393
	EqAscendNode    9.82863843
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.462 0.458 0.450)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.44
		Randomize      (-0.236, 0.144, 0.692)
		colorDistMagn   0.687
		colorDistFreq   12.8
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.431
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        0.466
		venusFreq       0.563
		venusMagn       0.799
		mareDensity     0
		terraceProb     0.367
		erosion         0
		montesMagn      0.414
		montesFreq      2.61
		montesSpiky     0.978
		montesFraction  0.747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61
		hillsFraction   0.434
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.956
		craterDensity   0.923
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469
		volcanoTemp     290
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

	NoAtmosphere    true

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
		PeriodDays      55.658654
		SemiMajorAxisKm 1245526.56
		Eccentricity    0.342776205
		Inclination     144.926393
		AscendingNode   9.82863843
		ArgOfPericenter 35.7288897
		MeanAnomaly     -100.625493
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.99235102e-06
	Radius          153.363098
	InertiaMoment   0.398066223
	RotationPeriod  808.082898
	RotationEpoch   0
	Obliquity       176.749648
	EqAscendNode    57.9696974

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.639 0.636 0.635)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.00921
		Randomize      (0.035, -0.026, -0.975)
		colorDistMagn   0.701
		colorDistFreq   18.3
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.832
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.328
		heightTempGrad  0.625
		beachWidth      0.00129
		tropicWidth     0.07
		mainFreq        0.741
		venusFreq       0.581
		venusMagn       0.786
		mareDensity     0
		terraceProb     0.119
		erosion         0
		montesMagn      0.532
		montesFreq      3.31
		montesSpiky     0.943
		montesFraction  0.0587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.1
		hillsFraction   0.596
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.682
		craterDensity   1.08
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515
		volcanoTemp     254
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

	NoAtmosphere    true

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
		PeriodDays      59.4082809
		SemiMajorAxisKm 1300855.98
		Eccentricity    0.151943113
		Inclination     179.572637
		AscendingNode   57.9414892
		ArgOfPericenter -171.662736
		MeanAnomaly     62.2658256
	}
}

Comet	"C54"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.21914048e-16
	Radius          0.0842945576
	InertiaMoment   0.399470001
	Oblateness      0.00699995086
	RotationPeriod  29.7466793
	RotationEpoch   0
	Obliquity       327.78833
	EqAscendNode    161.776245

	AbsMagn         10.5
	SlopeParam      3.17
	AlbedoBond      0.0447
	AlbedoGeom      0.0537
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.491 0.487 0.482)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.449
		Randomize      (0.821, 0.623, -0.864)
		colorDistMagn   0.43
		colorDistFreq   5.34e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.776
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.306
		heightTempGrad  0.625
		beachWidth      0.00129
		tropicWidth     0.07
		mainFreq        0.401
		venusFreq       0.534
		venusMagn       0.845
		mareDensity     0
		terraceProb     0.126
		erosion         0
		montesMagn      0.373
		montesFreq      2.73
		montesSpiky     0.996
		montesFraction  0.525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54e-05
		hillsFraction   0.517
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.19
		craterDensity   0.837
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     197
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.119
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00516
		DustBright  0.00755
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          7.07224141
		SemiMajorAxis   2.41355666
		Eccentricity    0.842318753
		Inclination     140.588102
		AscendingNode   -104.354431
		ArgOfPericenter -115.044054
		MeanAnomaly     100.368122
	}
}

Planet	"7"
{
	ParentBody     "Konta Clara"
	Class          "Aquaria"
	Mass            0.0186837725
	Radius          2199.97998
	InertiaMoment   0.365751743
	Oblateness      0.00289113563
	RotationPeriod  40.7011132
	RotationEpoch   0
	Obliquity       42.7556494
	EqAscendNode    40.6044814

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.859 0.803 0.680)

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
		SurfStyle       0.644
		Randomize      (0.345, -0.858, 0.736)
		colorDistMagn   0.0554
		colorDistFreq   283
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.19
		snowLevel       2
		tropicLatitude  0.669
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.242
		heightTempGrad  0.625
		beachWidth      0.000591
		tropicWidth     0.07
		mainFreq        2.06
		venusFreq       0.803
		venusMagn       0
		mareFreq        1.53
		mareDensity     0.154
		terraceProb     0.286
		erosion         0
		montesMagn      0.111
		montesFreq      113
		montesSpiky     0.894
		montesFraction  0.444
		dunesMagn       0.0571
		dunesFreq       19.7
		dunesFraction   0.142
		hillsMagn       0.145
		hillsFreq       63.4
		hillsFraction   0.314
		hills2Fraction  0.276
		riversMagn      0
		riversFreq      3.03
		riversSin       6.42
		riftsMagn       0
		riftsFreq       2.25
		riftsSin        5.63
		canyonsMagn     0.499
		canyonsFreq     0.572
		canyonsFraction 0
		cracksMagn      0.0517
		cracksFreq      0.806
		cracksOctaves   1
		craterMagn      0.657
		craterFreq      6.41
		craterDensity   0.975
		craterOctaves   20
		craterRayedFactor 0.201
		volcanoMagn     0.34
		volcanoFreq     0.727
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.265
		volcanoRadius   0.278
		volcanoTemp     360
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		Period          7.88612027
		SemiMajorAxis   2.59534483
		Eccentricity    0.0288211503
		Inclination     0.748382409
		AscendingNode   37.3973155
		ArgOfPericenter 352.026345
		MeanAnomaly     344.99004
	}
}

DwarfMoon	"7.1"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            2.87300873e-06
	Radius          120.582832
	InertiaMoment   0.397502959
	Oblateness      0.011459914
	Obliquity       0.880762096
	EqAscendNode    -75.1241606
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.653 0.649 0.644)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.765
		Randomize      (-0.055, 0.567, 0.270)
		colorDistMagn   0.399
		colorDistFreq   4.12
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.672
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.385
		heightTempGrad  0.625
		beachWidth      0.000891
		tropicWidth     0.07
		mainFreq        0.417
		venusFreq       0.636
		venusMagn       0.476
		mareDensity     0
		terraceProb     0.173
		erosion         0
		montesMagn      0.591
		montesFreq      3.27
		montesSpiky     0.942
		montesFraction  0.399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.7
		hillsFraction   0.834
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.479
		craterDensity   1.04
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488
		volcanoTemp     124
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

	NoAtmosphere    true

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
		PeriodDays      0.935379805
		SemiMajorAxisKm 10721.3338
		Eccentricity    0.00132341224
		Inclination     0.880762096
		AscendingNode   -75.1241606
		ArgOfPericenter 56.6476233
		MeanAnomaly     41.5603801
	}
}

DwarfMoon	"7.2"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            7.28084751e-06
	Radius          174.468994
	InertiaMoment   0.397613287
	Oblateness      0.00343216839
	Obliquity       0.628140068
	EqAscendNode    -137.828526
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.432 0.430 0.428)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.334
		Randomize      (0.215, 0.397, 0.603)
		colorDistMagn   0.415
		colorDistFreq   18
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.663
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.282
		heightTempGrad  0.625
		beachWidth      0.000639
		tropicWidth     0.07
		mainFreq        0.662
		venusFreq       0.661
		venusMagn       0.434
		mareDensity     0
		terraceProb     0.295
		erosion         0
		montesMagn      0.44
		montesFreq      2.61
		montesSpiky     0.899
		montesFraction  0.482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       98.5
		hillsFraction   0.558
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      1.3
		craterDensity   0.852
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535
		volcanoTemp     297
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

	NoAtmosphere    true

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
		PeriodDays      1.86900679
		SemiMajorAxisKm 17009.762
		Eccentricity    0.00566692546
		Inclination     0.628140068
		AscendingNode   -137.828526
		ArgOfPericenter -24.2454816
		MeanAnomaly     57.2737873
	}
}

Moon	"7.3"
{
	ParentBody     "7"
	Class          "Aquaria"
	Mass            1.91960899e-05
	Radius          293.659363
	InertiaMoment   0.398564547
	Oblateness      0.00156096159
	Obliquity       -0.0958356131
	EqAscendNode    153.745153
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.671 0.635 0.551)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.903
		Randomize      (0.485, 0.227, 0.936)
		colorDistMagn   0.0565
		colorDistFreq   29.6
		detailScale     1.02e+03
		drivenDarkening 0
		seaLevel        0.317
		snowLevel       2
		tropicLatitude  0.67
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18
		heightTempGrad  0.625
		beachWidth      0.000987
		tropicWidth     0.07
		mainFreq        1.77
		venusFreq       0.272
		venusMagn       0
		mareFreq        0
		mareDensity     0.167
		terraceProb     0.479
		erosion         0
		montesMagn      0.061
		montesFreq      9.98
		montesSpiky     0.971
		montesFraction  0.831
		dunesMagn       0.0418
		dunesFreq       3.88
		dunesFraction   0.118
		hillsMagn       0.126
		hillsFreq       7.84
		hillsFraction   0.903
		hills2Fraction  0.177
		riversMagn      0
		riversFreq      3.4
		riversSin       6
		riftsMagn       0
		riftsFreq       2.97
		riftsSin        8.79
		canyonsMagn     0.305
		canyonsFreq     0.0838
		canyonsFraction 0
		cracksMagn      0.0619
		cracksFreq      0.127
		cracksOctaves   0
		craterMagn      0.885
		craterFreq      0.626
		craterDensity   0.913
		craterOctaves   16
		craterRayedFactor 0.133
		volcanoMagn     0.168
		volcanoFreq     0.752
		volcanoDensity  0.192
		volcanoOctaves  3
		volcanoActivity 0.0353
		volcanoFlows    0.123
		volcanoRadius   0.144
		volcanoTemp     297
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.7
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      3.73376193
		SemiMajorAxisKm 26986.5678
		Eccentricity    0.0135876154
		Inclination     -0.0958356131
		AscendingNode   153.745153
		ArgOfPericenter 74.9101666
		MeanAnomaly     -104.409468
	}
}

Comet	"C51"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.57127687e-11
	Radius          2.75670743
	InertiaMoment   0.395727307
	Oblateness      0.00419047661
	RotationPeriod  42.7527723
	RotationEpoch   0
	Obliquity       311.172394
	EqAscendNode    227.719376

	AbsMagn         15.2
	SlopeParam      3.18
	AlbedoBond      0.0307
	AlbedoGeom      0.0368
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.646 0.643 0.639)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.633
		Randomize      (0.729, 0.802, 0.207)
		colorDistMagn   0.999
		colorDistFreq   0.00431
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.383
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.346
		heightTempGrad  0.625
		beachWidth      0.000563
		tropicWidth     0.07
		mainFreq        0.465
		venusFreq       0.572
		venusMagn       0.723
		mareDensity     0
		terraceProb     0.349
		erosion         0
		montesMagn      0.384
		montesFreq      2.42
		montesSpiky     0.834
		montesFraction  0.538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0158
		hillsFraction   0.572
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.256
		craterFreq      0.191
		craterDensity   0.718
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472
		volcanoTemp     336
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.15
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0556
		GasToDust   0.25
		Particles   2102
		GasBright   0.0154
		DustBright  0.0188
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          8.03288853
		SemiMajorAxis   2.62744685
		Eccentricity    0.938306727
		Inclination     70.1875737
		AscendingNode   56.0714619
		ArgOfPericenter -84.8264442
		MeanAnomaly     -52.0339825
	}
}

Comet	"C52"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.47868921e-13
	Radius          0.850874901
	InertiaMoment   0.397863626
	RotationPeriod  140.650246
	RotationEpoch   0
	Obliquity       316.711029
	EqAscendNode    85.738327

	AbsMagn         4.97
	SlopeParam      4.61
	AlbedoBond      0.0446
	AlbedoGeom      0.0535
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.595 0.589 0.586)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.238
		Randomize      (0.760, 0.742, 0.517)
		colorDistMagn   0.185
		colorDistFreq   0.000311
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.897
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.199
		heightTempGrad  0.625
		beachWidth      0.00131
		tropicWidth     0.07
		mainFreq        0.762
		venusFreq       0.562
		venusMagn       0.749
		mareDensity     0
		terraceProb     0.419
		erosion         0
		montesMagn      0.573
		montesFreq      2.54
		montesSpiky     0.964
		montesFraction  0.337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00152
		hillsFraction   0.556
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.251
		craterFreq      0.225
		craterDensity   0.971
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526
		volcanoTemp     150
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.06
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0372
		GasToDust   0.25
		Particles   1732
		GasBright   0.0176
		DustBright  0.0228
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          10.6910188
		SemiMajorAxis   3.17906087
		Eccentricity    0.935204608
		Inclination     -99.7370645
		AscendingNode   -32.3851182
		ArgOfPericenter -73.908276
		MeanAnomaly     -8.16948596
	}
}

Comet	"C44"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.41481704e-12
	Radius          1.20338619
	InertiaMoment   0.39776206
	Oblateness      0.0447020121
	RotationPeriod  12.366394
	RotationEpoch   0
	Obliquity       272.401794
	EqAscendNode    141.58667

	AbsMagn         4.4
	SlopeParam      6.65
	AlbedoBond      0.0442
	AlbedoGeom      0.053
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.612 0.606 0.601)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.393
		Randomize      (0.513, -0.782, 0.042)
		colorDistMagn   0.322
		colorDistFreq   0.000513
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.971
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.173
		heightTempGrad  0.625
		beachWidth      0.00136
		tropicWidth     0.07
		mainFreq        0.312
		venusFreq       0.633
		venusMagn       0.575
		mareDensity     0
		terraceProb     0.382
		erosion         0
		montesMagn      0.499
		montesFreq      3.31
		montesSpiky     0.966
		montesFraction  0.767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00262
		hillsFraction   0.673
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.261
		craterDensity   0.985
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488
		volcanoTemp     311
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.59
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0429
		GasToDust   0.25
		Particles   1845
		GasBright   0.00168
		DustBright  0.0292
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          11.0522682
		SemiMajorAxis   3.25027712
		Eccentricity    0.921707722
		Inclination     122.350011
		AscendingNode   -143.184504
		ArgOfPericenter -61.2361715
		MeanAnomaly     -93.3642254
	}
}

Comet	"C29"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.45916101e-13
	Radius          0.804720879
	InertiaMoment   0.398559481
	Oblateness      0.00108735333
	RotationPeriod  83.962429
	RotationEpoch   0
	Obliquity       189.32196
	EqAscendNode    111.302299

	AbsMagn         6.53
	SlopeParam      6.8
	AlbedoBond      0.0288
	AlbedoGeom      0.0345
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.590 0.585 0.582)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.309
		Randomize      (0.052, 0.110, -0.599)
		colorDistMagn   0.629
		colorDistFreq   0.000445
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.751
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.374
		heightTempGrad  0.625
		beachWidth      0.000705
		tropicWidth     0.07
		mainFreq        0.646
		venusFreq       0.63
		venusMagn       0.488
		mareDensity     0
		terraceProb     0.382
		erosion         0
		montesMagn      0.525
		montesFreq      3.6
		montesSpiky     0.914
		montesFraction  0.15
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00176
		hillsFraction   0.56
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.263
		craterDensity   0.934
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465
		volcanoTemp     238
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.09
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0358
		GasToDust   0.25
		Particles   1702
		GasBright   0.005
		DustBright  0.013
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          13.2924376
		SemiMajorAxis   3.67583381
		Eccentricity    0.959017212
		Inclination     54.705813
		AscendingNode   158.30005
		ArgOfPericenter 36.5070766
		MeanAnomaly     106.650627
	}
}

Planet	"8"
{
	ParentBody     "Konta Clara"
	Class          "Aquaria"
	Mass            0.676630139
	Radius          6725.95313
	InertiaMoment   0.328166276
	Oblateness      0.00857638102
	RotationPeriod  19.5862715
	RotationEpoch   0
	Obliquity       16.8499698
	EqAscendNode    30.5808843

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.746 0.725 0.681)

	Surface
	{
		Preset         "aquaria_arid_titan.cfg"
		SurfStyle       0.546
		Randomize      (0.001, -0.209, -0.375)
		colorDistMagn   0.0714
		colorDistFreq   829
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.112
		snowLevel       2
		tropicLatitude  0.264
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.486
		heightTempGrad  0.625
		beachWidth      0.000592
		tropicWidth     0.07
		mainFreq        1.92
		venusFreq       1.2
		venusMagn       0
		mareFreq        1.42
		mareDensity     0.07
		terraceProb     0.43
		erosion         0
		montesMagn      0.257
		montesFreq      250
		montesSpiky     0.849
		montesFraction  0.202
		dunesMagn       0.0416
		dunesFreq       80
		dunesFraction   0.116
		hillsMagn       0.148
		hillsFreq       193
		hillsFraction   0.575
		hills2Fraction  0.0418
		riversMagn      0
		riversFreq      2.96
		riversSin       5.65
		riftsMagn       0
		riftsFreq       2.95
		riftsSin        5.78
		canyonsMagn     0.375
		canyonsFreq     2.82
		canyonsFraction 0
		cracksMagn      0.0261
		cracksFreq      3.88
		cracksOctaves   3
		craterMagn      0.586
		craterFreq      22.2
		craterDensity   0.775
		craterOctaves   21
		craterRayedFactor 0.0679
		volcanoMagn     0.588
		volcanoFreq     0.431
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.29
		volcanoRadius   0.406
		volcanoTemp     336
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          47.9106445
		Density         0.000179734532
		Pressure        2.4241439e-05
		Greenhouse      0.0385251828
		Bright          1.89
		Opacity         0
		SkyLight        0.631
		Hue             -0.0134
		Saturation      0.598

		Composition
		{
			N2        	74.6
			Ne        	18.2
			CH4       	3.13
			He        	2.06
			CO        	1.99
			Ar        	0.0452
			O2        	0.0182
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         27.5
		NorthLat       53.5
		NorthLon       -70.3
		NorthRadius    2.01e+03
		NorthWidth     652
		NorthRings     5
		NorthBright    0.336
		NorthFlashFreq 64.8
		NorthMoveSpeed 1.09
		NorthParticles 50000
		SouthLat       -34.6
		SouthLon       136
		SouthRadius    1.98e+03
		SouthWidth     652
		SouthRings     4
		SouthBright    0.336
		SouthFlashFreq 78.3
		SouthMoveSpeed 1.82
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          13.7036416
		SemiMajorAxis   3.75126569
		Eccentricity    0.0146930577
		Inclination     1.52012865
		AscendingNode   28.9045286
		ArgOfPericenter 179.673387
		MeanAnomaly     351.407119
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            4.01336315e-08
	Radius          33.5514183
	InertiaMoment   0.396986336
	Oblateness      0.230803505
	Obliquity       0.00677077787
	EqAscendNode    -0.561818685
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.731 0.611 0.514)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.658
		Randomize      (0.395, 0.819, 0.182)
		colorDistMagn   0.982
		colorDistFreq   0.483
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.265
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.237
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.605
		venusFreq       0.59
		venusMagn       0.546
		mareDensity     0
		terraceProb     0.112
		erosion         0
		montesMagn      0.627
		montesFreq      3.27
		montesSpiky     0.803
		montesFraction  0.67
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.89
		hillsFraction   0.51
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.245
		craterDensity   0.936
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563
		volcanoTemp     201
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

	NoAtmosphere    true

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
		PeriodDays      0.258576563
		SemiMajorAxisKm 15051.8407
		Eccentricity    7.03739161e-05
		Inclination     0.00677077787
		AscendingNode   -0.561818685
		ArgOfPericenter -39.243902
		MeanAnomaly     -156.262816
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.44968657e-08
	Radius          41.940239
	InertiaMoment   0.396783888
	Oblateness      0.192035228
	Obliquity       -0.0112272896
	EqAscendNode    27.9201806
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.453 0.406 0.355)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.227
		Randomize      (0.666, 0.649, 0.515)
		colorDistMagn   0.998
		colorDistFreq   1.25
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.264
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.134
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        0.443
		venusFreq       0.606
		venusMagn       0.535
		mareDensity     0
		terraceProb     0.234
		erosion         0
		montesMagn      0.462
		montesFreq      2.62
		montesSpiky     0.974
		montesFraction  0.772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.09
		hillsFraction   0.629
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.215
		craterFreq      0.203
		craterDensity   0.726
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465
		volcanoTemp     374
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

	NoAtmosphere    true

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
		PeriodDays      0.339862764
		SemiMajorAxisKm 18060.6163
		Eccentricity    9.27326601e-05
		Inclination     -0.0112272896
		AscendingNode   27.9201806
		ArgOfPericenter -152.109719
		MeanAnomaly     83.5452053
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            7.41150501e-08
	Radius          46.4578133
	InertiaMoment   0.396541804
	Oblateness      0.128898308
	Obliquity       -0.0141144629
	EqAscendNode    108.657037
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.650 0.598 0.520)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.796
		Randomize      (0.936, 0.479, 0.848)
		colorDistMagn   0.0302
		colorDistFreq   0.844
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.264
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.432
		heightTempGrad  0.625
		beachWidth      0.00068
		tropicWidth     0.07
		mainFreq        0.697
		venusFreq       0.622
		venusMagn       0.523
		mareDensity     0
		terraceProb     0.371
		erosion         0
		montesMagn      0.579
		montesFreq      3.32
		montesSpiky     0.939
		montesFraction  0.19
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47
		hillsFraction   0.739
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.261
		craterDensity   0.879
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512
		volcanoTemp     268
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

	NoAtmosphere    true

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
		PeriodDays      0.414522074
		SemiMajorAxisKm 20617.1494
		Eccentricity    5.21609078e-05
		Inclination     -0.0141144629
		AscendingNode   108.657037
		ArgOfPericenter 9.57040055
		MeanAnomaly     -121.276373
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.01042858e-07
	Radius          41.7740784
	InertiaMoment   0.3962349
	Oblateness      0.0473909006
	Obliquity       0.0113530274
	EqAscendNode    61.3070237
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.811 0.745 0.722)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.365
		Randomize      (-0.794, 0.309, -0.819)
		colorDistMagn   0.062
		colorDistFreq   1.17
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.264
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33
		heightTempGrad  0.625
		beachWidth      0.000428
		tropicWidth     0.07
		mainFreq        0.513
		venusFreq       0.641
		venusMagn       0.508
		mareDensity     0
		terraceProb     0.122
		erosion         0
		montesMagn      0.43
		montesFreq      2.67
		montesSpiky     0.895
		montesFraction  0.364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.94
		hillsFraction   0.48
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.216
		craterDensity   0.983
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58
		volcanoTemp     301
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

	NoAtmosphere    true

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
		PeriodDays      0.498937865
		SemiMajorAxisKm 23328.9129
		Eccentricity    9.97741537e-05
		Inclination     0.0113530274
		AscendingNode   61.3070237
		ArgOfPericenter -155.820968
		MeanAnomaly     118.63716
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.0066856849
	Radius          1656.60486
	InertiaMoment   0.385299504
	Oblateness      0.0047094943
	Obliquity       0.742840182
	EqAscendNode    -65.4179472
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.677 0.499 0.417)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.934
		Randomize      (-0.523, 0.139, -0.486)
		colorDistMagn   0.043
		colorDistFreq   182
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.114
		snowLevel       2
		tropicLatitude  0.27
		icecapLatitude  0.797
		icecapHeight    0.135
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.227
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        1.59
		venusFreq       1.51
		venusMagn       0
		mareFreq        0.851
		mareDensity     0.17
		terraceProb     0.243
		erosion         0
		montesMagn      0.0685
		montesFreq      55.1
		montesSpiky     0.984
		montesFraction  0.000382
		dunesMagn       0.038
		dunesFreq       17.3
		dunesFraction   0.791
		hillsMagn       0.102
		hillsFreq       51.7
		hillsFraction   0.213
		hills2Fraction  0.0471
		riversMagn      0
		riversFreq      2.94
		riversSin       7.06
		riftsMagn       0
		riftsFreq       2.91
		riftsSin        6.03
		canyonsMagn     0.413
		canyonsFreq     0.534
		canyonsFraction 0
		cracksMagn      0.0581
		cracksFreq      0.917
		cracksOctaves   0
		craterMagn      0.591
		craterFreq      4.51
		craterDensity   0.903
		craterOctaves   19
		craterRayedFactor 0.157
		volcanoMagn     0.19
		volcanoFreq     0.824
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.23
		volcanoFlows    0.225
		volcanoRadius   0.199
		volcanoTemp     305
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      1.50541323
		SemiMajorAxisKm 48871.691
		Eccentricity    0.000314913733
		Inclination     0.742840182
		AscendingNode   -65.4179472
		ArgOfPericenter 85.6029947
		MeanAnomaly     -163.502861
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.89928528e-07
	Radius          53.1583176
	InertiaMoment   0.39495787
	Obliquity       0.466331179
	EqAscendNode    -66.5851771
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.799 0.718 0.658)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.503
		Randomize      (-0.253, -0.030, -0.153)
		colorDistMagn   0.119
		colorDistFreq   1.8
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.268
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.125
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        0.583
		venusFreq       0.514
		venusMagn       0.459
		mareDensity     0
		terraceProb     0.383
		erosion         0
		montesMagn      0.387
		montesFreq      2.72
		montesSpiky     0.973
		montesFraction  0.529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.22
		hillsFraction   0.719
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.229
		craterDensity   0.918
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518
		volcanoTemp     158
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

	NoAtmosphere    true

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
		PeriodDays      4.48122761
		SemiMajorAxisKm 100800.235
		Eccentricity    0.0196530866
		Inclination     0.466331179
		AscendingNode   -66.5851771
		ArgOfPericenter 89.4400292
		MeanAnomaly     -126.973302
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.0113174366
	Radius          1954.67505
	InertiaMoment   0.376270771
	Obliquity       -1.47536023
	EqAscendNode    -70.4148504
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.701 0.511 0.318)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.0723
		Randomize      (0.018, -0.200, 0.180)
		colorDistMagn   0.0449
		colorDistFreq   209
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.0366
		snowLevel       2
		tropicLatitude  0.257
		icecapLatitude  0.888
		icecapHeight    0.0182
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.423
		heightTempGrad  0.625
		beachWidth      0.00117
		tropicWidth     0.07
		mainFreq        1.7
		venusFreq       0.636
		venusMagn       0
		mareFreq        1.04
		mareDensity     0.172
		terraceProb     0.131
		erosion         0
		montesMagn      0.109
		montesFreq      94.5
		montesSpiky     0.928
		montesFraction  0.00744
		dunesMagn       0.0253
		dunesFreq       23.8
		dunesFraction   0.254
		hillsMagn       0.11
		hillsFreq       44.8
		hillsFraction   0.283
		hills2Fraction  0.164
		riversMagn      0
		riversFreq      2.37
		riversSin       7.91
		riftsMagn       0
		riftsFreq       3.16
		riftsSin        6.8
		canyonsMagn     0.594
		canyonsFreq     0.945
		canyonsFraction 0
		cracksMagn      0.0445
		cracksFreq      1.08
		cracksOctaves   1
		craterMagn      0.642
		craterFreq      5.99
		craterDensity   0.846
		craterOctaves   19
		craterRayedFactor 0.211
		volcanoMagn     0.365
		volcanoFreq     0.722
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.213
		volcanoRadius   0.251
		volcanoTemp     384
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      7.64888612
		SemiMajorAxisKm 144765.019
		Eccentricity    0.0222832214
		Inclination     -1.47536023
		AscendingNode   -70.4148504
		ArgOfPericenter -3.03882865
		MeanAnomaly     166.099441
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.0116982721
	Radius          2037.85449
	InertiaMoment   0.373412907
	Obliquity       1.40847852
	EqAscendNode    -123.158321
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.735 0.699 0.647)

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
		SurfStyle       0.641
		Randomize      (0.288, -0.370, 0.513)
		colorDistMagn   0.0458
		colorDistFreq   262
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.302
		snowLevel       2
		tropicLatitude  0.252
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.321
		heightTempGrad  0.625
		beachWidth      0.000619
		tropicWidth     0.07
		mainFreq        1.98
		venusFreq       0.79
		venusMagn       0
		mareFreq        0.802
		mareDensity     0.137
		terraceProb     0.251
		erosion         0
		montesMagn      0.126
		montesFreq      84.3
		montesSpiky     0.889
		montesFraction  0.511
		dunesMagn       0.0368
		dunesFreq       18.4
		dunesFraction   0.985
		hillsMagn       0.134
		hillsFreq       60.5
		hillsFraction   0.818
		hills2Fraction  0.223
		riversMagn      0
		riversFreq      1.78
		riversSin       4.16
		riftsMagn       0
		riftsFreq       3.3
		riftsSin        7.43
		canyonsMagn     0.537
		canyonsFreq     0.672
		canyonsFraction 0
		cracksMagn      0.06
		cracksFreq      0.718
		cracksOctaves   1
		craterMagn      0.601
		craterFreq      5.26
		craterDensity   0.923
		craterOctaves   19
		craterRayedFactor 0.136
		volcanoMagn     0.38
		volcanoFreq     0.852
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.345
		volcanoRadius   0.258
		volcanoTemp     38.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      13.160766
		SemiMajorAxisKm 207905.377
		Eccentricity    0.0136941747
		Inclination     1.40847852
		AscendingNode   -123.158321
		ArgOfPericenter 88.0241236
		MeanAnomaly     -179.756577
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.12112479e-07
	Radius          88.3406067
	InertiaMoment   0.399848491
	Obliquity       -0.306293417
	EqAscendNode    -173.191982
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.476 0.473 0.468)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.21
		Randomize      (0.558, -0.540, 0.846)
		colorDistMagn   0.192
		colorDistFreq   1.89
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.27
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.218
		heightTempGrad  0.625
		beachWidth      0.00157
		tropicWidth     0.07
		mainFreq        0.493
		venusFreq       0.589
		venusMagn       0.833
		mareDensity     0
		terraceProb     0.397
		erosion         0
		montesMagn      0.487
		montesFreq      3.48
		montesSpiky     0.784
		montesFraction  0.785
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.8
		hillsFraction   0.7
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.217
		craterFreq      0.243
		craterDensity   0.961
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525
		volcanoTemp     188
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

	NoAtmosphere    true

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
		PeriodDays      22.8457966
		SemiMajorAxisKm 298584.879
		Eccentricity    0.0341619316
		Inclination     -0.306293417
		AscendingNode   -173.191982
		ArgOfPericenter 133.106263
		MeanAnomaly     -58.645026
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            7.2550597e-07
	Radius          79.6399612
	InertiaMoment   0.399787992
	RotationPeriod  256.000357
	RotationEpoch   0
	Obliquity       159.289524
	EqAscendNode    -16.0646348

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.656 0.652 0.650)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.78
		Randomize      (0.829, -0.710, -0.821)
		colorDistMagn   0.214
		colorDistFreq   3.61
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.127
		icecapLatitude  0.913
		icecapHeight    0.0392
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.116
		heightTempGrad  0.625
		beachWidth      0.000415
		tropicWidth     0.07
		mainFreq        0.293
		venusFreq       0.605
		venusMagn       0.813
		mareDensity     0
		terraceProb     0.14
		erosion         0
		montesMagn      0.618
		montesFreq      2.81
		montesSpiky     0.972
		montesFraction  0.22
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.1
		hillsFraction   0.325
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.257
		craterDensity   0.786
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415
		volcanoTemp     362
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

	NoAtmosphere    true

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
		PeriodDays      252.790039
		SemiMajorAxisKm 1482644.26
		Eccentricity    0.110232047
		Inclination     155.243659
		AscendingNode   -13.7990503
		ArgOfPericenter -145.763187
		MeanAnomaly     -59.2648298
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.04009769e-06
	Radius          111.778313
	InertiaMoment   0.399727315
	RotationPeriod  373.365614
	RotationEpoch   0
	Obliquity       195.135393
	EqAscendNode    136.409704

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.439 0.433 0.429)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.349
		Randomize      (-0.901, -0.880, -0.488)
		colorDistMagn   0.236
		colorDistFreq   1.98
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.195
		icecapLatitude  0.959
		icecapHeight    0.0116
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.414
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        0.562
		venusFreq       0.621
		venusMagn       0.798
		mareDensity     0
		terraceProb     0.26
		erosion         0
		montesMagn      0.458
		montesFreq      3.55
		montesSpiky     0.937
		montesFraction  0.375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.7
		hillsFraction   0.58
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.416
		craterDensity   0.901
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487
		volcanoTemp     325
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

	NoAtmosphere    true

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
		PeriodDays      264.719331
		SemiMajorAxisKm 1528929.61
		Eccentricity    0.042677951
		Inclination     214.635866
		AscendingNode   135.373532
		ArgOfPericenter -64.9159789
		MeanAnomaly     73.2887101
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.51247752e-06
	Radius          105.992538
	InertiaMoment   0.399666369
	RotationPeriod  243.034427
	RotationEpoch   0
	Obliquity       153.082446
	EqAscendNode    67.1358955

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.621 0.615 0.610)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.918
		Randomize      (-0.631, 0.950, -0.155)
		colorDistMagn   0.256
		colorDistFreq   6.03
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.422
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.311
		heightTempGrad  0.625
		beachWidth      0.000511
		tropicWidth     0.07
		mainFreq        0.398
		venusFreq       0.64
		venusMagn       0.786
		mareDensity     0
		terraceProb     0.411
		erosion         0
		montesMagn      0.573
		montesFreq      2.85
		montesSpiky     0.891
		montesFraction  0.462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.8
		hillsFraction   0.683
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.487
		craterDensity   1.02
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533
		volcanoTemp     218
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     173
		OuterRadius     192
		EdgeRadius      192
		MeanRadius      179
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.2
		ChartRadius     192
		RotationPeriod  5.54
		Brightness      1
		FrontBright     2.6
		BackBright      4.12
		Density         0.983
		Opacity         0.983
		SelfShadow      0.983
		PlanetShadow    0.983
		Hapke           1
		SpotBright      2.21
		SpotWidth       0.0371
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.93
		densityScale    1.52
		densityOffset   -0.0176
		densityPower    5.04
		colorContrast   0.0503
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      277.501537
		SemiMajorAxisKm 1577759.29
		Eccentricity    0.0452412135
		Inclination     156.453622
		AscendingNode   67.7766715
		ArgOfPericenter -116.103913
		MeanAnomaly     -30.9661441
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.23740608e-06
	Radius          115.75174
	InertiaMoment   0.399605125
	RotationPeriod  180.755499
	RotationEpoch   0
	Obliquity       239.817621
	EqAscendNode    -6.30488151

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.798 0.797 0.796)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.487
		Randomize      (-0.360, 0.780, 0.178)
		colorDistMagn   0.276
		colorDistFreq   11.8
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.966
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.209
		heightTempGrad  0.625
		beachWidth      0.00146
		tropicWidth     0.07
		mainFreq        0.64
		venusFreq       0.667
		venusMagn       0.775
		mareDensity     0
		terraceProb     0.149
		erosion         0
		montesMagn      0.424
		montesFreq      3.63
		montesSpiky     0.771
		montesFraction  0.536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.3
		hillsFraction   0.845
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.472
		craterDensity   0.843
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434
		volcanoTemp     322
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     156
		OuterRadius     456
		EdgeRadius      183
		MeanRadius      165
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     183
		RotationPeriod  4.07
		Brightness      1
		FrontBright     2.92
		BackBright      4.63
		Density         0.999
		Opacity         0.999
		SelfShadow      0.999
		PlanetShadow    0.999
		Hapke           1
		SpotBright      2.4
		SpotWidth       0.0255
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.05
		densityScale    1.57
		densityOffset   -0.296
		densityPower    4.88
		colorContrast   0.113
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      294.786546
		SemiMajorAxisKm 1642614.87
		Eccentricity    0.0116218177
		Inclination     186.929828
		AscendingNode   -8.97429854
		ArgOfPericenter 66.7297462
		MeanAnomaly     -19.2874593
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            3.37929964e-06
	Radius          165.249786
	InertiaMoment   0.399543524
	RotationPeriod  280.909014
	RotationEpoch   0
	Obliquity       15.172607
	EqAscendNode    121.554441

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.581 0.579 0.575)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0558
		Randomize      (-0.090, 0.610, 0.511)
		colorDistMagn   0.295
		colorDistFreq   13.8
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.255
		icecapLatitude  0.956
		icecapHeight    0.0274
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.107
		heightTempGrad  0.625
		beachWidth      0.00151
		tropicWidth     0.07
		mainFreq        0.473
		venusFreq       0.509
		venusMagn       0.765
		mareDensity     0
		terraceProb     0.269
		erosion         0
		montesMagn      0.54
		montesFreq      2.89
		montesSpiky     0.971
		montesFraction  0.607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.5
		hillsFraction   0.562
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.285
		craterFreq      0.755
		craterDensity   0.941
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493
		volcanoTemp     215
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     251
		OuterRadius     828
		EdgeRadius      300
		MeanRadius      267
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     300
		RotationPeriod  6.87
		Brightness      1
		FrontBright     2.77
		BackBright      4.61
		Density         0.997
		Opacity         0.997
		SelfShadow      0.997
		PlanetShadow    0.997
		Hapke           1
		SpotBright      2.66
		SpotWidth       0.0174
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       715
		densityScale    2.47
		densityOffset   -1.49
		densityPower    5.01
		colorContrast   0.144
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      319.171915
		SemiMajorAxisKm 1731997.79
		Eccentricity    0.0038116806
		Inclination     25.9414188
		AscendingNode   125.556448
		ArgOfPericenter 86.7291409
		MeanAnomaly     51.1568656
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.2357841e-06
	Radius          156.89946
	InertiaMoment   0.399481446
	RotationPeriod  159.468608
	RotationEpoch   0
	Obliquity       259.903523
	EqAscendNode    -81.3594884

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.761 0.758 0.757)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.625
		Randomize      (0.181, 0.440, 0.844)
		colorDistMagn   0.313
		colorDistFreq   20
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.991
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.405
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        0.757
		venusFreq       0.55
		venusMagn       0.756
		mareDensity     0
		terraceProb     0.427
		erosion         0
		montesMagn      0.378
		montesFreq      3.74
		montesSpiky     0.935
		montesFraction  0.687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       69.7
		hillsFraction   0.667
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.916
		craterDensity   0.745
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541
		volcanoTemp     249
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

	NoAtmosphere    true

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
		PeriodDays      337.530043
		SemiMajorAxisKm 1797792.58
		Eccentricity    0.224491414
		Inclination     214.43825
		AscendingNode   -90.6529846
		ArgOfPericenter -176.615324
		MeanAnomaly     -74.2449057
	}
}

Comet	"C42"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.22086682e-09
	Radius          14.2210712
	InertiaMoment   0.399382681
	Oblateness      0.00169561279
	RotationPeriod  85.3168259
	RotationEpoch   0
	Obliquity       261.324493
	EqAscendNode    65.5487518

	AbsMagn         9.76
	SlopeParam      3.22
	AlbedoBond      0.044
	AlbedoGeom      0.0528
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.715 0.711 0.706)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.182
		Randomize      (0.452, -0.663, -0.577)
		colorDistMagn   0.00415
		colorDistFreq   0.13
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.991
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.467
		heightTempGrad  0.625
		beachWidth      0.000771
		tropicWidth     0.07
		mainFreq        0.652
		venusFreq       0.658
		venusMagn       0.489
		mareDensity     0
		terraceProb     0.268
		erosion         0
		montesMagn      0.41
		montesFreq      3.15
		montesSpiky     0.931
		montesFraction  0.578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.343
		hillsFraction   0.703
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.192
		craterDensity   0.854
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511
		volcanoTemp     264
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.2
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0795
		GasToDust   0.25
		Particles   2586
		GasBright   0.00156
		DustBright  0.0169
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          13.9029686
		SemiMajorAxis   3.78754506
		Eccentricity    0.947831651
		Inclination     31.3397937
		AscendingNode   155.122073
		ArgOfPericenter 53.5669924
		MeanAnomaly     -36.9223542
	}
}

Comet	"C46"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.62570494e-15
	Radius          0.117038786
	InertiaMoment   0.399411917
	Oblateness      0.00448710425
	RotationPeriod  36.0141621
	RotationEpoch   0
	Obliquity       283.479095
	EqAscendNode    217.624588

	AbsMagn         9.99
	SlopeParam      4.64
	AlbedoBond      0.0443
	AlbedoGeom      0.0531
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.509 0.500 0.496)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.605
		Randomize      (0.575, -0.901, 0.661)
		colorDistMagn   0.531
		colorDistFreq   9.24e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.891
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.432
		venusFreq       0.615
		venusMagn       0.622
		mareDensity     0
		terraceProb     0.101
		erosion         0
		montesMagn      0.587
		montesFreq      3.5
		montesSpiky     0.998
		montesFraction  0.379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6e-05
		hillsFraction   0.645
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.222
		craterFreq      0.226
		craterDensity   0.849
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     288
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.171
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00619
		GasToDust   0.25
		Particles   1104
		GasBright   0.00107
		DustBright  0.0421
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          14.1872633
		SemiMajorAxis   3.83900372
		Eccentricity    0.92284492
		Inclination     -35.8704405
		AscendingNode   -80.0505628
		ArgOfPericenter 2.02211411
		MeanAnomaly     -55.5309343
	}
}

Comet	"C78"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.9904685e-17
	Radius          0.0319649726
	InertiaMoment   0.399641812
	Oblateness      0.248999998
	RotationPeriod  4.87758636
	RotationEpoch   0
	Obliquity       100.716057
	EqAscendNode    354.231232

	AbsMagn         12.2
	SlopeParam      3.06
	AlbedoBond      0.0461
	AlbedoGeom      0.0554
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.443 0.437 0.435)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.984
		Randomize      (-0.440, -0.805, 0.560)
		colorDistMagn   0.99
		colorDistFreq   3.31e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.749
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.384
		heightTempGrad  0.625
		beachWidth      0.000838
		tropicWidth     0.07
		mainFreq        0.27
		venusFreq       0.603
		venusMagn       0.75
		mareDensity     0
		terraceProb     0.196
		erosion         0
		montesMagn      0.637
		montesFreq      3.19
		montesSpiky     0.99
		montesFraction  0.407
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.96e-06
		hillsFraction   0.485
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.187
		craterDensity   0.794
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486
		volcanoTemp     341
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0491
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00201
		DustBright  0.0392
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          14.3022315
		SemiMajorAxis   3.8597157
		Eccentricity    0.935624421
		Inclination     131.844452
		AscendingNode   -48.4025885
		ArgOfPericenter 46.3650909
		MeanAnomaly     -142.058686
	}
}

Comet	"C149"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.46516443e-08
	Radius          32.2088089
	InertiaMoment   0.39950794
	Oblateness      0.00220946292
	RotationPeriod  76.4818726
	RotationEpoch   0
	Obliquity       133.960541
	EqAscendNode    353.57724

	AbsMagn         15.1
	SlopeParam      5.85
	AlbedoBond      0.0368
	AlbedoGeom      0.0442
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.791 0.736 0.703)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.982
		Randomize      (-0.256, 0.972, 0.525)
		colorDistMagn   0.868
		colorDistFreq   0.488
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.995
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.366
		heightTempGrad  0.625
		beachWidth      0.00083
		tropicWidth     0.07
		mainFreq        0.617
		venusFreq       0.658
		venusMagn       0.604
		mareDensity     0
		terraceProb     0.375
		erosion         0
		montesMagn      0.569
		montesFreq      3.19
		montesSpiky     0.856
		montesFraction  0.812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.39
		hillsFraction   0.897
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.268
		craterFreq      0.249
		craterDensity   0.72
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     192
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0925
		GasToDust   0.25
		Particles   2847
		GasBright   0.02
		DustBright  0.0205
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          14.5889924
		SemiMajorAxis   3.91113656
		Eccentricity    0.906326834
		Inclination     70.4414937
		AscendingNode   72.3153469
		ArgOfPericenter 107.74661
		MeanAnomaly     50.5277713
	}
}

Comet	"C17"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.19453351e-18
	Radius          0.0167357214
	InertiaMoment   0.398448646
	Oblateness      0.00326865539
	RotationPeriod  46.8897629
	RotationEpoch   0
	Obliquity       122.858109
	EqAscendNode    15.07481

	AbsMagn         5.86
	SlopeParam      6.94
	AlbedoBond      0.0276
	AlbedoGeom      0.0331
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.412 0.410 0.408)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0419
		Randomize      (-0.317, 0.824, -0.311)
		colorDistMagn   0.332
		colorDistFreq   1.65e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.909
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.135
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.485
		venusFreq       0.602
		venusMagn       0.541
		mareDensity     0
		terraceProb     0.152
		erosion         0
		montesMagn      0.547
		montesFreq      2.59
		montesSpiky     0.989
		montesFraction  0.324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.65e-07
		hillsFraction   0.743
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.265
		craterDensity   0.95
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475
		volcanoTemp     96.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0215
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0108
		DustBright  0.0129
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          15.0624425
		SemiMajorAxis   3.99530294
		Eccentricity    0.943416823
		Inclination     107.194172
		AscendingNode   -56.3252388
		ArgOfPericenter 116.849736
		MeanAnomaly     31.9602263
	}
}

Comet	"C76"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.66998336e-14
	Radius          0.345721334
	InertiaMoment   0.398139715
	Oblateness      0.00171720446
	RotationPeriod  78.8669243
	RotationEpoch   0
	Obliquity       89.6387405
	EqAscendNode    278.193298

	AbsMagn         6.41
	SlopeParam      4.51
	AlbedoBond      0.046
	AlbedoGeom      0.0552
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.547 0.542 0.538)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.773
		Randomize      (-0.502, -0.686, -0.058)
		colorDistMagn   0.796
		colorDistFreq   7.39e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.278
		heightTempGrad  0.625
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        0.627
		venusFreq       0.62
		venusMagn       0.702
		mareDensity     0
		terraceProb     0.879
		erosion         0
		montesMagn      0.526
		montesFreq      3.04
		montesSpiky     0.958
		montesFraction  0.809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000335
		hillsFraction   0.532
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.223
		craterDensity   0.937
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508
		volcanoTemp     294
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.441
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0204
		GasToDust   0.25
		Particles   1391
		GasBright   0.00227
		DustBright  0.0266
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          15.2939022
		SemiMajorAxis   4.03612852
		Eccentricity    0.944592944
		Inclination     -0.941299209
		AscendingNode   -11.0820084
		ArgOfPericenter -155.027388
		MeanAnomaly     41.8049147
	}
}

Comet	"C45"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.96278665e-14
	Radius          0.393784851
	InertiaMoment   0.398700774
	Oblateness      0.00156051363
	RotationPeriod  68.348299
	RotationEpoch   0
	Obliquity       277.94046
	EqAscendNode    359.605621

	AbsMagn         7.37
	SlopeParam      3.21
	AlbedoBond      0.0302
	AlbedoGeom      0.0362
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.560 0.555 0.548)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.999
		Randomize      (0.544, -0.841, 0.351)
		colorDistMagn   0.433
		colorDistFreq   0.000136
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.988
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.426
		heightTempGrad  0.625
		beachWidth      0.0015
		tropicWidth     0.07
		mainFreq        0.583
		venusFreq       0.623
		venusMagn       0.6
		mareDensity     0
		terraceProb     0.468
		erosion         0
		montesMagn      0.402
		montesFreq      3.4
		montesSpiky     0.908
		montesFraction  0.564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000288
		hillsFraction   0.659
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.192
		craterDensity   0.913
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545
		volcanoTemp     195
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.523
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0245
		GasToDust   0.25
		Particles   1475
		GasBright   0.00147
		DustBright  0.0356
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          15.7492897
		SemiMajorAxis   4.11585526
		Eccentricity    0.960256324
		Inclination     -42.2415751
		AscendingNode   -112.79877
		ArgOfPericenter -87.7974272
		MeanAnomaly     -7.53454641
	}
}

Comet	"C147"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.02579647e-17
	Radius          0.0414769016
	InertiaMoment   0.397927493
	Oblateness      0.00247694179
	RotationPeriod  55.0027771
	RotationEpoch   0
	Obliquity       122.883224
	EqAscendNode    277.539307

	AbsMagn         7.55
	SlopeParam      2.74
	AlbedoBond      0.0367
	AlbedoGeom      0.0441
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.455 0.451 0.447)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.771
		Randomize      (-0.317, -0.909, -0.093)
		colorDistMagn   0.686
		colorDistFreq   1.31e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.25
		icecapLatitude  0.912
		icecapHeight    0.0532
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26
		heightTempGrad  0.625
		beachWidth      0.000842
		tropicWidth     0.07
		mainFreq        0.523
		venusFreq       0.477
		venusMagn       0.549
		mareDensity     0
		terraceProb     0.264
		erosion         0
		montesMagn      0.486
		montesFreq      3.05
		montesSpiky     0.988
		montesFraction  0.6
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.87e-06
		hillsFraction   0.458
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.212
		craterFreq      0.177
		craterDensity   0.909
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535
		volcanoTemp     145
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0594
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.000638
		DustBright  0.0275
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          16.6149346
		SemiMajorAxis   4.26532248
		Eccentricity    0.936538885
		Inclination     -54.2413149
		AscendingNode   -99.6577759
		ArgOfPericenter -174.36696
		MeanAnomaly     40.3412852
	}
}

Comet	"C34"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.3252692e-09
	Radius          18.8934174
	InertiaMoment   0.399323821
	Oblateness      0.00107826467
	RotationPeriod  97.0680885
	RotationEpoch   0
	Obliquity       217.015228
	EqAscendNode    121.397095

	AbsMagn         9.33
	SlopeParam      4.69
	AlbedoBond      0.0436
	AlbedoGeom      0.0523
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.728 0.725 0.724)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.337
		Randomize      (0.206, -0.187, 0.948)
		colorDistMagn   0.193
		colorDistFreq   0.206
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.836
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44
		heightTempGrad  0.625
		beachWidth      0.000823
		tropicWidth     0.07
		mainFreq        0.692
		venusFreq       0.587
		venusMagn       0.642
		mareDensity     0
		terraceProb     0.245
		erosion         0
		montesMagn      0.623
		montesFreq      2.52
		montesSpiky     0.934
		montesFraction  0.446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05
		hillsFraction   0.429
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.227
		craterDensity   0.865
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473
		volcanoTemp     286
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0852
		GasToDust   0.25
		Particles   2700
		GasBright   0.00995
		DustBright  0.039
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          16.7394663
		SemiMajorAxis   4.2866088
		Eccentricity    0.943174983
		Inclination     42.9594638
		AscendingNode   26.4837229
		ArgOfPericenter -176.08248
		MeanAnomaly     34.8068966
	}
}

Comet	"C137"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.36417358e-13
	Radius          0.534132957
	InertiaMoment   0.399421066
	Oblateness      0.00350794545
	RotationPeriod  41.8504372
	RotationEpoch   0
	Obliquity       67.4966812
	EqAscendNode    257.349731

	AbsMagn         13.2
	SlopeParam      5.93
	AlbedoBond      0.0362
	AlbedoGeom      0.0434
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.577 0.569 0.565)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.715
		Randomize      (-0.625, -0.314, 0.813)
		colorDistMagn   0.598
		colorDistFreq   0.000104
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.511
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.127
		heightTempGrad  0.625
		beachWidth      0.000907
		tropicWidth     0.07
		mainFreq        0.461
		venusFreq       0.621
		venusMagn       0.625
		mareDensity     0
		terraceProb     0.147
		erosion         0
		montesMagn      0.599
		montesFreq      3.97
		montesSpiky     0.958
		montesFraction  0.2
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000555
		hillsFraction   0.644
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.264
		craterFreq      0.25
		craterDensity   0.769
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519
		volcanoTemp     259
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.799
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0304
		GasToDust   0.25
		Particles   1593
		GasBright   0.00793
		DustBright  0.0383
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          17.1018257
		SemiMajorAxis   4.34824926
		Eccentricity    0.94953232
		Inclination     83.0472498
		AscendingNode   68.4447382
		ArgOfPericenter -57.1291794
		MeanAnomaly     57.6166794
	}
}

Comet	"C139"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.57063885e-16
	Radius          0.0583856478
	InertiaMoment   0.397829443
	Oblateness      0.00197374029
	RotationPeriod  60.9662704
	RotationEpoch   0
	Obliquity       78.5739899
	EqAscendNode    333.387634

	AbsMagn         7.14
	SlopeParam      4.25
	AlbedoBond      0.0363
	AlbedoGeom      0.0435
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.473 0.468 0.461)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.926
		Randomize      (-0.563, -0.433, -0.568)
		colorDistMagn   0.778
		colorDistFreq   2.33e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.233
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        0.55
		venusFreq       0.604
		venusMagn       0.664
		mareDensity     0
		terraceProb     0.24
		erosion         0
		montesMagn      0.406
		montesFreq      2.32
		montesSpiky     0.99
		montesFraction  0.471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.87e-06
		hillsFraction   0.616
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.217
		craterDensity   0.919
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496
		volcanoTemp     236
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0862
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00264
		DustBright  0.016
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          17.4524395
		SemiMajorAxis   4.40747855
		Eccentricity    0.936966633
		Inclination     80.7053387
		AscendingNode   -21.1659465
		ArgOfPericenter -122.141972
		MeanAnomaly     -80.4437929
	}
}

Comet	"C157"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.65548344e-09
	Radius          22.7325573
	InertiaMoment   0.399565309
	Oblateness      0.00270293606
	RotationPeriod  69.2019596
	RotationEpoch   0
	Obliquity       178.269775
	EqAscendNode    297.728882

	AbsMagn         -1.34
	SlopeParam      4.18
	AlbedoBond      0.0373
	AlbedoGeom      0.0447
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.760 0.717 0.702)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.827
		Randomize      (-0.010, 0.496, -1.000)
		colorDistMagn   0.773
		colorDistFreq   0.276
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.202
		icecapLatitude  0.677
		icecapHeight    0.281
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.392
		heightTempGrad  0.625
		beachWidth      0.000778
		tropicWidth     0.07
		mainFreq        0.586
		venusFreq       0.581
		venusMagn       0.79
		mareDensity     0
		terraceProb     0.411
		erosion         0
		montesMagn      0.336
		montesFreq      2.36
		montesSpiky     0.849
		montesFraction  0.372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3
		hillsFraction   0.683
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.216
		craterDensity   1.09
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556
		volcanoTemp     380
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0868
		GasToDust   0.25
		Particles   2734
		GasBright   0.00374
		DustBright  0.00627
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          18.0510397
		SemiMajorAxis   4.50769228
		Eccentricity    0.941244698
		Inclination     170.024536
		AscendingNode   135.243739
		ArgOfPericenter 29.4288343
		MeanAnomaly     -84.6170117
	}
}

Comet	"C81"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.59390046e-10
	Radius          7.87791395
	InertiaMoment   0.398997575
	Oblateness      0.00160766544
	RotationPeriod  89.7394066
	RotationEpoch   0
	Obliquity       117.332024
	EqAscendNode    288.288086

	AbsMagn         9.21
	SlopeParam      3.05
	AlbedoBond      0.0328
	AlbedoGeom      0.0394
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.733 0.661 0.632)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.801
		Randomize      (-0.348, -0.983, -0.512)
		colorDistMagn   0.421
		colorDistFreq   0.0319
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.957
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.344
		heightTempGrad  0.625
		beachWidth      0.000669
		tropicWidth     0.07
		mainFreq        0.667
		venusFreq       0.577
		venusMagn       0.494
		mareDensity     0
		terraceProb     0.347
		erosion         0
		montesMagn      0.625
		montesFreq      3.45
		montesSpiky     0.973
		montesFraction  0.389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.193
		hillsFraction   0.881
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.234
		craterFreq      0.187
		craterDensity   0.868
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515
		volcanoTemp     412
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.73
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0698
		GasToDust   0.25
		Particles   2388
		GasBright   8.38e-05
		DustBright  0.0197
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          18.4123125
		SemiMajorAxis   4.56763794
		Eccentricity    0.917924575
		Inclination     -150.644972
		AscendingNode   3.71292008
		ArgOfPericenter -146.717919
		MeanAnomaly     160.877341
	}
}

Comet	"C86"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.40110367e-17
	Radius          0.0225947909
	InertiaMoment   0.399698436
	RotationPeriod  106.980789
	RotationEpoch   0
	Obliquity       145.025299
	EqAscendNode    298.382904

	AbsMagn         13
	SlopeParam      6.29
	AlbedoBond      0.0466
	AlbedoGeom      0.056
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.425 0.423 0.420)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.829
		Randomize      (-0.194, 0.720, -0.965)
		colorDistMagn   0.887
		colorDistFreq   2.07e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.479
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41
		heightTempGrad  0.625
		beachWidth      0.000787
		tropicWidth     0.07
		mainFreq        0.719
		venusFreq       0.745
		venusMagn       0.643
		mareDensity     0
		terraceProb     0.219
		erosion         0
		montesMagn      0.419
		montesFreq      2.35
		montesSpiky     0.988
		montesFraction  0.545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.3e-07
		hillsFraction   0.727
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28
		craterFreq      0.256
		craterDensity   0.775
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523
		volcanoTemp     249
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0331
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0046
		DustBright  0.0061
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          18.9421695
		SemiMajorAxis   4.65485252
		Eccentricity    0.957636668
		Inclination     19.0782938
		AscendingNode   61.9818057
		ArgOfPericenter 110.168216
		MeanAnomaly     -45.8744427
	}
}

Comet	"C57"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.30295299e-09
	Radius          22.4199772
	InertiaMoment   0.398802578
	Oblateness      0.0691716075
	RotationPeriod  13.6603231
	RotationEpoch   0
	Obliquity       344.404297
	EqAscendNode    95.8331146

	AbsMagn         7.98
	SlopeParam      3.15
	AlbedoBond      0.0312
	AlbedoGeom      0.0374
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.774 0.742 0.686)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.266
		Randomize      (0.913, 0.445, 0.064)
		colorDistMagn   0.711
		colorDistFreq   0.147
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.396
		icecapLatitude  0.943
		icecapHeight    0.0209
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.266
		heightTempGrad  0.625
		beachWidth      0.00142
		tropicWidth     0.07
		mainFreq        0.319
		venusFreq       0.663
		venusMagn       0.576
		mareDensity     0
		terraceProb     0.268
		erosion         0
		montesMagn      0.361
		montesFreq      2.95
		montesSpiky     0.979
		montesFraction  0.511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13
		hillsFraction   0.413
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.19
		craterDensity   0.898
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534
		volcanoTemp     407
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0866
		GasToDust   0.25
		Particles   2729
		GasBright   0.0113
		DustBright  0.02
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          18.9674885
		SemiMajorAxis   4.65899952
		Eccentricity    0.926304406
		Inclination     143.19179
		AscendingNode   119.999365
		ArgOfPericenter -11.9175048
		MeanAnomaly     -179.767965
	}
}

Comet	"C148"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.47594356e-07
	Radius          100.169907
	InertiaMoment   0.398813069
	Oblateness      0.0271121338
	RotationPeriod  21.7164087
	RotationEpoch   0
	Obliquity       128.421875
	EqAscendNode    135.558258

	AbsMagn         10.2
	SlopeParam      4.22
	AlbedoBond      0.0514
	AlbedoGeom      0.0617
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.836 0.810 0.762)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.377
		Randomize      (-0.287, -0.969, 0.216)
		colorDistMagn   0.776
		colorDistFreq   6.08
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.113
		heightTempGrad  0.625
		beachWidth      0.000986
		tropicWidth     0.07
		mainFreq        0.361
		venusFreq       0.678
		venusMagn       0.579
		mareDensity     0
		terraceProb     0.315
		erosion         0
		montesMagn      0.379
		montesFreq      3.12
		montesSpiky     0.937
		montesFraction  0.425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.8
		hillsFraction   0.406
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.295
		craterFreq      0.339
		craterDensity   0.843
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452
		volcanoTemp     238
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     225
		OuterRadius     702
		EdgeRadius      253
		MeanRadius      234
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     253
		RotationPeriod  11.8
		Brightness      1
		FrontBright     2.75
		BackBright      2.12
		Density         0.356
		Opacity         0.356
		SelfShadow      0.178
		PlanetShadow    0.178
		Hapke           1
		SpotBright      0.78
		SpotWidth       0.0259
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.29
		densityScale    1.4
		densityOffset   -0.474
		densityPower    5.03
		colorContrast   0.0861
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.000267
		DustBright  0.0341
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.1263607
		SemiMajorAxis   4.68497928
		Eccentricity    0.945297488
		Inclination     162.804624
		AscendingNode   -68.0339613
		ArgOfPericenter -24.3860824
		MeanAnomaly     -78.7504751
	}
}

Comet	"C129"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.73340723e-13
	Radius          0.731155694
	InertiaMoment   0.399362564
	Oblateness      0.00244027656
	RotationPeriod  47.6126404
	RotationEpoch   0
	Obliquity       23.1874466
	EqAscendNode    313.198059

	AbsMagn         12.3
	SlopeParam      2.82
	AlbedoBond      0.0357
	AlbedoGeom      0.0429
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.590 0.587 0.584)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.87
		Randomize      (-0.871, 0.161, 0.338)
		colorDistMagn   0.691
		colorDistFreq   0.000145
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.638
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.101
		heightTempGrad  0.625
		beachWidth      0.000959
		tropicWidth     0.07
		mainFreq        0.488
		venusFreq       0.555
		venusMagn       0.726
		mareDensity     0
		terraceProb     0.123
		erosion         0
		montesMagn      0.517
		montesFreq      3.03
		montesSpiky     0.96
		montesFraction  0.69
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000739
		hillsFraction   0.778
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.18
		craterDensity   0.79
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482
		volcanoTemp     351
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.15
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.036
		GasToDust   0.25
		Particles   1707
		GasBright   0.0107
		DustBright  0.0261
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.1830238
		SemiMajorAxis   4.69422776
		Eccentricity    0.967703196
		Inclination     131.082864
		AscendingNode   -170.841514
		ArgOfPericenter -126.668669
		MeanAnomaly     -82.0490044
	}
}

Comet	"C125"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.69524559e-07
	Radius          91.5148163
	InertiaMoment   0.399333119
	RotationPeriod  119.282089
	RotationEpoch   0
	Obliquity       1.03282738
	EqAscendNode    161.122238

	AbsMagn         12
	SlopeParam      6.01
	AlbedoBond      0.0355
	AlbedoGeom      0.0426
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.832 0.779 0.758)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.448
		Randomize      (-0.994, 0.399, -0.899)
		colorDistMagn   0.291
		colorDistFreq   1.73
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.745
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.288
		heightTempGrad  0.625
		beachWidth      0.000985
		tropicWidth     0.07
		mainFreq        0.743
		venusFreq       0.593
		venusMagn       0.644
		mareDensity     0
		terraceProb     0.29
		erosion         0
		montesMagn      0.64
		montesFreq      2.73
		montesSpiky     0.871
		montesFraction  0.339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.4
		hillsFraction   0.424
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.329
		craterDensity   0.799
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528
		volcanoTemp     327
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     154
		OuterRadius     191
		EdgeRadius      191
		MeanRadius      166
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     191
		RotationPeriod  8.27
		Brightness      1
		FrontBright     2.73
		BackBright      2.95
		Density         0.0716
		Opacity         0.0716
		SelfShadow      0.0358
		PlanetShadow    0.0358
		Hapke           1
		SpotBright      0.835
		SpotWidth       0.0211
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.24
		densityScale    1.4
		densityOffset   -0.24
		densityPower    4.87
		colorContrast   0.098
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0042
		DustBright  0.00781
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.2248752
		SemiMajorAxis   4.70105285
		Eccentricity    0.959874704
		Inclination     48.0225528
		AscendingNode   64.6116376
		ArgOfPericenter -68.9831847
		MeanAnomaly     9.43311319
	}
}

Comet	"C142"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.31516672e-09
	Radius          14.6528063
	InertiaMoment   0.395809561
	Oblateness      0.00545056211
	RotationPeriod  48.4195518
	RotationEpoch   0
	Obliquity       95.1899567
	EqAscendNode    267.444519

	AbsMagn         4.37
	SlopeParam      4.24
	AlbedoBond      0.0508
	AlbedoGeom      0.061
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.779 0.728 0.643)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.743
		Randomize      (-0.471, -0.612, 0.360)
		colorDistMagn   0.14
		colorDistFreq   0.0381
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.991
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.193
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.492
		venusFreq       0.579
		venusMagn       0.727
		mareDensity     0
		terraceProb     0.412
		erosion         0
		montesMagn      0.398
		montesFreq      2.67
		montesSpiky     0.973
		montesFraction  0.456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.453
		hillsFraction   0.571
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.217
		craterDensity   0.986
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526
		volcanoTemp     237
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.8
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0798
		GasToDust   0.25
		Particles   2591
		GasBright   0.00361
		DustBright  0.0336
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.3590286
		SemiMajorAxis   4.72289715
		Eccentricity    0.980239558
		Inclination     -162.445611
		AscendingNode   -136.152172
		ArgOfPericenter 30.5216256
		MeanAnomaly     173.815864
	}
}

Comet	"C59"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.028037e-12
	Radius          2.15260887
	InertiaMoment   0.396161258
	Oblateness      0.0076555768
	RotationPeriod  36.8637714
	RotationEpoch   0
	Obliquity       355.481628
	EqAscendNode    171.871033

	AbsMagn         -1.07
	SlopeParam      6.51
	AlbedoBond      0.0313
	AlbedoGeom      0.0376
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.629 0.626 0.624)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.477
		Randomize      (0.975, 0.326, 0.682)
		colorDistMagn   0.895
		colorDistFreq   0.00292
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.477
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.372
		heightTempGrad  0.625
		beachWidth      0.000511
		tropicWidth     0.07
		mainFreq        0.437
		venusFreq       0.636
		venusMagn       0.622
		mareDensity     0
		terraceProb     0.381
		erosion         0
		montesMagn      0.473
		montesFreq      3.1
		montesSpiky     0.825
		montesFraction  0.672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0106
		hillsFraction   0.837
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.219
		craterFreq      0.259
		craterDensity   1.09
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509
		volcanoTemp     384
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.82
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.05
		GasToDust   0.25
		Particles   1988
		GasBright   0.0145
		DustBright  0.0292
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.6381504
		SemiMajorAxis   4.76818578
		Eccentricity    0.961542709
		Inclination     154.029868
		AscendingNode   51.3476761
		ArgOfPericenter 175.585477
		MeanAnomaly     140.511388
	}
}

Comet	"C115"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.93892153e-15
	Radius          0.20076783
	InertiaMoment   0.397498012
	Oblateness      0.00189352687
	RotationPeriod  82.5235348
	RotationEpoch   0
	Obliquity       305.646271
	EqAscendNode    140.932663

	AbsMagn         5.83
	SlopeParam      4.35
	AlbedoBond      0.0349
	AlbedoGeom      0.0419
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.644 0.525 0.385)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.391
		Randomize      (0.698, 0.994, 0.007)
		colorDistMagn   0.154
		colorDistFreq   1.99e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.888
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.155
		heightTempGrad  0.625
		beachWidth      0.000749
		tropicWidth     0.07
		mainFreq        0.641
		venusFreq       0.536
		venusMagn       0.703
		mareDensity     0
		terraceProb     0.171
		erosion         0
		montesMagn      0.458
		montesFreq      3.31
		montesSpiky     0.996
		montesFraction  0.579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000105
		hillsFraction   0.634
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.219
		craterDensity   0.951
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513
		volcanoTemp     232
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.214
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0106
		GasToDust   0.25
		Particles   1193
		GasBright   0.015
		DustBright  0.0151
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          19.6690371
		SemiMajorAxis   4.77318405
		Eccentricity    0.959771453
		Inclination     -16.8134806
		AscendingNode   26.1844652
		ArgOfPericenter -58.0851851
		MeanAnomaly     -37.7337959
	}
}

Comet	"C49"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.36476048e-08
	Radius          31.7660847
	InertiaMoment   0.398735076
	Oblateness      0.027052993
	RotationPeriod  21.8261805
	RotationEpoch   0
	Obliquity       300.095062
	EqAscendNode    151.681458

	AbsMagn         7.57
	SlopeParam      4.63
	AlbedoBond      0.0305
	AlbedoGeom      0.0366
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.805 0.726 0.688)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.421
		Randomize      (0.667, 0.921, -0.411)
		colorDistMagn   0.804
		colorDistFreq   0.153
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.958
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.239
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.361
		venusFreq       0.59
		venusMagn       0.681
		mareDensity     0
		terraceProb     0.244
		erosion         0
		montesMagn      0.58
		montesFreq      1.87
		montesSpiky     0.981
		montesFraction  0.359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03
		hillsFraction   0.603
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.273
		craterFreq      0.225
		craterDensity   0.908
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495
		volcanoTemp     289
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0923
		GasToDust   0.25
		Particles   2843
		GasBright   0.0105
		DustBright  0.0113
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          20.3661679
		SemiMajorAxis   4.88531225
		Eccentricity    0.961412227
		Inclination     -86.9429902
		AscendingNode   -135.853584
		ArgOfPericenter -121.394358
		MeanAnomaly     -178.033426
	}
}

Comet	"C158"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.85411972e-10
	Radius          7.29560852
	InertiaMoment   0.396506995
	Oblateness      0.00948495604
	RotationPeriod  36.7754288
	RotationEpoch   0
	Obliquity       183.808441
	EqAscendNode    155.747849

	AbsMagn         5.46
	SlopeParam      5.8
	AlbedoBond      0.0524
	AlbedoGeom      0.0629
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.775 0.660 0.583)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.433
		Randomize      (0.021, 0.436, -0.690)
		colorDistMagn   0.865
		colorDistFreq   0.0208
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.95
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.245
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        0.436
		venusFreq       0.572
		venusMagn       0.865
		mareDensity     0
		terraceProb     0.523
		erosion         0
		montesMagn      0.551
		montesFreq      2.5
		montesSpiky     0.969
		montesFraction  0.737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.135
		hillsFraction   0.668
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.248
		craterDensity   0.96
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471
		volcanoTemp     333
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.48
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0685
		GasToDust   0.25
		Particles   2363
		GasBright   0.00582
		DustBright  0.0104
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          21.1938721
		SemiMajorAxis   5.0167946
		Eccentricity    0.98043976
		Inclination     73.591019
		AscendingNode   -144.147231
		ArgOfPericenter 175.115828
		MeanAnomaly     -41.0386639
	}
}

Comet	"C88"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.82675491e-09
	Radius          13.5167589
	InertiaMoment   0.398265213
	Oblateness      0.00988922454
	RotationPeriod  24.8864708
	RotationEpoch   0
	Obliquity       156.1026
	EqAscendNode    14.4208059

	AbsMagn         7.05
	SlopeParam      4.46
	AlbedoBond      0.0468
	AlbedoGeom      0.0561
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.723 0.718 0.714)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0401
		Randomize      (-0.133, 0.601, -0.346)
		colorDistMagn   0.168
		colorDistFreq   0.132
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.996
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.117
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.377
		venusFreq       0.656
		venusMagn       0.682
		mareDensity     0
		terraceProb     0.318
		erosion         0
		montesMagn      0.505
		montesFreq      2.6
		montesSpiky     0.855
		montesFraction  0.716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.322
		hillsFraction   0.695
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.258
		craterFreq      0.222
		craterDensity   0.921
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5
		volcanoTemp     296
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.2
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0825
		GasToDust   0.25
		Particles   2645
		GasBright   0.00924
		DustBright  0.0138
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          21.3446165
		SemiMajorAxis   5.04055492
		Eccentricity    0.945745165
		Inclination     69.5466857
		AscendingNode   -38.0730898
		ArgOfPericenter 155.227241
		MeanAnomaly     148.316463
	}
}

Comet	"C118"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.348695e-08
	Radius          41.6799774
	InertiaMoment   0.399923027
	Oblateness      0.00293349987
	RotationPeriod  66.3857803
	RotationEpoch   0
	Obliquity       322.262238
	EqAscendNode    74.9895401

	AbsMagn         1.82
	SlopeParam      4.34
	AlbedoBond      0.0488
	AlbedoGeom      0.0586
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.762 0.759 0.756)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.208
		Randomize      (0.790, 0.816, 0.935)
		colorDistMagn   0.51
		colorDistFreq   1.15
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.115
		heightTempGrad  0.625
		beachWidth      0.00088
		tropicWidth     0.07
		mainFreq        0.574
		venusFreq       0.665
		venusMagn       0.787
		mareDensity     0
		terraceProb     0.316
		erosion         0
		montesMagn      0.452
		montesFreq      3.65
		montesSpiky     0.979
		montesFraction  0.566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.68
		hillsFraction   0.591
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.219
		craterDensity   1.04
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548
		volcanoTemp     372
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0966
		GasToDust   0.25
		Particles   2932
		GasBright   0.0221
		DustBright  0.0266
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          21.4802173
		SemiMajorAxis   5.06188057
		Eccentricity    0.961139706
		Inclination     -87.5725057
		AscendingNode   -20.0773428
		ArgOfPericenter 5.92797101
		MeanAnomaly     100.937802
	}
}

Comet	"C138"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.7957914e-15
	Radius          0.177791163
	InertiaMoment   0.395517468
	RotationPeriod  126.212139
	RotationEpoch   0
	Obliquity       73.0353394
	EqAscendNode    115.36869

	AbsMagn         4.06
	SlopeParam      2.78
	AlbedoBond      0.0505
	AlbedoGeom      0.0606
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.525 0.519 0.512)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.32
		Randomize      (-0.594, -0.374, -0.878)
		colorDistMagn   0.688
		colorDistFreq   1.2e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.954
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.752
		venusFreq       0.612
		venusMagn       0.645
		mareDensity     0
		terraceProb     0.194
		erosion         0
		montesMagn      0.501
		montesFreq      2.06
		montesSpiky     0.895
		montesFraction  0.643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.26e-05
		hillsFraction   0.63
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.257
		craterFreq      0.179
		craterDensity   0.993
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421
		volcanoTemp     283
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.262
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.012
		GasToDust   0.25
		Particles   1222
		GasBright   0.00195
		DustBright  0.0105
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          21.5745959
		SemiMajorAxis   5.0766968
		Eccentricity    0.969248601
		Inclination     128.213491
		AscendingNode   165.691682
		ArgOfPericenter -127.340463
		MeanAnomaly     -139.592691
	}
}

Comet	"C11"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.81863971e-09
	Radius          15.890089
	InertiaMoment   0.399802208
	Oblateness      0.00147564837
	RotationPeriod  73.3902283
	RotationEpoch   0
	Obliquity       89.6261826
	EqAscendNode    146.96106

	AbsMagn         10.9
	SlopeParam      7.01
	AlbedoBond      0.0269
	AlbedoGeom      0.0322
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.724 0.721 0.720)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.408
		Randomize      (-0.502, -0.819, -0.167)
		colorDistMagn   0.634
		colorDistFreq   0.029
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.986
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.215
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        0.604
		venusFreq       0.666
		venusMagn       0.7
		mareDensity     0
		terraceProb     0.222
		erosion         0
		montesMagn      0.559
		montesFreq      3.56
		montesSpiky     0.865
		montesFraction  0.368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.559
		hillsFraction   0.443
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.18
		craterFreq      0.266
		craterDensity   0.827
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549
		volcanoTemp     375
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0837
		GasToDust   0.25
		Particles   2670
		GasBright   0.00121
		DustBright  0.0254
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.057183
		SemiMajorAxis   5.15212207
		Eccentricity    0.954776192
		Inclination     72.7793467
		AscendingNode   -113.019761
		ArgOfPericenter -12.0984889
		MeanAnomaly     -112.268653
	}
}

Comet	"C154"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.61057134e-16
	Radius          0.0974449217
	InertiaMoment   0.396370739
	Oblateness      0.00121044694
	RotationPeriod  86.5764084
	RotationEpoch   0
	Obliquity       161.653824
	EqAscendNode    3.67201257

	AbsMagn         5.21
	SlopeParam      4.19
	AlbedoBond      0.052
	AlbedoGeom      0.0624
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.490 0.488 0.484)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0102
		Randomize      (-0.102, 0.674, 0.072)
		colorDistMagn   0.499
		colorDistFreq   3.33e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.806
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.432
		heightTempGrad  0.625
		beachWidth      0.000947
		tropicWidth     0.07
		mainFreq        0.656
		venusFreq       0.606
		venusMagn       0.705
		mareDensity     0
		terraceProb     0.239
		erosion         0
		montesMagn      0.353
		montesFreq      3.74
		montesSpiky     0.888
		montesFraction  0.391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.31e-05
		hillsFraction   0.731
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.216
		craterDensity   0.966
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517
		volcanoTemp     239
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.126
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0132
		DustBright  0.0183
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.3748694
		SemiMajorAxis   5.20147425
		Eccentricity    0.939970967
		Inclination     36.0277318
		AscendingNode   -14.7217801
		ArgOfPericenter 153.959024
		MeanAnomaly     -151.39962
	}
}

Comet	"C15"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.69700892e-15
	Radius          0.198004261
	InertiaMoment   0.399830282
	Oblateness      0.0179288145
	RotationPeriod  26.9362965
	RotationEpoch   0
	Obliquity       111.7808
	EqAscendNode    299.036896

	AbsMagn         11.1
	SlopeParam      3.34
	AlbedoBond      0.0273
	AlbedoGeom      0.0328
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.574 0.513 0.454)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.831
		Randomize      (-0.379, 0.943, -0.930)
		colorDistMagn   0.0234
		colorDistFreq   8.36e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.988
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.428
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.387
		venusFreq       0.618
		venusMagn       0.839
		mareDensity     0
		terraceProb     0.471
		erosion         0
		montesMagn      0.467
		montesFreq      2.35
		montesSpiky     0.957
		montesFraction  0.714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.1e-05
		hillsFraction   0.788
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.195
		craterDensity   0.82
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498
		volcanoTemp     259
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.246
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0104
		GasToDust   0.25
		Particles   1188
		GasBright   0.00554
		DustBright  0.00586
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.4207293
		SemiMajorAxis   5.20857918
		Eccentricity    0.978975457
		Inclination     -35.4189681
		AscendingNode   87.1107504
		ArgOfPericenter -173.150945
		MeanAnomaly     -151.181062
	}
}

Comet	"C50"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.79772635e-10
	Radius          10.1973553
	InertiaMoment   0.399441004
	Oblateness      0.00220945966
	RotationPeriod  76.5971489
	RotationEpoch   0
	Obliquity       305.633728
	EqAscendNode    9.7004137

	AbsMagn         10.2
	SlopeParam      6.59
	AlbedoBond      0.0445
	AlbedoGeom      0.0534
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.698 0.694 0.691)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0269
		Randomize      (0.698, 0.861, -0.102)
		colorDistMagn   0.897
		colorDistFreq   0.0739
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.624
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.493
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.617
		venusFreq       0.581
		venusMagn       0.701
		mareDensity     0
		terraceProb     0.293
		erosion         0
		montesMagn      0.489
		montesFreq      2.26
		montesSpiky     0.928
		montesFraction  0.724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.213
		hillsFraction   0.588
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.262
		craterFreq      0.26
		craterDensity   0.843
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557
		volcanoTemp     382
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.4
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0739
		GasToDust   0.25
		Particles   2472
		GasBright   0.013
		DustBright  0.015
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.4548703
		SemiMajorAxis   5.21386539
		Eccentricity    0.937239609
		Inclination     -163.108513
		AscendingNode   -151.859503
		ArgOfPericenter 145.13789
		MeanAnomaly     171.073012
	}
}

Comet	"C61"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.81644101e-15
	Radius          0.177033514
	InertiaMoment   0.398835838
	Oblateness      0.00171954941
	RotationPeriod  55.9132061
	RotationEpoch   0
	Obliquity       6.55892372
	EqAscendNode    247.908936

	AbsMagn         8.18
	SlopeParam      4.58
	AlbedoBond      0.0314
	AlbedoGeom      0.0377
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.526 0.522 0.519)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.689
		Randomize      (-0.964, 0.207, -0.699)
		colorDistMagn   0.181
		colorDistFreq   1.06e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.852
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.479
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.527
		venusFreq       0.617
		venusMagn       0.662
		mareDensity     0
		terraceProb     0.101
		erosion         0
		montesMagn      0.554
		montesFreq      3.25
		montesSpiky     0.902
		montesFraction  0.245
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36e-05
		hillsFraction   0.774
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.283
		craterFreq      0.224
		craterDensity   0.893
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487
		volcanoTemp     291
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.244
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0133
		GasToDust   0.25
		Particles   1247
		GasBright   0.00483
		DustBright  0.0112
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.4902034
		SemiMajorAxis   5.21933336
		Eccentricity    0.948596211
		Inclination     128.175691
		AscendingNode   -112.297707
		ArgOfPericenter -175.131564
		MeanAnomaly     -60.8705677
	}
}

Comet	"C101"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.23815564e-17
	Radius          0.0414821357
	InertiaMoment   0.399153024
	Oblateness      0.0193899292
	RotationPeriod  25.8695068
	RotationEpoch   0
	Obliquity       228.105118
	EqAscendNode    328.667236

	AbsMagn         10.3
	SlopeParam      6.17
	AlbedoBond      0.0341
	AlbedoGeom      0.0409
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.447 0.444 0.439)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.913
		Randomize      (0.267, -0.173, -0.324)
		colorDistMagn   0.608
		colorDistFreq   1.16e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.977
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.209
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.382
		venusFreq       0.494
		venusMagn       0.682
		mareDensity     0
		terraceProb     0.218
		erosion         0
		montesMagn      0.376
		montesFreq      3.79
		montesSpiky     0.884
		montesFraction  0.477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.82e-06
		hillsFraction   0.477
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.254
		craterDensity   0.84
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551
		volcanoTemp     112
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0479
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00486
		DustBright  0.0187
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.5577062
		SemiMajorAxis   5.22977179
		Eccentricity    0.930431081
		Inclination     -108.558337
		AscendingNode   58.486183
		ArgOfPericenter -121.308949
		MeanAnomaly     146.118187
	}
}

Comet	"C6"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.92064018e-13
	Radius          0.875191808
	InertiaMoment   0.399112701
	Oblateness      0.00301715825
	RotationPeriod  65.5670986
	RotationEpoch   0
	Obliquity       61.9329147
	EqAscendNode    136.866272

	AbsMagn         7.89
	SlopeParam      3.37
	AlbedoBond      0.0421
	AlbedoGeom      0.0505
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.666 0.576 0.498)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.38
		Randomize      (-0.656, -0.521, 0.286)
		colorDistMagn   0.0296
		colorDistFreq   0.000262
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.554
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.149
		heightTempGrad  0.625
		beachWidth      0.001
		tropicWidth     0.07
		mainFreq        0.571
		venusFreq       0.563
		venusMagn       0.599
		mareDensity     0
		terraceProb     0.351
		erosion         0
		montesMagn      0.482
		montesFreq      3.11
		montesSpiky     0.814
		montesFraction  0.778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00159
		hillsFraction   0.565
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.196
		craterDensity   0.901
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539
		volcanoTemp     327
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.08
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0343
		GasToDust   0.25
		Particles   1673
		GasBright   0.00427
		DustBright  0.0314
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          22.774763
		SemiMajorAxis   5.26326646
		Eccentricity    0.946011798
		Inclination     -94.1888877
		AscendingNode   -33.3306043
		ArgOfPericenter 60.9179819
		MeanAnomaly     -171.239481
	}
}

Comet	"C21"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.83963478e-12
	Radius          1.35827827
	InertiaMoment   0.398486108
	Oblateness      0.00143067166
	RotationPeriod  95.0994644
	RotationEpoch   0
	Obliquity       145.012726
	EqAscendNode    167.150635

	AbsMagn         6.09
	SlopeParam      3.31
	AlbedoBond      0.028
	AlbedoGeom      0.0336
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.710 0.605 0.494)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.464
		Randomize      (-0.194, 0.586, 0.926)
		colorDistMagn   0.721
		colorDistFreq   0.00114
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.215
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.348
		heightTempGrad  0.625
		beachWidth      0.000757
		tropicWidth     0.07
		mainFreq        0.685
		venusFreq       0.566
		venusMagn       0.641
		mareDensity     0
		terraceProb     0.35
		erosion         0
		montesMagn      0.455
		montesFreq      2.92
		montesSpiky     0.917
		montesFraction  0.679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00458
		hillsFraction   0.677
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.194
		craterDensity   0.945
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582
		volcanoTemp     400
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.57
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0414
		GasToDust   0.25
		Particles   1816
		GasBright   0.0192
		DustBright  0.0293
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.2414524
		SemiMajorAxis   5.33492465
		Eccentricity    0.971838883
		Inclination     156.573577
		AscendingNode   157.669632
		ArgOfPericenter 89.3860092
		MeanAnomaly     -147.972047
	}
}

Comet	"C163"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.11269093e-17
	Radius          0.0186100807
	InertiaMoment   0.398109972
	Oblateness      0.00290600769
	RotationPeriod  43.4821672
	RotationEpoch   0
	Obliquity       211.501709
	EqAscendNode    165.842636

	AbsMagn         8.36
	SlopeParam      4.16
	AlbedoBond      0.0376
	AlbedoGeom      0.0451
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.424 0.417 0.414)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.461
		Randomize      (0.175, 0.139, 0.857)
		colorDistMagn   0.496
		colorDistFreq   7.93e-08
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.521
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.312
		heightTempGrad  0.625
		beachWidth      0.000439
		tropicWidth     0.07
		mainFreq        0.469
		venusFreq       0.688
		venusMagn       0.626
		mareDensity     0
		terraceProb     0.314
		erosion         0
		montesMagn      0.267
		montesFreq      2.92
		montesSpiky     0.984
		montesFraction  0.328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.34e-07
		hillsFraction   0.597
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.256
		craterFreq      0.215
		craterDensity   0.889
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479
		volcanoTemp     311
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0285
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0134
		DustBright  0.0337
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.2551666
		SemiMajorAxis   5.33702311
		Eccentricity    0.976803449
		Inclination     -5.51909004
		AscendingNode   -98.3699883
		ArgOfPericenter -59.7842304
		MeanAnomaly     18.8874165
	}
}

Comet	"C75"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.11296953e-12
	Radius          1.14880502
	InertiaMoment   0.396705508
	Oblateness      0.0225286186
	RotationPeriod  23.8858881
	RotationEpoch   0
	Obliquity       84.10009
	EqAscendNode    60.1743546

	AbsMagn         2.69
	SlopeParam      3.07
	AlbedoBond      0.0324
	AlbedoGeom      0.0389
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.599 0.593 0.590)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.167
		Randomize      (-0.533, -0.626, -0.368)
		colorDistMagn   0.706
		colorDistFreq   0.00103
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.845
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.424
		heightTempGrad  0.625
		beachWidth      0.000708
		tropicWidth     0.07
		mainFreq        0.372
		venusFreq       0.629
		venusMagn       0.682
		mareDensity     0
		terraceProb     0.465
		erosion         0
		montesMagn      0.652
		montesFreq      2.97
		montesSpiky     0.803
		montesFraction  0.424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00365
		hillsFraction   0.551
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.262
		craterFreq      0.188
		craterDensity   1.02
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449
		volcanoTemp     271
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.34
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0387
		GasToDust   0.25
		Particles   1761
		GasBright   0.00212
		DustBright  0.0205
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.3473971
		SemiMajorAxis   5.35112497
		Eccentricity    0.974729074
		Inclination     -143.698331
		AscendingNode   20.3033867
		ArgOfPericenter -140.344107
		MeanAnomaly     -30.1416235
	}
}

Comet	"C169"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.59300068e-15
	Radius          0.165175483
	InertiaMoment   0.399650723
	Oblateness      0.0547557771
	RotationPeriod  14.7827024
	RotationEpoch   0
	Obliquity       244.733627
	EqAscendNode    33.9563789

	AbsMagn         2.11
	SlopeParam      4.13
	AlbedoBond      0.0379
	AlbedoGeom      0.0455
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.512 0.505 0.502)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0943
		Randomize      (0.360, -0.218, 0.713)
		colorDistMagn   0.126
		colorDistFreq   1.71e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.927
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.231
		heightTempGrad  0.625
		beachWidth      0.001
		tropicWidth     0.07
		mainFreq        0.325
		venusFreq       0.609
		venusMagn       0.754
		mareDensity     0
		terraceProb     0.239
		erosion         0
		montesMagn      0.66
		montesFreq      3.38
		montesSpiky     0.949
		montesFraction  0.27
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.09e-05
		hillsFraction   0.482
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.214
		craterDensity   1.04
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543
		volcanoTemp     242
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.185
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00787
		GasToDust   0.25
		Particles   1138
		GasBright   0.00865
		DustBright  0.0356
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.3596247
		SemiMajorAxis   5.35299316
		Eccentricity    0.952355626
		Inclination     -171.362282
		AscendingNode   -76.7337837
		ArgOfPericenter -96.2474491
		MeanAnomaly     -80.2256361
	}
}

Comet	"C53"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.79582232e-14
	Radius          0.281027347
	InertiaMoment   0.398768991
	Oblateness      0.00196866668
	RotationPeriod  61.9217262
	RotationEpoch   0
	Obliquity       322.249695
	EqAscendNode    303.757294

	AbsMagn         7.78
	SlopeParam      6.57
	AlbedoBond      0.0308
	AlbedoGeom      0.037
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.543 0.538 0.534)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.844
		Randomize      (0.790, 0.683, 0.826)
		colorDistMagn   0.319
		colorDistFreq   1.85e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.677
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.453
		heightTempGrad  0.625
		beachWidth      0.00145
		tropicWidth     0.07
		mainFreq        0.554
		venusFreq       0.55
		venusMagn       0.783
		mareDensity     0
		terraceProb     0.54
		erosion         0
		montesMagn      0.484
		montesFreq      2.64
		montesSpiky     0.905
		montesFraction  0.706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000169
		hillsFraction   0.538
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.26
		craterDensity   0.903
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438
		volcanoTemp     243
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.361
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0189
		GasToDust   0.25
		Particles   1361
		GasBright   0.0196
		DustBright  0.027
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.3659427
		SemiMajorAxis   5.35395831
		Eccentricity    0.935837869
		Inclination     51.3604412
		AscendingNode   -176.666681
		ArgOfPericenter -22.0257327
		MeanAnomaly     102.222061
	}
}

Comet	"C108"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.57753143e-16
	Radius          0.0912596583
	InertiaMoment   0.398460478
	Oblateness      0.00468666898
	RotationPeriod  52.5502739
	RotationEpoch   0
	Obliquity       266.875702
	EqAscendNode    54.7999611

	AbsMagn         8.07
	SlopeParam      2.92
	AlbedoBond      0.0481
	AlbedoGeom      0.0577
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.539 0.464 0.418)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.152
		Randomize      (0.483, -0.589, -0.159)
		colorDistMagn   0.412
		colorDistFreq   1.93e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.975
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.382
		heightTempGrad  0.625
		beachWidth      0.00124
		tropicWidth     0.07
		mainFreq        0.512
		venusFreq       0.607
		venusMagn       0.547
		mareDensity     0
		terraceProb     0.195
		erosion         0
		montesMagn      0.555
		montesFreq      2.79
		montesSpiky     0.949
		montesFraction  0.867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2e-05
		hillsFraction   0.741
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.183
		craterDensity   0.896
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529
		volcanoTemp     207
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.102
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00275
		DustBright  0.0241
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.4201226
		SemiMajorAxis   5.36223146
		Eccentricity    0.969709709
		Inclination     -152.440007
		AscendingNode   122.76182
		ArgOfPericenter -116.493776
		MeanAnomaly     83.1343332
	}
}

Comet	"C155"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.16905697e-17
	Radius          0.0295138564
	InertiaMoment   0.398020804
	Oblateness      0.00317431893
	RotationPeriod  49.2266693
	RotationEpoch   0
	Obliquity       167.192474
	EqAscendNode    221.690964

	AbsMagn         7.96
	SlopeParam      5.82
	AlbedoBond      0.0371
	AlbedoGeom      0.0446
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.438 0.434 0.432)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.616
		Randomize      (-0.071, 0.615, 0.382)
		colorDistMagn   0.593
		colorDistFreq   7.6e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.985
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.286
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.496
		venusFreq       0.598
		venusMagn       0.727
		mareDensity     0
		terraceProb     0.288
		erosion         0
		montesMagn      0.557
		montesFreq      4.13
		montesSpiky     0.986
		montesFraction  0.759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14e-06
		hillsFraction   0.713
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.248
		craterDensity   0.899
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416
		volcanoTemp     263
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0411
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0152
		DustBright  0.0224
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.5786678
		SemiMajorAxis   5.3864044
		Eccentricity    0.94624431
		Inclination     -86.9818146
		AscendingNode   40.1202389
		ArgOfPericenter 145.583992
		MeanAnomaly     40.0971962
	}
}

Comet	"C152"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.83870126e-13
	Radius          1.06386089
	InertiaMoment   0.398846209
	Oblateness      0.00338922837
	RotationPeriod  61.8310432
	RotationEpoch   0
	Obliquity       150.576508
	EqAscendNode    287.634094

	AbsMagn         10.4
	SlopeParam      5.83
	AlbedoBond      0.0518
	AlbedoGeom      0.0621
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.594 0.590 0.588)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.799
		Randomize      (-0.163, 0.793, -0.546)
		colorDistMagn   0.281
		colorDistFreq   0.000722
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.7
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.326
		heightTempGrad  0.625
		beachWidth      0.00126
		tropicWidth     0.07
		mainFreq        0.554
		venusFreq       0.623
		venusMagn       0.665
		mareDensity     0
		terraceProb     0.146
		erosion         0
		montesMagn      0.563
		montesFreq      3.46
		montesSpiky     0.762
		montesFraction  0.784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00269
		hillsFraction   0.771
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.248
		craterDensity   0.837
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545
		volcanoTemp     332
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.18
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0375
		GasToDust   0.25
		Particles   1736
		GasBright   0.00855
		DustBright  0.0105
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.6146752
		SemiMajorAxis   5.39188678
		Eccentricity    0.955052098
		Inclination     151.409958
		AscendingNode   -174.930874
		ArgOfPericenter -87.3431378
		MeanAnomaly     168.577076
	}
}

Comet	"C9"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.76426623e-17
	Radius          0.0227513015
	InertiaMoment   0.398372024
	Oblateness      0.00228759157
	RotationPeriod  52.635149
	RotationEpoch   0
	Obliquity       78.5488739
	EqAscendNode    70.9231491

	AbsMagn         5.37
	SlopeParam      3.36
	AlbedoBond      0.0266
	AlbedoGeom      0.0319
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.430 0.426 0.422)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.197
		Randomize      (-0.564, -0.700, -0.786)
		colorDistMagn   0.444
		colorDistFreq   2.73e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.826
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.109
		heightTempGrad  0.625
		beachWidth      0.00143
		tropicWidth     0.07
		mainFreq        0.512
		venusFreq       0.51
		venusMagn       0.66
		mareDensity     0
		terraceProb     0.128
		erosion         0
		montesMagn      0.477
		montesFreq      3.35
		montesSpiky     0.992
		montesFraction  0.755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12e-06
		hillsFraction   0.507
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.196
		craterDensity   0.962
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.393
		volcanoTemp     188
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0313
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00107
		DustBright  0.0132
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.6740289
		SemiMajorAxis   5.40091774
		Eccentricity    0.937041322
		Inclination     46.7559319
		AscendingNode   -97.548938
		ArgOfPericenter 39.0179716
		MeanAnomaly     -45.8761194
	}
}

Comet	"C117"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.45754386e-18
	Radius          0.0206454992
	InertiaMoment   0.399273753
	Oblateness      0.144435003
	RotationPeriod  9.48069763
	RotationEpoch   0
	Obliquity       316.723602
	EqAscendNode    216.970581

	AbsMagn         11.4
	SlopeParam      2.88
	AlbedoBond      0.035
	AlbedoGeom      0.0421
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.416 0.410 0.406)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.603
		Randomize      (0.760, 0.875, 0.626)
		colorDistMagn   0.409
		colorDistFreq   3.63e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.964
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.262
		heightTempGrad  0.625
		beachWidth      0.00134
		tropicWidth     0.07
		mainFreq        0.296
		venusFreq       0.694
		venusMagn       0.752
		mareDensity     0
		terraceProb     0.265
		erosion         0
		montesMagn      0.538
		montesFreq      3.51
		montesSpiky     0.876
		montesFraction  0.77
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13e-06
		hillsFraction   0.605
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.182
		craterDensity   0.814
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49
		volcanoTemp     139
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0231
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0199
		DustBright  0.0226
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.7089971
		SemiMajorAxis   5.40623478
		Eccentricity    0.966778321
		Inclination     50.4818997
		AscendingNode   149.093676
		ArgOfPericenter -83.1579325
		MeanAnomaly     -172.59053
	}
}

Comet	"C98"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.46095169e-12
	Radius          1.25784421
	InertiaMoment   0.399782956
	Oblateness      0.00838523172
	RotationPeriod  39.3778095
	RotationEpoch   0
	Obliquity       211.489151
	EqAscendNode    34.6103821

	AbsMagn         14.7
	SlopeParam      6.2
	AlbedoBond      0.0474
	AlbedoGeom      0.0569
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.684 0.620 0.514)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0961
		Randomize      (0.175, 0.006, 0.748)
		colorDistMagn   0.302
		colorDistFreq   0.000797
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.477
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25
		heightTempGrad  0.625
		beachWidth      0.00161
		tropicWidth     0.07
		mainFreq        0.449
		venusFreq       0.56
		venusMagn       0.624
		mareDensity     0
		terraceProb     0.532
		erosion         0
		montesMagn      0.386
		montesFreq      3.38
		montesSpiky     0.912
		montesFraction  0.491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00338
		hillsFraction   0.546
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.196
		craterFreq      0.254
		craterDensity   0.731
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514
		volcanoTemp     182
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.37
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0402
		GasToDust   0.25
		Particles   1791
		GasBright   0.0113
		DustBright  0.0337
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.7618411
		SemiMajorAxis   5.41426496
		Eccentricity    0.958129161
		Inclination     177.011228
		AscendingNode   -141.02523
		ArgOfPericenter -135.438366
		MeanAnomaly     178.691853
	}
}

Comet	"C39"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.4659387e-16
	Radius          0.0695227832
	InertiaMoment   0.399998069
	RotationPeriod  127.128731
	RotationEpoch   0
	Obliquity       244.708527
	EqAscendNode    131.491867

	AbsMagn         13.2
	SlopeParam      3.23
	AlbedoBond      0.0297
	AlbedoGeom      0.0356
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.521 0.474 0.411)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.365
		Randomize      (0.359, -0.484, 0.495)
		colorDistMagn   0.716
		colorDistFreq   2.29e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.72
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.107
		heightTempGrad  0.625
		beachWidth      0.00094
		tropicWidth     0.07
		mainFreq        0.753
		venusFreq       0.527
		venusMagn       0.749
		mareDensity     0
		terraceProb     0.127
		erosion         0
		montesMagn      0.418
		montesFreq      2.93
		montesSpiky     0.951
		montesFraction  0.591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.51e-06
		hillsFraction   0.757
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.192
		craterDensity   0.768
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481
		volcanoTemp     264
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0806
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00514
		DustBright  0.0348
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          23.7890326
		SemiMajorAxis   5.41839466
		Eccentricity    0.9732014
		Inclination     156.41559
		AscendingNode   -15.3166991
		ArgOfPericenter -103.570551
		MeanAnomaly     33.6950194
	}
}

Comet	"C123"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.08522084e-15
	Radius          0.141637787
	InertiaMoment   0.39761582
	Oblateness      0.00233535143
	RotationPeriod  74.325634
	RotationEpoch   0
	Obliquity       349.955505
	EqAscendNode    85.0843277

	AbsMagn         6.29
	SlopeParam      2.85
	AlbedoBond      0.0354
	AlbedoGeom      0.0425
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.598 0.484 0.400)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.236
		Randomize      (0.944, 0.518, 0.482)
		colorDistMagn   0.975
		colorDistFreq   1.11e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.999
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.181
		heightTempGrad  0.625
		beachWidth      0.000398
		tropicWidth     0.07
		mainFreq        0.608
		venusFreq       0.61
		venusMagn       0.603
		mareDensity     0
		terraceProb     0.194
		erosion         0
		montesMagn      0.527
		montesFreq      2.55
		montesSpiky     0.994
		montesFraction  0.726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.83e-05
		hillsFraction   0.497
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19
		craterFreq      0.181
		craterDensity   0.94
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561
		volcanoTemp     280
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.211
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00495
		GasToDust   0.25
		Particles   1079
		GasBright   0.015
		DustBright  0.0246
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.1606682
		SemiMajorAxis   5.47468003
		Eccentricity    0.940733369
		Inclination     -82.6461739
		AscendingNode   -97.5954119
		ArgOfPericenter 81.9412987
		MeanAnomaly     -134.730357
	}
}

Comet	"C26"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.80149708e-08
	Radius          23.811182
	InertiaMoment   0.399264365
	RotationPeriod  119.889999
	RotationEpoch   0
	Obliquity       172.706009
	EqAscendNode    177.245422

	AbsMagn         8.91
	SlopeParam      6.84
	AlbedoBond      0.0432
	AlbedoGeom      0.0518
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.745 0.742 0.739)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.492
		Randomize      (-0.041, 0.289, 0.473)
		colorDistMagn   0.329
		colorDistFreq   0.292
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.958
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.414
		heightTempGrad  0.625
		beachWidth      0.00147
		tropicWidth     0.07
		mainFreq        0.744
		venusFreq       0.672
		venusMagn       0.748
		mareDensity     0
		terraceProb     0.222
		erosion         0
		montesMagn      0.53
		montesFreq      3.28
		montesSpiky     0.936
		montesFraction  0.22
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49
		hillsFraction   0.607
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.257
		craterFreq      0.264
		craterDensity   0.875
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.374
		volcanoTemp     308
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0908
		GasToDust   0.25
		Particles   2813
		GasBright   0.0127
		DustBright  0.0267
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.4809454
		SemiMajorAxis   5.52295583
		Eccentricity    0.967582489
		Inclination     113.581552
		AscendingNode   18.5291574
		ArgOfPericenter 50.6377144
		MeanAnomaly     -53.4120871
	}
}

Comet	"C109"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.83917438e-17
	Radius          0.0292646103
	InertiaMoment   0.399213731
	Oblateness      0.0381456837
	RotationPeriod  18.4460421
	RotationEpoch   0
	Obliquity       272.414368
	EqAscendNode    272.818909

	AbsMagn         10.8
	SlopeParam      4.38
	AlbedoBond      0.0346
	AlbedoGeom      0.0415
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.429 0.427 0.424)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.758
		Randomize      (0.513, -0.649, 0.151)
		colorDistMagn   0.513
		colorDistFreq   6.42e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.961
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.235
		heightTempGrad  0.625
		beachWidth      0.000788
		tropicWidth     0.07
		mainFreq        0.344
		venusFreq       0.599
		venusMagn       0.578
		mareDensity     0
		terraceProb     0.241
		erosion         0
		montesMagn      0.469
		montesFreq      2.87
		montesSpiky     0.88
		montesFraction  0.606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08e-06
		hillsFraction   0.723
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.218
		craterFreq      0.22
		craterDensity   0.828
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444
		volcanoTemp     231
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0333
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0029
		DustBright  0.0301
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.6061691
		SemiMajorAxis   5.54177364
		Eccentricity    0.959180003
		Inclination     -59.1189569
		AscendingNode   23.257913
		ArgOfPericenter 142.578857
		MeanAnomaly     116.794403
	}
}

Comet	"C162"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.37437756e-16
	Radius          0.0648210049
	InertiaMoment   0.396628737
	Oblateness      0.00126437901
	RotationPeriod  77.5990677
	RotationEpoch   0
	Obliquity       205.963058
	EqAscendNode    307.823669

	AbsMagn         5.71
	SlopeParam      2.66
	AlbedoBond      0.0529
	AlbedoGeom      0.0635
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.477 0.472 0.465)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.855
		Randomize      (0.144, 0.198, 0.547)
		colorDistMagn   0.394
		colorDistFreq   1.79e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.813
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.459
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        0.622
		venusFreq       0.502
		venusMagn       0.604
		mareDensity     0
		terraceProb     0.263
		erosion         0
		montesMagn      0.459
		montesFreq      2.85
		montesSpiky     0.884
		montesFraction  0.533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12e-05
		hillsFraction   0.612
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.263
		craterFreq      0.175
		craterDensity   0.954
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572
		volcanoTemp     217
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0872
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0123
		DustBright  0.0287
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.652235
		SemiMajorAxis   5.5486881
		Eccentricity    0.978592422
		Inclination     -120.282223
		AscendingNode   -122.271975
		ArgOfPericenter -114.635561
		MeanAnomaly     8.38979859
	}
}

Comet	"C104"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.71758355e-10
	Radius          7.18502808
	InertiaMoment   0.398422629
	Oblateness      0.116121627
	RotationPeriod  8.01872635
	RotationEpoch   0
	Obliquity       244.721085
	EqAscendNode    262.724121

	AbsMagn         7.87
	SlopeParam      6.15
	AlbedoBond      0.0478
	AlbedoGeom      0.0574
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.689 0.687 0.684)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.73
		Randomize      (0.360, -0.351, 0.604)
		colorDistMagn   0.881
		colorDistFreq   0.00759
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.691
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.169
		heightTempGrad  0.625
		beachWidth      0.00097
		tropicWidth     0.07
		mainFreq        0.288
		venusFreq       0.646
		venusMagn       0.751
		mareDensity     0
		terraceProb     0.378
		erosion         0
		montesMagn      0.364
		montesFreq      2.39
		montesSpiky     0.842
		montesFraction  0.463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119
		hillsFraction   0.861
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.254
		craterDensity   0.901
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429
		volcanoTemp     393
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.8
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0712
		GasToDust   0.25
		Particles   2418
		GasBright   0.00682
		DustBright  0.0353
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.7415079
		SemiMajorAxis   5.56207563
		Eccentricity    0.961181928
		Inclination     158.378364
		AscendingNode   70.8045816
		ArgOfPericenter 1.14935883
		MeanAnomaly     -178.503683
	}
}

Comet	"C135"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.17429103e-10
	Radius          6.66336107
	InertiaMoment   0.397778392
	Oblateness      0.0302250981
	RotationPeriod  20.6515074
	RotationEpoch   0
	Obliquity       56.4193764
	EqAscendNode    181.311813

	AbsMagn         6.93
	SlopeParam      2.79
	AlbedoBond      0.0361
	AlbedoGeom      0.0433
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.680 0.675 0.670)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.504
		Randomize      (-0.687, -0.195, 0.194)
		colorDistMagn   0.403
		colorDistFreq   0.0288
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.762
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        0.355
		venusFreq       0.641
		venusMagn       0.579
		mareDensity     0
		terraceProb     0.459
		erosion         0
		montesMagn      0.507
		montesFreq      3.54
		montesSpiky     0.921
		montesFraction  0.658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0828
		hillsFraction   0.672
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.206
		craterFreq      0.179
		craterDensity   0.924
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546
		volcanoTemp     212
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.48
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.067
		GasToDust   0.25
		Particles   2334
		GasBright   0.00682
		DustBright  0.0271
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          24.875026
		SemiMajorAxis   5.58206826
		Eccentricity    0.9619669
		Inclination     105.544975
		AscendingNode   173.844429
		ArgOfPericenter 122.690248
		MeanAnomaly     -89.5673013
	}
}

Comet	"C35"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.08573395e-10
	Radius          5.08109093
	InertiaMoment   0.399970114
	Oblateness      0.00203989539
	RotationPeriod  54.2676773
	RotationEpoch   0
	Obliquity       222.553894
	EqAscendNode    339.416046

	AbsMagn         12.8
	SlopeParam      6.74
	AlbedoBond      0.0293
	AlbedoGeom      0.0352
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.677 0.674 0.672)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.943
		Randomize      (0.236, -0.247, -0.742)
		colorDistMagn   0.325
		colorDistFreq   0.0114
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.99
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.294
		heightTempGrad  0.625
		beachWidth      0.000966
		tropicWidth     0.07
		mainFreq        0.52
		venusFreq       0.579
		venusMagn       0.661
		mareDensity     0
		terraceProb     0.294
		erosion         0
		montesMagn      0.515
		montesFreq      2.62
		montesSpiky     0.848
		montesFraction  0.862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.078
		hillsFraction   0.321
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.211
		craterFreq      0.262
		craterDensity   0.779
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527
		volcanoTemp     310
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0668
		GasToDust   0.25
		Particles   2329
		GasBright   0.00285
		DustBright  0.0123
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.0045811
		SemiMajorAxis   5.6014333
		Eccentricity    0.948871288
		Inclination     74.6048447
		AscendingNode   74.1127454
		ArgOfPericenter -37.4281255
		MeanAnomaly     -165.685857
	}
}

Comet	"C126"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.87798594e-08
	Radius          29.4201679
	InertiaMoment   0.399978906
	Oblateness      0.00358474231
	RotationPeriod  60.1089134
	RotationEpoch   0
	Obliquity       6.5714817
	EqAscendNode    19.1411972

	AbsMagn         2.91
	SlopeParam      2.84
	AlbedoBond      0.0495
	AlbedoGeom      0.0594
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.745 0.743 0.741)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0532
		Randomize      (-0.963, 0.340, -0.590)
		colorDistMagn   0.406
		colorDistFreq   0.636
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.461
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.141
		heightTempGrad  0.625
		beachWidth      0.00143
		tropicWidth     0.07
		mainFreq        0.546
		venusFreq       0.585
		venusMagn       0.664
		mareDensity     0
		terraceProb     0.344
		erosion         0
		montesMagn      0.522
		montesFreq      2.81
		montesSpiky     0.977
		montesFraction  0.707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7
		hillsFraction   0.936
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.181
		craterDensity   1.02
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442
		volcanoTemp     420
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.091
		GasToDust   0.25
		Particles   2818
		GasBright   0.0061
		DustBright  0.0121
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.1221702
		SemiMajorAxis   5.61898082
		Eccentricity    0.958929559
		Inclination     -22.2870206
		AscendingNode   61.990134
		ArgOfPericenter -67.236487
		MeanAnomaly     71.5239388
	}
}

Comet	"C113"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.46191521e-12
	Radius          1.62121618
	InertiaMoment   0.399243832
	Oblateness      0.0021162841
	RotationPeriod  59.2583656
	RotationEpoch   0
	Obliquity       294.56897
	EqAscendNode    64.8947525

	AbsMagn         11.1
	SlopeParam      6.09
	AlbedoBond      0.0348
	AlbedoGeom      0.0418
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.624 0.616 0.613)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.18
		Randomize      (0.636, -0.887, -0.612)
		colorDistMagn   0.879
		colorDistFreq   0.00209
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.448
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        0.542
		venusFreq       0.563
		venusMagn       0.663
		mareDensity     0
		terraceProb     0.53
		erosion         0
		montesMagn      0.305
		montesFreq      3.15
		montesSpiky     0.964
		montesFraction  0.416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00668
		hillsFraction   0.662
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.257
		craterFreq      0.253
		craterDensity   0.821
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538
		volcanoTemp     255
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.45
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0472
		GasToDust   0.25
		Particles   1934
		GasBright   0.000503
		DustBright  0.0173
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.1596951
		SemiMajorAxis   5.62457479
		Eccentricity    0.968099474
		Inclination     53.9007278
		AscendingNode   -6.06322752
		ArgOfPericenter -68.8084482
		MeanAnomaly     -17.2449732
	}
}

Comet	"C168"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.08962589e-13
	Radius          0.529503286
	InertiaMoment   0.39897579
	Oblateness      0.00517904852
	RotationPeriod  50.0344048
	RotationEpoch   0
	Obliquity       239.194977
	EqAscendNode    175.937424

	AbsMagn         11.5
	SlopeParam      2.63
	AlbedoBond      0.0536
	AlbedoGeom      0.0643
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.564 0.560 0.554)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.489
		Randomize      (0.329, -0.159, 0.403)
		colorDistMagn   0.961
		colorDistFreq   0.000222
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.384
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.378
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        0.5
		venusFreq       0.617
		venusMagn       0.728
		mareDensity     0
		terraceProb     0.192
		erosion         0
		montesMagn      0.448
		montesFreq      3.29
		montesSpiky     0.998
		montesFraction  0.506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000816
		hillsFraction   0.508
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.174
		craterDensity   0.811
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486
		volcanoTemp     78.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.557
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0262
		GasToDust   0.25
		Particles   1509
		GasBright   0.00801
		DustBright  0.0301
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.4041797
		SemiMajorAxis   5.6609532
		Eccentricity    0.988517908
		Inclination     -143.395449
		AscendingNode   175.102193
		ArgOfPericenter -56.7133783
		MeanAnomaly     -111.106229
	}
}

Comet	"C122"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.32368574e-14
	Radius          0.348161161
	InertiaMoment   0.399950951
	Oblateness      0.0166565906
	RotationPeriod  19.5621157
	RotationEpoch   0
	Obliquity       344.41687
	EqAscendNode    227.065369

	AbsMagn         2.41
	SlopeParam      6.03
	AlbedoBond      0.0491
	AlbedoGeom      0.059
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.555 0.549 0.546)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.631
		Randomize      (0.913, 0.578, 0.173)
		colorDistMagn   0.876
		colorDistFreq   8.44e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.368
		icecapLatitude  0.898
		icecapHeight    0.0659
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.328
		heightTempGrad  0.625
		beachWidth      0.000854
		tropicWidth     0.07
		mainFreq        0.35
		venusFreq       0.618
		venusMagn       0.578
		mareDensity     0
		terraceProb     0.148
		erosion         0
		montesMagn      0.656
		montesFreq      2.43
		montesSpiky     0.902
		montesFraction  0.361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000346
		hillsFraction   0.521
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.213
		craterFreq      0.252
		craterDensity   1.03
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497
		volcanoTemp     186
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.557
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0233
		GasToDust   0.25
		Particles   1450
		GasBright   0.0132
		DustBright  0.0203
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.4510808
		SemiMajorAxis   5.66791853
		Eccentricity    0.94697368
		Inclination     -8.18091997
		AscendingNode   99.1723141
		ArgOfPericenter 121.155124
		MeanAnomaly     -61.4654196
	}
}

Comet	"C73"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.02357944e-09
	Radius          11.1647377
	InertiaMoment   0.398933738
	Oblateness      0.00119401712
	RotationPeriod  104.088318
	RotationEpoch   0
	Obliquity       73.0227814
	EqAscendNode    344.136444

	AbsMagn         8.79
	SlopeParam      4.53
	AlbedoBond      0.0323
	AlbedoGeom      0.0388
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.767 0.685 0.630)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.956
		Randomize      (-0.594, -0.507, -0.986)
		colorDistMagn   0.523
		colorDistFreq   0.0562
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.556
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.318
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.711
		venusFreq       0.652
		venusMagn       0.643
		mareDensity     0
		terraceProb     0.319
		erosion         0
		montesMagn      0.532
		montesFreq      2.83
		montesSpiky     0.975
		montesFraction  0.843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.336
		hillsFraction   0.584
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2
		craterFreq      0.223
		craterDensity   0.878
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478
		volcanoTemp     154
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.6
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0754
		GasToDust   0.25
		Particles   2502
		GasBright   0.00127
		DustBright  0.00901
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.6989344
		SemiMajorAxis   5.70465683
		Eccentricity    0.961810817
		Inclination     47.3124795
		AscendingNode   9.91445286
		ArgOfPericenter 179.634582
		MeanAnomaly     56.9676921
	}
}

Comet	"C12"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.58893565e-10
	Radius          4.50643253
	InertiaMoment   0.39728114
	Oblateness      0.00335467979
	RotationPeriod  40.2921267
	RotationEpoch   0
	Obliquity       95.1648407
	EqAscendNode    4.98002148

	AbsMagn         -0.00502
	SlopeParam      3.35
	AlbedoBond      0.0424
	AlbedoGeom      0.0509
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.673 0.670 0.668)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0138
		Randomize      (-0.471, -0.878, 0.142)
		colorDistMagn   0.723
		colorDistFreq   0.0142
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.85
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.469
		heightTempGrad  0.625
		beachWidth      0.00126
		tropicWidth     0.07
		mainFreq        0.453
		venusFreq       0.65
		venusMagn       0.722
		mareDensity     0
		terraceProb     0.27
		erosion         0
		montesMagn      0.472
		montesFreq      3.72
		montesSpiky     0.975
		montesFraction  0.733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0455
		hillsFraction   0.372
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.268
		craterFreq      0.195
		craterDensity   1.08
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466
		volcanoTemp     328
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.92
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0654
		GasToDust   0.25
		Particles   2300
		GasBright   0.000999
		DustBright  0.0318
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.752836
		SemiMajorAxis   5.71263078
		Eccentricity    0.962295284
		Inclination     -55.3785765
		AscendingNode   139.891834
		ArgOfPericenter 139.567374
		MeanAnomaly     68.5644129
	}
}

Comet	"C25"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.46328238e-07
	Radius          90.2592773
	InertiaMoment   0.398523033
	Oblateness      0.00756356446
	RotationPeriod  41.115778
	RotationEpoch   0
	Obliquity       167.167358
	EqAscendNode    319.226471

	AbsMagn         6.31
	SlopeParam      4.73
	AlbedoBond      0.0284
	AlbedoGeom      0.0341
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.797 0.795 0.792)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.887
		Randomize      (-0.071, 0.348, 0.164)
		colorDistMagn   0.197
		colorDistFreq   5.31
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.184
		icecapLatitude  0.609
		icecapHeight    0.321
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.161
		heightTempGrad  0.625
		beachWidth      0.000731
		tropicWidth     0.07
		mainFreq        0.457
		venusFreq       0.715
		venusMagn       0.722
		mareDensity     0
		terraceProb     0.175
		erosion         0
		montesMagn      0.666
		montesFreq      3.2
		montesSpiky     0.987
		montesFraction  0.49
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.1
		hillsFraction   0.621
		hills2Fraction  0
		eqridgeMagn     0.41
		eqridgeWidth    0.125
		eqridgeModMagn  0.487
		eqridgeModFreq  0.297
		canyonsFraction 0
		craterMagn      0.263
		craterFreq      0.289
		craterDensity   0.939
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478
		volcanoTemp     216
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     210
		OuterRadius     1.73e+03
		EdgeRadius      520
		MeanRadius      313
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     520
		RotationPeriod  26.1
		Brightness      1
		FrontBright     2.66
		BackBright      4.79
		Density         0.983
		Opacity         0.983
		SelfShadow      0.983
		PlanetShadow    0.983
		Hapke           1
		SpotBright      2.39
		SpotWidth       0.0219
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.18
		densityScale    1.52
		densityOffset   -0.491
		densityPower    4.97
		colorContrast   0.0782
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0112
		DustBright  0.0221
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          25.8243075
		SemiMajorAxis   5.72319535
		Eccentricity    0.965987071
		Inclination     160.140079
		AscendingNode   -69.7870179
		ArgOfPericenter 129.063253
		MeanAnomaly     175.567942
	}
}

Comet	"C38"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.47827517e-15
	Radius          0.216799602
	InertiaMoment   0.399353325
	Oblateness      0.00738375168
	RotationPeriod  41.9358416
	RotationEpoch   0
	Obliquity       239.169876
	EqAscendNode    273.472931

	AbsMagn         9.54
	SlopeParam      6.71
	AlbedoBond      0.0438
	AlbedoGeom      0.0526
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.579 0.510 0.457)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.76
		Randomize      (0.329, -0.425, 0.186)
		colorDistMagn   0.626
		colorDistFreq   2.86e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.918
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.254
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.461
		venusFreq       0.546
		venusMagn       0.723
		mareDensity     0
		terraceProb     0.543
		erosion         0
		montesMagn      0.509
		montesFreq      2.86
		montesSpiky     1
		montesFraction  0.824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000163
		hillsFraction   0.78
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.262
		craterDensity   0.86
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578
		volcanoTemp     240
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.247
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0118
		GasToDust   0.25
		Particles   1218
		GasBright   0.00485
		DustBright  0.0289
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.0237895
		SemiMajorAxis   5.7526304
		Eccentricity    0.958203675
		Inclination     172.286228
		AscendingNode   -100.846601
		ArgOfPericenter -83.4800386
		MeanAnomaly     73.677927
	}
}

Comet	"C32"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.3158837e-17
	Radius          0.0316014886
	InertiaMoment   0.397597849
	Oblateness      0.00283916993
	RotationPeriod  67.4085045
	RotationEpoch   0
	Obliquity       205.937927
	EqAscendNode    45.3591728

	AbsMagn         3.37
	SlopeParam      6.77
	AlbedoBond      0.0435
	AlbedoGeom      0.0522
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.507 0.416 0.354)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.126
		Randomize      (0.144, -0.068, 0.330)
		colorDistMagn   0.903
		colorDistFreq   1.85e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.441
		icecapLatitude  0.856
		icecapHeight    0.0608
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.334
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.579
		venusFreq       0.604
		venusMagn       0.6
		mareDensity     0
		terraceProb     0.151
		erosion         0
		montesMagn      0.52
		montesFreq      2.19
		montesSpiky     0.888
		montesFraction  0.918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84e-06
		hillsFraction   0.5
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.263
		craterDensity   1.01
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497
		volcanoTemp     309
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0382
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00852
		DustBright  0.0281
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.0709958
		SemiMajorAxis   5.75958502
		Eccentricity    0.951298878
		Inclination     -179.706339
		AscendingNode   -169.106583
		ArgOfPericenter 150.320732
		MeanAnomaly     102.048178
	}
}

Comet	"C37"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.2678826e-13
	Radius          0.568341613
	InertiaMoment   0.398630977
	Oblateness      0.00134947477
	RotationPeriod  75.5040493
	RotationEpoch   0
	Obliquity       233.631226
	EqAscendNode    55.4539642

	AbsMagn         6.95
	SlopeParam      4.68
	AlbedoBond      0.0295
	AlbedoGeom      0.0354
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.573 0.569 0.567)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.154
		Randomize      (0.298, -0.366, -0.124)
		colorDistMagn   0.534
		colorDistFreq   0.000248
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.991
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4
		heightTempGrad  0.625
		beachWidth      0.000653
		tropicWidth     0.07
		mainFreq        0.613
		venusFreq       0.559
		venusMagn       0.701
		mareDensity     0
		terraceProb     0.42
		erosion         0
		montesMagn      0.612
		montesFreq      2.79
		montesSpiky     0.911
		montesFraction  0.431
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00104
		hillsFraction   0.809
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.267
		craterFreq      0.226
		craterDensity   0.923
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     287
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.755
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0302
		GasToDust   0.25
		Particles   1588
		GasBright   0.00437
		DustBright  0.0232
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.2777021
		SemiMajorAxis   5.78998853
		Eccentricity    0.944411917
		Inclination     64.5913223
		AscendingNode   -44.3121383
		ArgOfPericenter 23.0172202
		MeanAnomaly     -176.610116
	}
}

Comet	"C7"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.62256615e-14
	Radius          0.280665249
	InertiaMoment   0.399774134
	Oblateness      0.0116424449
	RotationPeriod  33.4225245
	RotationEpoch   0
	Obliquity       67.4715652
	EqAscendNode    354.885254

	AbsMagn         10.6
	SlopeParam      4.81
	AlbedoBond      0.0264
	AlbedoGeom      0.0316
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.535 0.531 0.526)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.986
		Randomize      (-0.625, -0.581, 0.595)
		colorDistMagn   0.206
		colorDistFreq   6.75e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.994
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.402
		heightTempGrad  0.625
		beachWidth      0.000847
		tropicWidth     0.07
		mainFreq        0.42
		venusFreq       0.552
		venusMagn       0.621
		mareDensity     0
		terraceProb     0.423
		erosion         0
		montesMagn      0.371
		montesFreq      3.18
		montesSpiky     0.96
		montesFraction  0.57
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000166
		hillsFraction   0.548
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.229
		craterDensity   0.833
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457
		volcanoTemp     281
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.367
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.016
		GasToDust   0.25
		Particles   1302
		GasBright   0.00439
		DustBright  0.0375
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.3956752
		SemiMajorAxis   5.80730493
		Eccentricity    0.959296914
		Inclination     -152.51499
		AscendingNode   -128.032274
		ArgOfPericenter -35.2200654
		MeanAnomaly     -34.3227649
	}
}

Comet	"C65"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.91525182e-09
	Radius          15.8219175
	InertiaMoment   0.398868769
	Oblateness      0.248999998
	RotationPeriod  3.17629337
	RotationEpoch   0
	Obliquity       28.7135429
	EqAscendNode    39.9847794

	AbsMagn         8.38
	SlopeParam      6.46
	AlbedoBond      0.0317
	AlbedoGeom      0.0381
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.799 0.717 0.630)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.111
		Randomize      (-0.840, -0.031, 0.539)
		colorDistMagn   0.618
		colorDistFreq   0.0952
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.254
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.292
		heightTempGrad  0.625
		beachWidth      0.000472
		tropicWidth     0.07
		mainFreq        0.261
		venusFreq       0.584
		venusMagn       0.75
		mareDensity     0
		terraceProb     0.292
		erosion         0
		montesMagn      0.462
		montesFreq      3.68
		montesSpiky     0.977
		montesFraction  0.641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.615
		hillsFraction   0.699
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.258
		craterDensity   0.888
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413
		volcanoTemp     105
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.1
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.081
		GasToDust   0.25
		Particles   2616
		GasBright   0.00987
		DustBright  0.0309
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.3984788
		SemiMajorAxis   5.80771613
		Eccentricity    0.956004701
		Inclination     137.53834
		AscendingNode   -149.179844
		ArgOfPericenter 104.934264
		MeanAnomaly     -89.320001
	}
}

Comet	"C96"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.34361577e-09
	Radius          10.1647358
	InertiaMoment   0.398345202
	Oblateness      0.0247920454
	RotationPeriod  17.3008089
	RotationEpoch   0
	Obliquity       200.41185
	EqAscendNode    318.572479

	AbsMagn         7.46
	SlopeParam      2.98
	AlbedoBond      0.0473
	AlbedoGeom      0.0567
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.706 0.702 0.699)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.885
		Randomize      (0.113, 0.125, 0.129)
		colorDistMagn   0.984
		colorDistFreq   0.0841
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.466
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.143
		heightTempGrad  0.625
		beachWidth      0.000422
		tropicWidth     0.07
		mainFreq        0.338
		venusFreq       0.58
		venusMagn       0.577
		mareDensity     0
		terraceProb     0.346
		erosion         0
		montesMagn      0.581
		montesFreq      3.21
		montesSpiky     0.849
		montesFraction  0.267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.215
		hillsFraction   0.579
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.185
		craterDensity   0.911
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54
		volcanoTemp     345
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.2
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0768
		GasToDust   0.25
		Particles   2532
		GasBright   0.00916
		DustBright  0.0234
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.6074814
		SemiMajorAxis   5.83832981
		Eccentricity    0.952043411
		Inclination     -9.6640508
		AscendingNode   -89.1684071
		ArgOfPericenter 2.19157674
		MeanAnomaly     139.263442
	}
}

Comet	"C111"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.02324315e-09
	Radius          15.1134472
	InertiaMoment   0.397435725
	Oblateness      0.00402231608
	RotationPeriod  40.2059669
	RotationEpoch   0
	Obliquity       283.491669
	EqAscendNode    348.856842

	AbsMagn         5.6
	SlopeParam      2.91
	AlbedoBond      0.0347
	AlbedoGeom      0.0416
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.724 0.722 0.721)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.969
		Randomize      (0.575, -0.768, 0.770)
		colorDistMagn   0.696
		colorDistFreq   0.105
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.99
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.342
		heightTempGrad  0.625
		beachWidth      0.000775
		tropicWidth     0.07
		mainFreq        0.453
		venusFreq       0.582
		venusMagn       0.624
		mareDensity     0
		terraceProb     0.345
		erosion         0
		montesMagn      0.55
		montesFreq      3.01
		montesSpiky     0.929
		montesFraction  0.827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.567
		hillsFraction   0.691
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.277
		craterFreq      0.183
		craterDensity   0.956
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585
		volcanoTemp     278
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0839
		GasToDust   0.25
		Particles   2675
		GasBright   0.00264
		DustBright  0.0428
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.6236718
		SemiMajorAxis   5.84069795
		Eccentricity    0.954739508
		Inclination     -5.2228414
		AscendingNode   174.905149
		ArgOfPericenter -82.7045071
		MeanAnomaly     5.36054157
	}
}

Comet	"C82"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.18507782e-11
	Radius          2.52709222
	InertiaMoment   0.399670184
	Oblateness      0.00500955805
	RotationPeriod  50.9276276
	RotationEpoch   0
	Obliquity       122.870674
	EqAscendNode    146.307053

	AbsMagn         12.5
	SlopeParam      4.49
	AlbedoBond      0.0464
	AlbedoGeom      0.0557
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.686 0.623 0.575)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.406
		Randomize      (-0.317, 0.957, -0.202)
		colorDistMagn   0.521
		colorDistFreq   0.00234
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.956
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.197
		heightTempGrad  0.625
		beachWidth      0.000812
		tropicWidth     0.07
		mainFreq        0.504
		venusFreq       0.568
		venusMagn       0.545
		mareDensity     0
		terraceProb     0.417
		erosion         0
		montesMagn      0.516
		montesFreq      3.57
		montesSpiky     0.917
		montesFraction  0.757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0207
		hillsFraction   0.826
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.222
		craterDensity   0.785
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407
		volcanoTemp     295
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.85
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0514
		GasToDust   0.25
		Particles   2018
		GasBright   0.0127
		DustBright  0.0133
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.8275275
		SemiMajorAxis   5.87047459
		Eccentricity    0.974127734
		Inclination     -118.934193
		AscendingNode   -172.684292
		ArgOfPericenter 83.5458844
		MeanAnomaly     -101.867322
	}
}

Comet	"C69"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.44666092e-15
	Radius          0.134197429
	InertiaMoment   0.398901403
	Oblateness      0.00265565561
	RotationPeriod  50.1187305
	RotationEpoch   0
	Obliquity       50.8681641
	EqAscendNode    192.060608

	AbsMagn         8.59
	SlopeParam      3.1
	AlbedoBond      0.032
	AlbedoGeom      0.0384
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.513 0.503 0.500)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.534
		Randomize      (-0.717, -0.269, -0.224)
		colorDistMagn   0.993
		colorDistFreq   7.51e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.795
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.105
		heightTempGrad  0.625
		beachWidth      0.000447
		tropicWidth     0.07
		mainFreq        0.5
		venusFreq       0.539
		venusMagn       0.544
		mareDensity     0
		terraceProb     0.126
		erosion         0
		montesMagn      0.699
		montesFreq      2.46
		montesSpiky     0.899
		montesFraction  0.455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.62e-05
		hillsFraction   0.641
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.189
		craterDensity   0.883
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524
		volcanoTemp     339
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.215
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00765
		GasToDust   0.25
		Particles   1134
		GasBright   0.00466
		DustBright  0.0209
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          26.9177651
		SemiMajorAxis   5.88363126
		Eccentricity    0.971566517
		Inclination     156.607496
		AscendingNode   97.0513168
		ArgOfPericenter -171.953787
		MeanAnomaly     -52.2177051
	}
}

Comet	"C23"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.00028292e-15
	Radius          0.139687836
	InertiaMoment   0.39988628
	Oblateness      0.0336054079
	RotationPeriod  19.6769829
	RotationEpoch   0
	Obliquity       156.090042
	EqAscendNode    243.188553

	AbsMagn         11.7
	SlopeParam      6.87
	AlbedoBond      0.0282
	AlbedoGeom      0.0338
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.625 0.468 0.371)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.676
		Randomize      (-0.133, 0.467, -0.455)
		colorDistMagn   0.906
		colorDistFreq   6.37e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.561
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.455
		heightTempGrad  0.625
		beachWidth      0.00104
		tropicWidth     0.07
		mainFreq        0.35
		venusFreq       0.541
		venusMagn       0.68
		mareDensity     0
		terraceProb     0.546
		erosion         0
		montesMagn      0.536
		montesFreq      3.06
		montesSpiky     0.955
		montesFraction  0.263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.95e-05
		hillsFraction   0.649
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.204
		craterFreq      0.264
		craterDensity   0.806
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537
		volcanoTemp     237
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.169
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00473
		GasToDust   0.25
		Particles   1075
		GasBright   0.00767
		DustBright  0.0132
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.0827231
		SemiMajorAxis   5.90764422
		Eccentricity    0.942016776
		Inclination     -11.9590779
		AscendingNode   100.823911
		ArgOfPericenter -73.7520739
		MeanAnomaly     74.180985
	}
}

Comet	"C156"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.62488641e-07
	Radius          55.9308624
	InertiaMoment   0.398879051
	Oblateness      0.0346510522
	RotationPeriod  13.5274057
	RotationEpoch   0
	Obliquity       172.731125
	EqAscendNode    79.7099304

	AbsMagn         10.7
	SlopeParam      2.69
	AlbedoBond      0.0522
	AlbedoGeom      0.0627
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.784 0.783 0.782)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.221
		Randomize      (-0.040, 0.555, 0.691)
		colorDistMagn   0.683
		colorDistFreq   2.1
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.837
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.139
		heightTempGrad  0.625
		beachWidth      0.000934
		tropicWidth     0.07
		mainFreq        0.318
		venusFreq       0.59
		venusMagn       0.754
		mareDensity     0
		terraceProb     0.343
		erosion         0
		montesMagn      0.47
		montesFreq      2.15
		montesSpiky     0.934
		montesFraction  0.56
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.78
		hillsFraction   0.698
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.176
		craterDensity   0.831
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495
		volcanoTemp     356
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     167
		OuterRadius     716
		EdgeRadius      220
		MeanRadius      185
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     220
		RotationPeriod  14.5
		Brightness      1
		FrontBright     2.95
		BackBright      4.17
		Density         0.968
		Opacity         0.968
		SelfShadow      0.968
		PlanetShadow    0.968
		Hapke           1
		SpotBright      2.28
		SpotWidth       0.0312
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.23
		densityScale    1.49
		densityOffset   -0.387
		densityPower    5.01
		colorContrast   0.0553
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.017
		DustBright  0.0268
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.1445939
		SemiMajorAxis   5.9166382
		Eccentricity    0.949736686
		Inclination     -49.5495945
		AscendingNode   -93.8519691
		ArgOfPericenter -103.963209
		MeanAnomaly     -154.746799
	}
}

Comet	"C151"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.68044927e-11
	Radius          3.31703377
	InertiaMoment   0.3979747
	RotationPeriod  138.511528
	RotationEpoch   0
	Obliquity       145.037857
	EqAscendNode    69.6151428

	AbsMagn         7.76
	SlopeParam      4.21
	AlbedoBond      0.0369
	AlbedoGeom      0.0443
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.646 0.644 0.640)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.193
		Randomize      (-0.194, 0.853, -0.856)
		colorDistMagn   0.136
		colorDistFreq   0.00893
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.964
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.473
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        0.761
		venusFreq       0.633
		venusMagn       0.645
		mareDensity     0
		terraceProb     0.695
		erosion         0
		montesMagn      0.367
		montesFreq      3.36
		montesSpiky     0.915
		montesFraction  0.409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0259
		hillsFraction   0.798
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.216
		craterDensity   0.904
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488
		volcanoTemp     309
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.59
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0558
		GasToDust   0.25
		Particles   2107
		GasBright   0.00597
		DustBright  0.00692
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.1457431
		SemiMajorAxis   5.91680519
		Eccentricity    0.947850905
		Inclination     95.9946851
		AscendingNode   -1.80500144
		ArgOfPericenter 174.960242
		MeanAnomaly     -178.762526
	}
}

Comet	"C93"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.49188006e-16
	Radius          0.0510062873
	InertiaMoment   0.399091512
	Oblateness      0.00804188941
	RotationPeriod  32.449894
	RotationEpoch   0
	Obliquity       183.795883
	EqAscendNode    24.5155945

	AbsMagn         9.86
	SlopeParam      2.99
	AlbedoBond      0.0336
	AlbedoGeom      0.0403
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.464 0.457 0.453)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0681
		Randomize      (0.021, 0.303, -0.799)
		colorDistMagn   0.701
		colorDistFreq   1.58e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.992
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.183
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        0.415
		venusFreq       0.605
		venusMagn       0.851
		mareDensity     0
		terraceProb     0.196
		erosion         0
		montesMagn      0.589
		montesFreq      2.99
		montesSpiky     0.888
		montesFraction  0.299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.15e-06
		hillsFraction   0.623
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.185
		craterDensity   0.852
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507
		volcanoTemp     274
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0691
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00457
		DustBright  0.00945
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.4108658
		SemiMajorAxis   5.95526762
		Eccentricity    0.945979877
		Inclination     -99.989562
		AscendingNode   159.285322
		ArgOfPericenter -113.732484
		MeanAnomaly     -157.963905
	}
}

Comet	"C102"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.33869246e-07
	Radius          70.2761307
	InertiaMoment   0.399811029
	Oblateness      0.0011562712
	RotationPeriod  81.2665958
	RotationEpoch   0
	Obliquity       233.643768
	EqAscendNode    186.686218

	AbsMagn         15.7
	SlopeParam      2.95
	AlbedoBond      0.0477
	AlbedoGeom      0.0572
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.793 0.790 0.789)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.519
		Randomize      (0.298, -0.232, -0.015)
		colorDistMagn   0.698
		colorDistFreq   2.64
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.943
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.463
		heightTempGrad  0.625
		beachWidth      0.00128
		tropicWidth     0.07
		mainFreq        0.636
		venusFreq       0.683
		venusMagn       0.703
		mareDensity     0
		terraceProb     0.266
		erosion         0
		montesMagn      0.568
		montesFreq      1.19
		montesSpiky     0.983
		montesFraction  0.159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.1
		hillsFraction   0.438
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.184
		craterDensity   0.705
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467
		volcanoTemp     276
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     122
		OuterRadius     371
		EdgeRadius      149
		MeanRadius      131
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     149
		RotationPeriod  6.62
		Brightness      1
		FrontBright     2.65
		BackBright      4.5
		Density         0.969
		Opacity         0.969
		SelfShadow      0.969
		PlanetShadow    0.969
		Hapke           1
		SpotBright      2.34
		SpotWidth       0.0383
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.35
		densityScale    1.39
		densityOffset   -0.274
		densityPower    4.87
		colorContrast   0.147
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0057
		DustBright  0.024
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.441746
		SemiMajorAxis   5.95973945
		Eccentricity    0.985593272
		Inclination     19.9697367
		AscendingNode   -29.0335016
		ArgOfPericenter -144.227374
		MeanAnomaly     -24.0415778
	}
}

Comet	"C141"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.02103975e-08
	Radius          45.6287804
	InertiaMoment   0.399450123
	Oblateness      0.00177804276
	RotationPeriod  85.1730537
	RotationEpoch   0
	Obliquity       89.6512985
	EqAscendNode    49.4255638

	AbsMagn         13.7
	SlopeParam      2.77
	AlbedoBond      0.0364
	AlbedoGeom      0.0437
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.821 0.761 0.705)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.137
		Randomize      (-0.502, -0.552, 0.051)
		colorDistMagn   0.97
		colorDistFreq   0.839
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.98
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.651
		venusFreq       0.587
		venusMagn       0.704
		mareDensity     0
		terraceProb     0.344
		erosion         0
		montesMagn      0.496
		montesFreq      2.58
		montesSpiky     0.861
		montesFraction  0.628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.33
		hillsFraction   0.586
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.178
		craterDensity   0.757
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472
		volcanoTemp     143
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0981
		GasToDust   0.25
		Particles   2961
		GasBright   0.00347
		DustBright  0.0275
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          27.9555328
		SemiMajorAxis   6.03389798
		Eccentricity    0.97015578
		Inclination     -53.8384706
		AscendingNode   124.791809
		ArgOfPericenter -109.629546
		MeanAnomaly     84.2100374
	}
}

Comet	"C5"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.49225025e-11
	Radius          2.72885013
	InertiaMoment   0.398332804
	Oblateness      0.193465874
	RotationPeriod  8.17433453
	RotationEpoch   0
	Obliquity       56.3942604
	EqAscendNode    278.847321

	AbsMagn         5.12
	SlopeParam      7.09
	AlbedoBond      0.0261
	AlbedoGeom      0.0313
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.711 0.607 0.558)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.775
		Randomize      (-0.687, -0.462, -0.023)
		colorDistMagn   0.911
		colorDistFreq   0.00369
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.865
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.296
		heightTempGrad  0.625
		beachWidth      0.00086
		tropicWidth     0.07
		mainFreq        0.289
		venusFreq       0.573
		venusMagn       0.573
		mareDensity     0
		terraceProb     0.295
		erosion         0
		montesMagn      0.571
		montesFreq      3.04
		montesSpiky     0.923
		montesFraction  0.405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0152
		hillsFraction   0.581
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.267
		craterDensity   0.968
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484
		volcanoTemp     234
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.27
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0527
		GasToDust   0.25
		Particles   2043
		GasBright   0.00397
		DustBright  0.0256
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.0733045
		SemiMajorAxis   6.05083259
		Eccentricity    0.973190992
		Inclination     17.5806418
		AscendingNode   -177.166682
		ArgOfPericenter 33.291572
		MeanAnomaly     -61.1215447
	}
}

Comet	"C8"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.35036302e-16
	Radius          0.0900034681
	InertiaMoment   0.397209018
	Oblateness      0.00148102618
	RotationPeriod  93.2624245
	RotationEpoch   0
	Obliquity       73.0102234
	EqAscendNode    212.904175

	AbsMagn         18.3
	SlopeParam      7.05
	AlbedoBond      0.0422
	AlbedoGeom      0.0507
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.482 0.477 0.474)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.591
		Randomize      (-0.594, -0.640, 0.905)
		colorDistMagn   0.335
		colorDistFreq   5.38e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.548
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.256
		heightTempGrad  0.625
		beachWidth      0.00129
		tropicWidth     0.07
		mainFreq        0.679
		venusFreq       0.536
		venusMagn       0.641
		mareDensity     0
		terraceProb     0.549
		erosion         0
		montesMagn      0.565
		montesFreq      3.26
		montesSpiky     0.898
		montesFraction  0.387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73e-05
		hillsFraction   0.529
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.226
		craterFreq      0.266
		craterDensity   0.632
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513
		volcanoTemp     304
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0946
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00432
		DustBright  0.0438
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.1083821
		SemiMajorAxis   6.05587189
		Eccentricity    0.978876861
		Inclination     -95.3406169
		AscendingNode   -115.296682
		ArgOfPericenter 75.0867141
		MeanAnomaly     77.7936299
	}
}

Comet	"C116"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.95833303e-16
	Radius          0.0643816143
	InertiaMoment   0.398534536
	Oblateness      0.00590942195
	RotationPeriod  46.8055344
	RotationEpoch   0
	Obliquity       311.184937
	EqAscendNode    358.95163

	AbsMagn         8.48
	SlopeParam      6.07
	AlbedoBond      0.0487
	AlbedoGeom      0.0584
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.582 0.406 0.343)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.997
		Randomize      (0.729, 0.935, 0.316)
		colorDistMagn   0.295
		colorDistFreq   1.4e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.975
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.408
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        0.485
		venusFreq       0.51
		venusMagn       0.726
		mareDensity     0
		terraceProb     0.218
		erosion         0
		montesMagn      0.244
		montesFreq      3.4
		montesSpiky     0.946
		montesFraction  0.399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09e-05
		hillsFraction   0.62
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.252
		craterDensity   0.886
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.386
		volcanoTemp     255
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0705
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0176
		DustBright  0.0188
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.3724082
		SemiMajorAxis   6.09373523
		Eccentricity    0.971610668
		Inclination     78.4200004
		AscendingNode   96.0920284
		ArgOfPericenter 28.5785657
		MeanAnomaly     141.975618
	}
}

Comet	"C74"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.37522232e-11
	Radius          3.58185077
	InertiaMoment   0.39961341
	Oblateness      0.00403374294
	RotationPeriod  56.7419987
	RotationEpoch   0
	Obliquity       78.5614319
	EqAscendNode    202.155396

	AbsMagn         11.8
	SlopeParam      6.38
	AlbedoBond      0.0459
	AlbedoGeom      0.0551
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.724 0.653 0.570)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.562
		Randomize      (-0.564, -0.567, -0.677)
		colorDistMagn   0.616
		colorDistFreq   0.00352
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.489
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.171
		heightTempGrad  0.625
		beachWidth      0.000864
		tropicWidth     0.07
		mainFreq        0.531
		venusFreq       0.639
		venusMagn       0.662
		mareDensity     0
		terraceProb     0.38
		erosion         0
		montesMagn      0.445
		montesFreq      2.9
		montesSpiky     0.92
		montesFraction  0.599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.035
		hillsFraction   0.568
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.271
		craterFreq      0.257
		craterDensity   0.802
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533
		volcanoTemp     317
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.11
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.057
		GasToDust   0.25
		Particles   2132
		GasBright   0.00178
		DustBright  0.0147
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.5095191
		SemiMajorAxis   6.1133516
		Eccentricity    0.967540344
		Inclination     -127.360795
		AscendingNode   -142.685901
		ArgOfPericenter 76.2717094
		MeanAnomaly     92.0103281
	}
}

Comet	"C97"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.43052331e-11
	Radius          3.92176509
	InertiaMoment   0.399122357
	Oblateness      0.00248251599
	RotationPeriod  72.2599525
	RotationEpoch   0
	Obliquity       205.9505
	EqAscendNode    176.591431

	AbsMagn         10.1
	SlopeParam      4.43
	AlbedoBond      0.0339
	AlbedoGeom      0.0406
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.728 0.648 0.574)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.491
		Randomize      (0.144, 0.065, 0.438)
		colorDistMagn   0.163
		colorDistFreq   0.00983
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.866
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.396
		heightTempGrad  0.625
		beachWidth      0.00147
		tropicWidth     0.07
		mainFreq        0.599
		venusFreq       0.571
		venusMagn       0.602
		mareDensity     0
		terraceProb     0.416
		erosion         0
		montesMagn      0.49
		montesFreq      3.29
		montesSpiky     0.969
		montesFraction  0.665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0324
		hillsFraction   0.563
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.214
		craterFreq      0.221
		craterDensity   0.846
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458
		volcanoTemp     368
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.15
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0585
		GasToDust   0.25
		Particles   2161
		GasBright   0.0103
		DustBright  0.0284
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.6503087
		SemiMajorAxis   6.13346161
		Eccentricity    0.930965288
		Inclination     -34.2663632
		AscendingNode   -173.229979
		ArgOfPericenter 54.9381561
		MeanAnomaly     -100.683587
	}
}

Comet	"C146"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.73718845e-15
	Radius          0.12609978
	InertiaMoment   0.396032691
	RotationPeriod  98.9651184
	RotationEpoch   0
	Obliquity       117.344574
	EqAscendNode    59.5203514

	AbsMagn         4.67
	SlopeParam      5.87
	AlbedoBond      0.0512
	AlbedoGeom      0.0614
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.508 0.502 0.498)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.165
		Randomize      (-0.348, -0.850, -0.403)
		colorDistMagn   0.596
		colorDistFreq   4e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.872
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.406
		heightTempGrad  0.625
		beachWidth      0.000999
		tropicWidth     0.07
		mainFreq        0.697
		venusFreq       0.527
		venusMagn       0.501
		mareDensity     0
		terraceProb     0.216
		erosion         0
		montesMagn      0.576
		montesFreq      2.98
		montesSpiky     0.892
		montesFraction  0.847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.53e-05
		hillsFraction   0.49
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.249
		craterDensity   0.979
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48
		volcanoTemp     261
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.181
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00641
		GasToDust   0.25
		Particles   1109
		GasBright   0.000824
		DustBright  0.0211
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.7237271
		SemiMajorAxis   6.14393541
		Eccentricity    0.959179677
		Inclination     4.49928484
		AscendingNode   177.081535
		ArgOfPericenter -112.175358
		MeanAnomaly     77.0805009
	}
}

Comet	"C87"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.16051233e-07
	Radius          47.1138878
	InertiaMoment   0.39699477
	Oblateness      0.00256776437
	RotationPeriod  57.575449
	RotationEpoch   0
	Obliquity       150.56395
	EqAscendNode    156.401855

	AbsMagn         3.9
	SlopeParam      3.02
	AlbedoBond      0.0332
	AlbedoGeom      0.0399
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.772 0.770 0.769)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.434
		Randomize      (-0.164, 0.660, -0.655)
		colorDistMagn   0.987
		colorDistFreq   0.403
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.311
		icecapLatitude  0.897
		icecapHeight    0.0475
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.264
		heightTempGrad  0.625
		beachWidth      0.00033
		tropicWidth     0.07
		mainFreq        0.535
		venusFreq       0.675
		venusMagn       0.663
		mareDensity     0
		terraceProb     0.266
		erosion         0
		montesMagn      0.605
		montesFreq      2.49
		montesSpiky     0.936
		montesFraction  0.349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.77
		hillsFraction   0.711
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.265
		craterFreq      0.186
		craterDensity   0.997
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432
		volcanoTemp     273
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     110
		OuterRadius     166
		EdgeRadius      166
		MeanRadius      128
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     166
		RotationPeriod  13.1
		Brightness      1
		FrontBright     2.48
		BackBright      4.03
		Density         0.982
		Opacity         0.982
		SelfShadow      0.982
		PlanetShadow    0.982
		Hapke           1
		SpotBright      2.57
		SpotWidth       0.0326
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.03
		densityScale    1.36
		densityOffset   -0.32
		densityPower    4.91
		colorContrast   0.0946
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00701
		DustBright  0.00988
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.8521865
		SemiMajorAxis   6.16223988
		Eccentricity    0.971542794
		Inclination     168.217755
		AscendingNode   143.23382
		ArgOfPericenter -120.354168
		MeanAnomaly     3.37695412
	}
}

Comet	"C16"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.87857164e-16
	Radius          0.0634954721
	InertiaMoment   0.397349894
	Oblateness      0.00188647571
	RotationPeriod  82.6571045
	RotationEpoch   0
	Obliquity       117.319458
	EqAscendNode    157.055847

	AbsMagn         1.13
	SlopeParam      4.77
	AlbedoBond      0.0426
	AlbedoGeom      0.0512
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.465 0.463 0.460)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.436
		Randomize      (-0.348, 0.884, -0.620)
		colorDistMagn   0.202
		colorDistFreq   2.98e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.199
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.282
		heightTempGrad  0.625
		beachWidth      0.000639
		tropicWidth     0.07
		mainFreq        0.641
		venusFreq       0.61
		venusMagn       0.486
		mareDensity     0
		terraceProb     0.103
		erosion         0
		montesMagn      0.321
		montesFreq      2.49
		montesSpiky     0.895
		montesFraction  0.531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47e-06
		hillsFraction   0.763
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.228
		craterDensity   1.06
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562
		volcanoTemp     143
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.084
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00829
		DustBright  0.00931
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          28.8769578
		SemiMajorAxis   6.16576647
		Eccentricity    0.961700586
		Inclination     107.365379
		AscendingNode   163.252089
		ArgOfPericenter -91.130484
		MeanAnomaly     -3.83026857
	}
}

Comet	"C14"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.72769473e-13
	Radius          0.617440879
	InertiaMoment   0.399173945
	Oblateness      0.00368388556
	RotationPeriod  59.3468056
	RotationEpoch   0
	Obliquity       106.242149
	EqAscendNode    81.0179367

	AbsMagn         8.29
	SlopeParam      6.98
	AlbedoBond      0.0425
	AlbedoGeom      0.051
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.623 0.549 0.509)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.225
		Randomize      (-0.410, -0.997, 0.761)
		colorDistMagn   0.908
		colorDistFreq   0.00016
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.762
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.175
		heightTempGrad  0.625
		beachWidth      0.000652
		tropicWidth     0.07
		mainFreq        0.543
		venusFreq       0.628
		venusMagn       0.781
		mareDensity     0
		terraceProb     0.383
		erosion         0
		montesMagn      0.553
		montesFreq      2.12
		montesSpiky     0.802
		montesFraction  0.347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000875
		hillsFraction   0.819
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.265
		craterDensity   0.891
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427
		volcanoTemp     306
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.743
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0287
		GasToDust   0.25
		Particles   1559
		GasBright   3.1e-05
		DustBright  0.0452
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.0464939
		SemiMajorAxis   6.18987566
		Eccentricity    0.95574643
		Inclination     -57.2419494
		AscendingNode   -90.7970477
		ArgOfPericenter -110.914002
		MeanAnomaly     115.223502
	}
}

Comet	"C136"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.1696594e-12
	Radius          1.88652229
	InertiaMoment   0.398711592
	Oblateness      0.00156628771
	RotationPeriod  75.391468
	RotationEpoch   0
	Obliquity       61.9580307
	EqAscendNode    39.3307724

	AbsMagn         9.52
	SlopeParam      4.27
	AlbedoBond      0.0503
	AlbedoGeom      0.0603
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.628 0.624 0.618)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.109
		Randomize      (-0.656, -0.255, 0.504)
		colorDistMagn   0.504
		colorDistFreq   0.00183
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.962
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.274
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        0.613
		venusFreq       0.63
		venusMagn       0.603
		mareDensity     0
		terraceProb     0.71
		erosion         0
		montesMagn      0.414
		montesFreq      3.69
		montesSpiky     0.804
		montesFraction  0.485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00679
		hillsFraction   0.658
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.275
		craterFreq      0.217
		craterDensity   0.86
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464
		volcanoTemp     166
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.44
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0487
		GasToDust   0.25
		Particles   1963
		GasBright   0.00746
		DustBright  0.0326
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.2920858
		SemiMajorAxis   6.22471748
		Eccentricity    0.954657246
		Inclination     -127.291563
		AscendingNode   -103.444623
		ArgOfPericenter 124.200107
		MeanAnomaly     -52.0061891
	}
}

Comet	"C1"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.02480988e-17
	Radius          0.0322092921
	InertiaMoment   0.398292959
	Oblateness      0.00184429833
	RotationPeriod  58.5018768
	RotationEpoch   0
	Obliquity       34.2396393
	EqAscendNode    126.771484

	AbsMagn         4.85
	SlopeParam      4.83
	AlbedoBond      0.0255
	AlbedoGeom      0.0306
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.447 0.443 0.437)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.352
		Randomize      (-0.810, -0.224, 0.739)
		colorDistMagn   0.544
		colorDistFreq   4.81e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.886
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.483
		heightTempGrad  0.625
		beachWidth      0.000886
		tropicWidth     0.07
		mainFreq        0.539
		venusFreq       0.607
		venusMagn       0.78
		mareDensity     0
		terraceProb     0.103
		erosion         0
		montesMagn      0.392
		montesFreq      2.75
		montesSpiky     0.994
		montesFraction  0.597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.97e-06
		hillsFraction   0.639
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.257
		craterFreq      0.23
		craterDensity   0.974
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53
		volcanoTemp     210
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0453
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00869
		DustBright  0.0361
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.5341844
		SemiMajorAxis   6.25896854
		Eccentricity    0.976485719
		Inclination     -138.640461
		AscendingNode   11.9862206
		ArgOfPericenter -111.155674
		MeanAnomaly     -32.8483218
	}
}

Comet	"C85"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.24902643e-16
	Radius          0.0675998405
	InertiaMoment   0.399029136
	Oblateness      0.00465753255
	RotationPeriod  38.545063
	RotationEpoch   0
	Obliquity       139.486633
	EqAscendNode    80.3639297

	AbsMagn         9.42
	SlopeParam      4.48
	AlbedoBond      0.0331
	AlbedoGeom      0.0397
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.478 0.474 0.472)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.223
		Randomize      (-0.225, 0.779, 0.726)
		colorDistMagn   0.793
		colorDistFreq   2.49e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.444
		icecapLatitude  0.946
		icecapHeight    0.0425
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.157
		heightTempGrad  0.625
		beachWidth      0.00124
		tropicWidth     0.07
		mainFreq        0.445
		venusFreq       0.524
		venusMagn       0.623
		mareDensity     0
		terraceProb     0.173
		erosion         0
		montesMagn      0.511
		montesFreq      2.13
		montesSpiky     0.892
		montesFraction  0.735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.98e-06
		hillsFraction   0.746
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.209
		craterFreq      0.222
		craterDensity   0.863
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469
		volcanoTemp     226
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.1
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0198
		DustBright  0.0247
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.7577237
		SemiMajorAxis   6.29051089
		Eccentricity    0.940359369
		Inclination     150.059049
		AscendingNode   123.287167
		ArgOfPericenter -102.97788
		MeanAnomaly     149.328399
	}
}

Comet	"C100"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.58853787e-15
	Radius          0.129358441
	InertiaMoment   0.398384213
	Oblateness      0.00379181793
	RotationPeriod  58.4140606
	RotationEpoch   0
	Obliquity       222.566467
	EqAscendNode    110.6483

	AbsMagn         7.66
	SlopeParam      4.41
	AlbedoBond      0.0476
	AlbedoGeom      0.0571
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.500 0.495 0.490)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.307
		Randomize      (0.236, -0.113, -0.634)
		colorDistMagn   0.515
		colorDistFreq   1.47e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.79
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.356
		heightTempGrad  0.625
		beachWidth      0.000996
		tropicWidth     0.07
		mainFreq        0.539
		venusFreq       0.53
		venusMagn       0.663
		mareDensity     0
		terraceProb     0.172
		erosion         0
		montesMagn      0.485
		montesFreq      3.61
		montesSpiky     0.951
		montesFraction  0.649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.67e-05
		hillsFraction   0.504
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.261
		craterFreq      0.221
		craterDensity   0.906
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492
		volcanoTemp     229
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.147
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00349
		GasToDust   0.25
		Particles   1050
		GasBright   0.00384
		DustBright  0.0135
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.7722939
		SemiMajorAxis   6.29256406
		Eccentricity    0.954028162
		Inclination     -15.0434449
		AscendingNode   54.7943513
		ArgOfPericenter -67.4950338
		MeanAnomaly     -86.161778
	}
}

Comet	"C120"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.81580097e-11
	Radius          3.52637362
	InertiaMoment   0.398570836
	RotationPeriod  94.9020538
	RotationEpoch   0
	Obliquity       333.339539
	EqAscendNode    151.027451

	AbsMagn         8.68
	SlopeParam      2.87
	AlbedoBond      0.049
	AlbedoGeom      0.0588
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.659 0.654 0.651)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.42
		Randomize      (0.852, 0.697, -0.446)
		colorDistMagn   0.693
		colorDistFreq   0.00471
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.466
		icecapLatitude  0.913
		icecapHeight    0.0276
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.221
		heightTempGrad  0.625
		beachWidth      0.00117
		tropicWidth     0.07
		mainFreq        0.685
		venusFreq       0.638
		venusMagn       0.498
		mareDensity     0
		terraceProb     0.461
		erosion         0
		montesMagn      0.533
		montesFreq      1.91
		montesSpiky     0.826
		montesFraction  0.747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0344
		hillsFraction   0.559
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.226
		craterFreq      0.182
		craterDensity   0.881
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52
		volcanoTemp     279
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.09
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.06
		GasToDust   0.25
		Particles   2191
		GasBright   0.00894
		DustBright  0.0121
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.8461989
		SemiMajorAxis   6.30297328
		Eccentricity    0.978047303
		Inclination     -1.10157327
		AscendingNode   -31.2593669
		ArgOfPericenter -32.7477067
		MeanAnomaly     108.511162
	}
}

Comet	"C43"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.32324201e-11
	Radius          3.63853836
	InertiaMoment   0.394873202
	Oblateness      0.00262002205
	RotationPeriod  48.5037403
	RotationEpoch   0
	Obliquity       266.863159
	EqAscendNode    283.567719

	AbsMagn         13.7
	SlopeParam      4.65
	AlbedoBond      0.03
	AlbedoGeom      0.036
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.663 0.656 0.653)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.788
		Randomize      (0.483, -0.722, -0.267)
		colorDistMagn   0.189
		colorDistFreq   0.00669
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.97
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32
		heightTempGrad  0.625
		beachWidth      0.000615
		tropicWidth     0.07
		mainFreq        0.493
		venusFreq       0.644
		venusMagn       0.543
		mareDensity     0
		terraceProb     0.32
		erosion         0
		montesMagn      0.595
		montesFreq      3.23
		montesSpiky     0.842
		montesFraction  0.397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0233
		hillsFraction   0.688
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.226
		craterDensity   0.755
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.632
		volcanoTemp     288
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.76
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0612
		GasToDust   0.25
		Particles   2216
		GasBright   0.00171
		DustBright  0.0229
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          29.8966545
		SemiMajorAxis   6.31007481
		Eccentricity    0.947724695
		Inclination     23.3365893
		AscendingNode   61.2721231
		ArgOfPericenter -14.3710173
		MeanAnomaly     87.3797614
	}
}

Comet	"C133"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.99966365e-07
	Radius          64.6279449
	InertiaMoment   0.39939189
	Oblateness      0.00137147948
	RotationPeriod  96.8558121
	RotationEpoch   0
	Obliquity       45.3420677
	EqAscendNode    105.273903

	AbsMagn         12.7
	SlopeParam      4.28
	AlbedoBond      0.036
	AlbedoGeom      0.0431
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.804 0.784 0.754)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.292
		Randomize      (-0.748, -0.077, -0.424)
		colorDistMagn   0.145
		colorDistFreq   1.35
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.888
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.314
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        0.691
		venusFreq       0.671
		venusMagn       0.5
		mareDensity     0
		terraceProb     0.316
		erosion         0
		montesMagn      0.421
		montesFreq      3.33
		montesSpiky     0.866
		montesFraction  0.499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.38
		hillsFraction   0.702
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.218
		craterDensity   0.78
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.35
		volcanoTemp     235
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     117
		OuterRadius     436
		EdgeRadius      164
		MeanRadius      133
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     164
		RotationPeriod  10.3
		Brightness      1
		FrontBright     2.97
		BackBright      5
		Density         0.991
		Opacity         0.991
		SelfShadow      0.991
		PlanetShadow    0.991
		Hapke           1
		SpotBright      2.38
		SpotWidth       0.0195
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.98
		densityScale    1.2
		densityOffset   -0.0733
		densityPower    4.87
		colorContrast   0.0876
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00497
		DustBright  0.0165
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.4460227
		SemiMajorAxis   6.38714082
		Eccentricity    0.970207095
		Inclination     -53.0936774
		AscendingNode   11.5549603
		ArgOfPericenter -114.735767
		MeanAnomaly     -107.53994
	}
}

Comet	"C131"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.32144098e-16
	Radius          0.0999223739
	InertiaMoment   0.39772585
	Oblateness      0.00284865592
	RotationPeriod  67.311224
	RotationEpoch   0
	Obliquity       34.2647552
	EqAscendNode    29.2359867

	AbsMagn         6.72
	SlopeParam      5.97
	AlbedoBond      0.0358
	AlbedoGeom      0.043
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.545 0.459 0.420)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0812
		Randomize      (-0.810, 0.042, 0.957)
		colorDistMagn   0.873
		colorDistFreq   6.16e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.806
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.207
		heightTempGrad  0.625
		beachWidth      0.000946
		tropicWidth     0.07
		mainFreq        0.578
		venusFreq       0.52
		venusMagn       0.788
		mareDensity     0
		terraceProb     0.217
		erosion         0
		montesMagn      0.617
		montesFreq      3.17
		montesSpiky     0.992
		montesFraction  0.285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63e-05
		hillsFraction   0.736
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.251
		craterDensity   0.929
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454
		volcanoTemp     328
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.127
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0128
		DustBright  0.0363
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.5305486
		SemiMajorAxis   6.39895691
		Eccentricity    0.956937675
		Inclination     -48.5139242
		AscendingNode   125.258813
		ArgOfPericenter -9.6209244
		MeanAnomaly     55.8034853
	}
}

Comet	"C67"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.16985045e-12
	Radius          1.62835252
	InertiaMoment   0.396465927
	Oblateness      0.0136608295
	RotationPeriod  30.658473
	RotationEpoch   0
	Obliquity       39.7908516
	EqAscendNode    116.022697

	AbsMagn         1.5
	SlopeParam      4.55
	AlbedoBond      0.0319
	AlbedoGeom      0.0383
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.616 0.609 0.605)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.322
		Randomize      (-0.779, -0.150, -0.843)
		colorDistMagn   0.799
		colorDistFreq   0.00185
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0338
		icecapLatitude  0.993
		icecapHeight    0.0042
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.398
		heightTempGrad  0.625
		beachWidth      0.000759
		tropicWidth     0.07
		mainFreq        0.406
		venusFreq       0.565
		venusMagn       0.847
		mareDensity     0
		terraceProb     0.418
		erosion         0
		montesMagn      0.543
		montesFreq      2.04
		montesSpiky     0.815
		montesFraction  0.0907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00665
		hillsFraction   0.669
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24
		craterFreq      0.224
		craterDensity   1.05
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555
		volcanoTemp     292
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.94
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0443
		GasToDust   0.25
		Particles   1875
		GasBright   0.00279
		DustBright  0.0104
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.575676
		SemiMajorAxis   6.40526092
		Eccentricity    0.987712963
		Inclination     -140.639457
		AscendingNode   113.06268
		ArgOfPericenter -18.130372
		MeanAnomaly     67.5793485
	}
}

Comet	"C58"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.73786771e-10
	Radius          7.19522333
	InertiaMoment   0.39949888
	Oblateness      0.00270108087
	RotationPeriod  69.3021698
	RotationEpoch   0
	Obliquity       349.942963
	EqAscendNode    313.852081

	AbsMagn         10.7
	SlopeParam      4.59
	AlbedoBond      0.0449
	AlbedoGeom      0.0539
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.681 0.678 0.676)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.872
		Randomize      (0.944, 0.385, 0.373)
		colorDistMagn   0.801
		colorDistFreq   0.0413
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.683
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.119
		heightTempGrad  0.625
		beachWidth      0.000968
		tropicWidth     0.07
		mainFreq        0.587
		venusFreq       0.648
		venusMagn       0.601
		mareDensity     0
		terraceProb     0.319
		erosion         0
		montesMagn      0.56
		montesFreq      3.02
		montesSpiky     0.926
		montesFraction  0.282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.118
		hillsFraction   0.908
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.225
		craterFreq      0.224
		craterDensity   0.831
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451
		volcanoTemp     361
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.57
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0683
		GasToDust   0.25
		Particles   2359
		GasBright   0.013
		DustBright  0.0245
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.6020071
		SemiMajorAxis   6.40893777
		Eccentricity    0.967645
		Inclination     -146.59151
		AscendingNode   -27.6397171
		ArgOfPericenter 4.80696992
		MeanAnomaly     46.5908467
	}
}

Comet	"C22"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.06612742e-14
	Radius          0.435596794
	InertiaMoment   0.399234384
	Oblateness      0.00454283506
	RotationPeriod  53.4500141
	RotationEpoch   0
	Obliquity       150.551376
	EqAscendNode    25.1695976

	AbsMagn         8.7
	SlopeParam      4.74
	AlbedoBond      0.043
	AlbedoGeom      0.0515
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.669 0.587 0.432)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0699
		Randomize      (-0.164, 0.527, -0.764)
		colorDistMagn   0.811
		colorDistFreq   9.19e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.951
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.201
		heightTempGrad  0.625
		beachWidth      0.0015
		tropicWidth     0.07
		mainFreq        0.516
		venusFreq       0.555
		venusMagn       0.661
		mareDensity     0
		terraceProb     0.421
		erosion         0
		montesMagn      0.691
		montesFreq      2.99
		montesSpiky     0.784
		montesFraction  0.504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000476
		hillsFraction   0.663
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.216
		craterFreq      0.228
		craterDensity   0.881
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482
		volcanoTemp     214
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.513
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0231
		GasToDust   0.25
		Particles   1445
		GasBright   0.00562
		DustBright  0.0091
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.7424008
		SemiMajorAxis   6.42852445
		Eccentricity    0.97981234
		Inclination     -85.8555808
		AscendingNode   164.351446
		ArgOfPericenter -65.021339
		MeanAnomaly     120.602997
	}
}

Comet	"C27"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.94038208e-10
	Radius          6.92937613
	InertiaMoment   0.399914235
	Oblateness      0.00147601473
	RotationPeriod  60.1980343
	RotationEpoch   0
	Obliquity       178.244659
	EqAscendNode    35.2643852

	AbsMagn         12
	SlopeParam      3.28
	AlbedoBond      0.0286
	AlbedoGeom      0.0343
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.694 0.690 0.687)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.098
		Randomize      (-0.010, 0.229, 0.783)
		colorDistMagn   0.438
		colorDistFreq   0.0177
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.943
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.268
		heightTempGrad  0.625
		beachWidth      0.000718
		tropicWidth     0.07
		mainFreq        0.547
		venusFreq       0.654
		venusMagn       0.781
		mareDensity     0
		terraceProb     0.269
		erosion         0
		montesMagn      0.444
		montesFreq      3.37
		montesSpiky     0.855
		montesFraction  0.648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.128
		hillsFraction   0.592
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.251
		craterFreq      0.194
		craterDensity   0.798
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49
		volcanoTemp     331
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.2
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0725
		GasToDust   0.25
		Particles   2443
		GasBright   0.014
		DustBright  0.0316
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.8439435
		SemiMajorAxis   6.44267235
		Eccentricity    0.957359412
		Inclination     -69.2547304
		AscendingNode   174.881415
		ArgOfPericenter 12.2473483
		MeanAnomaly     22.4556852
	}
}

Comet	"C165"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.03903591e-09
	Radius          16.0425701
	InertiaMoment   0.399622351
	Oblateness      0.00329616619
	RotationPeriod  62.7038841
	RotationEpoch   0
	Obliquity       222.57901
	EqAscendNode    241.880554

	AbsMagn         1.42
	SlopeParam      2.65
	AlbedoBond      0.0377
	AlbedoGeom      0.0452
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.783 0.723 0.647)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.672
		Randomize      (0.237, 0.020, -0.525)
		colorDistMagn   0.681
		colorDistFreq   0.153
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.912
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.418
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.558
		venusFreq       0.648
		venusMagn       0.665
		mareDensity     0
		terraceProb     0.456
		erosion         0
		montesMagn      0.454
		montesFreq      3.07
		montesSpiky     0.843
		montesFraction  0.52
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.713
		hillsFraction   0.566
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.174
		craterDensity   1.05
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45
		volcanoTemp     358
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.3
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0812
		GasToDust   0.25
		Particles   2620
		GasBright   0.00497
		DustBright  0.0145
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          30.9301956
		SemiMajorAxis   6.45467764
		Eccentricity    0.963207106
		Inclination     -79.1860243
		AscendingNode   127.820149
		ArgOfPericenter -81.9217399
		MeanAnomaly     100.870415
	}
}

Comet	"C79"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.30525751e-07
	Radius          62.8989868
	InertiaMoment   0.396809459
	Oblateness      0.00175258238
	RotationPeriod  63.6779537
	RotationEpoch   0
	Obliquity       106.254715
	EqAscendNode    212.250198

	AbsMagn         3.15
	SlopeParam      4.5
	AlbedoBond      0.0327
	AlbedoGeom      0.0392
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.788 0.786 0.785)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.59
		Randomize      (-0.410, -0.864, 0.870)
		colorDistMagn   0.172
		colorDistFreq   3.3
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.294
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.237
		heightTempGrad  0.625
		beachWidth      0.000982
		tropicWidth     0.07
		mainFreq        0.562
		venusFreq       0.594
		venusMagn       0.785
		mareDensity     0
		terraceProb     0.243
		erosion         0
		montesMagn      0.521
		montesFreq      3.27
		montesSpiky     0.939
		montesFraction  0.781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.7
		hillsFraction   0.451
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.223
		craterDensity   1.01
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542
		volcanoTemp     155
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     111
		OuterRadius     352
		EdgeRadius      133
		MeanRadius      118
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     133
		RotationPeriod  6.5
		Brightness      1
		FrontBright     2.91
		BackBright      4.94
		Density         0.966
		Opacity         0.966
		SelfShadow      0.966
		PlanetShadow    0.966
		Hapke           1
		SpotBright      2.3
		SpotWidth       0.0199
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.64
		densityScale    1.38
		densityOffset   -0.394
		densityPower    4.86
		colorContrast   0.0541
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00161
		DustBright  0.0458
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.1365153
		SemiMajorAxis   6.48334975
		Eccentricity    0.998616101
		Inclination     90.7023836
		AscendingNode   30.0806568
		ArgOfPericenter -149.816821
		MeanAnomaly     41.7169943
	}
}

Comet	"C128"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.0419921e-11
	Radius          2.49915981
	InertiaMoment   0.398642063
	Oblateness      0.00103396608
	RotationPeriod  83.8240356
	RotationEpoch   0
	Obliquity       17.6487923
	EqAscendNode    95.1791077

	AbsMagn         9.09
	SlopeParam      5.99
	AlbedoBond      0.0496
	AlbedoGeom      0.0595
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.642 0.638 0.636)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.264
		Randomize      (-0.902, 0.221, 0.029)
		colorDistMagn   0.601
		colorDistFreq   0.00281
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.475
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.247
		heightTempGrad  0.625
		beachWidth      0.000815
		tropicWidth     0.07
		mainFreq        0.646
		venusFreq       0.566
		venusMagn       0.704
		mareDensity     0
		terraceProb     0.527
		erosion         0
		montesMagn      0.628
		montesFreq      2.96
		montesSpiky     0.816
		montesFraction  0.314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0222
		hillsFraction   0.806
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.251
		craterDensity   0.871
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58
		volcanoTemp     258
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.52
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0543
		GasToDust   0.25
		Particles   2077
		GasBright   0.00933
		DustBright  0.0212
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.2115955
		SemiMajorAxis   6.49376787
		Eccentricity    0.980457932
		Inclination     11.7764659
		AscendingNode   -53.091226
		ArgOfPericenter 132.063461
		MeanAnomaly     177.951335
	}
}

Comet	"C89"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.26185812e-10
	Radius          5.55845308
	InertiaMoment   0.399060428
	Oblateness      0.00202179351
	RotationPeriod  80.0489559
	RotationEpoch   0
	Obliquity       161.641251
	EqAscendNode    232.439758

	AbsMagn         9.64
	SlopeParam      6.26
	AlbedoBond      0.0334
	AlbedoGeom      0.04
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.763 0.685 0.570)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.646
		Randomize      (-0.102, 0.541, -0.037)
		colorDistMagn   0.305
		colorDistFreq   0.0178
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.993
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        0.631
		venusFreq       0.642
		venusMagn       0.702
		mareDensity     0
		terraceProb     0.379
		erosion         0
		montesMagn      0.412
		montesFreq      2.69
		montesSpiky     0.971
		montesFraction  0.532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0561
		hillsFraction   0.68
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.255
		craterDensity   0.857
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567
		volcanoTemp     390
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.04
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0641
		GasToDust   0.25
		Particles   2275
		GasBright   0.0113
		DustBright  0.018
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.5275211
		SemiMajorAxis   6.53751448
		Eccentricity    0.988131169
		Inclination     66.1318074
		AscendingNode   -148.228778
		ArgOfPericenter -102.399605
		MeanAnomaly     62.3161724
	}
}

Comet	"C150"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.12880596e-10
	Radius          10.3395958
	InertiaMoment   0.3962152
	Oblateness      0.00703476043
	RotationPeriod  42.6676712
	RotationEpoch   0
	Obliquity       139.499191
	EqAscendNode    211.596191

	AbsMagn         4.95
	SlopeParam      2.72
	AlbedoBond      0.0516
	AlbedoGeom      0.0619
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.746 0.696 0.644)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.588
		Randomize      (-0.225, 0.912, 0.835)
		colorDistMagn   0.967
		colorDistFreq   0.0327
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.604
		icecapLatitude  1
		icecapHeight    0
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
		beachWidth      0.00127
		tropicWidth     0.07
		mainFreq        0.465
		venusFreq       0.644
		venusMagn       0.625
		mareDensity     0
		terraceProb     0.458
		erosion         0
		montesMagn      0.481
		montesFreq      3.27
		montesSpiky     0.971
		montesFraction  0.587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.249
		hillsFraction   0.833
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.177
		craterDensity   0.972
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.619
		volcanoTemp     355
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.8
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0741
		GasToDust   0.25
		Particles   2477
		GasBright   0.0223
		DustBright  0.0244
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.6400527
		SemiMajorAxis   6.55306153
		Eccentricity    0.966690958
		Inclination     -176.551796
		AscendingNode   46.0306229
		ArgOfPericenter 47.5477117
		MeanAnomaly     -120.132644
	}
}

Comet	"C160"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.10336555e-13
	Radius          0.750547945
	InertiaMoment   0.398911566
	Oblateness      0.0041588028
	RotationPeriod  55.8269863
	RotationEpoch   0
	Obliquity       194.885742
	EqAscendNode    231.785751

	AbsMagn         10.9
	SlopeParam      4.17
	AlbedoBond      0.0527
	AlbedoGeom      0.0632
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.581 0.572 0.569)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.644
		Randomize      (0.083, 0.317, -0.072)
		colorDistMagn   0.131
		colorDistFreq   0.000399
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.687
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.352
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        0.527
		venusFreq       0.55
		venusMagn       0.55
		mareDensity     0
		terraceProb     0.17
		erosion         0
		montesMagn      0.313
		montesFreq      2.69
		montesSpiky     0.677
		montesFraction  0.352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00147
		hillsFraction   0.64
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.204
		craterFreq      0.215
		craterDensity   0.825
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437
		volcanoTemp     240
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.814
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0318
		GasToDust   0.25
		Particles   1622
		GasBright   0.00941
		DustBright  0.0192
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.7657017
		SemiMajorAxis   6.57039909
		Eccentricity    0.955571666
		Inclination     -125.420102
		AscendingNode   -90.8586494
		ArgOfPericenter -48.3570125
		MeanAnomaly     -51.2239309
	}
}

Comet	"C159"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.41135364e-12
	Radius          2.34025145
	InertiaMoment   0.398065865
	Oblateness      0.00125947408
	RotationPeriod  101.26553
	RotationEpoch   0
	Obliquity       189.347092
	EqAscendNode    13.7668009

	AbsMagn         8.16
	SlopeParam      2.68
	AlbedoBond      0.0374
	AlbedoGeom      0.0448
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.735 0.636 0.519)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0382
		Randomize      (0.052, 0.377, -0.381)
		colorDistMagn   0.964
		colorDistFreq   0.000779
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.481
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.499
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        0.704
		venusFreq       0.562
		venusMagn       0.503
		mareDensity     0
		terraceProb     0.121
		erosion         0
		montesMagn      0.465
		montesFreq      2.6
		montesSpiky     0.912
		montesFraction  0.547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0141
		hillsFraction   0.654
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.216
		craterFreq      0.175
		craterDensity   0.894
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525
		volcanoTemp     287
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.45
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0502
		GasToDust   0.25
		Particles   1993
		GasBright   0.0077
		DustBright  0.0147
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          31.8818897
		SemiMajorAxis   6.58641084
		Eccentricity    0.970952082
		Inclination     -157.120399
		AscendingNode   -106.789159
		ArgOfPericenter 99.3994338
		MeanAnomaly     167.494793
	}
}

Comet	"C41"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.73507827e-08
	Radius          45.0019112
	InertiaMoment   0.398666084
	Oblateness      0.0154819516
	RotationPeriod  28.8230238
	RotationEpoch   0
	Obliquity       255.785843
	EqAscendNode    207.529785

	AbsMagn         7.16
	SlopeParam      6.68
	AlbedoBond      0.0299
	AlbedoGeom      0.0358
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.764 0.762 0.761)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.576
		Randomize      (0.421, -0.603, -0.886)
		colorDistMagn   0.9
		colorDistFreq   1.65
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.834
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.213
		heightTempGrad  0.625
		beachWidth      0.000327
		tropicWidth     0.07
		mainFreq        0.397
		venusFreq       0.679
		venusMagn       0.843
		mareDensity     0
		terraceProb     0.221
		erosion         0
		montesMagn      0.504
		montesFreq      3.08
		montesSpiky     0.983
		montesFraction  0.793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.28
		hillsFraction   0.72
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.261
		craterDensity   0.918
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453
		volcanoTemp     101
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0979
		GasToDust   0.25
		Particles   2957
		GasBright   0.00122
		DustBright  0.0111
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.3339122
		SemiMajorAxis   6.64851954
		Eccentricity    0.962640093
		Inclination     -158.456822
		AscendingNode   -176.919354
		ArgOfPericenter -123.344927
		MeanAnomaly     -109.648611
	}
}

Comet	"C112"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.65639932e-10
	Radius          4.96714878
	InertiaMoment   0.39849776
	RotationPeriod  114.286068
	RotationEpoch   0
	Obliquity       289.030304
	EqAscendNode    206.875793

	AbsMagn         8.27
	SlopeParam      4.36
	AlbedoBond      0.0484
	AlbedoGeom      0.0581
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.676 0.671 0.666)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.575
		Randomize      (0.606, -0.827, -0.921)
		colorDistMagn   0.786
		colorDistFreq   0.00717
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.992
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.195
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        0.734
		venusFreq       0.573
		venusMagn       0.644
		mareDensity     0
		terraceProb     0.415
		erosion         0
		montesMagn      0.464
		montesFreq      3.08
		montesSpiky     0.835
		montesFraction  0.593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.062
		hillsFraction   0.676
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.264
		craterFreq      0.22
		craterDensity   0.891
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483
		volcanoTemp     231
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.37
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0656
		GasToDust   0.25
		Particles   2304
		GasBright   0.0005
		DustBright  0.0111
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.3845977
		SemiMajorAxis   6.65546572
		Eccentricity    0.963144828
		Inclination     -119.563376
		AscendingNode   137.260915
		ArgOfPericenter -50.0039049
		MeanAnomaly     55.1566897
	}
}

Comet	"C36"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.87764472e-12
	Radius          1.69206083
	InertiaMoment   0.397654355
	Oblateness      0.0154705159
	RotationPeriod  20.7637196
	RotationEpoch   0
	Obliquity       228.09256
	EqAscendNode    197.434998

	AbsMagn         3.75
	SlopeParam      3.25
	AlbedoBond      0.0437
	AlbedoGeom      0.0525
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.625 0.623 0.620)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.548
		Randomize      (0.267, -0.306, -0.433)
		colorDistMagn   0.435
		colorDistFreq   0.000735
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.879
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.147
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.356
		venusFreq       0.569
		venusMagn       0.68
		mareDensity     0
		terraceProb     0.349
		erosion         0
		montesMagn      0.425
		montesFreq      2.71
		montesSpiky     0.968
		montesFraction  0.605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00889
		hillsFraction   0.851
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.288
		craterFreq      0.193
		craterDensity   1
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441
		volcanoTemp     193
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.31
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0485
		GasToDust   0.25
		Particles   1959
		GasBright   0.0037
		DustBright  0.0176
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.4930275
		SemiMajorAxis   6.67031329
		Eccentricity    0.966403833
		Inclination     -86.4079073
		AscendingNode   -116.941462
		ArgOfPericenter 97.3429536
		MeanAnomaly     -15.1466036
	}
}

Comet	"C106"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.12956268e-13
	Radius          0.887405992
	InertiaMoment   0.399839073
	Oblateness      0.0117071811
	RotationPeriod  33.3311005
	RotationEpoch   0
	Obliquity       255.798386
	EqAscendNode    338.762054

	AbsMagn         17.8
	SlopeParam      4.39
	AlbedoBond      0.048
	AlbedoGeom      0.0576
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.643 0.584 0.523)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.941
		Randomize      (0.421, -0.470, -0.777)
		colorDistMagn   0.159
		colorDistFreq   0.000445
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.986
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.276
		heightTempGrad  0.625
		beachWidth      0.00126
		tropicWidth     0.07
		mainFreq        0.419
		venusFreq       0.625
		venusMagn       0.854
		mareDensity     0
		terraceProb     0.752
		erosion         0
		montesMagn      0.474
		montesFreq      2.62
		montesSpiky     0.909
		montesFraction  0.62
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00185
		hillsFraction   0.785
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.22
		craterDensity   0.646
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564
		volcanoTemp     300
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.942
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0345
		GasToDust   0.25
		Particles   1677
		GasBright   0.00191
		DustBright  0.0125
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.7551571
		SemiMajorAxis   6.70613931
		Eccentricity    0.970682321
		Inclination     -36.0070629
		AscendingNode   28.6498025
		ArgOfPericenter -82.4682759
		MeanAnomaly     98.0993824
	}
}

Comet	"C66"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.61297708e-11
	Radius          5.07671928
	InertiaMoment   0.399556309
	Oblateness      0.00329184812
	RotationPeriod  62.7954369
	RotationEpoch   0
	Obliquity       34.2521973
	EqAscendNode    258.003754

	AbsMagn         11.2
	SlopeParam      3.11
	AlbedoBond      0.0454
	AlbedoGeom      0.0545
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.759 0.693 0.566)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.717
		Randomize      (-0.810, -0.091, 0.848)
		colorDistMagn   0.708
		colorDistFreq   0.00281
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.362
		icecapLatitude  0.98
		icecapHeight    0.00919
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.145
		heightTempGrad  0.625
		beachWidth      0.00182
		tropicWidth     0.07
		mainFreq        0.558
		venusFreq       0.575
		venusMagn       0.784
		mareDensity     0
		terraceProb     0.348
		erosion         0
		montesMagn      0.297
		montesFreq      3.94
		montesSpiky     0.923
		montesFraction  0.469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.064
		hillsFraction   0.684
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.189
		craterDensity   0.817
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494
		volcanoTemp     199
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.93
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0627
		GasToDust   0.25
		Particles   2245
		GasBright   0.0107
		DustBright  0.0363
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.7612765
		SemiMajorAxis   6.70697452
		Eccentricity    0.962245605
		Inclination     30.3097477
		AscendingNode   -62.2722792
		ArgOfPericenter 39.3759905
		MeanAnomaly     85.5540015
	}
}

Comet	"C20"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.57892794e-11
	Radius          3.39112377
	InertiaMoment   0.397415638
	Oblateness      0.00562287122
	RotationPeriod  34.2941551
	RotationEpoch   0
	Obliquity       139.474075
	EqAscendNode    309.131683

	AbsMagn         1.88
	SlopeParam      6.9
	AlbedoBond      0.0428
	AlbedoGeom      0.0514
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.659 0.653 0.649)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.859
		Randomize      (-0.225, 0.646, 0.617)
		colorDistMagn   0.631
		colorDistFreq   0.009
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.86
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.495
		heightTempGrad  0.625
		beachWidth      0.000613
		tropicWidth     0.07
		mainFreq        0.424
		venusFreq       0.576
		venusMagn       0.621
		mareDensity     0
		terraceProb     0.294
		erosion         0
		montesMagn      0.541
		montesFreq      2.84
		montesSpiky     0.973
		montesFraction  0.296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0282
		hillsFraction   0.692
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.264
		craterDensity   1.04
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505
		volcanoTemp     377
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.8
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0597
		GasToDust   0.25
		Particles   2186
		GasBright   0.0174
		DustBright  0.0249
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          32.9260508
		SemiMajorAxis   6.72944441
		Eccentricity    0.985073792
		Inclination     -19.1345057
		AscendingNode   141.886745
		ArgOfPericenter 80.0152343
		MeanAnomaly     42.8343171
	}
}

Comet	"C114"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.80105009e-13
	Radius          0.626057863
	InertiaMoment   0.399895072
	Oblateness      0.018064592
	RotationPeriod  26.8363094
	RotationEpoch   0
	Obliquity       300.107635
	EqAscendNode    282.913696

	AbsMagn         1.04
	SlopeParam      2.89
	AlbedoBond      0.0485
	AlbedoGeom      0.0582
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.686 0.542 0.448)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.786
		Randomize      (0.667, -0.946, -0.302)
		colorDistMagn   0.978
		colorDistFreq   0.000246
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.898
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.302
		heightTempGrad  0.625
		beachWidth      0.000906
		tropicWidth     0.07
		mainFreq        0.387
		venusFreq       0.552
		venusMagn       0.683
		mareDensity     0
		terraceProb     0.124
		erosion         0
		montesMagn      0.544
		montesFreq      3.23
		montesSpiky     0.905
		montesFraction  0.796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00101
		hillsFraction   0.648
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.182
		craterDensity   1.06
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456
		volcanoTemp     278
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.868
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0289
		GasToDust   0.25
		Particles   1563
		GasBright   0.000322
		DustBright  0.0236
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.0913108
		SemiMajorAxis   6.75194289
		Eccentricity    0.982246132
		Inclination     -4.00242724
		AscendingNode   104.775221
		ArgOfPericenter 139.337302
		MeanAnomaly     147.114341
	}
}

Comet	"C105"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.55560911e-11
	Radius          2.40046
	InertiaMoment   0.399183482
	Oblateness      0.00197544345
	RotationPeriod  65.4723301
	RotationEpoch   0
	Obliquity       250.259735
	EqAscendNode    120.74308

	AbsMagn         10.6
	SlopeParam      2.94
	AlbedoBond      0.0343
	AlbedoGeom      0.0412
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.638 0.634 0.632)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.335
		Randomize      (0.390, -0.411, 0.913)
		colorDistMagn   0.981
		colorDistFreq   0.00409
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.468
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.422
		heightTempGrad  0.625
		beachWidth      0.000814
		tropicWidth     0.07
		mainFreq        0.57
		venusFreq       0.635
		venusMagn       0.786
		mareDensity     0
		terraceProb     0.462
		erosion         0
		montesMagn      0.562
		montesFreq      2.52
		montesSpiky     0.967
		montesFraction  0.926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0134
		hillsFraction   0.815
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.184
		craterDensity   0.834
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499
		volcanoTemp     346
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.74
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0529
		GasToDust   0.25
		Particles   2047
		GasBright   0.00711
		DustBright  0.0412
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.2981671
		SemiMajorAxis   6.7800516
		Eccentricity    0.963524347
		Inclination     81.8763368
		AscendingNode   94.5149837
		ArgOfPericenter 118.268997
		MeanAnomaly     108.035289
	}
}

Comet	"C132"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.41422323e-17
	Radius          0.032042589
	InertiaMoment   0.398677021
	Oblateness      0.0105330488
	RotationPeriod  35.0680676
	RotationEpoch   0
	Obliquity       39.8034096
	EqAscendNode    247.254959

	AbsMagn         9.31
	SlopeParam      2.81
	AlbedoBond      0.0499
	AlbedoGeom      0.0599
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.483 0.426 0.379)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.687
		Randomize      (-0.779, -0.017, -0.734)
		colorDistMagn   0.972
		colorDistFreq   4.95e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.889
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.461
		heightTempGrad  0.625
		beachWidth      0.00139
		tropicWidth     0.07
		mainFreq        0.428
		venusFreq       0.714
		venusMagn       0.859
		mareDensity     0
		terraceProb     0.264
		erosion         0
		montesMagn      0.512
		montesFreq      3.25
		montesSpiky     0.941
		montesFraction  0.673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75e-06
		hillsFraction   0.718
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.18
		craterDensity   0.865
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511
		volcanoTemp     352
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0325
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00377
		DustBright  0.0116
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.3226181
		SemiMajorAxis   6.78337027
		Eccentricity    0.957923387
		Inclination     -98.6644974
		AscendingNode   42.3758201
		ArgOfPericenter 176.893529
		MeanAnomaly     145.735115
	}
}

Comet	"C71"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.74766047e-18
	Radius          0.0141183771
	InertiaMoment   0.396591842
	Oblateness      0.00143421919
	RotationPeriod  70.2712383
	RotationEpoch   0
	Obliquity       61.9454727
	EqAscendNode    268.098541

	AbsMagn         2.16
	SlopeParam      6.41
	AlbedoBond      0.0322
	AlbedoGeom      0.0386
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.407 0.403 0.398)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.745
		Randomize      (-0.656, -0.388, 0.395)
		colorDistMagn   0.312
		colorDistFreq   1.47e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.829
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.211
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.591
		venusFreq       0.702
		venusMagn       0.601
		mareDensity     0
		terraceProb     0.22
		erosion         0
		montesMagn      0.451
		montesFreq      2.67
		montesSpiky     0.941
		montesFraction  0.613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.24e-07
		hillsFraction   0.613
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.222
		craterFreq      0.258
		craterDensity   1.04
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501
		volcanoTemp     247
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0186
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0058
		DustBright  0.0321
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.3749794
		SemiMajorAxis   6.79047442
		Eccentricity    0.970017117
		Inclination     150.527444
		AscendingNode   18.1929428
		ArgOfPericenter -146.910661
		MeanAnomaly     97.7851915
	}
}

Comet	"C119"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.76371606e-09
	Radius          10.7345247
	InertiaMoment   0.397557974
	Oblateness      0.00567448093
	RotationPeriod  34.203598
	RotationEpoch   0
	Obliquity       327.800903
	EqAscendNode    293.008514

	AbsMagn         6.07
	SlopeParam      6.05
	AlbedoBond      0.0352
	AlbedoGeom      0.0422
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.710 0.705 0.703)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.814
		Randomize      (0.821, 0.756, -0.756)
		colorDistMagn   0.603
		colorDistFreq   0.0604
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.937
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.368
		heightTempGrad  0.625
		beachWidth      0.000723
		tropicWidth     0.07
		mainFreq        0.424
		venusFreq       0.65
		venusMagn       0.857
		mareDensity     0
		terraceProb     0.377
		erosion         0
		montesMagn      0.676
		montesFreq      3.87
		montesSpiky     0.926
		montesFraction  0.381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.315
		hillsFraction   0.575
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.252
		craterDensity   0.945
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465
		volcanoTemp     256
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.5
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0783
		GasToDust   0.25
		Particles   2561
		GasBright   0.00654
		DustBright  0.00835
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.5273408
		SemiMajorAxis   6.81112503
		Eccentricity    0.968564431
		Inclination     139.749958
		AscendingNode   143.364251
		ArgOfPericenter -95.5927762
		MeanAnomaly     -80.8071048
	}
}

Comet	"C91"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.37205717e-13
	Radius          0.571784675
	InertiaMoment   0.397078484
	Oblateness      0.248999998
	RotationPeriod  6.48766422
	RotationEpoch   0
	Obliquity       172.718567
	EqAscendNode    308.477692

	AbsMagn         4.23
	SlopeParam      4.45
	AlbedoBond      0.0335
	AlbedoGeom      0.0402
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.682 0.553 0.444)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.857
		Randomize      (-0.040, 0.422, 0.582)
		colorDistMagn   0.518
		colorDistFreq   8.31e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.354
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.477
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        0.279
		venusFreq       0.622
		venusMagn       0.751
		mareDensity     0
		terraceProb     0.789
		erosion         0
		montesMagn      0.5
		montesFreq      2.85
		montesSpiky     0.759
		montesFraction  0.698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000622
		hillsFraction   0.651
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.221
		craterDensity   0.989
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531
		volcanoTemp     367
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.647
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0274
		GasToDust   0.25
		Particles   1534
		GasBright   0.0148
		DustBright  0.0268
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.6939901
		SemiMajorAxis   6.8336764
		Eccentricity    0.95239591
		Inclination     -166.371446
		AscendingNode   -66.6654328
		ArgOfPericenter -154.620707
		MeanAnomaly     173.42854
	}
}

Comet	"C60"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.9769679e-13
	Radius          0.631400049
	InertiaMoment   0.397959977
	RotationPeriod  101.518387
	RotationEpoch   0
	Obliquity       1.0202688
	EqAscendNode    29.8899899

	AbsMagn         5.49
	SlopeParam      3.14
	AlbedoBond      0.0451
	AlbedoGeom      0.0541
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.577 0.575 0.572)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.083
		Randomize      (-0.994, 0.266, 0.992)
		colorDistMagn   0.996
		colorDistFreq   0.000197
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0268
		icecapLatitude  0.997
		icecapHeight    0.00242
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.225
		heightTempGrad  0.625
		beachWidth      0.000655
		tropicWidth     0.07
		mainFreq        0.705
		venusFreq       0.626
		venusMagn       0.642
		mareDensity     0
		terraceProb     0.467
		erosion         0
		montesMagn      0.346
		montesFreq      3.17
		montesSpiky     0.962
		montesFraction  0.497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000926
		hillsFraction   0.801
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21
		craterFreq      0.19
		craterDensity   0.959
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.61
		volcanoTemp     268
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.944
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0316
		GasToDust   0.25
		Particles   1618
		GasBright   0.0158
		DustBright  0.0341
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          33.768785
		SemiMajorAxis   6.84378573
		Eccentricity    0.964960273
		Inclination     2.53106176
		AscendingNode   20.5592335
		ArgOfPericenter -156.840352
		MeanAnomaly     -162.233284
	}
}

Comet	"C134"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.59383037e-09
	Radius          20.7637196
	InertiaMoment   0.39507857
	Oblateness      0.00433687028
	RotationPeriod  54.1822243
	RotationEpoch   0
	Obliquity       50.880722
	EqAscendNode    323.292847

	AbsMagn         3.71
	SlopeParam      5.95
	AlbedoBond      0.0501
	AlbedoGeom      0.0601
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.728 0.726 0.725)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.898
		Randomize      (-0.717, -0.136, -0.115)
		colorDistMagn   0.288
		colorDistFreq   0.358
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.522
		icecapLatitude  0.948
		icecapHeight    0.0289
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.167
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.519
		venusFreq       0.653
		venusMagn       0.548
		mareDensity     0
		terraceProb     0.376
		erosion         0
		montesMagn      0.607
		montesFreq      3.43
		montesSpiky     0.975
		montesFraction  0.249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.784
		hillsFraction   0.687
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.217
		craterFreq      0.25
		craterDensity   1
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489
		volcanoTemp     259
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0854
		GasToDust   0.25
		Particles   2704
		GasBright   0.00598
		DustBright  0.0217
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          34.0060971
		SemiMajorAxis   6.87581169
		Eccentricity    0.978472677
		Inclination     -33.1968709
		AscendingNode   -176.579405
		ArgOfPericenter 170.048312
		MeanAnomaly     111.446509
	}
}

Comet	"C166"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.00211298e-10
	Radius          5.14755058
	InertiaMoment   0.396739125
	Oblateness      0.0137494337
	RotationPeriod  30.5638733
	RotationEpoch   0
	Obliquity       228.117676
	EqAscendNode    99.8995056

	AbsMagn         5.94
	SlopeParam      4.14
	AlbedoBond      0.0534
	AlbedoGeom      0.064
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.740 0.630 0.586)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.277
		Randomize      (0.267, -0.040, -0.215)
		colorDistMagn   0.771
		colorDistFreq   0.0122
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.914
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.272
		heightTempGrad  0.625
		beachWidth      0.00087
		tropicWidth     0.07
		mainFreq        0.405
		venusFreq       0.636
		venusMagn       0.684
		mareDensity     0
		terraceProb     0.682
		erosion         0
		montesMagn      0.682
		montesFreq      3.14
		montesSpiky     0.967
		montesFraction  0.302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0745
		hillsFraction   0.549
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.215
		craterDensity   0.948
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509
		volcanoTemp     172
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.37
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0629
		GasToDust   0.25
		Particles   2250
		GasBright   0.00617
		DustBright  0.0195
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          34.3388465
		SemiMajorAxis   6.92059203
		Eccentricity    0.976926038
		Inclination     -67.2857197
		AscendingNode   -157.676945
		ArgOfPericenter 147.840233
		MeanAnomaly     88.5831556
	}
}

Comet	"C33"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.91821883e-07
	Radius          63.7405434
	InertiaMoment   0.398595452
	Oblateness      0.0103787417
	RotationPeriod  35.1578236
	RotationEpoch   0
	Obliquity       211.476578
	EqAscendNode    263.378143

	AbsMagn         6.74
	SlopeParam      3.26
	AlbedoBond      0.0292
	AlbedoGeom      0.035
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.780 0.778 0.776)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.732
		Randomize      (0.175, -0.128, 0.639)
		colorDistMagn   0.0107
		colorDistFreq   2.94
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.888
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.187
		heightTempGrad  0.625
		beachWidth      0.000379
		tropicWidth     0.07
		mainFreq        0.428
		venusFreq       0.596
		venusMagn       0.622
		mareDensity     0
		terraceProb     0.198
		erosion         0
		montesMagn      0.431
		montesFreq      2.39
		montesSpiky     0.985
		montesFraction  0.619
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.8
		hillsFraction   0.471
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.225
		craterFreq      0.193
		craterDensity   0.929
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56
		volcanoTemp     263
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     150
		OuterRadius     342
		EdgeRadius      191
		MeanRadius      164
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     191
		RotationPeriod  14.1
		Brightness      1
		FrontBright     2.86
		BackBright      4.55
		Density         0.958
		Opacity         0.958
		SelfShadow      0.958
		PlanetShadow    0.958
		Hapke           1
		SpotBright      2.33
		SpotWidth       0.0273
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       713
		densityScale    2.43
		densityOffset   -1.8
		densityPower    4.96
		colorContrast   0.146
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00933
		DustBright  0.0334
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          34.4951061
		SemiMajorAxis   6.941571
		Eccentricity    0.976165438
		Inclination     148.684474
		AscendingNode   -90.2536111
		ArgOfPericenter 133.007154
		MeanAnomaly     -62.0207459
	}
}

Comet	"C80"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.08989866e-08
	Radius          18.5999756
	InertiaMoment   0.398182333
	Oblateness      0.00562423933
	RotationPeriod  31.5592747
	RotationEpoch   0
	Obliquity       111.793365
	EqAscendNode    70.2691422

	AbsMagn         6.63
	SlopeParam      6.33
	AlbedoBond      0.0463
	AlbedoGeom      0.0555
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.737 0.735 0.732)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.195
		Randomize      (-0.379, -0.924, -0.821)
		colorDistMagn   0.309
		colorDistFreq   0.225
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.999
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.491
		heightTempGrad  0.625
		beachWidth      0.00113
		tropicWidth     0.07
		mainFreq        0.41
		venusFreq       0.586
		venusMagn       0.849
		mareDensity     0
		terraceProb     0.292
		erosion         0
		montesMagn      0.433
		montesFreq      3.35
		montesSpiky     0.861
		montesFraction  0.572
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05
		hillsFraction   0.391
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.257
		craterDensity   0.931
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46
		volcanoTemp     318
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0881
		GasToDust   0.25
		Particles   2759
		GasBright   0.00026
		DustBright  0.0133
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          34.5569356
		SemiMajorAxis   6.9498633
		Eccentricity    0.966187042
		Inclination     104.872878
		AscendingNode   -28.1995056
		ArgOfPericenter -97.0141562
		MeanAnomaly     -83.3612205
	}
}

Comet	"C55"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.03998371e-17
	Radius          0.0346012972
	InertiaMoment   0.395967901
	Oblateness      0.00170476933
	RotationPeriod  86.7262173
	RotationEpoch   0
	Obliquity       333.326996
	EqAscendNode    19.7952023

	AbsMagn         16.6
	SlopeParam      4.6
	AlbedoBond      0.031
	AlbedoGeom      0.0372
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.513 0.410 0.356)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.055
		Randomize      (0.852, 0.564, -0.555)
		colorDistMagn   0.528
		colorDistFreq   7.15e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.722
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.159
		heightTempGrad  0.625
		beachWidth      0.000537
		tropicWidth     0.07
		mainFreq        0.657
		venusFreq       0.503
		venusMagn       0.491
		mareDensity     0
		terraceProb     0.174
		erosion         0
		montesMagn      0.566
		montesFreq      2.81
		montesSpiky     0.946
		montesFraction  0.312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62e-06
		hillsFraction   0.493
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.225
		craterDensity   0.682
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574
		volcanoTemp     360
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0388
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00739
		DustBright  0.0115
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          34.6117505
		SemiMajorAxis   6.9572107
		Eccentricity    0.964817359
		Inclination     133.585576
		AscendingNode   96.2412072
		ArgOfPericenter -59.636434
		MeanAnomaly     149.727151
	}
}

Comet	"C140"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.47660446e-18
	Radius          0.022605272
	InertiaMoment   0.398745775
	Oblateness      0.0157015771
	RotationPeriod  28.725935
	RotationEpoch   0
	Obliquity       84.112648
	EqAscendNode    191.406601

	AbsMagn         9.74
	SlopeParam      5.91
	AlbedoBond      0.0506
	AlbedoGeom      0.0608
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.520 0.382 0.310)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.532
		Randomize      (-0.533, -0.493, -0.259)
		colorDistMagn   0.871
		colorDistFreq   2.78e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.626
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.487
		heightTempGrad  0.625
		beachWidth      0.00104
		tropicWidth     0.07
		mainFreq        0.396
		venusFreq       0.596
		venusMagn       0.684
		mareDensity     0
		terraceProb     0.289
		erosion         0
		montesMagn      0.591
		montesFreq      2.47
		montesSpiky     0.939
		montesFraction  0.108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05e-06
		hillsFraction   0.601
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.25
		craterDensity   0.855
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559
		volcanoTemp     260
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0289
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00315
		DustBright  0.0217
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.1036021
		SemiMajorAxis   7.02296605
		Eccentricity    0.972932926
		Inclination     -59.3336117
		AscendingNode   -155.090519
		ArgOfPericenter 79.677166
		MeanAnomaly     -0.313470103
	}
}

Comet	"C84"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.28857166e-14
	Radius          0.25991106
	InertiaMoment   0.398224145
	Oblateness      0.00254653068
	RotationPeriod  71.2567234
	RotationEpoch   0
	Obliquity       133.947983
	EqAscendNode    222.344971

	AbsMagn         6.84
	SlopeParam      3.03
	AlbedoBond      0.0465
	AlbedoGeom      0.0558
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.530 0.525 0.523)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.618
		Randomize      (-0.256, 0.838, 0.417)
		colorDistMagn   0.703
		colorDistFreq   4.63e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.949
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.304
		heightTempGrad  0.625
		beachWidth      0.0008
		tropicWidth     0.07
		mainFreq        0.595
		venusFreq       0.543
		venusMagn       0.602
		mareDensity     0
		terraceProb     0.125
		erosion         0
		montesMagn      0.615
		montesFreq      4.09
		montesSpiky     0.955
		montesFraction  0.37
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.22e-05
		hillsFraction   0.767
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.218
		craterFreq      0.187
		craterDensity   0.926
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553
		volcanoTemp     272
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.305
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0147
		GasToDust   0.25
		Particles   1277
		GasBright   0.0176
		DustBright  0.0207
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.1207205
		SemiMajorAxis   7.02524905
		Eccentricity    0.944825224
		Inclination     81.8436041
		AscendingNode   -29.8375239
		ArgOfPericenter 20.5086678
		MeanAnomaly     -84.8098857
	}
}

Comet	"C145"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.30087409e-14
	Radius          0.407580316
	InertiaMoment   0.399479091
	Oblateness      0.00602555973
	RotationPeriod  35.9251442
	RotationEpoch   0
	Obliquity       111.805916
	EqAscendNode    201.501404

	AbsMagn         14.3
	SlopeParam      4.23
	AlbedoBond      0.0366
	AlbedoGeom      0.0439
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.560 0.556 0.550)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.56
		Randomize      (-0.379, -0.790, -0.712)
		colorDistMagn   0.502
		colorDistFreq   7.27e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.315
		icecapLatitude  0.895
		icecapHeight    0.024
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.153
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        0.432
		venusFreq       0.545
		venusMagn       0.862
		mareDensity     0
		terraceProb     0.17
		erosion         0
		montesMagn      0.389
		montesFreq      2.9
		montesSpiky     0.956
		montesFraction  0.441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000365
		hillsFraction   0.515
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.226
		craterFreq      0.217
		craterDensity   0.741
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576
		volcanoTemp     307
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.554
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0247
		GasToDust   0.25
		Particles   1479
		GasBright   0.000826
		DustBright  0.0149
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.2021517
		SemiMajorAxis   7.03610405
		Eccentricity    0.987174829
		Inclination     -55.4933922
		AscendingNode   -173.619526
		ArgOfPericenter 2.64655483
		MeanAnomaly     21.6621315
	}
}

Comet	"C48"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.1714544e-07
	Radius          98.7960587
	InertiaMoment   0.397813559
	Oblateness      0.00419811578
	RotationPeriod  55.0885906
	RotationEpoch   0
	Obliquity       294.556427
	EqAscendNode    293.662476

	AbsMagn         4.69
	SlopeParam      3.19
	AlbedoBond      0.0444
	AlbedoGeom      0.0532
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.847 0.808 0.750)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.816
		Randomize      (0.636, 0.980, -0.721)
		colorDistMagn   0.713
		colorDistFreq   3.84
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.999
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.386
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.523
		venusFreq       0.598
		venusMagn       0.661
		mareDensity     0
		terraceProb     0.197
		erosion         0
		montesMagn      0.394
		montesFreq      3.85
		montesSpiky     0.88
		montesFraction  0.551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.3
		hillsFraction   0.617
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.202
		craterFreq      0.292
		craterDensity   0.978
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419
		volcanoTemp     335
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     175
		OuterRadius     886
		EdgeRadius      462
		MeanRadius      270
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     462
		RotationPeriod  18.5
		Brightness      1
		FrontBright     2.64
		BackBright      4.96
		Density         0.96
		Opacity         0.96
		SelfShadow      0.96
		PlanetShadow    0.96
		Hapke           1
		SpotBright      2.29
		SpotWidth       0.0336
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       678
		densityScale    2.01
		densityOffset   -1.7
		densityPower    5.11
		colorContrast   0.0959
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00772
		DustBright  0.00787
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.2448191
		SemiMajorAxis   7.0417884
		Eccentricity    0.951742387
		Inclination     -148.546704
		AscendingNode   -97.3482809
		ArgOfPericenter -42.2855159
		MeanAnomaly     -173.33604
	}
}

Comet	"C4"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.5254403e-10
	Radius          8.50667953
	InertiaMoment   0.397133052
	Oblateness      0.00605357671
	RotationPeriod  46.0821419
	RotationEpoch   0
	Obliquity       50.8556061
	EqAscendNode    60.8283577

	AbsMagn         15.8
	SlopeParam      4.82
	AlbedoBond      0.042
	AlbedoGeom      0.0504
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.754 0.699 0.618)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.169
		Randomize      (-0.717, -0.402, -0.333)
		colorDistMagn   0.816
		colorDistFreq   0.0456
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.903
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.442
		heightTempGrad  0.625
		beachWidth      0.00132
		tropicWidth     0.07
		mainFreq        0.481
		venusFreq       0.583
		venusMagn       0.541
		mareDensity     0
		terraceProb     0.246
		erosion         0
		montesMagn      0.382
		montesFreq      2.97
		montesSpiky     0.977
		montesFraction  0.584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.145
		hillsFraction   0.596
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.229
		craterDensity   0.701
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.588
		volcanoTemp     280
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.98
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.071
		GasToDust   0.25
		Particles   2413
		GasBright   0.00349
		DustBright  0.0199
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.7633716
		SemiMajorAxis   7.11069009
		Eccentricity    0.96746639
		Inclination     -67.0184222
		AscendingNode   165.779193
		ArgOfPericenter 95.9445035
		MeanAnomaly     -10.3595364
	}
}

Comet	"C62"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.2369417e-16
	Radius          0.06064431
	InertiaMoment   0.399527639
	Oblateness      0.0125660989
	RotationPeriod  22.8663197
	RotationEpoch   0
	Obliquity       12.097578
	EqAscendNode    105.927902

	AbsMagn         11
	SlopeParam      6.48
	AlbedoBond      0.0452
	AlbedoGeom      0.0542
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.473 0.470 0.468)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.294
		Randomize      (-0.933, 0.147, -0.389)
		colorDistMagn   0.315
		colorDistFreq   3.14e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.946
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.332
		heightTempGrad  0.625
		beachWidth      0.000942
		tropicWidth     0.07
		mainFreq        0.367
		venusFreq       0.609
		venusMagn       0.681
		mareDensity     0
		terraceProb     0.15
		erosion         0
		montesMagn      0.468
		montesFreq      3.33
		montesSpiky     0.994
		montesFraction  0.656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.74e-06
		hillsFraction   0.752
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.266
		craterFreq      0.259
		craterDensity   0.824
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544
		volcanoTemp     385
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.082
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00637
		DustBright  0.0158
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          35.8943489
		SemiMajorAxis   7.12804064
		Eccentricity    0.95291828
		Inclination     63.2683016
		AscendingNode   -125.374418
		ArgOfPericenter -8.18928628
		MeanAnomaly     -146.764552
	}
}

Comet	"C10"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.46131427e-07
	Radius          48.1034775
	InertiaMoment   0.399143428
	Oblateness      0.0210466981
	RotationPeriod  18.5638018
	RotationEpoch   0
	Obliquity       84.087532
	EqAscendNode    288.942108

	AbsMagn         8.09
	SlopeParam      4.79
	AlbedoBond      0.0423
	AlbedoGeom      0.0508
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.776 0.775 0.772)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.803
		Randomize      (-0.533, -0.759, -0.477)
		colorDistMagn   0.542
		colorDistFreq   0.884
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.83
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.362
		heightTempGrad  0.625
		beachWidth      0.000978
		tropicWidth     0.07
		mainFreq        0.344
		venusFreq       0.695
		venusMagn       0.68
		mareDensity     0
		terraceProb     0.176
		erosion         0
		montesMagn      0.358
		montesFreq      3.44
		montesSpiky     0.941
		montesFraction  0.557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.06
		hillsFraction   0.48
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.212
		craterFreq      0.229
		craterDensity   0.896
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491
		volcanoTemp     281
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     103
		OuterRadius     140
		EdgeRadius      140
		MeanRadius      116
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     140
		RotationPeriod  9.71
		Brightness      1
		FrontBright     2.86
		BackBright      4.81
		Density         0.969
		Opacity         0.969
		SelfShadow      0.969
		PlanetShadow    0.969
		Hapke           1
		SpotBright      2.51
		SpotWidth       0.0239
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       672
		densityScale    2.22
		densityOffset   -1.42
		densityPower    5.12
		colorContrast   0.059
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00123
		DustBright  0.0192
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.3294494
		SemiMajorAxis   7.18552753
		Eccentricity    0.962297481
		Inclination     -102.717796
		AscendingNode   -14.4887766
		ArgOfPericenter -85.8949266
		MeanAnomaly     -167.761164
	}
}

Comet	"C83"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.90775872e-13
	Radius          0.810477257
	InertiaMoment   0.396905422
	Oblateness      0.049483005
	RotationPeriod  16.1236353
	RotationEpoch   0
	Obliquity       128.409332
	EqAscendNode    4.3260169

	AbsMagn         3.55
	SlopeParam      6.31
	AlbedoBond      0.033
	AlbedoGeom      0.0396
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.638 0.587 0.519)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.012
		Randomize      (-0.287, 0.898, 0.107)
		colorDistMagn   0.613
		colorDistFreq   3.14e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.539
		icecapLatitude  0.959
		icecapHeight    0.0202
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.451
		heightTempGrad  0.625
		beachWidth      0.000956
		tropicWidth     0.07
		mainFreq        0.332
		venusFreq       0.557
		venusMagn       0.577
		mareDensity     0
		terraceProb     0.535
		erosion         0
		montesMagn      0.426
		montesFreq      3.73
		montesSpiky     0.786
		montesFraction  0.558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00231
		hillsFraction   0.792
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.256
		craterDensity   1
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493
		volcanoTemp     319
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.932
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0331
		GasToDust   0.25
		Particles   1647
		GasBright   0.0153
		DustBright  0.0169
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.3639897
		SemiMajorAxis   7.19008125
		Eccentricity    0.969139625
		Inclination     100.600316
		AscendingNode   -14.7182889
		ArgOfPericenter -154.800846
		MeanAnomaly     -153.838052
	}
}

Comet	"C24"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.59587203e-17
	Radius          0.044794526
	InertiaMoment   0.397478729
	Oblateness      0.00232734322
	RotationPeriod  74.4357433
	RotationEpoch   0
	Obliquity       161.628708
	EqAscendNode    101.207512

	AbsMagn         2.46
	SlopeParam      3.3
	AlbedoBond      0.0431
	AlbedoGeom      0.0517
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.452 0.446 0.441)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.281
		Randomize      (-0.102, 0.408, -0.145)
		colorDistMagn   0.0171
		colorDistFreq   1.68e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.301
		icecapLatitude  0.985
		icecapHeight    0.00718
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.308
		heightTempGrad  0.625
		beachWidth      0.000587
		tropicWidth     0.07
		mainFreq        0.609
		venusFreq       0.52
		venusMagn       0.7
		mareDensity     0
		terraceProb     0.128
		erosion         0
		montesMagn      0.45
		montesFreq      3.13
		montesSpiky     0.891
		montesFraction  0.663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.15e-06
		hillsFraction   0.635
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.274
		craterFreq      0.194
		craterDensity   1.03
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455
		volcanoTemp     261
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0559
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00954
		DustBright  0.0176
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.6487497
		SemiMajorAxis   7.2275686
		Eccentricity    0.953815291
		Inclination     149.072574
		AscendingNode   70.5937761
		ArgOfPericenter 110.065686
		MeanAnomaly     -68.7092863
	}
}

Comet	"C47"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.65818351e-17
	Radius          0.0490466431
	InertiaMoment   0.395402133
	Oblateness      0.00130033947
	RotationPeriod  99.1954651
	RotationEpoch   0
	Obliquity       289.017761
	EqAscendNode    75.6435394

	AbsMagn         14.3
	SlopeParam      6.62
	AlbedoBond      0.0304
	AlbedoGeom      0.0364
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.563 0.441 0.338)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.21
		Randomize      (0.606, -0.960, 0.970)
		colorDistMagn   0.624
		colorDistFreq   1.29e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.746
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.133
		heightTempGrad  0.625
		beachWidth      0.000889
		tropicWidth     0.07
		mainFreq        0.698
		venusFreq       0.606
		venusMagn       0.642
		mareDensity     0
		terraceProb     0.151
		erosion         0
		montesMagn      0.494
		montesFreq      3.64
		montesSpiky     0.948
		montesFraction  0.745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.67e-06
		hillsFraction   0.631
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.215
		craterFreq      0.261
		craterDensity   0.74
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518
		volcanoTemp     172
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.056
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.000489
		DustBright  0.0489
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.6541177
		SemiMajorAxis   7.22827433
		Eccentricity    0.959948522
		Inclination     -23.4254919
		AscendingNode   88.0033574
		ArgOfPericenter -126.528133
		MeanAnomaly     -155.77604
	}
}

Comet	"C95"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.07468725e-08
	Radius          28.8719406
	InertiaMoment   0.397157371
	Oblateness      0.00208550831
	RotationPeriod  51.7380009
	RotationEpoch   0
	Obliquity       194.873199
	EqAscendNode    100.553505

	AbsMagn         4.54
	SlopeParam      6.22
	AlbedoBond      0.0337
	AlbedoGeom      0.0405
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.758 0.755 0.752)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.279
		Randomize      (0.083, 0.184, -0.180)
		colorDistMagn   0.884
		colorDistFreq   0.257
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.929
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29
		heightTempGrad  0.625
		beachWidth      0.000578
		tropicWidth     0.07
		mainFreq        0.508
		venusFreq       0.589
		venusMagn       0.546
		mareDensity     0
		terraceProb     0.291
		erosion         0
		montesMagn      0.396
		montesFreq      3.13
		montesSpiky     0.934
		montesFraction  0.505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71
		hillsFraction   0.595
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.255
		craterDensity   0.982
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484
		volcanoTemp     251
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0952
		GasToDust   0.25
		Particles   2902
		GasBright   0.00781
		DustBright  0.0186
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.757488
		SemiMajorAxis   7.24185785
		Eccentricity    0.964363721
		Inclination     77.2581274
		AscendingNode   49.5518473
		ArgOfPericenter 53.6696798
		MeanAnomaly     -111.233952
	}
}

Comet	"C161"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.0233232e-14
	Radius          0.202934951
	InertiaMoment   0.39959386
	Oblateness      0.0150392074
	RotationPeriod  22.7587881
	RotationEpoch   0
	Obliquity       200.424393
	EqAscendNode    89.8047104

	AbsMagn         0.472
	SlopeParam      5.78
	AlbedoBond      0.0375
	AlbedoGeom      0.045
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.530 0.522 0.517)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.249
		Randomize      (0.113, 0.258, 0.238)
		colorDistMagn   0.277
		colorDistFreq   2.32e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.893
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.205
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.366
		venusFreq       0.533
		venusMagn       0.58
		mareDensity     0
		terraceProb     0.216
		erosion         0
		montesMagn      0.545
		montesFreq      2.78
		montesSpiky     0.951
		montesFraction  0.718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000108
		hillsFraction   0.626
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.274
		craterFreq      0.248
		craterDensity   1.07
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     264
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.267
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0135
		GasToDust   0.25
		Particles   1252
		GasBright   0.0109
		DustBright  0.0238
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          36.7953601
		SemiMajorAxis   7.2468313
		Eccentricity    0.979903079
		Inclination     51.3985218
		AscendingNode   -150.451951
		ArgOfPericenter 170.426287
		MeanAnomaly     -19.3537527
	}
}

Comet	"C164"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            9.21626579e-08
	Radius          39.9801254
	InertiaMoment   0.398943841
	Oblateness      0.248999998
	RotationPeriod  2.9929533
	RotationEpoch   0
	Obliquity       217.040359
	EqAscendNode    23.8615894

	AbsMagn         11.2
	SlopeParam      5.76
	AlbedoBond      0.0531
	AlbedoGeom      0.0637
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.770 0.767 0.764)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0663
		Randomize      (0.206, 0.079, -0.834)
		colorDistMagn   0.59
		colorDistFreq   1.19
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.943
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.165
		heightTempGrad  0.625
		beachWidth      0.000883
		tropicWidth     0.07
		mainFreq        0.259
		venusFreq       0.663
		venusMagn       0.646
		mareDensity     0
		terraceProb     0.374
		erosion         0
		montesMagn      0.54
		montesFreq      2.99
		montesSpiky     0.931
		montesFraction  0.699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.37
		hillsFraction   0.582
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.251
		craterFreq      0.247
		craterDensity   0.818
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533
		volcanoTemp     264
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0996
		GasToDust   0.25
		Particles   2991
		GasBright   0.00359
		DustBright  0.00973
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          37.3830103
		SemiMajorAxis   7.32378569
		Eccentricity    0.959816909
		Inclination     -138.071072
		AscendingNode   -106.817003
		ArgOfPericenter -167.096205
		MeanAnomaly     -85.3483391
	}
}

Comet	"C40"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.13135913e-18
	Radius          0.0222941358
	InertiaMoment   0.397709042
	Oblateness      0.00346215232
	RotationPeriod  61.0561352
	RotationEpoch   0
	Obliquity       250.247177
	EqAscendNode    349.510834

	AbsMagn         4.09
	SlopeParam      4.66
	AlbedoBond      0.0439
	AlbedoGeom      0.0527
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.460 0.396 0.369)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.971
		Randomize      (0.390, -0.544, 0.804)
		colorDistMagn   0.806
		colorDistFreq   1.54e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.518
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36
		heightTempGrad  0.625
		beachWidth      0.000784
		tropicWidth     0.07
		mainFreq        0.551
		venusFreq       0.479
		venusMagn       0.782
		mareDensity     0
		terraceProb     0.175
		erosion         0
		montesMagn      0.603
		montesFreq      3.01
		montesSpiky     0.884
		montesFraction  0.415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.54e-07
		hillsFraction   0.737
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.226
		craterDensity   0.992
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536
		volcanoTemp     287
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0264
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00525
		DustBright  0.0408
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          37.4763273
		SemiMajorAxis   7.33596857
		Eccentricity    0.953518326
		Inclination     87.1663366
		AscendingNode   -168.558948
		ArgOfPericenter -178.094838
		MeanAnomaly     -144.541274
	}
}

Comet	"C130"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.22032086e-14
	Radius          0.250031739
	InertiaMoment   0.394005179
	Oblateness      0.0555311516
	RotationPeriod  10.881752
	RotationEpoch   0
	Obliquity       28.7261009
	EqAscendNode    171.217026

	AbsMagn         3.33
	SlopeParam      4.29
	AlbedoBond      0.0498
	AlbedoGeom      0.0597
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.538 0.535 0.532)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.476
		Randomize      (-0.840, 0.102, 0.647)
		colorDistMagn   0.781
		colorDistFreq   4.87e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.458
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.354
		heightTempGrad  0.625
		beachWidth      0.000502
		tropicWidth     0.07
		mainFreq        0.304
		venusFreq       0.541
		venusMagn       0.753
		mareDensity     0
		terraceProb     0.171
		erosion         0
		montesMagn      0.428
		montesFreq      3.1
		montesSpiky     0.899
		montesFraction  0.512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6e-05
		hillsFraction   0.755
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.218
		craterDensity   1.01
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537
		volcanoTemp     305
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.38
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0177
		GasToDust   0.25
		Particles   1336
		GasBright   0.0118
		DustBright  0.0311
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          37.8403246
		SemiMajorAxis   7.38339351
		Eccentricity    0.952844466
		Inclination     -54.1235957
		AscendingNode   6.78737165
		ArgOfPericenter -45.2130498
		MeanAnomaly     -166.717048
	}
}

Comet	"C18"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.13084686e-08
	Radius          33.4507332
	InertiaMoment   0.399204254
	Oblateness      0.0749278516
	RotationPeriod  9.62959099
	RotationEpoch   0
	Obliquity       128.396759
	EqAscendNode    233.093765

	AbsMagn         8.49
	SlopeParam      3.32
	AlbedoBond      0.0427
	AlbedoGeom      0.0513
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.762 0.758 0.755)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.647
		Randomize      (-0.287, 0.765, -0.002)
		colorDistMagn   0.441
		colorDistFreq   0.506
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.932
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.388
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        0.297
		venusFreq       0.593
		venusMagn       0.574
		mareDensity     0
		terraceProb     0.199
		erosion         0
		montesMagn      0.461
		montesFreq      2.68
		montesSpiky     0.939
		montesFraction  0.696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.69
		hillsFraction   0.724
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.195
		craterDensity   0.886
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529
		volcanoTemp     260
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0964
		GasToDust   0.25
		Particles   2927
		GasBright   0.0132
		DustBright  0.0167
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          37.982959
		SemiMajorAxis   7.40193573
		Eccentricity    0.964479522
		Inclination     40.6621142
		AscendingNode   -49.3129128
		ArgOfPericenter 28.8008182
		MeanAnomaly     6.87284309
	}
}

Comet	"C30"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.12988891e-14
	Radius          0.307306677
	InertiaMoment   0.399294168
	Oblateness      0.00570633775
	RotationPeriod  47.6968288
	RotationEpoch   0
	Obliquity       194.860611
	EqAscendNode    329.321259

	AbsMagn         9.11
	SlopeParam      3.27
	AlbedoBond      0.0434
	AlbedoGeom      0.0521
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.625 0.542 0.444)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.915
		Randomize      (0.083, 0.051, -0.289)
		colorDistMagn   0.718
		colorDistFreq   5.16e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.956
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.227
		heightTempGrad  0.625
		beachWidth      0.00145
		tropicWidth     0.07
		mainFreq        0.489
		venusFreq       0.621
		venusMagn       0.542
		mareDensity     0
		terraceProb     0.47
		erosion         0
		montesMagn      0.438
		montesFreq      3.78
		montesSpiky     0.756
		montesFraction  0.633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000261
		hillsFraction   0.543
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.193
		craterDensity   0.87
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519
		volcanoTemp     192
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.356
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0174
		GasToDust   0.25
		Particles   1332
		GasBright   0.00636
		DustBright  0.0179
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          38.6393916
		SemiMajorAxis   7.48697356
		Eccentricity    0.981593856
		Inclination     -120.923337
		AscendingNode   127.998665
		ArgOfPericenter 62.5852296
		MeanAnomaly     124.259355
	}
}

Comet	"C153"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.91452856e-14
	Radius          0.277103007
	InertiaMoment   0.399536669
	Oblateness      0.00791867636
	RotationPeriod  29.6508808
	RotationEpoch   0
	Obliquity       156.115158
	EqAscendNode    145.653061

	AbsMagn         16.4
	SlopeParam      2.71
	AlbedoBond      0.037
	AlbedoGeom      0.0444
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.542 0.539 0.536)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.405
		Randomize      (-0.133, 0.734, -0.237)
		colorDistMagn   0.397
		colorDistFreq   3.86e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.958
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.179
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.401
		venusFreq       0.615
		venusMagn       0.684
		mareDensity     0
		terraceProb     0.193
		erosion         0
		montesMagn      0.476
		montesFreq      3.58
		montesSpiky     0.953
		montesFraction  0.573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000185
		hillsFraction   0.75
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.176
		craterDensity   0.687
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462
		volcanoTemp     356
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.385
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0191
		GasToDust   0.25
		Particles   1366
		GasBright   0.0109
		DustBright  0.0143
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          39.5196031
		SemiMajorAxis   7.60024915
		Eccentricity    0.957490352
		Inclination     -77.0732416
		AscendingNode   67.5213556
		ArgOfPericenter 149.382166
		MeanAnomaly     -125.005421
	}
}

Comet	"C121"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.91774287e-12
	Radius          1.16234207
	InertiaMoment   0.399303496
	Oblateness      0.00273963856
	RotationPeriod  53.3648701
	RotationEpoch   0
	Obliquity       338.878204
	EqAscendNode    9.04640865

	AbsMagn         11.7
	SlopeParam      4.33
	AlbedoBond      0.0353
	AlbedoGeom      0.0423
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.607 0.603 0.599)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0251
		Randomize      (0.883, 0.637, -0.137)
		colorDistMagn   0.783
		colorDistFreq   0.000139
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.718
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.475
		heightTempGrad  0.625
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        0.515
		venusFreq       0.627
		venusMagn       0.547
		mareDensity     0
		terraceProb     0.728
		erosion         0
		montesMagn      0.447
		montesFreq      2.27
		montesSpiky     0.962
		montesFraction  0.552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0038
		hillsFraction   0.541
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.219
		craterDensity   0.807
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425
		volcanoTemp     303
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.67
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0416
		GasToDust   0.25
		Particles   1820
		GasBright   0.0112
		DustBright  0.0161
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          39.6054265
		SemiMajorAxis   7.61124865
		Eccentricity    0.959776025
		Inclination     66.7726301
		AscendingNode   -162.908948
		ArgOfPericenter 107.929452
		MeanAnomaly     -164.117146
	}
}

Comet	"C110"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.52336284e-07
	Radius          43.7187386
	InertiaMoment   0.399867088
	RotationPeriod  73.2823792
	RotationEpoch   0
	Obliquity       277.953003
	EqAscendNode    130.837875

	AbsMagn         -0.151
	SlopeParam      6.11
	AlbedoBond      0.0483
	AlbedoGeom      0.0579
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.776 0.775 0.774)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.363
		Randomize      (0.544, -0.708, 0.460)
		colorDistMagn   0.606
		colorDistFreq   1.14
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.489
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        0.604
		venusFreq       0.591
		venusMagn       0.602
		mareDensity     0
		terraceProb     0.29
		erosion         0
		montesMagn      0.332
		montesFreq      2.94
		montesSpiky     0.981
		montesFraction  0.432
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7
		hillsFraction   0.706
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.207
		craterFreq      0.253
		craterDensity   1.08
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506
		volcanoTemp     254
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     130
		OuterRadius     181
		EdgeRadius      181
		MeanRadius      147
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     181
		RotationPeriod  13.7
		Brightness      1
		FrontBright     2.41
		BackBright      2.99
		Density         0.338
		Opacity         0.338
		SelfShadow      0.169
		PlanetShadow    0.169
		Hapke           1
		SpotBright      0.784
		SpotWidth       0.0266
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.28
		densityScale    1.51
		densityOffset   -0.306
		densityPower    5.04
		colorContrast   0.114
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00286
		DustBright  0.0363
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          39.7108808
		SemiMajorAxis   7.62475325
		Eccentricity    0.977950528
		Inclination     88.7152285
		AscendingNode   40.709375
		ArgOfPericenter 137.427428
		MeanAnomaly     -85.2972531
	}
}

Comet	"C2"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.16198105e-07
	Radius          67.7508926
	InertiaMoment   0.399081767
	Oblateness      0.0105461841
	RotationPeriod  25.9711132
	RotationEpoch   0
	Obliquity       39.7782936
	EqAscendNode    344.790436

	AbsMagn         7.68
	SlopeParam      7.13
	AlbedoBond      0.0419
	AlbedoGeom      0.0503
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.793 0.789 0.788)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.958
		Randomize      (-0.779, -0.283, -0.952)
		colorDistMagn   0.636
		colorDistFreq   1.35
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.681
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.336
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.382
		venusFreq       0.599
		venusMagn       0.837
		mareDensity     0
		terraceProb     0.153
		erosion         0
		montesMagn      0.578
		montesFreq      2.82
		montesSpiky     0.943
		montesFraction  0.422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.89
		hillsFraction   0.625
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.267
		craterDensity   0.906
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446
		volcanoTemp     303
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     128
		OuterRadius     518
		EdgeRadius      154
		MeanRadius      137
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     154
		RotationPeriod  7.16
		Brightness      1
		FrontBright     2.96
		BackBright      4.18
		Density         0.952
		Opacity         0.952
		SelfShadow      0.952
		PlanetShadow    0.952
		Hapke           1
		SpotBright      2.4
		SpotWidth       0.0211
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.27
		densityScale    1.48
		densityOffset   -0.427
		densityPower    4.87
		colorContrast   0.0856
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00197
		DustBright  0.009
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          39.7680513
		SemiMajorAxis   7.63206956
		Eccentricity    0.962187387
		Inclination     32.1478762
		AscendingNode   -91.3197231
		ArgOfPericenter 2.87372218
		MeanAnomaly     147.388039
	}
}

Comet	"C103"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.43067078e-08
	Radius          20.9986286
	InertiaMoment   0.397303075
	Oblateness      0.00289263227
	RotationPeriod  45.9978304
	RotationEpoch   0
	Obliquity       239.182434
	EqAscendNode    44.7051697

	AbsMagn         5.09
	SlopeParam      4.4
	AlbedoBond      0.0342
	AlbedoGeom      0.0411
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.741 0.739 0.737)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.124
		Randomize      (0.329, -0.292, 0.295)
		colorDistMagn   0.788
		colorDistFreq   0.173
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.897
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.316
		heightTempGrad  0.625
		beachWidth      0.000527
		tropicWidth     0.07
		mainFreq        0.481
		venusFreq       0.66
		venusMagn       0.725
		mareDensity     0
		terraceProb     0.317
		erosion         0
		montesMagn      0.48
		montesFreq      2.21
		montesSpiky     0.931
		montesFraction  0.635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1
		hillsFraction   0.359
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.22
		craterDensity   0.969
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521
		volcanoTemp     229
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0895
		GasToDust   0.25
		Particles   2788
		GasBright   0.00635
		DustBright  0.0295
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          39.829984
		SemiMajorAxis   7.63999137
		Eccentricity    0.967868843
		Inclination     -122.366928
		AscendingNode   -125.940848
		ArgOfPericenter -4.92789413
		MeanAnomaly     82.0102512
	}
}

Comet	"C13"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            5.239456e-12
	Radius          1.92525184
	InertiaMoment   0.398410618
	RotationPeriod  114.750149
	RotationEpoch   0
	Obliquity       100.703491
	EqAscendNode    222.998993

	AbsMagn         5.62
	SlopeParam      4.78
	AlbedoBond      0.0271
	AlbedoGeom      0.0325
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.672 0.632 0.565)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.619
		Randomize      (-0.441, -0.938, 0.452)
		colorDistMagn   0.814
		colorDistFreq   0.00207
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.601
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.322
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.735
		venusFreq       0.638
		venusMagn       0.747
		mareDensity     0
		terraceProb     0.322
		erosion         0
		montesMagn      0.342
		montesFreq      4.05
		montesSpiky     0.92
		montesFraction  0.544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00841
		hillsFraction   0.868
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.228
		craterDensity   0.956
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521
		volcanoTemp     422
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.26
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.047
		GasToDust   0.25
		Particles   1929
		GasBright   0.000607
		DustBright  0.0384
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          40.8415447
		SemiMajorAxis   7.76880498
		Eccentricity    0.967799889
		Inclination     64.2912931
		AscendingNode   -130.446557
		ArgOfPericenter 8.99288532
		MeanAnomaly     167.427139
	}
}

Comet	"C63"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.06737186e-17
	Radius          0.0198577307
	InertiaMoment   0.396324247
	Oblateness      0.00114440289
	RotationPeriod  77.7172623
	RotationEpoch   0
	Obliquity       17.6362324
	EqAscendNode    323.946869

	AbsMagn         0.581
	SlopeParam      3.13
	AlbedoBond      0.0316
	AlbedoGeom      0.0379
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.421 0.419 0.416)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.9
		Randomize      (-0.902, 0.088, -0.080)
		colorDistMagn   0.427
		colorDistFreq   2.61e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.695
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.185
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.622
		venusFreq       0.6
		venusMagn       0.702
		mareDensity     0
		terraceProb     0.197
		erosion         0
		montesMagn      0.327
		montesFreq      3.42
		montesSpiky     0.944
		montesFraction  0.484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47e-07
		hillsFraction   0.732
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.189
		craterDensity   1.07
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     198
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0269
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00772
		DustBright  0.0207
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          41.3068685
		SemiMajorAxis   7.8277022
		Eccentricity    0.961483722
		Inclination     -60.8666353
		AscendingNode   128.796264
		ArgOfPericenter 6.79692929
		MeanAnomaly     23.7055691
	}
}

Comet	"C28"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.95882321e-11
	Radius          2.4199543
	InertiaMoment   0.397539377
	Oblateness      0.0088055376
	RotationPeriod  27.8865652
	RotationEpoch   0
	Obliquity       183.78331
	EqAscendNode    253.28334

	AbsMagn         2.95
	SlopeParam      4.72
	AlbedoBond      0.0433
	AlbedoGeom      0.0519
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.642 0.636 0.634)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.704
		Randomize      (0.021, 0.170, -0.908)
		colorDistMagn   0.536
		colorDistFreq   0.000334
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.846
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.121
		heightTempGrad  0.625
		beachWidth      0.000861
		tropicWidth     0.07
		mainFreq        0.392
		venusFreq       0.641
		venusMagn       0.841
		mareDensity     0
		terraceProb     0.321
		erosion         0
		montesMagn      0.648
		montesFreq      3.47
		montesSpiky     0.971
		montesFraction  0.476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0158
		hillsFraction   0.577
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.227
		craterDensity   1.02
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547
		volcanoTemp     285
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.33
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0541
		GasToDust   0.25
		Particles   2072
		GasBright   0.00346
		DustBright  0.00838
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          41.361588
		SemiMajorAxis   7.83461362
		Eccentricity    0.980012927
		Inclination     54.4139856
		AscendingNode   44.3664671
		ArgOfPericenter -141.378909
		MeanAnomaly     117.279278
	}
}

Comet	"C127"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.19260254e-10
	Radius          8.41798306
	InertiaMoment   0.397671729
	Oblateness      0.0118132383
	RotationPeriod  27.7880859
	RotationEpoch   0
	Obliquity       12.110136
	EqAscendNode    237.160156

	AbsMagn         6.51
	SlopeParam      4.3
	AlbedoBond      0.0356
	AlbedoGeom      0.0427
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.693 0.691 0.688)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.659
		Randomize      (-0.933, 0.280, -0.281)
		colorDistMagn   0.507
		colorDistFreq   0.0415
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.583
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.394
		heightTempGrad  0.625
		beachWidth      0.000372
		tropicWidth     0.07
		mainFreq        0.392
		venusFreq       0.576
		venusMagn       0.683
		mareDensity     0
		terraceProb     0.413
		erosion         0
		montesMagn      0.434
		montesFreq      2.89
		montesSpiky     0.923
		montesFraction  0.526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.23
		hillsFraction   0.846
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.218
		craterDensity   0.934
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     374
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.8
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0727
		GasToDust   0.25
		Particles   2447
		GasBright   0.00781
		DustBright  0.0166
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          41.4400276
		SemiMajorAxis   7.84451572
		Eccentricity    0.965645941
		Inclination     29.2360396
		AscendingNode   123.835873
		ArgOfPericenter -88.9003187
		MeanAnomaly     -157.991711
	}
}

Comet	"C99"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.81744432e-14
	Radius          0.403385997
	InertiaMoment   0.397232056
	Oblateness      0.00105854054
	RotationPeriod  110.313515
	RotationEpoch   0
	Obliquity       217.027817
	EqAscendNode    252.629349

	AbsMagn         4.82
	SlopeParam      2.96
	AlbedoBond      0.034
	AlbedoGeom      0.0408
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.519 0.454)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.702
		Randomize      (0.206, -0.054, -0.943)
		colorDistMagn   0.415
		colorDistFreq   5.74e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.941
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.103
		heightTempGrad  0.625
		beachWidth      0.000853
		tropicWidth     0.07
		mainFreq        0.726
		venusFreq       0.548
		venusMagn       0.644
		mareDensity     0
		terraceProb     0.124
		erosion         0
		montesMagn      0.574
		montesFreq      3.48
		montesSpiky     1
		montesFraction  0.225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000352
		hillsFraction   0.527
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27
		craterFreq      0.185
		craterDensity   0.975
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399
		volcanoTemp     205
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.449
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0218
		GasToDust   0.25
		Particles   1420
		GasBright   0.00264
		DustBright  0.00851
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          41.9304865
		SemiMajorAxis   7.90628954
		Eccentricity    0.964836884
		Inclination     102.383454
		AscendingNode   -137.076131
		ArgOfPericenter -2.29880492
		MeanAnomaly     106.721629
	}
}

Comet	"C107"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.69145788e-14
	Radius          0.284582525
	InertiaMoment   0.397370845
	Oblateness      0.00148771505
	RotationPeriod  93.0774536
	RotationEpoch   0
	Obliquity       261.337036
	EqAscendNode    196.780991

	AbsMagn         5.35
	SlopeParam      6.13
	AlbedoBond      0.0345
	AlbedoGeom      0.0414
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.594 0.550 0.467)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.547
		Randomize      (0.452, -0.530, -0.468)
		colorDistMagn   0.298
		colorDistFreq   3.46e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.98
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.129
		heightTempGrad  0.625
		beachWidth      0.0014
		tropicWidth     0.07
		mainFreq        0.679
		venusFreq       0.616
		venusMagn       0.497
		mareDensity     0
		terraceProb     0.148
		erosion         0
		montesMagn      0.35
		montesFreq      2.71
		montesSpiky     0.998
		montesFraction  0.448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000193
		hillsFraction   0.761
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.253
		craterDensity   0.962
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475
		volcanoTemp     323
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.311
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0162
		GasToDust   0.25
		Particles   1307
		GasBright   0.00243
		DustBright  0.0182
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          42.0714413
		SemiMajorAxis   7.9239983
		Eccentricity    0.977374239
		Inclination     159.487085
		AscendingNode   -154.36347
		ArgOfPericenter -49.7052587
		MeanAnomaly     -0.770308301
	}
}

Comet	"C77"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.21016063e-15
	Radius          0.0960561633
	InertiaMoment   0.398965776
	Oblateness      0.00353851239
	RotationPeriod  44.3789806
	RotationEpoch   0
	Obliquity       95.1774063
	EqAscendNode    136.21228

	AbsMagn         9
	SlopeParam      6.36
	AlbedoBond      0.0326
	AlbedoGeom      0.0391
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.495 0.491 0.486)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.378
		Randomize      (-0.471, -0.745, 0.251)
		colorDistMagn   0.889
		colorDistFreq   4.46e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.779
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.131
		heightTempGrad  0.625
		beachWidth      0.000395
		tropicWidth     0.07
		mainFreq        0.473
		venusFreq       0.611
		venusMagn       0.724
		mareDensity     0
		terraceProb     0.15
		erosion         0
		montesMagn      0.439
		montesFreq      3.11
		montesSpiky     0.895
		montesFraction  0.585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63e-05
		hillsFraction   0.511
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.257
		craterDensity   0.873
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599
		volcanoTemp     248
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.146
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00203
		GasToDust   0.25
		Particles   1020
		GasBright   0.00223
		DustBright  0.0328
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          42.8923936
		SemiMajorAxis   8.02674812
		Eccentricity    0.944896797
		Inclination     -69.3158251
		AscendingNode   1.24855338
		ArgOfPericenter 53.29373
		MeanAnomaly     150.900375
	}
}

Comet	"C90"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.16093939e-12
	Radius          1.78290033
	InertiaMoment   0.399726659
	Oblateness      0.0063650813
	RotationPeriod  45.1891165
	RotationEpoch   0
	Obliquity       167.179916
	EqAscendNode    90.458725

	AbsMagn         13.4
	SlopeParam      3.01
	AlbedoBond      0.0469
	AlbedoGeom      0.0563
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.723 0.575 0.506)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.251
		Randomize      (-0.071, 0.482, 0.273)
		colorDistMagn   0.418
		colorDistFreq   0.0014
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.986
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.223
		heightTempGrad  0.625
		beachWidth      0.00166
		tropicWidth     0.07
		mainFreq        0.477
		venusFreq       0.632
		venusMagn       0.725
		mareDensity     0
		terraceProb     0.464
		erosion         0
		montesMagn      0.597
		montesFreq      2.77
		montesSpiky     0.915
		montesFraction  0.326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00592
		hillsFraction   0.666
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.186
		craterDensity   0.763
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477
		volcanoTemp     274
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.98
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0458
		GasToDust   0.25
		Particles   1904
		GasBright   0.0131
		DustBright  0.0223
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          43.200325
		SemiMajorAxis   8.06511918
		Eccentricity    0.96756151
		Inclination     111.8835
		AscendingNode   -72.9461649
		ArgOfPericenter 169.875273
		MeanAnomaly     84.2189025
	}
}

Comet	"C64"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            8.84089459e-08
	Radius          49.2649002
	InertiaMoment   0.398006409
	Oblateness      0.00675587263
	RotationPeriod  43.5670052
	RotationEpoch   0
	Obliquity       23.1748867
	EqAscendNode    181.96582

	AbsMagn         5.73
	SlopeParam      4.56
	AlbedoBond      0.0453
	AlbedoGeom      0.0544
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.791 0.760 0.742)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.505
		Randomize      (-0.871, 0.028, 0.229)
		colorDistMagn   0.526
		colorDistFreq   1.27
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.992
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.438
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        0.469
		venusFreq       0.592
		venusMagn       0.724
		mareDensity     0
		terraceProb     0.243
		erosion         0
		montesMagn      0.548
		montesFreq      3.54
		montesSpiky     0.871
		montesFraction  0.193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.89
		hillsFraction   0.715
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.224
		craterDensity   0.953
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517
		volcanoTemp     222
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0993
		GasToDust   0.25
		Particles   2986
		GasBright   0.00889
		DustBright  0.0257
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          43.900961
		SemiMajorAxis   8.15208685
		Eccentricity    0.983915499
		Inclination     77.4458475
		AscendingNode   34.3473073
		ArgOfPericenter 76.7148338
		MeanAnomaly     43.6498896
	}
}

Comet	"C167"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.30443745e-12
	Radius          1.65107596
	InertiaMoment   0.398153186
	Oblateness      0.00166706776
	RotationPeriod  88.040966
	RotationEpoch   0
	Obliquity       233.656326
	EqAscendNode    317.918457

	AbsMagn         8.57
	SlopeParam      5.74
	AlbedoBond      0.0378
	AlbedoGeom      0.0453
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.697 0.599 0.525)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.883
		Randomize      (0.298, -0.099, 0.094)
		colorDistMagn   0.863
		colorDistFreq   0.000786
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.653
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.125
		heightTempGrad  0.625
		beachWidth      0.000713
		tropicWidth     0.07
		mainFreq        0.661
		venusFreq       0.626
		venusMagn       0.705
		mareDensity     0
		terraceProb     0.146
		erosion         0
		montesMagn      0.534
		montesFreq      3.21
		montesSpiky     0.909
		montesFraction  0.682
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00779
		hillsFraction   0.53
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.247
		craterDensity   0.884
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.604
		volcanoTemp     265
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.17
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0445
		GasToDust   0.25
		Particles   1879
		GasBright   0.00718
		DustBright  0.0247
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          43.9765495
		SemiMajorAxis   8.16144167
		Eccentricity    0.96672856
		Inclination     162.075652
		AscendingNode   99.1112727
		ArgOfPericenter 36.2562666
		MeanAnomaly     -132.884966
	}
}

Comet	"C56"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.51797672e-07
	Radius          69.7746048
	InertiaMoment   0.397912413
	Oblateness      0.00525873853
	RotationPeriod  49.3109093
	RotationEpoch   0
	Obliquity       338.865662
	EqAscendNode    237.814163

	AbsMagn         5.23
	SlopeParam      6.54
	AlbedoBond      0.0448
	AlbedoGeom      0.0538
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.820 0.781 0.745)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.661
		Randomize      (0.883, 0.504, -0.246)
		colorDistMagn   0.621
		colorDistFreq   2.25
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.944
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.412
		heightTempGrad  0.625
		beachWidth      0.00128
		tropicWidth     0.07
		mainFreq        0.496
		venusFreq       0.688
		venusMagn       0.544
		mareDensity     0
		terraceProb     0.22
		erosion         0
		montesMagn      0.478
		montesFreq      2.88
		montesSpiky     0.875
		montesFraction  0.688
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.8
		hillsFraction   0.461
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.234
		craterFreq      0.26
		craterDensity   0.965
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48
		volcanoTemp     314
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     120
		OuterRadius     144
		EdgeRadius      144
		MeanRadius      128
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     144
		RotationPeriod  8.36
		Brightness      1
		FrontBright     2.76
		BackBright      1.94
		Density         0.181
		Opacity         0.181
		SelfShadow      0.0903
		PlanetShadow    0.0903
		Hapke           1
		SpotBright      0.781
		SpotWidth       0.0136
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       694
		densityScale    2.06
		densityOffset   -1.69
		densityPower    4.85
		colorContrast   0.0514
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00943
		DustBright  0.0157
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          44.4981518
		SemiMajorAxis   8.22584956
		Eccentricity    0.965368126
		Inclination     -89.4577654
		AscendingNode   38.0654579
		ArgOfPericenter -88.7307947
		MeanAnomaly     138.930481
	}
}

Comet	"C144"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            2.51734657e-12
	Radius          1.12649369
	InertiaMoment   0.398779601
	Oblateness      0.00115926401
	RotationPeriod  68.2496109
	RotationEpoch   0
	Obliquity       106.267265
	EqAscendNode    343.482452

	AbsMagn         9.97
	SlopeParam      2.75
	AlbedoBond      0.051
	AlbedoGeom      0.0612
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.611 0.607 0.603)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.954
		Randomize      (-0.410, -0.731, 0.979)
		colorDistMagn   0.4
		colorDistFreq   0.000729
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.992
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3
		heightTempGrad  0.625
		beachWidth      0.000712
		tropicWidth     0.07
		mainFreq        0.582
		venusFreq       0.558
		venusMagn       0.789
		mareDensity     0
		terraceProb     0.122
		erosion         0
		montesMagn      0.491
		montesFreq      2.83
		montesSpiky     0.788
		montesFraction  0.614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00275
		hillsFraction   0.536
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.178
		craterDensity   0.849
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503
		volcanoTemp     284
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0431
		GasToDust   0.25
		Particles   1850
		GasBright   0.00334
		DustBright  0.0462
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          44.9005839
		SemiMajorAxis   8.27537036
		Eccentricity    0.969140961
		Inclination     -9.04296384
		AscendingNode   165.595482
		ArgOfPericenter -55.942262
		MeanAnomaly     31.2801908
	}
}

Comet	"C92"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.52431764e-15
	Radius          0.183362395
	InertiaMoment   0.398305535
	Oblateness      0.00310229836
	RotationPeriod  64.5699978
	RotationEpoch   0
	Obliquity       178.257217
	EqAscendNode    166.496628

	AbsMagn         7.26
	SlopeParam      6.24
	AlbedoBond      0.047
	AlbedoGeom      0.0564
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.517 0.512 0.504)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.462
		Randomize      (-0.010, 0.363, 0.892)
		colorDistMagn   0.611
		colorDistFreq   2.57e-05
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.578
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33
		heightTempGrad  0.625
		beachWidth      0.00135
		tropicWidth     0.07
		mainFreq        0.566
		venusFreq       0.613
		venusMagn       0.786
		mareDensity     0
		terraceProb     0.149
		erosion         0
		montesMagn      0.404
		montesFreq      2.92
		montesSpiky     0.953
		montesFraction  0.518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.53e-05
		hillsFraction   0.637
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24
		craterFreq      0.255
		craterDensity   0.916
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447
		volcanoTemp     181
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.211
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.00911
		GasToDust   0.25
		Particles   1163
		GasBright   0.0163
		DustBright  0.0315
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          45.0866908
		SemiMajorAxis   8.29822145
		Eccentricity    0.96853571
		Inclination     146.03449
		AscendingNode   25.212083
		ArgOfPericenter -52.6332167
		MeanAnomaly     19.8831829
	}
}

Comet	"C68"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.04524638e-13
	Radius          0.454539359
	InertiaMoment   0.398051798
	Oblateness      0.00109530822
	RotationPeriod  88.1976128
	RotationEpoch   0
	Obliquity       45.3295097
	EqAscendNode    334.041656

	AbsMagn         5.96
	SlopeParam      6.43
	AlbedoBond      0.0455
	AlbedoGeom      0.0546
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.564 0.559 0.553)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.928
		Randomize      (-0.748, -0.210, -0.533)
		colorDistMagn   0.892
		colorDistFreq   0.000115
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.436
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.252
		heightTempGrad  0.625
		beachWidth      0.000903
		tropicWidth     0.07
		mainFreq        0.662
		venusFreq       0.553
		venusMagn       0.492
		mareDensity     0
		terraceProb     0.537
		erosion         0
		montesMagn      0.457
		montesFreq      2.31
		montesSpiky     0.96
		montesFraction  0.627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000524
		hillsFraction   0.655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.258
		craterDensity   0.948
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47
		volcanoTemp     176
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.641
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.026
		GasToDust   0.25
		Particles   1504
		GasBright   0.00382
		DustBright  0.0155
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          45.3628069
		SemiMajorAxis   8.33206648
		Eccentricity    0.98138609
		Inclination     -160.020415
		AscendingNode   -16.1239096
		ArgOfPericenter 154.425608
		MeanAnomaly     -30.1015175
	}
}

Comet	"C31"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.02324462e-16
	Radius          0.0985469371
	InertiaMoment   0.399942189
	Oblateness      0.107075572
	RotationPeriod  11.0247059
	RotationEpoch   0
	Obliquity       200.399277
	EqAscendNode    187.340225

	AbsMagn         12.4
	SlopeParam      4.7
	AlbedoBond      0.029
	AlbedoGeom      0.0348
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.572 0.440 0.392)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.52
		Randomize      (0.113, -0.009, 0.020)
		colorDistMagn   0.809
		colorDistFreq   3.94e-06
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.966
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.481
		heightTempGrad  0.625
		beachWidth      0.000992
		tropicWidth     0.07
		mainFreq        0.304
		venusFreq       0.612
		venusMagn       0.574
		mareDensity     0
		terraceProb     0.102
		erosion         0
		montesMagn      0.634
		montesFreq      4.38
		montesSpiky     0.953
		montesFraction  0.461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72e-05
		hillsFraction   0.523
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.227
		craterDensity   0.789
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423
		volcanoTemp     285
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.116
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00754
		DustBright  0.0229
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          45.577899
		SemiMajorAxis   8.3583839
		Eccentricity    0.979915266
		Inclination     -72.9507487
		AscendingNode   100.006624
		ArgOfPericenter -29.8310703
		MeanAnomaly     -37.2356466
	}
}

Comet	"C94"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            4.91942963e-18
	Radius          0.0156321116
	InertiaMoment   0.399754852
	RotationPeriod  91.3618298
	RotationEpoch   0
	Obliquity       189.334534
	EqAscendNode    242.534546

	AbsMagn         14
	SlopeParam      4.44
	AlbedoBond      0.0472
	AlbedoGeom      0.0566
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.412 0.406 0.402)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.674
		Randomize      (0.052, 0.244, -0.490)
		colorDistMagn   0.791
		colorDistFreq   1.15e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.483
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.436
		heightTempGrad  0.625
		beachWidth      0.00133
		tropicWidth     0.07
		mainFreq        0.673
		venusFreq       0.597
		venusMagn       0.496
		mareDensity     0
		terraceProb     0.242
		erosion         0
		montesMagn      0.495
		montesFreq      3.06
		montesSpiky     0.986
		montesFraction  0.681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.92e-07
		hillsFraction   0.609
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.221
		craterDensity   0.749
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591
		volcanoTemp     228
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0227
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00628
		DustBright  0.0139
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          46.6062187
		SemiMajorAxis   8.48363599
		Eccentricity    0.957694449
		Inclination     -144.790426
		AscendingNode   -159.564762
		ArgOfPericenter -89.9006918
		MeanAnomaly     55.9694761
	}
}

Comet	"C143"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            7.63417593e-11
	Radius          4.70141315
	InertiaMoment   0.397879094
	Oblateness      0.0862646922
	RotationPeriod  12.2287331
	RotationEpoch   0
	Obliquity       100.728607
	EqAscendNode    125.463478

	AbsMagn         7.35
	SlopeParam      5.89
	AlbedoBond      0.0365
	AlbedoGeom      0.0438
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.663 0.658 0.655)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.349
		Randomize      (-0.440, -0.671, 0.669)
		colorDistMagn   0.284
		colorDistFreq   0.0159
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.873
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.446
		heightTempGrad  0.625
		beachWidth      0.00117
		tropicWidth     0.07
		mainFreq        0.311
		venusFreq       0.569
		venusMagn       0.753
		mareDensity     0
		terraceProb     0.525
		erosion         0
		montesMagn      0.583
		montesFreq      2.75
		montesSpiky     0.918
		montesFraction  0.896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0473
		hillsFraction   0.554
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.249
		craterDensity   0.914
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439
		volcanoTemp     260
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.19
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0614
		GasToDust   0.25
		Particles   2220
		GasBright   0.00356
		DustBright  0.0398
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          47.9778373
		SemiMajorAxis   8.64927871
		Eccentricity    0.959721461
		Inclination     96.611333
		AscendingNode   64.0393326
		ArgOfPericenter -124.878693
		MeanAnomaly     19.2171016
	}
}

Comet	"C3"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.37239775e-08
	Radius          21.4509335
	InertiaMoment   0.399746001
	Oblateness      0.00103601883
	RotationPeriod  81.3958282
	RotationEpoch   0
	Obliquity       45.3169441
	EqAscendNode    202.809402

	AbsMagn         10.4
	SlopeParam      3.39
	AlbedoBond      0.0258
	AlbedoGeom      0.031
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.741 0.738 0.735)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.563
		Randomize      (-0.748, -0.343, -0.642)
		colorDistMagn   0.726
		colorDistFreq   0.368
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.433
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.189
		heightTempGrad  0.625
		beachWidth      0.00147
		tropicWidth     0.07
		mainFreq        0.637
		venusFreq       0.591
		venusMagn       0.484
		mareDensity     0
		terraceProb     0.199
		erosion         0
		montesMagn      0.488
		montesFreq      2.9
		montesSpiky     0.87
		montesFraction  0.806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.908
		hillsFraction   0.611
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.196
		craterDensity   0.84
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506
		volcanoTemp     257
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0893
		GasToDust   0.25
		Particles   2784
		GasBright   0.00282
		DustBright  0.0143
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          48.1081495
		SemiMajorAxis   8.66493311
		Eccentricity    0.976196604
		Inclination     160.303858
		AscendingNode   24.5115661
		ArgOfPericenter -40.5045656
		MeanAnomaly     22.8635124
	}
}

Comet	"C70"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.13652604e-16
	Radius          0.0430239365
	InertiaMoment   0.399584889
	Oblateness      0.030058559
	RotationPeriod  14.9113483
	RotationEpoch   0
	Obliquity       56.4068184
	EqAscendNode    50.079567

	AbsMagn         11.5
	SlopeParam      4.54
	AlbedoBond      0.0456
	AlbedoGeom      0.0548
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.460 0.453 0.449)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.139
		Randomize      (-0.687, -0.329, 0.085)
		colorDistMagn   0.176
		colorDistFreq   3.89e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.62
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.358
		heightTempGrad  0.625
		beachWidth      0.00149
		tropicWidth     0.07
		mainFreq        0.325
		venusFreq       0.515
		venusMagn       0.576
		mareDensity     0
		terraceProb     0.173
		erosion         0
		montesMagn      0.537
		montesFreq      2.57
		montesSpiky     0.992
		montesFraction  0.89
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.81e-06
		hillsFraction   0.627
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.223
		craterDensity   0.81
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435
		volcanoTemp     363
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0557
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.00532
		DustBright  0.0264
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          48.5743924
		SemiMajorAxis   8.72082754
		Eccentricity    0.978564895
		Inclination     89.4016031
		AscendingNode   -111.601733
		ArgOfPericenter 169.700676
		MeanAnomaly     -16.9436052
	}
}

Comet	"C124"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            6.87592296e-17
	Radius          0.0454197265
	InertiaMoment   0.398606658
	Oblateness      0.00769231142
	RotationPeriod  41.0300188
	RotationEpoch   0
	Obliquity       355.494171
	EqAscendNode    303.103302

	AbsMagn         8.89
	SlopeParam      4.32
	AlbedoBond      0.0493
	AlbedoGeom      0.0592
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.531 0.458 0.362)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.842
		Randomize      (0.975, 0.459, 0.791)
		colorDistMagn   0.15
		colorDistFreq   8.57e-07
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.643
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.434
		heightTempGrad  0.625
		beachWidth      0.00144
		tropicWidth     0.07
		mainFreq        0.457
		venusFreq       0.601
		venusMagn       0.624
		mareDensity     0
		terraceProb     0.241
		erosion         0
		montesMagn      0.441
		montesFreq      2.65
		montesSpiky     0.944
		montesFraction  0.539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.11e-06
		hillsFraction   0.468
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.269
		craterFreq      0.219
		craterDensity   0.876
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474
		volcanoTemp     163
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.0486
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0167
		DustBright  0.0291
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          50.4255765
		SemiMajorAxis   8.94101235
		Eccentricity    0.964867786
		Inclination     37.7367717
		AscendingNode   4.8875154
		ArgOfPericenter -163.445002
		MeanAnomaly     -87.308822
	}
}

Comet	"C19"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            1.69187775e-09
	Radius          11.2640467
	InertiaMoment   0.399858296
	Oblateness      0.00182475918
	RotationPeriod  66.4817562
	RotationEpoch   0
	Obliquity       133.935425
	EqAscendNode    91.1127319

	AbsMagn         11.4
	SlopeParam      4.76
	AlbedoBond      0.0278
	AlbedoGeom      0.0333
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.710 0.707 0.702)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.253
		Randomize      (-0.256, 0.705, 0.308)
		colorDistMagn   0.539
		colorDistFreq   0.0351
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.858
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.241
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.575
		venusFreq       0.585
		venusMagn       0.599
		mareDensity     0
		terraceProb     0.245
		erosion         0
		montesMagn      0.286
		montesFreq      2.77
		montesSpiky     0.86
		montesFraction  0.517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.308
		hillsFraction   0.708
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.228
		craterDensity   0.813
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443
		volcanoTemp     283
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.7
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0781
		GasToDust   0.25
		Particles   2557
		GasBright   0.0154
		DustBright  0.0207
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          51.0490245
		SemiMajorAxis   9.01455747
		Eccentricity    0.967767151
		Inclination     24.1357937
		AscendingNode   156.991218
		ArgOfPericenter 171.525521
		MeanAnomaly     163.615912
	}
}

Planet	"9"
{
	ParentBody     "Konta Clara"
	Class          "Jupiter"
	Mass            66.5682068
	Radius          53754.5
	InertiaMoment   0.213768736
	Oblateness      0.0707223713
	RotationPeriod  12.7386687
	RotationEpoch   0
	Obliquity       41.5377599
	EqAscendNode    48.9645913

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_frigid_default.cfg"
		SurfStyle       0.336
		Randomize      (0.393, -0.324, 0.211)
		detailScale     256
		tropicLatitude  0.604
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.456
		stripeZones     5.14
		stripeFluct     0.405
		stripeTwist     9.7
		cycloneMagn     17.7
		cycloneFreq     0.735
		cycloneDensity  0.502
		cycloneOctaves  5
		cycloneMagn2     0.543
		cycloneFreq2     0.949
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      20
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.959
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          35.6
		Velocity        184
		BumpHeight      7.83
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.959
		ModulateBright  1
		mainFreq        1.3
		mainOctaves     12
		Coverage        0.0954
		stripeZones     5.14
		stripeFluct     0.405
		stripeTwist     9.7
	}

	Clouds
	{
		Height          51.3
		Velocity        292
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.959
		ModulateBright  1
		Opacity         0.7
		mainFreq        1.3
		mainOctaves     12
		Coverage        0.0954
		stripeZones     5.14
		stripeFluct     0.405
		stripeTwist     9.7
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          176.501953
		Density         0.0118204057
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.000696
		Saturation      0.948

		Composition
		{
			H2        	91.3
			He        	8.21
			CH4       	0.402
			N2        	0.0394
			NH3       	0.032
			O2        	0.00778
			C2H2      	0.00333
			C2H4      	0.00142
			Ne        	0.00117
			Ar        	0.000909
			C2H6      	0.000626
			C8H18     	0.00043
			C3H8      	0.000359
			H2O       	4.19e-06
			CO2       	2.14e-06
			H2S       	1.84e-06
			Kr        	3.98e-07
			Xe        	4.33e-08
			SO2       	1.2e-08
			CO        	3.51e-10
			Cl2       	3.45e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  303
	}

	Aurora
	{
		Height         247
		NorthLat       86.5
		NorthLon       1.79
		NorthRadius    1.65e+04
		NorthWidth     9.73e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 64.7
		NorthMoveSpeed 1.11
		NorthParticles 10000
		SouthLat       -86.2
		SouthLon       175
		SouthRadius    1.45e+04
		SouthWidth     9.18e+03
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 64.2
		SouthMoveSpeed 1.15
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     7.35e+04
		OuterRadius     1.6e+05
		EdgeRadius      1.6e+05
		MeanRadius      1.02e+05
		Thickness       0.13
		RocksMaxSize    0.00518
		RocksSpacing    1
		DustDrawDist    389
		ChartRadius     1.6e+05
		RotationPeriod  13.5
		Brightness      1
		FrontBright     2.53
		BackBright      4.84
		Density         0.959
		Opacity         0.959
		SelfShadow      0.959
		PlanetShadow    0.959
		Hapke           1
		SpotBright      2.67
		SpotWidth       0.0206
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       743
		densityScale    2.23
		densityOffset   -1.87
		densityPower    0.998
		colorContrast   0.121
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          51.2778937
		SemiMajorAxis   9.04362402
		Eccentricity    0.110058052
		Inclination     4.43115745
		AscendingNode   42.353695
		ArgOfPericenter 296.256925
		MeanAnomaly     114.942972
	}
}

DwarfMoon	"9.D1"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.00088093e-09
	Radius          8.82738304
	InertiaMoment   0.399279296
	Oblateness     (0.348, 0.561, 0.000)
	Obliquity       -0.0102889133
	EqAscendNode    178.135458
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.772 0.770 0.769)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.38
		Randomize      (0.091, -0.967, 0.089)
		colorDistMagn   0.876
		colorDistFreq   0.0249
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.604
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.461
		heightTempGrad  0.625
		beachWidth      0.000852
		tropicWidth     0.07
		mainFreq        0.425
		venusFreq       0.609
		venusMagn       0.0732
		mareDensity     0
		terraceProb     0.594
		erosion         0
		montesMagn      0.449
		montesFreq      3.64
		montesSpiky     0.934
		montesFraction  0.931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.209
		hillsFraction   0.515
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.214
		craterFreq      0.264
		craterDensity   0.663
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     259
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.94
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

	NoAtmosphere    true

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
		PeriodDays      0.423045375
		SemiMajorAxisKm 96477.6321
		Eccentricity    9.54353899e-05
		Inclination     -0.0102889133
		AscendingNode   178.135458
		ArgOfPericenter -117.159295
		MeanAnomaly     -112.132219
	}
}

DwarfMoon	"9.D2"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.43285839e-09
	Radius          12.4885263
	InertiaMoment   0.399214625
	Oblateness     (0.347, 0.544, 0.000)
	Obliquity       0.00904637044
	EqAscendNode    -133.688207
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.555 0.552 0.548)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.949
		Randomize      (0.361, 0.863, 0.422)
		colorDistMagn   0.891
		colorDistFreq   0.0957
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.604
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.359
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        0.672
		venusFreq       0.625
		venusMagn       0.142
		mareDensity     0
		terraceProb     0.21
		erosion         0
		montesMagn      0.563
		montesFreq      2.89
		montesSpiky     0.886
		montesFraction  0.335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.377
		hillsFraction   0.633
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.218
		craterDensity   0.871
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574
		volcanoTemp     152
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.2
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

	NoAtmosphere    true

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
		PeriodDays      0.467227989
		SemiMajorAxisKm 103083.203
		Eccentricity    6.10658363e-06
		Inclination     0.00904637044
		AscendingNode   -133.688207
		ArgOfPericenter 14.2201829
		MeanAnomaly     -117.785429
	}
}

Moon	"9.1"
{
	ParentBody     "9"
	Class          "Aquaria"
	Mass            0.000377739518
	Radius          664.154236
	InertiaMoment   0.398638576
	Oblateness      0.00774772139
	Obliquity       0.683758968
	EqAscendNode    5.15465093
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.736 0.734 0.730)

	Surface
	{
		Preset         "aquaria_airless_triton.cfg"
		SurfStyle       0.518
		Randomize      (0.631, 0.693, 0.755)
		colorDistMagn   0.0849
		colorDistFreq   69.2
		detailScale     2.05e+03
		drivenDarkening 0.7
		seaLevel        0.273
		snowLevel       2
		tropicLatitude  0.613
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.256
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        1.78
		venusFreq       1.34
		venusMagn       0
		mareFreq        0.042
		mareDensity     0.187
		terraceProb     0.339
		erosion         0
		montesMagn      0.054
		montesFreq      21.1
		montesSpiky     0.909
		montesFraction  0.198
		dunesMagn       0.0477
		dunesFreq       5.09
		dunesFraction   0.316
		hillsMagn       0.103
		hillsFreq       17.3
		hillsFraction   0.804
		hills2Fraction  0.0855
		riversMagn      0
		riversFreq      2
		riversSin       6.47
		riftsMagn       0
		riftsFreq       4.88
		riftsSin        4.86
		canyonsMagn     0.627
		canyonsFreq     0.213
		canyonsFraction 0
		cracksMagn      0.0445
		cracksFreq      0.164
		cracksOctaves   0
		craterMagn      0.606
		craterFreq      2.18
		craterDensity   0.878
		craterOctaves   18
		craterRayedFactor 0.19
		volcanoMagn     0.187
		volcanoFreq     0.812
		volcanoDensity  0.328
		volcanoOctaves  3
		volcanoActivity 0.418
		volcanoFlows    0.256
		volcanoRadius   0.165
		volcanoTemp     351
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      1.28517972
		SemiMajorAxisKm 202369.663
		Eccentricity    0.000513442819
		Inclination     0.683758968
		AscendingNode   5.15465093
		ArgOfPericenter 101.859347
		MeanAnomaly     -109.678847
	}
}

Moon	"9.2"
{
	ParentBody     "9"
	Class          "Aquaria"
	Mass            0.00172147725
	Radius          1023.42529
	InertiaMoment   0.396975935
	Oblateness      0.00141010457
	Obliquity       -0.171446841
	EqAscendNode    171.897608
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.521 0.511 0.507)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.0874
		Randomize      (0.902, 0.523, -0.912)
		colorDistMagn   0.0864
		colorDistFreq   130
		detailScale     4.1e+03
		drivenDarkening 0.7
		seaLevel        0.266
		snowLevel       2
		tropicLatitude  0.606
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.154
		heightTempGrad  0.625
		beachWidth      0.0013
		tropicWidth     0.07
		mainFreq        1.55
		venusFreq       1.56
		venusMagn       0
		mareFreq        0.334
		mareDensity     0.146
		terraceProb     0.69
		erosion         0
		montesMagn      0.0583
		montesFreq      55.7
		montesSpiky     0.859
		montesFraction  0.702
		dunesMagn       0.0287
		dunesFreq       10.6
		dunesFraction   0.047
		hillsMagn       0.129
		hillsFreq       32.4
		hillsFraction   0.34
		hills2Fraction  0.144
		riversMagn      0
		riversFreq      4.03
		riversSin       6.64
		riftsMagn       0
		riftsFreq       1.99
		riftsSin        5.37
		canyonsMagn     0.557
		canyonsFreq     0.377
		canyonsFraction 0
		cracksMagn      0.0601
		cracksFreq      0.481
		cracksOctaves   0
		craterMagn      0.568
		craterFreq      2.83
		craterDensity   0.956
		craterOctaves   18
		craterRayedFactor 0.116
		volcanoMagn     0.186
		volcanoFreq     0.622
		volcanoDensity  0.347
		volcanoOctaves  3
		volcanoActivity 0.773
		volcanoFlows    0.00497
		volcanoRadius   0.157
		volcanoTemp     215
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      2.69090095
		SemiMajorAxisKm 331210.6
		Eccentricity    0.00279865951
		Inclination     -0.171446841
		AscendingNode   171.897608
		ArgOfPericenter -124.409524
		MeanAnomaly     -49.5013829
	}
}

Moon	"9.3"
{
	ParentBody     "9"
	Class          "Aquaria"
	Mass            0.000111004279
	Radius          454.089508
	InertiaMoment   0.399402142
	Obliquity       -1.04323919
	EqAscendNode    -24.8274338
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.700 0.694 0.690)

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
		SurfStyle       0.656
		Randomize      (-0.828, 0.353, -0.579)
		colorDistMagn   0.0882
		colorDistFreq   45
		detailScale     2.05e+03
		drivenDarkening 0.7
		seaLevel        0.26
		snowLevel       2
		tropicLatitude  0.591
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.452
		heightTempGrad  0.625
		beachWidth      0.000743
		tropicWidth     0.07
		mainFreq        1.86
		venusFreq       0.449
		venusMagn       0
		mareFreq        0
		mareDensity     0.192
		terraceProb     0.219
		erosion         0
		montesMagn      0.0628
		montesFreq      21.5
		montesSpiky     0.995
		montesFraction  0.205
		dunesMagn       0.0383
		dunesFreq       3.8
		dunesFraction   0.778
		hillsMagn       0.111
		hillsFreq       12.7
		hillsFraction   0.875
		hills2Fraction  0.203
		riversMagn      0
		riversFreq      3.56
		riversSin       6.83
		riftsMagn       0
		riftsFreq       2.27
		riftsSin        5.75
		canyonsMagn     0.508
		canyonsFreq     0.209
		canyonsFraction 0
		cracksMagn      0.0271
		cracksFreq      0.113
		cracksOctaves   0
		craterMagn      0.671
		craterFreq      0.987
		craterDensity   0.814
		craterOctaves   17
		craterRayedFactor 0
		volcanoMagn     0.185
		volcanoFreq     0.716
		volcanoDensity  0.177
		volcanoOctaves  3
		volcanoActivity 0.21
		volcanoFlows    0.245
		volcanoRadius   0.151
		volcanoTemp     290
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      5.63431582
		SemiMajorAxisKm 542079.578
		Eccentricity    0.0315686653
		Inclination     -1.04323919
		AscendingNode   -24.8274338
		ArgOfPericenter -7.02051421
		MeanAnomaly     40.7131812
	}
}

Moon	"9.4"
{
	ParentBody     "9"
	Class          "Aquaria"
	Mass            0.00662196055
	Radius          1601.9585
	InertiaMoment   0.384511203
	Obliquity       -1.30390564
	EqAscendNode    -138.488881
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.486 0.476 0.467)

	Surface
	{
		Preset         "aquaria_airless_ganymede.cfg"
		SurfStyle       0.226
		Randomize      (-0.558, 0.183, -0.246)
		colorDistMagn   0.0902
		colorDistFreq   199
		detailScale     4.1e+03
		drivenDarkening 0.7
		seaLevel        0.255
		snowLevel       2
		tropicLatitude  0.618
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       0.667
		venusMagn       0
		mareFreq        0.758
		mareDensity     0.149
		terraceProb     0.35
		erosion         0
		montesMagn      0.0782
		montesFreq      64.6
		montesSpiky     0.969
		montesFraction  0.709
		dunesMagn       0.0462
		dunesFreq       19.2
		dunesFraction   0.51
		hillsMagn       0.135
		hillsFreq       38
		hillsFraction   0.41
		hills2Fraction  0.261
		riversMagn      0
		riversFreq      3.26
		riversSin       7.06
		riftsMagn       0
		riftsFreq       2.46
		riftsSin        6.1
		canyonsMagn     0.462
		canyonsFreq     0.525
		canyonsFraction 0
		cracksMagn      0.0463
		cracksFreq      0.754
		cracksOctaves   2
		craterMagn      0.617
		craterFreq      4.98
		craterDensity   0.898
		craterOctaves   19
		craterRayedFactor 0.168
		volcanoMagn     0.213
		volcanoFreq     0.834
		volcanoDensity  0.302
		volcanoOctaves  3
		volcanoActivity 0.44
		volcanoFlows    0.415
		volcanoRadius   0.167
		volcanoTemp     225
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      11.7966363
		SemiMajorAxisKm 887200.677
		Eccentricity    0.0193637488
		Inclination     -1.30390564
		AscendingNode   -138.488881
		ArgOfPericenter -60.6903805
		MeanAnomaly     -39.8501589
	}
}

Moon	"9.5"
{
	ParentBody     "9"
	Class          "Aquaria"
	Mass            0.000616603415
	Radius          863.521484
	InertiaMoment   0.39575839
	Obliquity       -0.974472807
	EqAscendNode    -121.536608
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.660 0.658 0.655)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.795
		Randomize      (-0.287, 0.013, 0.087)
		colorDistMagn   0.0925
		colorDistFreq   78.4
		detailScale     4.1e+03
		drivenDarkening 0.518
		seaLevel        0.25
		snowLevel       2
		tropicLatitude  0.611
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.247
		heightTempGrad  0.625
		beachWidth      0.000839
		tropicWidth     0.07
		mainFreq        1.95
		venusFreq       0.814
		venusMagn       0
		mareFreq        0.244
		mareDensity     0.199
		terraceProb     0.106
		erosion         0
		montesMagn      0.0728
		montesFreq      54.3
		montesSpiky     0.94
		montesFraction  0.212
		dunesMagn       0.026
		dunesFreq       7.77
		dunesFraction   0.241
		hillsMagn       0.117
		hillsFreq       25.9
		hillsFraction   0.945
		hills2Fraction  0.0196
		riversMagn      0
		riversFreq      3.01
		riversSin       7.37
		riftsMagn       0
		riftsFreq       2.62
		riftsSin        6.46
		canyonsMagn     0.404
		canyonsFreq     0.324
		canyonsFraction 0
		cracksMagn      0.0621
		cracksFreq      0.215
		cracksOctaves   0
		craterMagn      0.579
		craterFreq      2.27
		craterDensity   0.981
		craterOctaves   18
		craterRayedFactor 0.0929
		volcanoMagn     0.183
		volcanoFreq     0.635
		volcanoDensity  0.177
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.234
		volcanoRadius   0.137
		volcanoTemp     230
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      24.7010832
		SemiMajorAxisKm 1452047.03
		Eccentricity    0.00773992359
		Inclination     -0.974472807
		AscendingNode   -121.536608
		ArgOfPericenter 35.5021751
		MeanAnomaly     -77.1883207
	}
}

DwarfMoon	"9.6"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.66878999e-07
	Radius          58.5125961
	InertiaMoment   0.399143338
	Obliquity       0.107490743
	EqAscendNode    70.2603537
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.442 0.440 0.435)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.364
		Randomize      (-0.017, -0.157, 0.420)
		colorDistMagn   0.982
		colorDistFreq   1.77
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.604
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.145
		heightTempGrad  0.625
		beachWidth      0.000887
		tropicWidth     0.07
		mainFreq        0.477
		venusFreq       0.592
		venusMagn       0.752
		mareDensity     0
		terraceProb     0.228
		erosion         0
		montesMagn      0.474
		montesFreq      3.01
		montesSpiky     0.967
		montesFraction  0.111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.4
		hillsFraction   0.601
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.216
		craterFreq      0.259
		craterDensity   0.951
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407
		volcanoTemp     353
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

	NoAtmosphere    true

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
		PeriodDays      51.71973
		SemiMajorAxisKm 2376509.21
		Eccentricity    0.0398980027
		Inclination     0.107490743
		AscendingNode   70.2603537
		ArgOfPericenter -56.2816104
		MeanAnomaly     -119.690447
	}
}

DwarfMoon	"9.D3"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.395723e-08
	Radius          22.4957294
	InertiaMoment   0.398732781
	RotationPeriod  485.058484
	RotationEpoch   0
	Obliquity       66.7884402
	EqAscendNode    99.0095085

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.624 0.618 0.616)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.933
		Randomize      (0.254, -0.327, 0.753)
		colorDistMagn   0.998
		colorDistFreq   0.422
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.92
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.443
		heightTempGrad  0.625
		beachWidth      0.000634
		tropicWidth     0.07
		mainFreq        0.766
		venusFreq       0.608
		venusMagn       0.744
		mareDensity     0
		terraceProb     0.362
		erosion         0
		montesMagn      0.596
		montesFreq      2.04
		montesSpiky     0.931
		montesFraction  0.347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.938
		hillsFraction   0.704
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.215
		craterDensity   0.77
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485
		volcanoTemp     246
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

	NoAtmosphere    true

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
		PeriodDays      812.255005
		SemiMajorAxisKm 14903797.2
		Eccentricity    0.179801964
		Inclination     26.4675637
		AscendingNode   95.1870606
		ArgOfPericenter 116.241094
		MeanAnomaly     -72.8925602
	}
}

DwarfMoon	"9.D4"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.89775946e-08
	Radius          29.5229225
	InertiaMoment   0.398658276
	RotationPeriod  718.322899
	RotationEpoch   0
	Obliquity       107.830111
	EqAscendNode    8.96615646

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.494 0.377 0.308)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.502
		Randomize      (0.524, -0.497, -0.914)
		colorDistMagn   0.0297
		colorDistFreq   0.421
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.582
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34
		heightTempGrad  0.625
		beachWidth      0.000982
		tropicWidth     0.07
		mainFreq        0.546
		venusFreq       0.624
		venusMagn       0.737
		mareDensity     0
		terraceProb     0.115
		erosion         0
		montesMagn      0.444
		montesFreq      3.05
		montesSpiky     0.882
		montesFraction  0.442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.69
		hillsFraction   0.371
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.146
		craterDensity   0.893
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531
		volcanoTemp     210
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

	NoAtmosphere    true

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
		PeriodDays      820.247134
		SemiMajorAxisKm 15001400.9
		Eccentricity    0.478765473
		Inclination     171.213276
		AscendingNode   11.8304445
		ArgOfPericenter -113.554657
		MeanAnomaly     155.668291
	}
}

DwarfMoon	"9.D5"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.57664237e-08
	Radius          32.6864777
	InertiaMoment   0.398581833
	RotationPeriod  813.270106
	RotationEpoch   0
	Obliquity       -68.5981275
	EqAscendNode    114.630876

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.693 0.571 0.471)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0709
		Randomize      (0.794, -0.667, -0.581)
		colorDistMagn   0.0615
		colorDistFreq   0.831
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.998
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.238
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.378
		venusFreq       0.644
		venusMagn       0.73
		mareDensity     0
		terraceProb     0.236
		erosion         0
		montesMagn      0.558
		montesFreq      2.22
		montesSpiky     0.998
		montesFraction  0.518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.83
		hillsFraction   0.584
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.228
		craterDensity   1
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43
		volcanoTemp     243
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

	NoAtmosphere    true

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
		PeriodDays      825.206344
		SemiMajorAxisKm 15061805.7
		Eccentricity    0.48881104
		Inclination     -21.5068242
		AscendingNode   114.183022
		ArgOfPericenter 77.9255322
		MeanAnomaly     19.5982355
	}
}

DwarfMoon	"9.D6"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.49636124e-08
	Radius          30.2014236
	InertiaMoment   0.398503304
	RotationPeriod  358.765857
	RotationEpoch   0
	Obliquity       47.4572074
	EqAscendNode    -59.5435102

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.787 0.765 0.740)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.64
		Randomize      (-0.935, -0.837, -0.248)
		colorDistMagn   0.0909
		colorDistFreq   0.409
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.948
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.136
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.62
		venusFreq       0.675
		venusMagn       0.724
		mareDensity     0
		terraceProb     0.374
		erosion         0
		montesMagn      0.406
		montesFreq      3.1
		montesSpiky     0.966
		montesFraction  0.589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.18
		hillsFraction   0.687
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.18
		craterDensity   0.833
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491
		volcanoTemp     346
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

	NoAtmosphere    true

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
		PeriodDays      831.302184
		SemiMajorAxisKm 15135889.5
		Eccentricity    0.136734925
		Inclination     38.278993
		AscendingNode   -63.3041967
		ArgOfPericenter 19.895672
		MeanAnomaly     -53.0562563
	}
}

DwarfMoon	"9.D7"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.74571316e-08
	Radius          40.0537186
	InertiaMoment   0.39842236
	RotationPeriod  562.679466
	RotationEpoch   0
	Obliquity       143.09663
	EqAscendNode    92.2255171

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.606 0.557 0.483)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.209
		Randomize      (-0.665, 0.993, 0.085)
		colorDistMagn   0.118
		colorDistFreq   1.17
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.778
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.434
		heightTempGrad  0.625
		beachWidth      0.00143
		tropicWidth     0.07
		mainFreq        0.457
		venusFreq       0.521
		venusMagn       0.717
		mareDensity     0
		terraceProb     0.125
		erosion         0
		montesMagn      0.527
		montesFreq      2.33
		montesSpiky     0.93
		montesFraction  0.665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44
		hillsFraction   0.859
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.282
		craterFreq      0.24
		craterDensity   0.933
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539
		volcanoTemp     170
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

	NoAtmosphere    true

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
		PeriodDays      837.467639
		SemiMajorAxisKm 15210635.5
		Eccentricity    0.0995611742
		Inclination     157.63287
		AscendingNode   100.151985
		ArgOfPericenter -99.2118382
		MeanAnomaly     7.42730557
	}
}

DwarfMoon	"9.D8"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            6.44889724e-08
	Radius          33.8926392
	InertiaMoment   0.398338735
	RotationPeriod  329.219987
	RotationEpoch   0
	Obliquity       178.188797
	EqAscendNode    -27.8125072

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.772 0.704 0.679)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.778
		Randomize      (-0.394, 0.824, 0.418)
		colorDistMagn   0.144
		colorDistFreq   0.473
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.582
		icecapLatitude  0.982
		icecapHeight    0.0153
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.331
		heightTempGrad  0.625
		beachWidth      0.000574
		tropicWidth     0.07
		mainFreq        0.721
		venusFreq       0.554
		venusMagn       0.711
		mareDensity     0
		terraceProb     0.245
		erosion         0
		montesMagn      0.346
		montesFreq      3.14
		montesSpiky     0.88
		montesFraction  0.764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1
		hillsFraction   0.566
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.198
		craterDensity   0.709
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444
		volcanoTemp     273
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

	NoAtmosphere    true

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
		PeriodDays      842.047545
		SemiMajorAxisKm 15266040.5
		Eccentricity    0.440213503
		Inclination     176.439997
		AscendingNode   -23.1986383
		ArgOfPericenter -119.579686
		MeanAnomaly     51.649639
	}
}

DwarfMoon	"9.D9"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            8.78120119e-08
	Radius          49.1540031
	InertiaMoment   0.39825213
	RotationPeriod  520.667714
	RotationEpoch   0
	Obliquity       -11.11461
	EqAscendNode    128.637383

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.607 0.476 0.406)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.347
		Randomize      (-0.124, 0.654, 0.751)
		colorDistMagn   0.169
		colorDistFreq   1.67
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.703
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.229
		heightTempGrad  0.625
		beachWidth      0.000922
		tropicWidth     0.07
		mainFreq        0.526
		venusFreq       0.574
		venusMagn       0.705
		mareDensity     0
		terraceProb     0.387
		erosion         0
		montesMagn      0.498
		montesFreq      2.42
		montesSpiky     0.997
		montesFraction  0.167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34
		hillsFraction   0.671
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.217
		craterFreq      0.255
		craterDensity   0.876
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498
		volcanoTemp     237
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

	NoAtmosphere    true

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
		PeriodDays      850.32839
		SemiMajorAxisKm 15365963.2
		Eccentricity    0.184882039
		Inclination     -29.1471259
		AscendingNode   129.938454
		ArgOfPericenter 76.4587873
		MeanAnomaly     50.3990216
	}
}

DwarfMoon	"9.D10"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.19925573e-07
	Radius          44.2174301
	InertiaMoment   0.398162097
	RotationPeriod  302.029501
	RotationEpoch   0
	Obliquity       207.336229
	EqAscendNode    53.7847994

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.762 0.677 0.614)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.916
		Randomize      (0.146, 0.484, -0.916)
		colorDistMagn   0.192
		colorDistFreq   0.729
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.841
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.127
		heightTempGrad  0.625
		beachWidth      0.000969
		tropicWidth     0.07
		mainFreq        0.35
		venusFreq       0.591
		venusMagn       0.7
		mareDensity     0
		terraceProb     0.134
		erosion         0
		montesMagn      0.644
		montesFreq      3.18
		montesSpiky     0.965
		montesFraction  0.358
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.14
		hillsFraction   0.809
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.251
		craterFreq      0.212
		craterDensity   0.978
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548
		volcanoTemp     270
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     87.9
		OuterRadius     162
		EdgeRadius      162
		MeanRadius      113
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     162
		RotationPeriod  11.2
		Brightness      1
		FrontBright     2.98
		BackBright      4.66
		Density         0.97
		Opacity         0.97
		SelfShadow      0.97
		PlanetShadow    0.97
		Hapke           1
		SpotBright      2.39
		SpotWidth       0.0137
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.7
		densityScale    1.48
		densityOffset   -0.464
		densityPower    5.1
		colorContrast   0.0778
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      857.402041
		SemiMajorAxisKm 15451062.3
		Eccentricity    0.329779176
		Inclination     173.017112
		AscendingNode   56.7732593
		ArgOfPericenter -169.702969
		MeanAnomaly     -125.525261
	}
}

DwarfMoon	"9.D11"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.64433047e-07
	Radius          60.5575027
	InertiaMoment   0.39806819
	RotationPeriod  476.479578
	RotationEpoch   0
	Obliquity       187.911094
	EqAscendNode    151.382302

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.597 0.470 0.341)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.485
		Randomize      (0.417, 0.314, -0.583)
		colorDistMagn   0.214
		colorDistFreq   2.4
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.507
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.424
		heightTempGrad  0.625
		beachWidth      0.00132
		tropicWidth     0.07
		mainFreq        0.597
		venusFreq       0.607
		venusMagn       0.694
		mareDensity     0
		terraceProb     0.254
		erosion         0
		montesMagn      0.47
		montesFreq      2.49
		montesSpiky     0.928
		montesFraction  0.45
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.71
		hillsFraction   0.546
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.275
		craterDensity   0.81
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454
		volcanoTemp     164
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     96.4
		OuterRadius     659
		EdgeRadius      202
		MeanRadius      131
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     202
		RotationPeriod  12.4
		Brightness      1
		FrontBright     2.64
		BackBright      2.06
		Density         0.169
		Opacity         0.169
		SelfShadow      0.0844
		PlanetShadow    0.0844
		Hapke           1
		SpotBright      0.888
		SpotWidth       0.0229
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       697
		densityScale    2.29
		densityOffset   -1.47
		densityPower    4.94
		colorContrast   0.0659
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      863.407388
		SemiMajorAxisKm 15523125.7
		Eccentricity    0.368854933
		Inclination     217.304937
		AscendingNode   156.057836
		ArgOfPericenter 60.9942931
		MeanAnomaly     -66.2857356
	}
}

DwarfMoon	"9.D12"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.26597507e-07
	Radius          54.9777107
	InertiaMoment   0.397969812
	RotationPeriod  276.816297
	RotationEpoch   0
	Obliquity       167.671996
	EqAscendNode    80.1027074

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.688 0.657 0.613)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0543
		Randomize      (0.687, 0.144, -0.250)
		colorDistMagn   0.235
		colorDistFreq   0.994
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.596
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.322
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.436
		venusFreq       0.623
		venusMagn       0.688
		mareDensity     0
		terraceProb     0.401
		erosion         0
		montesMagn      0.589
		montesFreq      3.22
		montesSpiky     0.877
		montesFraction  0.525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.44
		hillsFraction   0.655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.261
		craterFreq      0.224
		craterDensity   0.915
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     337
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     102
		OuterRadius     309
		EdgeRadius      201
		MeanRadius      135
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     201
		RotationPeriod  10.8
		Brightness      1
		FrontBright     2.49
		BackBright      4.35
		Density         0.965
		Opacity         0.965
		SelfShadow      0.965
		PlanetShadow    0.965
		Hapke           1
		SpotBright      2.27
		SpotWidth       0.0148
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.08
		densityScale    1.58
		densityOffset   -0.364
		densityPower    5.06
		colorContrast   0.086
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      870.298646
		SemiMajorAxisKm 15605614.5
		Eccentricity    0.396995749
		Inclination     140.782442
		AscendingNode   81.4657639
		ArgOfPericenter -101.761846
		MeanAnomaly     -34.4118753
	}
}

DwarfMoon	"9.D13"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.14216578e-07
	Radius          75.1045837
	InertiaMoment   0.397866249
	RotationPeriod  433.252844
	RotationEpoch   0
	Obliquity       90.4341987
	EqAscendNode    -54.2769714

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.493 0.451 0.370)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.623
		Randomize      (0.957, -0.026, 0.083)
		colorDistMagn   0.256
		colorDistFreq   3.5
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.936
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22
		heightTempGrad  0.625
		beachWidth      0.000813
		tropicWidth     0.07
		mainFreq        0.686
		venusFreq       0.642
		venusMagn       0.683
		mareDensity     0
		terraceProb     0.143
		erosion         0
		montesMagn      0.439
		montesFreq      2.56
		montesSpiky     0.996
		montesFraction  0.596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.2
		hillsFraction   0.777
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.175
		craterDensity   1.05
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559
		volcanoTemp     300
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     111
		OuterRadius     454
		EdgeRadius      251
		MeanRadius      158
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     251
		RotationPeriod  12
		Brightness      1
		FrontBright     2.94
		BackBright      4.33
		Density         0.963
		Opacity         0.963
		SelfShadow      0.963
		PlanetShadow    0.963
		Hapke           1
		SpotBright      2.52
		SpotWidth       0.0368
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.18
		densityScale    1.67
		densityOffset   -0.157
		densityPower    4.91
		colorContrast   0.0561
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      878.286185
		SemiMajorAxisKm 15700953.8
		Eccentricity    0.2533049
		Inclination     47.2635528
		AscendingNode   -51.2269204
		ArgOfPericenter -165.027743
		MeanAnomaly     115.31837
	}
}

DwarfMoon	"9.D14"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.39032419e-07
	Radius          75.1378937
	InertiaMoment   0.397756636
	RotationPeriod  451.389625
	RotationEpoch   0
	Obliquity       73.1642217
	EqAscendNode    97.0470913

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.681 0.588 0.544)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.192
		Randomize      (-0.772, -0.196, 0.416)
		colorDistMagn   0.275
		colorDistFreq   1.56
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.956
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.117
		heightTempGrad  0.625
		beachWidth      0.00146
		tropicWidth     0.07
		mainFreq        0.506
		venusFreq       0.672
		venusMagn       0.678
		mareDensity     0
		terraceProb     0.263
		erosion         0
		montesMagn      0.553
		montesFreq      3.27
		montesSpiky     0.964
		montesFraction  0.673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.9
		hillsFraction   0.525
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.294
		craterFreq      0.237
		craterDensity   0.858
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     334
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

	NoAtmosphere    true

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
		PeriodDays      886.173682
		SemiMajorAxisKm 15794815.9
		Eccentricity    0.325360398
		Inclination     53.7053029
		AscendingNode   91.7851699
		ArgOfPericenter -41.917485
		MeanAnomaly     -165.017315
	}
}

DwarfMoon	"9.D15"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            6.19057346e-07
	Radius          81.1794662
	InertiaMoment   0.397639841
	RotationPeriod  210.6484
	RotationEpoch   0
	Obliquity       48.9552613
	EqAscendNode    -106.292574

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.837 0.785 0.750)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.762
		Randomize      (-0.502, -0.366, 0.749)
		colorDistMagn   0.294
		colorDistFreq   3.87
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.753
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.415
		heightTempGrad  0.625
		beachWidth      0.00181
		tropicWidth     0.07
		mainFreq        0.318
		venusFreq       0.517
		venusMagn       0.672
		mareDensity     0
		terraceProb     0.416
		erosion         0
		montesMagn      0.399
		montesFreq      2.61
		montesSpiky     0.927
		montesFraction  0.777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.2
		hillsFraction   0.639
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.2
		craterDensity   0.957
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     87.2
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

	NoAtmosphere    true

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
		PeriodDays      890.28499
		SemiMajorAxisKm 15843630.4
		Eccentricity    0.429377381
		Inclination     133.209347
		AscendingNode   -104.867613
		ArgOfPericenter -123.121372
		MeanAnomaly     -39.0696494
	}
}

DwarfMoon	"9.D16"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            8.82508232e-07
	Radius          105.843742
	InertiaMoment   0.397514373
	RotationPeriod  408.856411
	RotationEpoch   0
	Obliquity       44.7778226
	EqAscendNode    0.24441972

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.679 0.571 0.471)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.331
		Randomize      (-0.231, -0.536, -0.918)
		colorDistMagn   0.313
		colorDistFreq   2.34
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.99
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.313
		heightTempGrad  0.625
		beachWidth      0.000657
		tropicWidth     0.07
		mainFreq        0.576
		venusFreq       0.553
		venusMagn       0.667
		mareDensity     0
		terraceProb     0.152
		erosion         0
		montesMagn      0.522
		montesFreq      3.32
		montesSpiky     0.875
		montesFraction  0.203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.5
		hillsFraction   0.752
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.219
		craterFreq      0.439
		craterDensity   0.78
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574
		volcanoTemp     331
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     168
		OuterRadius     1e+03
		EdgeRadius      383
		MeanRadius      239
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     383
		RotationPeriod  13.4
		Brightness      1
		FrontBright     2.47
		BackBright      4.26
		Density         0.958
		Opacity         0.958
		SelfShadow      0.958
		PlanetShadow    0.958
		Hapke           1
		SpotBright      2.27
		SpotWidth       0.0126
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       693
		densityScale    2.24
		densityOffset   -1.44
		densityPower    5.01
		colorContrast   0.0665
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      892.842624
		SemiMajorAxisKm 15873959.9
		Eccentricity    0.433309612
		Inclination     -47.2466285
		AscendingNode   8.35610443
		ArgOfPericenter -2.77078536
		MeanAnomaly     69.7074014
	}
}

DwarfMoon	"9.D17"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.27468104e-06
	Radius          96.8284302
	InertiaMoment   0.397378296
	RotationPeriod  189.622232
	RotationEpoch   0
	Obliquity       110.089254
	EqAscendNode    -19.1137926

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.760 0.757 0.753)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.9
		Randomize      (0.039, -0.706, -0.585)
		colorDistMagn   0.331
		colorDistFreq   5.2
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.591
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.211
		heightTempGrad  0.625
		beachWidth      0.000704
		tropicWidth     0.07
		mainFreq        0.414
		venusFreq       0.573
		venusMagn       0.662
		mareDensity     0
		terraceProb     0.272
		erosion         0
		montesMagn      0.33
		montesFreq      2.67
		montesSpiky     0.995
		montesFraction  0.368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8
		hillsFraction   0.499
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.305
		craterDensity   0.898
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471
		volcanoTemp     224
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     129
		OuterRadius     331
		EdgeRadius      331
		MeanRadius      196
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     331
		RotationPeriod  8.53
		Brightness      1
		FrontBright     2.47
		BackBright      4.87
		Density         0.962
		Opacity         0.962
		SelfShadow      0.962
		PlanetShadow    0.962
		Hapke           1
		SpotBright      2.26
		SpotWidth       0.0294
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       705
		densityScale    2.31
		densityOffset   -1.82
		densityPower    4.75
		colorContrast   0.083
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      898.918469
		SemiMajorAxisKm 15945893.9
		Eccentricity    0.204851255
		Inclination     161.772778
		AscendingNode   -14.3142557
		ArgOfPericenter 106.093189
		MeanAnomaly     -111.415556
	}
}

DwarfMoon	"9.D18"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.87034664e-06
	Radius          135.812485
	InertiaMoment   0.397228837
	RotationPeriod  369.348418
	RotationEpoch   0
	Obliquity       131.728559
	EqAscendNode    -141.66446

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.540 0.538 0.535)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.469
		Randomize      (0.309, -0.876, -0.252)
		colorDistMagn   0.349
		colorDistFreq   1.82
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.985
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.108
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.657
		venusFreq       0.59
		venusMagn       0.656
		mareDensity     0
		terraceProb     0.432
		erosion         0
		montesMagn      0.494
		montesFreq      3.37
		montesSpiky     0.962
		montesFraction  0.458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.7
		hillsFraction   0.623
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.775
		craterDensity   1.01
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517
		volcanoTemp     187
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     203
		OuterRadius     1.57e+03
		EdgeRadius      495
		MeanRadius      300
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     495
		RotationPeriod  13.2
		Brightness      1
		FrontBright     2.77
		BackBright      4.21
		Density         0.955
		Opacity         0.955
		SelfShadow      0.955
		PlanetShadow    0.955
		Hapke           1
		SpotBright      2.28
		SpotWidth       0.0265
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.15
		densityScale    1.59
		densityOffset   -0.123
		densityPower    4.99
		colorContrast   0.0568
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      903.278796
		SemiMajorAxisKm 15997417.5
		Eccentricity    0.403206885
		Inclination     167.123169
		AscendingNode   -140.177769
		ArgOfPericenter 157.659882
		MeanAnomaly     4.78432747
	}
}

DwarfMoon	"9.D19"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.79708593e-06
	Radius          126.755424
	InertiaMoment   0.397062093
	RotationPeriod  168.841109
	RotationEpoch   0
	Obliquity       254.047188
	EqAscendNode    -175.568272

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.721 0.718 0.716)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0378
		Randomize      (0.580, 0.954, 0.081)
		colorDistMagn   0.366
		colorDistFreq   8.39
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.602
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.406
		heightTempGrad  0.625
		beachWidth      0.0014
		tropicWidth     0.07
		mainFreq        0.487
		venusFreq       0.606
		venusMagn       0.651
		mareDensity     0
		terraceProb     0.161
		erosion         0
		montesMagn      0.633
		montesFreq      2.71
		montesSpiky     0.925
		montesFraction  0.532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       47.6
		hillsFraction   0.73
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.262
		craterFreq      0.556
		craterDensity   0.839
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.603
		volcanoTemp     291
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     219
		OuterRadius     1.72e+03
		EdgeRadius      500
		MeanRadius      313
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     500
		RotationPeriod  11.3
		Brightness      1
		FrontBright     2.61
		BackBright      4.19
		Density         0.953
		Opacity         0.953
		SelfShadow      0.953
		PlanetShadow    0.953
		Hapke           1
		SpotBright      2.53
		SpotWidth       0.0184
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.25
		densityScale    1.74
		densityOffset   -0.416
		densityPower    5.13
		colorContrast   0.0769
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      906.521513
		SemiMajorAxisKm 16035681.1
		Eccentricity    0.0420002856
		Inclination     193.16055
		AscendingNode   -177.394116
		ArgOfPericenter -79.9031878
		MeanAnomaly     -176.383392
	}
}

DwarfMoon	"9.D20"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.28123349e-06
	Radius          178.728668
	InertiaMoment   0.396871984
	RotationPeriod  335.007253
	RotationEpoch   0
	Obliquity       167.697911
	EqAscendNode    102.125956

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.504 0.499 0.495)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.607
		Randomize      (0.850, 0.784, 0.414)
		colorDistMagn   0.382
		colorDistFreq   27
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.657
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.304
		heightTempGrad  0.625
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        0.279
		venusFreq       0.622
		venusMagn       0.646
		mareDensity     0
		terraceProb     0.281
		erosion         0
		montesMagn      0.465
		montesFreq      3.42
		montesSpiky     0.872
		montesFraction  0.603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.9
		hillsFraction   0.465
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.837
		craterDensity   0.938
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478
		volcanoTemp     254
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

	NoAtmosphere    true

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
		PeriodDays      910.770991
		SemiMajorAxisKm 16085756.2
		Eccentricity    0.405723786
		Inclination     210.523478
		AscendingNode   101.987411
		ArgOfPericenter -76.6273193
		MeanAnomaly     160.988966
	}
}

DwarfMoon	"9.D21"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.12064741e-11
	Radius          2.08424687
	InertiaMoment   0.396648467
	RotationPeriod  1359.92476
	RotationEpoch   0
	Obliquity       2.10324512
	EqAscendNode    60.3355791

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.684 0.681 0.677)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.176
		Randomize      (-0.879, 0.614, 0.747)
		colorDistMagn   0.399
		colorDistFreq   0.00213
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.619
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.201
		heightTempGrad  0.625
		beachWidth      0.000596
		tropicWidth     0.07
		mainFreq        0.555
		venusFreq       0.641
		venusMagn       0.641
		mareDensity     0
		terraceProb     0.45
		erosion         0
		montesMagn      0.583
		montesFreq      2.76
		montesSpiky     0.994
		montesFraction  0.681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0102
		hillsFraction   0.607
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.195
		craterFreq      0.234
		craterDensity   0.733
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523
		volcanoTemp     218
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.88
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

	NoAtmosphere    true

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
		PeriodDays      913.361504
		SemiMajorAxisKm 16116242.9
		Eccentricity    0.476693876
		Inclination     -11.3537339
		AscendingNode   51.8845535
		ArgOfPericenter -77.7176402
		MeanAnomaly     -58.6823524
	}
}

DwarfMoon	"9.D22"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.31667099e-11
	Radius          3.15965962
	InertiaMoment   0.396372974
	RotationPeriod  1961.2738
	RotationEpoch   0
	Obliquity       172.316761
	EqAscendNode    -40.1313954

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.468 0.462 0.456)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.745
		Randomize      (-0.609, 0.444, -0.920)
		colorDistMagn   0.415
		colorDistFreq   0.00787
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.525
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.499
		heightTempGrad  0.625
		beachWidth      0.000944
		tropicWidth     0.07
		mainFreq        0.39
		venusFreq       0.669
		venusMagn       0.635
		mareDensity     0
		terraceProb     0.169
		erosion         0
		montesMagn      0.433
		montesFreq      3.48
		montesSpiky     0.961
		montesFraction  0.79
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.021
		hillsFraction   0.711
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.19
		craterDensity   0.881
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406
		volcanoTemp     251
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.84
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

	NoAtmosphere    true

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
		PeriodDays      921.781713
		SemiMajorAxisKm 16215140.9
		Eccentricity    0.0756080431
		Inclination     182.572481
		AscendingNode   -41.8950686
		ArgOfPericenter -118.784637
		MeanAnomaly     -64.0069232
	}
}

DwarfMoon	"9.D23"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.3349286e-11
	Radius          2.9015801
	InertiaMoment   0.396004111
	RotationPeriod  1102.01079
	RotationEpoch   0
	Obliquity       143.979853
	EqAscendNode    44.7346205

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.648 0.644 0.638)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.314
		Randomize      (-0.339, 0.275, -0.587)
		colorDistMagn   0.431
		colorDistFreq   0.00383
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.435
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.397
		heightTempGrad  0.625
		beachWidth      0.000692
		tropicWidth     0.07
		mainFreq        0.632
		venusFreq       0.512
		venusMagn       0.63
		mareDensity     0
		terraceProb     0.291
		erosion         0
		montesMagn      0.548
		montesFreq      2.81
		montesSpiky     0.924
		montesFraction  0.23
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0146
		hillsFraction   0.41
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.247
		craterDensity   0.985
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485
		volcanoTemp     215
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.61
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

	NoAtmosphere    true

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
		PeriodDays      925.488372
		SemiMajorAxisKm 16258581.3
		Eccentricity    0.483275729
		Inclination     217.949912
		AscendingNode   49.6578216
		ArgOfPericenter 164.446367
		MeanAnomaly     50.4511975
	}
}

DwarfMoon	"9.D24"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            7.56549892e-11
	Radius          4.68727541
	InertiaMoment   0.395408571
	RotationPeriod  1668.92056
	RotationEpoch   0
	Obliquity       255.918742
	EqAscendNode    -69.6986601

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.427 0.423 0.422)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.883
		Randomize      (-0.068, 0.105, -0.254)
		colorDistMagn   0.446
		colorDistFreq   0.0163
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.295
		heightTempGrad  0.625
		beachWidth      0.000739
		tropicWidth     0.07
		mainFreq        0.467
		venusFreq       0.551
		venusMagn       0.624
		mareDensity     0
		terraceProb     0.47
		erosion         0
		montesMagn      0.392
		montesFreq      3.55
		montesSpiky     0.87
		montesFraction  0.378
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0644
		hillsFraction   0.59
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.205
		craterDensity   0.817
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531
		volcanoTemp     248
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.22
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

	NoAtmosphere    true

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
		PeriodDays      929.856524
		SemiMajorAxisKm 16309699.6
		Eccentricity    0.193758093
		Inclination     193.624448
		AscendingNode   -68.0885135
		ArgOfPericenter -80.0437606
		MeanAnomaly     -107.873252
	}
}

DwarfMoon	"9.D25"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.25418329e-10
	Radius          5.08360958
	InertiaMoment   0.399994135
	RotationPeriod  1709.13234
	RotationEpoch   0
	Obliquity       8.41546269
	EqAscendNode    -127.264259

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.609 0.605 0.602)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.452
		Randomize      (0.202, -0.065, 0.079)
		colorDistMagn   0.461
		colorDistFreq   0.0108
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.538
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.192
		heightTempGrad  0.625
		beachWidth      0.000787
		tropicWidth     0.07
		mainFreq        0.741
		venusFreq       0.572
		venusMagn       0.618
		mareDensity     0
		terraceProb     0.178
		erosion         0
		montesMagn      0.518
		montesFreq      2.85
		montesSpiky     0.993
		montesFraction  0.465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0667
		hillsFraction   0.694
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.264
		craterDensity   0.92
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43
		volcanoTemp     211
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.58
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

	NoAtmosphere    true

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
		PeriodDays      936.108167
		SemiMajorAxisKm 16382720.6
		Eccentricity    0.0178253721
		Inclination     49.7986014
		AscendingNode   -128.96557
		ArgOfPericenter -15.8285268
		MeanAnomaly     -131.001109
	}
}

DwarfMoon	"9.D26"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.99881098e-10
	Radius          5.32122278
	InertiaMoment   0.399933904
	RotationPeriod  773.605626
	RotationEpoch   0
	Obliquity       122.189026
	EqAscendNode    25.9939263

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.789 0.786 0.785)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0213
		Randomize      (0.472, -0.235, 0.412)
		colorDistMagn   0.476
		colorDistFreq   0.0198
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.461
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49
		heightTempGrad  0.625
		beachWidth      0.000835
		tropicWidth     0.07
		mainFreq        0.536
		venusFreq       0.589
		venusMagn       0.613
		mareDensity     0
		terraceProb     0.301
		erosion         0
		montesMagn      0.309
		montesFreq      3.63
		montesSpiky     0.96
		montesFraction  0.538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.066
		hillsFraction   0.891
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.263
		craterFreq      0.218
		craterDensity   1.07
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491
		volcanoTemp     245
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.79
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

	NoAtmosphere    true

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
		PeriodDays      943.434123
		SemiMajorAxisKm 16468083.3
		Eccentricity    0.263043049
		Inclination     147.304979
		AscendingNode   25.9791542
		ArgOfPericenter 37.4709884
		MeanAnomaly     -163.288126
	}
}

DwarfMoon	"9.D27"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.08815695e-10
	Radius          7.48972368
	InertiaMoment   0.399873585
	RotationPeriod  1488.52823
	RotationEpoch   0
	Obliquity       -4.55312927
	EqAscendNode    69.8871351

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.573 0.568 0.563)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.59
		Randomize      (0.743, -0.405, 0.745)
		colorDistMagn   0.491
		colorDistFreq   0.0214
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.584
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.388
		heightTempGrad  0.625
		beachWidth      0.000883
		tropicWidth     0.07
		mainFreq        0.364
		venusFreq       0.604
		venusMagn       0.607
		mareDensity     0
		terraceProb     0.493
		erosion         0
		montesMagn      0.49
		montesFreq      2.89
		montesSpiky     0.922
		montesFraction  0.61
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.117
		hillsFraction   0.573
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.159
		craterDensity   0.864
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539
		volcanoTemp     348
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.74
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

	NoAtmosphere    true

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
		PeriodDays      950.228462
		SemiMajorAxisKm 16547054.3
		Eccentricity    0.220942697
		Inclination     4.27459026
		AscendingNode   71.5590342
		ArgOfPericenter 134.379874
		MeanAnomaly     126.346561
	}
}

DwarfMoon	"9.D28"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.65358391e-10
	Radius          7.32382011
	InertiaMoment   0.399813175
	RotationPeriod  684.602968
	RotationEpoch   0
	Obliquity       67.0537669
	EqAscendNode    142.76281

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.752 0.750 0.746)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.159
		Randomize      (-0.987, -0.575, -0.922)
		colorDistMagn   0.506
		colorDistFreq   0.0355
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.663
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.285
		heightTempGrad  0.625
		beachWidth      0.000631
		tropicWidth     0.07
		mainFreq        0.608
		venusFreq       0.621
		venusMagn       0.601
		mareDensity     0
		terraceProb     0.187
		erosion         0
		montesMagn      0.623
		montesFreq      3.73
		montesSpiky     0.867
		montesFraction  0.69
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0915
		hillsFraction   0.677
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.202
		craterFreq      0.231
		craterDensity   0.963
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444
		volcanoTemp     242
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.59
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

	NoAtmosphere    true

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
		PeriodDays      955.95873
		SemiMajorAxisKm 16613511.3
		Eccentricity    0.462670342
		Inclination     139.597952
		AscendingNode   141.122667
		ArgOfPericenter -159.350189
		MeanAnomaly     132.052012
	}
}

DwarfMoon	"9.D29"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            6.87110535e-10
	Radius          9.77651119
	InertiaMoment   0.399752557
	RotationPeriod  1320.44131
	RotationEpoch   0
	Obliquity       125.993282
	EqAscendNode    -65.9108952

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.537 0.527 0.523)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.728
		Randomize      (-0.716, -0.745, -0.589)
		colorDistMagn   0.52
		colorDistFreq   0.0323
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.75
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.183
		heightTempGrad  0.625
		beachWidth      0.000979
		tropicWidth     0.07
		mainFreq        0.446
		venusFreq       0.639
		venusMagn       0.594
		mareDensity     0
		terraceProb     0.31
		erosion         0
		montesMagn      0.461
		montesFreq      2.93
		montesSpiky     0.991
		montesFraction  0.805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.277
		hillsFraction   0.825
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.185
		craterDensity   0.79
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497
		volcanoTemp     345
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.8
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

	NoAtmosphere    true

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
		PeriodDays      964.236156
		SemiMajorAxisKm 16709275.1
		Eccentricity    0.14644955
		Inclination     142.249617
		AscendingNode   -70.8625156
		ArgOfPericenter 152.845878
		MeanAnomaly     -143.835588
	}
}

DwarfMoon	"9.D30"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            9.97622429e-10
	Radius          9.16543484
	InertiaMoment   0.399691761
	RotationPeriod  612.996215
	RotationEpoch   0
	Obliquity       260.387954
	EqAscendNode    28.7162997

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.713 0.711 0.710)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.298
		Randomize      (-0.446, -0.915, -0.256)
		colorDistMagn   0.535
		colorDistFreq   0.0527
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.919
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.481
		heightTempGrad  0.625
		beachWidth      0.00133
		tropicWidth     0.07
		mainFreq        0.703
		venusFreq       0.666
		venusMagn       0.587
		mareDensity     0
		terraceProb     0.521
		erosion         0
		montesMagn      0.577
		montesFreq      3.88
		montesSpiky     0.959
		montesFraction  0.252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.215
		hillsFraction   0.554
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.244
		craterDensity   0.903
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548
		volcanoTemp     308
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.25
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

	NoAtmosphere    true

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
		PeriodDays      967.505422
		SemiMajorAxisKm 16747022.6
		Eccentricity    0.00936029956
		Inclination     220.363811
		AscendingNode   20.4508489
		ArgOfPericenter 149.543469
		MeanAnomaly     154.233877
	}
}

DwarfMoon	"9.D31"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.42835355e-09
	Radius          12.4754391
	InertiaMoment   0.399630636
	RotationPeriod  1187.84433
	RotationEpoch   0
	Obliquity       66.721031
	EqAscendNode    -108.035295

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.497 0.492 0.489)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.867
		Randomize      (-0.176, 0.915, 0.077)
		colorDistMagn   0.549
		colorDistFreq   0.0449
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.869
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.379
		heightTempGrad  0.625
		beachWidth      0.00137
		tropicWidth     0.07
		mainFreq        0.516
		venusFreq       0.507
		venusMagn       0.58
		mareDensity     0
		terraceProb     0.195
		erosion         0
		montesMagn      0.428
		montesFreq      2.97
		montesSpiky     0.921
		montesFraction  0.388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.361
		hillsFraction   0.661
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.202
		craterDensity   1.02
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454
		volcanoTemp     272
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.2
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

	NoAtmosphere    true

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
		PeriodDays      970.964494
		SemiMajorAxisKm 16786915.4
		Eccentricity    0.310625078
		Inclination     130.393422
		AscendingNode   -99.615903
		ArgOfPericenter 95.90097
		MeanAnomaly     43.960656
	}
}

DwarfMoon	"9.D32"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.02134842e-09
	Radius          10.918395
	InertiaMoment   0.399569184
	RotationPeriod  553.517143
	RotationEpoch   0
	Obliquity       211.916122
	EqAscendNode    -148.418711

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.677 0.674 0.671)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.436
		Randomize      (0.095, 0.745, 0.410)
		colorDistMagn   0.563
		colorDistFreq   0.0708
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.309
		icecapLatitude  0.797
		icecapHeight    0.121
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.276
		heightTempGrad  0.625
		beachWidth      0.000522
		tropicWidth     0.07
		mainFreq        0.335
		venusFreq       0.549
		venusMagn       0.573
		mareDensity     0
		terraceProb     0.321
		erosion         0
		montesMagn      0.543
		montesFreq      4.22
		montesSpiky     0.864
		montesFraction  0.473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.246
		hillsFraction   0.789
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.259
		craterDensity   0.845
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     305
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.83
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

	NoAtmosphere    true

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
		PeriodDays      977.532828
		SemiMajorAxisKm 16862536.5
		Eccentricity    0.274387735
		Inclination     139.322881
		AscendingNode   -143.309851
		ArgOfPericenter -41.1316596
		MeanAnomaly     95.4035739
	}
}

DwarfMoon	"9.D33"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.83281398e-09
	Radius          15.6714678
	InertiaMoment   0.399507314
	RotationPeriod  1081.97384
	RotationEpoch   0
	Obliquity       214.169179
	EqAscendNode    130.62541

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.460 0.456 0.450)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.00476
		Randomize      (0.365, 0.575, 0.743)
		colorDistMagn   0.577
		colorDistFreq   0.0552
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.481
		icecapLatitude  0.948
		icecapHeight    0.0253
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.174
		heightTempGrad  0.625
		beachWidth      0.00117
		tropicWidth     0.07
		mainFreq        0.586
		venusFreq       0.571
		venusMagn       0.565
		mareDensity     0
		terraceProb     0.557
		erosion         0
		montesMagn      0.384
		montesFreq      3.01
		montesSpiky     0.99
		montesFraction  0.545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.41
		hillsFraction   0.533
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.265
		craterFreq      0.215
		craterDensity   0.943
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559
		volcanoTemp     339
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.1
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

	NoAtmosphere    true

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
		PeriodDays      984.561032
		SemiMajorAxisKm 16943264.8
		Eccentricity    0.484032928
		Inclination     205.291105
		AscendingNode   132.421201
		ArgOfPericenter 175.447592
		MeanAnomaly     -154.797837
	}
}

DwarfMoon	"9.D34"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.93801036e-09
	Radius          14.169961
	InertiaMoment   0.399444968
	RotationPeriod  502.863401
	RotationEpoch   0
	Obliquity       55.5601502
	EqAscendNode    -117.348791

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.641 0.638 0.631)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.574
		Randomize      (0.636, 0.405, -0.924)
		colorDistMagn   0.591
		colorDistFreq   0.113
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.728
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.472
		heightTempGrad  0.625
		beachWidth      0.000918
		tropicWidth     0.07
		mainFreq        0.425
		venusFreq       0.588
		venusMagn       0.556
		mareDensity     0
		terraceProb     0.204
		erosion         0
		montesMagn      0.514
		montesFreq      2.02
		montesSpiky     0.957
		montesFraction  0.617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.577
		hillsFraction   0.645
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.145
		craterDensity   0.75
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     232
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.8
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

	NoAtmosphere    true

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
		PeriodDays      987.503948
		SemiMajorAxisKm 16977011
		Eccentricity    0.384945131
		Inclination     150.392873
		AscendingNode   -113.86524
		ArgOfPericenter -71.2203479
		MeanAnomaly     -94.3740444
	}
}

DwarfMoon	"9.D35"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            5.43789369e-09
	Radius          19.4728928
	InertiaMoment   0.399382085
	RotationPeriod  1001.67849
	RotationEpoch   0
	Obliquity       226.918959
	EqAscendNode    71.4982056

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.419 0.416 0.415)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.143
		Randomize      (0.906, 0.235, -0.591)
		colorDistMagn   0.605
		colorDistFreq   0.0488
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.917
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.369
		heightTempGrad  0.625
		beachWidth      0.00127
		tropicWidth     0.07
		mainFreq        0.671
		venusFreq       0.603
		venusMagn       0.547
		mareDensity     0
		terraceProb     0.331
		erosion         0
		montesMagn      0.27
		montesFreq      3.05
		montesSpiky     0.919
		montesFraction  0.699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.966
		hillsFraction   0.761
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.206
		craterFreq      0.227
		craterDensity   0.886
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     336
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.5
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

	NoAtmosphere    true

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
		PeriodDays      995.157536
		SemiMajorAxisKm 17064617.5
		Eccentricity    0.380908569
		Inclination     185.482884
		AscendingNode   71.6690416
		ArgOfPericenter -135.781843
		MeanAnomaly     -3.5027535
	}
}

DwarfMoon	"9.D36"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            7.46827755e-09
	Radius          21.6428337
	InertiaMoment   0.399318606
	RotationPeriod  841.841967
	RotationEpoch   0
	Obliquity       178.01423
	EqAscendNode    27.6340631

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.601 0.598 0.596)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.712
		Randomize      (-0.824, 0.065, -0.258)
		colorDistMagn   0.618
		colorDistFreq   0.248
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.579
		icecapLatitude  0.981
		icecapHeight    0.0143
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.267
		heightTempGrad  0.625
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        0.496
		venusFreq       0.619
		venusMagn       0.536
		mareDensity     0
		terraceProb     0.612
		erosion         0
		montesMagn      0.486
		montesFreq      2.21
		montesSpiky     0.861
		montesFraction  0.821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08
		hillsFraction   0.509
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.18
		craterDensity   0.992
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574
		volcanoTemp     369
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.5
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

	NoAtmosphere    true

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
		PeriodDays      1003.34338
		SemiMajorAxisKm 17158068.4
		Eccentricity    0.00752028485
		Inclination     160.281445
		AscendingNode   29.4918763
		ArgOfPericenter 115.298655
		MeanAnomaly     90.3183252
	}
}

DwarfMoon	"9.D37"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.02124513e-08
	Radius          19.9296951
	InertiaMoment   0.399254382
	RotationPeriod  550.142715
	RotationEpoch   0
	Obliquity       109.850247
	EqAscendNode    -40.936099

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.782 0.780 0.778)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.281
		Randomize      (-0.553, -0.104, 0.075)
		colorDistMagn   0.632
		colorDistFreq   0.342
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.72
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.165
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        0.3
		venusFreq       0.638
		venusMagn       0.524
		mareDensity     0
		terraceProb     0.213
		erosion         0
		montesMagn      0.615
		montesFreq      3.09
		montesSpiky     0.989
		montesFraction  0.272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.814
		hillsFraction   0.629
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.222
		craterFreq      0.24
		craterDensity   0.824
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471
		volcanoTemp     192
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.9
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

	NoAtmosphere    true

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
		PeriodDays      1009.91379
		SemiMajorAxisKm 17232893.4
		Eccentricity    0.395703902
		Inclination     155.827275
		AscendingNode   -42.3905672
		ArgOfPericenter -96.5263533
		MeanAnomaly     -73.8752386
	}
}

DwarfMoon	"9.D38"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.39188643e-08
	Radius          26.6280155
	InertiaMoment   0.399189413
	RotationPeriod  766.719934
	RotationEpoch   0
	Obliquity       208.45848
	EqAscendNode    -73.7399702

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.565 0.561 0.556)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.85
		Randomize      (-0.283, -0.274, 0.408)
		colorDistMagn   0.646
		colorDistFreq   0.352
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.781
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.462
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.565
		venusFreq       0.664
		venusMagn       0.51
		mareDensity     0
		terraceProb     0.342
		erosion         0
		montesMagn      0.456
		montesFreq      2.33
		montesSpiky     0.956
		montesFraction  0.397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15
		hillsFraction   0.738
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.198
		craterDensity   0.925
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517
		volcanoTemp     156
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

	NoAtmosphere    true

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
		PeriodDays      1014.47782
		SemiMajorAxisKm 17284774
		Eccentricity    0.351313327
		Inclination     198.152688
		AscendingNode   -68.5077814
		ArgOfPericenter -28.5564731
		MeanAnomaly     50.0699998
	}
}

DwarfMoon	"9.D39"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.89257605e-08
	Radius          22.658762
	InertiaMoment   0.399123579
	RotationPeriod  349.860944
	RotationEpoch   0
	Obliquity       27.1874744
	EqAscendNode    -62.5307246

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.745 0.743 0.739)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.419
		Randomize      (-0.013, -0.444, 0.741)
		colorDistMagn   0.659
		colorDistFreq   0.41
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.811
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36
		heightTempGrad  0.625
		beachWidth      0.000857
		tropicWidth     0.07
		mainFreq        0.402
		venusFreq       0.5
		venusMagn       0.491
		mareDensity     0
		terraceProb     0.76
		erosion         0
		montesMagn      0.571
		montesFreq      3.13
		montesSpiky     0.917
		montesFraction  0.48
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46
		hillsFraction   0.479
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.255
		craterDensity   1.1
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.602
		volcanoTemp     259
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

	NoAtmosphere    true

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
		PeriodDays      1022.46668
		SemiMajorAxisKm 17375398.6
		Eccentricity    0.198983983
		Inclination     40.5951291
		AscendingNode   -65.6106164
		ArgOfPericenter 172.531423
		MeanAnomaly     -106.329741
	}
}

DwarfMoon	"9.D40"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.56962736e-08
	Radius          32.6568298
	InertiaMoment   0.399056762
	RotationPeriod  699.77806
	RotationEpoch   0
	Obliquity       224.637749
	EqAscendNode    111.318662

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.530 0.520 0.517)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.988
		Randomize      (0.258, -0.614, -0.926)
		colorDistMagn   0.673
		colorDistFreq   0.493
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.698
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.258
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        0.644
		venusFreq       0.548
		venusMagn       0.463
		mareDensity     0
		terraceProb     0.221
		erosion         0
		montesMagn      0.422
		montesFreq      2.42
		montesSpiky     0.858
		montesFraction  0.552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7
		hillsFraction   0.613
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.267
		craterFreq      0.212
		craterDensity   0.869
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478
		volcanoTemp     293
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

	NoAtmosphere    true

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
		PeriodDays      1030.46579
		SemiMajorAxisKm 17465903.4
		Eccentricity    0.172393782
		Inclination     221.760586
		AscendingNode   119.924987
		ArgOfPericenter 55.4653804
		MeanAnomaly     23.9170757
	}
}

DwarfMoon	"9.D41"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.48684601e-08
	Radius          29.1489906
	InertiaMoment   0.398988903
	RotationPeriod  324.2191
	RotationEpoch   0
	Obliquity       192.192916
	EqAscendNode    -86.3434857

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.737 0.695 0.672)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.557
		Randomize      (0.528, -0.784, -0.594)
		colorDistMagn   0.686
		colorDistFreq   0.637
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.634
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.156
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        0.477
		venusFreq       0.57
		venusMagn       0.389
		mareDensity     0
		terraceProb     0.353
		erosion         0
		montesMagn      0.539
		montesFreq      3.18
		montesSpiky     0.988
		montesFraction  0.624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.95
		hillsFraction   0.718
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.275
		craterDensity   0.969
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523
		volcanoTemp     256
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

	NoAtmosphere    true

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
		PeriodDays      1037.81189
		SemiMajorAxisKm 17548813.7
		Eccentricity    0.491687079
		Inclination     173.030189
		AscendingNode   -91.0487922
		ArgOfPericenter 33.1447354
		MeanAnomaly     -105.806
	}
}

DwarfMoon	"9.D42"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.73276671e-08
	Radius          40.0173225
	InertiaMoment   0.398919851
	RotationPeriod  639.395745
	RotationEpoch   0
	Obliquity       175.871383
	EqAscendNode    -8.74882856

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.555 0.477 0.416)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.126
		Randomize      (0.799, -0.954, -0.261)
		colorDistMagn   0.7
		colorDistFreq   0.684
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.546
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.453
		heightTempGrad  0.625
		beachWidth      0.000701
		tropicWidth     0.07
		mainFreq        0.765
		venusFreq       0.587
		venusMagn       0.869
		mareDensity     0
		terraceProb     0.108
		erosion         0
		montesMagn      0.375
		montesFreq      2.49
		montesSpiky     0.955
		montesFraction  0.708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.25
		hillsFraction   0.436
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.208
		craterFreq      0.224
		craterDensity   0.798
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.405
		volcanoTemp     289
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

	NoAtmosphere    true

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
		PeriodDays      1041.14449
		SemiMajorAxisKm 17586361.9
		Eccentricity    0.485567907
		Inclination     180.422989
		AscendingNode   -6.76699818
		ArgOfPericenter -24.8701969
		MeanAnomaly     -72.6629578
	}
}

DwarfMoon	"9.D43"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            6.43121254e-08
	Radius          36.7102356
	InertiaMoment   0.398849458
	RotationPeriod  298.633732
	RotationEpoch   0
	Obliquity       163.531698
	EqAscendNode    -150.035822

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.726 0.669 0.607)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.695
		Randomize      (-0.931, 0.876, 0.072)
		colorDistMagn   0.713
		colorDistFreq   0.954
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.789
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.351
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.545
		venusFreq       0.602
		venusMagn       0.836
		mareDensity     0
		terraceProb     0.23
		erosion         0
		montesMagn      0.509
		montesFreq      3.22
		montesSpiky     0.916
		montesFraction  0.839
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12
		hillsFraction   0.597
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.174
		craterDensity   0.908
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485
		volcanoTemp     253
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

	NoAtmosphere    true

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
		PeriodDays      1044.27807
		SemiMajorAxisKm 17621631.2
		Eccentricity    0.434044469
		Inclination     191.798313
		AscendingNode   -156.366538
		ArgOfPericenter 116.326675
		MeanAnomaly     112.7072
	}
}

DwarfMoon	"9.D44"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            8.75692905e-08
	Radius          49.1087456
	InertiaMoment   0.398777634
	RotationPeriod  584.540604
	RotationEpoch   0
	Obliquity       183.365694
	EqAscendNode    116.11128

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.543 0.467 0.352)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.264
		Randomize      (-0.661, 0.706, 0.405)
		colorDistMagn   0.727
		colorDistFreq   0.939
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.585
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.249
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.377
		venusFreq       0.618
		venusMagn       0.815
		mareDensity     0
		terraceProb     0.365
		erosion         0
		montesMagn      0.687
		montesFreq      2.55
		montesSpiky     0.855
		montesFraction  0.289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.8
		hillsFraction   0.7
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.237
		craterDensity   1.03
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531
		volcanoTemp     286
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

	NoAtmosphere    true

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
		PeriodDays      1053.03545
		SemiMajorAxisKm 17720011.4
		Eccentricity    0.33203978
		Inclination     195.346364
		AscendingNode   116.467827
		ArgOfPericenter -60.7890783
		MeanAnomaly     94.8607045
	}
}

DwarfMoon	"9.D45"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.19590268e-07
	Radius          46.1759529
	InertiaMoment   0.398704201
	RotationPeriod  273.975684
	RotationEpoch   0
	Obliquity       54.6318035
	EqAscendNode    -125.66154

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.721 0.585 0.537)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.834
		Randomize      (-0.390, 0.536, 0.738)
		colorDistMagn   0.741
		colorDistFreq   1.43
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.657
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.146
		heightTempGrad  0.625
		beachWidth      0.00144
		tropicWidth     0.07
		mainFreq        0.62
		venusFreq       0.636
		venusMagn       0.8
		mareDensity     0
		terraceProb     0.118
		erosion         0
		montesMagn      0.481
		montesFreq      3.26
		montesSpiky     0.987
		montesFraction  0.406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.37
		hillsFraction   0.321
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.194
		craterDensity   0.85
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429
		volcanoTemp     110
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     87.5
		OuterRadius     159
		EdgeRadius      159
		MeanRadius      111
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     159
		RotationPeriod  11
		Brightness      1
		FrontBright     2.87
		BackBright      4.71
		Density         0.98
		Opacity         0.98
		SelfShadow      0.98
		PlanetShadow    0.98
		Hapke           1
		SpotBright      2.26
		SpotWidth       0.0324
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       720
		densityScale    2.24
		densityOffset   -1.66
		densityPower    5.05
		colorContrast   0.0535
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1057.37729
		SemiMajorAxisKm 17768686.3
		Eccentricity    0.369460252
		Inclination     170.327511
		AscendingNode   -133.617646
		ArgOfPericenter 167.21918
		MeanAnomaly     -27.7280772
	}
}

DwarfMoon	"9.D46"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.63966831e-07
	Radius          60.5003891
	InertiaMoment   0.39862898
	RotationPeriod  534.440402
	RotationEpoch   0
	Obliquity       232.442501
	EqAscendNode    -117.974988

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.526 0.373 0.294)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.403
		Randomize      (-0.120, 0.366, -0.929)
		colorDistMagn   0.754
		colorDistFreq   1.27
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.697
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.444
		heightTempGrad  0.625
		beachWidth      0.000892
		tropicWidth     0.07
		mainFreq        0.456
		venusFreq       0.662
		venusMagn       0.787
		mareDensity     0
		terraceProb     0.239
		erosion         0
		montesMagn      0.607
		montesFreq      2.61
		montesSpiky     0.954
		montesFraction  0.487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.33
		hillsFraction   0.58
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.251
		craterDensity   0.949
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491
		volcanoTemp     353
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     91.9
		OuterRadius     518
		EdgeRadius      189
		MeanRadius      124
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     189
		RotationPeriod  11.4
		Brightness      1
		FrontBright     2.67
		BackBright      4.58
		Density         0.955
		Opacity         0.955
		SelfShadow      0.955
		PlanetShadow    0.955
		Hapke           1
		SpotBright      2.33
		SpotWidth       0.0109
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.31
		densityScale    1.54
		densityOffset   -0.328
		densityPower    4.89
		colorContrast   0.0703
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1065.61662
		SemiMajorAxisKm 17860872
		Eccentricity    0.0881566919
		Inclination     211.854527
		AscendingNode   -119.243753
		ArgOfPericenter 161.779046
		MeanAnomaly     76.7691905
	}
}

DwarfMoon	"9.D47"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.25943879e-07
	Radius          67.3062592
	InertiaMoment   0.398551762
	RotationPeriod  464.564901
	RotationEpoch   0
	Obliquity       61.7891837
	EqAscendNode    9.92747819

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.639 0.584 0.544)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.972
		Randomize      (0.151, 0.196, -0.596)
		colorDistMagn   0.768
		colorDistFreq   2.87
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.989
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.342
		heightTempGrad  0.625
		beachWidth      0.00124
		tropicWidth     0.07
		mainFreq        0.721
		venusFreq       0.492
		venusMagn       0.776
		mareDensity     0
		terraceProb     0.378
		erosion         0
		montesMagn      0.451
		montesFreq      3.31
		montesSpiky     0.914
		montesFraction  0.559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.12
		hillsFraction   0.683
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.269
		craterFreq      0.208
		craterDensity   0.764
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538
		volcanoTemp     247
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     115
		OuterRadius     228
		EdgeRadius      228
		MeanRadius      153
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     228
		RotationPeriod  13.1
		Brightness      1
		FrontBright     2.47
		BackBright      4.2
		Density         0.978
		Opacity         0.978
		SelfShadow      0.978
		PlanetShadow    0.978
		Hapke           1
		SpotBright      2.23
		SpotWidth       0.0326
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.68
		densityScale    1.59
		densityOffset   -0.249
		densityPower    5.02
		colorContrast   0.0932
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1070.00294
		SemiMajorAxisKm 17909851.4
		Eccentricity    0.360624134
		Inclination     24.915998
		AscendingNode   5.3460905
		ArgOfPericenter 117.552983
		MeanAnomaly     -53.7333638
	}
}

DwarfMoon	"9.D48"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            3.1329094e-07
	Radius          60.3520813
	InertiaMoment   0.398472309
	RotationPeriod  276.987964
	RotationEpoch   0
	Obliquity       207.933426
	EqAscendNode    156.862812

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.807 0.772 0.738)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.541
		Randomize      (0.421, 0.026, -0.263)
		colorDistMagn   0.781
		colorDistFreq   1.09
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.271
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24
		heightTempGrad  0.625
		beachWidth      0.000988
		tropicWidth     0.07
		mainFreq        0.526
		venusFreq       0.546
		venusMagn       0.766
		mareDensity     0
		terraceProb     0.127
		erosion         0
		montesMagn      0.566
		montesFreq      2.66
		montesSpiky     0.852
		montesFraction  0.632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.51
		hillsFraction   0.844
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24
		craterFreq      0.269
		craterDensity   0.891
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443
		volcanoTemp     280
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     88.9
		OuterRadius     633
		EdgeRadius      193
		MeanRadius      124
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     193
		RotationPeriod  8.28
		Brightness      1
		FrontBright     2.96
		BackBright      4.54
		Density         0.951
		Opacity         0.951
		SelfShadow      0.951
		PlanetShadow    0.951
		Hapke           1
		SpotBright      2.33
		SpotWidth       0.0247
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.96
		densityScale    1.19
		densityOffset   -0.414
		densityPower    4.83
		colorContrast   0.0606
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1072.75774
		SemiMajorAxisKm 17940578.3
		Eccentricity    0.46508012
		Inclination     194.773813
		AscendingNode   163.968524
		ArgOfPericenter 93.964507
		MeanAnomaly     112.351625
	}
}

DwarfMoon	"9.D49"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.37706404e-07
	Radius          83.8505859
	InertiaMoment   0.398390383
	RotationPeriod  420.460054
	RotationEpoch   0
	Obliquity       152.203699
	EqAscendNode    85.4016938

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.637 0.566 0.471)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.11
		Randomize      (0.691, -0.144, 0.070)
		colorDistMagn   0.795
		colorDistFreq   4.22
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.681
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.137
		heightTempGrad  0.625
		beachWidth      0.000736
		tropicWidth     0.07
		mainFreq        0.35
		venusFreq       0.568
		venusMagn       0.757
		mareDensity     0
		terraceProb     0.247
		erosion         0
		montesMagn      0.416
		montesFreq      3.36
		montesSpiky     0.986
		montesFraction  0.718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7
		hillsFraction   0.562
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.211
		craterFreq      0.243
		craterDensity   1
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497
		volcanoTemp     313
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

	NoAtmosphere    true

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
		PeriodDays      1076.77682
		SemiMajorAxisKm 17985360
		Eccentricity    0.401321542
		Inclination     202.757239
		AscendingNode   79.1949294
		ArgOfPericenter 87.6272073
		MeanAnomaly     104.773459
	}
}

DwarfMoon	"9.D50"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            6.17132741e-07
	Radius          78.0823441
	InertiaMoment   0.398305655
	RotationPeriod  256.073362
	RotationEpoch   0
	Obliquity       202.062805
	EqAscendNode    87.0250638

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.793 0.753 0.676)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.679
		Randomize      (0.962, -0.314, 0.403)
		colorDistMagn   0.809
		colorDistFreq   1.46
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.69
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.435
		heightTempGrad  0.625
		beachWidth      0.000784
		tropicWidth     0.07
		mainFreq        0.597
		venusFreq       0.586
		venusMagn       0.749
		mareDensity     0
		terraceProb     0.391
		erosion         0
		montesMagn      0.534
		montesFreq      2.71
		montesSpiky     0.952
		montesFraction  0.86
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.3
		hillsFraction   0.667
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.167
		craterDensity   0.83
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547
		volcanoTemp     277
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

	NoAtmosphere    true

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
		PeriodDays      1083.97624
		SemiMajorAxisKm 18065438.6
		Eccentricity    0.322368157
		Inclination     196.332593
		AscendingNode   82.5054332
		ArgOfPericenter 164.169375
		MeanAnomaly     1.14437403
	}
}

DwarfMoon	"9.D51"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            8.79670836e-07
	Radius          105.730675
	InertiaMoment   0.398217767
	RotationPeriod  378.110628
	RotationEpoch   0
	Obliquity       134.392459
	EqAscendNode    -29.6500989

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.639 0.471 0.393)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.248
		Randomize      (-0.768, -0.483, 0.736)
		colorDistMagn   0.823
		colorDistFreq   6.35
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.369
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.333
		heightTempGrad  0.625
		beachWidth      0.00143
		tropicWidth     0.07
		mainFreq        0.436
		venusFreq       0.601
		venusMagn       0.742
		mareDensity     0
		terraceProb     0.136
		erosion         0
		montesMagn      0.365
		montesFreq      3.42
		montesSpiky     0.912
		montesFraction  0.304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.3
		hillsFraction   0.801
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.408
		craterDensity   0.93
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454
		volcanoTemp     240
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     160
		OuterRadius     754
		EdgeRadius      362
		MeanRadius      227
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     362
		RotationPeriod  12.4
		Brightness      1
		FrontBright     2.5
		BackBright      4.47
		Density         0.996
		Opacity         0.996
		SelfShadow      0.996
		PlanetShadow    0.996
		Hapke           1
		SpotBright      2.58
		SpotWidth       0.0306
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.28
		densityScale    1.5
		densityOffset   -0.293
		densityPower    4.98
		colorContrast   0.071
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1092.6624
		SemiMajorAxisKm 18161818.6
		Eccentricity    0.369065571
		Inclination     192.376384
		AscendingNode   -27.4824745
		ArgOfPericenter 143.057644
		MeanAnomaly     19.1447398
	}
}

DwarfMoon	"9.D52"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.27041949e-06
	Radius          99.4022675
	InertiaMoment   0.398126304
	RotationPeriod  238.842235
	RotationEpoch   0
	Obliquity       232.49539
	EqAscendNode    -115.319804

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.785 0.679 0.610)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.817
		Randomize      (-0.498, -0.653, -0.931)
		colorDistMagn   0.837
		colorDistFreq   1.52
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.718
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.686
		venusFreq       0.617
		venusMagn       0.734
		mareDensity     0
		terraceProb     0.256
		erosion         0
		montesMagn      0.505
		montesFreq      2.76
		montesSpiky     0.848
		montesFraction  0.415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7
		hillsFraction   0.542
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.256
		craterFreq      0.293
		craterDensity   0.693
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504
		volcanoTemp     344
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     174
		OuterRadius     369
		EdgeRadius      369
		MeanRadius      239
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     369
		RotationPeriod  11
		Brightness      1
		FrontBright     2.97
		BackBright      2.88
		Density         0.206
		Opacity         0.206
		SelfShadow      0.103
		PlanetShadow    0.103
		Hapke           1
		SpotBright      0.964
		SpotWidth       0.0181
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       745
		densityScale    2.33
		densityOffset   -1.62
		densityPower    5.11
		colorContrast   0.088
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1101.53957
		SemiMajorAxisKm 18260054.5
		Eccentricity    0.231443482
		Inclination     194.194757
		AscendingNode   -111.464877
		ArgOfPericenter -106.324708
		MeanAnomaly     90.9555631
	}
}

DwarfMoon	"9.D53"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            1.8638093e-06
	Radius          135.6548
	InertiaMoment   0.398030728
	RotationPeriod  337.062704
	RotationEpoch   0
	Obliquity       170.060625
	EqAscendNode    -140.95291

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.538 0.475 0.419)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.386
		Randomize      (-0.227, -0.823, -0.598)
		colorDistMagn   0.851
		colorDistFreq   9.85
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.711
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.128
		heightTempGrad  0.625
		beachWidth      0.000627
		tropicWidth     0.07
		mainFreq        0.506
		venusFreq       0.635
		venusMagn       0.728
		mareDensity     0
		terraceProb     0.405
		erosion         0
		montesMagn      0.667
		montesFreq      3.48
		montesSpiky     0.985
		montesFraction  0.494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.4
		hillsFraction   0.651
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.711
		craterDensity   0.874
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558
		volcanoTemp     237
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	Rings
	{
		InnerRadius     193
		OuterRadius     1.23e+03
		EdgeRadius      468
		MeanRadius      284
		Thickness       0.0125
		RocksMaxSize    0.0005
		RocksSpacing    1
		DustDrawDist    37.5
		ChartRadius     468
		RotationPeriod  12.2
		Brightness      1
		FrontBright     2.8
		BackBright      2.13
		Density         0.345
		Opacity         0.345
		SelfShadow      0.173
		PlanetShadow    0.173
		Hapke           1
		SpotBright      0.933
		SpotWidth       0.0145
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.91
		densityScale    1.61
		densityOffset   -0.379
		densityPower    4.95
		colorContrast   0.0612
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1105.26586
		SemiMajorAxisKm 18301211.4
		Eccentricity    0.497054193
		Inclination     155.47479
		AscendingNode   -150.410528
		ArgOfPericenter 138.30054
		MeanAnomaly     0.0956268702
	}
}

DwarfMoon	"9.D54"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            2.78678613e-06
	Radius          117.280289
	InertiaMoment   0.397930443
	RotationPeriod  149.951245
	RotationEpoch   0
	Obliquity       185.286102
	EqAscendNode    8.88288751

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.662 0.660 0.657)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.955
		Randomize      (0.043, -0.993, -0.265)
		colorDistMagn   0.865
		colorDistFreq   12
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.674
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.426
		heightTempGrad  0.625
		beachWidth      0.000675
		tropicWidth     0.07
		mainFreq        0.318
		venusFreq       0.659
		venusMagn       0.721
		mareDensity     0
		terraceProb     0.145
		erosion         0
		montesMagn      0.477
		montesFreq      2.8
		montesSpiky     0.951
		montesFraction  0.566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.2
		hillsFraction   0.771
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.271
		craterFreq      0.441
		craterDensity   0.975
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     270
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

	NoAtmosphere    true

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
		PeriodDays      1111.14566
		SemiMajorAxisKm 18366060
		Eccentricity    0.159003059
		Inclination     194.414768
		AscendingNode   6.11242536
		ArgOfPericenter 162.759728
		MeanAnomaly     49.7989023
	}
}

DwarfMoon	"9.D55"
{
	ParentBody     "9"
	Class          "Asteroid"
	Mass            4.26449424e-06
	Radius          178.496765
	InertiaMoment   0.397824675
	RotationPeriod  296.735137
	RotationEpoch   0
	Obliquity       193.484942
	EqAscendNode    8.27578799

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.445 0.442 0.436)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.524
		Randomize      (0.314, 0.837, 0.068)
		colorDistMagn   0.879
		colorDistFreq   16
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.772
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.324
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.576
		venusFreq       0.477
		venusMagn       0.715
		mareDensity     0
		terraceProb     0.265
		erosion         0
		montesMagn      0.6
		montesFreq      3.54
		montesSpiky     0.911
		montesFraction  0.639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       79.2
		hillsFraction   0.519
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      1.31
		craterDensity   0.806
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51
		volcanoTemp     164
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

	NoAtmosphere    true

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
		PeriodDays      1116.2108
		SemiMajorAxisKm 18421832.8
		Eccentricity    0.275303795
		Inclination     186.328483
		AscendingNode   2.19274007
		ArgOfPericenter -78.3459512
		MeanAnomaly     -84.354109
	}
}

Comet	"C72"
{
	ParentBody     "Konta Clara"
	Class          "Asteroid"
	Mass            3.10413562e-08
	Radius          34.7768021
	InertiaMoment   0.398096234
	Oblateness      0.00903869327
	RotationPeriod  37.7072239
	RotationEpoch   0
	Obliquity       67.4841232
	EqAscendNode    126.117477

	AbsMagn         6.19
	SlopeParam      3.09
	AlbedoBond      0.0458
	AlbedoGeom      0.0549
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.809 0.722 0.692)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.35
		Randomize      (-0.625, -0.448, 0.704)
		colorDistMagn   0.424
		colorDistFreq   0.71
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.99
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.465
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.441
		venusFreq       0.668
		venusMagn       0.623
		mareDensity     0
		terraceProb     0.267
		erosion         0
		montesMagn      0.671
		montesFreq      2.75
		montesSpiky     0.866
		montesFraction  0.44
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22
		hillsFraction   0.599
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.215
		craterFreq      0.188
		craterDensity   0.942
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57
		volcanoTemp     200
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

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0937
		GasToDust   0.25
		Particles   2872
		GasBright   0.00609
		DustBright  0.038
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          51.5559804
		SemiMajorAxis   9.0741401
		Eccentricity    0.978824805
		Inclination     -99.1981699
		AscendingNode   -148.712694
		ArgOfPericenter 88.8218773
		MeanAnomaly     80.3387887
	}
}

Planet	"10"
{
	ParentBody     "Konta Clara"
	Class          "Ferria"
	Mass            0.593656778
	Radius          6203.2041
	InertiaMoment   0.332037747
	Oblateness      0.00792886037
	RotationPeriod  19.3985251
	RotationEpoch   0
	Obliquity       36.1139537
	EqAscendNode    28.7789809

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.558 0.555 0.550)

	Surface
	{
		Preset         "ferria_airless_mercury.cfg"
		SurfStyle       0.274
		Randomize      (-0.531, -0.927, 0.555)
		colorDistMagn   0.0488
		colorDistFreq   811
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.178
		snowLevel       2
		tropicLatitude  0.443
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.168
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        1.65
		venusFreq       0.755
		venusMagn       0
		mareFreq        1.77
		mareDensity     0.0541
		terraceProb     0.198
		erosion         0
		montesMagn      0.204
		montesFreq      321
		montesSpiky     0.869
		montesFraction  0.933
		dunesMagn       0.0563
		dunesFreq       57.2
		dunesFraction   0.555
		hillsMagn       0.13
		hillsFreq       787
		hillsFraction   0.172
		hills2Fraction  0
		riversMagn      61.6
		riversFreq      4.09
		riversSin       5.35
		riftsMagn       61.4
		riftsFreq       3.77
		riftsSin        6.18
		canyonsMagn     0.556
		canyonsFreq     2.24
		canyonsFraction 0.631
		cracksMagn      0.0553
		cracksFreq      4.2
		cracksOctaves   0
		craterMagn      0.527
		craterFreq      15.6
		craterDensity   0.82
		craterOctaves   21
		craterRayedFactor 0.209
		volcanoMagn     0.588
		volcanoFreq     0.713
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.053
		volcanoRadius   0.521
		volcanoTemp     314
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
		Model          "Ethereal"
		Height          53.8340759
		Density         2.62272124e-06
		Pressure        4.60669298e-07
		Greenhouse      0.0122822095
		Bright          0.856
		Opacity         0
		SkyLight        0.285
		Hue             0.0136
		Saturation      0.963

		Composition
		{
			He        	50.5
			CH4       	29.2
			Ne        	15.7
			N2        	4.63
			Ar        	0.00341
			CO        	0.000109
			O2        	7.98e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         34.8
		NorthLat       67.5
		NorthLon       120
		NorthRadius    1.41e+03
		NorthWidth     393
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 64.1
		NorthMoveSpeed 0.59
		NorthParticles 50000
		SouthLat       -68.1
		SouthLon       -63.5
		SouthRadius    1.46e+03
		SouthWidth     264
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 64.7
		SouthMoveSpeed 1.14
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8.24e+03
		OuterRadius     3.71e+04
		EdgeRadius      1.16e+04
		MeanRadius      9.35e+03
		Thickness       0.0156
		RocksMaxSize    0.000622
		RocksSpacing    1
		DustDrawDist    46.7
		ChartRadius     1.16e+04
		RotationPeriod  3.54
		Brightness      1
		FrontBright     2.59
		BackBright      4.96
		Density         0.985
		Opacity         0.985
		SelfShadow      0.985
		PlanetShadow    0.985
		Hapke           1
		SpotBright      2.7
		SpotWidth       0.0128
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       690
		densityScale    2.25
		densityOffset   -1.48
		densityPower    0.994
		colorContrast   0.0915
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          152.953324
		SemiMajorAxis   18.7352566
		Eccentricity    0.0456393865
		Inclination     9.79777389
		AscendingNode   28.6686737
		ArgOfPericenter 71.160916
		MeanAnomaly     269.456539
	}
}

