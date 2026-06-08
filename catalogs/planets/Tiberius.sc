Barycenter	"Tiberius & Polion"
{
	ParentBody     "Hope"
	Mass            0.03230204
	Radius          23805.6523
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane	"Equator"
		Period		24.642374
		SemiMajorAxis	7.58321
		Eccentricity	0.1860883375
		Inclination	0.0122323
	}
}

Planet	"Polion"
{
	ParentBody     "Tiberius & Polion"
	Class          "Aquaria"
	Mass            1.483
	Radius          7272.195
	InertiaMoment   0.332695425
	Oblateness      0.0119051058
	RotationPeriod  0.13474
	RotationEpoch   0
	Obliquity       70.9596754
	EqAscendNode    158.986341

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.851
		Randomize      (0.371, 0.369, 0.646)
		colorDistMagn   0.0669
		colorDistFreq   1.21e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.197
		snowLevel       2
		tropicLatitude  0.908
		icecapLatitude  0.991
		icecapHeight    0.00638
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
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        1.8
		venusFreq       0.59
		venusMagn       0
		mareFreq        1.7
		mareDensity     0
		terraceProb     0.129
		erosion         0
		montesMagn      0.258
		montesFreq      439
		montesSpiky     0.795
		montesFraction  0.0505
		dunesMagn       0.027
		dunesFreq       92.7
		dunesFraction   0.0681
		hillsMagn       0.101
		hillsFreq       1.18e+03
		hillsFraction   0.462
		hills2Fraction  0.0799
		riversMagn      0
		riversFreq      2.47
		riversSin       6.79
		riftsMagn       0
		riftsFreq       3.22
		riftsSin        4.25
		canyonsMagn     0.535
		canyonsFreq     3.93
		canyonsFraction 0
		cracksMagn      0.066
		cracksFreq      3.77
		cracksOctaves   7
		craterMagn      0.658
		craterFreq      31.1
		craterDensity   0.456
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.587
		volcanoFreq     0.606
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.202
		volcanoRadius   0.534
		volcanoTemp     248
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.6
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.32
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          80.065712
		Density         0.0325720236
		Pressure        0.0316064805
		Greenhouse      1.55810964
		Bright          7.94
		Opacity         1
		SkyLight        2.65
		Hue             0.0148
		Saturation      0.977

		Composition
		{
			H2        	98.4
			N2        	1.24
			Ne        	0.228
			CH4       	0.0627
			He        	0.0575
			CO        	0.0197
			Ar        	0.00523
		}
	}

	Climate
	{
		GlobalWindSpeed  31.3
	}

	Aurora
	{
		Height         74.7
		NorthLat       78.5
		NorthLon       -20.6
		NorthRadius    1.77e+03
		NorthWidth     586
		NorthRings     4
		NorthBright    0.618
		NorthFlashFreq 79
		NorthMoveSpeed 1.22
		NorthParticles 50000
		SouthLat       -90
		SouthLon       166
		SouthRadius    2.44e+03
		SouthWidth     735
		SouthRings     3
		SouthBright    0.618
		SouthFlashFreq 68.5
		SouthMoveSpeed 0.956
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
		Period            0.051893
		SemiMajorAxisKm   1493934
		Eccentricity    0.1860883375
		Inclination     0
		AscendingNode   161.116099
		ArgOfPericenter 140.435029
		MeanAnomaly     27.6325651
	}
}

Planet	"Tiberius"
{
	ParentBody     "Tiberius & Polion"
	Class          "Neptune"
	Mass            7.444271
	Radius          19543.6484
	InertiaMoment   0.194705158
	Oblateness      0.0302526616
	RotationPeriod  19.85036311
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
		Period            0.051893
		SemiMajorAxisKm   -242462
		Eccentricity    0.0610687023
		Inclination     4.34232
		AscendingNode   -165.642303
		ArgOfPericenter 75.5421467
		MeanAnomaly     51.2263922
	}
}

