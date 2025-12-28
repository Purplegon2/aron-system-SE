Planet	"Aron"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.829705656
	Radius          6128.58105
	InertiaMoment   0.329813719
	Oblateness      0.00129414746
	RotationPeriod  39.7227859
	RotationEpoch   0
	Obliquity       -2.23490961
	EqAscendNode    -124.319756

	AlbedoBond      0.21
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.258
		Randomize      (0.482, 0.799, 0.584)
		colorDistMagn   0.0784
		colorDistFreq   656
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.466
		snowLevel       0.85
		tropicLatitude  0.0501
		icecapLatitude  0.837
		icecapHeight    0.0738
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin 0.313
		climateSteppeMax 0.563
		climateForestMin 0.5
		climateForestMax 0.688
		climateGrassMin  0.625
		climateGrassMax  0.813
		humidity        0.705
		heightTempGrad  0.625
		beachWidth      0.0006
		tropicWidth     0.07
		mainFreq        0.785
		venusFreq       1.18
		venusMagn       0.938
		mareFreq        5.15
		mareDensity     0
		terraceProb     0.306
		erosion         0.126
		montesMagn      0.242
		montesFreq      246
		montesSpiky     0.957
		montesFraction  0.878
		dunesMagn       0.0496
		dunesFreq       41.5
		dunesFraction   0.455
		hillsMagn       0.124
		hillsFreq       642
		hillsFraction   0.126
		hills2Fraction  0.492
		riversMagn      62.5
		riversFreq      2.36
		riversSin       4.94
		riftsMagn       0
		riftsFreq       2.5
		riftsSin        4.42
		canyonsMagn     0.0634
		canyonsFreq     157
		canyonsFraction 0.443
		cracksMagn      0.0981
		cracksFreq      0.54
		cracksOctaves   0
		craterMagn      0.671
		craterFreq      17.8
		craterDensity   0.0358
		craterOctaves   1
		volcanoMagn     0.717
		volcanoFreq     0.575
		volcanoDensity  0.387
		volcanoOctaves  3
		volcanoActivity 1.05
		volcanoFlows    0.337
		volcanoRadius   0.432
		volcanoTemp     300
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.28
		stripeTwist     0.183
		cycloneMagn     1.85
		cycloneFreq     0.407
		cycloneDensity  0.266
		cycloneOctaves  3
		BumpHeight      20
		BumpOffset      3.51
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.13
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           9.31
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	100
		}
	}

	Clouds
	{
		Height          11.1
		Velocity        87.5
		BumpHeight      2.89
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.793
		mainOctaves     10
		Coverage        0.117
		stripeZones     2.28
		stripeTwist     0.183
	}

	Clouds
	{
		Height          11.1
		Velocity        51.2
		BumpHeight      2.89
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.793
		mainOctaves     10
		Coverage        0.117
		stripeZones     2.28
		stripeTwist     0.183
	}

	Clouds
	{
		Height          11.1
		Velocity        98.1
		BumpHeight      2.89
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.793
		mainOctaves     10
		Coverage        0.117
		stripeZones     2.28
		stripeTwist     0.183
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          70.6595078
		Density         1.29289997
		Pressure        1
		Greenhouse      41
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             -0.114
		Saturation      0.819

		Composition
		{
			N2        	77.8
			O2        	20.9
			Ar        	0.93
			H2O       	0.4
			CO2       	0.042
			Ne        	0.00182
			He        	0.00046
			CH4       	0.00019
			Kr        	0.000114
			H2        	5e-05
			Xe        	8.7e-06
		}
	}

	Climate
	{
		GlobalWindSpeed  10.8
	}

	Aurora
	{
		Height         77.2
		NorthLat       53.2
		NorthLon       140
		NorthRadius    1.58e+03
		NorthWidth     566
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 66.5
		NorthMoveSpeed 1.03
		NorthParticles 50000
		SouthLat       -32.3
		SouthLon       -43.2
		SouthRadius    1.8e+03
		SouthWidth     401
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 67.2
		SouthMoveSpeed 1.15
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings 		true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      358.65
		SemiMajorAxis   0.988
		Eccentricity    0.0860883375
		Inclination     0.634491329
		AscendingNode   161.116099
		ArgOfPericenter 140.435029
		MeanAnomaly     27.6325651
	}
}


