Planet	"Cailus"
{
	ParentBody     "Hope"
	Class          "Jupiter"
	Mass            312.56601
	Radius          69985.7969
	InertiaMoment   0.221257299
	Oblateness      0.034351144
	RotationPeriod  9.28961041
	RotationOffset  -321.526714
	RotationEpoch   1451545
	Obliquity       13.7404579
	EqAscendNode    35.7251904

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_II.cfg"
		SurfStyle       0.193
		Randomize      (0.607, -0.904, 0.247)
		detailScale     256
		tropicLatitude  0.0949
		icecapLatitude  0.995
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
		stripeZones     4.19
		stripeFluct     0.357
		stripeTwist     12
		cycloneMagn     17.8
		cycloneFreq     1.01
		cycloneDensity  0.233
		cycloneOctaves  5
		cycloneMagn2     0.639
		cycloneFreq2     0.432
		cycloneLatitude2 0.892
		cycloneOctaves2  4
		BumpHeight      6.63
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
		Height          34.3
		Velocity        -227
		BumpHeight      13.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.12
		mainOctaves     12
		Coverage        0.447
		stripeZones     4.19
		stripeFluct     0.357
		stripeTwist     12
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          144.722626
		Density         0.00545164431
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.00358
		Saturation      1.17

		Composition
		{
			H2        	92.1
			He        	7.41
			CH4       	0.38
			N2        	0.0407
			NH3       	0.0316
			O2        	0.00791
			C2H2      	0.0034
			C2H4      	0.00158
			Ne        	0.00115
			Ar        	0.000933
			C2H6      	0.000711
			C3H8      	0.00039
			C8H18     	0.000322
			H2O       	3.32e-06
			H2S       	2.09e-06
			CO2       	1.97e-06
			Kr        	4.35e-07
			Xe        	4.11e-08
			SO2       	1.01e-08
			CO        	3.33e-10
			Cl2       	3.21e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  368
	}

	Aurora
	{
		Height         203
		NorthLat       82.5
		NorthLon       122
		NorthRadius    1.79e+04
		NorthWidth     8.97e+03
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 76.4
		NorthMoveSpeed 0.981
		NorthParticles 10000
		SouthLat       -82.4
		SouthLon       -62.6
		SouthRadius    2.29e+04
		SouthWidth     1.29e+04
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 75.8
		SouthMoveSpeed 1.09
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
		Period          14.7535576
		SemiMajorAxis   6.06
		Eccentricity    0.149552395
		Inclination     0
		AscendingNode   57.7844348
		ArgOfPericenter 257.768765
		MeanAnomaly     287.502448
	}
}

Moon	"Charayl"
{
	ParentBody     "Cailus"
	Class          "Aquaria"
	Mass            0.000438077492
	Radius          651.082703
	InertiaMoment   0.39863947
	Oblateness      0.0136431418
	Obliquity       0.0327196321
	EqAscendNode    -144.786967
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.788
		Randomize      (0.875, 0.347, 0.192)
		colorDistMagn   0.0598
		colorDistFreq   69.3
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.257
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
		humidity        0.205
		heightTempGrad  0.625
		beachWidth      0.000552
		tropicWidth     0.07
		mainFreq        1.72
		venusFreq       1.07
		venusMagn       0
		mareFreq        0.0283
		mareDensity     0.138
		terraceProb     0.299
		erosion         0
		montesMagn      0.0701
		montesFreq      41.1
		montesSpiky     0.936
		montesFraction  0.268
		dunesMagn       0.0337
		dunesFreq       6.8
		dunesFraction   0.438
		hillsMagn       0.122
		hillsFreq       68.7
		hillsFraction   0.109
		hills2Fraction  0.225
		riversMagn      0
		riversFreq      2.69
		riversSin       7.7
		riftsMagn       0
		riftsFreq       3.78
		riftsSin        4.78
		canyonsMagn     0.453
		canyonsFreq     0.229
		canyonsFraction 0
		cracksMagn      0.0571
		cracksFreq      0.295
		cracksOctaves   0
		craterMagn      0.525
		craterFreq      2.3
		craterDensity   0.988
		craterOctaves   17
		craterRayedFactor 0.104
		volcanoMagn     0.17
		volcanoFreq     0.655
		volcanoDensity  0.254
		volcanoOctaves  3
		volcanoActivity 0.447
		volcanoFlows    0.287
		volcanoRadius   0.127
		volcanoTemp     378
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
		PeriodDays      0.872902974
		SemiMajorAxis	0.00753
		Eccentricity    0.000260206178
		Inclination     0.0327196321
		AscendingNode   -144.786967
		ArgOfPericenter -31.22762
		MeanAnomaly     -161.899879
	}
}