Moon	"Recluna"
{
	ParentBody     "Polion"
	Class          "Aquaria"
	Mass            0.00363233895
	Radius          1463.38
	InertiaMoment   0.399066538
	Oblateness     (0.007, 0.000, 0.000)
	Obliquity       1.32813977
	EqAscendNode    9.55788771
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.68
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_ganymede.cfg"
		SurfStyle       0.298
		Randomize      (-1.023, 1.878, -0.351)
		colorDistMagn   0.321
		colorDistFreq   1.64
		detailScale     1.72e+03
		drivenDarkening 0.695
		seaLevel        -0.496
		snowLevel       0.511
		tropicLatitude  0.0199
		icecapLatitude  0.824
		icecapHeight    1.45
		climatePole     0.756
		climateTropic   0.656
		climateEquator  0.229
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.229
		heightTempGrad  0.275
		beachWidth      0.00134
		tropicWidth     0.519
		mainFreq        2.37
		venusFreq       1.21
		venusMagn       0
		mareFreq        0.33
		mareDensity     0.176
		terraceProb     0.121
		erosion         0.0687
		montesMagn      0.0644
		montesFreq      0
		montesSpiky     0
		montesFraction  0.115
		dunesMagn       0
		dunesFreq       1
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1
		hillsFraction   0.0153
		hills2Fraction  0
		riversMagn      16.8
		riversFreq      0
		riversSin       5.81
		riftsMagn       0
		riftsFreq       1.07
		riftsSin        5.9
		eqridgeMagn     0
		eqridgeWidth    0.001
		eqridgeModMagn  0
		eqridgeModFreq  0
		canyonsMagn     0.382
		canyonsFreq     0
		canyonsFraction 0.115
		cracksMagn      0.0763
		cracksFreq      0
		cracksOctaves   1
		craterMagn      6.18
		craterFreq      1.53
		craterDensity   0.191
		craterOctaves   11
		craterRayedFactor 0.687
		volcanoMagn     0.188
		volcanoFreq     0
		volcanoDensity  0.187
		volcanoOctaves  3
		volcanoActivity 0.0198
		volcanoFlows    0.0763
		volcanoRadius   0.151
		volcanoTemp     253
		lavaCoverTidal  0.0916
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
		ModulateColor  (0.219 0.200 0.191)
	}

	NoOcean         true

	NoClouds        true

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
		PeriodDays      23.8142059
		SemiMajorAxisKm 239485.998
		Eccentricity    0.0203225632
		Inclination     1.32813977
		AscendingNode   9.55788771
		ArgOfPericenter 154.686429
		MeanAnomaly     -51.9801927
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
		PeriodDays      6.7717006
		SemiMajorAxisKm 310154.792
		Eccentricity    0.0273717032
		Inclination     0.75172051
		AscendingNode   152.056478
		ArgOfPericenter -123.136839
		MeanAnomaly     -66.2341558
	}
}

DwarfMoon	"Theral"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            9.87508590e-10
	Radius          7.707
	InertiaMoment   0.381104393
	Oblateness      0.296233346
	RotationPeriod  7.77216
	Obliquity       66.787114
	EqAscendNode    -75.474714

	AbsMagn         16.7
	SlopeParam      0.11
	Albedo          0.25
	Brightness      2.35
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.093045
		SemiMajorAxisKm 201136.441
		Eccentricity    0.2411671379
		Inclination     3.074276
		AscendingNode   55.857214
		ArgOfPericenter -21.028447
		MeanAnomaly     82.629384
	}
}

DwarfMoon	"Nikise"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.47352974e-11
	Radius          2.741
	InertiaMoment   0.382183591
	Oblateness      0.161929977
	RotationPeriod  15.04124
	Obliquity       50.821218
	EqAscendNode    137.75046

	AbsMagn         17.1
	SlopeParam      0.24
	Albedo          0.05
	Brightness      2.45
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.116191
		SemiMajorAxisKm 201894.029
		Eccentricity    0.0013324667
		Inclination     -1.991167
		AscendingNode   158.36172
		ArgOfPericenter -170.324957
		MeanAnomaly     -119.64258
	}
}

