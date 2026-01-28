Planet	"Scurra"
{
	ParentBody     "Hope"
	Class          "Neptune"
	Mass            81.4246216
	Radius          57446.646
	InertiaMoment   0.183730915
	Oblateness      0.0543512069
	RotationPeriod  14.1074781
	RotationEpoch   0
	Obliquity       9.60802369
	EqAscendNode    93.5315177

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_warm_default.cfg"
		SurfStyle       0.112
		Randomize      (-0.158, -0.618, 0.548)
		detailScale     256
		tropicLatitude  0.166
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.00102
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.07
		stripeFluct     0.408
		stripeTwist     9.22
		cycloneMagn     8.09
		cycloneFreq     1.06
		cycloneDensity  0.545
		cycloneOctaves  1
		cycloneMagn2     0.62
		cycloneFreq2     1.05
		cycloneLatitude2 0.923
		cycloneOctaves2  0
		BumpHeight      20
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
		Height          488
		Velocity        865
		BumpHeight      51.7
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.38
		mainOctaves     12
		Coverage        0.0631
		stripeZones     5.07
		stripeFluct     0.408
		stripeTwist     9.22
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          2360.17163
		Density         0.00544297788
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0965
		Saturation      0.937

		Composition
		{
			H2        	91.9
			He        	7.74
			CH4       	0.32
			N2        	0.0401
			NH3       	0.0243
			O2        	0.00774
			C2H2      	0.00333
			Ne        	0.00116
			C2H4      	0.00108
			Ar        	0.000856
			C2H6      	0.00061
			C8H18     	0.000303
			C3H8      	0.000286
			H2O       	3.34e-06
			H2S       	1.71e-06
			CO2       	1.42e-06
			Kr        	3.57e-07
			Xe        	3.83e-08
			SO2       	8.89e-09
			CO        	3.42e-10
			Cl2       	3.41e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  368
	}

	Aurora
	{
		Height         1.65e+03
		NorthLat       58.7
		NorthLon       -159
		NorthRadius    1.73e+04
		NorthWidth     5.53e+03
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 62.7
		NorthMoveSpeed 1.28
		NorthParticles 10000
		SouthLat       -37.5
		SouthLon       23.3
		SouthRadius    1.18e+04
		SouthWidth     4.03e+03
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 72.7
		SouthMoveSpeed 1.06
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		Texture        "Saturn-rings.*"
		InnerRadius     6.45e+04
		OuterRadius     3.18e+05
		EdgeRadius      1.37e+05
		MeanRadius      1.06e+05
		Thickness       0.15
		RocksMaxSize    0.008
		RocksSpacing    1
		DustDrawDist    450
		ChartRadius     1.37e+05
		RotationPeriod  9.06
		Brightness      1
		FrontBright     2
		BackBright      5
		Density         1
		Opacity         1
		SelfShadow      1
		PlanetShadow    1
		Hapke           1
		SpotBright      0.45
		SpotWidth       0.015
		SpotBrightCB    1.95
		SpotWidthCB     0.00245
		frequency       7.11
		densityScale    1.68
		densityOffset   -0.197
		densityPower    0.993
		colorContrast   0.053
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
		Period          43.937
		SemiMajorAxis   14.191
		Eccentricity    0.0468576972
		Inclination     0
		AscendingNode   95.9152441
		ArgOfPericenter 53.1644709
		MeanAnomaly     267.449037
	}
}