Moon	"Kiatiate"
{
	ParentBody     "Cailus"
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
		PeriodDays	2.81
		SemiMajorAxis   0.01512
		Eccentricity    0.4586428
		Inclination     -2.18187
		AscendingNode   261.45418
		ArgOfPericenter 126.33098
		MeanAnomaly     67.34618
	}
}

Moon	"Monacle"
{
	ParentBody     "Cailus"
	Class          "Terra"
	Mass            0.000816211104
	Radius          620.494019
	InertiaMoment   0.398436159
	Obliquity       -0.366521065
	EqAscendNode    142.909713
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.567 0.565 0.562)

	Surface
	{
		Preset         "terra_airless_moon.cfg"
		SurfStyle       0.777
		Randomize      (0.257, -0.563, -0.282)
		colorDistMagn   0.0617
		colorDistFreq   79.6
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.225
		snowLevel       2
		tropicLatitude  0.278
		icecapLatitude  2
		icecapHeight    0.473
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.112
		heightTempGrad  0.625
		beachWidth      0.00106
		tropicWidth     0.07
		mainFreq        1.85
		venusFreq       1.11
		venusMagn       0
		mareFreq        0.014
		mareDensity     0.115
		terraceProb     0.317
		erosion         0
		montesMagn      0.0508
		montesFreq      24.3
		montesSpiky     0.988
		montesFraction  0.282
		dunesMagn       0.0532
		dunesFreq       5.2
		dunesFraction   0.282
		hillsMagn       0.115
		hillsFreq       68.3
		hillsFraction   0.918
		hills2Fraction  0
		riversMagn      69.4
		riversFreq      2.5
		riversSin       5.58
		riftsMagn       58
		riftsFreq       2.27
		riftsSin        7.07
		canyonsMagn     0.574
		canyonsFreq     0.208
		canyonsFraction 0.334
		cracksMagn      0.0696
		cracksFreq      0.336
		cracksOctaves   0
		craterMagn      0.681
		craterFreq      1.86
		craterDensity   0.871
		craterOctaves   17
		craterRayedFactor 0.205
		volcanoMagn     0.181
		volcanoFreq     0.603
		volcanoDensity  0.208
		volcanoOctaves  3
		volcanoActivity 0.349
		volcanoFlows    0.168
		volcanoRadius   0.147
		volcanoTemp     997
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
		PeriodDays      2.42674207
		SemiMajorAxis	0.0151
		Eccentricity    0.00198833484
		Inclination     -0.366521065
		AscendingNode   142.909713
		ArgOfPericenter -115.576395
		MeanAnomaly     35.7382914
	}
}

Moon	"Kiethe"
{
	ParentBody     "Cailus"
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
		PeriodDays      0.13339
		SemiMajorAxis	0.0005
		Eccentricity    0.0192017898
		Inclination     0.0762410075
		AscendingNode   -29.0579609
		ArgOfPericenter -152.351352
		MeanAnomaly     -177.369446
	}
}

Moon	"Polia"
{
	ParentBody     "Cailus"
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
		PeriodDays	2.81
		SemiMajorAxis   0.01512
		Eccentricity    0.2586428
		Inclination     2.18187
		AscendingNode   261.45418
		ArgOfPericenter 126.33098
		MeanAnomaly     67.34618
	}
}

