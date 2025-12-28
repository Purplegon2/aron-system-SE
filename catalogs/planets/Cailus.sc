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
		Model          "Earth"
		Height          2360.17163
		Density         0.00544297788
		Pressure        1
		Bright          5.496
		Opacity         0.229
		SkyLight        1
		Hue             -0.01145
		Saturation      2

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
		SemiMajorAxis	0.0015
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

Moon	"Alneim"
{
	ParentBody     "Cailus"
	Class          "Terra"
	Mass            0.00171033584
	Radius          912.919983
	InertiaMoment   0.399339557
	Oblateness      0.0206106864
	Obliquity       -1.07209156
	EqAscendNode    -123.084229
	TidalLocked     true

	AlbedoBond      0.313
	AlbedoGeom      0.36
	Brightness      0.84
	BrightnessReal  1.3

	Surface
	{
		Preset         "terra_airless_ganymede.cfg"
		SurfStyle       0.151
		Randomize      (0.596, 0.923, -0.368)
		colorDistMagn   0.0578
		colorDistFreq   120
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.222
		snowLevel       2
		tropicLatitude  0.223
		icecapLatitude  0.829
		icecapHeight    0.0974
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -0.817
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.339
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        2
		venusFreq       0.405
		venusMagn       0
		mareFreq        0.226
		mareDensity     0.13
		terraceProb     0.449
		erosion         0
		montesMagn      0.0724
		montesFreq      36.4
		montesSpiky     0.892
		montesFraction  0.619
		dunesMagn       0.0464
		dunesFreq       9.14
		dunesFraction   0.46
		hillsMagn       0.113
		hillsFreq       124
		hillsFraction   0.11
		hills2Fraction  0
		riversMagn      57.3
		riversFreq      2.15
		riversSin       0
		riftsMagn       61.3
		riftsFreq       4.5
		riftsSin        7.28
		canyonsMagn     0.422
		canyonsFreq     0.366
		canyonsFraction 0
		cracksMagn      0.382
		cracksFreq      2.52
		cracksOctaves   0
		craterMagn      0.305
		craterFreq      2.29
		craterDensity   0.855
		craterOctaves   18
		craterRayedFactor 0.534
		volcanoMagn     0.196
		volcanoFreq     0.658
		volcanoDensity  0.273
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.156
		volcanoTemp     0
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
		Gamma           1.02
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.865 0.954 0.988)
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
		PeriodDays      5.94380999
		SemiMajorAxisKm 356714.894
		Eccentricity    0.0193737529
		Inclination     -1.07209156
		AscendingNode   -123.084229
		ArgOfPericenter 72.1953086
		MeanAnomaly     28.5099636
	}
}

Moon	"Kiyaaile"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.88023587e-8
	Radius          24.725
	InertiaMoment   0.38660661
	Oblateness      0.22854173
	RotationPeriod  8.63175
	Obliquity       61.684842
	EqAscendNode    160.846631

	AbsMagn         16.1
	SlopeParam      0.17
	Albedo          0.21
	Brightness      2.99
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.096731
		SemiMajorAxisKm 1.82646700e+6
		Eccentricity    0.101722926
		Inclination     -1.178918
		AscendingNode   -161.782605
		ArgOfPericenter 16.212089
		MeanAnomaly     119.647425
	}
}

Moon	"Chiro"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.33451904e-8
	Radius          27.425
	InertiaMoment   0.399134761
	Oblateness      0.321139924
	RotationPeriod  7.45224
	Obliquity       348.232471
	EqAscendNode    79.70166

	AbsMagn         20.8
	SlopeParam      0.1
	Albedo          0.28
	Brightness      2.14
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.166777
		SemiMajorAxisKm 1.83176186e+6
		Eccentricity    0.2969366873
		Inclination     -3.471773
		AscendingNode   44.131305
		ArgOfPericenter -140.02106
		MeanAnomaly     109.33293
	}
}

Moon	"Keneim"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.22841003e-8
	Radius          20.053
	InertiaMoment   0.388805167
	Oblateness      0.341808263
	RotationPeriod  7.27821
	Obliquity       275.934488
	EqAscendNode    -165.835979

	AbsMagn         15.5
	SlopeParam      0.1
	Albedo          0.15
	Brightness      1.64
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.184398
		SemiMajorAxisKm 1.83309263e+6
		Eccentricity    0.2049055739
		Inclination     -3.306425
		AscendingNode   -26.596914
		ArgOfPericenter -111.459483
		MeanAnomaly     -42.480984
	}
}

Moon	"Kiaylia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            5.29235842e-8
	Radius          29.224
	InertiaMoment   0.39810614
	Oblateness      0.252937996
	RotationPeriod  7.87029
	Obliquity       104.24774
	EqAscendNode    141.090876

	AbsMagn         21.4
	SlopeParam      0.12
	Albedo          0.2
	Brightness      2.98
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.200337
		SemiMajorAxisKm 1.83429597e+6
		Eccentricity    0.3767230552
		Inclination     -1.870695
		AscendingNode   147.01608
		ArgOfPericenter -111.879831
		MeanAnomaly     157.253756
	}
}

Moon	"Tuniyu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.42973032e-8
	Radius          25.759
	InertiaMoment   0.378279095
	Oblateness      0.080080407
	RotationPeriod  13.79891
	Obliquity       77.400836
	EqAscendNode    -27.768571

	AbsMagn         16.3
	SlopeParam      0.13
	Albedo          0.07
	Brightness      2.7
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.21584
		SemiMajorAxisKm 1.83546595e+6
		Eccentricity    0.0028869387
		Inclination     1.316261
		AscendingNode   116.719041
		ArgOfPericenter -160.147621
		MeanAnomaly     -112.429386
	}
}

Moon	"Mathadu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.08428920e-12
	Radius          1.653
	InertiaMoment   0.380797086
	Oblateness      0.34464594
	RotationPeriod  11.83318
	Obliquity       25.455791
	EqAscendNode    121.207821

	AbsMagn         19.7
	SlopeParam      0.07
	Albedo          0.16
	Brightness      2.86
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.228655
		SemiMajorAxisKm 1.83643290e+6
		Eccentricity    0.2182707938
		Inclination     0.744055
		AscendingNode   95.085927
		ArgOfPericenter -77.045101
		MeanAnomaly     84.74385
	}
}

