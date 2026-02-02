Planet	"Noi"
{
	ParentBody     "Fate"
	Class          "Neptune"
	Mass            787.71928596
	Radius          129911.9375
	InertiaMoment   0.234544456
	Oblateness      0.054351144
	RotationPeriod  11.4997609
	RotationEpoch   0
	Obliquity       -105.248079
	EqAscendNode    51.6861451

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cold_default.cfg"
		SurfStyle       0.369
		Randomize      (-0.622, -0.531, -0.990)
		detailScale     256
		tropicLatitude  0.966
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.141
		stripeZones     1.73
		stripeFluct     0.415
		stripeTwist     11.3
		cycloneMagn     12.9
		cycloneFreq     1.07
		cycloneDensity  0.381
		cycloneOctaves  0
		cycloneMagn2     0.666
		cycloneFreq2     0.699
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      17.8
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
		Velocity        975
		BumpHeight      18.2
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.758
		mainOctaves     12
		Coverage        0.489
		stripeZones     1.73
		stripeFluct     0.415
		stripeTwist     11.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          622.950256
		Density         0.00817847811
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0189
		Saturation      1.78

		Composition
		{
			H2        	89.9
			He        	8.33
			CH4       	1.25
			C3H8      	0.115
			C8H18     	0.113
			C2H2      	0.105
			C2H4      	0.0442
			N2        	0.0391
			NH3       	0.0305
			C2H6      	0.0242
			O2        	0.00949
			Ne        	0.00123
			Ar        	0.000917
			CO2       	5.49e-05
			H2O       	2.93e-06
			H2S       	1.85e-06
			Kr        	4.25e-07
			Xe        	4.62e-08
			CO        	1.36e-08
			SO2       	1.15e-08
			Cl2       	3.36e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  333
	}

	Aurora
	{
		Height         187
		NorthLat       56
		NorthLon       88.2
		NorthRadius    5.78e+03
		NorthWidth     1.8e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 66
		NorthMoveSpeed 1.08
		NorthParticles 10000
		SouthLat       -55.3
		SouthLon       -98.6
		SouthRadius    5.73e+03
		SouthWidth     1.83e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 71.3
		SouthMoveSpeed 0.919
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		Texture        "Saturn-rings.*"
		InnerRadius     178000
		OuterRadius     3328000
		EdgeRadius      1.37e+05
		MeanRadius      1.06e+05
		Thickness       0.15
		RocksMaxSize    0.008
		RocksSpacing    1
		DustDrawDist    450
		ChartRadius     1.37e+05
		RotationPeriod  9.06
		Brightness      1
		FrontBright     2
		BackBright      5
		Density         1
		Opacity         1
		SelfShadow      1
		PlanetShadow    1
		Hapke           1
		SpotBright      0.45
		SpotWidth       0.015
		SpotBrightCB    1.95
		SpotWidthCB     0.00245
		frequency       7.11
		densityScale    1.68
		densityOffset   -0.197
		densityPower    0.993
		colorContrast   0.053
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
		Period          3.5733
		SemiMajorAxis   4.8819306
		Eccentricity    0.0320770373
		Inclination     -0.163891729
		AscendingNode   67.0212759
		ArgOfPericenter 106.565202
		MeanAnomaly     158.192602
	}
}

