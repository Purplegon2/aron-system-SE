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
		cracksMagn      0.1
		cracksFreq      4.92
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

Moon	"Ponevia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.06102514e-8
	Radius          19.771
	InertiaMoment   0.373081264
	Oblateness      0.041624984
	RotationPeriod  10.1461
	Obliquity       78.677729
	EqAscendNode    124.598419

	AbsMagn         18.1
	SlopeParam      0.2
	Albedo          0.34
	Brightness      1.27
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.376693
		SemiMajorAxisKm 766568.093
		Eccentricity    0.1544070755
		Inclination     3.961432
		AscendingNode   -134.620123
		ArgOfPericenter -144.856324
		MeanAnomaly     -5.762055
	}
}

Moon	"Kotulachi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.01713592e-8
	Radius          24.017
	InertiaMoment   0.398580321
	Oblateness      0.100396684
	RotationPeriod  5.57045
	Obliquity       108.680251
	EqAscendNode    89.27742

	AbsMagn         14.9
	SlopeParam      0.19
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
		PeriodDays      4.389444
		SemiMajorAxisKm 768056.249
		Eccentricity    0.1707598964
		Inclination     1.546338
		AscendingNode   -138.049872
		ArgOfPericenter -171.702572
		MeanAnomaly     61.57035
	}
}

Moon	"Ponaiad"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.92634527e-9
	Radius          15.024
	InertiaMoment   0.384768101
	Oblateness      0.2830786
	RotationPeriod  13.52132
	Obliquity       107.970691
	EqAscendNode    27.111647

	AbsMagn         18.7
	SlopeParam      0.19
	Albedo          0.08
	Brightness      2.36
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.400273
		SemiMajorAxisKm 769318.962
		Eccentricity    0.4137931679
		Inclination     2.079536
		AscendingNode   49.606889
		ArgOfPericenter 68.755089
		MeanAnomaly     173.774058
	}
}

Moon	"Pole"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            3.04297909e-10
	Radius          5.897
	InertiaMoment   0.403264659
	Oblateness      0.055707813
	RotationPeriod  3.74075
	Obliquity       26.617318
	EqAscendNode    137.942306

	AbsMagn         22.3
	SlopeParam      0.24
	Albedo          0.25
	Brightness      2.44
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.411417
		SemiMajorAxisKm 770617.311
		Eccentricity    0.3911554361
		Inclination     3.018944
		AscendingNode   -38.193986
		ArgOfPericenter -106.495001
		MeanAnomaly     115.634899
	}
}

Moon	"Aduryl"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.07724605e-9
	Radius          11.486
	InertiaMoment   0.390352459
	Oblateness      0.090078322
	RotationPeriod  14.88603
	Obliquity       220.695406
	EqAscendNode    -61.453954

	AbsMagn         18.8
	SlopeParam      0.14
	Albedo          0.05
	Brightness      2.3
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.415695
		SemiMajorAxisKm 771115.495
		Eccentricity    0.0379497137
		Inclination     3.916459
		AscendingNode   -53.625534
		ArgOfPericenter 115.483666
		MeanAnomaly     -99.351725
	}
}

Moon	"Svia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.19700062e-9
	Radius          11.444
	InertiaMoment   0.405087528
	Oblateness      0.11061986
	RotationPeriod  8.00511
	Obliquity       259.096411
	EqAscendNode    107.554471

	AbsMagn         17.1
	SlopeParam      0.2
	Albedo          0.08
	Brightness      2.07
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.426245
		SemiMajorAxisKm 772343.224
		Eccentricity    0.3357014957
		Inclination     -3.390328
		AscendingNode   -165.921087
		ArgOfPericenter -132.52791
		MeanAnomaly     164.390281
	}
}

Moon	"Nevia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            7.71132670e-8
	Radius          33.365
	InertiaMoment   0.389151662
	Oblateness      0.322711609
	RotationPeriod  5.0857
	Obliquity       257.266826
	EqAscendNode    -162.797777

	AbsMagn         14.8
	SlopeParam      0.1
	Albedo          0.29
	Brightness      2.08
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.434781
		SemiMajorAxisKm 773335.867
		Eccentricity    0.2130693339
		Inclination     0.015041
		AscendingNode   98.388749
		ArgOfPericenter 61.367577
		MeanAnomaly     -110.239586
	}
}

