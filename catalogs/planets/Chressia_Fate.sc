Barycenter	"Chressia & Entactrius"
{
	ParentBody     "Fate"
	Mass            0.03230204
	Radius          23805.6523
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane	"Equator"
		Period		1.813
		SemiMajorAxis	1.5114
		Eccentricity	0.0939481028
		Inclination	0
	}
}

Planet	"Chressia"
{
	ParentBody     "Chressia & Entactrius"
	Class          "Terra"
	Mass            1.84000003
	Radius          9654.56738
	InertiaMoment   0.35393545
	Oblateness      0.00155683537
	RotationPeriod  2.2012125
	Obliquity       -0.119892677
	EqAscendNode    -123.830841

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      0.992
	BrightnessReal  1

	Surface
	{
		Preset         "carbonia_airless_rust.cfg"
		SurfStyle       0.87
		Randomize      (0.412, -0.398, 0.888)
		colorDistMagn   0.0458
		colorDistFreq   195
		detailScale     187
		drivenDarkening 0
		seaLevel        0.55
		snowLevel       -0.542
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
		humidity        0.134
		heightTempGrad  0.748
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        2.09
		venusFreq       0.611
		venusMagn       0
		mareFreq        1.33
		mareDensity     0.116
		terraceProb     0.372
		erosion         0
		montesMagn      0.0962
		montesFreq      93.7
		montesSpiky     0.969
		montesFraction  0.85
		dunesMagn       0.0402
		dunesFreq       23.5
		dunesFraction   0.0637
		hillsMagn       0.121
		hillsFreq       188
		hillsFraction   0.0626
		hills2Fraction  0
		riversMagn      58
		riversFreq      4.07
		riversSin       4.61
		riftsMagn       66.5
		riftsFreq       4.12
		riftsSin        6.25
		eqridgeMagn     0.37
		eqridgeWidth    0.0216
		eqridgeModMagn  2.35
		eqridgeModFreq  10
		canyonsMagn     0.502
		canyonsFreq     0.666
		canyonsFraction 0.207
		cracksMagn      0.0608
		cracksFreq      1.21
		cracksOctaves   0
		craterMagn      0.608
		craterFreq      8.1
		craterDensity   0.885
		craterOctaves   19
		craterRayedFactor 0.113
		volcanoMagn     0.401
		volcanoFreq     0.828
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.72
		volcanoFlows    0.241
		volcanoRadius   0.309
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0.687
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.824 0.750 0.264)
		GlowBright      0.916
		TempMapMaxTemp  1.75e+03
	}

	Rings
	{
		InnerRadius     21400
		OuterRadius     26500
		EdgeRadius      2.15e+04
		MeanRadius      1.34e+04
		Thickness       0.067
		RocksMaxSize    0.55
		RocksSpacing    16.6
		DustDrawDist    201
		ChartRadius     2.15e+04
		RotationPeriod  5.76
		Brightness      1
		FrontBright     2.95
		BackBright      4.24
		Density         0.967
		Opacity         0.967
		SelfShadow      0.967
		PlanetShadow    0.967
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       1.5e+03
		densityScale    2.15
		densityOffset   -1.46
		densityPower    5.06
		colorContrast   0.0736
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}


	Ocean
	{
		Depth           7.1
		Hapke           0
		SpotBright      2
		SpotWidth       0.06
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	89.73
			SO2		10.37
		}
	}

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          1130.92847
		Density         1.27088156
		Pressure        1.11122382
		Greenhouse      192.641235
		Bright          1.68
		Opacity         0.634
		SkyLight        0
		Hue             0.5
		Saturation      0.794

		Composition
		{
			SO2       	75
			CH4			10
			N2			10.1
			Kr        	4.68
			C8H18     	0.206
			Cl2       	0.0429
			Xe        	0.00668
		}
	}

	Climate
	{
		GlobalWindSpeed  2
	}

	NoAurora        true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      39.907869
		SemiMajorAxisKm -28962.223
		Eccentricity    0.00123931874
		Inclination     -2.2992788
		AscendingNode   139.494825
		ArgOfPericenter 344.130316
		MeanAnomaly     307.434889
	}
}

