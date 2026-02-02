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
		PeriodDays      2.80966583
		SemiMajorAxisKm 318544.189
		Eccentricity    0.0458015267
		Inclination     -353
		AscendingNode   20.9782623
		ArgOfPericenter -166.397051
		MeanAnomaly     7.02953012
	}
}



