Planet	"Giras"
{
	ParentBody     "Hope"
	Class          "Jupiter"
	Mass            14.5
	Radius          25362.7
	InertiaMoment   0.190386653
	Oblateness      0.0312461052
	RotationPeriod  8.54682398
	RotationEpoch   0
	Obliquity       39.2554946
	EqAscendNode    28.5351968

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_frigid_uranus.cfg"
		SurfStyle       0.967
		Randomize      (0.378, -0.665, 0.642)
		detailScale     256
		tropicLatitude  0.578
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
		cycloneMagn     2.48
		cycloneFreq     0.746
		cycloneDensity  0.509
		cycloneOctaves  2
		BumpHeight      14.7
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
		Height          34.6
		Velocity        -1.89e+03
		BumpHeight      9.96
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.085
		mainOctaves     10
		Coverage        0.249
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
	}

	Clouds
	{
		Height          54.5
		Velocity        1.1e+03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.085
		mainOctaves     10
		Coverage        0.249
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          213.827682
		Density         0.01074793
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.016
		Saturation      1.12

		Composition
		{
			H2        	93.2
			He        	6.45
			CH4       	0.257
			N2        	0.0354
			NH3       	0.0267
			O2        	0.00766
			C2H2      	0.00309
			C2H4      	0.00139
			Ne        	0.00106
			Ar        	0.000759
			C2H6      	0.000542
			C3H8      	0.00034
			C8H18     	0.000287
			H2O       	3.1e-06
			CO2       	1.54e-06
			H2S       	1.48e-06
			Kr        	3.69e-07
			Xe        	3.52e-08
			SO2       	8.53e-09
			Cl2       	3.26e-10
			CO        	3.04e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  311
	}

	Aurora
	{
		Height         299
		NorthLat       86.8
		NorthLon       88.5
		NorthRadius    5.5e+03
		NorthWidth     2.71e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 69.7
		NorthMoveSpeed 1.45
		NorthParticles 10000
		SouthLat       -85.6
		SouthLon       -87.2
		SouthRadius    5.64e+03
		SouthWidth     2.46e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 71.9
		SouthMoveSpeed 1.06
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
		Period          102.108469
		SemiMajorAxis   19.07
		Eccentricity    0.0781956299
		Inclination     0
		AscendingNode   25.3283104
		ArgOfPericenter 208.415638
		MeanAnomaly     204.329718
	}
}

Moon	"Mairelia"
{
	ParentBody     "Giras"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          564.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	

	NoOcean         true

	NoClouds        true

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
		Period		236.634
		SemiMajorAxis	0.0041
		Eccentricity    0.20243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

Moon	"Matha"
{
	ParentBody     "Giras"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          564.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	

	NoOcean         true

	NoClouds        true

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
		Period		236.634
		SemiMajorAxis	0.0071
		Eccentricity    0.00243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

Moon	"Choli"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            4.71651229e-8
	Radius          29.965
	InertiaMoment   0.379876188
	Oblateness      0.101677845
	RotationPeriod  12.39491
	Obliquity       292.563287
	EqAscendNode    -144.234645

	AbsMagn         15.4
	SlopeParam      0.1
	Albedo          0.21
	Brightness      1.47
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.281998
		SemiMajorAxisKm 53431.981
		Eccentricity    0.2605152208
		Inclination     2.749831
		AscendingNode   -22.105632
		ArgOfPericenter 60.83763
		MeanAnomaly     -173.581527
	}
}

Moon	"Sasu"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.13749435e-8
	Radius          28.396
	InertiaMoment   0.389719401
	Oblateness      0.130562473
	RotationPeriod  15.61255
	Obliquity       299.214104
	EqAscendNode    -137.141095

	AbsMagn         20.4
	SlopeParam      0.24
	Albedo          0.08
	Brightness      2.16
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.285075
		SemiMajorAxisKm 53819.961
		Eccentricity    0.0559486937
		Inclination     1.572219
		AscendingNode   -119.101596
		ArgOfPericenter -134.281898
		MeanAnomaly     -19.139511
	}
}

Moon	"Chule"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.91671346e-10
	Radius          7.979
	InertiaMoment   0.394992806
	Oblateness      0.105622
	RotationPeriod  15.36058
	Obliquity       158.254417
	EqAscendNode    54.398407

	AbsMagn         21.1
	SlopeParam      0.11
	Albedo          0.06
	Brightness      2.02
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.286738
		SemiMajorAxisKm 54028.992
		Eccentricity    0.2697271369
		Inclination     1.657015
		AscendingNode   -15.589304
		ArgOfPericenter -56.656825
		MeanAnomaly     -29.599849
	}
}