Moon	"Sotrre"
{
	ParentBody     "Noi"
	Class          "Terra"
	Mass            0.194712758
	Radius          829.22998
	InertiaMoment   0.328328669
	Oblateness     (0.000, 0.300, 0.300)
	Obliquity       0.2723881
	EqAscendNode    -48.177359
	TidalLocked     true

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_arid_rocky_black.cfg"
		SurfStyle       0.58
		Randomize      (0.872, 0.139, -0.880)
		colorDistMagn   0.0392
		colorDistFreq   344
		detailScale     1.05e+09
		drivenDarkening 0.096
		seaLevel        -1
		snowLevel       -1
		tropicLatitude  0.429
		icecapLatitude  0.948
		icecapHeight    0.0394
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.513
		heightTempGrad  0.625
		beachWidth      0.000701
		tropicWidth     0.07
		mainFreq        3.29
		venusFreq       0.88
		venusMagn       0
		mareFreq        0.003
		mareDensity     0.175
		terraceProb     0.175
		erosion         0.022
		montesMagn      0.216
		montesFreq      203
		montesSpiky     0.945
		montesFraction  0.845
		dunesMagn       0.0378
		dunesFreq       30.5
		dunesFraction   0.87
		hillsMagn       0.127
		hillsFreq       416
		hillsFraction   0.716
		hills2Fraction  0
		riversMagn      56.2
		riversFreq      2.44
		riversSin       7.23
		riftsMagn       3.53
		riftsFreq       1.85
		riftsSin        5.05
		canyonsMagn     0.403
		canyonsFreq     767
		canyonsFraction 0.444
		cracksMagn      0.0653
		cracksFreq      1.9
		cracksOctaves   0
		craterMagn      0.283
		craterFreq      21.6
		craterDensity   0.155
		craterOctaves   6
		craterRayedFactor 0.105
		volcanoMagn     0.681
		volcanoFreq     2
		volcanoDensity  0.285
		volcanoOctaves  2
		volcanoActivity 2
		volcanoFlows    0.112
		volcanoRadius   0.492
		volcanoTemp     369
		lavaCoverTidal  0.107
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.5
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.55
		Hapke           0.5
		SpotBright      2.95
		SpotWidth       0.043
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

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
		PeriodDays      17.1327439
		SemiMajorAxisKm 2625428.66
		Eccentricity    0.93129771
		Inclination     41.221374
		AscendingNode   -48.177359
		ArgOfPericenter 56.498738
		MeanAnomaly     -66.572389
	}
}

Moon	"Tareti"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.39145694e-9
	Radius          13.406
	InertiaMoment   0.401921151
	Oblateness      0.088342934
	RotationPeriod  4.34254
	Obliquity       219.277598
	EqAscendNode    137.471147

	AbsMagn         18.6
	SlopeParam      0.23
	Albedo          0.12
	Brightness      2.88
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.410731
		SemiMajorAxisKm 496858.457
		Eccentricity    0.1077143015
		Inclination     1.215174
		AscendingNode   67.461912
		ArgOfPericenter 61.064236
		MeanAnomaly     -174.308269
	}
}

Moon	"Niiatile"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            3.25878053e-11
	Radius          2.705
	InertiaMoment   0.385851496
	Oblateness      0.130350892
	RotationPeriod  17.39583
	Obliquity       201.666659
	EqAscendNode    -135.952702

	AbsMagn         22.2
	SlopeParam      0.11
	Albedo          0.15
	Brightness      2.6
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.4206
		SemiMajorAxisKm 499173.09
		Eccentricity    0.0511463297
		Inclination     -0.724292
		AscendingNode   -148.022606
		ArgOfPericenter 58.824897
		MeanAnomaly     51.826587
	}
}

Moon	"Polvia"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.82422164e-8
	Radius          29.856
	InertiaMoment   0.398427825
	Oblateness      0.304848292
	RotationPeriod  16.44428
	Obliquity       236.121505
	EqAscendNode    -79.975554

	AbsMagn         16.2
	SlopeParam      0.24
	Albedo          0.3
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.425283
		SemiMajorAxisKm 500269.577
		Eccentricity    0.4306071652
		Inclination     3.975873
		AscendingNode   18.207421
		ArgOfPericenter 150.815378
		MeanAnomaly     -31.829216
	}
}

Moon	"Tasukuke"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            7.90708556e-8
	Radius          36.408
	InertiaMoment   0.385230555
	Oblateness      0.053588385
	RotationPeriod  3.03544
	Obliquity       122.369336
	EqAscendNode    -72.179476

	AbsMagn         20.7
	SlopeParam      0.08
	Albedo          0.3
	Brightness      2.55
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.428218
		SemiMajorAxisKm 500955.962
		Eccentricity    0.2488312073
		Inclination     3.785234
		AscendingNode   -9.34977
		ArgOfPericenter 42.115845
		MeanAnomaly     -16.990966
	}
}