Moon	"Qutaro"
{
	ParentBody     "Chressia"
	Class          "Terra"
	Mass            8.52406229e-05
	Radius          321.73999
	InertiaMoment   0.399399668
	Oblateness      0.00341975084
	Obliquity       0.417924303
	EqAscendNode    -84.4593706
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.22
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
		SurfStyle       0.421
		Randomize      (-0.750, -0.015, 0.807)
		colorDistMagn   0.0586
		colorDistFreq   63.9
		detailScale     1.02e+03
		drivenDarkening 0.7
		seaLevel        0.223
		snowLevel       2
		tropicLatitude  0.032
		icecapLatitude  1.22
		icecapHeight    0.427
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
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        1.52
		venusFreq       1.52
		venusMagn       0
		mareFreq        0
		mareDensity     0.198
		terraceProb     0.173
		erosion         0
		montesMagn      0.0605
		montesFreq      20.7
		montesSpiky     0.969
		montesFraction  0.846
		dunesMagn       0.0257
		dunesFreq       3.93
		dunesFraction   0.172
		hillsMagn       0.137
		hillsFreq       11.4
		hillsFraction   0.154
		hills2Fraction  0.134
		riversMagn      3.82
		riversFreq      3.78
		riversSin       4.76
		riftsMagn       0
		riftsFreq       2.69
		riftsSin        4.28
		canyonsMagn     4.43
		canyonsFreq     710
		canyonsFraction 0
		cracksMagn      0.001
		cracksFreq      6.3
		cracksOctaves   1
		craterMagn      0.591
		craterFreq      3.05
		craterDensity   0.837
		craterOctaves   17
		craterRayedFactor 0.168
		volcanoMagn     0.2
		volcanoFreq     0.728
		volcanoDensity  0.273
		volcanoOctaves  3
		volcanoActivity 0.174
		volcanoFlows    0.199
		volcanoRadius   0.131
		volcanoTemp     191
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
		PeriodDays      7.99234697
		SemiMajorAxisKm 312493.05
		Eccentricity    0.093931874
		Inclination     -2.9392788
		AscendingNode   -84.4593706
		ArgOfPericenter -6.28193828
		MeanAnomaly     31.0619959
	}
}

Moon	"Chusa"
{
	ParentBody     "Chressia"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            5.81990778e-8
	Radius          34.124
	InertiaMoment   0.385922407
	Oblateness      0.118889497
	RotationPeriod  2.15364
	Obliquity       27.360018
	EqAscendNode    -60.216232

	AbsMagn         17.6
	SlopeParam      0.17
	Albedo          0.2
	Brightness      1.25
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      24.930203
		SemiMajorAxisKm 511324.15
		Eccentricity    0.213847649
		Inclination     9.486615
		AscendingNode   -115.771433
		ArgOfPericenter -24.588399
		MeanAnomaly     128.291375
	}
}

Moon	"Telia"
{
	ParentBody     "Chressia"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.09031835e-7
	Radius          37.785
	InertiaMoment   0.398436684
	Oblateness      0.054203942
	RotationPeriod  10.5444
	Obliquity       196.6402
	EqAscendNode    -97.813297

	AbsMagn         20.5
	SlopeParam      0.17
	Albedo          0.29
	Brightness      1.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.961604
		SemiMajorAxisKm 71428.033
		Eccentricity    0.4012454642
		Inclination     -0.513066
		AscendingNode   67.799307
		ArgOfPericenter -17.918839
		MeanAnomaly     -40.295308
	}
}