Moon	"Looaseta"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.10885509e-9
	Radius          16.673
	InertiaMoment   0.377088582
	Oblateness      0.190924114
	RotationPeriod  6.47725
	Obliquity       277.398803
	EqAscendNode    132.513116

	AbsMagn         18.7
	SlopeParam      0.19
	Albedo          0.2
	Brightness      2.4
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.287989
		SemiMajorAxisKm 54186.1
		Eccentricity    0.1365472296
		Inclination     3.801211
		AscendingNode   66.977722
		ArgOfPericenter 17.35574
		MeanAnomaly     109.454473
	}
}

Moon	"Tethe"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.21152909e-9
	Radius          12.386
	InertiaMoment   0.378483886
	Oblateness      0.260778466
	RotationPeriod  11.6447
	Obliquity       99.441707
	EqAscendNode    115.860454

	AbsMagn         19.1
	SlopeParam      0.14
	Albedo          0.33
	Brightness      1.76
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.291591
		SemiMajorAxisKm 54636.888
		Eccentricity    0.2172256886
		Inclination     0.877226
		AscendingNode   -72.622938
		ArgOfPericenter 63.714824
		MeanAnomaly     171.455423
	}
}

Moon	"Yinu"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.31597833e-8
	Radius          27.009
	InertiaMoment   0.403494646
	Oblateness      0.223626733
	RotationPeriod  4.12838
	Obliquity       197.253412
	EqAscendNode    64.659358

	AbsMagn         15.4
	SlopeParam      0.13
	Albedo          0.05
	Brightness      1.59
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.049471
		SemiMajorAxisKm 261288.222
		Eccentricity    0.2190268008
		Inclination     -3.233775
		AscendingNode   -114.503422
		ArgOfPericenter -163.951925
		MeanAnomaly     170.739274
	}
}

Moon	"Yuyeya"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.08107405e-9
	Radius          13.782
	InertiaMoment   0.376979629
	Oblateness      0.230904606
	RotationPeriod  9.35479
	Obliquity       73.474768
	EqAscendNode    58.057486

	AbsMagn         15.8
	SlopeParam      0.23
	Albedo          0.12
	Brightness      1.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.073292
		SemiMajorAxisKm 262647.159
		Eccentricity    0.1126500526
		Inclination     2.309334
		AscendingNode   -91.315133
		ArgOfPericenter -104.454524
		MeanAnomaly     105.464881
	}
}

Moon	"Yanasi"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.36586791e-11
	Radius          1.982
	InertiaMoment   0.383965345
	Oblateness      0.207968538
	RotationPeriod  2.19267
	Obliquity       126.943832
	EqAscendNode    -106.630131

	AbsMagn         22.1
	SlopeParam      0.07
	Albedo          0.14
	Brightness      2.96
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.107324
		SemiMajorAxisKm 264582.545
		Eccentricity    0.3119944728
		Inclination     -3.058752
		AscendingNode   152.395592
		ArgOfPericenter -51.937004
		MeanAnomaly     41.213969
	}
}

Moon	"Malikia"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.07760779e-8
	Radius          21.513
	InertiaMoment   0.371622512
	Oblateness      0.283346756
	RotationPeriod  17.06552
	Obliquity       105.061581
	EqAscendNode    107.546421

	AbsMagn         19.2
	SlopeParam      0.14
	Albedo          0.14
	Brightness      1.98
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.127058
		SemiMajorAxisKm 265701.537
		Eccentricity    0.4126892649
		Inclination     2.052621
		AscendingNode   -145.797122
		ArgOfPericenter -99.365913
		MeanAnomaly     -158.834195
	}
}

Moon	"Kiaryl"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.82656165e-8
	Radius          34.469
	InertiaMoment   0.394271325
	Oblateness      0.183085478
	RotationPeriod  5.26984
	Obliquity       337.619731
	EqAscendNode    -100.299629

	AbsMagn         18.1
	SlopeParam      0.09
	Albedo          0.08
	Brightness      2.65
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.13686
		SemiMajorAxisKm 266256.506
		Eccentricity    0.326315614
		Inclination     -2.14988
		AscendingNode   141.59882
		ArgOfPericenter -8.26656
		MeanAnomaly     -123.258207
	}
}