Moon	"Mvia"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.19625161e-9
	Radius          14.604
	InertiaMoment   0.385815947
	Oblateness      0.199317207
	RotationPeriod  2.54584
	Obliquity       268.266739
	EqAscendNode    95.80315

	AbsMagn         20.8
	SlopeParam      0.07
	Albedo          0.19
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.429573
		SemiMajorAxisKm 501272.696
		Eccentricity    0.4021983303
		Inclination     -1.410207
		AscendingNode   105.583296
		ArgOfPericenter 38.557769
		MeanAnomaly     -56.831528
	}
}

Moon	"Scherna"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.57583417e-8
	Radius          27.503
	InertiaMoment   0.376965597
	Oblateness      0.094644738
	RotationPeriod  5.09024
	Obliquity       260.054341
	EqAscendNode    1.491472

	AbsMagn         18.3
	SlopeParam      0.24
	Albedo          0.09
	Brightness      1.63
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.432013
		SemiMajorAxisKm 501842.933
		Eccentricity    0.3970438251
		Inclination     3.837646
		AscendingNode   81.572622
		ArgOfPericenter 3.613943
		MeanAnomaly     -46.105046
	}
}

Moon	"Scheiet"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.58725036e-9
	Radius          12.079
	InertiaMoment   0.403226135
	Oblateness      0.103599028
	RotationPeriod  11.24951
	Obliquity       234.886181
	EqAscendNode    -73.93309

	AbsMagn         18.9
	SlopeParam      0.1
	Albedo          0.25
	Brightness      2.79
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.438636
		SemiMajorAxisKm 503389.231
		Eccentricity    0.2562757382
		Inclination     -2.94573
		AscendingNode   -61.78434
		ArgOfPericenter 137.155949
		MeanAnomaly     -128.853731
	}
}

Moon	"Kaku"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            7.12703757e-11
	Radius          3.527
	InertiaMoment   0.400571813
	Oblateness      0.096840334
	RotationPeriod  11.76687
	Obliquity       311.162746
	EqAscendNode    -147.583709

	AbsMagn         19.3
	SlopeParam      0.2
	Albedo          0.31
	Brightness      1.38
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.797737
		SemiMajorAxisKm 584010.638
		Eccentricity    0.4485649636
		Inclination     2.281102
		AscendingNode   -84.638524
		ArgOfPericenter 17.438382
		MeanAnomaly     -13.987771
	}
}

Moon	"Luieru"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.76270640e-9
	Radius          14.122
	InertiaMoment   0.404525709
	Oblateness      0.111040567
	RotationPeriod  6.38338
	Obliquity       46.953726
	EqAscendNode    82.788562

	AbsMagn         14.5
	SlopeParam      0.05
	Albedo          0.17
	Brightness      2.93
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.808067
		SemiMajorAxisKm 586245.693
		Eccentricity    0.0064513261
		Inclination     -0.069559
		AscendingNode   121.278808
		ArgOfPericenter -22.915511
		MeanAnomaly     125.914709
	}
}

Moon	"Niru"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.82257441e-8
	Radius          26.342
	InertiaMoment   0.376212272
	Oblateness      0.171093303
	RotationPeriod  10.2096
	Obliquity       193.384441
	EqAscendNode    -113.836258

	AbsMagn         17.4
	SlopeParam      0.23
	Albedo          0.22
	Brightness      1.73
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.812825
		SemiMajorAxisKm 587273.735
		Eccentricity    0.2523048642
		Inclination     -0.88955
		AscendingNode   -168.401342
		ArgOfPericenter -49.615688
		MeanAnomaly     -174.107829
	}
}

