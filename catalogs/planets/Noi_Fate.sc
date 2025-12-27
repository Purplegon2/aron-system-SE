Planet	"Noi"
{
	ParentBody     "Fate"
	Class          "Neptune"
	Mass            817.71928596
	Radius          129911.9375
	InertiaMoment   0.234544456
	Oblateness      0.0227478612
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
		InnerRadius     2.36e+04
		OuterRadius     3.81e+04
		EdgeRadius      3.75e+04
		MeanRadius      2.82e+04
		Thickness       0.141
		RocksMaxSize    0.00564
		RocksSpacing    1
		DustDrawDist    423
		ChartRadius     3.75e+04
		RotationPeriod  4.73
		Brightness      1
		FrontBright     2.47
		BackBright      4.38
		Density         0.96
		Opacity         0.96
		SelfShadow      0.96
		PlanetShadow    0.96
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       716
		densityScale    2.26
		densityOffset   -1.86
		densityPower    4.88
		colorContrast   0.0648
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

Moon	"Natiata"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.52977764e-11
	Radius          2.992
	InertiaMoment   0.396967975
	Oblateness      0.123307634
	RotationPeriod  2.54445
	Obliquity       260.278668
	EqAscendNode    1.838126

	AbsMagn         18.8
	SlopeParam      0.11
	Albedo          0.23
	Brightness      1.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.647577
		SemiMajorAxisKm 1.74090654e+6
		Eccentricity    0.2887940998
		Inclination     -0.171164
		AscendingNode   -153.252793
		ArgOfPericenter -68.901859
		MeanAnomaly     137.260672
	}
}

Moon	"Molikiaikia"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            9.77060833e-8
	Radius          36.345
	InertiaMoment   0.385327124
	Oblateness      0.346347122
	RotationPeriod  9.18732
	Obliquity       100.28722
	EqAscendNode    32.257412

	AbsMagn         14.8
	SlopeParam      0.06
	Albedo          0.11
	Brightness      2.52
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.902872
		SemiMajorAxisKm 1.76625305e+6
		Eccentricity    0.208980231
		Inclination     -3.08421
		AscendingNode   9.301403
		ArgOfPericenter 161.986866
		MeanAnomaly     -125.363178
	}
}

Moon	"Konikoki"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.98663457e-8
	Radius          33.87
	InertiaMoment   0.376388337
	Oblateness      0.211650017
	RotationPeriod  11.40462
	Obliquity       314.966273
	EqAscendNode    -66.854845

	AbsMagn         14.6
	SlopeParam      0.23
	Albedo          0.3
	Brightness      2.88
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.919561
		SemiMajorAxisKm 1.76790365e+6
		Eccentricity    0.2263801664
		Inclination     0.187917
		AscendingNode   23.744505
		ArgOfPericenter -19.445
		MeanAnomaly     -29.660143
	}
}

Moon	"Kiaryl"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.66592394e-8
	Radius          30.219
	InertiaMoment   0.396789586
	Oblateness      0.035282965
	RotationPeriod  5.74137
	Obliquity       48.225558
	EqAscendNode    -19.69327

	AbsMagn         17.8
	SlopeParam      0.2
	Albedo          0.24
	Brightness      2.64
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      12.002593
		SemiMajorAxisKm 1.77610429e+6
		Eccentricity    0.338370155
		Inclination     2.607632
		AscendingNode   -116.50424
		ArgOfPericenter 11.128287
		MeanAnomaly     -28.119377
	}
}

Moon	"Nuneim"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.38549240e-9
	Radius          8.766
	InertiaMoment   0.372151485
	Oblateness      0.142856497
	RotationPeriod  10.58031
	Obliquity       298.73072
	EqAscendNode    -166.077922

	AbsMagn         16.2
	SlopeParam      0.13
	Albedo          0.18
	Brightness      2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      50.358818
		SemiMajorAxisKm 4.62028494e+6
		Eccentricity    0.3176647646
		Inclination     1.200704
		AscendingNode   -159.398817
		ArgOfPericenter -117.562774
		MeanAnomaly     -101.968516
	}
}