DwarfMoon	"Tokoyuia"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.92068371e-10
	Radius          5.699
	InertiaMoment   0.403125616
	Oblateness      0.272472921
	RotationPeriod  8.76605
	Obliquity       130.906591
	EqAscendNode    -69.680952

	AbsMagn         17
	SlopeParam      0.2
	Albedo          0.31
	Brightness      2.77
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.146341
		SemiMajorAxisKm 202878.684
		Eccentricity    0.3784584614
		Inclination     1.489758
		AscendingNode   -13.334745
		ArgOfPericenter -147.907967
		MeanAnomaly     -130.607008
	}
}

DwarfMoon	"Maikiaiayliaiat"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.00785357e-14
	Radius          0.315
	InertiaMoment   0.38131213
	Oblateness      0.168697804
	RotationPeriod  13.95406
	Obliquity       264.774873
	EqAscendNode    165.151876

	AbsMagn         15
	SlopeParam      0.08
	Albedo          0.18
	Brightness      2.36
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.168588
		SemiMajorAxisKm 203603.751
		Eccentricity    0.3438738145
		Inclination     -2.023001
		AscendingNode   59.370649
		ArgOfPericenter 102.687182
		MeanAnomaly     -38.57657
	}
}

DwarfMoon	"Naryl"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            8.14095024e-9
	Radius          16.762
	InertiaMoment   0.392876647
	Oblateness      0.057406385
	RotationPeriod  13.34453
	Obliquity       327.368938
	EqAscendNode    77.746653

	AbsMagn         21.9
	SlopeParam      0.19
	Albedo          0.17
	Brightness      2.6
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.186292
		SemiMajorAxisKm 204179.801
		Eccentricity    0.2072852775
		Inclination     2.263707
		AscendingNode   159.935243
		ArgOfPericenter -174.683995
		MeanAnomaly     128.516271
	}
}

DwarfMoon	"Mneim"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.55109236e-8
	Radius          26.021
	InertiaMoment   0.382065841
	Oblateness      0.317981621
	RotationPeriod  13.05632
	Obliquity       263.610059
	EqAscendNode    -127.787175

	AbsMagn         20.1
	SlopeParam      0.23
	Albedo          0.29
	Brightness      2.66
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.208703
		SemiMajorAxisKm 204907.875
		Eccentricity    0.0295446404
		Inclination     -1.300285
		AscendingNode   47.116379
		ArgOfPericenter 127.768876
		MeanAnomaly     -131.859066
	}
}

DwarfMoon	"Maia"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            5.30935264e-8
	Radius          28.968
	InertiaMoment   0.37482597
	Oblateness      0.291089874
	RotationPeriod  8.31342
	Obliquity       127.071755
	EqAscendNode    -133.260785

	AbsMagn         15.3
	SlopeParam      0.12
	Albedo          0.19
	Brightness      1.84
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.241969
		SemiMajorAxisKm 205986.195
		Eccentricity    0.4496488024
		Inclination     2.961317
		AscendingNode   -166.740361
		ArgOfPericenter 156.784406
		MeanAnomaly     157.271938
	}
}

DwarfMoon	"Susilecho"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.61316508e-10
	Radius          4.432
	InertiaMoment   0.390788051
	Oblateness      0.23412183
	RotationPeriod  16.0503
	Obliquity       15.283054
	EqAscendNode    82.317838

	AbsMagn         21.2
	SlopeParam      0.16
	Albedo          0.21
	Brightness      2.54
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.214449
		SemiMajorAxisKm 236373.453
		Eccentricity    0.0531553897
		Inclination     0.528772
		AscendingNode   -114.348174
		ArgOfPericenter 51.448671
		MeanAnomaly     -10.69655
	}
}

DwarfMoon	"Uiuiyayo"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            8.86503934e-11
	Radius          3.658
	InertiaMoment   0.370434965
	Oblateness      0.028140149
	RotationPeriod  8.68526
	Obliquity       275.44039
	EqAscendNode    114.317997

	AbsMagn         17.1
	SlopeParam      0.22
	Albedo          0.19
	Brightness      1.73
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.228324
		SemiMajorAxisKm 236792.578
		Eccentricity    0.3495522776
		Inclination     2.814358
		AscendingNode   -89.033049
		ArgOfPericenter 131.686167
		MeanAnomaly     108.555712
	}
}