Moon	"Ikernu"
{
	ParentBody     "Scurra"
	Class          "Terra"
	Mass            0.11513598
	Radius          4117.6001
	InertiaMoment   0.331860512
	Oblateness      0.00240523578
	RotationPeriod  27.7977429
	Obliquity       28.2500932
	EqAscendNode    19.9272691

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.779
		Randomize      (-0.354, 0.957, -0.457)
		colorDistMagn   0.0554
		colorDistFreq   1.02e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        -0.725
		snowLevel       1.29
		tropicLatitude  0.955
		icecapLatitude  2
		icecapHeight    0.0916
		climatePole     0.626
		climateTropic   0.563
		climateEquator  0.672
		climateSteppeMin -0.847
		climateSteppeMax -0.496
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.233
		heightTempGrad  0.375
		beachWidth      0.00138
		tropicWidth     0.5
		mainFreq        4.2
		venusFreq       0.565
		venusMagn       0.0382
		mareFreq        0.001
		mareDensity     0.0916
		terraceProb     0.42
		erosion         0.229
		montesMagn      0.305
		montesFreq      145
		montesSpiky     0
		montesFraction  0
		dunesMagn       0.01
		dunesFreq       5.34e+04
		dunesFraction   0.366
		hillsMagn       0.03
		hillsFreq       8.02e+03
		hillsFraction   0.412
		hills2Fraction  0.405
		riversMagn      9.92
		riversFreq      3.13
		riversSin       0
		riftsMagn       2.29
		riftsFreq       2.52
		riftsSin        1.07
		eqridgeModMagn  0.286
		canyonsMagn     1.07
		canyonsFreq     573
		canyonsFraction 0.0611
		cracksMagn      0.2
		cracksFreq      1.92
		cracksOctaves   2
		craterMagn      0.64
		craterFreq      25
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.787
		volcanoFreq     0.962
		volcanoDensity  0.359
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.931
		volcanoRadius   0.802
		volcanoTemp     3e+03
		lavaCoverTidal  0.0763
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.47
		stripeTwist     0.16
		cycloneMagn     1.07
		cycloneFreq     0.458
		cycloneDensity  0.145
		cycloneOctaves  4
		BumpHeight      17.8
		BumpOffset      2.72
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.02
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.750 0.603 0.495)
	}

	Ocean
	{
		Depth           -12.9
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			SO2       	99
			C2H4      	0.372
			C2H6      	0.201
			NH3       	0.174
			C2H2      	0.167
			H2S       	0.0785
			C3H8      	0.000647
		}
	}

	Clouds
	{
		Height          5.5
		Velocity        48.7
		BumpHeight      3.31
		Gamma           1.09
		Hapke           0
		SpotBright      5.95
		SpotWidth       0.0644
		DayAmbient      0.07
		ModulateColor  (0.762 0.491 0.253)
		ModulateBright  0.486
		Opacity         0.763
		mainFreq        0.75
		mainOctaves     10
		Coverage        0.237
		stripeZones     1.47
		stripeTwist     0.16
	}

	Clouds
	{
		Height          5.5
		Velocity        79.4
		BumpHeight      3.31
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.75
		mainOctaves     10
		Coverage        0.237
		stripeZones     1.47
		stripeTwist     0.16
	}

	Atmosphere
	{
		Model          "Earth"
		Height          422.624054
		Density         8.53685123e-10
		Pressure        7.28778275e-07
		Greenhouse      151.908401
		Bright          1.07
		Opacity         0.992
		SkyLight        8.55
		Hue             0.5
		Saturation      0.458

		Composition
		{
			N2        	91.9
			CO        	4.77
			CO2       	1.36
			C2H4      	1.04
			C2H6      	0.507
			SO2       	0.243
			C2H2      	0.0651
			NH3       	0.0516
			H2S       	0.0326
			Ar        	0.0131
			CH4       	0.00637
			Ne        	0.00302
			C3H8      	0.00112
			He        	0.00084
			H2O       	0.000144
			Kr        	8.99e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  1.99
	}

	Aurora
	{
		Height         297
		NorthLat       72.6
		NorthLon       -82.4
		NorthRadius    1.33e+03
		NorthWidth     5.13e+03
		NorthRings     2
		NorthBright    0.687
		NorthFlashFreq 67.7
		NorthMoveSpeed 0.901
		NorthParticles 50000
		SouthLat       -52.8
		SouthLon       136
		SouthRadius    2.21e+03
		SouthWidth     3.63e+03
		SouthRings     6
		SouthBright    0.763
		SouthFlashFreq 64.2
		SouthMoveSpeed 0.965
		SouthParticles 50000
		TopColor    (0.310 0.684 0.605)
		BottomColor (0.236 0.637 0.468)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.284
		SemiMajorAxisKm 1221850.22
		Eccentricity    0.0459930403
		Inclination     -1.17193275
		AscendingNode   16.0924829
		ArgOfPericenter -135.159235
		MeanAnomaly     -94.9656029
	}
}