Moon	"Nuruli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.17837204e-9
	Radius          9.515
	InertiaMoment   0.370665209
	Oblateness      0.260031451
	RotationPeriod  10.48138
	Obliquity       261.873011
	EqAscendNode    163.570356

	AbsMagn         16.5
	SlopeParam      0.2
	Albedo          0.08
	Brightness      2.52
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.446819
		SemiMajorAxisKm 774734.711
		Eccentricity    0.1868989828
		Inclination     3.159661
		AscendingNode   140.136153
		ArgOfPericenter 90.316126
		MeanAnomaly     90.482908
	}
}

Moon	"Canus"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.69221619e-8
	Radius          35.962
	InertiaMoment   0.401828008
	Oblateness      0.277849986
	RotationPeriod  13.56744
	Obliquity       38.839429
	EqAscendNode    -148.77762

	AbsMagn         19.7
	SlopeParam      0.14
	Albedo          0.22
	Brightness      2.12
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.456507
		SemiMajorAxisKm 775859.494
		Eccentricity    0.3637903148
		Inclination     -1.847217
		AscendingNode   -45.512522
		ArgOfPericenter 179.416493
		MeanAnomaly     -82.697627
	}
}

Moon	"Mona"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            4.25899576e-8
	Radius          30.971
	InertiaMoment   0.388670049
	Oblateness      0.240414624
	RotationPeriod  17.87414
	Obliquity       157.579911
	EqAscendNode    177.330061

	AbsMagn         22
	SlopeParam      0.07
	Albedo          0.26
	Brightness      2.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.463915
		SemiMajorAxisKm 776719.097
		Eccentricity    0.2208074772
		Inclination     -3.363929
		AscendingNode   178.64986
		ArgOfPericenter 41.358099
		MeanAnomaly     50.060478
	}
}

Moon	"Ielo"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.13618756e-8
	Radius          32.247
	InertiaMoment   0.387445625
	Oblateness      0.053840221
	RotationPeriod  12.68255
	Obliquity       177.506656
	EqAscendNode    35.770065

	AbsMagn         16.5
	SlopeParam      0.15
	Albedo          0.14
	Brightness      1.38
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.474782
		SemiMajorAxisKm 777979.147
		Eccentricity    0.0576439629
		Inclination     2.263757
		AscendingNode   -145.294568
		ArgOfPericenter -145.172382
		MeanAnomaly     -45.954323
	}
}

Moon	"Alia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            6.36397401e-8
	Radius          30.986
	InertiaMoment   0.408010589
	Oblateness      0.088788764
	RotationPeriod  3.94903
	Obliquity       2.647443
	EqAscendNode    53.530019

	AbsMagn         21.5
	SlopeParam      0.18
	Albedo          0.27
	Brightness      2.13
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.482428
		SemiMajorAxisKm 778865.113
		Eccentricity    0.434359535
		Inclination     -0.746239
		AscendingNode   38.810076
		ArgOfPericenter -122.274033
		MeanAnomaly     -20.674944
	}
}

Moon	"Nachulosi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            3.22037078e-11
	Radius          2.868
	InertiaMoment   0.403128299
	Oblateness      0.265297897
	RotationPeriod  7.11165
	Obliquity       141.571401
	EqAscendNode    1.60373

	AbsMagn         17.7
	SlopeParam      0.16
	Albedo          0.22
	Brightness      2.23
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.484994
		SemiMajorAxisKm 779162.359
		Eccentricity    0.1321516399
		Inclination     1.79995
		AscendingNode   98.905278
		ArgOfPericenter -95.389574
		MeanAnomaly     -133.144777
	}
}

Moon	"Yetisuse"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.04868154e-8
	Radius          26.614
	InertiaMoment   0.389724198
	Oblateness      0.28845417
	RotationPeriod  13.59733
	Obliquity       130.975699
	EqAscendNode    163.4949

	AbsMagn         14.6
	SlopeParam      0.11
	Albedo          0.2
	Brightness      1.74
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.495046
		SemiMajorAxisKm 780326.125
		Eccentricity    0.4416062789
		Inclination     -3.997029
		AscendingNode   33.270506
		ArgOfPericenter -32.725569
		MeanAnomaly     -20.084155
	}
}