Moon	"Kithe"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            7.69658276e-8
	Radius          34.725
	InertiaMoment   0.39975772
	Oblateness      0.098299962
	RotationPeriod  14.14339
	Obliquity       354.654919
	EqAscendNode    -60.708349

	AbsMagn         14.5
	SlopeParam      0.19
	Albedo          0.09
	Brightness      1.85
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.821471
		SemiMajorAxisKm 589139.336
		Eccentricity    0.4321149375
		Inclination     -3.74352
		AscendingNode   -119.196744
		ArgOfPericenter -30.470497
		MeanAnomaly     137.476079
	}
}

Moon	"Chiyuei"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            9.62788625e-8
	Radius          35.453
	InertiaMoment   0.383742844
	Oblateness      0.072619723
	RotationPeriod  16.74093
	Obliquity       52.492343
	EqAscendNode    -10.943882

	AbsMagn         16.7
	SlopeParam      0.17
	Albedo          0.32
	Brightness      1.32
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.832113
		SemiMajorAxisKm 591431.899
		Eccentricity    0.441614751
		Inclination     -0.158286
		AscendingNode   56.151594
		ArgOfPericenter -179.59594
		MeanAnomaly     160.434427
	}
}

Moon	"Nale"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.31583635e-8
	Radius          31.879
	InertiaMoment   0.371169971
	Oblateness      0.271891575
	RotationPeriod  16.0388
	Obliquity       181.648395
	EqAscendNode    128.754453

	AbsMagn         20.1
	SlopeParam      0.08
	Albedo          0.34
	Brightness      1.48
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.840513
		SemiMajorAxisKm 593238.266
		Eccentricity    0.3066918433
		Inclination     -2.009167
		AscendingNode   -7.005619
		ArgOfPericenter 165.939602
		MeanAnomaly     33.167764
	}
}

Moon	"Kiete"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.01840513e-10
	Radius          5.957
	InertiaMoment   0.38290891
	Oblateness      0.11455852
	RotationPeriod  15.32964
	Obliquity       278.68376
	EqAscendNode    22.866388

	AbsMagn         19.4
	SlopeParam      0.18
	Albedo          0.33
	Brightness      2.08
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.865704
		SemiMajorAxisKm 598639.174
		Eccentricity    0.2388707965
		Inclination     -3.290638
		AscendingNode   -51.80969
		ArgOfPericenter -11.812497
		MeanAnomaly     -60.628065
	}
}

Moon	"Timona"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.96784252e-9
	Radius          13.472
	InertiaMoment   0.409314794
	Oblateness      0.275904591
	RotationPeriod  15.80321
	Obliquity       323.297614
	EqAscendNode    -38.278106

	AbsMagn         21.8
	SlopeParam      0.07
	Albedo          0.22
	Brightness      1.93
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      33.536581
		SemiMajorAxisKm 4.10786135e+6
		Eccentricity    0.0253440553
		Inclination     -0.576618
		AscendingNode   169.881237
		ArgOfPericenter -0.606003
		MeanAnomaly     85.397265
	}
}

Moon	"Seoayiti"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.51189509e-8
	Radius          35.005
	InertiaMoment   0.400527005
	Oblateness      0.089863848
	RotationPeriod  2.39067
	Obliquity       33.325661
	EqAscendNode    -132.192831

	AbsMagn         17.9
	SlopeParam      0.08
	Albedo          0.13
	Brightness      2.47
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      33.77397
		SemiMajorAxisKm 4.12722357e+6
		Eccentricity    0.4128582378
		Inclination     -0.570086
		AscendingNode   39.558348
		ArgOfPericenter -10.31261
		MeanAnomaly     77.283222
	}
}

Moon	"Sclna"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.23417483e-8
	Radius          23.179
	InertiaMoment   0.37845334
	Oblateness      0.162263951
	RotationPeriod  8.07218
	Obliquity       186.845169
	EqAscendNode    36.050223

	AbsMagn         16.6
	SlopeParam      0.18
	Albedo          0.16
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      33.850525
		SemiMajorAxisKm 4.13345796e+6
		Eccentricity    0.3085865103
		Inclination     -3.796945
		AscendingNode   -179.37437
		ArgOfPericenter 51.322441
		MeanAnomaly     145.259419
	}
}

