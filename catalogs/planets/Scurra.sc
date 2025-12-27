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
		Period          111
		SemiMajorAxis   23.191
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
		cracksMagn      0.7
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