Moon	"Kiathe"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            8.30617705e-8
	Radius          36.118
	InertiaMoment   0.388418241
	Oblateness      0.14902882
	RotationPeriod  4.8766
	Obliquity       124.201682
	EqAscendNode    -128.334386

	AbsMagn         21.9
	SlopeParam      0.15
	Albedo          0.17
	Brightness      1.42
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.139774
		SemiMajorAxisKm 266421.38
		Eccentricity    0.210136584
		Inclination     -2.111721
		AscendingNode   -178.291981
		ArgOfPericenter -47.451561
		MeanAnomaly     -104.322807
	}
}

Moon	"Chethe"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.62788989e-8
	Radius          20.589
	InertiaMoment   0.37210103
	Oblateness      0.163261851
	RotationPeriod  7.31067
	Obliquity       142.541047
	EqAscendNode    113.944579

	AbsMagn         22.2
	SlopeParam      0.15
	Albedo          0.33
	Brightness      2.59
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.143445
		SemiMajorAxisKm 266629.017
		Eccentricity    0.412056136
		Inclination     -3.880802
		AscendingNode   -100.506826
		ArgOfPericenter -119.900043
		MeanAnomaly     164.063107
	}
}

Moon	"Keiaiti"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.47049145e-8
	Radius          29.003
	InertiaMoment   0.382747551
	Oblateness      0.332521464
	RotationPeriod  16.16853
	Obliquity       69.897315
	EqAscendNode    -0.097301

	AbsMagn         19.1
	SlopeParam      0.11
	Albedo          0.1
	Brightness      1.65
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.167263
		SemiMajorAxisKm 267974.138
		Eccentricity    0.2380150822
		Inclination     2.744324
		AscendingNode   -117.237817
		ArgOfPericenter -120.916071
		MeanAnomaly     29.313328
	}
}

Moon	"Sike"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.24427489e-9
	Radius          14.64
	InertiaMoment   0.391830996
	Oblateness      0.202636556
	RotationPeriod  7.49017
	Obliquity       214.394811
	EqAscendNode    -29.494702

	AbsMagn         18.8
	SlopeParam      0.23
	Albedo          0.26
	Brightness      2.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.17214
		SemiMajorAxisKm 268249.134
		Eccentricity    0.1049531879
		Inclination     -1.075312
		AscendingNode   122.561898
		ArgOfPericenter -12.903731
		MeanAnomaly     162.579548
	}
}

Moon	"Teri"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.72163803e-8
	Radius          33.618
	InertiaMoment   0.392254577
	Oblateness      0.136179168
	RotationPeriod  11.38865
	Obliquity       228.42568
	EqAscendNode    51.15536

	AbsMagn         17.4
	SlopeParam      0.21
	Albedo          0.31
	Brightness      1.96
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.187111
		SemiMajorAxisKm 269092.475
		Eccentricity    0.1150215401
		Inclination     0.124147
		AscendingNode   -39.951558
		ArgOfPericenter -43.557852
		MeanAnomaly     -57.097834
	}
}

Moon	"Soiayute"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.37804506e-12
	Radius          1.361
	InertiaMoment   0.402835969
	Oblateness      0.262893086
	RotationPeriod  13.54389
	Obliquity       20.076601
	EqAscendNode    53.946489

	AbsMagn         18.6
	SlopeParam      0.18
	Albedo          0.14
	Brightness      1.33
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.192894
		SemiMajorAxisKm 269417.927
		Eccentricity    0.0848551563
		Inclination     3.537965
		AscendingNode   -6.057606
		ArgOfPericenter 62.014226
		MeanAnomaly     -17.83901
	}
}

Moon	"Cailia"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.65653493e-8
	Radius          21.544
	InertiaMoment   0.394261479
	Oblateness      0.333786663
	RotationPeriod  5.81786
	Obliquity       37.77783
	EqAscendNode    97.711675

	AbsMagn         16.4
	SlopeParam      0.15
	Albedo          0.12
	Brightness      2.05
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.259099
		SemiMajorAxisKm 326474.003
		Eccentricity    0.0032914163
		Inclination     2.916724
		AscendingNode   -98.365466
		ArgOfPericenter 24.466265
		MeanAnomaly     -105.640009
	}
}

Moon	"Chusanare"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.74436930e-12
	Radius          0.967
	InertiaMoment   0.380463492
	Oblateness      0.095073901
	RotationPeriod  6.54879
	Obliquity       293.447587
	EqAscendNode    -94.778114

	AbsMagn         21.4
	SlopeParam      0.2
	Albedo          0.26
	Brightness      2.45
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.269774
		SemiMajorAxisKm 327019.313
		Eccentricity    0.3099187192
		Inclination     -2.439336
		AscendingNode   110.825215
		ArgOfPericenter 48.45505
		MeanAnomaly     145.665972
	}
}