Moon	"Kimlia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.52733719e-8
	Radius          32.695
	InertiaMoment   0.389238759
	Oblateness      0.277675653
	RotationPeriod  16.22504
	Obliquity       157.941062
	EqAscendNode    -151.742666

	AbsMagn         17.5
	SlopeParam      0.09
	Albedo          0.15
	Brightness      1.48
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.253892
		SemiMajorAxisKm 1.83833625e+6
		Eccentricity    0.2120520657
		Inclination     3.518823
		AscendingNode   -179.797352
		ArgOfPericenter 121.681578
		MeanAnomaly     170.782896
	}
}

Moon	"Keiale"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.89560666e-8
	Radius          31.702
	InertiaMoment   0.392190706
	Oblateness      0.056490856
	RotationPeriod  3.29126
	Obliquity       223.652616
	EqAscendNode    -73.86443

	AbsMagn         20.7
	SlopeParam      0.1
	Albedo          0.18
	Brightness      2.87
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.266588
		SemiMajorAxisKm 1.83929342e+6
		Eccentricity    0.1198413748
		Inclination     1.410166
		AscendingNode   77.24524
		ArgOfPericenter -67.884585
		MeanAnomaly     149.278731
	}
}

Moon	"Uilutite"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            9.53801857e-8
	Radius          109.891
	InertiaMoment   0.393010936
	Oblateness      0.026620469
	RotationPeriod  5.09492
	Obliquity       289.588635
	EqAscendNode    110.264674

	AbsMagn         20.6
	SlopeParam      0.11
	Albedo          0.19
	Brightness      1.33
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.279563
		SemiMajorAxisKm 1.84027133e+6
		Eccentricity    0.1635186611
		Inclination     1.627738
		AscendingNode   -52.27092
		ArgOfPericenter -151.907375
		MeanAnomaly     -2.110397
	}
}

Moon	"Aduvia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.29963309e-13
	Radius          0.664
	InertiaMoment   0.370746933
	Oblateness      0.347269169
	RotationPeriod  5.98782
	Obliquity       296.517945
	EqAscendNode    -139.642132

	AbsMagn         19.8
	SlopeParam      0.16
	Albedo          0.15
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.305809
		SemiMajorAxisKm 1.84224877e+6
		Eccentricity    0.1331525847
		Inclination     -2.767823
		AscendingNode   102.391901
		ArgOfPericenter 105.678086
		MeanAnomaly     -82.308542
	}
}

Moon	"Uiti"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.94163655e-9
	Radius          10.758
	InertiaMoment   0.401673816
	Oblateness      0.249369406
	RotationPeriod  4.09631
	Obliquity       91.852257
	EqAscendNode    45.727677

	AbsMagn         16.3
	SlopeParam      0.08
	Albedo          0.18
	Brightness      2.83
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.38287
		SemiMajorAxisKm 1.84804850e+6
		Eccentricity    0.2418465239
		Inclination     3.248946
		AscendingNode   -145.266024
		ArgOfPericenter 140.137216
		MeanAnomaly     -4.991658
	}
}

Moon	"Netochi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.00447067e-7
	Radius          37.316
	InertiaMoment   0.379499416
	Oblateness      0.070310448
	RotationPeriod  9.85321
	Obliquity       306.322875
	EqAscendNode    -12.476257

	AbsMagn         19.4
	SlopeParam      0.11
	Albedo          0.1
	Brightness      2.08
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.407383
		SemiMajorAxisKm 1.84989148e+6
		Eccentricity    0.4357700072
		Inclination     -1.271686
		AscendingNode   -90.274994
		ArgOfPericenter 67.165446
		MeanAnomaly     99.901495
	}
}

Moon	"Iasu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            6.89402079e-8
	Radius          212.048
	InertiaMoment   0.40928245
	Oblateness      0.081014144
	RotationPeriod  3.82971
	Obliquity       32.586413
	EqAscendNode    90.996385

	AbsMagn         17.4
	SlopeParam      0.21
	Albedo          0.15
	Brightness      2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.422867
		SemiMajorAxisKm 1.85105516e+6
		Eccentricity    0.0453586362
		Inclination     3.07209
		AscendingNode   152.858103
		ArgOfPericenter -32.084458
		MeanAnomaly     -62.4413
	}
}

Moon	"Kicho"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.19544021e-8
	Radius          32.465
	InertiaMoment   0.370458605
	Oblateness      0.288336293
	RotationPeriod  17.95089
	Obliquity       347.397255
	EqAscendNode    105.335451

	AbsMagn         17.5
	SlopeParam      0.1
	Albedo          0.13
	Brightness      1.5
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.447305
		SemiMajorAxisKm 1.85289102e+6
		Eccentricity    0.3739936526
		Inclination     2.758571
		AscendingNode   -77.604056
		ArgOfPericenter -89.156359
		MeanAnomaly     -104.791498
	}
}

Moon	"Rnatiai"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.07653227e-7
	Radius          39.93
	InertiaMoment   0.370439236
	Oblateness      0.050784524
	RotationPeriod  3.57851
	Obliquity       76.194573
	EqAscendNode    -116.475957

	AbsMagn         17.8
	SlopeParam      0.06
	Albedo          0.33
	Brightness      1.84
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.460378
		SemiMajorAxisKm 1.85387271e+6
		Eccentricity    0.000146414
		Inclination     1.924126
		AscendingNode   -151.991352
		ArgOfPericenter 6.298131
		MeanAnomaly     117.565033
	}
}

Moon	"Aiyuyioa"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.55536317e-10
	Radius          7.221
	InertiaMoment   0.396410113
	Oblateness      0.270872813
	RotationPeriod  7.22183
	Obliquity       80.814358
	EqAscendNode    119.394498

	AbsMagn         17.5
	SlopeParam      0.06
	Albedo          0.2
	Brightness      1.73
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.466508
		SemiMajorAxisKm 1.85433290e+6
		Eccentricity    0.4007267137
		Inclination     -3.008255
		AscendingNode   145.481586
		ArgOfPericenter 21.453447
		MeanAnomaly     -149.140357
	}
}

Moon	"Chiso"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.71642690e-8
	Radius          22.314
	InertiaMoment   0.402177464
	Oblateness      0.124187145
	RotationPeriod  9.8338
	Obliquity       39.477956
	EqAscendNode    -110.082023

	AbsMagn         19.6
	SlopeParam      0.14
	Albedo          0.16
	Brightness      1.21
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.481633
		SemiMajorAxisKm 1.85546829e+6
		Eccentricity    0.0510670739
		Inclination     1.368706
		AscendingNode   -167.101616
		ArgOfPericenter -117.912578
		MeanAnomaly     159.097026
	}
}

