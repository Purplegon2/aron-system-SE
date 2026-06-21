Planet	"Boreas"
{
	ParentBody     "Hope"
	Class          "Neptune"
	Mass            8.0343729
	Radius          21293.3652
	InertiaMoment   0.238852918
	RotationPeriod  11.2857048
	RotationEpoch   0
	Obliquity       124.488212
	EqAscendNode    -150.083637

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.382
	BrightnessReal  1.15

	Surface
	{
		Preset         "neptune_temperate_default.cfg"
		SurfStyle       0.97
		Randomize      (0.306, 0.443, 0.213)
		detailScale     257
		tropicLatitude  0.84
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
		stripeZones     1.27
		stripeFluct     0.451
		stripeTwist     13.3
		cycloneMagn     9.08
		cycloneFreq     1.15
		cycloneDensity  0.53
		cycloneOctaves  0
		cycloneMagn2     0.374
		cycloneFreq2     0.682
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      17.3
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Gamma           0.1
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          400
		Velocity        -1.83e+03
		RotationOffset  -1.37
		BumpHeight      20.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.550 0.565 0.637)
		ModulateBright  1
		Opacity         0.748
		mainFreq        1.42
		mainOctaves     12
		Coverage        0.493
		stripeZones     1.27
		stripeFluct     0.451
		stripeTwist     13.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          982.576599
		Density         0.00538909854
		Pressure        5.40535736
		Greenhouse      0.8244286
		Bright          2.9
		Opacity         0.9
		SkyLight        0.611
		Hue             0.00382
		Saturation      0.687

		Composition
		{
			H2        	92.6
			He        	7.1
			CH4       	0.275
			N2        	0.0289
			NH3       	0.023
			O2        	0.00733
			C2H2      	0.00333
			C2H4      	0.00114
			Ne        	0.000904
			Ar        	0.000841
			C2H6      	0.00051
			C3H8      	0.000324
			C8H18     	0.000315
			H2O       	2.76e-06
			CO2       	1.45e-06
			H2S       	1.27e-06
			Kr        	3.67e-07
			Xe        	3.53e-08
			SO2       	8.68e-09
			CO        	3.26e-10
			Cl2       	2.6e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  681
	}

	Aurora
	{
		Height         248
		NorthLat       61.8
		NorthLon       157
		NorthRadius    4.68e+03
		NorthWidth     1.47e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 67
		NorthMoveSpeed 1.42
		NorthParticles 10000
		SouthLat       -65.6
		SouthLon       -7.58
		SouthRadius    4.52e+03
		SouthWidth     746
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 68.6
		SouthMoveSpeed 0.943
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
		Period          3521.97432127
		SemiMajorAxis   211.251025851
		Eccentricity    0.1758284087
		Inclination     3.61741774
		AscendingNode   -140.822219
		ArgOfPericenter 68.597272
		MeanAnomaly     250.490911
	}
}

Moon	"Setez"
{
	ParentBody     "Boreas"
	Class          "Terra"
	Mass            0.00382062187
	Radius          1203.70227
	InertiaMoment   0.397442311
	Obliquity       0.320028633
	EqAscendNode    20.9782623
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.84
	BrightnessReal  0.534

	Surface
	{
		Preset         "terra_airless_io2.cfg"
		SurfStyle       0.444
		Randomize      (0.995, -0.212, 0.245)
		colorDistMagn   0.0654
		colorDistFreq   122
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.258
		snowLevel       2
		tropicLatitude  0.428
		icecapLatitude  1
		icecapHeight    0
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
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        1.87
		venusFreq       1.76
		venusMagn       0
		mareFreq        0.524
		mareDensity     0.164
		terraceProb     0.15
		erosion         0
		montesMagn      0.0461
		montesFreq      70
		montesSpiky     0.862
		montesFraction  0.0802
		dunesMagn       0.0344
		dunesFreq       9.09
		dunesFraction   0.16
		hillsMagn       0.121
		hillsFreq       152
		hillsFraction   0.713
		hills2Fraction  0
		riversMagn      65.8
		riversFreq      3.23
		riversSin       7.36
		riftsMagn       63.2
		riftsFreq       2.69
		riftsSin        4.74
		canyonsMagn     0.47
		canyonsFreq     0.375
		canyonsFraction 0.319
		cracksMagn      0.0368
		cracksFreq      0.261
		cracksOctaves   0
		craterMagn      0.559
		craterFreq      3.2
		craterDensity   0.851
		craterOctaves   19
		craterRayedFactor 0.224
		volcanoMagn     0.217
		volcanoFreq     0.841
		volcanoDensity  0.373
		volcanoOctaves  3
		volcanoActivity 1
		volcanoFlows    0.377
		volcanoRadius   0.155
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
		PeriodDays      13.8730720399
		SemiMajorAxisKm 488544.189
		Eccentricity    0.0458015267
		Inclination     -353
		AscendingNode   20.9782623
		ArgOfPericenter -166.397051
		MeanAnomaly     7.02953012
	}
}

