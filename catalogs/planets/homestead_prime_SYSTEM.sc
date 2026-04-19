Star	"Homestead Prime"
{
	ParentBody     "Homestead Prime System"
	Class          "F0.1 V"
	Luminosity      13.1489229
	LumBol          11.8929653
	MassSol         1.85704541
	RadSol          2.0740242
	Teff            7185

	Age             0.982

	InertiaMoment   0.0364759564
	Oblateness      0.0316606164
	RotationPeriod  21.1010213
	RotationEpoch   0
	Obliquity       191.252533
	EqAscendNode    61.1956825

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.876 0.871 1.000)

	Surface
	{
		SurfStyle       0.17
		Randomize      (0.063, 0.707, 0.892)
		colorDistMagn   0
		colorDistFreq   0
		detailScale     3.28e+04
		tropicLatitude  0.95
		icecapLatitude  1.05
		climatePole     0.447
		climateTropic   0.076
		mareFreq        75.5
		mareDensity     0.00713
		erosion         1
		montesMagn      0.03
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       6.27e+03
		canyonsMagn     0.297
		cracksOctaves   5
		BumpHeight      914
		BumpOffset      914
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.76
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          14428.9863
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      8.1e+06
		Period      0.00515
		Brightness  0.5
		RayDensity  3.96
		RayCurv     24.5
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		Period          0
		SemiMajorAxis   0
		Eccentricity    0
		Inclination     191.252533
		AscendingNode   61.1956825
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet "Homestead Prime A"
{
	ParentBody     "Homestead Prime"
	Class          "Terra"
	Mass            0.14371635
	Radius          3699.31274
	InertiaMoment   0.330777049
	Oblateness      0.00310736406
	RotationPeriod  28.9367589
	RotationEpoch   0
	Obliquity       -60.9994265
	EqAscendNode    -28.2436077

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.679 0.675 0.671)

	Surface
	{
		Preset         "terra_arid_sandy_green.cfg"
		SurfStyle       0.7
		Randomize      (-0.162, -0.410, 0.211)
		colorDistMagn   0.0956
		colorDistFreq   419
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.179
		snowLevel       2
		tropicLatitude  0.876
		icecapLatitude  2
		icecapHeight    0.473
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.368
		heightTempGrad  0.625
		beachWidth      0.000995
		tropicWidth     0.07
		mainFreq        1.75
		venusFreq       1.38
		venusMagn       0
		mareFreq        1.54
		mareDensity     0.15
		terraceProb     0.445
		erosion         0
		montesMagn      0.168
		montesFreq      136
		montesSpiky     0.838
		montesFraction  0.451
		dunesMagn       0.0237
		dunesFreq       29.8
		dunesFraction   0.688
		hillsMagn       0.142
		hillsFreq       408
		hillsFraction   0.322
		hills2Fraction  0
		riversMagn      60.6
		riversFreq      2.64
		riversSin       7.64
		riftsMagn       51.7
		riftsFreq       2.02
		riftsSin        4.51
		canyonsMagn     0.442
		canyonsFreq     1.18
		canyonsFraction 0.0386
		cracksMagn      0.024
		cracksFreq      1.41
		cracksOctaves   0
		craterMagn      0.55
		craterFreq      11.9
		craterDensity   0.883
		craterOctaves   20
		craterRayedFactor 0.168
		volcanoMagn     0.538
		volcanoFreq     0.644
		volcanoDensity  0.32
		volcanoOctaves  3
		volcanoActivity 0.746
		volcanoFlows    0.206
		volcanoRadius   0.453
		volcanoTemp     1.16e+03
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
		Hapke           0.986
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          150.360764
		Density         0.000589344359
		Pressure        0.00054969464
		Greenhouse      0.118500553
		Bright          3.53
		Opacity         0
		SkyLight        1.18
		Hue             0.000879
		Saturation      0.675

		Composition
		{
			CO2       	56.2
			SO2       	43.7
			C3H8      	0.0816
			C8H18     	0.0481
			Cl2       	0.00961
			Kr        	0.000285
			Xe        	1.76e-05
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
		Period          0.413471255
		SemiMajorAxis   0.682187863
		Eccentricity    0.0139077272
		Inclination     0.219851409
		AscendingNode   -24.5280879
		ArgOfPericenter 189.577802
		MeanAnomaly     213.556987
	}
}

DwarfMoon "Homestead Prime A 1"
{
	ParentBody     "Homestead Prime A"
	Class          "Asteroid"
	Mass            1.00502255e-07
	Radius          37.1619072
	InertiaMoment   0.398796201
	RotationPeriod  122.181892
	Obliquity       134.584377
	EqAscendNode    -127.660895

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.732 0.729 0.728)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.137
		Randomize      (-0.873, -0.711, 0.004)
		colorDistMagn   0.686
		colorDistFreq   0.574
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.694
		icecapLatitude  2
		icecapHeight    0.442
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.204
		heightTempGrad  0.625
		beachWidth      0.000434
		tropicWidth     0.07
		mainFreq        0.323
		venusFreq       0.632
		venusMagn       0.716
		mareDensity     0
		terraceProb     0.377
		erosion         0
		montesMagn      0.519
		montesFreq      2.38
		montesSpiky     0.94
		montesFraction  0.355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.77
		hillsFraction   0.556
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21
		craterFreq      0.234
		craterDensity   0.933
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449
		volcanoTemp     1.1e+03
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
		PeriodDays      7.63636804
		SemiMajorAxisKm 85803.7861
		Eccentricity    0.0700930734
		Inclination     134.584377
		AscendingNode   -127.660895
		ArgOfPericenter -39.2245663
		MeanAnomaly     13.8443074
	}
}

DwarfMoon "Homestead Prime A 2"
{
	ParentBody     "Homestead Prime A"
	Class          "Asteroid"
	Mass            1.37475581e-07
	Radius          41.6539764
	InertiaMoment   0.398723185
	RotationPeriod  225.838817
	Obliquity       137.568987
	EqAscendNode    -22.8492972

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.516 0.510 0.507)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.706
		Randomize      (-0.603, -0.881, 0.337)
		colorDistMagn   0.699
		colorDistFreq   1.21
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.982
		icecapLatitude  2
		icecapHeight    0.81
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.102
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.579
		venusFreq       0.655
		venusMagn       0.71
		mareDensity     0
		terraceProb     0.127
		erosion         0
		montesMagn      0.314
		montesFreq      3.16
		montesSpiky     0.895
		montesFraction  0.448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.25
		hillsFraction   0.662
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.19
		craterDensity   0.71
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501
		volcanoTemp     947
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
		PeriodDays      18.8199014
		SemiMajorAxisKm 156552.548
		Eccentricity    0.28095321
		Inclination     137.568987
		AscendingNode   -22.8492972
		ArgOfPericenter -32.0453472
		MeanAnomaly     138.55124
	}
}

DwarfMoon "Homestead Prime A 3"
{
	ParentBody     "Homestead Prime A"
	Class          "Asteroid"
	Mass            1.8888332e-07
	Radius          45.7958717
	InertiaMoment   0.398648441
	RotationPeriod  914.913993
	Obliquity       214.955466
	EqAscendNode    -90.6496666

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.696 0.692 0.689)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.275
		Randomize      (-0.332, 0.949, 0.670)
		colorDistMagn   0.713
		colorDistFreq   0.79
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.921
		icecapLatitude  2
		icecapHeight    0.696
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.399
		heightTempGrad  0.625
		beachWidth      0.00173
		tropicWidth     0.07
		mainFreq        0.417
		venusFreq       0.714
		venusMagn       0.704
		mareDensity     0
		terraceProb     0.247
		erosion         0
		montesMagn      0.491
		montesFreq      2.46
		montesSpiky     0.797
		montesFraction  0.523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64
		hillsFraction   0.792
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.248
		craterDensity   0.876
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553
		volcanoTemp     1.09e+03
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
		PeriodDays      57.1821229
		SemiMajorAxisKm 328414.371
		Eccentricity    0.132014355
		Inclination     214.955466
		AscendingNode   -90.6496666
		ArgOfPericenter 39.1138663
		MeanAnomaly     48.7492312
	}
}

Planet "Homestead Prime B"
{
	ParentBody     "Homestead Prime"
	Class          "Neptune"
	Mass            23.1908035
	Radius          23643.5859
	InertiaMoment   0.231938913
	Oblateness      0.0302983727
	RotationPeriod  9.91242864
	RotationEpoch   0
	Obliquity       -55.3156916
	EqAscendNode    -134.80939

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_warm_default.cfg"
		SurfStyle       0.597
		Randomize      (-0.547, -0.547, 0.567)
		detailScale     256
		tropicLatitude  0.828
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.37
		stripeFluct     0.402
		stripeTwist     10.3
		cycloneMagn     12.2
		cycloneFreq     0.532
		cycloneDensity  0.403
		cycloneOctaves  1
		cycloneMagn2     0.504
		cycloneFreq2     0.545
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      15.4
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
		Height          249
		Velocity        851
		BumpHeight      23
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.976
		mainOctaves     12
		Coverage        0.0965
		stripeZones     1.37
		stripeFluct     0.402
		stripeTwist     10.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          1182.17932
		Density         0.00539414817
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.419
		Saturation      0.943

		Composition
		{
			H2        	92.7
			He        	6.96
			CH4       	0.289
			N2        	0.0364
			NH3       	0.0273
			O2        	0.00806
			C2H2      	0.00345
			C2H4      	0.0013
			Ne        	0.00107
			Ar        	0.000785
			C2H6      	0.000595
			C8H18     	0.000354
			C3H8      	0.000352
			H2O       	3.39e-06
			H2S       	1.82e-06
			CO2       	1.48e-06
			Kr        	4.14e-07
			Xe        	4.59e-08
			SO2       	8.99e-09
			Cl2       	3.24e-10
			CO        	2.94e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  369
	}

	Aurora
	{
		Height         259
		NorthLat       76.7
		NorthLon       -55.1
		NorthRadius    6.28e+03
		NorthWidth     1.98e+03
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 68.2
		NorthMoveSpeed 0.773
		NorthParticles 10000
		SouthLat       -48.9
		SouthLon       119
		SouthRadius    6.6e+03
		SouthWidth     1.88e+03
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 61.1
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
		Period          1.78611298
		SemiMajorAxis   1.80947168
		Eccentricity    0.0663882536
		Inclination     0.546315392
		AscendingNode   -131.013619
		ArgOfPericenter 86.4890849
		MeanAnomaly     301.742949
	}
}

DwarfMoon "Homestead Prime B 1"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            1.11330866e-11
	Radius          1.8220495
	InertiaMoment   0.39839524
	Oblateness     (0.346, 0.524, 0.000)
	Obliquity       -0.00279671144
	EqAscendNode    18.2544735
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.706 0.705 0.701)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.03
		Randomize      (-0.422, -0.459, -0.084)
		colorDistMagn   0.414
		colorDistFreq   0.00176
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.655
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.456
		heightTempGrad  0.625
		beachWidth      0.000727
		tropicWidth     0.07
		mainFreq        0.532
		venusFreq       0.587
		venusMagn       0.746
		mareDensity     0
		terraceProb     0.303
		erosion         0
		montesMagn      0.54
		montesFreq      2.38
		montesSpiky     0.787
		montesFraction  0.635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00698
		hillsFraction   0.628
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.141
		craterDensity   0.863
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518
		volcanoTemp     1.01e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.64
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
		PeriodDays      0.254213021
		SemiMajorAxisKm 48341.1352
		Eccentricity    5.32685652e-05
		Inclination     -0.00279671144
		AscendingNode   18.2544735
		ArgOfPericenter -0.506093781
		MeanAnomaly     32.4993824
	}
}

DwarfMoon "Homestead Prime B 2"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            2.30381565e-11
	Radius          2.30211949
	InertiaMoment   0.398310691
	Oblateness     (0.344, 0.490, 0.000)
	Obliquity       0.00880748328
	EqAscendNode    68.8586253
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.490 0.483 0.480)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.599
		Randomize      (-0.152, -0.629, 0.249)
		colorDistMagn   0.429
		colorDistFreq   0.00457
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.59
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.353
		heightTempGrad  0.625
		beachWidth      0.000775
		tropicWidth     0.07
		mainFreq        0.359
		venusFreq       0.603
		venusMagn       0.739
		mareDensity     0
		terraceProb     0.5
		erosion         0
		montesMagn      0.378
		montesFreq      3.16
		montesSpiky     0.972
		montesFraction  0.722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00927
		hillsFraction   0.737
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.227
		craterDensity   0.962
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.624
		volcanoTemp     1.06e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.07
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
		PeriodDays      0.291090771
		SemiMajorAxisKm 52909.9406
		Eccentricity    6.06448698e-05
		Inclination     0.00880748328
		AscendingNode   68.8586253
		ArgOfPericenter 38.6690065
		MeanAnomaly     -171.765571
	}
}

DwarfMoon "Homestead Prime B 3"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            4.31381944e-11
	Radius          2.80363154
	InertiaMoment   0.398223013
	Oblateness     (0.344, 0.476, 0.000)
	Obliquity       -0.0020115529
	EqAscendNode    112.672673
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.670 0.665 0.662)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.168
		Randomize      (0.118, -0.799, 0.582)
		colorDistMagn   0.445
		colorDistFreq   0.0039
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.524
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.251
		heightTempGrad  0.625
		beachWidth      0.000822
		tropicWidth     0.07
		mainFreq        0.604
		venusFreq       0.619
		venusMagn       0.732
		mareDensity     0
		terraceProb     0.189
		erosion         0
		montesMagn      0.511
		montesFreq      2.46
		montesSpiky     0.937
		montesFraction  0.871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0231
		hillsFraction   0.477
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.265
		craterFreq      0.179
		craterDensity   0.788
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48
		volcanoTemp     905
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.52
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
		PeriodDays      0.306038388
		SemiMajorAxisKm 54706.0788
		Eccentricity    3.9957216e-05
		Inclination     -0.0020115529
		AscendingNode   112.672673
		ArgOfPericenter -59.8494249
		MeanAnomaly     -114.427326
	}
}

DwarfMoon "Homestead Prime B 4"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            7.53234558e-11
	Radius          3.41167188
	InertiaMoment   0.398131788
	Oblateness     (0.343, 0.467, 0.000)
	Obliquity       0.00508268254
	EqAscendNode    115.312648
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.454 0.447 0.441)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.737
		Randomize      (0.389, -0.968, 0.915)
		colorDistMagn   0.46
		colorDistFreq   0.00932
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.431
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.149
		heightTempGrad  0.625
		beachWidth      0.00087
		tropicWidth     0.07
		mainFreq        0.442
		venusFreq       0.637
		venusMagn       0.725
		mareDensity     0
		terraceProb     0.313
		erosion         0
		montesMagn      0.695
		montesFreq      3.2
		montesSpiky     0.891
		montesFraction  0.31
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0301
		hillsFraction   0.612
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.24
		craterDensity   0.902
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.07
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
		PeriodDays      0.314176826
		SemiMajorAxisKm 55671.6913
		Eccentricity    1.41163265e-05
		Inclination     0.00508268254
		AscendingNode   115.312648
		ArgOfPericenter 50.6555499
		MeanAnomaly     29.7397069
	}
}

DwarfMoon "Homestead Prime B 5"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            1.24915342e-10
	Radius          4.05362654
	InertiaMoment   0.39803648
	Oblateness     (0.343, 0.462, 0.000)
	Obliquity       -0.0120462922
	EqAscendNode    -83.0914031
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.631 0.629 0.626)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.306
		Randomize      (0.659, 0.862, -0.752)
		colorDistMagn   0.475
		colorDistFreq   0.00761
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.794
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.447
		heightTempGrad  0.625
		beachWidth      0.000918
		tropicWidth     0.07
		mainFreq        0.696
		venusFreq       0.663
		venusMagn       0.719
		mareDensity     0
		terraceProb     0.53
		erosion         0
		montesMagn      0.482
		montesFreq      2.53
		montesSpiky     0.774
		montesFraction  0.419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0384
		hillsFraction   0.717
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.206
		craterFreq      0.197
		craterDensity   1.02
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414
		volcanoTemp     1e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.65
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
		PeriodDays      0.319629842
		SemiMajorAxisKm 56314.02
		Eccentricity    2.51502272e-05
		Inclination     -0.0120462922
		AscendingNode   -83.0914031
		ArgOfPericenter -77.7042974
		MeanAnomaly     47.3065874
	}
}

DwarfMoon "Homestead Prime B 6"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            1.99136749e-10
	Radius          4.75330591
	InertiaMoment   0.397936463
	Oblateness     (0.342, 0.455, 0.000)
	Obliquity       -0.00925217297
	EqAscendNode    -103.59492
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.413 0.411 0.407)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.875
		Randomize      (0.929, 0.692, -0.419)
		colorDistMagn   0.49
		colorDistFreq   0.017
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.689
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.344
		heightTempGrad  0.625
		beachWidth      0.000666
		tropicWidth     0.07
		mainFreq        0.512
		venusFreq       0.496
		venusMagn       0.713
		mareDensity     0
		terraceProb     0.198
		erosion         0
		montesMagn      0.609
		montesFreq      3.25
		montesSpiky     0.971
		montesFraction  0.497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0472
		hillsFraction   0.433
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.254
		craterDensity   0.844
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.28
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
		PeriodDays      0.326618205
		SemiMajorAxisKm 57131.8879
		Eccentricity    6.28753152e-05
		Inclination     -0.00925217297
		AscendingNode   -103.59492
		ArgOfPericenter 75.9069702
		MeanAnomaly     150.256698
	}
}