Moon	"Sayu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            6.71010528e-8
	Radius          35.601
	InertiaMoment   0.38450608
	Oblateness      0.187770742
	RotationPeriod  13.71771
	Obliquity       169.175553
	EqAscendNode    -115.215639

	AbsMagn         14.8
	SlopeParam      0.08
	Albedo          0.2
	Brightness      1.86
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.485725
		SemiMajorAxisKm 1.85577537e+6
		Eccentricity    0.3581881377
		Inclination     2.690425
		AscendingNode   81.004161
		ArgOfPericenter -159.331345
		MeanAnomaly     -7.158423
	}
}

Moon	"Rina"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.55142392e-9
	Radius          9.05
	InertiaMoment   0.389063698
	Oblateness      0.321999446
	RotationPeriod  15.71096
	Obliquity       263.785693
	EqAscendNode    -120.994613

	AbsMagn         21.3
	SlopeParam      0.25
	Albedo          0.34
	Brightness      1.57
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.509317
		SemiMajorAxisKm 1.85754542e+6
		Eccentricity    0.1226329879
		Inclination     -0.259459
		AscendingNode   147.717982
		ArgOfPericenter 133.495183
		MeanAnomaly     141.020951
	}
}

Moon	"Nika"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            7.94103250e-8
	Radius          34.606
	InertiaMoment   0.377801236
	Oblateness      0.087935563
	RotationPeriod  3.27141
	Obliquity       278.129466
	EqAscendNode    -162.3449

	AbsMagn         18.9
	SlopeParam      0.18
	Albedo          0.35
	Brightness      1.76
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.526542
		SemiMajorAxisKm 1.85883722e+6
		Eccentricity    0.205643835
		Inclination     -0.401856
		AscendingNode   31.958246
		ArgOfPericenter -64.594441
		MeanAnomaly     171.391877
	}
}

Moon	"Keviaia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            8.09403354e-10
	Radius          7.497
	InertiaMoment   0.392933742
	Oblateness      0.056106063
	RotationPeriod  16.80971
	Obliquity       201.452025
	EqAscendNode    -168.023937

	AbsMagn         21.1
	SlopeParam      0.1
	Albedo          0.31
	Brightness      2.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.535965
		SemiMajorAxisKm 1.85954373e+6
		Eccentricity    0.1588337654
		Inclination     1.804151
		AscendingNode   -106.492605
		ArgOfPericenter -21.689763
		MeanAnomaly     160.503236
	}
}

Moon	"Kitiara"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.76260909e-10
	Radius          5.177
	InertiaMoment   0.400104426
	Oblateness      0.177039565
	RotationPeriod  2.54905
	Obliquity       265.805779
	EqAscendNode    48.122073

	AbsMagn         21.5
	SlopeParam      0.23
	Albedo          0.12
	Brightness      1.66
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.585304
		SemiMajorAxisKm 1.86324088e+6
		Eccentricity    0.1966983538
		Inclination     -0.136934
		AscendingNode   95.575095
		ArgOfPericenter 112.829655
		MeanAnomaly     44.601887
	}
}

Moon	"Eiyukaki"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.56145192e-10
	Radius          4.336
	InertiaMoment   0.400866722
	Oblateness      0.182045021
	RotationPeriod  11.51697
	Obliquity       67.311522
	EqAscendNode    152.029836

	AbsMagn         17.1
	SlopeParam      0.15
	Albedo          0.08
	Brightness      2.96
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.591643
		SemiMajorAxisKm 1.86371561e+6
		Eccentricity    0.0333400374
		Inclination     -0.465657
		AscendingNode   -150.742913
		ArgOfPericenter -157.936708
		MeanAnomaly     123.158226
	}
}

Moon	"Chiai"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.54261300e-8
	Radius          35.162
	InertiaMoment   0.409813789
	Oblateness      0.049653779
	RotationPeriod  11.10156
	Obliquity       282.836703
	EqAscendNode    -99.923703

	AbsMagn         20.6
	SlopeParam      0.15
	Albedo          0.06
	Brightness      2.55
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.616263
		SemiMajorAxisKm 1.86555883e+6
		Eccentricity    0.3792386325
		Inclination     1.680271
		AscendingNode   48.353414
		ArgOfPericenter 46.86517
		MeanAnomaly     -24.853699
	}
}

Moon	"Kikimal"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            5.54227564e-8
	Radius          34.995
	InertiaMoment   0.393406356
	Oblateness      0.316069958
	RotationPeriod  8.25662
	Obliquity       39.721039
	EqAscendNode    -134.649476

	AbsMagn         16.4
	SlopeParam      0.15
	Albedo          0.18
	Brightness      1.39
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.647535
		SemiMajorAxisKm 1.86789878e+6
		Eccentricity    0.2088674065
		Inclination     -0.546273
		AscendingNode   174.43721
		ArgOfPericenter -168.653845
		MeanAnomaly     -78.765134
	}
}

Moon	"Iateli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            6.55547867e-10
	Radius          7.171
	InertiaMoment   0.370601893
	Oblateness      0.260888622
	RotationPeriod  3.71002
	Obliquity       351.025644
	EqAscendNode    -148.370708

	AbsMagn         14.7
	SlopeParam      0.13
	Albedo          0.34
	Brightness      2.65
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.690281
		SemiMajorAxisKm 1.87109483e+6
		Eccentricity    0.3548886713
		Inclination     -1.868022
		AscendingNode   164.930394
		ArgOfPericenter 91.850854
		MeanAnomaly     -34.703206
	}
}

Moon	"Yasa"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.98415764e-9
	Radius          13.726
	InertiaMoment   0.407543458
	Oblateness      0.257471647
	RotationPeriod  2.2231
	Obliquity       179.831646
	EqAscendNode    98.674642

	AbsMagn         14.7
	SlopeParam      0.12
	Albedo          0.14
	Brightness      1.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.709991
		SemiMajorAxisKm 1.87256761e+6
		Eccentricity    0.1134011236
		Inclination     -3.020235
		AscendingNode   9.125061
		ArgOfPericenter 119.075105
		MeanAnomaly     -31.735775
	}
}

Moon	"Cleraln"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            8.27018802e-8
	Radius          34.306
	InertiaMoment   0.395302635
	Oblateness      0.276129392
	RotationPeriod  17.16818
	Obliquity       52.412684
	EqAscendNode    129.172436

	AbsMagn         21.8
	SlopeParam      0.22
	Albedo          0.23
	Brightness      2.58
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.797345
		SemiMajorAxisKm 1.87908806e+6
		Eccentricity    0.3508364634
		Inclination     -1.231001
		AscendingNode   -54.922735
		ArgOfPericenter -70.498053
		MeanAnomaly     127.251027
	}
}