Moon	"Iatara"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.50546799e-8
	Radius          20.882
	InertiaMoment   0.386526184
	Oblateness      0.179731181
	RotationPeriod  11.67251
	Obliquity       3.660678
	EqAscendNode    -118.440944

	AbsMagn         17.4
	SlopeParam      0.14
	Albedo          0.23
	Brightness      1.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      50.667372
		SemiMajorAxisKm 4.63913837e+6
		Eccentricity    0.3584515126
		Inclination     0.535383
		AscendingNode   25.324157
		ArgOfPericenter -6.522719
		MeanAnomaly     136.817154
	}
}

Moon	"Riti"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            6.11402193e-11
	Radius          3.106
	InertiaMoment   0.39328295
	Oblateness      0.128331301
	RotationPeriod  13.94987
	Obliquity       96.057397
	EqAscendNode    46.212554

	AbsMagn         18.4
	SlopeParam      0.06
	Albedo          0.3
	Brightness      2.67
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      50.727712
		SemiMajorAxisKm 4.64282086e+6
		Eccentricity    0.3055495727
		Inclination     -0.723424
		AscendingNode   155.532654
		ArgOfPericenter -57.691668
		MeanAnomaly     152.794986
	}
}

Moon	"Iayle"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.05882237e-9
	Radius          8.305
	InertiaMoment   0.383999672
	Oblateness      0.2047118
	RotationPeriod  3.93013
	Obliquity       53.790926
	EqAscendNode    -152.871335

	AbsMagn         14.8
	SlopeParam      0.22
	Albedo          0.15
	Brightness      2.92
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      50.947293
		SemiMajorAxisKm 4.65620917e+6
		Eccentricity    0.1580017608
		Inclination     -3.706083
		AscendingNode   -143.757137
		ArgOfPericenter 49.419272
		MeanAnomaly     -119.350455
	}
}

Moon	"Titetuke"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.12221038e-8
	Radius          24.064
	InertiaMoment   0.370866698
	Oblateness      0.022996046
	RotationPeriod  3.62468
	Obliquity       322.36573
	EqAscendNode    -70.958812

	AbsMagn         21.3
	SlopeParam      0.17
	Albedo          0.2
	Brightness      2.32
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      51.05576
		SemiMajorAxisKm 4.66281557e+6
		Eccentricity    0.2905413651
		Inclination     1.041457
		AscendingNode   -130.220408
		ArgOfPericenter -155.235128
		MeanAnomaly     160.55268
	}
}

Moon	"Raketi"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            9.17499890e-8
	Radius          35.684
	InertiaMoment   0.388269648
	Oblateness      0.237559935
	RotationPeriod  17.78382
	Obliquity       88.572463
	EqAscendNode    86.79375

	AbsMagn         18.9
	SlopeParam      0.14
	Albedo          0.15
	Brightness      2.66
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      51.586494
		SemiMajorAxisKm 4.69507372e+6
		Eccentricity    0.1001990674
		Inclination     0.43701
		AscendingNode   -38.357057
		ArgOfPericenter -176.253967
		MeanAnomaly     -153.33149
	}
}

Moon	"Uiyeresi"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.01291377e-8
	Radius          26.877
	InertiaMoment   0.377631047
	Oblateness      0.164813388
	RotationPeriod  3.1308
	Obliquity       163.211664
	EqAscendNode    137.583999

	AbsMagn         17.3
	SlopeParam      0.08
	Albedo          0.25
	Brightness      1.56
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      51.833487
		SemiMajorAxisKm 4.71004827e+6
		Eccentricity    0.403201688
		Inclination     1.65246
		AscendingNode   86.343317
		ArgOfPericenter -78.033566
		MeanAnomaly     150.095403
	}
}

Moon	"Yeiani"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.73156768e-8
	Radius          23.904
	InertiaMoment   0.387154758
	Oblateness      0.27608069
	RotationPeriod  4.80331
	Obliquity       326.703129
	EqAscendNode    -166.814381

	AbsMagn         17.2
	SlopeParam      0.08
	Albedo          0.12
	Brightness      1.51
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.047429
		SemiMajorAxisKm 4.72299981e+6
		Eccentricity    0.0863810937
		Inclination     -3.705882
		AscendingNode   15.704445
		ArgOfPericenter 61.798656
		MeanAnomaly     -134.802581
	}
}