DwarfMoon	"Rosakuto"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            2.84965791e-8
	Radius          27.856
	InertiaMoment   0.37144486
	Oblateness      0.103141858
	RotationPeriod  17.76529
	Obliquity       123.51518
	EqAscendNode    12.23719

	AbsMagn         22.3
	SlopeParam      0.19
	Albedo          0.1
	Brightness      1.67
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.10773452392
		SemiMajorAxisKm 139079.741
		Eccentricity    0.1669389502
		Inclination     -3.219862
		AscendingNode   -177.402922
		ArgOfPericenter 119.534351
		MeanAnomaly     113.965957
	}
}

DwarfMoon	"Kolina"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.58120814e-10
	Radius          6.234
	InertiaMoment   0.373425962
	Oblateness      0.125762351
	RotationPeriod  9.62303
	Obliquity       59.237113
	EqAscendNode    150.929425

	AbsMagn         15.5
	SlopeParam      0.13
	Albedo          0.12
	Brightness      1.36
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.02428500223
		SemiMajorAxisKm 214048.614
		Eccentricity    0.4025161158
		Inclination     0.256203
		AscendingNode   -37.90583
		ArgOfPericenter -136.496127
		MeanAnomaly     -23.914868
	}
}

DwarfMoon	"Thaikim"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            4.52582545e-9
	Radius          14.818
	InertiaMoment   0.388066562
	Oblateness      0.032666018
	RotationPeriod  6.23024
	Obliquity       182.817739
	EqAscendNode    28.386661

	AbsMagn         18.3
	SlopeParam      0.07
	Albedo          0.26
	Brightness      1.47
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.05965678536
		SemiMajorAxisKm 215301.049
		Eccentricity    0.0657056777
		Inclination     1.089192
		AscendingNode   -114.987519
		ArgOfPericenter -141.74263
		MeanAnomaly     167.027996
	}
}

DwarfMoon	"Rarayu"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.27641323e-9
	Radius          11.838
	InertiaMoment   0.393755151
	Oblateness      0.080482223
	RotationPeriod  7.02586
	Obliquity       343.616379
	EqAscendNode    -29.83027

	AbsMagn         16.1
	SlopeParam      0.21
	Albedo          0.22
	Brightness      2.11
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.13524680958
		SemiMajorAxisKm 217965.399
		Eccentricity    0.2594491406
		Inclination     2.940515
		AscendingNode   -15.073753
		ArgOfPericenter 27.539723
		MeanAnomaly     -144.829287
	}
}

DwarfMoon	"Nulia"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.26507653e-8
	Radius          20.912
	InertiaMoment   0.393611535
	Oblateness      0.316304776
	RotationPeriod  13.89267
	Obliquity       171.270265
	EqAscendNode    74.895192

	AbsMagn         15.5
	SlopeParam      0.18
	Albedo          0.22
	Brightness      2.55
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      6.67061536932
		SemiMajorAxisKm 299799.244
		Eccentricity    0.2589346102
		Inclination     -2.705869
		AscendingNode   -89.136757
		ArgOfPericenter -46.883005
		MeanAnomaly     -66.918025
	}
}

DwarfMoon	"Atinus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.82568726e-8
	Radius          21.891
	InertiaMoment   0.377758549
	Oblateness      0.198090459
	RotationPeriod  15.08975
	Obliquity       74.709758
	EqAscendNode    -41.524568

	AbsMagn         15.1
	SlopeParam      0.12
	Albedo          0.25
	Brightness      1.76
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      6.70924240245
		SemiMajorAxisKm 300955.48
		Eccentricity    0.0331861628
		Inclination     -3.220506
		AscendingNode   -14.300588
		ArgOfPericenter -155.12597
		MeanAnomaly     -164.125437
	}
}

