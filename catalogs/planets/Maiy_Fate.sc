Planet	"Maiy"
{
	ParentBody     "Fate"
	Class          "Aquaria"
	Mass            1.02072337
	Radius          6188.54199
	InertiaMoment   0.329198748
	Oblateness      0.0108306482
	RotationPeriod  15.9968462
	RotationEpoch   0
	Obliquity       -30.435521
	EqAscendNode    39.3608639

	AlbedoBond      0.813
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_wet_default_blue_seas.cfg"
		SurfStyle       0.388
		Randomize      (0.839, -0.214, 0.345)
		colorDistMagn   0.065
		colorDistFreq   978
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.42
		snowLevel       0.85
		tropicLatitude  0.506
		icecapLatitude  2
		icecapHeight    0.723
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.182
		heightTempGrad  0.375
		beachWidth      0.0013
		tropicWidth     0.5
		mainFreq        1.62
		venusFreq       1.48
		venusMagn       0
		mareFreq        1.18
		mareDensity     0
		terraceProb     0.243
		erosion         0.112
		montesMagn      0.151
		montesFreq      391
		montesSpiky     0.983
		montesFraction  0.548
		dunesMagn       0.062
		dunesFreq       59.3
		dunesFraction   0.23
		hillsMagn       0.136
		hillsFreq       1.2e+03
		hillsFraction   0.0489
		hills2Fraction  0.97
		riversMagn      63.6
		riversFreq      1.85
		riversSin       5.37
		riftsMagn       0
		riftsFreq       1.72
		riftsSin        6.74
		canyonsMagn     0.0389
		canyonsFreq     234
		canyonsFraction 0.634
		cracksMagn      0.0511
		cracksFreq      4.43
		cracksOctaves   4
		craterMagn      0.623
		craterFreq      29
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.653
		volcanoFreq     0.714
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.879
		volcanoRadius   0.512
		volcanoTemp     438
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.21
		stripeTwist     0.124
		cycloneMagn     2.55
		cycloneFreq     0.92
		cycloneDensity  0.388
		cycloneOctaves  3
		BumpHeight      34.2
		BumpOffset      0.0914
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      1.83
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           14.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	99.73
			SO2		0.37
		}
	}

	Clouds
	{
		Height          22.2
		Velocity        102
		BumpHeight      6.14
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.982
		ModulateBright  1
		mainFreq        0.849
		mainOctaves     10
		Coverage        0.05
		stripeZones     2.21
		stripeTwist     0.124
	}

	Clouds
	{
		Height          22.2
		Velocity        161
		BumpHeight      6.14
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.982
		ModulateBright  1
		mainFreq        0.849
		mainOctaves     10
		Coverage        0.2
		stripeZones     2.21
		stripeTwist     0.124
	}

	Clouds
	{
		Height          24.2
		Velocity        1522
		BumpHeight      6.14
		Hapke           0
		SpotBright      2
		SpotWidth       0.13
		DayAmbient      0.07
		RingsWinter     0.982
		ModulateBright  1
		mainFreq        0.849
		mainOctaves     10
		Coverage        0.3
		stripeZones     2.21
		stripeTwist     0.124
	}



	NoLava          true

	Atmosphere
	{
		Model          "Thick"
		Height          87.7483597
		Density         1.464249
		Pressure        1.26091
		Greenhouse      120.098236
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0.003817
		Saturation      0.4

		Composition
		{
			N2        	88.3
			CO2       	11.6
			SO2       	0.0724
			CO        	0.0177
			Ar        	0.000633
			He        	0.000118
			Ne        	1.35e-05
			H2O       	1.13e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  1.66
	}

	Aurora
	{
		Height         63.3
		NorthLat       70.5
		NorthLon       59.7
		NorthRadius    2.02e+03
		NorthWidth     4.41e+03
		NorthRings     3
		NorthBright    0.528
		NorthFlashFreq 74.6
		NorthMoveSpeed 1.06
		NorthParticles 50000
		SouthLat       -90
		SouthLon       -118
		SouthRadius    2.46e+03
		SouthWidth     803
		SouthRings     2
		SouthBright    0.528
		SouthFlashFreq 63
		SouthMoveSpeed 1.08
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     1.2e+04
		OuterRadius     2.45e+04
		EdgeRadius      2.45e+04
		MeanRadius      1.62e+04
		Thickness       0.0809
		RocksMaxSize    0.00324
		RocksSpacing    1
		DustDrawDist    243
		ChartRadius     2.45e+04
		RotationPeriod  5.36
		Brightness      1
		FrontBright     2.55
		BackBright      4.24
		Density         0.982
		Opacity         0.982
		SelfShadow      0.982
		PlanetShadow    0.982
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.91
		densityScale    1.38
		densityOffset   -0.339
		densityPower    5.08
		colorContrast   0.119
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
		Period            0.14196
		SemiMajorAxis    0.2095737
		Eccentricity    0.0586196817
		Inclination     -0.0638566811
		AscendingNode   31.3334873
		ArgOfPericenter 157.486302
		MeanAnomaly     236.034516
	}
}

Moon	"Sceiya"
{
	ParentBody     "Maiy"
	Class          "Terra"
	Mass            0.0105990833
	Radius          1467.71936
	InertiaMoment   0.37407589
	Oblateness      0.00438807392
	Obliquity       0.349958907
	EqAscendNode    -64.155057
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_vesta_natural.cfg"
		SurfStyle       0.934
		Randomize      (0.436, -0.826, 0.040)
		colorDistMagn   0.0483
		colorDistFreq   179
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.199
		snowLevel       2
		tropicLatitude  0.816
		icecapLatitude  2
		icecapHeight    0.46
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.352
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        1.94
		venusFreq       1.23
		venusMagn       0
		mareFreq        0.671
		mareDensity     0.144
		terraceProb     0.181
		erosion         0
		montesMagn      0.0501
		montesFreq      68.7
		montesSpiky     0.997
		montesFraction  0.125
		dunesMagn       0.0327
		dunesFreq       13.5
		dunesFraction   0.575
		hillsMagn       0.134
		hillsFreq       170
		hillsFraction   0.378
		hills2Fraction  0
		riversMagn      57.3
		riversFreq      2.85
		riversSin       4.8
		riftsMagn       70.9
		riftsFreq       1.92
		riftsSin        6.04
		canyonsMagn     0.517
		canyonsFreq     0.503
		canyonsFraction 0.744
		cracksMagn      0.0468
		cracksFreq      0.369
		cracksOctaves   0
		craterMagn      0.67
		craterFreq      3.32
		craterDensity   0.847
		craterOctaves   19
		craterRayedFactor 0.148
		volcanoMagn     0.178
		volcanoFreq     0.522
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.189
		volcanoRadius   0.152
		volcanoTemp     1.15e+03
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
		PeriodDays      1.01150144
		SemiMajorAxisKm 59762.3771
		Eccentricity    0.100207900745
		Inclination     5.349958907
		AscendingNode   -64.155057
		ArgOfPericenter -103.249631
		MeanAnomaly     -91.3273566
	}
}