Moon	"Toko"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            6.08204323e-8
	Radius          31.516
	InertiaMoment   0.372320402
	Oblateness      0.178587264
	RotationPeriod  11.85951
	Obliquity       340.150346
	EqAscendNode    -157.668415

	AbsMagn         20.5
	SlopeParam      0.08
	Albedo          0.19
	Brightness      2.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.506146
		SemiMajorAxisKm 781610.213
		Eccentricity    0.4102942501
		Inclination     -2.328342
		AscendingNode   -142.408791
		ArgOfPericenter -45.70953
		MeanAnomaly     -70.268094
	}
}

Moon	"Royukoie"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.01389344e-8
	Radius          24.641
	InertiaMoment   0.374912097
	Oblateness      0.196124293
	RotationPeriod  10.55118
	Obliquity       272.44013
	EqAscendNode    156.760948

	AbsMagn         19.4
	SlopeParam      0.07
	Albedo          0.24
	Brightness      2.54
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.511168
		SemiMajorAxisKm 782190.784
		Eccentricity    0.4424211249
		Inclination     -3.926897
		AscendingNode   117.996971
		ArgOfPericenter 50.353226
		MeanAnomaly     112.156562
	}
}

Moon	"Madu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.58339913e-8
	Radius          31.968
	InertiaMoment   0.389833206
	Oblateness      0.079487766
	RotationPeriod  11.10791
	Obliquity       56.845499
	EqAscendNode    43.265645

	AbsMagn         17.9
	SlopeParam      0.16
	Albedo          0.13
	Brightness      1.69
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.515648
		SemiMajorAxisKm 782708.603
		Eccentricity    0.0142756011
		Inclination     -1.245306
		AscendingNode   -163.362339
		ArgOfPericenter 100.77286
		MeanAnomaly     100.896102
	}
}

Moon	"Yuki"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.16970390e-8
	Radius          18.946
	InertiaMoment   0.40728008
	Oblateness      0.274038471
	RotationPeriod  8.97087
	Obliquity       324.004082
	EqAscendNode    166.787208

	AbsMagn         16.2
	SlopeParam      0.06
	Albedo          0.15
	Brightness      2.21
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.520013
		SemiMajorAxisKm 783212.861
		Eccentricity    0.09177742
		Inclination     -3.308924
		AscendingNode   -22.36513
		ArgOfPericenter 175.526379
		MeanAnomaly     81.29344
	}
}

Moon	"Reli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.83388780e-9
	Radius          12.255
	InertiaMoment   0.387590582
	Oblateness      0.229536364
	RotationPeriod  5.67746
	Obliquity       251.485173
	EqAscendNode    -36.480011

	AbsMagn         16.3
	SlopeParam      0.18
	Albedo          0.25
	Brightness      1.61
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.5316
		SemiMajorAxisKm 784550.817
		Eccentricity    0.0771106735
		Inclination     -2.280376
		AscendingNode   82.729155
		ArgOfPericenter 59.998989
		MeanAnomaly     -144.146298
	}
}

Moon	"Luai"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.03817442e-7
	Radius          39.253
	InertiaMoment   0.38964127
	Oblateness      0.340760383
	RotationPeriod  8.25354
	Obliquity       116.538111
	EqAscendNode    -58.642808

	AbsMagn         15
	SlopeParam      0.14
	Albedo          0.15
	Brightness      1.34
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.593004
		SemiMajorAxisKm 791622.157
		Eccentricity    0.0620938349
		Inclination     0.428061
		AscendingNode   -10.306693
		ArgOfPericenter 43.663524
		MeanAnomaly     -41.552783
	}
}

Moon	"Iayila"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.33569271e-8
	Radius          28.973
	InertiaMoment   0.380039082
	Oblateness      0.1927723
	RotationPeriod  6.13
	Obliquity       253.314831
	EqAscendNode    -119.622642

	AbsMagn         14.5
	SlopeParam      0.19
	Albedo          0.18
	Brightness      1.93
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.735393
		SemiMajorAxisKm 917970.665
		Eccentricity    0.3164632309
		Inclination     -3.40903
		AscendingNode   -94.63324
		ArgOfPericenter -92.270476
		MeanAnomaly     -12.298395
	}
}