Moon	"Kiaite"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.02389285e-9
	Radius          8.763
	InertiaMoment   0.409361915
	Oblateness      0.043395099
	RotationPeriod  16.31855
	Obliquity       51.213961
	EqAscendNode    -95.574677

	AbsMagn         15.6
	SlopeParam      0.13
	Albedo          0.16
	Brightness      1.86
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.1347
		SemiMajorAxisKm 4.72827791e+6
		Eccentricity    0.0049109499
		Inclination     -2.174539
		AscendingNode   105.94006
		ArgOfPericenter 80.604044
		MeanAnomaly     -60.917948
	}
}

Moon	"Teia"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.66609148e-8
	Radius          26.362
	InertiaMoment   0.378891347
	Oblateness      0.209716691
	RotationPeriod  16.93597
	Obliquity       168.999595
	EqAscendNode    136.71589

	AbsMagn         21.4
	SlopeParam      0.24
	Albedo          0.34
	Brightness      2.62
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.164078
		SemiMajorAxisKm 4.73005402e+6
		Eccentricity    0.3552366418
		Inclination     -3.464427
		AscendingNode   115.826976
		ArgOfPericenter -126.023985
		MeanAnomaly     -6.180959
	}
}

Moon	"Naraca"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            2.90302371e-9
	Radius          11.17
	InertiaMoment   0.408458441
	Oblateness      0.292794801
	RotationPeriod  4.03667
	Obliquity       325.688344
	EqAscendNode    -118.350786

	AbsMagn         15.2
	SlopeParam      0.25
	Albedo          0.26
	Brightness      1.23
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.198302
		SemiMajorAxisKm 4.73212265e+6
		Eccentricity    0.195821003
		Inclination     2.800432
		AscendingNode   -164.664258
		ArgOfPericenter -78.430453
		MeanAnomaly     -44.579435
	}
}

Moon	"Scalethatiaital"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            8.50385163e-9
	Radius          16.135
	InertiaMoment   0.403034617
	Oblateness      0.025799783
	RotationPeriod  9.26521
	Obliquity       38.18992
	EqAscendNode    9.204921

	AbsMagn         15.1
	SlopeParam      0.17
	Albedo          0.23
	Brightness      2.19
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.798757
		SemiMajorAxisKm 4.76834356e+6
		Eccentricity    0.2352295028
		Inclination     3.478453
		AscendingNode   -84.723149
		ArgOfPericenter 96.411257
		MeanAnomaly     93.202633
	}
}

Moon	"Lalelecha"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.19745664e-10
	Radius          5.804
	InertiaMoment   0.387278463
	Oblateness      0.12812498
	RotationPeriod  15.91522
	Obliquity       52.996854
	EqAscendNode    -152.289976

	AbsMagn         22.5
	SlopeParam      0.15
	Albedo          0.21
	Brightness      2.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      68.159265
		SemiMajorAxisKm 5.65329534e+6
		Eccentricity    0.0903687029
		Inclination     -1.646022
		AscendingNode   16.848099
		ArgOfPericenter 171.238849
		MeanAnomaly     40.6362
	}
}

Moon	"Maryl"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.71254273e-11
	Radius          2.77
	InertiaMoment   0.396408791
	Oblateness      0.131662305
	RotationPeriod  16.51261
	Obliquity       181.100245
	EqAscendNode    153.095887

	AbsMagn         20.8
	SlopeParam      0.1
	Albedo          0.22
	Brightness      1.26
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      68.524053
		SemiMajorAxisKm 5.67344833e+6
		Eccentricity    0.2011271047
		Inclination     -0.827683
		AscendingNode   -79.089864
		ArgOfPericenter 151.60171
		MeanAnomaly     -18.29109
	}
}

Moon	"Luseyoei"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            8.67269278e-9
	Radius          16.321
	InertiaMoment   0.390081129
	Oblateness      0.247924225
	RotationPeriod  12.1211
	Obliquity       334.256479
	EqAscendNode    134.922823

	AbsMagn         21.2
	SlopeParam      0.1
	Albedo          0.07
	Brightness      2.04
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      68.561921
		SemiMajorAxisKm 5.67553832e+6
		Eccentricity    0.154590325
		Inclination     -2.826457
		AscendingNode   -95.759204
		ArgOfPericenter -67.220408
		MeanAnomaly     -29.034636
	}
}