DwarfMoon	"Nureru"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.56172577e-8
	Radius          23.225
	InertiaMoment   0.395241387
	Oblateness      0.171329267
	RotationPeriod  7.61126
	Obliquity       274.599422
	EqAscendNode    49.522102

	AbsMagn         19.4
	SlopeParam      0.25
	Albedo          0.15
	Brightness      1.4
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      6.75531801403
		SemiMajorAxisKm 302331.779
		Eccentricity    0.3998820739
		Inclination     2.938299
		AscendingNode   -16.877982
		ArgOfPericenter 2.039439
		MeanAnomaly     -15.743939
	}
}

Moon	"Loia"
{
	ParentBody     "Boreas"
	Class          "Terra"
	Mass            0.00129613482
	Radius          755.730474
	TidalLocked     true
	Obliquity       26.34960165
	EqAscendNode    130.36463798

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.525
		Randomize      (-0.925, 0.393, -0.351)
		colorDistMagn   0.0354
		colorDistFreq   984.72
		detailScale     46953.05
		drivenDarkening 0.055
		seaLevel        -0.727
		snowLevel       2
		tropicLatitude  0.437
		humidity        0.525
		mainFreq        1.773
		mareFreq        0.003
		mareDensity     0.087
		terraceProb     0.34
		erosion         0.329
		riftsMagn       2.199
		riftsFreq       3.043
		canyonsMagn     0.397
		canyonsFreq     721.387
		craterMagn      0.326
		craterFreq      15.396
		craterDensity   0.18
		craterOctaves   1
		volcanoMagn     0.477
		volcanoFreq     0.71
		volcanoDensity  0.355
		volcanoOctaves  2
		volcanoActivity 2.52
		BumpHeight      13.78
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.48
		Hapke           0.5
		SpotBright      2.84
		SpotWidth       0.052
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      28.5356909929
		SemiMajorAxisKm 790076.021
		Eccentricity    0.0452741329
		Inclination     -2.48680019
		AscendingNode   -41.50687253
		ArgOfPericenter -14.849811
		MeanAnomaly     149.576546
	}
}

DwarfMoon	"Arnu"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.19502160e-9
	Radius          9.058
	InertiaMoment   0.404223746
	Oblateness      0.227237608
	RotationPeriod  5.17556
	Obliquity       15.470254
	EqAscendNode    153.59875

	AbsMagn         22.2
	SlopeParam      0.05
	Albedo          0.34
	Brightness      2.72
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.566735204199
		SemiMajorAxisKm 57939.32
		Eccentricity    0.2925595685
		Inclination     -0.77491
		AscendingNode   -175.805269
		ArgOfPericenter 90.049323
		MeanAnomaly     -80.906282
	}
}

DwarfMoon	"Rnatevia"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.32493588e-7
	Radius          38.962
	InertiaMoment   0.397040562
	Oblateness      0.112772163
	RotationPeriod  5.78809
	Obliquity       292.15184
	EqAscendNode    -128.301452

	AbsMagn         17.5
	SlopeParam      0.25
	Albedo          0.15
	Brightness      2.56
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.573231174859
		SemiMajorAxisKm 58381.216
		Eccentricity    0.3436514212
		Inclination     -0.252589
		AscendingNode   9.201457
		ArgOfPericenter -67.235096
		MeanAnomaly     29.581014
	}
}

DwarfMoon	"Kioasuri"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.16956502e-11
	Radius          3.596
	InertiaMoment   0.375465986
	Oblateness      0.040268645
	RotationPeriod  12.84987
	Obliquity       169.774623
	EqAscendNode    18.327242

	AbsMagn         16.1
	SlopeParam      0.24
	Albedo          0.28
	Brightness      1.34
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.578736245333
		SemiMajorAxisKm 58754.399
		Eccentricity    0.3779158728
		Inclination     -0.096863
		AscendingNode   -179.105816
		ArgOfPericenter 83.480976
		MeanAnomaly     -147.734051
	}
}