Moon	"Entactrius"
{
	ParentBody     "Chressia & Entactrius"
	Class          "Terra"
	Mass            0.681920469
	Radius          3617.54541
	InertiaMoment   0.329854131
	Oblateness      0.00755331991
	RotationPeriod  21.8622274
	RotationEpoch   0
	Obliquity       -47.9116515
	EqAscendNode    141.128558

	AlbedoBond      0.595
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine"
	}

	Surface
	{
		Preset         "terra_wet_earth_blue.cfg"
		SurfStyle       0.298
		Randomize      (0.448, 0.595, 0.590)
		colorDistMagn   0.0429
		colorDistFreq   850
		detailScale     7.13e+05
		drivenDarkening 0
		seaLevel        0.45
		snowLevel       1.34
		tropicLatitude  0.832
		icecapLatitude  1.01
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -0.771
		climateSteppeMax 0.115
		climateForestMin -0.695
		climateForestMax 0.0992
		climateGrassMin  -0.832
		climateGrassMax  0.542
		humidity        0.202
		heightTempGrad  0.625
		beachWidth      0.00165
		tropicWidth     0.07
		mainFreq        0.829
		venusFreq       1.5
		venusMagn       0
		mareFreq        3.11
		mareDensity     0.0321
		terraceProb     0.167
		erosion         0.104
		montesMagn      0.199
		montesFreq      289
		montesSpiky     0.804
		montesFraction  0.0161
		dunesMagn       0.0402
		dunesFreq       70.7
		dunesFraction   0.329
		hillsMagn       0.126
		hillsFreq       97.3
		hillsFraction   0.645
		hills2Fraction  0.439
		riversMagn      74
		riversFreq      5.19
		riversSin       5.99
		riftsMagn       0
		riftsFreq       3.82
		riftsSin        4.32
		canyonsMagn     0.03
		canyonsFreq     149
		canyonsFraction 0.794
		cracksMagn      0.0982
		cracksFreq      0.526
		cracksOctaves   0
		craterMagn      0.55
		craterFreq      6.87
		craterDensity   0.0916
		craterOctaves   3
		volcanoMagn     0.359
		volcanoFreq     0.229
		volcanoDensity  0.284
		volcanoOctaves  3
		volcanoActivity 0.821
		volcanoFlows    0.749
		volcanoRadius   0.321
		volcanoTemp     181
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97
		stripeTwist     0.138
		cycloneMagn     2.82
		cycloneFreq     0.807
		cycloneDensity  0.304
		cycloneOctaves  2
		BumpHeight      20
		BumpOffset      0.0126
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.24
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           9
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	90.5
			SO2       	7.38
		}
	}

	Clouds
	{
		Height          14.3
		Velocity        80.9
		BumpHeight      2.15
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      1.25
		ModulateColor  (0.831 0.893 0.934)
		ModulateBright  1
		Opacity         0.748
		mainFreq        0.595
		mainOctaves     10
		Coverage        0.405
		stripeZones     1.97
		stripeTwist     0.138
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          59.0190697
		Density         1.71691537
		Pressure        0.853685081
		Greenhouse      216.099243
		Bright          10.4
		Opacity         2.21
		SkyLight        3.33
		Hue             -0.105
		Saturation      1.16

		Composition
		{
			N2        	81
			O2        	17.5
			CO2       	0.9
			H2        	0.07
			CO        	0.0374
			Cl2       	0.0045
			Ne        	0.000178
			Ar        	3.47e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  8.35
	}

	Aurora
	{
		Height         241
		NorthLat       64.4
		NorthLon       70.1
		NorthRadius    1.52e+03
		NorthWidth     351
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 58.4
		NorthMoveSpeed 1.69
		NorthParticles 50000
		SouthLat       -62.9
		SouthLon       -111
		SouthRadius    2.13e+03
		SouthWidth     734
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 75.4
		SouthMoveSpeed 1.06
		SouthParticles 50000
		TopColor    (0.199 0.458 0.629)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      39.907869
		SemiMajorAxisKm 472893.223
		Eccentricity    0.00123931874
		Inclination     -2.2992788
		AscendingNode   139.494825
		ArgOfPericenter 344.130316
		MeanAnomaly     307.434889
	}
}