DwarfMoon "Homestead Prime B 7"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            3.07736642e-10
	Radius          5.44876099
	InertiaMoment   0.397831053
	Oblateness     (0.340, 0.425, 0.000)
	Obliquity       -0.0120669844
	EqAscendNode    -45.0138384
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.595 0.589 0.587)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.444
		Randomize      (-0.800, 0.522, -0.086)
		colorDistMagn   0.505
		colorDistFreq   0.0127
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.621
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.242
		heightTempGrad  0.625
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        0.329
		venusFreq       0.547
		venusMagn       0.707
		mareDensity     0
		terraceProb     0.323
		erosion         0
		montesMagn      0.453
		montesFreq      2.59
		montesSpiky     0.936
		montesFraction  0.569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.051
		hillsFraction   0.596
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.211
		craterDensity   0.942
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533
		volcanoTemp     1.1e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.9
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
		PeriodDays      0.355942621
		SemiMajorAxisKm 60502.2667
		Eccentricity    1.63866834e-05
		Inclination     -0.0120669844
		AscendingNode   -45.0138384
		ArgOfPericenter 51.6045582
		MeanAnomaly     -134.302551
	}
}

DwarfMoon "Homestead Prime B 8"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            4.63818928e-10
	Radius          6.31150293
	InertiaMoment   0.397719204
	Oblateness     (0.338, 0.388, 0.000)
	Obliquity       -0.00215780242
	EqAscendNode    11.4053271
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.775 0.771 0.770)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0134
		Randomize      (-0.530, 0.352, 0.247)
		colorDistMagn   0.519
		colorDistFreq   0.0282
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.557
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14
		heightTempGrad  0.625
		beachWidth      0.000762
		tropicWidth     0.07
		mainFreq        0.582
		venusFreq       0.569
		venusMagn       0.701
		mareDensity     0
		terraceProb     0.569
		erosion         0
		montesMagn      0.567
		montesFreq      3.29
		montesSpiky     0.889
		montesFraction  0.642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116
		hillsFraction   0.699
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.273
		craterDensity   0.748
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434
		volcanoTemp     1.04e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.68
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
		PeriodDays      0.390603297
		SemiMajorAxisKm 64368.8257
		Eccentricity    8.66770855e-05
		Inclination     -0.00215780242
		AscendingNode   11.4053271
		ArgOfPericenter -9.13141438
		MeanAnomaly     -62.852582
	}
}

DwarfMoon "Homestead Prime B 9"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            6.84942714e-10
	Radius          7.08738708
	InertiaMoment   0.397599757
	Oblateness     (0.335, 0.335, 0.000)
	Obliquity       0.00310881058
	EqAscendNode    -127.570044
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.559 0.553 0.548)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.583
		Randomize      (-0.259, 0.182, 0.580)
		colorDistMagn   0.534
		colorDistFreq   0.0196
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.828
		icecapLatitude  2
		icecapHeight    0.482
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.437
		heightTempGrad  0.625
		beachWidth      0.00081
		tropicWidth     0.07
		mainFreq        0.421
		venusFreq       0.586
		venusMagn       0.695
		mareDensity     0
		terraceProb     0.206
		erosion         0
		montesMagn      0.418
		montesFreq      2.64
		montesSpiky     0.756
		montesFraction  0.732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129
		hillsFraction   0.944
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.224
		craterDensity   0.885
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493
		volcanoTemp     991
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.38
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
		PeriodDays      0.440911801
		SemiMajorAxisKm 69783.5082
		Eccentricity    5.00416571e-05
		Inclination     0.00310881058
		AscendingNode   -127.570044
		ArgOfPericenter -73.7763803
		MeanAnomaly     36.9563937
	}
}

DwarfMoon "Homestead Prime B 10"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            2.78008713e-07
	Radius          52.3766632
	InertiaMoment   0.398791045
	Oblateness     (0.300, 0.030, 0.000)
	Obliquity       0.212066771
	EqAscendNode    119.455057
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.738 0.735 0.731)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.152
		Randomize      (0.011, 0.012, 0.913)
		colorDistMagn   0.548
		colorDistFreq   1.84
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.829
		icecapLatitude  2
		icecapHeight    0.315
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.335
		heightTempGrad  0.625
		beachWidth      0.000557
		tropicWidth     0.07
		mainFreq        0.666
		venusFreq       0.602
		venusMagn       0.69
		mareDensity     0
		terraceProb     0.334
		erosion         0
		montesMagn      0.535
		montesFreq      3.34
		montesSpiky     0.97
		montesFraction  0.898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.37
		hillsFraction   0.579
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.267
		craterFreq      0.173
		craterDensity   0.991
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541
		volcanoTemp     1.04e+03
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
		PeriodDays      0.825406331
		SemiMajorAxisKm 105997.799
		Eccentricity    0.00304835981
		Inclination     0.212066771
		AscendingNode   119.455057
		ArgOfPericenter -150.073843
		MeanAnomaly     93.0255328
	}
}

DwarfMoon "Homestead Prime B 11"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            1.22115725e-05
	Radius          186.262314
	InertiaMoment   0.397318453
	Oblateness     (0.234, 0.004, 0.000)
	Obliquity       0.908068513
	EqAscendNode    114.525669
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.518 0.516 0.513)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.721
		Randomize      (0.281, -0.158, -0.754)
		colorDistMagn   0.562
		colorDistFreq   12.1
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.831
		icecapLatitude  2
		icecapHeight    0.73
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.233
		heightTempGrad  0.625
		beachWidth      0.000905
		tropicWidth     0.07
		mainFreq        0.493
		venusFreq       0.618
		venusMagn       0.684
		mareDensity     0
		terraceProb     0.632
		erosion         0
		montesMagn      0.368
		montesFreq      2.69
		montesSpiky     0.934
		montesFraction  0.324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.8
		hillsFraction   0.682
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      1.28
		craterDensity   0.822
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447
		volcanoTemp     1.09e+03
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
		PeriodDays      1.44855095
		SemiMajorAxisKm 154220.075
		Eccentricity    0.00313684489
		Inclination     0.908068513
		AscendingNode   114.525669
		ArgOfPericenter 177.879514
		MeanAnomaly     123.964502
	}
}

Moon "Homestead Prime B 12"
{
	ParentBody     "Homestead Prime B"
	Class          "Terra"
	Mass            6.99515076e-05
	Radius          328.667633
	InertiaMoment   0.399530649
	Oblateness      0.00130021502
	Obliquity       -1.28211891
	EqAscendNode    -13.8228724
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.743 0.676 0.651)

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.29
		Randomize      (0.552, -0.328, -0.421)
		colorDistMagn   0.0633
		colorDistFreq   43.1
		detailScale     1.02e+03
		drivenDarkening 0
		seaLevel        0.209
		snowLevel       2
		tropicLatitude  0.84
		icecapLatitude  2
		icecapHeight    0.574
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.131
		heightTempGrad  0.625
		beachWidth      0.000953
		tropicWidth     0.07
		mainFreq        1.54
		venusFreq       1.27
		venusMagn       0
		mareFreq        0
		mareDensity     0.171
		terraceProb     0.215
		erosion         0
		montesMagn      0.0536
		montesFreq      13.4
		montesSpiky     0.823
		montesFraction  0.0243
		dunesMagn       0.0546
		dunesFreq       2.08
		dunesFraction   0.699
		hillsMagn       0.114
		hillsFreq       36.3
		hillsFraction   0.0468
		hills2Fraction  0
		riversMagn      63.5
		riversFreq      3.94
		riversSin       5.01
		riftsMagn       69.9
		riftsFreq       3.58
		riftsSin        6.68
		canyonsMagn     0.536
		canyonsFreq     0.115
		canyonsFraction 0.673
		cracksMagn      0.0767
		cracksFreq      0.146
		cracksOctaves   0
		craterMagn      0.718
		craterFreq      0.706
		craterDensity   0.941
		craterOctaves   16
		craterRayedFactor 0.0771
		volcanoMagn     0.165
		volcanoFreq     0.74
		volcanoDensity  0.221
		volcanoOctaves  3
		volcanoActivity 0.15
		volcanoFlows    0.245
		volcanoRadius   0.162
		volcanoTemp     1.11e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.4
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
		PeriodDays      2.54213917
		SemiMajorAxisKm 224380.427
		Eccentricity    0.00856656195
		Inclination     -1.28211891
		AscendingNode   -13.8228724
		ArgOfPericenter -50.611408
		MeanAnomaly     -111.644905
	}
}

DwarfMoon "Homestead Prime B 13"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            2.82499313e-09
	Radius          11.4004526
	InertiaMoment   0.397002727
	Obliquity       214.732165
	EqAscendNode    -29.8898525
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.567 0.451 0.389)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.859
		Randomize      (0.822, -0.498, -0.089)
		colorDistMagn   0.59
		colorDistFreq   0.039
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.493
		icecapLatitude  2
		icecapHeight    0.588
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.428
		heightTempGrad  0.625
		beachWidth      0.001
		tropicWidth     0.07
		mainFreq        0.562
		venusFreq       0.66
		venusMagn       0.674
		mareDensity     0
		terraceProb     0.345
		erosion         0
		montesMagn      0.672
		montesFreq      2.74
		montesSpiky     0.724
		montesFraction  0.505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.374
		hillsFraction   0.561
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.25
		craterDensity   1.09
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55
		volcanoTemp     1.08e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.3
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
		PeriodDays      30.3900802
		SemiMajorAxisKm 1173112.19
		Eccentricity    0.0873590698
		Inclination     214.732165
		AscendingNode   -29.8898525
		ArgOfPericenter 14.7637941
		MeanAnomaly     38.3177001
	}
}

DwarfMoon "Homestead Prime B 14"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            3.92737087e-09
	Radius          12.8008537
	InertiaMoment   0.396803051
	Obliquity       138.662903
	EqAscendNode    151.576227
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.735 0.648 0.584)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.428
		Randomize      (-0.907, -0.668, 0.244)
		colorDistMagn   0.604
		colorDistFreq   0.0985
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.432
		icecapLatitude  2
		icecapHeight    0.521
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.326
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.398
		venusFreq       0.484
		venusMagn       0.668
		mareDensity     0
		terraceProb     0.101
		erosion         0
		montesMagn      0.478
		montesFreq      3.45
		montesSpiky     0.969
		montesFraction  0.575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.418
		hillsFraction   0.666
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.208
		craterDensity   0.868
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457
		volcanoTemp     1.03e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.5
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
		PeriodDays      34.2090342
		SemiMajorAxisKm 1269440.04
		Eccentricity    0.0241270014
		Inclination     138.662903
		AscendingNode   151.576227
		ArgOfPericenter 165.706235
		MeanAnomaly     103.496818
	}
}

DwarfMoon "Homestead Prime B 15"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            5.42347589e-09
	Radius          14.3462276
	InertiaMoment   0.396565199
	Obliquity       145.319737
	EqAscendNode    115.731475
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.553 0.442 0.328)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.997
		Randomize      (-0.637, -0.838, 0.577)
		colorDistMagn   0.617
		colorDistFreq   0.0496
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.746
		icecapLatitude  2
		icecapHeight    0.426
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.224
		heightTempGrad  0.625
		beachWidth      0.000797
		tropicWidth     0.07
		mainFreq        0.639
		venusFreq       0.545
		venusMagn       0.663
		mareDensity     0
		terraceProb     0.223
		erosion         0
		montesMagn      0.602
		montesFreq      2.79
		montesSpiky     0.933
		montesFraction  0.65
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.475
		hillsFraction   0.799
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.268
		craterDensity   0.968
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505
		volcanoTemp     978
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.9
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
		PeriodDays      36.0896222
		SemiMajorAxisKm 1315547.52
		Eccentricity    0.189362017
		Inclination     145.319737
		AscendingNode   115.731475
		ArgOfPericenter -70.134806
		MeanAnomaly     -142.21234
	}
}

DwarfMoon "Homestead Prime B 16"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            7.44877093e-09
	Radius          15.8206186
	InertiaMoment   0.396265626
	RotationPeriod  637.838346
	Obliquity       174.344357
	EqAscendNode    -172.169143

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.731 0.640 0.511)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.566
		Randomize      (-0.367, 0.992, 0.910)
		colorDistMagn   0.631
		colorDistFreq   0.142
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.769
		icecapLatitude  2
		icecapHeight    0.787
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.121
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.473
		venusFreq       0.568
		venusMagn       0.658
		mareDensity     0
		terraceProb     0.356
		erosion         0
		montesMagn      0.448
		montesFreq      3.52
		montesSpiky     0.885
		montesFraction  0.742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.514
		hillsFraction   0.541
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.22
		craterDensity   0.797
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562
		volcanoTemp     925
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.2
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
		PeriodDays      39.8648954
		SemiMajorAxisKm 1405762.87
		Eccentricity    0.160712162
		Inclination     174.344357
		AscendingNode   -172.169143
		ArgOfPericenter -74.738633
		MeanAnomaly     41.5213711
	}
}

DwarfMoon "Homestead Prime B 17"
{
	ParentBody     "Homestead Prime B"
	Class          "Asteroid"
	Mass            1.01861239e-08
	Radius          17.5987377
	InertiaMoment   0.395846963
	RotationPeriod  495.85258
	Obliquity       184.68044
	EqAscendNode    102.434299

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.453 0.419 0.352)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.135
		Randomize      (-0.096, 0.822, -0.757)
		colorDistMagn   0.645
		colorDistFreq   0.0481
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.839
		icecapLatitude  2
		icecapHeight    0.686
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.419
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        0.756
		venusFreq       0.585
		venusMagn       0.652
		mareDensity     0
		terraceProb     0.111
		erosion         0
		montesMagn      0.562
		montesFreq      2.83
		montesSpiky     1
		montesFraction  0.934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.507
		hillsFraction   0.65
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.269
		craterFreq      0.166
		craterDensity   0.907
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465
		volcanoTemp     973
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.8
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
		PeriodDays      41.3210483
		SemiMajorAxisKm 1439790.17
		Eccentricity    0.31881353
		Inclination     184.68044
		AscendingNode   102.434299
		ArgOfPericenter 92.9228055
		MeanAnomaly     -102.834522
	}
}

Barycenter	"3-3.1"
{
	ParentBody     "Homestead Prime"
	Mass            0.342176676
	Radius          4117.4917
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       0
	EqAscendNode    -5.72957777e+39


	Orbit
	{
		RefPlane        "Equator"
		Period          2.94939779
		SemiMajorAxis   2.52791646
		Eccentricity    0.00359323642
		Inclination     1.91591612
		AscendingNode   -137.215568
		ArgOfPericenter 183.340279
		MeanAnomaly     247.139754
	}
}

Planet "Homestead Prime C"
{
	ParentBody     "3-3.1"
	Class          "Terra"
	Mass            2.4000001
	Radius          6412
	InertiaMoment   0.328384489
	Obliquity       -0.971168117
	EqAscendNode    135.687697
	TidalLocked     true

	AlbedoBond      0.192
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine"
		Panspermia true
	}

	Surface
	{
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.108
		Randomize      (0.936, -0.071, 0.440)
		colorDistMagn   0.0734
		colorDistFreq   545
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.58
		snowLevel       0.85
		tropicLatitude  0.0171
		icecapLatitude  0.983
		icecapHeight    0.00516
		climatePole     0.938
		climateTropic   0.415
		climateEquator  0.636
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.147
		heightTempGrad  0.523
		beachWidth      0.00109
		tropicWidth     0.142
		mainFreq        0.642
		venusFreq       0.897
		venusMagn       0
		mareFreq        2.37
		mareDensity     0.113
		terraceProb     0.21
		erosion         0
		montesMagn      0.16
		montesFreq      209
		montesSpiky     0.847
		montesFraction  0.95
		dunesMagn       0.0692
		dunesFreq       48.2
		dunesFraction   0.96
		hillsMagn       0.157
		hillsFreq       660
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.76
		riversSin       6.14
		riftsMagn       57.4
		riftsFreq       2.64
		riftsSin        4.99
		canyonsMagn     0.0132
		canyonsFreq     125
		canyonsFraction 0
		cracksMagn      0.0809
		cracksFreq      0.343
		cracksOctaves   0
		craterMagn      0.698
		craterFreq      15.1
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.712
		volcanoFreq     0.925
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.474
		volcanoRadius   0.508
		volcanoTemp     1.09e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.56
		stripeTwist     0.253
		cycloneMagn     2.47
		cycloneFreq     0.723
		cycloneDensity  0.384
		cycloneOctaves  4
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.88
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          15
		Velocity        21.7
		BumpHeight      2.49
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.739
		mainOctaves     10
		Coverage        0.289
		stripeZones     1.56
		stripeTwist     0.253
	}

	Clouds
	{
		Height          15
		Velocity        78.1
		BumpHeight      2.49
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.739
		mainOctaves     10
		Coverage        0.289
		stripeZones     1.56
		stripeTwist     0.253
	}

	Clouds
	{
		Height          15
		Velocity        85.2
		BumpHeight      2.49
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.739
		mainOctaves     10
		Coverage        0.289
		stripeZones     1.56
		stripeTwist     0.253
	}

	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          153.85994
		Density         2.22264266
		Pressure        1.59978521
		Greenhouse      4.31558037
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0.00485
		Saturation      0.873

		Composition
		{
			N2        	67.7
			SO2       	16.1
			CO2       	9.54
			H2S       	4.4
			C2H4      	1.37
			CO        	0.434
			C2H6      	0.261
			C2H2      	0.217
			H2O       	0.0207
			C3H8      	0.00498
			Ar        	0.000735
			Ne        	9.07e-05
			C8H18     	5.16e-05
			Cl2       	1.52e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  7.66
	}

	Aurora
	{
		Height         59.6
		NorthLat       72.9
		NorthLon       158
		NorthRadius    1.16e+03
		NorthWidth     412
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 70.5
		NorthMoveSpeed 1.05
		NorthParticles 50000
		SouthLat       -65.5
		SouthLon       -4.04
		SouthRadius    1.07e+03
		SouthWidth     234
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 56.2
		SouthMoveSpeed 1.19
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
		Period          0.0133801442
		SemiMajorAxis   1.229681e-05
		Eccentricity    0.010769389
		Inclination     -0.971168117
		AscendingNode   135.687697
		ArgOfPericenter 34.239697
		MeanAnomaly     -71.4164045
	}
}