Moon	"Malia"
{
	ParentBody     "Scurra"
	Class          "Aquaria"
	Mass            0.000149627987
	Radius          423.783112
	InertiaMoment   0.39993149
	Oblateness      0.00907221623
	Obliquity       1.38022411
	EqAscendNode    -129.482077
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.797
		Randomize      (-0.020, -0.731, -0.176)
		colorDistMagn   0.0405
		colorDistFreq   46.8
		detailScale     2.05e+03
		drivenDarkening 0.7
		seaLevel        0.31
		snowLevel       2
		tropicLatitude  0.216
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
		humidity        0.417
		heightTempGrad  0.625
		beachWidth      0.000671
		tropicWidth     0.07
		mainFreq        1.65
		venusFreq       0.273
		venusMagn       0
		mareFreq        0
		mareDensity     0.13
		terraceProb     0.286
		erosion         0
		montesMagn      0.0705
		montesFreq      16.2
		montesSpiky     0.917
		montesFraction  0.348
		dunesMagn       0.0451
		dunesFreq       3.71
		dunesFraction   0.23
		hillsMagn       0.111
		hillsFreq       46.5
		hillsFraction   0.715
		hills2Fraction  0.134
		riversMagn      0
		riversFreq      4.29
		riversSin       8.66
		riftsMagn       0
		riftsFreq       3.9
		riftsSin        7.16
		canyonsMagn     0.502
		canyonsFreq     0.147
		canyonsFraction 0
		cracksMagn      0.0514
		cracksFreq      0.291
		cracksOctaves   0
		craterMagn      0.521
		craterFreq      0.875
		craterDensity   0.962
		craterOctaves   17
		craterRayedFactor 0.219
		volcanoMagn     0.175
		volcanoFreq     0.787
		volcanoDensity  0.199
		volcanoOctaves  3
		volcanoActivity 0.0394
		volcanoFlows    0.248
		volcanoRadius   0.173
		volcanoTemp     231
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
		PeriodDays       0.68844
		SemiMajorAxisKm 142506.707
		Eccentricity    0.00021459288
		Inclination     1.38022411
		AscendingNode   -129.482077
		ArgOfPericenter -154.662292
		MeanAnomaly     170.957168
	}
}

Moon	"Radus"
{
	ParentBody     "Scurra"
	Class          "Aquaria"
	Mass            0.00017140081
	Radius          472.535187
	InertiaMoment   0.399502963
	Obliquity       0.0762410075
	EqAscendNode    -29.0579609
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_europa.cfg"
		SurfStyle       0.202
		Randomize      (0.497, -0.672, 0.190)
		colorDistMagn   0.0969
		colorDistFreq   60.1
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.202
		snowLevel       2
		tropicLatitude  0.998
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
		humidity        0.391
		heightTempGrad  0.625
		beachWidth      0.000539
		tropicWidth     0.07
		mainFreq        1.97
		venusFreq       0.821
		venusMagn       0.232
		mareFreq        0
		mareDensity     0.161
		terraceProb     0.348
		erosion         0
		montesMagn      0.06
		montesFreq      19.9
		montesSpiky     0.858
		montesFraction  0.289
		dunesMagn       0.0341
		dunesFreq       4.93
		dunesFraction   0.826
		hillsMagn       0.146
		hillsFreq       49.2
		hillsFraction   0.32
		hills2Fraction  0.276
		riversMagn      0
		riversFreq      2.65
		riversSin       5.51
		riftsMagn       0
		riftsFreq       4.05
		riftsSin        5.28
		canyonsMagn     0.526
		canyonsFreq     0.182
		canyonsFraction 0
		cracksMagn      0.0517
		cracksFreq      0.152
		cracksOctaves   0
		craterMagn      0.628
		craterFreq      1.09
		craterDensity   0.78
		craterOctaves   17
		craterRayedFactor 0
		volcanoMagn     0.177
		volcanoFreq     0.769
		volcanoDensity  0.201
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.243
		volcanoRadius   0.157
		volcanoTemp     248
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
		PeriodDays      1.3603
		SemiMajorAxis	0.0015
		Eccentricity    0.0192017898
		Inclination     0.0762410075
		AscendingNode   -29.0579609
		ArgOfPericenter -152.351352
		MeanAnomaly     -177.369446
	}
}

