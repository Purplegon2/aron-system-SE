Barycenter	"Aron System Barycenter"
{
	ParentBody     "Hope"
	Mass            0.0
	Obliquity       -2.23490961
	EqAscendNode    -124.319756

	Orbit
	{
		RefPlane        "Equator"
		Period          0.584536823029
		SemiMajorAxis   0.65237932524
		Eccentricity    0.0110883375
		Inclination     0.634491329
		AscendingNode   161.116099
		ArgOfPericenter 140.435029
		MeanAnomaly     27.6325651
	}
}

Planet	"Aron"
{
	ParentBody     "Aron System Barycenter"
	Class          "Terra"
	Mass            0.80400002
	Radius          5728.58105
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
		Biome   "Marine/Terrestrial/Aerial"
	}

	Surface
	{
		DiffMap        "Aron/Surface"
		BumpMap        "Aron/Bump"
		BumpHeight      17
		BumpOffset      8.53
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
		Height          56
		Velocity        -80
		BumpHeight      2.89
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.794
		mainFreq        0.793
		mainOctaves     10
		Coverage        0.206
		stripeZones     2.28
		stripeTwist     -0.153
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          103.577919
		Density         1.29289997
		Pressure        1.96460009
		Greenhouse      41
		Bright          10
		Opacity         1.07
		SkyLight        3.33
		Hue             -0.042
		Saturation      1.07

		Composition
		{
			N2        	74.8
			O2        	20.9
			Ar        	0.93
			H2O       	0.4
			NH3       	0.124
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

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0564354486
		SemiMajorAxis   0.00017758624
		Eccentricity    0
		Inclination     -15.8844419
		AscendingNode   116.200196
		ArgOfPericenter 203.405281
		MeanAnomaly     -63.7410322
	}
}

Moon	"Nyx"
{
	ParentBody     "Aron System Barycenter"
	Class          "Aquaria"
	Mass            0.0879752322
	Radius          3125.4502
	InertiaMoment   0.32966429
	Oblateness      0.00151114922
	Obliquity       -15.8844419
	EqAscendNode    116.200196
	TidalLocked     true

	AlbedoBond      0.526
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
		Preset         "ferria_wet_sand_green.cfg"
		SurfStyle       0.468
		Randomize      (-0.016, 0.402, -0.329)
		colorDistMagn   0.0638
		colorDistFreq   767
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.511
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.517
		climatePole     0.562
		climateTropic   0.562
		climateEquator  0.562
		climateSteppeMin 0.312
		climateSteppeMax 0.562
		climateForestMin 0.5
		climateForestMax 0.688
		climateGrassMin  0.625
		climateGrassMax  0.812
		humidity        0.988
		heightTempGrad  0.375
		beachWidth      0.000934
		tropicWidth     0.5
		mainFreq        0.927
		venusFreq       0.909
		venusMagn       0.761
		mareFreq        6.49
		mareDensity     0
		terraceProb     0.836
		erosion         0.112
		montesMagn      0.169
		montesFreq      215
		montesSpiky     0.928
		montesFraction  0.247
		dunesMagn       0.0655
		dunesFreq       56.7
		dunesFraction   0.655
		hillsMagn       0.112
		hillsFreq       82.5
		hillsFraction   0.0559
		hills2Fraction  0.411
		riversMagn      56.8
		riversFreq      4.19
		riversSin       6.48
		riftsMagn       0
		riftsFreq       3.54
		riftsSin        5.43
		canyonsMagn     0.0564
		canyonsFreq     183
		canyonsFraction 0.577
		cracksMagn      0.0931
		cracksFreq      0.577
		cracksOctaves   0
		craterMagn      0.67
		craterFreq      23
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.668
		volcanoFreq     0.706
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.602
		volcanoRadius   0.443
		volcanoTemp     1.17e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.12
		cycloneFreq     0.642
		cycloneDensity  0.34
		cycloneOctaves  0
		BumpHeight      17.5
		BumpOffset      4.55
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           8.95
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	100
			NaCl      	3.18e-05
		}
	}

	Clouds
	{
		Height          11.9
		Velocity        80
		BumpHeight      3.99
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.838
		mainOctaves     10
		Coverage        0.169
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.9
		Velocity        156
		BumpHeight      3.99
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.838
		mainOctaves     10
		Coverage        0.169
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.9
		Velocity        116
		BumpHeight      3.99
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.838
		mainOctaves     10
		Coverage        0.169
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Biogenic"
		Height          95.2709732
		Density         27.2341919
		Pressure        0.893234682
		Greenhouse      51.1450386
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             -0.0496
		Saturation      1.02

		Composition
		{
			N2        	84.8
			O2        	13.1
			CO2       	1.04
			Ar        	0.93
			H2O       	0.4
			NH3       	0.124
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
		GlobalWindSpeed  3.5
	}

	Aurora
	{
		Height         53.7
		NorthLat       52.8
		NorthLon       -83.1
		NorthRadius    1.96e+03
		NorthWidth     356
		NorthRings     4
		NorthBright    0.339
		NorthFlashFreq 78.9
		NorthMoveSpeed 0.769
		NorthParticles 50000
		SouthLat       -30
		SouthLon       91.2
		SouthRadius    2e+03
		SouthWidth     702
		SouthRings     3
		SouthBright    0.339
		SouthFlashFreq 66.4
		SouthMoveSpeed 0.848
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
		PeriodDays      20.6126068
		SemiMajorAxisKm 277846.119
		Eccentricity    0
		Inclination     -15.8844419
		AscendingNode   116.200196
		ArgOfPericenter 23.4052807
		MeanAnomaly     -63.7410322
	}
}