Moon "Homestead Prime C 1"
{
	ParentBody     "3-3.1"
	Class          "Terra"
	Mass            0.00739793619
	Radius          1498.02502
	InertiaMoment   0.384910792
	Obliquity       -0.971168117
	EqAscendNode    135.687697
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_mercury.cfg"
		SurfStyle       0.598
		Randomize      (0.625, 0.905, -0.512)
		colorDistMagn   0.0543
		colorDistFreq   198
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.205
		snowLevel       2
		tropicLatitude  0.0171
		icecapLatitude  2
		icecapHeight    0.33
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.169
		heightTempGrad  0.625
		beachWidth      0.000933
		tropicWidth     0.07
		mainFreq        1.55
		venusFreq       0.634
		venusMagn       0
		mareFreq        0.613
		mareDensity     0.181
		terraceProb     0.174
		erosion         0
		montesMagn      0.0654
		montesFreq      59.7
		montesSpiky     0.911
		montesFraction  0.738
		dunesMagn       0.0258
		dunesFreq       11
		dunesFraction   0.883
		hillsMagn       0.149
		hillsFreq       163
		hillsFraction   0.646
		hills2Fraction  0
		riversMagn      67.6
		riversFreq      3
		riversSin       5.8
		riftsMagn       51.3
		riftsFreq       2.25
		riftsSin        6
		eqridgeMagn     0.421
		eqridgeWidth    0.014
		eqridgeModMagn  2.56
		eqridgeModFreq  8.3
		canyonsMagn     0.357
		canyonsFreq     0.415
		canyonsFraction 0.124
		cracksMagn      0.0401
		cracksFreq      0.855
		cracksOctaves   0
		craterMagn      0.635
		craterFreq      5.44
		craterDensity   0.81
		craterOctaves   19
		craterRayedFactor 0.212
		volcanoMagn     0.198
		volcanoFreq     0.63
		volcanoDensity  0.379
		volcanoOctaves  3
		volcanoActivity 1.22
		volcanoFlows    0.3
		volcanoRadius   0.15
		volcanoTemp     1.06e+03
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
		PeriodDays      4.88699317
		SemiMajorAxisKm 83246.3385
		Eccentricity    0.010769389
		Inclination     -0.971168117
		AscendingNode   135.687697
		ArgOfPericenter -145.760303
		MeanAnomaly     -71.4164045
	}
}

Planet "Homestead Prime D"
{
	ParentBody     "Homestead Prime"
	Class          "Jupiter"
	Mass            591.22699
	Radius          76909.4844
	InertiaMoment   0.237220019
	Oblateness      0.05299142
	RotationPeriod  8.78641117
	RotationEpoch   0
	Obliquity       28.7230466
	EqAscendNode    -135.742924

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_temperate_blue.cfg"
		SurfStyle       0.458
		Randomize      (0.589, -0.806, -0.407)
		detailScale     256
		tropicLatitude  0.501
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.21
		stripeFluct     0.372
		stripeTwist     12
		cycloneMagn     12.9
		cycloneFreq     1.03
		cycloneDensity  0.469
		cycloneOctaves  5
		cycloneMagn2     0.602
		cycloneFreq2     0.407
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      9.93
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
		Height          75.3
		Velocity        496
		BumpHeight      32.7
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.903
		mainOctaves     12
		Coverage        0.548
		stripeZones     6.21
		stripeFluct     0.372
		stripeTwist     12
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          336.993774
		Density         0.00623977324
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.00322
		Saturation      0.969

		Composition
		{
			H2        	90.9
			He        	7.43
			CH4       	1.27
			C8H18     	0.108
			C3H8      	0.102
			C2H2      	0.0883
			C2H4      	0.0411
			N2        	0.0405
			NH3       	0.0325
			C2H6      	0.0162
			O2        	0.00936
			Ne        	0.00137
			Ar        	0.000859
			CO2       	5.56e-05
			H2O       	2.41e-06
			H2S       	1.75e-06
			Kr        	4.95e-07
			Xe        	4.99e-08
			SO2       	9.75e-09
			CO        	9.42e-09
			Cl2       	3.52e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  356
	}

	Aurora
	{
		Height         472
		NorthLat       79.4
		NorthLon       -59.4
		NorthRadius    1.96e+04
		NorthWidth     5.84e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 62.9
		NorthMoveSpeed 0.656
		NorthParticles 10000
		SouthLat       -79.4
		SouthLon       132
		SouthRadius    1.85e+04
		SouthWidth     6.79e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 66.6
		SouthMoveSpeed 1.09
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     9.75e+04
		OuterRadius     4.87e+05
		EdgeRadius      2.5e+05
		MeanRadius      1.48e+05
		Thickness       0.237
		RocksMaxSize    0.00947
		RocksSpacing    1
		DustDrawDist    711
		ChartRadius     2.5e+05
		RotationPeriod  8.24
		Brightness      1
		FrontBright     2.4
		BackBright      1.57
		Density         0.12
		Opacity         0.12
		SelfShadow      0.0601
		PlanetShadow    0.0601
		Hapke           1
		SpotBright      0.994
		SpotWidth       0.0244
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.81
		densityScale    1.51
		densityOffset   -0.298
		densityPower    4.92
		colorContrast   0.0958
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
		Period          4.16710106
		SemiMajorAxis   3.18396388
		Eccentricity    0.00853829638
		Inclination     -1.3487883
		AscendingNode   -139.548406
		ArgOfPericenter 36.0033256
		MeanAnomaly     253.057678
	}
}

DwarfMoon "Homestead Prime D 1"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.47159185e-11
	Radius          2.33472776
	InertiaMoment   0.399647593
	Oblateness     (0.345, 0.506, 0.000)
	Obliquity       -0.00691609382
	EqAscendNode    15.6490265
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.612 0.605 0.602)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.215
		Randomize      (-0.006, -0.163, 0.067)
		colorDistMagn   0.904
		colorDistFreq   0.000455
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.501
		icecapLatitude  2
		icecapHeight    0.474
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43
		heightTempGrad  0.625
		beachWidth      0.00133
		tropicWidth     0.07
		mainFreq        0.369
		venusFreq       0.578
		venusMagn       0.00435
		mareDensity     0
		terraceProb     0.348
		erosion         0
		montesMagn      0.518
		montesFreq      3.46
		montesSpiky     0.965
		montesFraction  0.59
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0141
		hillsFraction   0.32
		hills2Fraction  0
		eqridgeMagn     0.379
		eqridgeWidth    0.102
		eqridgeModMagn  0.442
		eqridgeModFreq  0.166
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.168
		craterDensity   0.985
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503
		volcanoTemp     1.13e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1
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
		PeriodDays      0.319167855
		SemiMajorAxisKm 165581.026
		Eccentricity    3.39151276e-06
		Inclination     -0.00691609382
		AscendingNode   15.6490265
		ArgOfPericenter -156.336879
		MeanAnomaly     120.760577
	}
}

DwarfMoon "Homestead Prime D 2"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.58867076e-11
	Radius          2.89867401
	InertiaMoment   0.399586231
	Oblateness     (0.343, 0.461, 0.000)
	Obliquity       -0.0106451966
	EqAscendNode    105.64185
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.791 0.787 0.785)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.784
		Randomize      (0.264, -0.333, 0.400)
		colorDistMagn   0.919
		colorDistFreq   0.00436
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.501
		icecapLatitude  2
		icecapHeight    0.755
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.327
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.612
		venusFreq       0.594
		venusMagn       0.00665
		mareDensity     0
		terraceProb     0.104
		erosion         0
		montesMagn      0.309
		montesFreq      2.79
		montesSpiky     0.928
		montesFraction  0.667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0196
		hillsFraction   0.58
		hills2Fraction  0
		eqridgeMagn     0.349
		eqridgeWidth    0.121
		eqridgeModMagn  0.496
		eqridgeModFreq  0.27
		canyonsFraction 0
		craterMagn      0.219
		craterFreq      0.234
		craterDensity   0.817
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45
		volcanoTemp     1.18e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.61
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
		PeriodDays      0.3722857
		SemiMajorAxisKm 183477.174
		Eccentricity    8.73927169e-05
		Inclination     -0.0106451966
		AscendingNode   105.64185
		ArgOfPericenter 11.3288093
		MeanAnomaly     145.573161
	}
}

DwarfMoon "Homestead Prime D 3"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.96301011e-11
	Radius          3.47665262
	InertiaMoment   0.39952448
	Oblateness     (0.340, 0.409, 0.000)
	Obliquity       0.00401558325
	EqAscendNode    -43.2460995
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.572 0.569 0.566)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.353
		Randomize      (0.535, -0.502, 0.733)
		colorDistMagn   0.934
		colorDistFreq   0.0102
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.501
		icecapLatitude  2
		icecapHeight    0.623
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.225
		heightTempGrad  0.625
		beachWidth      0.00113
		tropicWidth     0.07
		mainFreq        0.45
		venusFreq       0.609
		venusMagn       0.00949
		mareDensity     0
		terraceProb     0.226
		erosion         0
		montesMagn      0.49
		montesFreq      3.52
		montesSpiky     0.878
		montesFraction  0.767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0252
		hillsFraction   0.683
		hills2Fraction  0
		eqridgeMagn     0.495
		eqridgeWidth    0.143
		eqridgeModMagn  0.545
		eqridgeModFreq  0.166
		canyonsFraction 0
		craterMagn      0.252
		craterFreq      0.19
		craterDensity   0.92
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54
		volcanoTemp     925
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.13
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
		PeriodDays      0.430752547
		SemiMajorAxisKm 202216.4
		Eccentricity    2.63346019e-06
		Inclination     0.00401558325
		AscendingNode   -43.2460995
		ArgOfPericenter -125.051571
		MeanAnomaly     31.2111563
	}
}

DwarfMoon "Homestead Prime D 4"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.12611787e-07
	Radius          39.0189362
	InertiaMoment   0.396371871
	Oblateness     (0.305, 0.054, 0.000)
	Obliquity       0.332481265
	EqAscendNode    9.60430191
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.752 0.750 0.748)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.922
		Randomize      (0.805, -0.672, -0.934)
		colorDistMagn   0.949
		colorDistFreq   0.74
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.506
		icecapLatitude  2
		icecapHeight    0.513
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.123
		heightTempGrad  0.625
		beachWidth      0.000278
		tropicWidth     0.07
		mainFreq        0.708
		venusFreq       0.626
		venusMagn       0.701
		mareDensity     0
		terraceProb     0.36
		erosion         0
		montesMagn      0.624
		montesFreq      2.83
		montesSpiky     0.996
		montesFraction  0.175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.59
		hillsFraction   0.844
		hills2Fraction  0
		eqridgeMagn     0.44
		eqridgeWidth    0.106
		eqridgeModMagn  0.451
		eqridgeModFreq  0.27
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.248
		craterDensity   1.07
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49
		volcanoTemp     973
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
		PeriodDays      0.90032413
		SemiMajorAxisKm 330570.224
		Eccentricity    0.00565841949
		Inclination     0.332481265
		AscendingNode   9.60430191
		ArgOfPericenter 1.6982248
		MeanAnomaly     165.619523
	}
}

Moon "Homestead Prime D 5"
{
	ParentBody     "Homestead Prime D"
	Class          "Terra"
	Mass            0.000845521223
	Radius          717.052979
	InertiaMoment   0.399240524
	Oblateness      0.00259815203
	Obliquity       -0.0679934439
	EqAscendNode    149.493178
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.536 0.533 0.527)

	Surface
	{
		Preset         "terra_airless_mercury.cfg"
		SurfStyle       0.491
		Randomize      (-0.925, -0.842, -0.601)
		colorDistMagn   0.0922
		colorDistFreq   103
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.217
		snowLevel       2
		tropicLatitude  0.502
		icecapLatitude  2
		icecapHeight    0.414
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.421
		heightTempGrad  0.625
		beachWidth      0.00123
		tropicWidth     0.07
		mainFreq        1.81
		venusFreq       1.35
		venusMagn       0
		mareFreq        0.0829
		mareDensity     0.181
		terraceProb     0.114
		erosion         0
		montesMagn      0.0505
		montesFreq      38.3
		montesSpiky     0.985
		montesFraction  0.666
		dunesMagn       0.0341
		dunesFreq       7.72
		dunesFraction   0.0457
		hillsMagn       0.119
		hillsFreq       85
		hillsFraction   0.856
		hills2Fraction  0
		riversMagn      69.7
		riversFreq      3.45
		riversSin       5.29
		riftsMagn       57.1
		riftsFreq       3.33
		riftsSin        5.28
		eqridgeMagn     0.427
		eqridgeWidth    0.0259
		eqridgeModMagn  2.26
		eqridgeModFreq  8.7
		canyonsMagn     0.527
		canyonsFreq     0.258
		canyonsFraction 0.364
		cracksMagn      0.0504
		cracksFreq      0.192
		cracksOctaves   0
		craterMagn      0.674
		craterFreq      1.46
		craterDensity   0.866
		craterOctaves   18
		craterRayedFactor 0.181
		volcanoMagn     0.191
		volcanoFreq     0.765
		volcanoDensity  0.305
		volcanoOctaves  3
		volcanoActivity 0.593
		volcanoFlows    0.0792
		volcanoRadius   0.142
		volcanoTemp     975
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
		PeriodDays      1.66596597
		SemiMajorAxisKm 498244.025
		Eccentricity    0.00140389744
		Inclination     -0.0679934439
		AscendingNode   149.493178
		ArgOfPericenter 58.3711222
		MeanAnomaly     -23.1395903
	}
}

Moon "Homestead Prime D 6"
{
	ParentBody     "Homestead Prime D"
	Class          "Terra"
	Mass            0.000975607836
	Radius          775.852661
	InertiaMoment   0.39808616
	Obliquity       0.119427416
	EqAscendNode    -32.008973
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.716 0.711 0.709)

	Surface
	{
		Preset         "terra_airless_default.cfg"
		SurfStyle       0.0601
		Randomize      (-0.654, 0.988, -0.268)
		colorDistMagn   0.095
		colorDistFreq   91.1
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.215
		snowLevel       2
		tropicLatitude  0.503
		icecapLatitude  2
		icecapHeight    0.3
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.318
		heightTempGrad  0.625
		beachWidth      0.000974
		tropicWidth     0.07
		mainFreq        1.6
		venusFreq       1.58
		venusMagn       0
		mareFreq        0.148
		mareDensity     0.143
		terraceProb     0.235
		erosion         0
		montesMagn      0.0549
		montesFreq      36
		montesSpiky     0.959
		montesFraction  0.631
		dunesMagn       0.042
		dunesFreq       6.66
		dunesFraction   0.549
		hillsMagn       0.144
		hillsFreq       81.6
		hillsFraction   0.588
		hills2Fraction  0
		riversMagn      64.8
		riversFreq      3.58
		riversSin       5.51
		riftsMagn       59
		riftsFreq       3.63
		riftsSin        4.53
		eqridgeMagn     0.379
		eqridgeWidth    0.0205
		eqridgeModMagn  2.43
		eqridgeModFreq  10.9
		canyonsMagn     0.481
		canyonsFreq     0.329
		canyonsFraction 0.899
		cracksMagn      0.0675
		cracksFreq      0.374
		cracksOctaves   0
		craterMagn      0.618
		craterFreq      2.36
		craterDensity   0.942
		craterOctaves   18
		craterRayedFactor 0.108
		volcanoMagn     0.19
		volcanoFreq     0.566
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.627
		volcanoFlows    0.254
		volcanoRadius   0.159
		volcanoTemp     882
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
		PeriodDays      3.08271683
		SemiMajorAxisKm 750966.33
		Eccentricity    0.00523719982
		Inclination     0.119427416
		AscendingNode   -32.008973
		ArgOfPericenter 5.2935855
		MeanAnomaly     -10.8241088
	}
}

