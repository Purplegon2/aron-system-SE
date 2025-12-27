Planet	"Polion"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            1.483
	Radius          7272.195
	InertiaMoment   0.332695425
	Oblateness      0.0119051058
	RotationPeriod  15.0881324
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
		Period          39.642374
		SemiMajorAxis   11.583
		Eccentricity    0.0860883375
		Inclination     0
		AscendingNode   161.116099
		ArgOfPericenter 140.435029
		MeanAnomaly     27.6325651
	}
}