Moon	"Naitii"
{
	ParentBody     "Scurra"
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

	Surface
	{
		Preset         "aquaria_airless_triton.cfg"
		SurfStyle       0.465
		Randomize      (-0.738, -0.975, 0.054)
		colorDistMagn   0.0695
		colorDistFreq   69.9
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.238
		snowLevel       2
		tropicLatitude  0.916
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
		humidity        0.329
		heightTempGrad  0.625
		beachWidth      0.000713
		tropicWidth     0.07
		mainFreq        1.63
		venusFreq       0.915
		venusMagn       0
		mareFreq        0
		mareDensity     0.143
		terraceProb     0.245
		erosion         0
		montesMagn      0.0587
		montesFreq      26.5
		montesSpiky     0.838
		montesFraction  0.248
		dunesMagn       0.0396
		dunesFreq       4.75
		dunesFraction   0.147
		hillsMagn       0.117
		hillsFreq       70.8
		hillsFraction   0.345
		hills2Fraction  0.287
		riversMagn      0
		riversFreq      2.96
		riversSin       6.05
		riftsMagn       0
		riftsFreq       3.19
		riftsSin        4.74
		canyonsMagn     0.567
		canyonsFreq     0.155
		canyonsFraction 0
		cracksMagn      0.0481
		cracksFreq      0.299
		cracksOctaves   0
		craterMagn      0.665
		craterFreq      1.76
		craterDensity   0.997
		craterOctaves   17
		craterRayedFactor 0.15
		volcanoMagn     0.167
		volcanoFreq     0.485
		volcanoDensity  0.185
		volcanoOctaves  3
		volcanoActivity 0.358
		volcanoFlows    0.269
		volcanoRadius   0.108
		volcanoTemp     314
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
		PeriodDays       8.2786
		SemiMajorAxis	0.005
		Eccentricity    0.4243081901
		Inclination     39.931
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

Moon	"Scaite"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.38439274
	Radius          0.5
	InertiaMoment   0.39936468
	Oblateness      0.231208667
	RotationPeriod  4.42601
	RotationEpoch   0
	Obliquity       356.829943
	EqAscendNode    263.288006

	AbsMagn         17.3
	SlopeParam      0.15
	Albedo          0.23
	Brightness      2.25
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
		Epoch           2457400.5
		PeriodDays	  8.5784
		SemiMajorAxis   0.00512
		Eccentricity    0.4586428
		Inclination     1.512
		AscendingNode   261.45418
		ArgOfPericenter 126.33098
		MeanAnomaly     67.34618
	}
}

Moon	"Talevia"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.38439274
	Radius          15
	InertiaMoment   0.39936468
	Oblateness      0.231208667
	RotationPeriod  4.42601
	RotationEpoch   0
	Obliquity       356.829943
	EqAscendNode    263.288006

	AbsMagn         17.3
	SlopeParam      0.15
	Albedo          0.23
	Brightness      2.25
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
		Epoch           2457400.5
		PeriodDays	    43.534
		SemiMajorAxis   0.01512
		Eccentricity    0.4586428
		Inclination     -2.18187
		AscendingNode   261.45418
		ArgOfPericenter 126.33098
		MeanAnomaly     67.34618
	}
}