Moon	"Taylial"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.28802778e-9
	Radius          8.406
	InertiaMoment   0.393820231
	Oblateness      0.053681376
	RotationPeriod  2.29449
	Obliquity       326.155864
	EqAscendNode    -12.789463

	AbsMagn         15.7
	SlopeParam      0.12
	Albedo          0.06
	Brightness      1.52
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.808241
		SemiMajorAxisKm 1.87990059e+6
		Eccentricity    0.2942719011
		Inclination     2.651409
		AscendingNode   -85.276255
		ArgOfPericenter -137.422862
		MeanAnomaly     14.289535
	}
}

Moon	"Mneim"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.00174794e-7
	Radius          62.982
	InertiaMoment   0.396137176
	Oblateness      0.114834417
	RotationPeriod  15.06102
	Obliquity       50.617594
	EqAscendNode    145.986202

	AbsMagn         16.5
	SlopeParam      0.21
	Albedo          0.15
	Brightness      1.29
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.829991
		SemiMajorAxisKm 1.88152196e+6
		Eccentricity    0.3801887528
		Inclination     0.904535
		AscendingNode   178.979863
		ArgOfPericenter -130.74112
		MeanAnomaly     -141.524188
	}
}

Moon	"Tiadu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            8.55338473e-8
	Radius          35.575
	InertiaMoment   0.374442841
	Oblateness      0.218483087
	RotationPeriod  9.11846
	Obliquity       303.013001
	EqAscendNode    -142.205182

	AbsMagn         17.4
	SlopeParam      0.22
	Albedo          0.3
	Brightness      1.23
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.875738
		SemiMajorAxisKm 1.88492999e+6
		Eccentricity    0.1655852098
		Inclination     -3.290088
		AscendingNode   -169.063151
		ArgOfPericenter 29.925672
		MeanAnomaly     -135.424698
	}
}

Moon	"Yiteoa"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            3.25511643e-12
	Radius          1.255
	InertiaMoment   0.370982899
	Oblateness      0.054913016
	RotationPeriod  8.31722
	Obliquity       330.32739
	EqAscendNode    115.958416

	AbsMagn         18.8
	SlopeParam      0.09
	Albedo          0.29
	Brightness      2.61
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.89597
		SemiMajorAxisKm 1.88643619e+6
		Eccentricity    0.26206121
		Inclination     -3.817396
		AscendingNode   -137.188062
		ArgOfPericenter 47.559292
		MeanAnomaly     55.367016
	}
}

Moon	"Aleteii"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            9.17113149e-10
	Radius          7.578
	InertiaMoment   0.396959684
	Oblateness      0.066732382
	RotationPeriod  7.06585
	Obliquity       279.98113
	EqAscendNode    23.570916

	AbsMagn         19.5
	SlopeParam      0.23
	Albedo          0.33
	Brightness      2.38
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.909413
		SemiMajorAxisKm 1.88743669e+6
		Eccentricity    0.0779305773
		Inclination     0.764762
		AscendingNode   135.377378
		ArgOfPericenter -84.297697
		MeanAnomaly     175.360693
	}
}

Moon	"Kiterna"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.88932618e-10
	Radius          7.874
	InertiaMoment   0.394802018
	Oblateness      0.309289942
	RotationPeriod  6.24751
	Obliquity       149.164809
	EqAscendNode    8.736468

	AbsMagn         16.4
	SlopeParam      0.11
	Albedo          0.19
	Brightness      1.33
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.919985
		SemiMajorAxisKm 1.88822335e+6
		Eccentricity    0.035719697
		Inclination     -2.973953
		AscendingNode   152.210735
		ArgOfPericenter 138.653727
		MeanAnomaly     -39.924758
	}
}

Moon	"Iaraiia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            2.53179317e-8
	Radius          26.282
	InertiaMoment   0.381774792
	Oblateness      0.274545441
	RotationPeriod  4.89743
	Obliquity       291.581565
	EqAscendNode    -33.805958

	AbsMagn         21.5
	SlopeParam      0.17
	Albedo          0.13
	Brightness      2.45
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.923799
		SemiMajorAxisKm 1.88850702e+6
		Eccentricity    0.3330261407
		Inclination     2.185573
		AscendingNode   -35.660392
		ArgOfPericenter 138.729121
		MeanAnomaly     81.087507
	}
}

Moon	"Rere"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            2.82534256e-9
	Radius          11.801
	InertiaMoment   0.388679839
	Oblateness      0.10279333
	RotationPeriod  6.77682
	Obliquity       320.162707
	EqAscendNode    -148.636081

	AbsMagn         18.6
	SlopeParam      0.22
	Albedo          0.33
	Brightness      2.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.940377
		SemiMajorAxisKm 1.88974012e+6
		Eccentricity    0.308803924
		Inclination     2.800067
		AscendingNode   17.028008
		ArgOfPericenter 114.561423
		MeanAnomaly     -103.460133
	}
}

Moon	"Monu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.86936430e-8
	Radius          22.16
	InertiaMoment   0.401422833
	Oblateness      0.301306126
	RotationPeriod  10.84728
	Obliquity       197.037334
	EqAscendNode    23.793445

	AbsMagn         16.8
	SlopeParam      0.09
	Albedo          0.34
	Brightness      2.83
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.952716
		SemiMajorAxisKm 1.89065766e+6
		Eccentricity    0.1553652224
		Inclination     -0.031768
		AscendingNode   -122.278226
		ArgOfPericenter 95.955156
		MeanAnomaly     63.68219
	}
}

Moon	"Scherad"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            3.60022856e-9
	Radius          12.324
	InertiaMoment   0.389096805
	Oblateness      0.245213943
	RotationPeriod  17.28273
	Obliquity       353.979765
	EqAscendNode    136.397556

	AbsMagn         17.7
	SlopeParam      0.09
	Albedo          0.3
	Brightness      2.59
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.961012
		SemiMajorAxisKm 1.89127439e+6
		Eccentricity    0.4102932706
		Inclination     3.555492
		AscendingNode   -45.457907
		ArgOfPericenter -51.858781
		MeanAnomaly     99.339621
	}
}

