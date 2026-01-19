Planet	"Cosumbt"
{
	ParentBody     "Fate"
	Class          "Aquaria"
	Mass            0.132245317
	Radius          1164.01758
	InertiaMoment   0.329919845
	Oblateness      0.109923661
	RotationPeriod  6.09244187
	RotationOffset  57.709923
	Obliquity       2.74809157
	EqAscendNode    -121.396633

	AlbedoBond      0.603
	AlbedoGeom      0.36
	Brightness      2.44
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_wet_default_blue_seas.cfg"
		SurfStyle       0.337
		Randomize      (-0.104, -0.407, 0.323)
		colorDistMagn   0.0591
		colorDistFreq   582
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.0763
		snowLevel       0.85
		tropicLatitude  0.0781
		icecapLatitude  2
		icecapHeight    0.687
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.0361
		heightTempGrad  0.625
		beachWidth      0.000894
		tropicWidth     0.07
		mainFreq        1.95
		venusFreq       1.49
		venusMagn       0.514
		mareFreq        1.16
		mareDensity     0.201
		terraceProb     0.227
		erosion         0.126
		montesMagn      0.122
		montesFreq      231
		montesSpiky     0.914
		montesFraction  0.299
		dunesMagn       0.0694
		dunesFreq       39.5
		dunesFraction   0.971
		hillsMagn       0.115
		hillsFreq       505
		hillsFraction   0.313
		hills2Fraction  0.705
		riversMagn      67.5
		riversFreq      1.66
		riversSin       4.82
		riftsMagn       0
		riftsFreq       2.14
		riftsSin        5.57
		canyonsMagn     0.0623
		canyonsFreq     108
		canyonsFraction 0.832
		cracksMagn      0.0232
		cracksFreq      2.71
		cracksOctaves   3
		craterMagn      0.613
		craterFreq      12.1
		craterDensity   0.119
		craterOctaves   3
		craterRayedFactor 0
		volcanoMagn     0.606
		volcanoFreq     0.74
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.682
		volcanoRadius   0.474
		volcanoTemp     274
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.47
		stripeTwist     0.189
		cycloneMagn     1.51
		cycloneFreq     0.595
		cycloneDensity  0.357
		cycloneOctaves  4
		BumpHeight      20
		BumpOffset      0.101
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		RoughnessWater  0.321
		RoughnessIce    0.336
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      0
		SpotWidth       0.0164
		DayAmbient      0
		GlowBright      8.17
	}

	Ocean
	{
		Depth           1.53
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			C2H6      	99.1
			C3H8      	0.862
		}
	}

	Clouds
	{
		Height          14.5
		Velocity        88.1
		BumpHeight      2.29
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         1.25
		mainFreq        0.598
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.47
		stripeTwist     0.189
	}

	Clouds
	{
		Height          14.5
		Velocity        146
		BumpHeight      2.29
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.598
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.47
		stripeTwist     0.189
	}

	Clouds
	{
		Height          14.5
		Velocity        83.6
		BumpHeight      2.29
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.598
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.47
		stripeTwist     0.189
	}

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          67.6384201
		Density         1.09621489
		Pressure        0.323349476
		Greenhouse      4.04158497
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             -0.0154
		Saturation      0.876

		Composition
		{
			N2        	96.9
			CO        	2.18
			C2H4      	0.822
			C2H6      	0.0554
			Ar        	0.000966
			C2H2      	0.00016
			CO2       	0.000158
			Ne        	5.05e-05
			O2        	1.15e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  9.7
	}

	Aurora
	{
		Height         48.5
		NorthLat       51.6
		NorthLon       -150
		NorthRadius    1.12e+03
		NorthWidth     345
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 67.1
		NorthMoveSpeed 1.33
		NorthParticles 50000
		SouthLat       -44.8
		SouthLon       42.7
		SouthRadius    1.2e+03
		SouthWidth     267
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 72.8
		SouthMoveSpeed 1.23
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
		Epoch           2443911.41
		Period          0.125671454
		SemiMajorAxis   7.04727605e-05
		Eccentricity    0.00079569064
		Inclination     0.844555411
		AscendingNode   -121.396633
		ArgOfPericenter 223.597493
		MeanAnomaly     -5.69181081
	}
}

Moon	"Geostatu"
{
	ParentBody     "Cosumbt"
	Class          "Terra"
	Mass            0.00518452656
	Radius          583.40845
	InertiaMoment   0.386849195
	Oblateness      0.00241025281
	Obliquity       0.844555411
	EqAscendNode    -121.396633
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_vesta_natural.cfg"
		SurfStyle       0.86
		Randomize      (-0.459, 0.562, -0.481)
		colorDistMagn   0.0444
		colorDistFreq   157
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.139
		snowLevel       2
		tropicLatitude  0.0781
		icecapLatitude  0.901
		icecapHeight    0.012
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
		beachWidth      0.00133
		tropicWidth     0.07
		mainFreq        1.87
		venusFreq       0.683
		venusMagn       0
		mareFreq        0.583
		mareDensity     0.155
		terraceProb     0.371
		erosion         0
		montesMagn      0.0745
		montesFreq      76.3
		montesSpiky     0.84
		montesFraction  0.188
		dunesMagn       0.0458
		dunesFreq       9.95
		dunesFraction   0.851
		hillsMagn       0.116
		hillsFreq       156
		hillsFraction   0.861
		hills2Fraction  0
		riversMagn      61.1
		riversFreq      4.51
		riversSin       7.14
		riftsMagn       61.6
		riftsFreq       2.53
		riftsSin        4.56
		canyonsMagn     0.461
		canyonsFreq     0.52
		canyonsFraction 0.275
		cracksMagn      0.0632
		cracksFreq      0.459
		cracksOctaves   0
		craterMagn      0.586
		craterFreq      3.88
		craterDensity   0.759
		craterOctaves   19
		craterRayedFactor 0
		volcanoMagn     0.164
		volcanoFreq     0.818
		volcanoDensity  0.278
		volcanoOctaves  3
		volcanoActivity 1.1
		volcanoFlows    0.242
		volcanoRadius   0.156
		volcanoTemp     288
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
		PeriodDays      1.82492513
		SemiMajorAxis 	0.48383
		Eccentricity    0.00079569064
		Inclination     0.844555411
		AscendingNode   -121.396633
		ArgOfPericenter 43.5974933
		MeanAnomaly     -5.69181081
	}
}