Moon "Homestead Prime D 7"
{
	ParentBody     "Homestead Prime D"
	Class          "Terra"
	Mass            0.0128271617
	Radius          1761.49841
	InertiaMoment   0.375476837
	Obliquity       -1.28072105
	EqAscendNode    140.984319
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.500 0.492 0.487)

	Surface
	{
		Preset         "terra_airless_moon.cfg"
		SurfStyle       0.629
		Randomize      (-0.384, 0.818, 0.065)
		colorDistMagn   0.0988
		colorDistFreq   246
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.212
		snowLevel       2
		tropicLatitude  0.516
		icecapLatitude  2
		icecapHeight    0.563
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.216
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        1.89
		venusFreq       0.465
		venusMagn       0
		mareFreq        0.78
		mareDensity     0.185
		terraceProb     0.372
		erosion         0
		montesMagn      0.0834
		montesFreq      69.2
		montesSpiky     0.929
		montesFraction  0.595
		dunesMagn       0.0519
		dunesFreq       10
		dunesFraction   0.0528
		hillsMagn       0.124
		hillsFreq       225
		hillsFraction   0.319
		hills2Fraction  0
		riversMagn      62.5
		riversFreq      3.75
		riversSin       5.71
		riftsMagn       60.7
		riftsFreq       4.13
		riftsSin        7.3
		eqridgeMagn     0.496
		eqridgeWidth    0.0291
		eqridgeModMagn  2.59
		eqridgeModFreq  9.07
		canyonsMagn     0.43
		canyonsFreq     0.561
		canyonsFraction 0.434
		cracksMagn      0.036
		cracksFreq      0.473
		cracksOctaves   0
		craterMagn      0.58
		craterFreq      4.52
		craterDensity   0.794
		craterOctaves   19
		craterRayedFactor 0.243
		volcanoMagn     0.265
		volcanoFreq     0.684
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.86
		volcanoFlows    0.474
		volcanoRadius   0.188
		volcanoTemp     1.09e+03
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
		PeriodDays      5.70422755
		SemiMajorAxisKm 1131875.95
		Eccentricity    0.0131675163
		Inclination     -1.28072105
		AscendingNode   140.984319
		ArgOfPericenter 164.797369
		MeanAnomaly     -110.825082
	}
}

DwarfMoon "Homestead Prime D 8"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.12987169e-10
	Radius          7.19683552
	InertiaMoment   0.399207503
	Obliquity       169.357036
	EqAscendNode    -23.6580709
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.677 0.675 0.673)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.198
		Randomize      (-0.113, 0.648, 0.398)
		colorDistMagn   0.0259
		colorDistFreq   0.0216
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.354
		icecapLatitude  2
		icecapHeight    0.398
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.114
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.428
		venusFreq       0.557
		venusMagn       0.679
		mareDensity     0
		terraceProb     0.123
		erosion         0
		montesMagn      0.543
		montesFreq      2.91
		montesSpiky     0.995
		montesFraction  0.597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.107
		hillsFraction   0.542
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.16
		craterDensity   0.903
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515
		volcanoTemp     1.18e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.48
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
		PeriodDays      77.6284286
		SemiMajorAxisKm 6451761.96
		Eccentricity    0.264720044
		Inclination     169.357036
		AscendingNode   -23.6580709
		ArgOfPericenter 39.0788102
		MeanAnomaly     -45.4795968
	}
}

DwarfMoon "Homestead Prime D 9"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.03366649e-09
	Radius          8.20388126
	InertiaMoment   0.399141908
	Obliquity       45.2863573
	EqAscendNode    -50.9078852
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.459 0.456 0.453)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.767
		Randomize      (0.157, 0.478, 0.731)
		colorDistMagn   0.0581
		colorDistFreq   0.0469
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
		icecapLatitude  2
		icecapHeight    0.763
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.411
		heightTempGrad  0.625
		beachWidth      0.000818
		tropicWidth     0.07
		mainFreq        0.676
		venusFreq       0.576
		venusMagn       0.673
		mareDensity     0
		terraceProb     0.244
		erosion         0
		montesMagn      0.384
		montesFreq      3.81
		montesSpiky     0.963
		montesFraction  0.675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112
		hillsFraction   0.651
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22
		craterFreq      0.231
		craterDensity   1.02
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.593
		volcanoTemp     1.23e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.38
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
		PeriodDays      78.8040668
		SemiMajorAxisKm 6516737.48
		Eccentricity    0.25955218
		Inclination     45.2863573
		AscendingNode   -50.9078852
		ArgOfPericenter -122.653137
		MeanAnomaly     157.357416
	}
}

DwarfMoon "Homestead Prime D 10"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.47814105e-09
	Radius          9.1703968
	InertiaMoment   0.399075359
	Obliquity       177.729792
	EqAscendNode    -127.799268
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.640 0.638 0.634)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.336
		Randomize      (0.427, 0.308, -0.936)
		colorDistMagn   0.0878
		colorDistFreq   0.0318
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.523
		icecapLatitude  2
		icecapHeight    0.673
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.309
		heightTempGrad  0.625
		beachWidth      0.00147
		tropicWidth     0.07
		mainFreq        0.5
		venusFreq       0.593
		venusMagn       0.668
		mareDensity     0
		terraceProb     0.385
		erosion         0
		montesMagn      0.514
		montesFreq      2.96
		montesSpiky     0.926
		montesFraction  0.78
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.241
		hillsFraction   0.771
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.186
		craterDensity   0.845
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476
		volcanoTemp     980
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.25
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
		PeriodDays      79.8834237
		SemiMajorAxisKm 6576107.73
		Eccentricity    0.453985168
		Inclination     177.729792
		AscendingNode   -127.799268
		ArgOfPericenter -151.083646
		MeanAnomaly     89.1115507
	}
}

DwarfMoon "Homestead Prime D 11"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.08966178e-09
	Radius          10.3815346
	InertiaMoment   0.399007797
	Obliquity       175.36889
	EqAscendNode    -84.2076395
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.423 0.416 0.414)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.905
		Randomize      (0.698, 0.138, -0.603)
		colorDistMagn   0.115
		colorDistFreq   0.071
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.499
		icecapLatitude  2
		icecapHeight    0.607
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.207
		heightTempGrad  0.625
		beachWidth      0.000913
		tropicWidth     0.07
		mainFreq        0.306
		venusFreq       0.608
		venusMagn       0.663
		mareDensity     0
		terraceProb     0.132
		erosion         0
		montesMagn      0.271
		montesFreq      4.03
		montesSpiky     0.873
		montesFraction  0.209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274
		hillsFraction   0.519
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23
		craterFreq      0.244
		craterDensity   0.943
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522
		volcanoTemp     1.13e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.34
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
		PeriodDays      81.1467066
		SemiMajorAxisKm 6645256.33
		Eccentricity    0.358165031
		Inclination     175.36889
		AscendingNode   -84.2076395
		ArgOfPericenter -76.0866897
		MeanAnomaly     3.77049244
	}
}

DwarfMoon "Homestead Prime D 12"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.92604452e-09
	Radius          11.5066118
	InertiaMoment   0.398939073
	RotationPeriod  790.870984
	Obliquity       143.67877
	EqAscendNode    178.125885

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.604 0.598 0.595)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.474
		Randomize      (0.968, -0.032, -0.270)
		colorDistMagn   0.141
		colorDistFreq   0.0443
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.916
		icecapLatitude  2
		icecapHeight    0.542
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.104
		heightTempGrad  0.625
		beachWidth      0.000661
		tropicWidth     0.07
		mainFreq        0.569
		venusFreq       0.625
		venusMagn       0.657
		mareDensity     0
		terraceProb     0.253
		erosion         0
		montesMagn      0.486
		montesFreq      3
		montesSpiky     0.994
		montesFraction  0.371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.305
		hillsFraction   0.635
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.264
		craterFreq      0.202
		craterDensity   0.751
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.395
		volcanoTemp     1.18e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.4
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
		PeriodDays      82.3823929
		SemiMajorAxisKm 6712548.05
		Eccentricity    0.345055555
		Inclination     143.67877
		AscendingNode   178.125885
		ArgOfPericenter -53.6194612
		MeanAnomaly     154.114802
	}
}

DwarfMoon "Homestead Prime D 13"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.06472989e-09
	Radius          13.0097351
	InertiaMoment   0.398869097
	RotationPeriod  1335.90575
	Obliquity       198.316785
	EqAscendNode    -55.6970029

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.784 0.780 0.778)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0435
		Randomize      (-0.761, -0.202, 0.063)
		colorDistMagn   0.166
		colorDistFreq   0.106
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.681
		icecapLatitude  2
		icecapHeight    0.461
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.402
		heightTempGrad  0.625
		beachWidth      0.000409
		tropicWidth     0.07
		mainFreq        0.406
		venusFreq       0.645
		venusMagn       0.652
		mareDensity     0
		terraceProb     0.399
		erosion         0
		montesMagn      0.615
		montesFreq      1.88
		montesSpiky     0.961
		montesFraction  0.46
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.346
		hillsFraction   0.747
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.238
		craterFreq      0.259
		craterDensity   0.886
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483
		volcanoTemp     1.02e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.7
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
		PeriodDays      83.4941072
		SemiMajorAxisKm 6772801.63
		Eccentricity    0.133806211
		Inclination     198.316785
		AscendingNode   -55.6970029
		ArgOfPericenter 18.5134644
		MeanAnomaly     31.1783683
	}
}

DwarfMoon "Homestead Prime D 14"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            5.60961233e-09
	Radius          14.3850918
	InertiaMoment   0.398797691
	RotationPeriod  816.881517
	Obliquity       212.61813
	EqAscendNode    -147.953001

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.564 0.562 0.560)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.613
		Randomize      (-0.491, -0.372, 0.396)
		colorDistMagn   0.189
		colorDistFreq   0.0586
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.289
		icecapLatitude  2
		icecapHeight    0.85
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3
		heightTempGrad  0.625
		beachWidth      0.000757
		tropicWidth     0.07
		mainFreq        0.648
		venusFreq       0.677
		venusMagn       0.647
		mareDensity     0
		terraceProb     0.141
		erosion         0
		montesMagn      0.456
		montesFreq      3.04
		montesSpiky     0.924
		montesFraction  0.533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.335
		hillsFraction   0.492
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.203
		craterFreq      0.215
		craterDensity   0.992
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529
		volcanoTemp     1.17e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.9
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
		PeriodDays      85.0918234
		SemiMajorAxisKm 6858929.82
		Eccentricity    0.400561478
		Inclination     212.61813
		AscendingNode   -147.953001
		ArgOfPericenter 59.7787831
		MeanAnomaly     -64.3770837
	}
}

DwarfMoon "Homestead Prime D 15"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.7004918e-09
	Radius          15.8399296
	InertiaMoment   0.398724705
	Obliquity       36.6624324
	EqAscendNode    -61.0730731
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.745 0.743 0.741)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.182
		Randomize      (-0.221, -0.542, 0.729)
		colorDistMagn   0.212
		colorDistFreq   0.148
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.836
		icecapLatitude  2
		icecapHeight    0.71
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.198
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        0.48
		venusFreq       0.523
		venusMagn       0.642
		mareDensity     0
		terraceProb     0.262
		erosion         0
		montesMagn      0.571
		montesFreq      2.15
		montesSpiky     0.87
		montesFraction  0.604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.713
		hillsFraction   0.619
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.245
		craterFreq      0.147
		craterDensity   0.824
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425
		volcanoTemp     1.02e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.3
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
		PeriodDays      86.2063144
		SemiMajorAxisKm 6918689.77
		Eccentricity    0.0713990813
		Inclination     36.6624324
		AscendingNode   -61.0730731
		ArgOfPericenter -69.7090739
		MeanAnomaly     -52.0984153
	}
}

DwarfMoon "Homestead Prime D 16"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.05261657e-08
	Radius          17.7380028
	InertiaMoment   0.398649991
	RotationPeriod  697.789659
	Obliquity       220.776244
	EqAscendNode    -44.598015

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.529 0.526 0.520)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.751
		Randomize      (0.050, -0.712, -0.938)
		colorDistMagn   0.233
		colorDistFreq   0.0686
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.907
		icecapLatitude  2
		icecapHeight    0.637
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.495
		heightTempGrad  0.625
		beachWidth      0.00175
		tropicWidth     0.07
		mainFreq        0.262
		venusFreq       0.555
		venusMagn       0.636
		mareDensity     0
		terraceProb     0.413
		erosion         0
		montesMagn      0.422
		montesFreq      3.08
		montesSpiky     0.993
		montesFraction  0.683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.796
		hillsFraction   0.726
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.222
		craterFreq      0.228
		craterDensity   0.925
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49
		volcanoTemp     1.17e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16
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
		PeriodDays      87.2237048
		SemiMajorAxisKm 6973018.63
		Eccentricity    0.477084625
		Inclination     220.776244
		AscendingNode   -44.598015
		ArgOfPericenter 157.821338
		MeanAnomaly     94.0865609
	}
}

DwarfMoon "Homestead Prime D 17"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.43425609e-08
	Radius          19.4758911
	InertiaMoment   0.398573339
	Obliquity       228.77586
	EqAscendNode    138.06129
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.768 0.682 0.643)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.32
		Randomize      (0.320, -0.881, -0.605)
		colorDistMagn   0.253
		colorDistFreq   0.212
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.524
		icecapLatitude  2
		icecapHeight    0.574
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.393
		heightTempGrad  0.625
		beachWidth      0.000901
		tropicWidth     0.07
		mainFreq        0.549
		venusFreq       0.575
		venusMagn       0.631
		mareDensity     0
		terraceProb     0.15
		erosion         0
		montesMagn      0.539
		montesFreq      2.29
		montesSpiky     0.96
		montesFraction  0.793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.868
		hillsFraction   0.455
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.254
		craterFreq      0.181
		craterDensity   1.1
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537
		volcanoTemp     1.11e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.5
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
		PeriodDays      88.8506295
		SemiMajorAxisKm 7059459.95
		Eccentricity    0.17433014
		Inclination     228.77586
		AscendingNode   138.06129
		ArgOfPericenter 157.815565
		MeanAnomaly     -165.764219
	}
}

DwarfMoon "Homestead Prime D 18"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.94983372e-08
	Radius          21.8165951
	InertiaMoment   0.398494542
	RotationPeriod  871.018617
	Obliquity       194.609754
	EqAscendNode    7.43393172

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.607 0.461 0.367)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.889
		Randomize      (0.590, 0.949, -0.272)
		colorDistMagn   0.273
		colorDistFreq   0.0553
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.702
		icecapLatitude  2
		icecapHeight    0.504
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.291
		heightTempGrad  0.625
		beachWidth      0.000948
		tropicWidth     0.07
		mainFreq        0.382
		venusFreq       0.592
		venusMagn       0.625
		mareDensity     0
		terraceProb     0.271
		erosion         0
		montesMagn      0.375
		montesFreq      3.12
		montesSpiky     0.922
		montesFraction  0.235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.966
		hillsFraction   0.603
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.24
		craterDensity   0.869
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441
		volcanoTemp     961
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.6
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
		PeriodDays      90.7311046
		SemiMajorAxisKm 7158718.27
		Eccentricity    0.363244036
		Inclination     194.609754
		AscendingNode   7.43393172
		ArgOfPericenter -74.206839
		MeanAnomaly     130.17369
	}
}

DwarfMoon "Homestead Prime D 19"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.64711844e-08
	Radius          23.8750687
	InertiaMoment   0.39841333
	RotationPeriod  738.920687
	Obliquity       184.36634
	EqAscendNode    44.7443412

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.761 0.662 0.575)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.458
		Randomize      (0.861, 0.779, 0.061)
		colorDistMagn   0.292
		colorDistFreq   0.3
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.549
		icecapLatitude  2
		icecapHeight    0.391
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.188
		heightTempGrad  0.625
		beachWidth      0.000996
		tropicWidth     0.07
		mainFreq        0.623
		venusFreq       0.607
		venusMagn       0.62
		mareDensity     0
		terraceProb     0.429
		erosion         0
		montesMagn      0.51
		montesFreq      2.38
		montesSpiky     0.868
		montesFraction  0.381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.895
		hillsFraction   0.707
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.266
		craterFreq      0.198
		craterDensity   0.969
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496
		volcanoTemp     1.21e+03
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
		PeriodDays      92.3650832
		SemiMajorAxisKm 7244410.02
		Eccentricity    0.455659957
		Inclination     184.36634
		AscendingNode   44.7443412
		ArgOfPericenter 111.505397
		MeanAnomaly     -80.4389321
	}
}

DwarfMoon "Homestead Prime D 20"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            3.59195766e-08
	Radius          26.9229069
	InertiaMoment   0.398329407
	RotationPeriod  743.69944
	Obliquity       193.967636
	EqAscendNode    31.9879774

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.501 0.454 0.397)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.027
		Randomize      (-0.869, 0.609, 0.394)
		colorDistMagn   0.311
		colorDistFreq   0.619
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.675
		icecapLatitude  2
		icecapHeight    0.758
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.486
		heightTempGrad  0.625
		beachWidth      0.00134
		tropicWidth     0.07
		mainFreq        0.46
		venusFreq       0.624
		venusMagn       0.614
		mareDensity     0
		terraceProb     0.159
		erosion         0
		montesMagn      0.688
		montesFreq      3.16
		montesSpiky     0.992
		montesFraction  0.467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.04
		hillsFraction   0.389
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.255
		craterDensity   0.798
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545
		volcanoTemp     1.16e+03
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
		PeriodDays      92.9624272
		SemiMajorAxisKm 7275610.51
		Eccentricity    0.474032046
		Inclination     193.967636
		AscendingNode   31.9879774
		ArgOfPericenter 154.225792
		MeanAnomaly     153.128916
	}
}