DwarfMoon	"Kenus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            7.89249311e-8
	Radius          35.028
	InertiaMoment   0.400531551
	Oblateness      0.348187463
	RotationPeriod  6.46167
	Obliquity       318.976485
	EqAscendNode    -146.838326

	AbsMagn         16
	SlopeParam      0.12
	Albedo          0.35
	Brightness      2.51
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.581476218314
		SemiMajorAxisKm 58939.698
		Eccentricity    0.0093907859
		Inclination     3.766567
		AscendingNode   175.868669
		ArgOfPericenter -36.219467
		MeanAnomaly     152.319303
	}
}

DwarfMoon	"Ataylia"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.71681839e-9
	Radius          16.429
	InertiaMoment   0.404351056
	Oblateness      0.152203451
	RotationPeriod  12.77694
	Obliquity       352.796175
	EqAscendNode    179.893618

	AbsMagn         18.2
	SlopeParam      0.16
	Albedo          0.26
	Brightness      1.25
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.583556178053
		SemiMajorAxisKm 59080.167
		Eccentricity    0.2082151761
		Inclination     -0.048204
		AscendingNode   -67.212295
		ArgOfPericenter 14.612839
		MeanAnomaly     91.357983
	}
}

DwarfMoon	"Ponalevikia"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.75471892e-8
	Radius          28.344
	InertiaMoment   0.407958405
	Oblateness      0.120011625
	RotationPeriod  4.97523
	Obliquity       78.289284
	EqAscendNode    70.341638

	AbsMagn         16.9
	SlopeParam      0.15
	Albedo          0.06
	Brightness      1.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.587982549897
		SemiMajorAxisKm 59378.546
		Eccentricity    0.2369420729
		Inclination     3.756156
		AscendingNode   -143.627547
		ArgOfPericenter -42.540572
		MeanAnomaly     -18.534033
	}
}

DwarfMoon	"Tenuli"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.49944847e-9
	Radius          12.42
	InertiaMoment   0.395568355
	Oblateness      0.045413541
	RotationPeriod  6.8096
	Obliquity       229.314365
	EqAscendNode    102.038953

	AbsMagn         17.4
	SlopeParam      0.07
	Albedo          0.33
	Brightness      1.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.590973929424
		SemiMajorAxisKm 59579.769
		Eccentricity    0.0823851954
		Inclination     -1.091126
		AscendingNode   -175.841602
		ArgOfPericenter 153.234203
		MeanAnomaly     -99.860096
	}
}

DwarfMoon	"Kernaylnaite"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            5.57345910e-9
	Radius          13.716
	InertiaMoment   0.377341545
	Oblateness      0.123044258
	RotationPeriod  7.50509
	Obliquity       241.70294
	EqAscendNode    166.390076

	AbsMagn         21.8
	SlopeParam      0.14
	Albedo          0.33
	Brightness      1.26
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.593617032603
		SemiMajorAxisKm 59757.282
		Eccentricity    0.0189635631
		Inclination     -2.775841
		AscendingNode   -35.657175
		ArgOfPericenter -175.40889
		MeanAnomaly     -150.416599
	}
}

DwarfMoon	"Rose"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.20814973e-10
	Radius          4.478
	InertiaMoment   0.390386752
	Oblateness      0.145264581
	RotationPeriod  6.85705
	Obliquity       257.096157
	EqAscendNode    -104.878279

	AbsMagn         17.9
	SlopeParam      0.06
	Albedo          0.32
	Brightness      2.4
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.596906338773
		SemiMajorAxisKm 59977.827
		Eccentricity    0.0179656726
		Inclination     -1.279247
		AscendingNode   -40.711668
		ArgOfPericenter -79.021135
		MeanAnomaly     166.484337
	}
}

DwarfMoon	"Nukonako"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            2.25492430e-8
	Radius          21.579
	InertiaMoment   0.397780292
	Oblateness      0.163248263
	RotationPeriod  4.32002
	Obliquity       104.496606
	EqAscendNode    -134.068731

	AbsMagn         19.8
	SlopeParam      0.2
	Albedo          0.3
	Brightness      2.3
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.60175935227
		SemiMajorAxisKm 60302.479
		Eccentricity    0.2827960236
		Inclination     2.913472
		AscendingNode   29.296165
		ArgOfPericenter -138.597623
		MeanAnomaly     -144.477239
	}
}