Moon	"Yina"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.05323077e-7
	Radius          36.671
	InertiaMoment   0.37356704
	Oblateness      0.34743567
	RotationPeriod  8.3792
	Obliquity       117.226903
	EqAscendNode    174.96501

	AbsMagn         15.8
	SlopeParam      0.24
	Albedo          0.28
	Brightness      2.07
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      33.967066
		SemiMajorAxisKm 4.14293969e+6
		Eccentricity    0.3032559924
		Inclination     3.562117
		AscendingNode   -31.010105
		ArgOfPericenter 82.424416
		MeanAnomaly     30.275475
	}
}

Moon	"Sara"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.97256406e-8
	Radius          22.689
	InertiaMoment   0.374547757
	Oblateness      0.244050707
	RotationPeriod  16.31084
	Obliquity       335.07106
	EqAscendNode    -151.342013

	AbsMagn         19.7
	SlopeParam      0.24
	Albedo          0.23
	Brightness      1.81
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.06866
		SemiMajorAxisKm 4.15119652e+6
		Eccentricity    0.2393487056
		Inclination     -0.956521
		AscendingNode   -69.163658
		ArgOfPericenter 33.957498
		MeanAnomaly     121.92646
	}
}

Moon	"Niyokiso"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.34710212e-8
	Radius          30.102
	InertiaMoment   0.392050264
	Oblateness      0.095042942
	RotationPeriod  6.43398
	Obliquity       9.287834
	EqAscendNode    134.426306

	AbsMagn         17.3
	SlopeParam      0.13
	Albedo          0.12
	Brightness      2.56
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.11805
		SemiMajorAxisKm 4.15520755e+6
		Eccentricity    0.4321617911
		Inclination     0.362219
		AscendingNode   -35.019097
		ArgOfPericenter -48.367954
		MeanAnomaly     -160.08575
	}
}

Moon	"Kachachu"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            9.80478954e-9
	Radius          18.055
	InertiaMoment   0.372180809
	Oblateness      0.264720362
	RotationPeriod  8.63206
	Obliquity       196.325126
	EqAscendNode    42.456763

	AbsMagn         17.5
	SlopeParam      0.13
	Albedo          0.06
	Brightness      1.78
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.130992
		SemiMajorAxisKm 4.15625831e+6
		Eccentricity    0.3975228044
		Inclination     3.458641
		AscendingNode   -177.778397
		ArgOfPericenter 126.940802
		MeanAnomaly     2.024731
	}
}

Moon	"Tayuiela"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.46265450e-10
	Radius          6.995
	InertiaMoment   0.397348507
	Oblateness      0.096438495
	RotationPeriod  11.02573
	Obliquity       123.917705
	EqAscendNode    -26.354716

	AbsMagn         15.7
	SlopeParam      0.1
	Albedo          0.15
	Brightness      2.76
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.395867
		SemiMajorAxisKm 4.17773375e+6
		Eccentricity    0.0754918217
		Inclination     3.114232
		AscendingNode   -68.523024
		ArgOfPericenter 23.13266
		MeanAnomaly     61.577901
	}
}

Moon	"Kiataik"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            6.57507578e-8
	Radius          35.477
	InertiaMoment   0.397622063
	Oblateness      0.275778234
	RotationPeriod  4.79569
	Obliquity       266.127398
	EqAscendNode    -73.691792

	AbsMagn         15.7
	SlopeParam      0.19
	Albedo          0.34
	Brightness      1.34
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.587056
		SemiMajorAxisKm 4.19320077e+6
		Eccentricity    0.2060699218
		Inclination     -1.670508
		AscendingNode   151.419551
		ArgOfPericenter -46.562678
		MeanAnomaly     -46.523628
	}
}