DwarfMoon "Homestead Prime D 21"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.87579044e-08
	Radius          29.4706802
	InertiaMoment   0.398242444
	Obliquity       141.191966
	EqAscendNode    169.702322
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.686 0.644 0.575)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.596
		Randomize      (-0.598, 0.439, 0.727)
		colorDistMagn   0.329
		colorDistFreq   0.428
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.931
		icecapLatitude  2
		icecapHeight    0.67
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.384
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.727
		venusFreq       0.643
		venusMagn       0.608
		mareDensity     0
		terraceProb     0.28
		erosion         0
		montesMagn      0.481
		montesFreq      2.46
		montesSpiky     0.959
		montesFraction  0.54
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.18
		hillsFraction   0.586
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.207
		craterFreq      0.212
		craterDensity   0.908
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452
		volcanoTemp     1e+03
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
		PeriodDays      94.3692259
		SemiMajorAxisKm 7348827.74
		Eccentricity    0.0855841122
		Inclination     141.191966
		AscendingNode   169.702322
		ArgOfPericenter 8.54845444
		MeanAnomaly     -158.048594
	}
}

DwarfMoon "Homestead Prime D 22"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            6.62661037e-08
	Radius          32.2805061
	InertiaMoment   0.398151994
	Obliquity       199.005262
	EqAscendNode    16.8081865
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.487 0.379 0.335)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.165
		Randomize      (-0.328, 0.269, -0.940)
		colorDistMagn   0.347
		colorDistFreq   0.828
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.749
		icecapLatitude  2
		icecapHeight    0.604
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.282
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.529
		venusFreq       0.674
		venusMagn       0.602
		mareDensity     0
		terraceProb     0.447
		erosion         0
		montesMagn      0.607
		montesFreq      3.2
		montesSpiky     0.921
		montesFraction  0.611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37
		hillsFraction   0.69
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.246
		craterFreq      0.275
		craterDensity   1.03
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
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
		PeriodDays      94.9812162
		SemiMajorAxisKm 7380565.23
		Eccentricity    0.201400213
		Inclination     199.005262
		AscendingNode   16.8081865
		ArgOfPericenter -79.9307709
		MeanAnomaly     -28.3671107
	}
}

DwarfMoon "Homestead Prime D 23"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            9.02520796e-08
	Radius          36.1828995
	InertiaMoment   0.39805764
	Obliquity       215.513456
	EqAscendNode    106.896337
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.682 0.569 0.503)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.734
		Randomize      (-0.058, 0.099, -0.607)
		colorDistMagn   0.364
		colorDistFreq   0.601
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.613
		icecapLatitude  2
		icecapHeight    0.539
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.179
		heightTempGrad  0.625
		beachWidth      0.000888
		tropicWidth     0.07
		mainFreq        0.355
		venusFreq       0.52
		venusMagn       0.595
		mareDensity     0
		terraceProb     0.168
		erosion         0
		montesMagn      0.451
		montesFreq      2.53
		montesSpiky     0.865
		montesFraction  0.692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63
		hillsFraction   0.87
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.223
		craterFreq      0.225
		craterDensity   0.85
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556
		volcanoTemp     1.1e+03
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
		PeriodDays      96.3958398
		SemiMajorAxisKm 7453667.23
		Eccentricity    0.195144132
		Inclination     215.513456
		AscendingNode   106.896337
		ArgOfPericenter 0.324666817
		MeanAnomaly     -89.7160239
	}
}

DwarfMoon "Homestead Prime D 24"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.23296019e-07
	Radius          39.6641235
	InertiaMoment   0.397958726
	RotationPeriod  1040.93344
	Obliquity       -43.0666897
	EqAscendNode    25.334424

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.831 0.768 0.716)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.303
		Randomize      (0.213, -0.071, -0.274)
		colorDistMagn   0.381
		colorDistFreq   1.17
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.338
		icecapLatitude  2
		icecapHeight    0.457
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.477
		heightTempGrad  0.625
		beachWidth      0.00124
		tropicWidth     0.07
		mainFreq        0.601
		venusFreq       0.554
		venusMagn       0.589
		mareDensity     0
		terraceProb     0.289
		erosion         0
		montesMagn      0.566
		montesFreq      3.25
		montesSpiky     0.991
		montesFraction  0.808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37
		hillsFraction   0.569
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.175
		craterDensity   0.949
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     948
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
		PeriodDays      98.0787829
		SemiMajorAxisKm 7540170.81
		Eccentricity    0.421095266
		Inclination     -43.0666897
		AscendingNode   25.334424
		ArgOfPericenter 0.363799911
		MeanAnomaly     -172.838332
	}
}

DwarfMoon "Homestead Prime D 25"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.69122131e-07
	Radius          44.7101059
	InertiaMoment   0.397854537
	RotationPeriod  952.864158
	Obliquity       220.635557
	EqAscendNode    -65.2421462

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.683 0.561 0.427)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.872
		Randomize      (0.483, -0.241, 0.059)
		colorDistMagn   0.397
		colorDistFreq   0.847
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.855
		icecapLatitude  2
		icecapHeight    0.839
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.375
		heightTempGrad  0.625
		beachWidth      0.00128
		tropicWidth     0.07
		mainFreq        0.439
		venusFreq       0.574
		venusMagn       0.582
		mareDensity     0
		terraceProb     0.467
		erosion         0
		montesMagn      0.416
		montesFreq      2.59
		montesSpiky     0.958
		montesFraction  0.257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.59
		hillsFraction   0.673
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.232
		craterFreq      0.237
		craterDensity   0.764
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508
		volcanoTemp     1.1e+03
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
		PeriodDays      99.2566817
		SemiMajorAxisKm 7600420.84
		Eccentricity    0.368498652
		Inclination     220.635557
		AscendingNode   -65.2421462
		ArgOfPericenter 48.8485588
		MeanAnomaly     141.569231
	}
}

DwarfMoon "Homestead Prime D 26"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.33176024e-07
	Radius          49.4495583
	InertiaMoment   0.397744209
	RotationPeriod  1209.24191
	Obliquity       154.569994
	EqAscendNode    -91.5356417

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.769 0.743 0.704)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.441
		Randomize      (0.754, -0.411, 0.392)
		colorDistMagn   0.413
		colorDistFreq   1.72
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.63
		icecapLatitude  2
		icecapHeight    0.707
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.272
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.691
		venusFreq       0.591
		venusMagn       0.574
		mareDensity     0
		terraceProb     0.177
		erosion         0
		montesMagn      0.534
		montesFreq      3.29
		montesSpiky     0.919
		montesFraction  0.39
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.11
		hillsFraction   0.815
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.267
		craterFreq      0.194
		craterDensity   0.891
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569
		volcanoTemp     1.14e+03
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
		PeriodDays      100.770159
		SemiMajorAxisKm 7677487.22
		Eccentricity    0.269962024
		Inclination     154.569994
		AscendingNode   -91.5356417
		ArgOfPericenter -110.153904
		MeanAnomaly     -119.000769
	}
}

DwarfMoon "Homestead Prime D 27"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            3.23537336e-07
	Radius          54.1904259
	InertiaMoment   0.397626549
	RotationPeriod  991.668469
	RotationEpoch   0
	Obliquity       223.741589
	EqAscendNode    68.8673893

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.593 0.482 0.441)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0105
		Randomize      (-0.976, -0.581, 0.725)
		colorDistMagn   0.429
		colorDistFreq   1.13
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.865
		icecapLatitude  2
		icecapHeight    0.635
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17
		heightTempGrad  0.625
		beachWidth      0.00138
		tropicWidth     0.07
		mainFreq        0.509
		venusFreq       0.606
		venusMagn       0.567
		mareDensity     0
		terraceProb     0.299
		erosion         0
		montesMagn      0.365
		montesFreq      2.64
		montesSpiky     0.862
		montesFraction  0.474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.64
		hillsFraction   0.55
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.239
		craterFreq      0.251
		craterDensity   1
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469
		volcanoTemp     991
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
		PeriodDays      101.791807
		SemiMajorAxisKm 7729291.53
		Eccentricity    0.317401649
		Inclination     229.560211
		AscendingNode   70.2980044
		ArgOfPericenter 24.4569061
		MeanAnomaly     -89.20754
	}
}

DwarfMoon "Homestead Prime D 28"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.52390793e-07
	Radius          61.5674629
	InertiaMoment   0.397500008
	Obliquity       229.171002
	EqAscendNode    103.819962
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.756 0.680 0.641)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.58
		Randomize      (-0.706, -0.751, -0.942)
		colorDistMagn   0.444
		colorDistFreq   2.53
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.753
		icecapLatitude  2
		icecapHeight    0.571
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.468
		heightTempGrad  0.625
		beachWidth      0.000827
		tropicWidth     0.07
		mainFreq        0.323
		venusFreq       0.623
		venusMagn       0.558
		mareDensity     0
		terraceProb     0.489
		erosion         0
		montesMagn      0.505
		montesFreq      3.34
		montesSpiky     0.989
		montesFraction  0.547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.55
		hillsFraction   0.657
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.209
		craterFreq      0.209
		craterDensity   0.83
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515
		volcanoTemp     1.14e+03
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
		PeriodDays      102.655535
		SemiMajorAxisKm 7772953.18
		Eccentricity    0.0551914265
		Inclination     229.171002
		AscendingNode   103.819962
		ArgOfPericenter -135.975301
		MeanAnomaly     -152.620971
	}
}

DwarfMoon "Homestead Prime D 29"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            6.38460904e-07
	Radius          68.0565872
	InertiaMoment   0.39736262
	RotationPeriod  994.60157
	Obliquity       130.730926
	EqAscendNode    91.9249495

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.588 0.463 0.371)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.149
		Randomize      (-0.435, -0.921, -0.609)
		colorDistMagn   0.46
		colorDistFreq   1.59
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.835
		icecapLatitude  2
		icecapHeight    0.501
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.366
		heightTempGrad  0.625
		beachWidth      0.000875
		tropicWidth     0.07
		mainFreq        0.579
		venusFreq       0.642
		venusMagn       0.549
		mareDensity     0
		terraceProb     0.185
		erosion         0
		montesMagn      0.667
		montesFreq      2.69
		montesSpiky     0.956
		montesFraction  0.618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.6
		hillsFraction   0.782
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.247
		craterFreq      0.269
		craterDensity   0.93
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592
		volcanoTemp     987
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
		PeriodDays      103.604329
		SemiMajorAxisKm 7820774.06
		Eccentricity    0.398454929
		Inclination     130.730926
		AscendingNode   91.9249495
		ArgOfPericenter -123.48703
		MeanAnomaly     -58.4602625
	}
}

DwarfMoon "Homestead Prime D 30"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            9.11140148e-07
	Radius          77.7126236
	InertiaMoment   0.397211492
	Obliquity       227.973182
	EqAscendNode    -131.694346
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.665 0.661 0.656)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.718
		Randomize      (-0.165, 0.909, -0.276)
		colorDistMagn   0.475
		colorDistFreq   3.81
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.564
		icecapLatitude  2
		icecapHeight    0.383
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.263
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        0.417
		venusFreq       0.671
		venusMagn       0.539
		mareDensity     0
		terraceProb     0.309
		erosion         0
		montesMagn      0.477
		montesFreq      3.39
		montesSpiky     0.918
		montesFraction  0.701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.8
		hillsFraction   0.528
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.224
		craterFreq      0.221
		craterDensity   0.694
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476
		volcanoTemp     1.03e+03
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
		PeriodDays      105.063819
		SemiMajorAxisKm 7894051.01
		Eccentricity    0.0616238099
		Inclination     227.973182
		AscendingNode   -131.694346
		ArgOfPericenter -99.2806548
		MeanAnomaly     -126.625208
	}
}

DwarfMoon "Homestead Prime D 31"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.3177181e-06
	Radius          86.3737793
	InertiaMoment   0.397042513
	RotationPeriod  474.968861
	RotationEpoch   0
	Obliquity       180.867476
	EqAscendNode    44.8528661

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.448 0.443 0.435)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.287
		Randomize      (0.105, 0.739, 0.057)
		colorDistMagn   0.49
		colorDistFreq   2.2
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.51
		icecapLatitude  2
		icecapHeight    0.753
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.161
		heightTempGrad  0.625
		beachWidth      0.00127
		tropicWidth     0.07
		mainFreq        0.661
		venusFreq       0.516
		venusMagn       0.527
		mareDensity     0
		terraceProb     0.516
		erosion         0
		montesMagn      0.6
		montesFreq      2.74
		montesSpiky     0.859
		montesFraction  0.825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.5
		hillsFraction   0.641
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.256
		craterFreq      0.196
		craterDensity   0.874
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522
		volcanoTemp     982
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
		PeriodDays      107.038783
		SemiMajorAxisKm 7992670.59
		Eccentricity    0.295563885
		Inclination     185.759189
		AscendingNode   45.3557117
		ArgOfPericenter -148.899931
		MeanAnomaly     -158.981928
	}
}

DwarfMoon "Homestead Prime D 32"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.93647156e-06
	Radius          100.653679
	InertiaMoment   0.396849334
	RotationPeriod  863.26712
	Obliquity       159.882355
	EqAscendNode    18.1899723

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.626 0.624 0.621)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.856
		Randomize      (0.376, 0.570, 0.390)
		colorDistMagn   0.504
		colorDistFreq   6.06
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.217
		icecapLatitude  2
		icecapHeight    0.667
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.459
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        0.49
		venusFreq       0.552
		venusMagn       0.513
		mareDensity     0
		terraceProb     0.194
		erosion         0
		montesMagn      0.447
		montesFreq      3.45
		montesSpiky     0.988
		montesFraction  0.275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.7
		hillsFraction   0.756
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.37
		craterDensity   0.975
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.394
		volcanoTemp     1.03e+03
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
		PeriodDays      107.908387
		SemiMajorAxisKm 8035901.52
		Eccentricity    0.484128875
		Inclination     159.882355
		AscendingNode   18.1899723
		ArgOfPericenter -64.4789112
		MeanAnomaly     -51.3200279
	}
}

DwarfMoon "Homestead Prime D 33"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.90138587e-06
	Radius          113.047035
	InertiaMoment   0.396621257
	Obliquity       -15.7709019
	EqAscendNode    -163.74012
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.408 0.403 0.401)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.425
		Randomize      (0.646, 0.400, 0.723)
		colorDistMagn   0.519
		colorDistFreq   2.98
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.712
		icecapLatitude  2
		icecapHeight    0.602
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.356
		heightTempGrad  0.625
		beachWidth      0.000766
		tropicWidth     0.07
		mainFreq        0.285
		venusFreq       0.573
		venusMagn       0.495
		mareDensity     0
		terraceProb     0.319
		erosion         0
		montesMagn      0.561
		montesFreq      2.78
		montesSpiky     0.955
		montesFraction  0.399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.2
		hillsFraction   0.503
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.269
		craterFreq      0.379
		craterDensity   0.806
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483
		volcanoTemp     1.08e+03
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
		PeriodDays      109.175577
		SemiMajorAxisKm 8098690.52
		Eccentricity    0.370540342
		Inclination     -15.7709019
		AscendingNode   -163.74012
		ArgOfPericenter -75.292032
		MeanAnomaly     81.5256483
	}
}

DwarfMoon "Homestead Prime D 34"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.45106753e-06
	Radius          125.633789
	InertiaMoment   0.396338224
	Obliquity       -15.1498216
	EqAscendNode    -110.362414
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.590 0.585 0.581)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.994
		Randomize      (0.917, 0.230, -0.944)
		colorDistMagn   0.533
		colorDistFreq   8.92
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.613
		icecapLatitude  2
		icecapHeight    0.537
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.254
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.558
		venusFreq       0.59
		venusMagn       0.469
		mareDensity     0
		terraceProb     0.551
		erosion         0
		montesMagn      0.41
		montesFreq      3.52
		montesSpiky     0.916
		montesFraction  0.482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.5
		hillsFraction   0.625
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24
		craterFreq      0.61
		craterDensity   0.913
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529
		volcanoTemp     1.03e+03
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
		PeriodDays      110.582072
		SemiMajorAxisKm 8168098.3
		Eccentricity    0.262481697
		Inclination     -15.1498216
		AscendingNode   -110.362414
		ArgOfPericenter 27.3819913
		MeanAnomaly     -111.528717
	}
}