Moon	"Itethe"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            8.41583211e-8
	Radius          38.286
	InertiaMoment   0.386147891
	Oblateness      0.146888515
	RotationPeriod  16.81688
	Obliquity       151.44303
	EqAscendNode    170.978388

	AbsMagn         17.6
	SlopeParam      0.16
	Albedo          0.14
	Brightness      1.68
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.77513
		SemiMajorAxisKm 922205.83
		Eccentricity    0.1609015512
		Inclination     -0.208194
		AscendingNode   -147.086814
		ArgOfPericenter -64.315131
		MeanAnomaly     -58.612428
	}
}

Moon	"Chuche"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.90539829e-8
	Radius          21.214
	InertiaMoment   0.370948413
	Oblateness      0.156537837
	RotationPeriod  10.94565
	Obliquity       251.035303
	EqAscendNode    113.33013

	AbsMagn         16
	SlopeParam      0.22
	Albedo          0.29
	Brightness      1.35
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.78346
		SemiMajorAxisKm 923092.493
		Eccentricity    0.3286515837
		Inclination     0.856775
		AscendingNode   -95.594052
		ArgOfPericenter -174.80063
		MeanAnomaly     78.640281
	}
}

Moon	"Chavia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.22859636e-9
	Radius          18.552
	InertiaMoment   0.382636042
	Oblateness      0.09736295
	RotationPeriod  17.22497
	Obliquity       177.089651
	EqAscendNode    -177.259476

	AbsMagn         16.2
	SlopeParam      0.11
	Albedo          0.31
	Brightness      2.65
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.788495
		SemiMajorAxisKm 923628.098
		Eccentricity    0.0513721035
		Inclination     3.71127
		AscendingNode   162.563222
		ArgOfPericenter 37.866036
		MeanAnomaly     151.357761
	}
}

Moon	"Chake"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.05628980e-10
	Radius          7.712
	InertiaMoment   0.375494436
	Oblateness      0.257246938
	RotationPeriod  14.78733
	Obliquity       244.393588
	EqAscendNode    -158.815357

	AbsMagn         18.2
	SlopeParam      0.18
	Albedo          0.22
	Brightness      1.25
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.800967
		SemiMajorAxisKm 924954.396
		Eccentricity    0.1501558073
		Inclination     -3.987113
		AscendingNode   -133.402633
		ArgOfPericenter -164.348916
		MeanAnomaly     -62.557362
	}
}

Moon	"Tasura"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.37095474e-8
	Radius          30.428
	InertiaMoment   0.393808541
	Oblateness      0.220032141
	RotationPeriod  3.69972
	Obliquity       180.847366
	EqAscendNode    142.838507

	AbsMagn         17.2
	SlopeParam      0.17
	Albedo          0.25
	Brightness      1.42
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.820082
		SemiMajorAxisKm 926985.131
		Eccentricity    0.174948496
		Inclination     -0.796528
		AscendingNode   160.341854
		ArgOfPericenter -65.431926
		MeanAnomaly     -88.82358
	}
}

Moon	"Molvia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            4.36980004e-13
	Radius          0.593
	InertiaMoment   0.370538478
	Oblateness      0.183663375
	RotationPeriod  12.88786
	Obliquity       137.401596
	EqAscendNode    -29.976112

	AbsMagn         17.3
	SlopeParam      0.13
	Albedo          0.18
	Brightness      2.02
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.822667
		SemiMajorAxisKm 927259.602
		Eccentricity    0.0369705941
		Inclination     -1.819661
		AscendingNode   9.732142
		ArgOfPericenter -152.894875
		MeanAnomaly     -131.833722
	}
}

Moon	"Poli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.10226906e-12
	Radius          0.986
	InertiaMoment   0.395733245
	Oblateness      0.038558047
	RotationPeriod  16.94196
	Obliquity       301.521737
	EqAscendNode    -1.15895

	AbsMagn         17.9
	SlopeParam      0.25
	Albedo          0.26
	Brightness      1.38
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.83362
		SemiMajorAxisKm 928422.064
		Eccentricity    0.37392978
		Inclination     -3.975379
		AscendingNode   123.517526
		ArgOfPericenter 166.079252
		MeanAnomaly     -79.9485
	}
}

Moon	"Tanuko"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.18774617e-8
	Radius          33.499
	InertiaMoment   0.388229954
	Oblateness      0.029622544
	RotationPeriod  14.26337
	Obliquity       344.073678
	EqAscendNode    -119.279701

	AbsMagn         15.3
	SlopeParam      0.21
	Albedo          0.25
	Brightness      1.49
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.835767
		SemiMajorAxisKm 928649.883
		Eccentricity    0.2412880987
		Inclination     0.873675
		AscendingNode   -77.081373
		ArgOfPericenter 59.040257
		MeanAnomaly     -72.656638
	}
}