DwarfMoon	"Ianeim"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            3.15180050e-8
	Radius          25.705
	InertiaMoment   0.408629536
	Oblateness      0.105301704
	RotationPeriod  10.31051
	Obliquity       141.291821
	EqAscendNode    -80.52105

	AbsMagn         19.1
	SlopeParam      0.07
	Albedo          0.28
	Brightness      2.06
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.604743782622
		SemiMajorAxisKm 60501.695
		Eccentricity    0.1926172993
		Inclination     -3.435818
		AscendingNode   128.894159
		ArgOfPericenter 150.930798
		MeanAnomaly     107.64303
	}
}

DwarfMoon	"Chonuloyu"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            8.05799265e-9
	Radius          15.744
	InertiaMoment   0.406947256
	Oblateness      0.178229201
	RotationPeriod  15.43259
	Obliquity       333.210275
	EqAscendNode    -65.899093

	AbsMagn         19.7
	SlopeParam      0.23
	Albedo          0.23
	Brightness      2.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.84778469042
		SemiMajorAxisKm 75783.905
		Eccentricity    0.0050165239
		Inclination     3.721136
		AscendingNode   -5.995567
		ArgOfPericenter 12.359843
		MeanAnomaly     -22.250357
	}
}

DwarfMoon	"Chichu"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.72672746e-10
	Radius          6.616
	InertiaMoment   0.373889809
	Oblateness      0.030157551
	RotationPeriod  13.70412
	Obliquity       300.417924
	EqAscendNode    -138.415081

	AbsMagn         15.7
	SlopeParam      0.06
	Albedo          0.11
	Brightness      1.84
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.860740348265
		SemiMajorAxisKm 76554.027
		Eccentricity    0.4264930445
		Inclination     -3.068421
		AscendingNode   -139.62855
		ArgOfPericenter -16.843253
		MeanAnomaly     -33.647392
	}
}

DwarfMoon	"Molneim"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.42051618e-8
	Radius          20.159
	InertiaMoment   0.389317176
	Oblateness      0.280650103
	RotationPeriod  17.56755
	Obliquity       259.456046
	EqAscendNode    -20.611645

	AbsMagn         20.2
	SlopeParam      0.22
	Albedo          0.31
	Brightness      1.5
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.867277340006
		SemiMajorAxisKm 76941.137
		Eccentricity    0.0001741292
		Inclination     -1.111207
		AscendingNode   -15.163777
		ArgOfPericenter -94.383481
		MeanAnomaly     134.156689
	}
}

DwarfMoon	"Scalevima"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.56636021e-8
	Radius          19.581
	InertiaMoment   0.37463874
	Oblateness      0.241231372
	RotationPeriod  4.09656
	Obliquity       246.23694
	EqAscendNode    47.16468

	AbsMagn         14.6
	SlopeParam      0.22
	Albedo          0.18
	Brightness      1.64
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.87422139842
		SemiMajorAxisKm 77351.289
		Eccentricity    0.3061160749
		Inclination     -3.416249
		AscendingNode   -142.326991
		ArgOfPericenter -159.217976
		MeanAnomaly     127.938089
	}
}

DwarfMoon	"Ralimadus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            4.59300144e-8
	Radius          30.027
	InertiaMoment   0.397014201
	Oblateness      0.188203771
	RotationPeriod  9.90397
	Obliquity       14.102467
	EqAscendNode    -95.032515

	AbsMagn         19.6
	SlopeParam      0.14
	Albedo          0.24
	Brightness      2.19
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.878797453152
		SemiMajorAxisKm 77620.981
		Eccentricity    0.3219608983
		Inclination     0.44629
		AscendingNode   91.591989
		ArgOfPericenter 0.141034
		MeanAnomaly     58.682043
	}
}

DwarfMoon	"Aisuoa"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.80254700e-9
	Radius          13.733
	InertiaMoment   0.380608972
	Oblateness      0.088477889
	RotationPeriod  5.62827
	Obliquity       265.971238
	EqAscendNode    -27.847158

	AbsMagn         20.3
	SlopeParam      0.08
	Albedo          0.24
	Brightness      1.69
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.885680081009
		SemiMajorAxisKm 78025.732
		Eccentricity    0.4164570189
		Inclination     -3.437061
		AscendingNode   67.615654
		ArgOfPericenter 53.179631
		MeanAnomaly     56.591514
	}
}