DwarfMoon "Homestead Prime D 35"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.2010979e-11
	Radius          1.85871673
	InertiaMoment   0.395954281
	Obliquity       204.502069
	EqAscendNode    -137.44432
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.769 0.767 0.764)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.563
		Randomize      (-0.813, 0.060, -0.611)
		colorDistMagn   0.547
		colorDistFreq   0.000493
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.341
		icecapLatitude  2
		icecapHeight    0.453
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.152
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        0.394
		venusFreq       0.605
		venusMagn       0.416
		mareDensity     0
		terraceProb     0.203
		erosion         0
		montesMagn      0.53
		montesFreq      2.83
		montesSpiky     0.856
		montesFraction  0.553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00951
		hillsFraction   0.734
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.211
		craterFreq      0.205
		craterDensity   1.05
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425
		volcanoTemp     1.07e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.67
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
		PeriodDays      112.520468
		SemiMajorAxisKm 8263274.11
		Eccentricity    0.336874189
		Inclination     204.502069
		AscendingNode   -137.44432
		ArgOfPericenter -50.2412975
		MeanAnomaly     -142.251474
	}
}

DwarfMoon "Homestead Prime D 36"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.45704065e-11
	Radius          2.34060979
	InertiaMoment   0.395311147
	RotationPeriod  2217.86029
	Obliquity       131.592432
	EqAscendNode    36.0254647

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.554 0.548 0.542)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.132
		Randomize      (-0.543, -0.110, -0.278)
		colorDistMagn   0.561
		colorDistFreq   0.00292
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.481
		icecapLatitude  2
		icecapHeight    0.829
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.449
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        0.635
		venusFreq       0.621
		venusMagn       0.879
		mareDensity     0
		terraceProb     0.329
		erosion         0
		montesMagn      0.354
		montesFreq      3.59
		montesSpiky     0.987
		montesFraction  0.626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0135
		hillsFraction   0.471
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.264
		craterDensity   0.856
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489
		volcanoTemp     1.12e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.11
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
		PeriodDays      113.499043
		SemiMajorAxisKm 8311114.61
		Eccentricity    0.402034405
		Inclination     131.592432
		AscendingNode   36.0254647
		ArgOfPericenter 26.0005752
		MeanAnomaly     171.571722
	}
}

DwarfMoon "Homestead Prime D 37"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.56490193e-11
	Radius          2.91073275
	InertiaMoment   0.399987549
	Obliquity       26.7242935
	EqAscendNode    71.5720804
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.730 0.729 0.728)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.701
		Randomize      (-0.272, -0.280, 0.055)
		colorDistMagn   0.575
		colorDistFreq   0.00736
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.712
		icecapLatitude  2
		icecapHeight    0.703
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.347
		heightTempGrad  0.625
		beachWidth      0.000658
		tropicWidth     0.07
		mainFreq        0.47
		venusFreq       0.64
		venusMagn       0.841
		mareDensity     0
		terraceProb     0.601
		erosion         0
		montesMagn      0.501
		montesFreq      2.87
		montesSpiky     0.954
		montesFraction  0.71
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0189
		hillsFraction   0.609
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.225
		craterFreq      0.218
		craterDensity   0.954
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536
		volcanoTemp     1.07e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.62
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
		PeriodDays      115.370386
		SemiMajorAxisKm 8402219.77
		Eccentricity    0.256185731
		Inclination     26.7242935
		AscendingNode   71.5720804
		ArgOfPericenter 83.8503175
		MeanAnomaly     -117.819775
	}
}

DwarfMoon "Homestead Prime D 38"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.92583429e-11
	Radius          3.47787881
	InertiaMoment   0.399927288
	RotationPeriod  1118.27091
	Obliquity       188.157345
	EqAscendNode    4.10729483

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.514 0.509 0.507)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.27
		Randomize      (-0.002, -0.450, 0.388)
		colorDistMagn   0.589
		colorDistFreq   0.00605
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.619
		icecapLatitude  2
		icecapHeight    0.632
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.245
		heightTempGrad  0.625
		beachWidth      0.00131
		tropicWidth     0.07
		mainFreq        0.748
		venusFreq       0.668
		venusMagn       0.819
		mareDensity     0
		terraceProb     0.211
		erosion         0
		montesMagn      0.652
		montesFreq      3.68
		montesSpiky     0.915
		montesFraction  0.844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0236
		hillsFraction   0.714
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.257
		craterFreq      0.159
		craterDensity   0.776
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44
		volcanoTemp     1.32e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.13
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
		PeriodDays      116.486551
		SemiMajorAxisKm 8456324.96
		Eccentricity    0.341303719
		Inclination     188.157345
		AscendingNode   4.10729483
		ArgOfPericenter 134.65907
		MeanAnomaly     19.907547
	}
}

DwarfMoon "Homestead Prime D 39"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.30880418e-10
	Radius          4.14087486
	InertiaMoment   0.399866968
	Obliquity       9.05986243
	EqAscendNode    -53.3105098
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.694 0.691 0.689)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.839
		Randomize      (0.269, -0.620, 0.721)
		colorDistMagn   0.603
		colorDistFreq   0.0138
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.59
		icecapLatitude  2
		icecapHeight    0.569
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.143
		heightTempGrad  0.625
		beachWidth      0.000753
		tropicWidth     0.07
		mainFreq        0.538
		venusFreq       0.511
		venusMagn       0.802
		mareDensity     0
		terraceProb     0.34
		erosion         0
		montesMagn      0.472
		montesFreq      2.91
		montesSpiky     0.853
		montesFraction  0.292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0634
		hillsFraction   0.421
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.233
		craterFreq      0.231
		craterDensity   0.896
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496
		volcanoTemp     1.06e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.73
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
		PeriodDays      117.660508
		SemiMajorAxisKm 8513045.43
		Eccentricity    0.243005735
		Inclination     9.05986243
		AscendingNode   -53.3105098
		ArgOfPericenter 40.8410792
		MeanAnomaly     168.645707
	}
}

DwarfMoon "Homestead Prime D 40"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.07952697e-10
	Radius          4.79309559
	InertiaMoment   0.399806529
	RotationPeriod  1142.20163
	Obliquity       209.159792
	EqAscendNode    -175.845756

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.477 0.472 0.468)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.408
		Randomize      (0.539, -0.790, -0.946)
		colorDistMagn   0.617
		colorDistFreq   0.0107
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0406
		icecapLatitude  2
		icecapHeight    0.498
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44
		heightTempGrad  0.625
		beachWidth      0.0014
		tropicWidth     0.07
		mainFreq        0.368
		venusFreq       0.551
		venusMagn       0.789
		mareDensity     0
		terraceProb     0.711
		erosion         0
		montesMagn      0.593
		montesFreq      3.8
		montesSpiky     0.986
		montesFraction  0.408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0628
		hillsFraction   0.593
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.272
		craterFreq      0.185
		craterDensity   1.01
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545
		volcanoTemp     1.21e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.31
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
		PeriodDays      118.979335
		SemiMajorAxisKm 8576540.89
		Eccentricity    0.350454678
		Inclination     209.159792
		AscendingNode   -175.845756
		ArgOfPericenter -47.8813743
		MeanAnomaly     -132.780879
	}
}

DwarfMoon "Homestead Prime D 41"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            3.20509064e-10
	Radius          5.47970295
	InertiaMoment   0.399745911
	Obliquity       186.183368
	EqAscendNode    123.997807
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.658 0.654 0.649)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.977
		Randomize      (0.809, -0.960, -0.613)
		colorDistMagn   0.631
		colorDistFreq   0.0227
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.455
		icecapLatitude  2
		icecapHeight    0.374
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.338
		heightTempGrad  0.625
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        0.612
		venusFreq       0.572
		venusMagn       0.778
		mareDensity     0
		terraceProb     0.22
		erosion         0
		montesMagn      0.442
		montesFreq      2.95
		montesSpiky     0.953
		montesFraction  0.489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0737
		hillsFraction   0.696
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.244
		craterDensity   0.836
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452
		volcanoTemp     1.26e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.93
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
		PeriodDays      120.159816
		SemiMajorAxisKm 8633176.94
		Eccentricity    0.0181092361
		Inclination     186.183368
		AscendingNode   123.997807
		ArgOfPericenter -107.913177
		MeanAnomaly     174.587854
	}
}

DwarfMoon "Homestead Prime D 42"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.82029916e-10
	Radius          6.34400272
	InertiaMoment   0.399685055
	Obliquity       194.985527
	EqAscendNode    -39.5237714
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.441 0.436 0.429)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.546
		Randomize      (-0.920, 0.870, -0.280)
		colorDistMagn   0.644
		colorDistFreq   0.0174
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.677
		icecapLatitude  2
		icecapHeight    0.749
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.236
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        0.449
		venusFreq       0.589
		venusMagn       0.768
		mareDensity     0
		terraceProb     0.352
		erosion         0
		montesMagn      0.556
		montesFreq      4.01
		montesSpiky     0.913
		montesFraction  0.56
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0892
		hillsFraction   0.91
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.213
		craterFreq      0.202
		craterDensity   0.936
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     1.21e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.71
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
		PeriodDays      121.943093
		SemiMajorAxisKm 8718382.99
		Eccentricity    0.444599624
		Inclination     194.985527
		AscendingNode   -39.5237714
		ArgOfPericenter -146.534916
		MeanAnomaly     -20.6138036
	}
}

DwarfMoon "Homestead Prime D 43"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.1057854e-10
	Radius          7.20779705
	InertiaMoment   0.39962393
	Obliquity       180.897773
	EqAscendNode    14.5247864
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.618 0.615 0.614)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.116
		Randomize      (-0.650, 0.700, 0.053)
		colorDistMagn   0.658
		colorDistFreq   0.037
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.514
		icecapLatitude  2
		icecapHeight    0.664
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.133
		heightTempGrad  0.625
		beachWidth      0.000945
		tropicWidth     0.07
		mainFreq        0.708
		venusFreq       0.604
		venusMagn       0.759
		mareDensity     0
		terraceProb     0.107
		erosion         0
		montesMagn      0.403
		montesFreq      2.99
		montesSpiky     0.849
		montesFraction  0.633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.1
		hillsFraction   0.576
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.259
		craterDensity   0.724
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.49
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
		PeriodDays      123.480354
		SemiMajorAxisKm 8791501.42
		Eccentricity    0.0384197191
		Inclination     180.897773
		AscendingNode   14.5247864
		ArgOfPericenter -133.018605
		MeanAnomaly     75.1253012
	}
}

DwarfMoon "Homestead Prime D 44"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.03031039e-09
	Radius          8.21239662
	InertiaMoment   0.399562418
	Obliquity       202.880376
	EqAscendNode    -96.1272658
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.799 0.797 0.796)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.685
		Randomize      (-0.380, 0.530, 0.386)
		colorDistMagn   0.671
		colorDistFreq   0.0266
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.576
		icecapLatitude  2
		icecapHeight    0.599
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.431
		heightTempGrad  0.625
		beachWidth      0.000993
		tropicWidth     0.07
		mainFreq        0.519
		venusFreq       0.62
		venusMagn       0.751
		mareDensity     0
		terraceProb     0.229
		erosion         0
		montesMagn      0.525
		montesFreq      1.84
		montesSpiky     0.985
		montesFraction  0.72
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.227
		hillsFraction   0.679
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.226
		craterFreq      0.215
		craterDensity   0.879
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     1e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.39
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
		PeriodDays      124.707122
		SemiMajorAxisKm 8849634.03
		Eccentricity    0.075123104
		Inclination     202.880376
		AscendingNode   -96.1272658
		ArgOfPericenter 173.264408
		MeanAnomaly     167.934881
	}
}

DwarfMoon "Homestead Prime D 45"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.47350676e-09
	Radius          9.18179798
	InertiaMoment   0.399500519
	Obliquity       -19.1875194
	EqAscendNode    147.72836
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.582 0.578 0.575)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.254
		Randomize      (-0.109, 0.360, 0.719)
		colorDistMagn   0.685
		colorDistFreq   0.0568
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.735
		icecapLatitude  2
		icecapHeight    0.534
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
		beachWidth      0.00104
		tropicWidth     0.07
		mainFreq        0.339
		venusFreq       0.639
		venusMagn       0.743
		mareDensity     0
		terraceProb     0.363
		erosion         0
		montesMagn      0.34
		montesFreq      3.03
		montesSpiky     0.951
		montesFraction  0.865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.229
		hillsFraction   0.832
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.258
		craterFreq      0.146
		craterDensity   0.982
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508
		volcanoTemp     950
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.26
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
		PeriodDays      126.537627
		SemiMajorAxisKm 8936022.7
		Eccentricity    0.0757105222
		Inclination     -19.1875194
		AscendingNode   147.72836
		ArgOfPericenter -82.8816555
		MeanAnomaly     -6.28102784
	}
}

DwarfMoon "Homestead Prime D 46"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.0833022e-09
	Radius          10.4126043
	InertiaMoment   0.399438113
	Obliquity       163.61922
	EqAscendNode    -99.590642
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.762 0.760 0.757)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.823
		Randomize      (0.161, 0.191, -0.948)
		colorDistMagn   0.698
		colorDistFreq   0.0382
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.59
		icecapLatitude  2
		icecapHeight    0.448
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.227
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.589
		venusFreq       0.666
		venusMagn       0.736
		mareDensity     0
		terraceProb     0.116
		erosion         0
		montesMagn      0.497
		montesFreq      2.14
		montesSpiky     0.911
		montesFraction  0.307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.265
		hillsFraction   0.557
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.234
		craterFreq      0.228
		craterDensity   0.814
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569
		volcanoTemp     1.2e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.37
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
		PeriodDays      127.697217
		SemiMajorAxisKm 8990532.74
		Eccentricity    0.460896233
		Inclination     163.61922
		AscendingNode   -99.590642
		ArgOfPericenter 73.5557066
		MeanAnomaly     -28.3992439
	}
}

DwarfMoon "Homestead Prime D 47"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.91737035e-09
	Radius          11.5244904
	InertiaMoment   0.39937517
	RotationPeriod  2740.36449
	Obliquity       221.917629
	EqAscendNode    78.2935105

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.546 0.542 0.535)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.392
		Randomize      (0.432, 0.021, -0.615)
		colorDistMagn   0.712
		colorDistFreq   0.0848
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.817
		icecapLatitude  2
		icecapHeight    0.82
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.124
		heightTempGrad  0.625
		beachWidth      0.000836
		tropicWidth     0.07
		mainFreq        0.428
		venusFreq       0.506
		venusMagn       0.729
		mareDensity     0
		terraceProb     0.237
		erosion         0
		montesMagn      0.64
		montesFreq      3.07
		montesSpiky     0.846
		montesFraction  0.417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.292
		hillsFraction   0.663
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.275
		craterFreq      0.18
		craterDensity   0.918
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469
		volcanoTemp     946
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.4
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
		PeriodDays      129.593915
		SemiMajorAxisKm 9079338.59
		Eccentricity    0.160940775
		Inclination     221.917629
		AscendingNode   78.2935105
		ArgOfPericenter -155.037193
		MeanAnomaly     150.531449
	}
}

DwarfMoon "Homestead Prime D 48"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.05293799e-09
	Radius          12.7099838
	InertiaMoment   0.399311572
	Obliquity       190.328631
	EqAscendNode    -137.59174
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.726 0.723 0.718)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.961
		Randomize      (0.702, -0.149, -0.282)
		colorDistMagn   0.725
		colorDistFreq   0.0493
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.398
		icecapLatitude  2
		icecapHeight    0.7
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.422
		heightTempGrad  0.625
		beachWidth      0.00148
		tropicWidth     0.07
		mainFreq        0.675
		venusFreq       0.549
		venusMagn       0.722
		mareDensity     0
		terraceProb     0.376
		erosion         0
		montesMagn      0.468
		montesFreq      2.28
		montesSpiky     0.984
		montesFraction  0.496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.309
		hillsFraction   0.793
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.24
		craterDensity   1.06
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515
		volcanoTemp     1.19e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.4
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
		PeriodDays      130.421312
		SemiMajorAxisKm 9117942.49
		Eccentricity    0.0422747437
		Inclination     190.328631
		AscendingNode   -137.59174
		ArgOfPericenter -104.061751
		MeanAnomaly     -5.53531431
	}
}

DwarfMoon "Homestead Prime D 49"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            5.59363356e-09
	Radius          14.3978739
	InertiaMoment   0.399247319
	Obliquity       133.570316
	EqAscendNode    -78.2910317
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.506 0.502 0.500)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.53
		Randomize      (0.972, -0.319, 0.051)
		colorDistMagn   0.739
		colorDistFreq   0.125
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.741
		icecapLatitude  2
		icecapHeight    0.63
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32
		heightTempGrad  0.625
		beachWidth      0.000632
		tropicWidth     0.07
		mainFreq        0.499
		venusFreq       0.57
		venusMagn       0.716
		mareDensity     0
		terraceProb     0.126
		erosion         0
		montesMagn      0.586
		montesFreq      3.11
		montesSpiky     0.95
		montesFraction  0.567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.674
		hillsFraction   0.537
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.215
		craterFreq      0.198
		craterDensity   0.861
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591
		volcanoTemp     1.04e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13
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
		PeriodDays      132.529682
		SemiMajorAxisKm 9215945.76
		Eccentricity    0.213843329
		Inclination     133.570316
		AscendingNode   -78.2910317
		ArgOfPericenter 133.286349
		MeanAnomaly     -174.570855
	}
}