Moon	"Caduscl"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.65475556e-10
	Radius          4.766
	InertiaMoment   0.37696718
	Oblateness      0.262901767
	RotationPeriod  3.01656
	Obliquity       130.645389
	EqAscendNode    -106.754623

	AbsMagn         14.5
	SlopeParam      0.09
	Albedo          0.25
	Brightness      2.64
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.845987
		SemiMajorAxisKm 929733.771
		Eccentricity    0.0067960825
		Inclination     1.232274
		AscendingNode   114.398313
		ArgOfPericenter -121.214504
		MeanAnomaly     -130.392877
	}
}

Moon	"Eiiayaka"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            2.77958148e-8
	Radius          24.436
	InertiaMoment   0.400416921
	Oblateness      0.195721787
	RotationPeriod  13.41951
	Obliquity       322.011292
	EqAscendNode    -64.500241

	AbsMagn         17.8
	SlopeParam      0.12
	Albedo          0.08
	Brightness      1.79
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.856032
		SemiMajorAxisKm 930798.48
		Eccentricity    0.3526881824
		Inclination     -3.535396
		AscendingNode   -1.650038
		ArgOfPericenter -11.951808
		MeanAnomaly     70.334956
	}
}

Moon	"Rolachi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.41581997e-8
	Radius          22.972
	InertiaMoment   0.387728843
	Oblateness      0.083225987
	RotationPeriod  2.08633
	Obliquity       117.579673
	EqAscendNode    77.591138

	AbsMagn         15.7
	SlopeParam      0.19
	Albedo          0.18
	Brightness      1.41
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.863475
		SemiMajorAxisKm 931586.995
		Eccentricity    0.2134208747
		Inclination     -1.407034
		AscendingNode   -177.312975
		ArgOfPericenter -55.86191
		MeanAnomaly     41.302974
	}
}

Moon	"Suseiachu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            7.87245374e-8
	Radius          36.155
	InertiaMoment   0.403786988
	Oblateness      0.349521331
	RotationPeriod  11.98534
	Obliquity       285.743381
	EqAscendNode    -106.393831

	AbsMagn         17.5
	SlopeParam      0.09
	Albedo          0.09
	Brightness      2.13
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.871515
		SemiMajorAxisKm 932438.452
		Eccentricity    0.3178742141
		Inclination     1.109575
		AscendingNode   -119.459933
		ArgOfPericenter -35.232916
		MeanAnomaly     -173.174111
	}
}

Moon	"Kitayle"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.18195569e-7
	Radius          37.563
	InertiaMoment   0.391367431
	Oblateness      0.287221218
	RotationPeriod  15.66259
	Obliquity       254.572246
	EqAscendNode    -170.143957

	AbsMagn         16.7
	SlopeParam      0.05
	Albedo          0.26
	Brightness      2.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.878548
		SemiMajorAxisKm 933182.863
		Eccentricity    0.2030374773
		Inclination     2.400531
		AscendingNode   -3.272343
		ArgOfPericenter -43.024872
		MeanAnomaly     -17.997627
	}
}

Moon	"Yenaei"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.67266883e-8
	Radius          28.207
	InertiaMoment   0.372621927
	Oblateness      0.243333776
	RotationPeriod  9.47211
	Obliquity       214.184073
	EqAscendNode    -57.253132

	AbsMagn         18.9
	SlopeParam      0.07
	Albedo          0.23
	Brightness      1.41
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.882756
		SemiMajorAxisKm 933628.182
		Eccentricity    0.2600097136
		Inclination     2.168589
		AscendingNode   97.579022
		ArgOfPericenter 158.674789
		MeanAnomaly     173.899186
	}
}

Moon	"Imryl"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            7.09818326e-9
	Radius          17.572
	InertiaMoment   0.393076135
	Oblateness      0.148856177
	RotationPeriod  17.14596
	Obliquity       84.738617
	EqAscendNode    -169.191975

	AbsMagn         16.5
	SlopeParam      0.1
	Albedo          0.13
	Brightness      1.42
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.947376
		SemiMajorAxisKm 940452.686
		Eccentricity    0.066380116
		Inclination     -2.993805
		AscendingNode   -16.449982
		ArgOfPericenter 109.446816
		MeanAnomaly     -39.141562
	}
}