DwarfMoon	"Nekioacho"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.94194695e-8
	Radius          21.292
	InertiaMoment   0.403047686
	Oblateness      0.115832531
	RotationPeriod  9.96781
	Obliquity       56.583344
	EqAscendNode    -158.197335

	AbsMagn         22.4
	SlopeParam      0.19
	Albedo          0.08
	Brightness      1.68
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.250579
		SemiMajorAxisKm 237464.056
		Eccentricity    0.228623956
		Inclination     1.361204
		AscendingNode   157.4564
		ArgOfPericenter -161.987988
		MeanAnomaly     -173.846141
	}
}

DwarfMoon	"Yucharioa"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.30995783e-8
	Radius          21.69
	InertiaMoment   0.382341053
	Oblateness      0.264758755
	RotationPeriod  17.21122
	Obliquity       58.300016
	EqAscendNode    66.303877

	AbsMagn         22.1
	SlopeParam      0.17
	Albedo          0.25
	Brightness      2.48
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.256089
		SemiMajorAxisKm 237630.172
		Eccentricity    0.3574937457
		Inclination     -1.520443
		AscendingNode   63.059828
		ArgOfPericenter 31.315604
		MeanAnomaly     61.435643
	}
}

DwarfMoon	"Tiricho"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.53483501e-9
	Radius          12.99
	InertiaMoment   0.387799587
	Oblateness      0.345965632
	RotationPeriod  12.43237
	Obliquity       240.404058
	EqAscendNode    54.712282

	AbsMagn         19
	SlopeParam      0.12
	Albedo          0.27
	Brightness      2.83
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.276777
		SemiMajorAxisKm 238253.315
		Eccentricity    0.3148102252
		Inclination     0.890496
		AscendingNode   7.593572
		ArgOfPericenter 74.421856
		MeanAnomaly     -101.678091
	}
}

DwarfMoon	"Keleru"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.66373070e-10
	Radius          6.23
	InertiaMoment   0.394770523
	Oblateness      0.142698528
	RotationPeriod  3.50642
	Obliquity       266.716915
	EqAscendNode    -146.845846

	AbsMagn         20.3
	SlopeParam      0.16
	Albedo          0.17
	Brightness      1.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.301888
		SemiMajorAxisKm 239008.576
		Eccentricity    0.229878114
		Inclination     -2.685304
		AscendingNode   3.145894
		ArgOfPericenter 130.07639
		MeanAnomaly     -144.717604
	}
}

DwarfMoon	"Rachioasa"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.35296460e-8
	Radius          19.488
	InertiaMoment   0.395983394
	Oblateness      0.079955733
	RotationPeriod  17.16406
	Obliquity       16.484737
	EqAscendNode    155.718731

	AbsMagn         17.1
	SlopeParam      0.11
	Albedo          0.34
	Brightness      2.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.327818
		SemiMajorAxisKm 239787.222
		Eccentricity    0.4429498011
		Inclination     -2.445592
		AscendingNode   129.289708
		ArgOfPericenter -63.627784
		MeanAnomaly     46.041279
	}
}

DwarfMoon	"Tuchakaya"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            8.97887745e-9
	Radius          17.109
	InertiaMoment   0.375973812
	Oblateness      0.195102587
	RotationPeriod  8.60756
	Obliquity       132.781068
	EqAscendNode    92.439428

	AbsMagn         19.1
	SlopeParam      0.08
	Albedo          0.25
	Brightness      1.95
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.336849
		SemiMajorAxisKm 240058.11
		Eccentricity    0.1122902057
		Inclination     -1.090349
		AscendingNode   116.091101
		ArgOfPericenter 139.818945
		MeanAnomaly     66.093408
	}
}

DwarfMoon	"Tacho"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.97946035e-8
	Radius          34.164
	InertiaMoment   0.396909974
	Oblateness      0.139277296
	RotationPeriod  9.7572
	Obliquity       294.246041
	EqAscendNode    -125.004635

	AbsMagn         16.4
	SlopeParam      0.23
	Albedo          0.29
	Brightness      1.68
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.140094
		SemiMajorAxisKm 291471.261
		Eccentricity    0.1458620802
		Inclination     0.927061
		AscendingNode   -124.720841
		ArgOfPericenter -7.848712
		MeanAnomaly     57.936951
	}
}