DwarfMoon "Homestead Prime D 50"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            7.67889485e-09
	Radius          15.8735256
	InertiaMoment   0.39918223
	Obliquity       213.635279
	EqAscendNode    158.689163
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.687 0.684 0.682)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.099
		Randomize      (-0.757, -0.489, 0.384)
		colorDistMagn   0.753
		colorDistFreq   0.0623
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.202
		icecapLatitude  2
		icecapHeight    0.566
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.217
		heightTempGrad  0.625
		beachWidth      0.00068
		tropicWidth     0.07
		mainFreq        0.305
		venusFreq       0.588
		venusMagn       0.71
		mareDensity     0
		terraceProb     0.246
		erosion         0
		montesMagn      0.436
		montesFreq      2.38
		montesSpiky     0.91
		montesFraction  0.641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.679
		hillsFraction   0.647
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.249
		craterFreq      0.255
		craterDensity   0.96
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476
		volcanoTemp     989
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.3
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
		PeriodDays      133.736831
		SemiMajorAxisKm 9271823.54
		Eccentricity    0.05820978
		Inclination     213.635279
		AscendingNode   158.689163
		ArgOfPericenter -24.5699895
		MeanAnomaly     84.2771664
	}
}

DwarfMoon "Homestead Prime D 51"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.04969891e-08
	Radius          17.773304
	InertiaMoment   0.399116307
	Obliquity       216.258481
	EqAscendNode    -128.933384
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.470 0.465 0.461)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.668
		Randomize      (-0.487, -0.659, 0.717)
		colorDistMagn   0.766
		colorDistFreq   0.181
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.469
		icecapLatitude  2
		icecapHeight    0.494
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.115
		heightTempGrad  0.625
		beachWidth      0.000728
		tropicWidth     0.07
		mainFreq        0.569
		venusFreq       0.603
		venusMagn       0.704
		mareDensity     0
		terraceProb     0.389
		erosion         0
		montesMagn      0.551
		montesFreq      3.16
		montesSpiky     0.842
		montesFraction  0.73
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.766
		hillsFraction   0.765
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.212
		craterDensity   0.786
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521
		volcanoTemp     1.04e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16
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
		PeriodDays      135.152091
		SemiMajorAxisKm 9337120.96
		Eccentricity    0.125465245
		Inclination     216.258481
		AscendingNode   -128.933384
		ArgOfPericenter 170.6277
		MeanAnomaly     164.664974
	}
}

DwarfMoon "Homestead Prime D 52"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.43031516e-08
	Radius          19.5127201
	InertiaMoment   0.399049371
	Obliquity       163.653694
	EqAscendNode    170.655932
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.650 0.647 0.643)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.237
		Randomize      (-0.216, -0.829, -0.950)
		colorDistMagn   0.78
		colorDistFreq   0.063
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.723
		icecapLatitude  2
		icecapHeight    0.364
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.413
		heightTempGrad  0.625
		beachWidth      0.00138
		tropicWidth     0.07
		mainFreq        0.406
		venusFreq       0.619
		venusMagn       0.699
		mareDensity     0
		terraceProb     0.135
		erosion         0
		montesMagn      0.396
		montesFreq      2.46
		montesSpiky     0.983
		montesFraction  0.891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.832
		hillsFraction   0.513
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.275
		craterDensity   0.901
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.393
		volcanoTemp     1.08e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.6
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
		PeriodDays      136.275397
		SemiMajorAxisKm 9388786.06
		Eccentricity    0.046726948
		Inclination     163.653694
		AscendingNode   170.655932
		ArgOfPericenter -21.9037108
		MeanAnomaly     -90.0080124
	}
}

DwarfMoon "Homestead Prime D 53"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.9445082e-08
	Radius          21.9244347
	InertiaMoment   0.398981392
	Obliquity       -54.5723926
	EqAscendNode    1.6375886
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.433 0.429 0.422)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.806
		Randomize      (0.054, -0.999, -0.617)
		colorDistMagn   0.794
		colorDistFreq   0.259
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.415
		icecapLatitude  2
		icecapHeight    0.744
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.311
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        0.648
		venusFreq       0.638
		venusMagn       0.693
		mareDensity     0
		terraceProb     0.255
		erosion         0
		montesMagn      0.521
		montesFreq      3.2
		montesSpiky     0.949
		montesFraction  0.321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.908
		hillsFraction   0.632
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.224
		craterDensity   1.02
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483
		volcanoTemp     1.13e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.7
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
		PeriodDays      137.818917
		SemiMajorAxisKm 9459547.47
		Eccentricity    0.330372322
		Inclination     -54.5723926
		AscendingNode   1.6375886
		ArgOfPericenter 87.9793152
		MeanAnomaly     -27.8516195
	}
}

DwarfMoon "Homestead Prime D 54"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.63991158e-08
	Radius          23.929266
	InertiaMoment   0.398912191
	RotationPeriod  1913.13381
	RotationEpoch   0
	Obliquity       162.340179
	EqAscendNode    96.4926087

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.722 0.565 0.495)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.375
		Randomize      (0.324, 0.831, -0.284)
		colorDistMagn   0.807
		colorDistFreq   0.507
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.591
		icecapLatitude  2
		icecapHeight    0.661
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.208
		heightTempGrad  0.625
		beachWidth      0.000871
		tropicWidth     0.07
		mainFreq        0.48
		venusFreq       0.663
		venusMagn       0.687
		mareDensity     0
		terraceProb     0.403
		erosion         0
		montesMagn      0.322
		montesFreq      2.52
		montesSpiky     0.908
		montesFraction  0.425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82
		hillsFraction   0.742
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.279
		craterFreq      0.175
		craterDensity   0.842
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529
		volcanoTemp     1.28e+03
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
		PeriodDays      138.805225
		SemiMajorAxisKm 9504625.62
		Eccentricity    0.193917671
		Inclination     154.866184
		AscendingNode   96.0535463
		ArgOfPericenter 172.604306
		MeanAnomaly     54.2079498
	}
}

DwarfMoon "Homestead Prime D 55"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            3.58218273e-08
	Radius          26.4243641
	InertiaMoment   0.398841649
	Obliquity       192.590253
	EqAscendNode    -50.5770815
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.816 0.784 0.764)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.944
		Randomize      (0.595, 0.661, 0.049)
		colorDistMagn   0.821
		colorDistFreq   0.354
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.632
		icecapLatitude  2
		icecapHeight    0.597
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.106
		heightTempGrad  0.625
		beachWidth      0.000619
		tropicWidth     0.07
		mainFreq        0.261
		venusFreq       0.499
		venusMagn       0.682
		mareDensity     0
		terraceProb     0.144
		erosion         0
		montesMagn      0.492
		montesFreq      3.24
		montesSpiky     0.838
		montesFraction  0.503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87
		hillsFraction   0.484
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.237
		craterDensity   0.941
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425
		volcanoTemp     1.23e+03
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
		PeriodDays      140.781971
		SemiMajorAxisKm 9594650.64
		Eccentricity    0.410139657
		Inclination     192.590253
		AscendingNode   -50.5770815
		ArgOfPericenter -18.5586994
		MeanAnomaly     -11.5955865
	}
}

DwarfMoon "Homestead Prime D 56"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.86248375e-08
	Radius          29.5192375
	InertiaMoment   0.398769677
	RotationPeriod  444.024354
	RotationEpoch   0
	Obliquity       16.0153257
	EqAscendNode    46.566359

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.640 0.566 0.503)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.513
		Randomize      (0.865, 0.491, 0.382)
		colorDistMagn   0.835
		colorDistFreq   0.712
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.676
		icecapLatitude  2
		icecapHeight    0.531
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.404
		heightTempGrad  0.625
		beachWidth      0.00127
		tropicWidth     0.07
		mainFreq        0.548
		venusFreq       0.547
		venusMagn       0.677
		mareDensity     0
		terraceProb     0.264
		erosion         0
		montesMagn      0.629
		montesFreq      2.58
		montesSpiky     0.981
		montesFraction  0.574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1
		hillsFraction   0.616
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.217
		craterFreq      0.194
		craterDensity   0.743
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489
		volcanoTemp     1.08e+03
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
		PeriodDays      142.462351
		SemiMajorAxisKm 9670847.68
		Eccentricity    0.272724959
		Inclination     51.2297027
		AscendingNode   41.8563952
		ArgOfPericenter -4.97565798
		MeanAnomaly     -58.7768222
	}
}

DwarfMoon "Homestead Prime D 57"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            6.60843185e-08
	Radius          32.3692627
	InertiaMoment   0.398696035
	RotationPeriod  416.212348
	RotationEpoch   0
	Obliquity       193.041003
	EqAscendNode    -171.271263

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.800 0.756 0.704)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0825
		Randomize      (-0.865, 0.321, 0.715)
		colorDistMagn   0.849
		colorDistFreq   0.496
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.297
		icecapLatitude  2
		icecapHeight    0.444
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.301
		heightTempGrad  0.625
		beachWidth      0.00131
		tropicWidth     0.07
		mainFreq        0.381
		venusFreq       0.569
		venusMagn       0.671
		mareDensity     0
		terraceProb     0.418
		erosion         0
		montesMagn      0.463
		montesFreq      3.29
		montesSpiky     0.948
		montesFraction  0.648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27
		hillsFraction   0.721
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.251
		craterDensity   0.884
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536
		volcanoTemp     1.12e+03
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
		PeriodDays      143.527966
		SemiMajorAxisKm 9719012.89
		Eccentricity    0.23244151
		Inclination     187.16206
		AscendingNode   -171.037134
		ArgOfPericenter -76.4995012
		MeanAnomaly     58.7424992
	}
}

DwarfMoon "Homestead Prime D 58"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            9.00024091e-08
	Radius          36.2973137
	InertiaMoment   0.398620605
	RotationPeriod  776.877415
	RotationEpoch   0
	Obliquity       191.337312
	EqAscendNode    41.5269329

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.640 0.559 0.427)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.652
		Randomize      (-0.594, 0.151, -0.952)
		colorDistMagn   0.864
		colorDistFreq   1.01
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.632
		icecapLatitude  2
		icecapHeight    0.812
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.199
		heightTempGrad  0.625
		beachWidth      0.000763
		tropicWidth     0.07
		mainFreq        0.623
		venusFreq       0.586
		venusMagn       0.666
		mareDensity     0
		terraceProb     0.153
		erosion         0
		montesMagn      0.58
		montesFreq      2.64
		montesSpiky     0.906
		montesFraction  0.74
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46
		hillsFraction   0.444
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.228
		craterFreq      0.208
		craterDensity   0.989
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44
		volcanoTemp     1.17e+03
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
		PeriodDays      145.194343
		SemiMajorAxisKm 9794094.06
		Eccentricity    0.127509916
		Inclination     196.423813
		AscendingNode   40.5083201
		ArgOfPericenter -130.66234
		MeanAnomaly     -83.4256594
	}
}

DwarfMoon "Homestead Prime D 59"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.22951036e-07
	Radius          39.7696609
	InertiaMoment   0.398543149
	RotationPeriod  417.572707
	RotationEpoch   0
	Obliquity       138.194422
	EqAscendNode    151.603376

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.790 0.682 0.640)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.221
		Randomize      (-0.324, -0.019, -0.619)
		colorDistMagn   0.878
		colorDistFreq   0.694
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.936
		icecapLatitude  2
		icecapHeight    0.697
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.497
		heightTempGrad  0.625
		beachWidth      0.00081
		tropicWidth     0.07
		mainFreq        0.459
		venusFreq       0.602
		venusMagn       0.661
		mareDensity     0
		terraceProb     0.273
		erosion         0
		montesMagn      0.431
		montesFreq      3.34
		montesSpiky     0.833
		montesFraction  0.925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.92
		hillsFraction   0.599
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26
		craterFreq      0.269
		craterDensity   0.821
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496
		volcanoTemp     1.02e+03
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
		PeriodDays      146.049506
		SemiMajorAxisKm 9832513.13
		Eccentricity    0.281154678
		Inclination     137.278814
		AscendingNode   150.840841
		ArgOfPericenter 89.5489469
		MeanAnomaly     35.0763879
	}
}

DwarfMoon "Homestead Prime D 60"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.6864206e-07
	Radius          43.1295357
	InertiaMoment   0.398463428
	RotationPeriod  408.929704
	RotationEpoch   0
	Obliquity       234.952669
	EqAscendNode    -85.0885841

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.643 0.455 0.348)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.79
		Randomize      (-0.053, -0.189, -0.286)
		colorDistMagn   0.892
		colorDistFreq   1.34
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.888
		icecapLatitude  2
		icecapHeight    0.627
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.394
		heightTempGrad  0.625
		beachWidth      0.000858
		tropicWidth     0.07
		mainFreq        0.726
		venusFreq       0.618
		venusMagn       0.656
		mareDensity     0
		terraceProb     0.434
		erosion         0
		montesMagn      0.546
		montesFreq      2.69
		montesSpiky     0.98
		montesFraction  0.333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.94
		hillsFraction   0.703
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.221
		craterDensity   0.923
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545
		volcanoTemp     1.17e+03
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
		PeriodDays      147.055338
		SemiMajorAxisKm 9877605.3
		Eccentricity    0.074963415
		Inclination     222.905128
		AscendingNode   -91.5704332
		ArgOfPericenter 167.715633
		MeanAnomaly     -70.355373
	}
}

DwarfMoon "Homestead Prime D 61"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            2.32502131e-07
	Radius          49.5313339
	InertiaMoment   0.398381233
	RotationPeriod  516.427715
	RotationEpoch   0
	Obliquity       127.277444
	EqAscendNode    -106.463456

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.720 0.672 0.634)

	Surface
	{
		Preset         "FIXED_asteroid_grey.cfg"
		SurfStyle       0.359
		Randomize      (0.217, -0.358, 0.047)
		colorDistMagn   0.907
		colorDistFreq   0.986
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.911
		icecapLatitude  2
		icecapHeight    0.564
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.292
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        0.529
		venusFreq       0.636
		venusMagn       0.65
		mareDensity     0
		terraceProb     0.162
		erosion         0
		montesMagn      0.389
		montesFreq      3.39
		montesSpiky     0.946
		montesFraction  0.433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88
		hillsFraction   0.358
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.285
		craterFreq      0.168
		craterDensity   1.09
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451
		volcanoTemp     1.11e+03
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
		PeriodDays      148.027919
		SemiMajorAxisKm 9921109.14
		Eccentricity    0.0177674518
		Inclination     146.966174
		AscendingNode   -105.560318
		ArgOfPericenter 59.9343578
		MeanAnomaly     16.0785179
	}
}

DwarfMoon "Homestead Prime D 62"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            3.2258211e-07
	Radius          54.5914192
	InertiaMoment   0.398296177
	Obliquity       187.949402
	EqAscendNode    116.521142
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.535 0.461 0.382)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.928
		Randomize      (0.487, -0.528, 0.380)
		colorDistMagn   0.922
		colorDistFreq   2.03
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.459
		icecapLatitude  2
		icecapHeight    0.491
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19
		heightTempGrad  0.625
		beachWidth      0.000954
		tropicWidth     0.07
		mainFreq        0.354
		venusFreq       0.661
		venusMagn       0.645
		mareDensity     0
		terraceProb     0.282
		erosion         0
		montesMagn      0.516
		montesFreq      2.74
		montesSpiky     0.904
		montesFraction  0.51
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.42
		hillsFraction   0.582
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.243
		craterFreq      0.234
		craterDensity   0.866
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502
		volcanoTemp     962
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
		PeriodDays      150.22683
		SemiMajorAxisKm 10019117.6
		Eccentricity    0.475269575
		Inclination     187.949402
		AscendingNode   116.521142
		ArgOfPericenter -178.942497
		MeanAnomaly     -81.7878157
	}
}

DwarfMoon "Homestead Prime D 63"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            4.51020981e-07
	Radius          61.7420082
	InertiaMoment   0.398207903
	RotationPeriod  442.307405
	RotationEpoch   0
	Obliquity       140.430728
	EqAscendNode    121.780214

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.712 0.653 0.567)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.497
		Randomize      (0.758, -0.698, 0.713)
		colorDistMagn   0.937
		colorDistFreq   1.38
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.867
		icecapLatitude  2
		icecapHeight    0.353
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.488
		heightTempGrad  0.625
		beachWidth      0.000702
		tropicWidth     0.07
		mainFreq        0.6
		venusFreq       0.489
		venusMagn       0.64
		mareDensity     0
		terraceProb     0.452
		erosion         0
		montesMagn      0.296
		montesFreq      3.45
		montesSpiky     0.828
		montesFraction  0.581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.02
		hillsFraction   0.686
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.218
		craterFreq      0.19
		craterDensity   0.966
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555
		volcanoTemp     1.11e+03
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
		PeriodDays      151.558388
		SemiMajorAxisKm 10078234.4
		Eccentricity    0.48965675
		Inclination     165.231328
		AscendingNode   124.328534
		ArgOfPericenter 31.0143713
		MeanAnomaly     -121.885399
	}
}