Moon	"Keviiik"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.11901623e-8
	Radius          17.635
	InertiaMoment   0.397920162
	Oblateness      0.339053643
	RotationPeriod  13.66553
	Obliquity       90.73934
	EqAscendNode    -171.995314

	AbsMagn         18.4
	SlopeParam      0.2
	Albedo          0.14
	Brightness      1.76
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.955519
		SemiMajorAxisKm 941310.952
		Eccentricity    0.3643142909
		Inclination     0.624906
		AscendingNode   -138.379963
		ArgOfPericenter -34.452022
		MeanAnomaly     148.654617
	}
}

Moon	"Rioasuni"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.46485852e-8
	Radius          30.875
	InertiaMoment   0.384025509
	Oblateness      0.344284642
	RotationPeriod  15.81721
	Obliquity       235.794835
	EqAscendNode    -126.633377

	AbsMagn         14.6
	SlopeParam      0.24
	Albedo          0.33
	Brightness      2.7
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.493794
		SemiMajorAxisKm 1.37322508e+6
		Eccentricity    0.2896571879
		Inclination     1.792863
		AscendingNode   -66.971251
		ArgOfPericenter -102.12263
		MeanAnomaly     -167.289757
	}
}

Moon	"Likuke"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            6.05443887e-9
	Radius          14.596
	InertiaMoment   0.389553286
	Oblateness      0.117207732
	RotationPeriod  13.63913
	Obliquity       86.23127
	EqAscendNode    91.285038

	AbsMagn         19.5
	SlopeParam      0.05
	Albedo          0.16
	Brightness      1.97
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.532356
		SemiMajorAxisKm 1.37658717e+6
		Eccentricity    0.3234735943
		Inclination     1.674124
		AscendingNode   -144.924086
		ArgOfPericenter 165.760214
		MeanAnomaly     7.389542
	}
}

Moon	"Slia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.29789187e-8
	Radius          23.007
	InertiaMoment   0.389087484
	Oblateness      0.22383394
	RotationPeriod  13.94225
	Obliquity       203.116499
	EqAscendNode    -146.451679

	AbsMagn         15.7
	SlopeParam      0.21
	Albedo          0.19
	Brightness      2.54
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.659386
		SemiMajorAxisKm 1.38763371e+6
		Eccentricity    0.0561680469
		Inclination     2.314278
		AscendingNode   139.989562
		ArgOfPericenter -93.365366
		MeanAnomaly     -155.404341
	}
}

Moon	"Chareye"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.80525576e-8
	Radius          24.511
	InertiaMoment   0.392295008
	Oblateness      0.047580357
	RotationPeriod  2.34965
	Obliquity       187.259715
	EqAscendNode    -37.893775

	AbsMagn         20.5
	SlopeParam      0.1
	Albedo          0.13
	Brightness      1.67
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.712652
		SemiMajorAxisKm 1.39225261e+6
		Eccentricity    0.0771559833
		Inclination     -2.78856
		AscendingNode   152.068511
		ArgOfPericenter 47.638953
		MeanAnomaly     -179.69439
	}
}

Moon	"Kelelu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            7.90965204e-9
	Radius          16.806
	InertiaMoment   0.398703393
	Oblateness      0.186378076
	RotationPeriod  10.16581
	Obliquity       59.426477
	EqAscendNode    132.841112

	AbsMagn         21.8
	SlopeParam      0.24
	Albedo          0.32
	Brightness      2.18
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.738659
		SemiMajorAxisKm 1.39450501e+6
		Eccentricity    0.1270952025
		Inclination     -3.705901
		AscendingNode   -106.919675
		ArgOfPericenter -163.215097
		MeanAnomaly     6.604476
	}
}

Moon	"Nuscadu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.02169157e-7
	Radius          36.247
	InertiaMoment   0.387646544
	Oblateness      0.199673023
	RotationPeriod  7.69146
	Obliquity       249.706594
	EqAscendNode    72.753525

	AbsMagn         16.1
	SlopeParam      0.1
	Albedo          0.07
	Brightness      2.94
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.772946
		SemiMajorAxisKm 1.39747170e+6
		Eccentricity    0.3091936179
		Inclination     2.292695
		AscendingNode   97.136875
		ArgOfPericenter 21.888104
		MeanAnomaly     22.984045
	}
}