Moon	"Ponadu"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.47690030e-8
	Radius          31.835
	InertiaMoment   0.3769715
	Oblateness      0.081370874
	RotationPeriod  6.57532
	Obliquity       254.2448
	EqAscendNode    120.007727

	AbsMagn         16.6
	SlopeParam      0.17
	Albedo          0.33
	Brightness      2.74
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.76432
		SemiMajorAxisKm 4.20751570e+6
		Eccentricity    0.2091904587
		Inclination     -0.305619
		AscendingNode   107.864527
		ArgOfPericenter -137.462291
		MeanAnomaly     -48.290317
	}
}

Moon	"Yikutiri"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.369117847255
	Radius          6229.617185
	RotationPeriod  39.01520904
	Obliquity       9.04312275
	EqAscendNode    -59.44406955

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.185
		Randomize      (0.418, -0.072, 0.937)
		colorDistMagn   0.0744
		colorDistFreq   44.78
		detailScale     4016.77
		drivenDarkening 0.531
		seaLevel        0.132
		snowLevel       2
		tropicLatitude  0.775
		humidity        0.142
		mainFreq        1.37
		mareFreq        0.017
		mareDensity     0.099
		terraceProb     0.243
		erosion         0
		riftsMagn       1.022
		riftsFreq       3.035
		canyonsMagn     0.753
		canyonsFreq     667.955
		craterMagn      0.566
		craterFreq      8.946
		craterDensity   0.773
		craterOctaves   14
		volcanoMagn     0.535
		volcanoFreq     0.725
		volcanoDensity  0.212
		volcanoOctaves  3
		volcanoActivity 0.138
		BumpHeight      14.46
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.14
		Hapke           0.5
		SpotBright      2.9
		SpotWidth       0.059
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      57.208346
		SemiMajorAxisKm 5.86466012e+6
		Eccentricity    0.0528858133
		Inclination     -1.21736084
		AscendingNode   152.27455468
		ArgOfPericenter -45.428593
		MeanAnomaly     -106.304858
	}
}

Moon	"Ianorota"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.166600823486
	Radius          5738.675982
	TidalLocked     true
	Obliquity       3.06038452
	EqAscendNode    95.15228916

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.617
		Randomize      (0.762, -0.417, 0.840)
		colorDistMagn   0.0494
		colorDistFreq   57.98
		detailScale     6596.54
		drivenDarkening 0.379
		seaLevel        0.339
		snowLevel       2
		tropicLatitude  0.24
		humidity        0.27
		mainFreq        2.125
		mareFreq        0.022
		mareDensity     0.149
		terraceProb     0.355
		erosion         0
		riftsMagn       0.825
		riftsFreq       4.715
		canyonsMagn     0.973
		canyonsFreq     752.231
		craterMagn      0.513
		craterFreq      8.398
		craterDensity   0.74
		craterOctaves   2
		volcanoMagn     0.389
		volcanoFreq     0.752
		volcanoDensity  0.152
		volcanoOctaves  2
		volcanoActivity 0.484
		BumpHeight      16.55
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.23
		Hapke           0.5
		SpotBright      2.83
		SpotWidth       0.056
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      86.8114
		SemiMajorAxisKm 7.74439972e+6
		Eccentricity    0.0327098238
		Inclination     -1.52182002
		AscendingNode   91.5495958
		ArgOfPericenter 48.939248
		MeanAnomaly     65.929065
	}
}

Moon	"Yokaya"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.031897754939
	Radius          3685.557951
	TidalLocked     true
	Obliquity       2.7991863
	EqAscendNode    -29.68540443

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.103
		Randomize      (-0.246, 0.058, 0.190)
		colorDistMagn   0.0561
		colorDistFreq   86.41
		detailScale     3054.59
		drivenDarkening 0.612
		seaLevel        0.224
		snowLevel       2
		tropicLatitude  0.435
		humidity        0.426
		mainFreq        1.935
		mareFreq        0.028
		mareDensity     0.179
		terraceProb     0.494
		erosion         0
		riftsMagn       0.504
		riftsFreq       2.394
		canyonsMagn     0.743
		canyonsFreq     839.352
		craterMagn      0.36
		craterFreq      1.838
		craterDensity   0.599
		craterOctaves   19
		volcanoMagn     0.284
		volcanoFreq     1.041
		volcanoDensity  0.114
		volcanoOctaves  2
		volcanoActivity 0.544
		BumpHeight      13.04
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.29
		Hapke           0.5
		SpotBright      2.25
		SpotWidth       0.054
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      98.282903
		SemiMajorAxisKm 8.41243856e+6
		Eccentricity    0.0457329639
		Inclination     1.02642984
		AscendingNode   -57.89134989
		ArgOfPericenter 55.411778
		MeanAnomaly     8.011189
	}
}