Moon	"Nini"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.51107315e-9
	Radius          8.864
	InertiaMoment   0.4095922
	Oblateness      0.236332004
	RotationPeriod  7.17146
	Obliquity       184.159123
	EqAscendNode    -108.070391

	AbsMagn         17.4
	SlopeParam      0.19
	Albedo          0.08
	Brightness      1.32
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.97379
		SemiMajorAxisKm 1.15096344e+6
		Eccentricity    0.3909871063
		Inclination     1.093035
		AscendingNode   -121.369435
		ArgOfPericenter -139.889408
		MeanAnomaly     10.588622
	}
}

Moon	"Nuyene"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.77437855e-11
	Radius          3.627
	InertiaMoment   0.375098541
	Oblateness      0.271321414
	RotationPeriod  9.29896
	Obliquity       121.548967
	EqAscendNode    171.106426

	AbsMagn         17.6
	SlopeParam      0.17
	Albedo          0.26
	Brightness      2.26
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.031633
		SemiMajorAxisKm 1.15986972e+6
		Eccentricity    0.3511173138
		Inclination     -0.122502
		AscendingNode   41.700441
		ArgOfPericenter 28.205995
		MeanAnomaly     40.686776
	}
}

Moon	"Scanus"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.03109555e-8
	Radius          19.455
	InertiaMoment   0.399941703
	Oblateness      0.175800313
	RotationPeriod  5.41458
	Obliquity       8.393455
	EqAscendNode    -166.292204

	AbsMagn         22.4
	SlopeParam      0.22
	Albedo          0.17
	Brightness      1.88
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.039239
		SemiMajorAxisKm 1.16103835e+6
		Eccentricity    0.3880057932
		Inclination     0.603408
		AscendingNode   62.689879
		ArgOfPericenter -171.789253
		MeanAnomaly     -77.168125
	}
}

Moon	"Kiitiit"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.74240753e-9
	Radius          13.96
	InertiaMoment   0.406004153
	Oblateness      0.329067797
	RotationPeriod  15.85477
	Obliquity       32.65685
	EqAscendNode    146.233724

	AbsMagn         17.5
	SlopeParam      0.06
	Albedo          0.13
	Brightness      1.61
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.077263
		SemiMajorAxisKm 1.16687147e+6
		Eccentricity    0.4026706964
		Inclination     -2.002371
		AscendingNode   56.456793
		ArgOfPericenter -122.810053
		MeanAnomaly     49.97417
	}
}

Moon	"Lerira"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.35379249e-8
	Radius          27.863
	InertiaMoment   0.391502755
	Oblateness      0.078550391
	RotationPeriod  11.73563
	Obliquity       110.904106
	EqAscendNode    90.206617

	AbsMagn         17.7
	SlopeParam      0.08
	Albedo          0.15
	Brightness      1.93
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.102457
		SemiMajorAxisKm 1.17072839e+6
		Eccentricity    0.086896869
		Inclination     -1.875023
		AscendingNode   -172.863929
		ArgOfPericenter 52.539984
		MeanAnomaly     -112.468698
	}
}

Moon	"Chaneim"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.31729268e-8
	Radius          18.931
	InertiaMoment   0.406052686
	Oblateness      0.17582777
	RotationPeriod  11.22807
	Obliquity       203.047119
	EqAscendNode    59.512541

	AbsMagn         16.9
	SlopeParam      0.19
	Albedo          0.09
	Brightness      1.49
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.117141
		SemiMajorAxisKm 1.17297342e+6
		Eccentricity    0.2226715757
		Inclination     -2.652057
		AscendingNode   93.045187
		ArgOfPericenter -5.052871
		MeanAnomaly     43.043838
	}
}