Moon	"Noneresi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            6.90292321e-9
	Radius          15.788
	InertiaMoment   0.375188337
	Oblateness      0.035407849
	RotationPeriod  7.65899
	Obliquity       100.71491
	EqAscendNode    -2.829216

	AbsMagn         17.1
	SlopeParam      0.23
	Albedo          0.29
	Brightness      2.88
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.975335
		SemiMajorAxisKm 1.89233899e+6
		Eccentricity    0.3912271405
		Inclination     0.065677
		AscendingNode   -30.829541
		ArgOfPericenter 97.1361
		MeanAnomaly     2.027852
	}
}

Moon	"Scayle"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            2.36606847e-8
	Radius          22.241
	InertiaMoment   0.39701227
	Oblateness      0.095555927
	RotationPeriod  2.79928
	Obliquity       18.488859
	EqAscendNode    76.182123

	AbsMagn         21.8
	SlopeParam      0.05
	Albedo          0.08
	Brightness      2.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.996224
		SemiMajorAxisKm 1.89389112e+6
		Eccentricity    0.3911228521
		Inclination     2.571735
		AscendingNode   -165.211086
		ArgOfPericenter 118.010023
		MeanAnomaly     5.747375
	}
}

Moon	"Kakuchuti"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.02727277e-7
	Radius          156.659
	InertiaMoment   0.377694896
	Oblateness      0.150006427
	RotationPeriod  5.84775
	Obliquity       289.524698
	EqAscendNode    -75.192095

	AbsMagn         22.1
	SlopeParam      0.14
	Albedo          0.24
	Brightness      1.57
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.004981
		SemiMajorAxisKm 1.89454157e+6
		Eccentricity    0.1932649119
		Inclination     2.683946
		AscendingNode   -13.204323
		ArgOfPericenter -130.165266
		MeanAnomaly     -132.323304
	}
}

Moon	"Cheko"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.36626282e-8
	Radius          30.043
	InertiaMoment   0.399316223
	Oblateness      0.107306145
	RotationPeriod  3.09811
	Obliquity       94.311282
	EqAscendNode    -17.473391

	AbsMagn         17.1
	SlopeParam      0.25
	Albedo          0.22
	Brightness      1.49
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.039067
		SemiMajorAxisKm 1.89707247e+6
		Eccentricity    0.0204069101
		Inclination     3.374175
		AscendingNode   -138.043894
		ArgOfPericenter 176.066423
		MeanAnomaly     -37.833831
	}
}

Moon	"Aduthe"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.18585576e-9
	Radius          9.173
	InertiaMoment   0.396262205
	Oblateness      0.211479913
	RotationPeriod  12.88598
	Obliquity       42.644139
	EqAscendNode    94.679073

	AbsMagn         16.6
	SlopeParam      0.22
	Albedo          0.11
	Brightness      2.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.054613
		SemiMajorAxisKm 1.89822614e+6
		Eccentricity    0.2555396423
		Inclination     -1.509506
		AscendingNode   -21.265473
		ArgOfPericenter 53.821827
		MeanAnomaly     -80.580872
	}
}

Moon	"Rechu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            8.26680838e-13
	Radius          0.795
	InertiaMoment   0.399187442
	Oblateness      0.045526966
	RotationPeriod  6.70456
	Obliquity       122.258932
	EqAscendNode    -151.573177

	AbsMagn         21.1
	SlopeParam      0.18
	Albedo          0.25
	Brightness      1.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.066376
		SemiMajorAxisKm 1.89909886e+6
		Eccentricity    0.1485713133
		Inclination     0.987276
		AscendingNode   133.980288
		ArgOfPericenter -112.426777
		MeanAnomaly     116.020246
	}
}

Moon	"Moneima"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.37380397e-9
	Radius          10.255
	InertiaMoment   0.40303806
	Oblateness      0.316626844
	RotationPeriod  9.14419
	Obliquity       200.525603
	EqAscendNode    -45.182371

	AbsMagn         15.6
	SlopeParam      0.17
	Albedo          0.25
	Brightness      2.9
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.08155
		SemiMajorAxisKm 1.90022439e+6
		Eccentricity    0.2541280054
		Inclination     1.951545
		AscendingNode   -117.766664
		ArgOfPericenter 178.947526
		MeanAnomaly     121.546964
	}
}

Moon	"Scaneim"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            2.95306977e-8
	Radius          26.982
	InertiaMoment   0.400837459
	Oblateness      0.220709658
	RotationPeriod  13.64099
	Obliquity       272.559245
	EqAscendNode    67.927904

	AbsMagn         17.5
	SlopeParam      0.19
	Albedo          0.07
	Brightness      2.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.098426
		SemiMajorAxisKm 1.90147576e+6
		Eccentricity    0.2258641191
		Inclination     -3.859746
		AscendingNode   148.335847
		ArgOfPericenter -122.698217
		MeanAnomaly     48.800791
	}
}

Moon	"Nuluaiki"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.99824890e-9
	Radius          15.082
	InertiaMoment   0.39384936
	Oblateness      0.200540427
	RotationPeriod  6.94756
	Obliquity       21.457689
	EqAscendNode    -161.829061

	AbsMagn         15.2
	SlopeParam      0.08
	Albedo          0.07
	Brightness      2.09
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.114504
		SemiMajorAxisKm 1.90266761e+6
		Eccentricity    0.4207260685
		Inclination     3.31809
		AscendingNode   77.313411
		ArgOfPericenter 18.787109
		MeanAnomaly     -168.874365
	}
}

Moon	"Nateyi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.36669639e-10
	Radius          4.583
	InertiaMoment   0.3822848
	Oblateness      0.164418541
	RotationPeriod  4.77218
	Obliquity       199.2287
	EqAscendNode    112.481384

	AbsMagn         17
	SlopeParam      0.12
	Albedo          0.2
	Brightness      1.84
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.127339
		SemiMajorAxisKm 1.90361873e+6
		Eccentricity    0.1102112691
		Inclination     -0.93056
		AscendingNode   164.01955
		ArgOfPericenter 16.863383
		MeanAnomaly     111.809538
	}
}

Moon	"Chal"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.08555878e-12
	Radius          1.332
	InertiaMoment   0.389459708
	Oblateness      0.344897718
	RotationPeriod  6.05369
	Obliquity       56.37498
	EqAscendNode    -13.888499

	AbsMagn         19.2
	SlopeParam      0.23
	Albedo          0.05
	Brightness      2.03
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.171942
		SemiMajorAxisKm 1.90692220e+6
		Eccentricity    0.4398081591
		Inclination     3.85193
		AscendingNode   -41.803509
		ArgOfPericenter -148.898785
		MeanAnomaly     141.514392
	}
}