DwarfMoon	"Rele"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.71724655e-8
	Radius          35.965
	InertiaMoment   0.379445117
	Oblateness      0.344690822
	RotationPeriod  15.18348
	Obliquity       295.07839
	EqAscendNode    107.376491

	AbsMagn         19.1
	SlopeParam      0.12
	Albedo          0.31
	Brightness      2.45
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.165699
		SemiMajorAxisKm 292167.669
		Eccentricity    0.3587293849
		Inclination     -3.314173
		AscendingNode   -33.126846
		ArgOfPericenter -115.573614
		MeanAnomaly     74.612291
	}
}

DwarfMoon	"Poneviaylnuscha"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.01520657e-11
	Radius          1.812
	InertiaMoment   0.387344306
	Oblateness      0.165763943
	RotationPeriod  13.27168
	Obliquity       303.248059
	EqAscendNode    -163.715019

	AbsMagn         22.1
	SlopeParam      0.2
	Albedo          0.23
	Brightness      2.29
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.288207
		SemiMajorAxisKm 295488.263
		Eccentricity    0.0330997532
		Inclination     3.75696
		AscendingNode   -39.769334
		ArgOfPericenter 133.914658
		MeanAnomaly     -110.435953
	}
}

DwarfMoon	"Neikima"
{
	ParentBody     "Tiberius"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.00269902e-8
	Radius          36.533
	InertiaMoment   0.397714838
	Oblateness      0.229268617
	RotationPeriod  2.96587
	Obliquity       267.254393
	EqAscendNode    72.977661

	AbsMagn         15.9
	SlopeParam      0.07
	Albedo          0.29
	Brightness      1.34
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.328068
		SemiMajorAxisKm 296564.684
		Eccentricity    0.2551493142
		Inclination     -1.49407
		AscendingNode   -163.964862
		ArgOfPericenter 102.685858
		MeanAnomaly     -77.544691
	}
}

Moon	"Reione"
{
	ParentBody     "Tiberius"
	Class          "Terra"
	Mass            0.00102375902
	Radius          691.344727
	InertiaMoment   0.396805316
	Oblateness      0.00672322884
	Obliquity       1.24574789
	EqAscendNode    -87.8291338
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_io2.cfg"
		SurfStyle       0.541
		Randomize      (-2.000, -2.000, -2.000)
		colorDistMagn   0.0736
		colorDistFreq   122
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.242
		snowLevel       2
		tropicLatitude  0.0404
		icecapLatitude  1.77
		icecapHeight    0.355
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
		beachWidth      0.00056
		tropicWidth     0.07
		mainFreq        1.55
		venusFreq       0.626
		venusMagn       0
		mareFreq        0.12
		mareDensity     0.169
		terraceProb     0.285
		erosion         0
		montesMagn      0.0774
		montesFreq      45.7
		montesSpiky     0.896
		montesFraction  0.485
		dunesMagn       0.0479
		dunesFreq       6.91
		dunesFraction   0.938
		hillsMagn       0.138
		hillsFreq       105
		hillsFraction   0.0379
		hills2Fraction  0
		riversMagn      75
		riversFreq      3.25
		riversSin       6.42
		riftsMagn       63.8
		riftsFreq       3.69
		riftsSin        5.79
		canyonsMagn     0.508
		canyonsFreq     0.316
		canyonsFraction 0.642
		cracksMagn      0.0785
		cracksFreq      0.524
		cracksOctaves   0
		craterMagn      0.513
		craterFreq      1.9
		craterDensity   0.887
		craterOctaves   18
		craterRayedFactor 0
		volcanoMagn     0.176
		volcanoFreq     0.799
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.639
		volcanoFlows    0.151
		volcanoRadius   0.132
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
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

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
		PeriodDays      1.86453411
		SemiMajorAxisKm 90024.3109
		Eccentricity    0.000392803918
		Inclination     1.24574789
		AscendingNode   -87.8291338
		ArgOfPericenter 8.74675577
		MeanAnomaly     136.102999
	}
}