Moon	"Chorutetu"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            8.43378234e-8
	Radius          34.988
	InertiaMoment   0.388501194
	Oblateness      0.06866403
	RotationPeriod  5.2738
	Obliquity       90.208258
	EqAscendNode    -79.229378

	AbsMagn         20.5
	SlopeParam      0.17
	Albedo          0.3
	Brightness      1.74
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.278762
		SemiMajorAxisKm 327478.064
		Eccentricity    0.3012659255
		Inclination     -2.89518
		AscendingNode   -78.042749
		ArgOfPericenter -134.897287
		MeanAnomaly     -167.808832
	}
}

Moon	"Yaresu"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.27670758e-13
	Radius          0.814
	InertiaMoment   0.39077675
	Oblateness      0.154641167
	RotationPeriod  17.14465
	Obliquity       6.372198
	EqAscendNode    -148.763301

	AbsMagn         20.6
	SlopeParam      0.13
	Albedo          0.21
	Brightness      2.25
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.281353
		SemiMajorAxisKm 327610.236
		Eccentricity    0.3755152346
		Inclination     -2.144425
		AscendingNode   -167.760882
		ArgOfPericenter 18.279124
		MeanAnomaly     10.599507
	}
}

Moon	"Chino"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            3.88312532e-9
	Radius          12.568
	InertiaMoment   0.378407322
	Oblateness      0.192820388
	RotationPeriod  8.55436
	Obliquity       94.637678
	EqAscendNode    -37.571055

	AbsMagn         17
	SlopeParam      0.24
	Albedo          0.23
	Brightness      1.71
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.287802
		SemiMajorAxisKm 327939.133
		Eccentricity    0.2755081699
		Inclination     0.193327
		AscendingNode   -46.991575
		ArgOfPericenter -45.162411
		MeanAnomaly     -1.95936
	}
}

Moon	"Ietosoia"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.10298870e-7
	Radius          38.001
	InertiaMoment   0.382411202
	Oblateness      0.100088669
	RotationPeriod  11.36777
	Obliquity       317.424356
	EqAscendNode    138.473337

	AbsMagn         21.3
	SlopeParam      0.17
	Albedo          0.09
	Brightness      2.48
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.306089
		SemiMajorAxisKm 328870.909
		Eccentricity    0.2211898727
		Inclination     -0.164346
		AscendingNode   0.759717
		ArgOfPericenter -78.628139
		MeanAnomaly     77.881573
	}
}

Moon	"Aitokeie"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.01079735e-7
	Radius          37.929
	InertiaMoment   0.404064136
	Oblateness      0.174024943
	RotationPeriod  7.44331
	Obliquity       210.369446
	EqAscendNode    -69.337018

	AbsMagn         18.6
	SlopeParam      0.05
	Albedo          0.23
	Brightness      1.55
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.329755
		SemiMajorAxisKm 330074.777
		Eccentricity    0.2351209119
		Inclination     1.672259
		AscendingNode   46.228745
		ArgOfPericenter -105.163128
		MeanAnomaly     13.063351
	}
}

Moon	"Chaei"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.31704240e-8
	Radius          23.764
	InertiaMoment   0.381051259
	Oblateness      0.202107877
	RotationPeriod  8.66664
	Obliquity       303.446704
	EqAscendNode    141.657068

	AbsMagn         17.4
	SlopeParam      0.2
	Albedo          0.21
	Brightness      1.8
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.368977
		SemiMajorAxisKm 332065.143
		Eccentricity    0.4317644243
		Inclination     2.671699
		AscendingNode   -166.014625
		ArgOfPericenter 118.195387
		MeanAnomaly     -156.722607
	}
}

Moon	"Ponal"
{
	ParentBody     "Giras"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.88227675e-8
	Radius          35.773
	InertiaMoment   0.378670473
	Oblateness      0.288137744
	RotationPeriod  6.68688
	Obliquity       299.943538
	EqAscendNode    -9.5452

	AbsMagn         16.8
	SlopeParam      0.16
	Albedo          0.12
	Brightness      2.31
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.373491
		SemiMajorAxisKm 332293.856
		Eccentricity    0.3086658081
		Inclination     -2.984912
		AscendingNode   -42.714116
		ArgOfPericenter 39.614719
		MeanAnomaly     -142.302397
	}
}