Moon	"Nochenole"
{
	ParentBody     "Noi"
	Class          "Terra"
	Mass            0.224963308196
	Radius          4611.040529
	TidalLocked     true
	Obliquity       17.16384473
	EqAscendNode    -174.37798454

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.389
		Randomize      (-0.487, -0.036, 0.221)
		colorDistMagn   0.0442
		colorDistFreq   514.6
		detailScale     58771.66
		drivenDarkening 0.24
		seaLevel        -0.178
		snowLevel       2
		tropicLatitude  0.999
		humidity        0.106
		mainFreq        2.427
		mareFreq        0.009
		mareDensity     0.093
		terraceProb     0.286
		erosion         0.3
		riftsMagn       0.045
		riftsFreq       1.98
		canyonsMagn     0.519
		canyonsFreq     692.075
		craterMagn      0.678
		craterFreq      2.052
		craterDensity   0.237
		craterOctaves   3
		volcanoMagn     0.428
		volcanoFreq     0.538
		volcanoDensity  0.15
		volcanoOctaves  4
		volcanoActivity 1.187
		BumpHeight      17.27
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.45
		Hapke           0.5
		SpotBright      2.03
		SpotWidth       0.048
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      133.879132
		SemiMajorAxisKm 1.03374125e+7
		Eccentricity    0.072959003
		Inclination     0.44891022
		AscendingNode   22.5280668
		ArgOfPericenter 111.207711
		MeanAnomaly     40.17828
	}
}

Moon	"Nora"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.374643134094
	Radius          6942.105877
	TidalLocked     true
	Obliquity       15.92258414
	EqAscendNode    23.16163994

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.373
		Randomize      (-0.403, -0.326, 0.105)
		colorDistMagn   0.0436
		colorDistFreq   76.58
		detailScale     4684.56
		drivenDarkening 0.676
		seaLevel        0.296
		snowLevel       2
		tropicLatitude  0.474
		humidity        0.126
		mainFreq        1.741
		mareFreq        0.001
		mareDensity     0.081
		terraceProb     0.253
		erosion         0
		riftsMagn       0.061
		riftsFreq       3.58
		canyonsMagn     1.164
		canyonsFreq     744.578
		craterMagn      0.6
		craterFreq      26.304
		craterDensity   0.608
		craterOctaves   14
		volcanoMagn     0.324
		volcanoFreq     1.047
		volcanoDensity  0.21
		volcanoOctaves  2
		volcanoActivity 0.263
		BumpHeight      14.91
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.27
		Hapke           0.5
		SpotBright      2.48
		SpotWidth       0.056
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      269.548889
		SemiMajorAxisKm 1.64826974e+7
		Eccentricity    0.0250909623
		Inclination     2.46054976
		AscendingNode   -24.1540722
		ArgOfPericenter -114.986779
		MeanAnomaly     27.446346
	}
}