Moon	"Nulia"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.89061526e-9
	Radius          15.079
	InertiaMoment   0.408251429
	Oblateness      0.119538215
	RotationPeriod  2.23188
	Obliquity       171.984951
	EqAscendNode    -144.094904

	AbsMagn         19.1
	SlopeParam      0.11
	Albedo          0.16
	Brightness      1.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      69.010561
		SemiMajorAxisKm 5.70027025e+6
		Eccentricity    0.3379651343
		Inclination     1.705419
		AscendingNode   55.262373
		ArgOfPericenter 138.768054
		MeanAnomaly     128.33651
	}
}

Moon	"Tayu"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.21088114e-10
	Radius          6.589
	InertiaMoment   0.388095256
	Oblateness      0.088793578
	RotationPeriod  11.16989
	Obliquity       314.723311
	EqAscendNode    125.985002

	AbsMagn         21.7
	SlopeParam      0.22
	Albedo          0.15
	Brightness      1.61
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      69.153758
		SemiMajorAxisKm 5.70815290e+6
		Eccentricity    0.3184627093
		Inclination     0.652798
		AscendingNode   -5.454861
		ArgOfPericenter 121.248858
		MeanAnomaly     60.757897
	}
}

Moon	"Cathachal"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.36888368e-8
	Radius          37.208
	InertiaMoment   0.37428265
	Oblateness      0.06098119
	RotationPeriod  6.00662
	Obliquity       158.03498
	EqAscendNode    -55.153945

	AbsMagn         18.1
	SlopeParam      0.05
	Albedo          0.09
	Brightness      2.05
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      69.233454
		SemiMajorAxisKm 5.71253761e+6
		Eccentricity    0.1265694252
		Inclination     -2.327357
		AscendingNode   121.274019
		ArgOfPericenter 175.571174
		MeanAnomaly     127.463159
	}
}

Moon	"Molna"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.27171867e-8
	Radius          31.767
	InertiaMoment   0.374992292
	Oblateness      0.260449495
	RotationPeriod  7.10454
	Obliquity       159.888501
	EqAscendNode    -78.969263

	AbsMagn         19.1
	SlopeParam      0.06
	Albedo          0.11
	Brightness      1.24
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      69.797445
		SemiMajorAxisKm 5.74351942e+6
		Eccentricity    0.3981925319
		Inclination     -3.123976
		AscendingNode   87.560578
		ArgOfPericenter -78.160383
		MeanAnomaly     15.740309
	}
}

Moon	"Ianeim"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            2.85619701e-8
	Radius          28.236
	InertiaMoment   0.38908526
	Oblateness      0.2192672
	RotationPeriod  15.34535
	Obliquity       112.169615
	EqAscendNode    90.678769

	AbsMagn         17.3
	SlopeParam      0.18
	Albedo          0.32
	Brightness      2.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      70.194795
		SemiMajorAxisKm 5.76529695e+6
		Eccentricity    0.1003009468
		Inclination     2.486136
		AscendingNode   -172.883232
		ArgOfPericenter -80.535673
		MeanAnomaly     121.324086
	}
}

Moon	"Arali"
{
	ParentBody     "Noi"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.01815775e-8
	Radius          23.954
	InertiaMoment   0.376176601
	Oblateness      0.222511859
	RotationPeriod  7.20551
	Obliquity       87.270248
	EqAscendNode    -112.132451

	AbsMagn         19.8
	SlopeParam      0.12
	Albedo          0.3
	Brightness      2.19
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      70.236687
		SemiMajorAxisKm 5.76759056e+6
		Eccentricity    0.0564436084
		Inclination     1.185333
		AscendingNode   132.227297
		ArgOfPericenter -10.927431
		MeanAnomaly     66.28195
	}
}