Moon	"Tetevie"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            2.33910321e-9
	Radius          11.481
	InertiaMoment   0.373342312
	Oblateness      0.105739712
	RotationPeriod  12.61453
	Obliquity       183.164376
	EqAscendNode    61.222275

	AbsMagn         17.5
	SlopeParam      0.06
	Albedo          0.31
	Brightness      2.26
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.144635
		SemiMajorAxisKm 1.17717123e+6
		Eccentricity    0.0450502549
		Inclination     -0.060937
		AscendingNode   29.330096
		ArgOfPericenter 42.298726
		MeanAnomaly     -169.110827
	}
}

Moon	"Nayi"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.10557101e-8
	Radius          29.25
	InertiaMoment   0.385304018
	Oblateness      0.099524297
	RotationPeriod  4.07974
	Obliquity       246.794037
	EqAscendNode    -60.707805

	AbsMagn         21.5
	SlopeParam      0.19
	Albedo          0.09
	Brightness      1.8
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.182769
		SemiMajorAxisKm 1.18298122e+6
		Eccentricity    0.0938006304
		Inclination     -3.585404
		AscendingNode   55.336464
		ArgOfPericenter 115.642925
		MeanAnomaly     27.383259
	}
}

Moon	"Manus"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.03281768e-11
	Radius          3.25
	InertiaMoment   0.402954357
	Oblateness      0.257107769
	RotationPeriod  7.09155
	Obliquity       14.156414
	EqAscendNode    -133.880169

	AbsMagn         21.1
	SlopeParam      0.17
	Albedo          0.08
	Brightness      1.64
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.012338
		SemiMajorAxisKm 3.46781710e+6
		Eccentricity    0.2506367319
		Inclination     1.009996
		AscendingNode   0.161691
		ArgOfPericenter -166.813399
		MeanAnomaly     -123.03613
	}
}

Moon	"Nalia"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.75982766e-9
	Radius          13.174
	InertiaMoment   0.393686521
	Oblateness      0.236030018
	RotationPeriod  8.70666
	Obliquity       161.250553
	EqAscendNode    -84.846987

	AbsMagn         21.2
	SlopeParam      0.12
	Albedo          0.21
	Brightness      1.65
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.169765
		SemiMajorAxisKm 3.48179449e+6
		Eccentricity    0.0426668924
		Inclination     -0.066208
		AscendingNode   -7.783093
		ArgOfPericenter -77.408217
		MeanAnomaly     148.471172
	}
}

Moon	"Sclnu"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.61245209e-8
	Radius          34.141
	InertiaMoment   0.377257186
	Oblateness      0.214505023
	RotationPeriod  13.08774
	Obliquity       339.369333
	EqAscendNode    -178.102404

	AbsMagn         15.6
	SlopeParam      0.24
	Albedo          0.09
	Brightness      2.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.217583
		SemiMajorAxisKm 3.48603457e+6
		Eccentricity    0.327288386
		Inclination     3.487766
		AscendingNode   -86.331671
		ArgOfPericenter -53.461445
		MeanAnomaly     -68.746019
	}
}

Moon	"Mnus"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.50473585e-8
	Radius          20.715
	InertiaMoment   0.376668142
	Oblateness      0.280430888
	RotationPeriod  8.91497
	Obliquity       338.53027
	EqAscendNode    178.879025

	AbsMagn         19.4
	SlopeParam      0.14
	Albedo          0.18
	Brightness      2.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.326072
		SemiMajorAxisKm 3.49564478e+6
		Eccentricity    0.2747012888
		Inclination     -0.273483
		AscendingNode   -125.069286
		ArgOfPericenter 139.870266
		MeanAnomaly     -132.202522
	}
}