Moon	"Luyate"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            3.26123352e-9
	Radius          11.422
	InertiaMoment   0.389527237
	Oblateness      0.175208745
	RotationPeriod  15.67826
	Obliquity       245.461214
	EqAscendNode    -111.701267

	AbsMagn         20.8
	SlopeParam      0.13
	Albedo          0.23
	Brightness      2.05
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.175364
		SemiMajorAxisKm 1.90717554e+6
		Eccentricity    0.4071916645
		Inclination     0.581939
		AscendingNode   -80.285024
		ArgOfPericenter -2.786804
		MeanAnomaly     -64.224507
	}
}

Moon	"Rnatevi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.13247259e-8
	Radius          17.968
	InertiaMoment   0.406759543
	Oblateness      0.285670453
	RotationPeriod  5.22773
	Obliquity       300.709307
	EqAscendNode    -162.22716

	AbsMagn         21.3
	SlopeParam      0.18
	Albedo          0.07
	Brightness      2.85
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.191584
		SemiMajorAxisKm 1.90837611e+6
		Eccentricity    0.4411370368
		Inclination     2.391804
		AscendingNode   -100.249173
		ArgOfPericenter 110.62692
		MeanAnomaly     97.513685
	}
}

Moon	"Malievi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            2.55549410e-9
	Radius          12.492
	InertiaMoment   0.372128528
	Oblateness      0.275661961
	RotationPeriod  6.28412
	Obliquity       166.123603
	EqAscendNode    -128.191868

	AbsMagn         21.1
	SlopeParam      0.22
	Albedo          0.3
	Brightness      1.29
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.20838
		SemiMajorAxisKm 1.90961886e+6
		Eccentricity    0.2447967246
		Inclination     -2.446182
		AscendingNode   113.758066
		ArgOfPericenter -87.603841
		MeanAnomaly     -31.291822
	}
}

Moon	"Lareko"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.03198053e-10
	Radius          6.711
	InertiaMoment   0.374511337
	Oblateness      0.093186825
	RotationPeriod  15.72784
	Obliquity       127.330568
	EqAscendNode    69.012907

	AbsMagn         21.5
	SlopeParam      0.06
	Albedo          0.24
	Brightness      2.32
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.226333
		SemiMajorAxisKm 1.91094679e+6
		Eccentricity    0.1843067
		Inclination     -1.570112
		AscendingNode   171.550922
		ArgOfPericenter 162.341516
		MeanAnomaly     -55.831685
	}
}

Moon	"Liroru"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.14605628e-8
	Radius          19.784
	InertiaMoment   0.378901651
	Oblateness      0.147562285
	RotationPeriod  8.6087
	Obliquity       174.965464
	EqAscendNode    -2.652371

	AbsMagn         19.4
	SlopeParam      0.13
	Albedo          0.24
	Brightness      1.24
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.266604
		SemiMajorAxisKm 1.91392387e+6
		Eccentricity    0.3990228571
		Inclination     -0.338363
		AscendingNode   19.16804
		ArgOfPericenter 0.410744
		MeanAnomaly     66.067705
	}
}

Moon	"Tacha"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            3.24635684e-12
	Radius          1.243
	InertiaMoment   0.396706289
	Oblateness      0.051536891
	RotationPeriod  16.18464
	Obliquity       310.762437
	EqAscendNode    161.538008

	AbsMagn         15.9
	SlopeParam      0.08
	Albedo          0.12
	Brightness      2.73
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.278198
		SemiMajorAxisKm 1.91478050e+6
		Eccentricity    0.0618576038
		Inclination     3.846424
		AscendingNode   118.159707
		ArgOfPericenter -66.880205
		MeanAnomaly     45.351911
	}
}

Moon	"Lakato"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            1.71444333e-9
	Radius          10.059
	InertiaMoment   0.409595518
	Oblateness      0.259359987
	RotationPeriod  10.78394
	Obliquity       59.385505
	EqAscendNode    154.071391

	AbsMagn         19.1
	SlopeParam      0.06
	Albedo          0.19
	Brightness      2.49
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.294973
		SemiMajorAxisKm 1.91601966e+6
		Eccentricity    0.2008748514
		Inclination     2.398543
		AscendingNode   33.086624
		ArgOfPericenter 161.846253
		MeanAnomaly     115.270594
	}
}

Moon	"Svia"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            9.56314548e-8
	Radius          36.057
	InertiaMoment   0.405159723
	Oblateness      0.025686466
	RotationPeriod  11.74005
	Obliquity       232.585501
	EqAscendNode    110.324592

	AbsMagn         16.8
	SlopeParam      0.2
	Albedo          0.15
	Brightness      1.71
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.306026
		SemiMajorAxisKm 1.91683590e+6
		Eccentricity    0.3114916557
		Inclination     -0.978759
		AscendingNode   -72.784461
		ArgOfPericenter -167.212181
		MeanAnomaly     -111.029971
	}
}

Moon	"Siye"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.52973072e-9
	Radius          11.636
	InertiaMoment   0.376193305
	Oblateness      0.279675879
	RotationPeriod  12.46793
	Obliquity       315.6568
	EqAscendNode    -163.98273

	AbsMagn         15.3
	SlopeParam      0.08
	Albedo          0.34
	Brightness      2.73
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.318227
		SemiMajorAxisKm 1.91773673e+6
		Eccentricity    0.4200271646
		Inclination     2.202647
		AscendingNode   -164.793637
		ArgOfPericenter 45.014337
		MeanAnomaly     -125.003738
	}
}

Moon	"Kerara"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.46175664e-12
	Radius          0.881
	InertiaMoment   0.382685306
	Oblateness      0.233374609
	RotationPeriod  8.52738
	Obliquity       132.51781
	EqAscendNode    -131.726089

	AbsMagn         22.5
	SlopeParam      0.24
	Albedo          0.25
	Brightness      2.85
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.322885
		SemiMajorAxisKm 1.91808058e+6
		Eccentricity    0.3444142093
		Inclination     -1.743043
		AscendingNode   52.864701
		ArgOfPericenter -143.848483
		MeanAnomaly     67.941052
	}
}