DwarfMoon	"Thaneim"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            2.18974781e-11
	Radius          2.332
	InertiaMoment   0.400051423
	Oblateness      0.259000402
	RotationPeriod  2.97039
	Obliquity       110.77999
	EqAscendNode    -23.929558

	AbsMagn         21.5
	SlopeParam      0.21
	Albedo          0.27
	Brightness      2.87
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.886571305582
		SemiMajorAxisKm 78078.066
		Eccentricity    0.1240417895
		Inclination     -1.329737
		AscendingNode   165.920939
		ArgOfPericenter 179.462446
		MeanAnomaly     -70.804048
	}
}

DwarfMoon	"Aneim"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.61018648e-9
	Radius          15.107
	InertiaMoment   0.397267824
	Oblateness      0.300436501
	RotationPeriod  7.95119
	Obliquity       56.212452
	EqAscendNode    119.532308

	AbsMagn         16.4
	SlopeParam      0.13
	Albedo          0.32
	Brightness      2.71
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.890027274739
		SemiMajorAxisKm 78280.84
		Eccentricity    0.0201128202
		Inclination     1.874819
		AscendingNode   -152.406146
		ArgOfPericenter 128.209538
		MeanAnomaly     -157.275922
	}
}

DwarfMoon	"Sthe"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            6.53657807e-8
	Radius          31.071
	InertiaMoment   0.403466606
	Oblateness      0.060828828
	RotationPeriod  3.71001
	Obliquity       234.173929
	EqAscendNode    -149.947774

	AbsMagn         14.6
	SlopeParam      0.07
	Albedo          0.34
	Brightness      1.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.89635235898
		SemiMajorAxisKm 78651.277
		Eccentricity    0.2525071987
		Inclination     2.836307
		AscendingNode   2.302858
		ArgOfPericenter -141.04426
		MeanAnomaly     71.380706
	}
}

DwarfMoon	"Kera"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.44247299e-8
	Radius          22.497
	InertiaMoment   0.37877889
	Oblateness      0.263202577
	RotationPeriod  8.93545
	Obliquity       106.07981
	EqAscendNode    167.780095

	AbsMagn         18.2
	SlopeParam      0.17
	Albedo          0.33
	Brightness      1.9
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.901575611401
		SemiMajorAxisKm 78956.527
		Eccentricity    0.1633949299
		Inclination     -3.447427
		AscendingNode   17.491942
		ArgOfPericenter -30.180618
		MeanAnomaly     -155.567644
	}
}

DwarfMoon	"Itiiate"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.55667088e-8
	Radius          20.406
	InertiaMoment   0.403357235
	Oblateness      0.199412165
	RotationPeriod  5.98554
	Obliquity       325.679276
	EqAscendNode    -122.608889

	AbsMagn         20.2
	SlopeParam      0.18
	Albedo          0.28
	Brightness      2.31
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.903221543036
		SemiMajorAxisKm 79052.594
		Eccentricity    0.0309076018
		Inclination     -1.613476
		AscendingNode   51.131359
		ArgOfPericenter -162.987185
		MeanAnomaly     -66.984246
	}
}

DwarfMoon	"Chochile"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            3.53707698e-9
	Radius          12.675
	InertiaMoment   0.397025285
	Oblateness      0.347515077
	RotationPeriod  9.02866
	Obliquity       276.849474
	EqAscendNode    64.972874

	AbsMagn         21.4
	SlopeParam      0.2
	Albedo          0.35
	Brightness      2.3
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.08610379503
		SemiMajorAxisKm 89392.446
		Eccentricity    0.1611579188
		Inclination     -1.513163
		AscendingNode   -126.738015
		ArgOfPericenter 152.087938
		MeanAnomaly     176.092333
	}
}