Moon	"Chuieli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            6.80202970e-10
	Radius          6.827
	InertiaMoment   0.397981325
	Oblateness      0.185431034
	RotationPeriod  17.49458
	Obliquity       209.065962
	EqAscendNode    146.69204

	AbsMagn         21
	SlopeParam      0.12
	Albedo          0.19
	Brightness      1.72
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.778347
		SemiMajorAxisKm 1.39793878e+6
		Eccentricity    0.0342459339
		Inclination     1.328326
		AscendingNode   -161.196739
		ArgOfPericenter -113.412073
		MeanAnomaly     -142.061572
	}
}

Moon	"Lulitoti"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.86950129e-8
	Radius          23.248
	InertiaMoment   0.395580253
	Oblateness      0.25414064
	RotationPeriod  2.40884
	Obliquity       158.830091
	EqAscendNode    101.572081

	AbsMagn         19.2
	SlopeParam      0.24
	Albedo          0.23
	Brightness      1.8
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.817475
		SemiMajorAxisKm 1.40132000e+6
		Eccentricity    0.3106005406
		Inclination     -2.733572
		AscendingNode   140.972933
		ArgOfPericenter 1.421891
		MeanAnomaly     -0.559933
	}
}

Moon	"Riko"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.12920830e-7
	Radius          37.922
	InertiaMoment   0.375194106
	Oblateness      0.058136205
	RotationPeriod  5.40118
	Obliquity       40.85546
	EqAscendNode    -135.841966

	AbsMagn         18.4
	SlopeParam      0.14
	Albedo          0.15
	Brightness      2.33
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.837401
		SemiMajorAxisKm 1.40304024e+6
		Eccentricity    0.3067703378
		Inclination     -0.398808
		AscendingNode   -142.239012
		ArgOfPericenter -13.808125
		MeanAnomaly     105.668234
	}
}

Moon	"Tiathe"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.42975644e-8
	Radius          22.673
	InertiaMoment   0.376474969
	Oblateness      0.022896025
	RotationPeriod  10.36597
	Obliquity       65.733228
	EqAscendNode    20.689417

	AbsMagn         14.9
	SlopeParam      0.11
	Albedo          0.2
	Brightness      2.56
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.846866
		SemiMajorAxisKm 1.40385703e+6
		Eccentricity    0.201286544
		Inclination     2.256029
		AscendingNode   -148.051429
		ArgOfPericenter 81.391801
		MeanAnomaly     23.468806
	}
}

Moon	"Kuoayuchi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.23606606e-9
	Radius          11.485
	InertiaMoment   0.408881149
	Oblateness      0.053675092
	RotationPeriod  7.05887
	Obliquity       301.718511
	EqAscendNode    -88.750186

	AbsMagn         22.4
	SlopeParam      0.12
	Albedo          0.23
	Brightness      2.19
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.852705
		SemiMajorAxisKm 1.40436082e+6
		Eccentricity    0.3487668739
		Inclination     -2.875186
		AscendingNode   -152.121874
		ArgOfPericenter 121.590125
		MeanAnomaly     24.188777
	}
}

Moon	"Yarayi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.91493171e-8
	Radius          32.278
	InertiaMoment   0.400667257
	Oblateness      0.18634399
	RotationPeriod  11.64317
	Obliquity       271.872003
	EqAscendNode    81.236584

	AbsMagn         19.5
	SlopeParam      0.13
	Albedo          0.13
	Brightness      1.47
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.919859
		SemiMajorAxisKm 1.41014812e+6
		Eccentricity    0.288958856
		Inclination     -0.729613
		AscendingNode   109.26654
		ArgOfPericenter 153.341699
		MeanAnomaly     177.715445
	}
}

Moon	"Iaylne"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.32639122e-8
	Radius          36.24
	InertiaMoment   0.399919891
	Oblateness      0.034533493
	RotationPeriod  10.1315
	Obliquity       43.401933
	EqAscendNode    132.163832

	AbsMagn         21.5
	SlopeParam      0.2
	Albedo          0.25
	Brightness      2.44
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.928785
		SemiMajorAxisKm 1.41091646e+6
		Eccentricity    0.0347913826
		Inclination     -1.469775
		AscendingNode   -123.970322
		ArgOfPericenter -112.843779
		MeanAnomaly     40.752946
	}
}