Moon	"Chieilo"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.341945835855
	Radius          8000.744572
	TidalLocked     true
	Obliquity       6.5282029
	EqAscendNode    66.99716443

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.677
		Randomize      (-0.349, 0.120, -0.854)
		colorDistMagn   0.0676
		colorDistFreq   76.76
		detailScale     6557.14
		drivenDarkening 0.252
		seaLevel        0.229
		snowLevel       2
		tropicLatitude  0.538
		humidity        0.118
		mainFreq        1.931
		mareFreq        0.011
		mareDensity     0.162
		terraceProb     0.411
		erosion         0
		riftsMagn       0.881
		riftsFreq       2.004
		canyonsMagn     0.432
		canyonsFreq     112.806
		craterMagn      0.581
		craterFreq      18.986
		craterDensity   0.978
		craterOctaves   15
		volcanoMagn     0.208
		volcanoFreq     0.659
		volcanoDensity  0.148
		volcanoOctaves  2
		volcanoActivity 0.488
		BumpHeight      13.63
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.28
		Hapke           0.5
		SpotBright      2.45
		SpotWidth       0.06
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      438.617114
		SemiMajorAxisKm 2.28030866e+7
		Eccentricity    0.0083024628
		Inclination     -2.08676354
		AscendingNode   4.96004309
		ArgOfPericenter -50.473017
		MeanAnomaly     30.597098
	}
}

Moon	"Chevial"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.081269972587
	Radius          4390.97262
	RotationPeriod  12.7418673
	Obliquity       26.61505858
	EqAscendNode    -62.61287486

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.511
		Randomize      (-0.324, -0.532, -0.405)
		colorDistMagn   0.0391
		colorDistFreq   52.24
		detailScale     7675.72
		drivenDarkening 0.373
		seaLevel        0.114
		snowLevel       2
		tropicLatitude  0.587
		humidity        0.304
		mainFreq        1.746
		mareFreq        0.006
		mareDensity     0.158
		terraceProb     0.229
		erosion         0
		riftsMagn       0.693
		riftsFreq       2.997
		canyonsMagn     1.004
		canyonsFreq     117.024
		craterMagn      0.465
		craterFreq      0.988
		craterDensity   0.8
		craterOctaves   2
		volcanoMagn     0.469
		volcanoFreq     0.898
		volcanoDensity  0.187
		volcanoOctaves  4
		volcanoActivity 0.276
		BumpHeight      14.54
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.11
		Hapke           0.5
		SpotBright      2.62
		SpotWidth       0.04
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      527.58269
		SemiMajorAxisKm 2.57907287e+7
		Eccentricity    0.0309518542
		Inclination     0.61982554
		AscendingNode   166.44906037
		ArgOfPericenter 111.454623
		MeanAnomaly     -8.5416
	}
}

Moon	"Imai"
{
	ParentBody     "Noi"
	Class          "Terra"
	Mass            0.030090617022
	Radius          2134.867552
	TidalLocked     true
	Obliquity       5.98997026
	EqAscendNode    149.47414474

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.713
		Randomize      (-0.602, 0.440, -0.043)
		colorDistMagn   0.0401
		colorDistFreq   384.34
		detailScale     12729.75
		drivenDarkening 0.162
		seaLevel        0.047
		snowLevel       2
		tropicLatitude  0.412
		humidity        0.107
		mainFreq        4.406
		mareFreq        0.004
		mareDensity     0.176
		terraceProb     0.399
		erosion         0.02
		riftsMagn       3.47
		riftsFreq       3.054
		canyonsMagn     0.321
		canyonsFreq     590.339
		craterMagn      0.407
		craterFreq      3.855
		craterDensity   0.013
		craterOctaves   5
		volcanoMagn     0.159
		volcanoFreq     0.467
		volcanoDensity  0.269
		volcanoOctaves  2
		volcanoActivity 2.201
		BumpHeight      19.96
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.54
		Hapke           0.5
		SpotBright      2.07
		SpotWidth       0.055
		DayAmbient      0.07
	}

	Atmosphere
	{
		Model          "Earth"
		Height          422.828876
		Density         4.91426119e-10
		Pressure        1.60111209e-6
		Greenhouse      33.243426
		Opacity         0.852
	}

	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      541.441393
		SemiMajorAxisKm 2.62404266e+7
		Eccentricity    0.020116836
		Inclination     1.35263885
		AscendingNode   152.6094682
		ArgOfPericenter 63.61001
		MeanAnomaly     10.163901
	}
}