DwarfMoon "Homestead Prime D 64"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            6.36470361e-07
	Radius          68.3280487
	InertiaMoment   0.398116022
	RotationPeriod  959.821496
	RotationEpoch   0
	Obliquity       240.943325
	EqAscendNode    40.5098115

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.520 0.373 0.321)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.066
		Randomize      (-0.972, -0.868, -0.954)
		colorDistMagn   0.952
		colorDistFreq   3.01
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.996
		icecapLatitude  2
		icecapHeight    0.74
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.385
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.439
		venusFreq       0.545
		venusMagn       0.634
		mareDensity     0
		terraceProb     0.17
		erosion         0
		montesMagn      0.488
		montesFreq      2.78
		montesSpiky     0.979
		montesFraction  0.656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.3
		hillsFraction   0.853
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.251
		craterFreq      0.247
		craterDensity   0.795
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461
		volcanoTemp     1.16e+03
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
		PeriodDays      152.300143
		SemiMajorAxisKm 10111090.9
		Eccentricity    0.44804307
		Inclination     216.644138
		AscendingNode   39.9500365
		ArgOfPericenter -114.923856
		MeanAnomaly     159.535555
	}
}

DwarfMoon "Homestead Prime D 65"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            9.08201741e-07
	Radius          78.1321945
	InertiaMoment   0.398019969
	RotationPeriod  314.321445
	RotationEpoch   0
	Obliquity       208.844917
	EqAscendNode    32.1872799

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.709 0.567 0.494)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.635
		Randomize      (-0.701, 0.962, -0.621)
		colorDistMagn   0.968
		colorDistFreq   1.93
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.833
		icecapLatitude  2
		icecapHeight    0.659
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.283
		heightTempGrad  0.625
		beachWidth      0.000498
		tropicWidth     0.07
		mainFreq        0.691
		venusFreq       0.568
		venusMagn       0.629
		mareDensity     0
		terraceProb     0.292
		erosion         0
		montesMagn      0.62
		montesFreq      3.51
		montesSpiky     0.945
		montesFraction  0.751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.1
		hillsFraction   0.564
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.229
		craterFreq      0.205
		craterDensity   0.906
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508
		volcanoTemp     1.11e+03
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
		PeriodDays      153.008175
		SemiMajorAxisKm 10142403.8
		Eccentricity    0.0964195551
		Inclination     221.545278
		AscendingNode   28.4287731
		ArgOfPericenter -37.7916575
		MeanAnomaly     -71.506095
	}
}

DwarfMoon "Homestead Prime D 66"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.31329682e-06
	Radius          87.6866684
	InertiaMoment   0.397919118
	RotationPeriod  1211.81814
	RotationEpoch   0
	Obliquity       220.67365
	EqAscendNode    -158.216663

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.806 0.779 0.760)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.204
		Randomize      (-0.431, 0.792, -0.289)
		colorDistMagn   0.983
		colorDistFreq   4.7
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.283
		icecapLatitude  2
		icecapHeight    0.594
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.181
		heightTempGrad  0.625
		beachWidth      0.000545
		tropicWidth     0.07
		mainFreq        0.509
		venusFreq       0.585
		venusMagn       0.623
		mareDensity     0
		terraceProb     0.472
		erosion         0
		montesMagn      0.459
		montesFreq      2.82
		montesSpiky     0.902
		montesFraction  0.1
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.3
		hillsFraction   0.669
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.261
		craterFreq      0.317
		craterDensity   1.03
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569
		volcanoTemp     1.05e+03
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
		PeriodDays      154.888544
		SemiMajorAxisKm 10225330.1
		Eccentricity    0.254515774
		Inclination     216.077453
		AscendingNode   -158.146502
		ArgOfPericenter -20.9507885
		MeanAnomaly     118.78431
	}
}

DwarfMoon "Homestead Prime D 67"
{
	ParentBody     "Homestead Prime D"
	Class          "Asteroid"
	Mass            1.92967354e-06
	Radius          97.8379517
	InertiaMoment   0.397812694
	RotationPeriod  418.253719
	RotationEpoch   0
	Obliquity       149.425971
	EqAscendNode    132.656245

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.567 0.564 0.561)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.773
		Randomize      (-0.161, 0.622, 0.044)
		colorDistMagn   0.999
		colorDistFreq   2.49
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.82
		icecapLatitude  2
		icecapHeight    0.528
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.478
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        0.323
		venusFreq       0.601
		venusMagn       0.617
		mareDensity     0
		terraceProb     0.179
		erosion         0
		montesMagn      0.575
		montesFreq      3.59
		montesSpiky     0.823
		montesFraction  0.345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.5
		hillsFraction   0.806
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.236
		craterFreq      0.326
		craterDensity   0.848
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469
		volcanoTemp     901
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
		PeriodDays      157.122453
		SemiMajorAxisKm 10323413.1
		Eccentricity    0.197449937
		Inclination     160.626626
		AscendingNode   135.528296
		ArgOfPericenter -73.4768078
		MeanAnomaly     -78.225655
	}
}

Planet "Homestead Prime E"
{
	ParentBody     "Homestead Prime"
	Class          "Neptune"
	Mass            8.08416462
	Radius          16790.2246
	InertiaMoment   0.259918243
	Oblateness      0.0211751331
	RotationPeriod  12.6018684
	RotationEpoch   0
	Obliquity       -79.0239916
	EqAscendNode    -85.6232033

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cool_default.cfg"
		SurfStyle       0.275
		Randomize      (-0.396, -0.362, 0.986)
		detailScale     256
		tropicLatitude  0.981
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.675
		stripeFluct     0.496
		stripeTwist     9.43
		cycloneMagn     9.99
		cycloneFreq     0.547
		cycloneDensity  0.352
		cycloneOctaves  0
		cycloneMagn2     0.635
		cycloneFreq2     0.914
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      18.5
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
		Height          80.7
		Velocity        20.5
		BumpHeight      14.7
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.717
		mainOctaves     12
		Coverage        0.411
		stripeZones     0.675
		stripeFluct     0.496
		stripeTwist     9.43
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          173.91748
		Density         0.0331585594
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.316
		Saturation      0.924

		Composition
		{
			He        	67.8
			CH4       	23.3
			C3H8      	2.48
			C2H2      	2.31
			C8H18     	2.17
			C2H4      	0.867
			C2H6      	0.438
			N2        	0.308
			NH3       	0.22
			O2        	0.0647
			H2        	0.0142
			Ne        	0.0108
			Ar        	0.00714
			CO2       	0.0014
			H2S       	1.38e-05
			H2O       	9.79e-06
			Kr        	3.5e-06
			Xe        	4.19e-07
			CO        	2.46e-07
			SO2       	1.03e-07
			Cl2       	3.55e-09
		}
	}

	Climate
	{
		GlobalWindSpeed  234
	}

	Aurora
	{
		Height         243
		NorthLat       58.2
		NorthLon       -52.6
		NorthRadius    4.13e+03
		NorthWidth     1.22e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 72.1
		NorthMoveSpeed 1.16
		NorthParticles 10000
		SouthLat       -61.8
		SouthLon       120
		SouthRadius    4.58e+03
		SouthWidth     1.11e+03
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 71.9
		SouthMoveSpeed 0.839
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     1.87e+04
		OuterRadius     7.99e+04
		EdgeRadius      4.79e+04
		MeanRadius      2.84e+04
		Thickness       0.0987
		RocksMaxSize    0.00395
		RocksSpacing    1
		DustDrawDist    296
		ChartRadius     4.79e+04
		RotationPeriod  5.9
		Brightness      1
		FrontBright     2.46
		BackBright      4.83
		Density         0.972
		Opacity         0.972
		SelfShadow      0.972
		PlanetShadow    0.972
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.0294
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.36
		densityScale    1.33
		densityOffset   -0.0903
		densityPower    4.98
		colorContrast   0.115
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
		Period          15.4927281
		SemiMajorAxis   7.63884266
		Eccentricity    0.0501870412
		Inclination     -0.278920299
		AscendingNode   -80.9079796
		ArgOfPericenter 219.742698
		MeanAnomaly     161.835656
	}
}

DwarfMoon "Homestead Prime E 1"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            4.01980643e-10
	Radius          5.94823503
	InertiaMoment   0.397421241
	Oblateness     (0.298, 0.488, 0.000)
	Obliquity       0.00602421499
	EqAscendNode    -165.653697
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.582 0.573 0.570)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.528
		Randomize      (-0.251, -0.786, -0.710)
		colorDistMagn   0.698
		colorDistFreq   0.0159
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.135
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        0.463
		venusFreq       0.67
		venusMagn       0.0257
		mareDensity     0
		terraceProb     0.231
		erosion         0
		montesMagn      0.68
		montesFreq      3.51
		montesSpiky     0.818
		montesFraction  0.484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0716
		hillsFraction   0.635
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.277
		craterFreq      0.239
		craterDensity   0.832
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419
		volcanoTemp     915
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.35
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
		PeriodDays      0.197305963
		SemiMajorAxisKm 28733.2601
		Eccentricity    2.84529865e-05
		Inclination     0.00602421499
		AscendingNode   -165.653697
		ArgOfPericenter 125.747729
		MeanAnomaly     164.891174
	}
}

DwarfMoon "Homestead Prime E 2"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            5.97668859e-10
	Radius          6.79962969
	InertiaMoment   0.397276223
	Oblateness     (0.298, 0.475, 0.000)
	Obliquity       0.00962846346
	EqAscendNode    -55.9665374
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.758 0.756 0.755)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.0975
		Randomize      (0.020, -0.956, -0.377)
		colorDistMagn   0.712
		colorDistFreq   0.034
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.433
		heightTempGrad  0.625
		beachWidth      0.000838
		tropicWidth     0.07
		mainFreq        0.733
		venusFreq       0.514
		venusMagn       0.0333
		mareDensity     0
		terraceProb     0.367
		erosion         0
		montesMagn      0.48
		montesFreq      2.83
		montesSpiky     0.977
		montesFraction  0.556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0716
		hillsFraction   0.746
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.242
		craterFreq      0.197
		craterDensity   0.932
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488
		volcanoTemp     1.16e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.12
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
		PeriodDays      0.21898025
		SemiMajorAxisKm 30800.7573
		Eccentricity    7.66640482e-07
		Inclination     0.00962846346
		AscendingNode   -55.9665374
		ArgOfPericenter 177.658711
		MeanAnomaly     -55.7574727
	}
}

DwarfMoon "Homestead Prime E 3"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            8.72760475e-10
	Radius          7.7669692
	InertiaMoment   0.39711529
	Oblateness     (0.297, 0.466, 0.000)
	Obliquity       0.00702915133
	EqAscendNode    -121.205486
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.542 0.537 0.534)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.667
		Randomize      (0.290, 0.875, -0.044)
		colorDistMagn   0.725
		colorDistFreq   0.025
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.33
		heightTempGrad  0.625
		beachWidth      0.000586
		tropicWidth     0.07
		mainFreq        0.532
		venusFreq       0.552
		venusMagn       0.043
		mareDensity     0
		terraceProb     0.119
		erosion         0
		montesMagn      0.604
		montesFreq      3.59
		montesSpiky     0.942
		montesFraction  0.629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17
		hillsFraction   0.491
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.216
		craterFreq      0.254
		craterDensity   0.707
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534
		volcanoTemp     911
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.99
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
		PeriodDays      0.233236025
		SemiMajorAxisKm 32123.4256
		Eccentricity    3.39715823e-05
		Inclination     0.00702915133
		AscendingNode   -121.205486
		ArgOfPericenter 22.3473556
		MeanAnomaly     -75.9696025
	}
}

DwarfMoon "Homestead Prime E 4"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            1.25557487e-09
	Radius          8.6491785
	InertiaMoment   0.396933138
	Oblateness     (0.295, 0.432, 0.000)
	Obliquity       -0.0143070799
	EqAscendNode    -26.2654605
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.722 0.719 0.716)

	Surface
	{
		Preset         "FIXED_asteroid_blue.cfg"
		SurfStyle       0.236
		Randomize      (0.560, 0.705, 0.289)
		colorDistMagn   0.739
		colorDistFreq   0.052
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.228
		heightTempGrad  0.625
		beachWidth      0.000634
		tropicWidth     0.07
		mainFreq        0.359
		venusFreq       0.573
		venusMagn       0.0529
		mareDensity     0
		terraceProb     0.24
		erosion         0
		montesMagn      0.45
		montesFreq      2.87
		montesSpiky     0.899
		montesFraction  0.714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.188
		hillsFraction   0.619
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25
		craterFreq      0.211
		craterDensity   0.876
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437
		volcanoTemp     1.16e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.78
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
		PeriodDays      0.27878897
		SemiMajorAxisKm 36180.5493
		Eccentricity    3.3169762e-05
		Inclination     -0.0143070799
		AscendingNode   -26.2654605
		ArgOfPericenter -170.918087
		MeanAnomaly     49.2921789
	}
}

DwarfMoon "Homestead Prime E 5"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            1.78395065e-09
	Radius          9.4040947
	InertiaMoment   0.396721303
	Oblateness     (0.294, 0.417, 0.000)
	Obliquity       -0.0040247328
	EqAscendNode    -104.922206
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.506 0.501 0.495)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.805
		Randomize      (0.831, 0.535, 0.622)
		colorDistMagn   0.752
		colorDistFreq   0.0332
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.126
		heightTempGrad  0.625
		beachWidth      0.000982
		tropicWidth     0.07
		mainFreq        0.604
		venusFreq       0.589
		venusMagn       0.062
		mareDensity     0
		terraceProb     0.379
		erosion         0
		montesMagn      0.564
		montesFreq      3.68
		montesSpiky     0.811
		montesFraction  0.852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.201
		hillsFraction   0.726
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.227
		craterFreq      0.273
		craterDensity   0.978
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494
		volcanoTemp     1.21e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.46
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
		PeriodDays      0.297638527
		SemiMajorAxisKm 37793.5362
		Eccentricity    7.90489496e-05
		Inclination     -0.0040247328
		AscendingNode   -104.922206
		ArgOfPericenter 107.281433
		MeanAnomaly     170.753159
	}
}

DwarfMoon "Homestead Prime E 6"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            2.50846677e-09
	Radius          10.5559225
	InertiaMoment   0.396464586
	Oblateness     (0.292, 0.373, 0.000)
	Obliquity       -0.00554877241
	EqAscendNode    -142.430682
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.686 0.679 0.677)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.374
		Randomize      (-0.899, 0.365, 0.955)
		colorDistMagn   0.766
		colorDistFreq   0.0733
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.423
		heightTempGrad  0.625
		beachWidth      0.00103
		tropicWidth     0.07
		mainFreq        0.442
		venusFreq       0.605
		venusMagn       0.0775
		mareDensity     0
		terraceProb     0.128
		erosion         0
		montesMagn      0.414
		montesFreq      2.91
		montesSpiky     0.976
		montesFraction  0.298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223
		hillsFraction   0.454
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.259
		craterFreq      0.223
		craterDensity   0.809
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543
		volcanoTemp     1.05e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.5
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
		PeriodDays      0.349824364
		SemiMajorAxisKm 42091.2154
		Eccentricity    7.22926476e-05
		Inclination     -0.00554877241
		AscendingNode   -142.430682
		ArgOfPericenter -173.713718
		MeanAnomaly     94.7790999
	}
}

DwarfMoon "Homestead Prime E 7"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            3.4967913e-09
	Radius          12.2303362
	InertiaMoment   0.396131456
	Oblateness     (0.290, 0.343, 0.000)
	Obliquity       0.00830007351
	EqAscendNode    44.003854
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.470 0.460 0.456)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.943
		Randomize      (-0.628, 0.195, -0.712)
		colorDistMagn   0.78
		colorDistFreq   0.0497
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.321
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        0.696
		venusFreq       0.621
		venusMagn       0.103
		mareDensity     0
		terraceProb     0.249
		erosion         0
		montesMagn      0.532
		montesFreq      3.8
		montesSpiky     0.941
		montesFraction  0.412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.221
		hillsFraction   0.603
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.172
		craterDensity   0.915
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449
		volcanoTemp     1.2e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11
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
		PeriodDays      0.383290046
		SemiMajorAxisKm 44734.5553
		Eccentricity    3.98302756e-05
		Inclination     0.00830007351
		AscendingNode   44.003854
		ArgOfPericenter -47.8651111
		MeanAnomaly     0.0219805352
	}
}

DwarfMoon "Homestead Prime E 8"
{
	ParentBody     "Homestead Prime E"
	Class          "Asteroid"
	Mass            4.83964513e-09
	Radius          13.7835493
	InertiaMoment   0.395634353
	Oblateness     (0.289, 0.330, 0.000)
	Obliquity       0.00487745612
	EqAscendNode    -86.2458564
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.646 0.643 0.642)

	Surface
	{
		Preset         "FIXED_asteroid_red.cfg"
		SurfStyle       0.512
		Randomize      (-0.358, 0.025, -0.379)
		colorDistMagn   0.793
		colorDistFreq   0.118
		detailScale     64
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.981
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
		humidity        0.219
		heightTempGrad  0.625
		beachWidth      0.00113
		tropicWidth     0.07
		mainFreq        0.512
		venusFreq       0.64
		venusMagn       0.13
		mareDensity     0
		terraceProb     0.393
		erosion         0
		montesMagn      0.362
		montesFreq      2.95
		montesSpiky     0.897
		montesFraction  0.492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.53
		hillsFraction   0.707
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.282
		craterFreq      0.236
		craterDensity   1.05
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.4
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
		PeriodDays      0.398704042
		SemiMajorAxisKm 45925.9896
		Eccentricity    3.24170497e-05
		Inclination     0.00487745612
		AscendingNode   -86.2458564
		ArgOfPericenter -86.4543577
		MeanAnomaly     -19.1034989
	}
}