Moon	"Parvus"
{
	ParentBody     "Aron System Barycenter"
	Class          "Terra"
	Mass            0.0106220373
	Radius          1339.63232
	InertiaMoment   0.332481474
	Oblateness      0.00724849897
	RotationPeriod  17.1588093
	RotationEpoch   0
	Obliquity       -53.554576
	EqAscendNode    75.0247354

	AlbedoBond      0.594
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_vesta_enhanced.cfg"
		SurfStyle       0.305
		Randomize      (-0.683, -0.575, -0.948)
		colorDistMagn   0.0684
		colorDistFreq   107
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.204
		snowLevel       2
		tropicLatitude  0.837
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.312
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42
		heightTempGrad  0.625
		beachWidth      0.000302
		tropicWidth     0.07
		mainFreq        1.9
		venusFreq       1.17
		venusMagn       0
		mareFreq        0.267
		mareDensity     0.194
		terraceProb     0.143
		erosion         0.214
		montesMagn      0.077
		montesFreq      47.8
		montesSpiky     0.918
		montesFraction  0.337
		dunesMagn       0.0277
		dunesFreq       9.82
		dunesFraction   0.871
		hillsMagn       0.124
		hillsFreq       111
		hillsFraction   0.623
		hills2Fraction  0
		riversMagn      35.1
		riversFreq      2.45
		riversSin       5.85
		riftsMagn       63.3
		riftsFreq       10
		riftsSin        5.92
		eqridgeMagn     0.115
		eqridgeWidth    0.00111
		eqridgeModMagn  0.0573
		eqridgeModFreq  0.84
		canyonsMagn     10
		canyonsFreq     878
		canyonsFraction 0.147
		cracksMagn      0.06
		cracksFreq      1.15
		cracksOctaves   0
		craterMagn      0
		craterFreq      100
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.206
		volcanoMagn     0.195
		volcanoFreq     0
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.87
		volcanoFlows    0.493
		volcanoRadius   0.142
		volcanoTemp     942
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
		PeriodDays      84.0769149408
		SemiMajorAxisKm 780238.044055
		Eccentricity    0.1374
		Inclination     178.206724
		AscendingNode   351.22124565
		ArgOfPericenter 357.24019728
		MeanAnomaly     28.8972723
	}
}