Moon	"Sine"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            8.23402754e-8
	Radius          39.226
	InertiaMoment   0.382442711
	Oblateness      0.151376786
	RotationPeriod  14.41547
	Obliquity       123.718045
	EqAscendNode    163.881385

	AbsMagn         17.2
	SlopeParam      0.23
	Albedo          0.12
	Brightness      2.41
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.843751
		SemiMajorAxisKm 3.54132176e+6
		Eccentricity    0.3886650093
		Inclination     -3.367508
		AscendingNode   114.274927
		ArgOfPericenter -70.392086
		MeanAnomaly     -107.534261
	}
}

Moon	"Eiyu"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.82822310e-10
	Radius          5.975
	InertiaMoment   0.375049566
	Oblateness      0.328581609
	RotationPeriod  4.4228
	Obliquity       336.130233
	EqAscendNode    -102.334085

	AbsMagn         16.1
	SlopeParam      0.19
	Albedo          0.15
	Brightness      2.68
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      26.874105
		SemiMajorAxisKm 3.54399084e+6
		Eccentricity    0.2627791925
		Inclination     -3.908396
		AscendingNode   152.245516
		ArgOfPericenter -43.155638
		MeanAnomaly     90.4447
	}
}

Moon	"Tetiyinu"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.11042739e-8
	Radius          22.621
	InertiaMoment   0.373894624
	Oblateness      0.152187452
	RotationPeriod  13.27028
	Obliquity       61.468913
	EqAscendNode    70.089094

	AbsMagn         18.7
	SlopeParam      0.12
	Albedo          0.27
	Brightness      1.25
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      45.5595
		SemiMajorAxisKm 5.03874703e+6
		Eccentricity    0.1874996025
		Inclination     2.627458
		AscendingNode   -167.875466
		ArgOfPericenter 54.879153
		MeanAnomaly     -81.80038
	}
}

Moon	"Keral"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.77669155e-8
	Radius          22.124
	InertiaMoment   0.371167155
	Oblateness      0.16351383
	RotationPeriod  6.48393
	Obliquity       243.935045
	EqAscendNode    85.316177

	AbsMagn         14.9
	SlopeParam      0.07
	Albedo          0.22
	Brightness      1.87
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      45.805353
		SemiMajorAxisKm 5.05685786e+6
		Eccentricity    0.3466116036
		Inclination     2.37995
		AscendingNode   158.031956
		ArgOfPericenter -18.680867
		MeanAnomaly     152.66561
	}
}

Moon	"Rucholeyu"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.88064466e-9
	Radius          15.049
	InertiaMoment   0.394662851
	Oblateness      0.048476597
	RotationPeriod  17.45373
	Obliquity       352.411848
	EqAscendNode    -87.809899

	AbsMagn         22
	SlopeParam      0.18
	Albedo          0.19
	Brightness      2.87
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.15236
		SemiMajorAxisKm 5.08236512e+6
		Eccentricity    0.2344913808
		Inclination     -3.293387
		AscendingNode   -127.961
		ArgOfPericenter 8.72623
		MeanAnomaly     25.996202
	}
}

Moon	"Loteneri"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.11890630e-8
	Radius          17.925
	InertiaMoment   0.371994667
	Oblateness      0.213447816
	RotationPeriod  17.0005
	Obliquity       273.842368
	EqAscendNode    -53.788928

	AbsMagn         21.4
	SlopeParam      0.21
	Albedo          0.18
	Brightness      1.49
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.172166
		SemiMajorAxisKm 5.08381910e+6
		Eccentricity    0.3180611919
		Inclination     -3.527162
		AscendingNode   98.815097
		ArgOfPericenter -17.212595
		MeanAnomaly     -48.087005
	}
}

Moon	"Ravia"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            9.64722146e-8
	Radius          37.736
	InertiaMoment   0.404008326
	Oblateness      0.237939545
	RotationPeriod  4.15007
	Obliquity       140.232402
	EqAscendNode    140.537054

	AbsMagn         20.8
	SlopeParam      0.22
	Albedo          0.29
	Brightness      1.99
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.19176
		SemiMajorAxisKm 5.08525724e+6
		Eccentricity    0.0069959343
		Inclination     -3.954429
		AscendingNode   -159.788584
		ArgOfPericenter -103.397706
		MeanAnomaly     11.107001
	}
}