DwarfMoon	"Yaiayi"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.62446585e-13
	Radius          0.867
	InertiaMoment   0.408214372
	Oblateness      0.328063686
	RotationPeriod  3.84657
	Obliquity       162.236687
	EqAscendNode    -27.388404

	AbsMagn         15.6
	SlopeParam      0.18
	Albedo          0.12
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.10071205405
		SemiMajorAxisKm 90192.221
		Eccentricity    0.4182651432
		Inclination     -1.408623
		AscendingNode   -57.544083
		ArgOfPericenter -59.789582
		MeanAnomaly     21.901101
	}
}

DwarfMoon	"Chaiaie"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.49437602e-8
	Radius          22.687
	InertiaMoment   0.404920129
	Oblateness      0.196997102
	RotationPeriod  17.13218
	Obliquity       196.807325
	EqAscendNode    -107.126871

	AbsMagn         21.1
	SlopeParam      0.08
	Albedo          0.17
	Brightness      2.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.10527327061
		SemiMajorAxisKm 90441.213
		Eccentricity    0.2432302242
		Inclination     0.469772
		AscendingNode   22.384079
		ArgOfPericenter -64.661016
		MeanAnomaly     83.647818
	}
}

DwarfMoon	"Snus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            9.90919141e-8
	Radius          39.152
	InertiaMoment   0.407489838
	Oblateness      0.111350945
	RotationPeriod  14.42335
	Obliquity       289.275134
	EqAscendNode    125.93422

	AbsMagn         14.9
	SlopeParam      0.22
	Albedo          0.18
	Brightness      2.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.11058118655
		SemiMajorAxisKm 90730.536
		Eccentricity    0.1477121706
		Inclination     -1.382141
		AscendingNode   96.86932
		ArgOfPericenter 25.902073
		MeanAnomaly     9.043707
	}
}

DwarfMoon	"Nernalnale"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.74861284e-8
	Radius          20.594
	InertiaMoment   0.402525002
	Oblateness      0.028219453
	RotationPeriod  2.80046
	Obliquity       82.364091
	EqAscendNode    3.251763

	AbsMagn         21.9
	SlopeParam      0.16
	Albedo          0.06
	Brightness      1.35
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.11788049171
		SemiMajorAxisKm 91127.653
		Eccentricity    0.1473706374
		Inclination     2.420422
		AscendingNode   -49.478837
		ArgOfPericenter 28.296135
		MeanAnomaly     -167.466015
	}
}

DwarfMoon	"Eirochi"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.72130426e-8
	Radius          28.736
	InertiaMoment   0.406563176
	Oblateness      0.124529011
	RotationPeriod  16.31467
	Obliquity       1.370607
	EqAscendNode    111.166815

	AbsMagn         14.6
	SlopeParam      0.11
	Albedo          0.27
	Brightness      2.63
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.12428133523
		SemiMajorAxisKm 91475.179
		Eccentricity    0.1351987881
		Inclination     0.106335
		AscendingNode   -47.453237
		ArgOfPericenter 101.010573
		MeanAnomaly     -171.940506
	}
}

DwarfMoon	"Schei"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.36756442e-9
	Radius          9.89
	InertiaMoment   0.386214845
	Oblateness      0.157229935
	RotationPeriod  14.81196
	Obliquity       316.728722
	EqAscendNode    141.408481

	AbsMagn         19.7
	SlopeParam      0.07
	Albedo          0.18
	Brightness      2.59
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.13167030871
		SemiMajorAxisKm 91875.535
		Eccentricity    0.0367466331
		Inclination     -3.418073
		AscendingNode   -109.882315
		ArgOfPericenter 64.993526
		MeanAnomaly     94.566579
	}
}

DwarfMoon	"Mnus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.65059175e-8
	Radius          36.719
	InertiaMoment   0.378587132
	Oblateness      0.089466983
	RotationPeriod  15.07943
	Obliquity       205.592208
	EqAscendNode    -41.495681

	AbsMagn         17.1
	SlopeParam      0.16
	Albedo          0.28
	Brightness      2.75
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.13640234059
		SemiMajorAxisKm 92131.473
		Eccentricity    0.1414565364
		Inclination     -3.380579
		AscendingNode   -83.902565
		ArgOfPericenter 81.913815
		MeanAnomaly     -0.825457
	}
}