Moon	"Koro"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.56500616e-8
	Radius          29.74
	InertiaMoment   0.395775807
	Oblateness      0.060022416
	RotationPeriod  6.0871
	Obliquity       99.068247
	EqAscendNode    -161.379395

	AbsMagn         19.7
	SlopeParam      0.16
	Albedo          0.29
	Brightness      2.89
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.400439
		SemiMajorAxisKm 1.92380117e+6
		Eccentricity    0.3893731
		Inclination     3.057326
		AscendingNode   77.605884
		ArgOfPericenter 100.573442
		MeanAnomaly     -13.83224
	}
}

Moon	"Catacli"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            5.97561130e-9
	Radius          13.912
	InertiaMoment   0.371130642
	Oblateness      0.235780443
	RotationPeriod  7.21439
	Obliquity       59.884011
	EqAscendNode    24.365989

	AbsMagn         20.4
	SlopeParam      0.06
	Albedo          0.16
	Brightness      1.72
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.407232
		SemiMajorAxisKm 1.92430181e+6
		Eccentricity    0.4318556877
		Inclination     0.56677
		AscendingNode   -146.748402
		ArgOfPericenter 79.018459
		MeanAnomaly     -37.929246
	}
}

Moon	"Choso"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            6.51572440e-8
	Radius          32.308
	InertiaMoment   0.40109313
	Oblateness      0.325410954
	RotationPeriod  13.89845
	Obliquity       200.766673
	EqAscendNode    20.41721

	AbsMagn         17.6
	SlopeParam      0.14
	Albedo          0.19
	Brightness      1.81
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.441545
		SemiMajorAxisKm 1.92682973e+6
		Eccentricity    0.4178313442
		Inclination     -0.281571
		AscendingNode   -165.025414
		ArgOfPericenter -73.28691
		MeanAnomaly     -45.462698
	}
}

Moon	"Neui"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.31897069e-10
	Radius          4.674
	InertiaMoment   0.380270926
	Oblateness      0.02422681
	RotationPeriod  4.27756
	Obliquity       145.764285
	EqAscendNode    -163.291807

	AbsMagn         20.7
	SlopeParam      0.19
	Albedo          0.26
	Brightness      1.62
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.45307
		SemiMajorAxisKm 1.92767846e+6
		Eccentricity    0.2747011204
		Inclination     -0.834464
		AscendingNode   -89.049022
		ArgOfPericenter 104.24784
		MeanAnomaly     87.144572
	}
}

Moon	"Kesi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            6.86013253e-11
	Radius          3.514
	InertiaMoment   0.403943718
	Oblateness      0.039997417
	RotationPeriod  10.88898
	Obliquity       167.408819
	EqAscendNode    16.402619

	AbsMagn         17.8
	SlopeParam      0.16
	Albedo          0.21
	Brightness      2.17
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.469036
		SemiMajorAxisKm 1.92885388e+6
		Eccentricity    0.0983220416
		Inclination     2.40182
		AscendingNode   89.093666
		ArgOfPericenter 78.044038
		MeanAnomaly     23.91807
	}
}

Moon	"Scatie"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            1.22625432e-7
	Radius          91.104
	InertiaMoment   0.386931685
	Oblateness      0.277413713
	RotationPeriod  17.57702
	Obliquity       267.085181
	EqAscendNode    24.007297

	AbsMagn         21.2
	SlopeParam      0.08
	Albedo          0.29
	Brightness      1.45
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.492663
		SemiMajorAxisKm 1.93059269e+6
		Eccentricity    0.0041963026
		Inclination     1.566262
		AscendingNode   140.640864
		ArgOfPericenter -78.18325
		MeanAnomaly     103.883383
	}
}

Moon	"Nero"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            7.74093609e-8
	Radius          36.723
	InertiaMoment   0.393108394
	Oblateness      0.181897082
	RotationPeriod  2.23765
	Obliquity       42.243599
	EqAscendNode    -47.712954

	AbsMagn         17
	SlopeParam      0.22
	Albedo          0.11
	Brightness      2.82
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.504449
		SemiMajorAxisKm 1.93145976e+6
		Eccentricity    0.0118861167
		Inclination     2.012767
		AscendingNode   102.777055
		ArgOfPericenter 26.947197
		MeanAnomaly     96.64675
	}
}

Moon	"Arnu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            5.41166403e-8
	Radius          34.052
	InertiaMoment   0.403078064
	Oblateness      0.206983802
	RotationPeriod  16.60108
	Obliquity       133.079402
	EqAscendNode    3.840815

	AbsMagn         21.3
	SlopeParam      0.15
	Albedo          0.3
	Brightness      2.02
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.515293
		SemiMajorAxisKm 1.93225740e+6
		Eccentricity    0.2256264027
		Inclination     -2.867813
		AscendingNode   63.738796
		ArgOfPericenter 164.261705
		MeanAnomaly     99.984281
	}
}

Moon	"Royi"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            7.86528553e-9
	Radius          18.116
	InertiaMoment   0.378919348
	Oblateness      0.132984142
	RotationPeriod  6.55881
	Obliquity       167.18884
	EqAscendNode    168.026895

	AbsMagn         18.7
	SlopeParam      0.1
	Albedo          0.12
	Brightness      2.66
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.546793
		SemiMajorAxisKm 1.93457335e+6
		Eccentricity    0.0328808394
		Inclination     3.210554
		AscendingNode   117.160232
		ArgOfPericenter 121.475805
		MeanAnomaly     -171.872275
	}
}

Moon	"Schayln"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            1.19888975e-10
	Radius          4.264
	InertiaMoment   0.402776713
	Oblateness      0.283265662
	RotationPeriod  11.8747
	Obliquity       187.957978
	EqAscendNode    125.152259

	AbsMagn         18.3
	SlopeParam      0.14
	Albedo          0.3
	Brightness      2.87
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.611553
		SemiMajorAxisKm 1.93933044e+6
		Eccentricity    0.269133547
		Inclination     2.115186
		AscendingNode   89.556751
		ArgOfPericenter 48.138483
		MeanAnomaly     151.563092
	}
}

Moon	"Kochachasa"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            1.10146003e-7
	Radius          71.574
	InertiaMoment   0.409553892
	Oblateness      0.050063369
	RotationPeriod  11.89227
	Obliquity       60.455477
	EqAscendNode    71.473746

	AbsMagn         18.5
	SlopeParam      0.25
	Albedo          0.08
	Brightness      1.78
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.640714
		SemiMajorAxisKm 1.94147057e+6
		Eccentricity    0.2583138882
		Inclination     3.546351
		AscendingNode   -93.019483
		ArgOfPericenter 106.592517
		MeanAnomaly     -114.274441
	}
}