Moon	"Titheta"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            3.62827977e-8
	Radius          29.479
	InertiaMoment   0.373210141
	Oblateness      0.330842127
	RotationPeriod  14.64176
	Obliquity       64.166868
	EqAscendNode    -26.906525

	AbsMagn         19.7
	SlopeParam      0.13
	Albedo          0.3
	Brightness      1.37
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.263612
		SemiMajorAxisKm 5.09052936e+6
		Eccentricity    0.3199370578
		Inclination     -3.937402
		AscendingNode   -177.779194
		ArgOfPericenter 159.399159
		MeanAnomaly     29.784104
	}
}

Moon	"Acalia"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.30855078e-8
	Radius          18.516
	InertiaMoment   0.405228159
	Oblateness      0.115779957
	RotationPeriod  13.56841
	Obliquity       84.724272
	EqAscendNode    33.581839

	AbsMagn         21.2
	SlopeParam      0.1
	Albedo          0.1
	Brightness      2.51
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.334606
		SemiMajorAxisKm 5.09573585e+6
		Eccentricity    0.2579032293
		Inclination     2.646269
		AscendingNode   133.352541
		ArgOfPericenter -107.152269
		MeanAnomaly     8.960827
	}
}

Moon	"Iethe"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.17578160e-8
	Radius          17.785
	InertiaMoment   0.385390052
	Oblateness      0.217444362
	RotationPeriod  12.82395
	Obliquity       340.383766
	EqAscendNode    -1.098061

	AbsMagn         19.1
	SlopeParam      0.07
	Albedo          0.27
	Brightness      2.37
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.407539
		SemiMajorAxisKm 5.10108172e+6
		Eccentricity    0.4065739908
		Inclination     0.923523
		AscendingNode   152.393004
		ArgOfPericenter -19.475836
		MeanAnomaly     148.415708
	}
}

Moon	"Kachunato"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.68628970e-8
	Radius          24.047
	InertiaMoment   0.389230065
	Oblateness      0.089933627
	RotationPeriod  15.67967
	Obliquity       124.770452
	EqAscendNode    -4.043357

	AbsMagn         15.7
	SlopeParam      0.13
	Albedo          0.34
	Brightness      1.28
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.560403
		SemiMajorAxisKm 5.11227734e+6
		Eccentricity    0.3008463864
		Inclination     -2.633517
		AscendingNode   44.988355
		ArgOfPericenter 79.277874
		MeanAnomaly     -99.392458
	}
}

Moon	"Ponalnu"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.32442031e-8
	Radius          31.13
	InertiaMoment   0.381321725
	Oblateness      0.328521252
	RotationPeriod  6.92023
	Obliquity       68.111686
	EqAscendNode    -52.867678

	AbsMagn         15.7
	SlopeParam      0.08
	Albedo          0.27
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.684031
		SemiMajorAxisKm 5.12132282e+6
		Eccentricity    0.4302690645
		Inclination     3.654177
		AscendingNode   70.93427
		ArgOfPericenter 87.645882
		MeanAnomaly     -17.120203
	}
}

Moon	"Tielia"
{
	ParentBody     "Scurra"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.01691172e-9
	Radius          16.693
	InertiaMoment   0.398571359
	Oblateness      0.335060584
	RotationPeriod  15.45387
	Obliquity       232.75822
	EqAscendNode    -121.879578

	AbsMagn         21.5
	SlopeParam      0.24
	Albedo          0.12
	Brightness      2.3
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      47.410771
		SemiMajorAxisKm 5.17433570e+6
		Eccentricity    0.4305854104
		Inclination     0.88961
		AscendingNode   124.077929
		ArgOfPericenter 87.013498
		MeanAnomaly     129.640902
	}
}