Moon	"Tiseyu"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            1.430300035709
	Radius          10952.931984
	TidalLocked     true
	Obliquity       -3.01222909
	EqAscendNode    40.95043059

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.135
		Randomize      (-0.067, -0.187, -0.158)
		colorDistMagn   0.0363
		colorDistFreq   43.73
		detailScale     3112.22
		drivenDarkening 0.669
		seaLevel        0.229
		snowLevel       2
		tropicLatitude  0.4
		humidity        0.305
		mainFreq        1.536
		mareFreq        0.024
		mareDensity     0.097
		terraceProb     0.335
		erosion         0
		riftsMagn       0.403
		riftsFreq       2.499
		canyonsMagn     0.206
		canyonsFreq     247.033
		craterMagn      0.698
		craterFreq      8.656
		craterDensity   0.595
		craterOctaves   18
		volcanoMagn     0.848
		volcanoFreq     1.023
		volcanoDensity  0.298
		volcanoOctaves  2
		volcanoActivity 0.012
		BumpHeight      16.09
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.34
		SpotWidth       0.043
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      123.185649
		SemiMajorAxisKm 8.38800124e+6
		Eccentricity    0.0066115682
		Inclination     -2.4939093
		AscendingNode   107.47371649
		ArgOfPericenter 56.545139
		MeanAnomaly     -77.946034
	}
}

Moon	"Tiia"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.584326785285
	Radius          7351.679353
	TidalLocked     true
	Obliquity       -4.99952773
	EqAscendNode    -20.73814038

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.105
		Randomize      (0.778, -0.488, 0.702)
		colorDistMagn   0.0841
		colorDistFreq   77.86
		detailScale     6868.98
		drivenDarkening 0.684
		seaLevel        0.155
		snowLevel       2
		tropicLatitude  0.298
		humidity        0.298
		mainFreq        1.916
		mareFreq        0.028
		mareDensity     0.112
		terraceProb     0.443
		erosion         0
		riftsMagn       0.34
		riftsFreq       2.88
		canyonsMagn     0.479
		canyonsFreq     562.212
		craterMagn      0.617
		craterFreq      7.595
		craterDensity   0.952
		craterOctaves   2
		volcanoMagn     0.797
		volcanoFreq     0.851
		volcanoDensity  0.141
		volcanoOctaves  4
		volcanoActivity 0.083
		BumpHeight      14.56
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.14
		Hapke           0.5
		SpotBright      2.64
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
		PeriodDays      150.909118
		SemiMajorAxisKm 9.60348205e+6
		Eccentricity    0.0586981743
		Inclination     2.13595681
		AscendingNode   -73.43162578
		ArgOfPericenter 80.334009
		MeanAnomaly     159.537334
	}
}

Moon	"Sueiri"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.034587490652
	Radius          2830.198691
	TidalLocked     true
	Obliquity       26.87769511
	EqAscendNode    150.85801187

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.466
		Randomize      (-0.592, 0.515, 0.359)
		colorDistMagn   0.0619
		colorDistFreq   75.97
		detailScale     5854.99
		drivenDarkening 0.841
		seaLevel        0.228
		snowLevel       2
		tropicLatitude  0.362
		humidity        0.346
		mainFreq        1.889
		mareFreq        0.016
		mareDensity     0.125
		terraceProb     0.374
		erosion         0
		riftsMagn       0.609
		riftsFreq       4.424
		canyonsMagn     0.822
		canyonsFreq     0.984
		craterMagn      0.289
		craterFreq      18.603
		craterDensity   0.839
		craterOctaves   19
		volcanoMagn     0.14
		volcanoFreq     0.962
		volcanoDensity  0.085
		volcanoOctaves  4
		volcanoActivity 0.302
		BumpHeight      19.71
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.27
		Hapke           0.5
		SpotBright      2.54
		SpotWidth       0.033
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      180.60553
		SemiMajorAxisKm 1.08252792e+7
		Eccentricity    0.033362374
		Inclination     -1.83200561
		AscendingNode   64.24420713
		ArgOfPericenter 66.49872
		MeanAnomaly     -90.415283
	}
}