Moon	"Eichana"
{
	ParentBody     "Giras"
	Class          "Terra"
	Mass            0.023629022035
	Radius          1049.158651
	TidalLocked     true
	Obliquity       -3.60558264
	EqAscendNode    104.31830806

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.101
		Randomize      (0.077, -0.753, 0.306)
		colorDistMagn   0.062
		colorDistFreq   1137.4
		detailScale     32529.34
		drivenDarkening 0.068
		seaLevel        -0.067
		snowLevel       2
		tropicLatitude  0.913
		humidity        0.346
		mainFreq        2.508
		mareFreq        0.001
		mareDensity     0.087
		terraceProb     0.329
		erosion         0.106
		riftsMagn       1.083
		riftsFreq       2.497
		canyonsMagn     1.12
		canyonsFreq     680.441
		craterMagn      0.456
		craterFreq      18.619
		craterDensity   0.186
		craterOctaves   1
		volcanoMagn     0.277
		volcanoFreq     0.427
		volcanoDensity  0.263
		volcanoOctaves  4
		volcanoActivity 1.577
		BumpHeight      18.25
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.44
		Hapke           0.5
		SpotBright      2.95
		SpotWidth       0.032
		DayAmbient      0.07
		ModulateColor  (0.779 0.474 0.375)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          176.957568
		Density         5.23895658e-10
		Pressure        1.72772047e-6
		Greenhouse      103.593527
		Opacity         0.936
	}

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.751935
		SemiMajorAxisKm 845539.541
		Eccentricity    0.0374724166
		Inclination     2.09588425
		AscendingNode   143.35444816
		ArgOfPericenter 170.917565
		MeanAnomaly     -106.240101
	}
}

Moon	"Yolalutu"
{
	ParentBody     "Giras"
	Class          "Terra"
	Mass            0.009360708995
	Radius          1433.821993
	RotationPeriod  32.60237182
	Obliquity       10.40448822
	EqAscendNode    11.63332564

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.639
		Randomize      (0.836, 0.519, 0.857)
		colorDistMagn   0.0386
		colorDistFreq   569.13
		detailScale     38949.99
		drivenDarkening 0.198
		seaLevel        -0.957
		snowLevel       2
		tropicLatitude  0.319
		humidity        0.161
		mainFreq        3.899
		mareFreq        0.005
		mareDensity     0.117
		terraceProb     0.219
		erosion         0.282
		riftsMagn       0.484
		riftsFreq       1.837
		canyonsMagn     0.177
		canyonsFreq     198.228
		craterMagn      0.368
		craterFreq      2.268
		craterDensity   0.228
		craterOctaves   2
		volcanoMagn     0.438
		volcanoFreq     1.076
		volcanoDensity  0.249
		volcanoOctaves  3
		volcanoActivity 1.524
		BumpHeight      19.48
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.37
		Hapke           0.5
		SpotBright      2.33
		SpotWidth       0.056
		DayAmbient      0.07
		ModulateColor  (0.754 0.647 0.555)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          133.704377
		Density         1.72725438e-9
		Pressure        1.80553904e-6
		Greenhouse      81.398783
		Opacity         0.956
	}

	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      27.171811
		SemiMajorAxisKm 1.12300713e+6
		Eccentricity    0.0616698993
		Inclination     -1.34271891
		AscendingNode   -91.54041359
		ArgOfPericenter 161.672312
		MeanAnomaly     4.248012
	}
}

Moon	"Rnadusc"
{
	ParentBody     "Giras"
	Class          "Aquaria"
	Mass            0.011671825309
	Radius          2247.480791
	TidalLocked     true
	Obliquity       14.39228091
	EqAscendNode    147.96283378

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.147
		Randomize      (-0.989, -0.793, 0.535)
		colorDistMagn   0.089
		colorDistFreq   59.64
		detailScale     5977.73
		drivenDarkening 0.589
		seaLevel        0.058
		snowLevel       2
		tropicLatitude  0.718
		humidity        0.164
		mainFreq        1.933
		mareFreq        0.005
		mareDensity     0.103
		terraceProb     0.15
		erosion         0
		riftsMagn       0.616
		riftsFreq       4.888
		canyonsMagn     0.777
		canyonsFreq     41.727
		craterMagn      0.509
		craterFreq      24.226
		craterDensity   0.755
		craterOctaves   17
		volcanoMagn     0.146
		volcanoFreq     0.479
		volcanoDensity  0.185
		volcanoOctaves  4
		volcanoActivity 0.206
		BumpHeight      16.99
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.17
		Hapke           0.5
		SpotBright      2.55
		SpotWidth       0.039
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      38.478999
		SemiMajorAxisKm 1.41618275e+6
		Eccentricity    0.0651294249
		Inclination     -0.90306703
		AscendingNode   38.45070809
		ArgOfPericenter -79.588278
		MeanAnomaly     72.564411
	}
}
