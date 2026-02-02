Planet	"Boreas"
{
	ParentBody     "Hope"
	Class          "Neptune"
	Mass            8.4343729
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
		Period          2457.9102879
		SemiMajorAxis   319.93045375
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
		PeriodDays      5.56966583
		SemiMajorAxisKm 488544.189
		Eccentricity    0.0458015267
		Inclination     -353
		AscendingNode   20.9782623
		ArgOfPericenter -166.397051
		MeanAnomaly     7.02953012
	}
}

Moon	"Rosakuto"
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
		PeriodDays      2.057153
		SemiMajorAxisKm 139079.741
		Eccentricity    0.1669389502
		Inclination     -3.219862
		AscendingNode   -177.402922
		ArgOfPericenter 119.534351
		MeanAnomaly     113.965957
	}
}

Moon	"Kolina"
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
		PeriodDays      3.92771
		SemiMajorAxisKm 214048.614
		Eccentricity    0.4025161158
		Inclination     0.256203
		AscendingNode   -37.90583
		ArgOfPericenter -136.496127
		MeanAnomaly     -23.914868
	}
}

Moon	"Thaikim"
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
		PeriodDays      3.962233
		SemiMajorAxisKm 215301.049
		Eccentricity    0.0657056777
		Inclination     1.089192
		AscendingNode   -114.987519
		ArgOfPericenter -141.74263
		MeanAnomaly     167.027996
	}
}

Moon	"Rarayu"
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
		PeriodDays      4.036009
		SemiMajorAxisKm 217965.399
		Eccentricity    0.2594491406
		Inclination     2.940515
		AscendingNode   -15.073753
		ArgOfPericenter 27.539723
		MeanAnomaly     -144.829287
	}
}

Moon	"Nulia"
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
		PeriodDays      6.510534
		SemiMajorAxisKm 299799.244
		Eccentricity    0.2589346102
		Inclination     -2.705869
		AscendingNode   -89.136757
		ArgOfPericenter -46.883005
		MeanAnomaly     -66.918025
	}
}

Moon	"Atinus"
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
		PeriodDays      6.548234
		SemiMajorAxisKm 300955.48
		Eccentricity    0.0331861628
		Inclination     -3.220506
		AscendingNode   -14.300588
		ArgOfPericenter -155.12597
		MeanAnomaly     -164.125437
	}
}

Moon	"Nureru"
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
		PeriodDays      6.593204
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
		PeriodDays      27.85314
		SemiMajorAxisKm 790076.021
		Eccentricity    0.0452741329
		Inclination     -2.48680019
		AscendingNode   -41.50687253
		ArgOfPericenter -14.849811
		MeanAnomaly     149.576546
	}
}