Moon	"Thetitarnathali"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.292447032612
	Radius          7018.739514
	TidalLocked     true
	Obliquity       19.33135975
	EqAscendNode    -92.39339462

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.674
		Randomize      (-0.476, 0.801, 0.684)
		colorDistMagn   0.0534
		colorDistFreq   119.78
		detailScale     6881.56
		drivenDarkening 0.249
		seaLevel        0.287
		snowLevel       2
		tropicLatitude  0.933
		humidity        0.421
		mainFreq        1.448
		mareFreq        0.007
		mareDensity     0.169
		terraceProb     0.469
		erosion         0
		riftsMagn       0.317
		riftsFreq       3.74
		canyonsMagn     0.224
		canyonsFreq     432.847
		craterMagn      0.635
		craterFreq      9.816
		craterDensity   0.56
		craterOctaves   16
		volcanoMagn     0.378
		volcanoFreq     0.49
		volcanoDensity  0.171
		volcanoOctaves  3
		volcanoActivity 0.044
		BumpHeight      16.29
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.26
		Hapke           0.5
		SpotBright      2.33
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
		PeriodDays      207.07521
		SemiMajorAxisKm 1.18587018e+7
		Eccentricity    0.068924067
		Inclination     -2.49767483
		AscendingNode   -48.20813547
		ArgOfPericenter 15.706065
		MeanAnomaly     87.460946
	}
}

Moon	"Chotanu"
{
	ParentBody     "Noi"
	Class          "Terra"
	Mass            1.133937373259
	Radius          7214.508525
	TidalLocked     true
	Obliquity       21.73105884
	EqAscendNode    153.16859747

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.717
		Randomize      (-0.129, -0.275, 0.253)
		colorDistMagn   0.0874
		colorDistFreq   332.33
		detailScale     17081.45
		drivenDarkening 0.298
		seaLevel        0.165
		snowLevel       2
		tropicLatitude  0.515
		humidity        0.117
		mainFreq        3.825
		mareFreq        0.008
		mareDensity     0.096
		terraceProb     0.339
		erosion         0.013
		riftsMagn       1.1
		riftsFreq       3.427
		canyonsMagn     0.495
		canyonsFreq     120.745
		craterMagn      0.711
		craterFreq      29.053
		craterDensity   0.041
		craterOctaves   4
		volcanoMagn     0.521
		volcanoFreq     0.469
		volcanoDensity  0.123
		volcanoOctaves  3
		volcanoActivity 0.002
		BumpHeight      14.18
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.59
		Hapke           0.5
		SpotBright      2.94
		SpotWidth       0.057
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      250.189988
		SemiMajorAxisKm 1.34523562e+7
		Eccentricity    0.0012998371
		Inclination     2.05217149
		AscendingNode   -45.38352253
		ArgOfPericenter 166.946539
		MeanAnomaly     144.486274
	}
}

Moon	"Kenasesi"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            0.20589627154
	Radius          6040.321276
	TidalLocked     true
	Obliquity       24.3128842
	EqAscendNode    32.52408455

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.698
		Randomize      (0.833, 0.695, -0.037)
		colorDistMagn   0.0397
		colorDistFreq   89.83
		detailScale     5917.75
		drivenDarkening 0.166
		seaLevel        0.246
		snowLevel       2
		tropicLatitude  0.987
		humidity        0.315
		mainFreq        1.973
		mareFreq        0.025
		mareDensity     0.152
		terraceProb     0.384
		erosion         0
		riftsMagn       0.729
		riftsFreq       3.511
		canyonsMagn     0.607
		canyonsFreq     536.481
		craterMagn      0.418
		craterFreq      4.11
		craterDensity   0.99
		craterOctaves   12
		volcanoMagn     0.5
		volcanoFreq     0.987
		volcanoDensity  0.182
		volcanoOctaves  4
		volcanoActivity 0.52
		BumpHeight      21.87
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.24
		Hapke           0.5
		SpotBright      2.31
		SpotWidth       0.038
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      334.110574
		SemiMajorAxisKm 1.63134277e+7
		Eccentricity    0.0436542172
		Inclination     1.23554675
		AscendingNode   -18.94954794
		ArgOfPericenter 116.705802
		MeanAnomaly     158.99315
	}
}