Moon	"Maylete"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            5.42240999e-8
	Radius          31.635
	InertiaMoment   0.405200371
	Oblateness      0.299578168
	RotationPeriod  11.22445
	Obliquity       292.589446
	EqAscendNode    -140.904064

	AbsMagn         17
	SlopeParam      0.13
	Albedo          0.26
	Brightness      2.71
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.687652
		SemiMajorAxisKm 1.94491294e+6
		Eccentricity    0.0543605061
		Inclination     -1.886251
		AscendingNode   129.530109
		ArgOfPericenter -66.534917
		MeanAnomaly     -152.945307
	}
}

Moon	"Mata"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            9.12849062e-8
	Radius          81.581
	InertiaMoment   0.390965037
	Oblateness      0.284231244
	RotationPeriod  15.36799
	Obliquity       322.13083
	EqAscendNode    -159.125382

	AbsMagn         15.8
	SlopeParam      0.08
	Albedo          0.3
	Brightness      1.61
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.724892
		SemiMajorAxisKm 1.94764186e+6
		Eccentricity    0.3236760798
		Inclination     -0.832867
		AscendingNode   148.659287
		ArgOfPericenter -129.829675
		MeanAnomaly     164.843856
	}
}

Moon	"Iasarutu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            8.26740120e-10
	Radius          7.706
	InertiaMoment   0.387708125
	Oblateness      0.167064997
	RotationPeriod  12.1333
	Obliquity       228.794813
	EqAscendNode    -70.816949

	AbsMagn         21
	SlopeParam      0.05
	Albedo          0.29
	Brightness      1.93
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.73922
		SemiMajorAxisKm 1.94869132e+6
		Eccentricity    0.0008019212
		Inclination     -0.288402
		AscendingNode   152.28302
		ArgOfPericenter -125.273353
		MeanAnomaly     19.305636
	}
}

Moon	"Choronoyu"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            4.48642512e-8
	Radius          28.313
	InertiaMoment   0.372083339
	Oblateness      0.15781908
	RotationPeriod  9.62765
	Obliquity       188.54879
	EqAscendNode    18.770096

	AbsMagn         20.1
	SlopeParam      0.06
	Albedo          0.23
	Brightness      2.22
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.757573
		SemiMajorAxisKm 1.95003520e+6
		Eccentricity    0.3713242154
		Inclination     3.281307
		AscendingNode   -10.771657
		ArgOfPericenter 80.221241
		MeanAnomaly     -32.869897
	}
}

Moon	"Loro"
{
	ParentBody     "Cailus"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            4.30300446e-8
	Radius          31.984
	InertiaMoment   0.394458281
	Oblateness      0.159171975
	RotationPeriod  10.78397
	Obliquity       201.928337
	EqAscendNode    11.908153

	AbsMagn         17.1
	SlopeParam      0.24
	Albedo          0.26
	Brightness      2.37
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.845449
		SemiMajorAxisKm 1.95646321e+6
		Eccentricity    0.4166424508
		Inclination     -3.876006
		AscendingNode   -132.412353
		ArgOfPericenter 177.876378
		MeanAnomaly     -48.787345
	}
}

Moon	"Serendai"
{
	ParentBody     "Cailus"
	Class          "Aquaria"
	Mass            0.092191218378
	Radius          1897.107972
	RotationPeriod  38.14478844
	Obliquity       -13.67124192
	EqAscendNode    -71.72199438

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.598
		Randomize      (0.164, -0.161, -0.972)
		colorDistMagn   0.0708
		colorDistFreq   115.64
		detailScale     6934.05
		drivenDarkening 0.616
		seaLevel        0.333
		snowLevel       2
		tropicLatitude  0.932
		humidity        0.218
		mainFreq        1.998
		mareFreq        0.026
		mareDensity     0.124
		terraceProb     0.475
		erosion         0
		riftsMagn       0.235
		riftsFreq       3.707
		canyonsMagn     0.658
		canyonsFreq     311.298
		craterMagn      0.634
		craterFreq      2.326
		craterDensity   0.965
		craterOctaves   14
		volcanoMagn     0.75
		volcanoFreq     0.961
		volcanoDensity  0.293
		volcanoOctaves  3
		volcanoActivity 0.333
		BumpHeight      15.96
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.29
		Hapke           0.5
		SpotBright      2.52
		SpotWidth       0.042
		DayAmbient      0.07
	}

	NoAtmosphere    true

	NoOcean         true
	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      24.515018
		SemiMajorAxisKm 2.41919329e+6
		Eccentricity    0.050856972
		Inclination     -0.00565257
		AscendingNode   91.85532915
		ArgOfPericenter -167.362029
		MeanAnomaly     12.516608
	}
}

Moon	"Ise"
{
	ParentBody     "Cailus"
	Class          "Terra"
	Mass            0.114905813716
	Radius          2026.838793
	TidalLocked     true
	Obliquity       4.07661146
	EqAscendNode    -132.00500426

	AlbedoBond      0.536
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_wet_rusty_green_plants.cfg"
		SurfStyle       0.833
		Randomize      (-0.099, -0.230, 0.598)
		colorDistMagn   0.0674
		colorDistFreq   1167.91
		detailScale     38527.94
		drivenDarkening 0.298
		seaLevel        0.041
		snowLevel       2
		tropicLatitude  0.345
		humidity        0.543
		mainFreq        1.717
		mareFreq        0.009
		mareDensity     0.172
		terraceProb     0.203
		erosion         0.251
		riftsMagn       0.378
		riftsFreq       3.184
		canyonsMagn     0.229
		canyonsFreq     218.971
		craterMagn      0.737
		craterFreq      12.702
		craterDensity   0.149
		craterOctaves   6
		volcanoMagn     0.353
		volcanoFreq     0.517
		volcanoDensity  0.134
		volcanoOctaves  2
		volcanoActivity 0.632
		BumpHeight      21.15
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.37
		Hapke           0.5
		SpotBright      2.51
		SpotWidth       0.057
		DayAmbient      0.07
	}

	Atmosphere
	{
		Model          "Earth"
		Height          514.896986
		Density         3.00306260e-10
		Pressure        3.17062818e-7
		Greenhouse      123.281334
		Opacity         0.986
	}

	NoClouds        true
	NoLava          true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      214.088201
		SemiMajorAxisKm 1.02591390e+7
		Eccentricity    0.0375550348
		Inclination     -1.20227261
		AscendingNode   144.06830192
		ArgOfPericenter -41.313335
		MeanAnomaly     -5.709258
	}
}