Moon	"Nyx"
{
	ParentBody     "Aron"
	Class          "Aquaria"
	Mass            0.053217791
	Radius          1735.12231
	InertiaMoment   0.34665674
	Oblateness      0.00151114922
	Obliquity       -0.884441868
	EqAscendNode    116.200196
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.799
		Randomize      (0.562, 0.227, -0.009)
		colorDistMagn   0.0582
		colorDistFreq   391
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.125
		snowLevel       2
		tropicLatitude  0.743
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.396
		heightTempGrad  0.625
		beachWidth      0.00135
		tropicWidth     0.07
		mainFreq        1.68
		venusFreq       0.599
		venusMagn       0
		mareFreq        1.61
		mareDensity     0.112
		terraceProb     0.233
		erosion         0
		montesMagn      0.211
		montesFreq      97.7
		montesSpiky     0.861
		montesFraction  0.712
		dunesMagn       0.0419
		dunesFreq       27.1
		dunesFraction   0.0759
		hillsMagn       0.135
		hillsFreq       292
		hillsFraction   0.941
		hills2Fraction  0.0718
		riversMagn      0
		riversFreq      1.59
		riversSin       6.52
		riftsMagn       0
		riftsFreq       2.68
		riftsSin        8.16
		eqridgeMagn     0.281
		eqridgeWidth    0.0232
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0.436
		canyonsFreq     0.923
		canyonsFraction 0
		cracksMagn      0.0619
		cracksFreq      1.52
		cracksOctaves   3
		craterMagn      0.642
		craterFreq      7.54
		craterDensity   0.809
		craterOctaves   20
		craterRayedFactor 0.195
		volcanoMagn     0.707
		volcanoFreq     0.558
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.221
		volcanoRadius   0.465
		volcanoTemp     275
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

	Atmosphere
	{
		Model          "Pluto"
		Height          107.595642
		Density         3.27161433e-06
		Pressure        3.85830106e-07
		Greenhouse      0.00128657441
		Bright          0.827
		Opacity         0
		SkyLight        0.276
		Hue             -0.018
		Saturation      0.839

		Composition
		{
			Kr        	99.3
			CO2       	0.619
			Xe        	0.0532
			SO2       	0.00143
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
		PeriodDays      20.165
		SemiMajorAxisKm 304412.642
		Eccentricity    0.000626302957
		Inclination     -15.884441868
		AscendingNode   116.200196
		ArgOfPericenter 23.4052807
		MeanAnomaly     -63.7410322
	}
}

Moon	"Parvus"
{
	ParentBody     "Aron"
	Class          "Terra"
	Mass            0.0719889849
	Radius          1337.992
	InertiaMoment   0.334994197
	Obliquity       -0.793275735
	EqAscendNode    -8.77875435
	TidalLocked     false

	AlbedoBond      0.595
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_arid_sandy_green.cfg"
		SurfStyle       0.631
		Randomize      (-0.895, -0.979, -0.432)
		colorDistMagn   0.0714
		colorDistFreq   458
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.0817
		snowLevel       2
		tropicLatitude  0.551
		icecapLatitude  0.938
		icecapHeight    0.0266
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.144
		heightTempGrad  0.625
		beachWidth      0.00132
		tropicWidth     0.07
		mainFreq        1.02
		venusFreq       0.889
		venusMagn       0
		mareFreq        1.89
		mareDensity     0.21
		terraceProb     0.363
		erosion         0
		montesMagn      0.217
		montesFreq      188
		montesSpiky     0.989
		montesFraction  0.509
		dunesMagn       0.0497
		dunesFreq       30.4
		dunesFraction   0.516
		hillsMagn       0.121
		hillsFreq       375
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.64
		riversSin       5.25
		riftsMagn       54.7
		riftsFreq       3.49
		riftsSin        6.43
		canyonsMagn     0.00168
		canyonsFreq     89.3
		canyonsFraction 0
		cracksMagn      0.1
		cracksFreq      0.311
		cracksOctaves   0
		craterMagn      0.649
		craterFreq      9.93
		craterDensity   0.377
		craterOctaves   8
		volcanoMagn     0.76
		volcanoFreq     0.665
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.287
		volcanoRadius   0.477
		volcanoTemp     1.01e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     0.329
		cycloneMagn     2.49
		cycloneFreq     0.739
		cycloneDensity  0.278
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.08
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           3.31
		Hapke           0.5
		SpotBright      0.2
		SpotWidth       0.3
		DayAmbient      0.01
		ModulateBright  0.5

		Composition
		{
			NH3		95
			CuCl2       	5
		}
	}


	Clouds
	{
		Height          15.9
		Velocity        47.3
		BumpHeight      2.61
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.62
		mainOctaves     10
		Coverage        0.11
		stripeZones     1
		stripeTwist     0.329
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          48.6388245
		Density         0.260352701
		Pressure        0.0643717796
		Greenhouse      0.271194518
		Bright          9.16
		Opacity         1
		SkyLight        3.05
		Hue             -0.00843
		Saturation      0.976

		Composition
		{
			CO2       	98
			C3H8      	1.43
			SO2       	0.466
			Cl2       	0.0854
			Xe        	0.000536
			Kr        	0.000534
			C8H18     	0.000132
			Ar        	3.53e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  15.7
	}

	Aurora
	{
		Height         33.9
		NorthLat       66.9
		NorthLon       -131
		NorthRadius    796
		NorthWidth     180
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 73.9
		NorthMoveSpeed 0.831
		NorthParticles 50000
		SouthLat       -53.4
		SouthLon       39.7
		SouthRadius    787
		SouthWidth     304
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 72.6
		SouthMoveSpeed 1.01
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
		PeriodDays      58.927
		SemiMajorAxisKm	622156.5
		Eccentricity    0.00225407367
		Inclination     -0.793275735
		AscendingNode   -8.77875435
		ArgOfPericenter -2.75980272
		MeanAnomaly     28.8972723
	}
}