Moon	"Royari"
{
	ParentBody     "Noi"
	Class          "Terra"
	Mass            0.004573504026
	Radius          1105.246727
	TidalLocked     true
	Obliquity       25.37225459
	EqAscendNode    178.79974751

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.628
		Randomize      (0.171, -0.168, 0.047)
		colorDistMagn   0.0614
		colorDistFreq   225.94
		detailScale     43648.61
		drivenDarkening 0.118
		seaLevel        -0.957
		snowLevel       2
		tropicLatitude  0.624
		humidity        0.406
		mainFreq        4.236
		mareFreq        0.006
		mareDensity     0.118
		terraceProb     0.215
		erosion         0.273
		riftsMagn       1.518
		riftsFreq       2.166
		canyonsMagn     0.11
		canyonsFreq     23.435
		craterMagn      0.546
		craterFreq      11.407
		craterDensity   0.172
		craterOctaves   1
		volcanoMagn     0.612
		volcanoFreq     1.081
		volcanoDensity  0.188
		volcanoOctaves  4
		volcanoActivity 0.386
		BumpHeight      21.42
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.54
		Hapke           0.5
		SpotBright      2.07
		SpotWidth       0.032
		DayAmbient      0.07
		ModulateColor  (0.701 0.631 0.388)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          314.148429
		Density         1.05936939e-9
		Pressure        1.05997386e-6
		Greenhouse      156.792718
		Opacity         0.944
	}

	NoClouds        true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      414.506447
		SemiMajorAxisKm 1.88353026e+7
		Eccentricity    0.0552669582
		Inclination     0.938106
		AscendingNode   28.60166785
		ArgOfPericenter -99.069677
		MeanAnomaly     75.06452
	}
}

Moon	"Aikurire"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            1.470786042666
	Radius          10125.542501
	TidalLocked     true
	Obliquity       -22.33841607
	EqAscendNode    -141.35996031

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.388
		Randomize      (-0.746, 0.969, 0.050)
		colorDistMagn   0.0603
		colorDistFreq   93.16
		detailScale     7935.79
		drivenDarkening 0.405
		seaLevel        0.289
		snowLevel       2
		tropicLatitude  0.726
		humidity        0.279
		mainFreq        1.467
		mareFreq        0.003
		mareDensity     0.142
		terraceProb     0.249
		erosion         0
		riftsMagn       0.775
		riftsFreq       4.452
		canyonsMagn     0.718
		canyonsFreq     287.588
		craterMagn      0.283
		craterFreq      10.285
		craterDensity   0.939
		craterOctaves   13
		volcanoMagn     0.661
		volcanoFreq     0.915
		volcanoDensity  0.266
		volcanoOctaves  3
		volcanoActivity 0.092
		BumpHeight      13.35
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.1
		Hapke           0.5
		SpotBright      2.81
		SpotWidth       0.033
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      485.123322
		SemiMajorAxisKm 2.09179848e+7
		Eccentricity    0.0773620399
		Inclination     -0.19078648
		AscendingNode   34.44794264
		ArgOfPericenter 88.282895
		MeanAnomaly     63.507349
	}
}

Moon	"Ainooaro"
{
	ParentBody     "Noi"
	Class          "Aquaria"
	Mass            1.049116375278
	Radius          10002.766509
	TidalLocked     true
	Obliquity       -8.6598702
	EqAscendNode    144.0311576

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.293
		Randomize      (0.923, 0.668, 0.195)
		colorDistMagn   0.0652
		colorDistFreq   56.11
		detailScale     6213.11
		drivenDarkening 0.693
		seaLevel        0.346
		snowLevel       2
		tropicLatitude  0.465
		humidity        0.388
		mainFreq        1.549
		mareFreq        0.014
		mareDensity     0.098
		terraceProb     0.393
		erosion         0
		riftsMagn       1.119
		riftsFreq       2.199
		canyonsMagn     0.821
		canyonsFreq     658.384
		craterMagn      0.28
		craterFreq      3.781
		craterDensity   0.518
		craterOctaves   15
		volcanoMagn     0.813
		volcanoFreq     1.043
		volcanoDensity  0.269
		volcanoOctaves  3
		volcanoActivity 0.243
		BumpHeight      19.12
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.3
		Hapke           0.5
		SpotBright      2.17
		SpotWidth       0.044
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      541.441393
		SemiMajorAxisKm 2.25070916e+7
		Eccentricity    0.0669719284
		Inclination     1.37585175
		AscendingNode   152.94985327
		ArgOfPericenter -43.749718
		MeanAnomaly     -41.170478
	}
}