DwarfMoon	"Monus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            9.68868302e-10
	Radius          8.142
	InertiaMoment   0.391034821
	Oblateness      0.270919216
	RotationPeriod  11.58171
	Obliquity       122.316087
	EqAscendNode    -34.091158

	AbsMagn         16.7
	SlopeParam      0.15
	Albedo          0.33
	Brightness      1.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.1404328954
		SemiMajorAxisKm 92349.19
		Eccentricity    0.2469741076
		Inclination     2.951129
		AscendingNode   -102.901491
		ArgOfPericenter 165.377925
		MeanAnomaly     -30.034473
	}
}

DwarfMoon	"Kitera"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.22727196e-11
	Radius          3.119
	InertiaMoment   0.395470892
	Oblateness      0.160179762
	RotationPeriod  11.3774
	Obliquity       90.984545
	EqAscendNode    -43.445472

	AbsMagn         18.4
	SlopeParam      0.09
	Albedo          0.07
	Brightness      1.98
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.14628300439
		SemiMajorAxisKm 92664.738
		Eccentricity    0.0278498302
		Inclination     3.043561
		AscendingNode   100.059739
		ArgOfPericenter -166.640248
		MeanAnomaly     -12.849026
	}
}

DwarfMoon	"Monevial"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.27733050e-9
	Radius          12.651
	InertiaMoment   0.403242568
	Oblateness      0.064501209
	RotationPeriod  15.14368
	Obliquity       342.242783
	EqAscendNode    37.84256

	AbsMagn         16.8
	SlopeParam      0.13
	Albedo          0.33
	Brightness      2.36
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.1510169929
		SemiMajorAxisKm 92919.691
		Eccentricity    0.158812469
		Inclination     2.45855
		AscendingNode   37.755223
		ArgOfPericenter 157.723959
		MeanAnomaly     -44.985283
	}
}

DwarfMoon	"Seku"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            9.96175637e-8
	Radius          37.794
	InertiaMoment   0.375302468
	Oblateness      0.117756513
	RotationPeriod  4.55423
	Obliquity       208.764617
	EqAscendNode    -173.075294

	AbsMagn         18.9
	SlopeParam      0.24
	Albedo          0.2
	Brightness      1.3
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.15400734116
		SemiMajorAxisKm 93080.559
		Eccentricity    0.4439225156
		Inclination     -0.972795
		AscendingNode   54.035356
		ArgOfPericenter -93.3506
		MeanAnomaly     -144.441792
	}
}

DwarfMoon	"Callia"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.90859056e-9
	Radius          9.937
	InertiaMoment   0.37793111
	Oblateness      0.145315768
	RotationPeriod  7.0653
	Obliquity       130.313477
	EqAscendNode    50.502866

	AbsMagn         22.2
	SlopeParam      0.07
	Albedo          0.23
	Brightness      1.23
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.15617908815
		SemiMajorAxisKm 93197.302
		Eccentricity    0.3034304848
		Inclination     -3.437998
		AscendingNode   33.781036
		ArgOfPericenter 83.441964
		MeanAnomaly     166.133716
	}
}

DwarfMoon	"Laoachi"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.30382780e-11
	Radius          3.517
	InertiaMoment   0.385886009
	Oblateness      0.173152272
	RotationPeriod  7.69377
	Obliquity       335.826069
	EqAscendNode    91.390689

	AbsMagn         17.4
	SlopeParam      0.16
	Albedo          0.23
	Brightness      1.43
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.15809194378
		SemiMajorAxisKm 93300.068
		Eccentricity    0.3088760454
		Inclination     -0.780278
		AscendingNode   -139.793198
		ArgOfPericenter -66.694262
		MeanAnomaly     -24.868127
	}
}

DwarfMoon	"Nalialnus"
{
	ParentBody     "Boreas"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.18885973e-8
	Radius          25.523
	InertiaMoment   0.388664183
	Oblateness      0.154371805
	RotationPeriod  13.85024
	Obliquity       303.224429
	EqAscendNode    159.479889

	AbsMagn         20.6
	SlopeParam      0.05
	Albedo          0.2
	Brightness      2.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.16089893229
		SemiMajorAxisKm 93450.768
		Eccentricity    0.4392949273
		Inclination     -0.77447
		AscendingNode   -99.77193
		ArgOfPericenter -158.863326
		MeanAnomaly     -69.590877
	}
}




