Planet	"Aron"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.804
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
		Biome   "Marine/Terrestrial/Aerial"
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
		icecapLatitude  0.718
		icecapHeight    0.214
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

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          103.577919
		Density         1.29289997
		Pressure        1.96460004
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
			NH3			0.124
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
		Period          0.604427803682
		SemiMajorAxis   0.65237932524
		Eccentricity    0.0110883375
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
	Mass            0.0142177911
	Radius          1735.12231
	InertiaMoment   0.34665674
	Oblateness      0.00151114922
	Obliquity       -15.8844419
	EqAscendNode    116.200196
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
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
		mareFreq        0.56
		mareDensity     0.45
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
		cracksFreq      0
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
		PeriodDays      21.3872851498
		SemiMajorAxisKm 304412.642
		Eccentricity    0.000626302957
		Inclination     -15.8844419
		AscendingNode   116.200196
		ArgOfPericenter 23.4052807
		MeanAnomaly     -63.7410322
	}
}

Moon	"Parvus"
{
	ParentBody     "Aron"
	Class          "Terra"
	Mass            0.0083816722
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
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.241
		Randomize      (-0.324, 0.169, 0.597)
		colorDistMagn   0.0748
		colorDistFreq   614
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.341
		snowLevel       2
		tropicLatitude  0.804
		icecapLatitude  2
		icecapHeight    0.47
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.129
		heightTempGrad  0.375
		beachWidth      0.00113
		tropicWidth     0.5
		mainFreq        1.22
		venusFreq       0.994
		venusMagn       0
		mareFreq        3.74
		mareDensity     0
		terraceProb     0.101
		erosion         0.111
		montesMagn      0.0763
		montesFreq      1
		montesSpiky     0.145
		montesFraction  0.0611
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0.763
		riversFreq      0.003
		riversSin       0.687
		riftsMagn       0
		riftsFreq       2.28
		riftsSin        6.16
		canyonsMagn     0.0763
		canyonsFreq     30.5
		canyonsFraction 0.0916
		cracksMagn      0.128
		cracksFreq      0.115
		cracksOctaves   0
		craterMagn      0.84
		craterFreq      12.2
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.282
		volcanoFreq     0.137
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.85
		volcanoRadius   0.153
		volcanoTemp     1.03e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97
		stripeTwist     0.128
		cycloneMagn     2.85
		cycloneFreq     0.794
		cycloneDensity  0.353
		cycloneOctaves  3
		BumpHeight      20
		BumpOffset      0.0201
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.23
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           6.82
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			NH3       	64
			H2O       	29
		}
	}

	Clouds
	{
		Height          15
		Velocity        13.9
		BumpHeight      2.5
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.115
		mainOctaves     10
		Coverage        0.0763
		stripeZones     1.97
		stripeTwist     0.128
	}

	Clouds
	{
		Height          15
		Velocity        60.6
		BumpHeight      2.5
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.115
		mainOctaves     10
		Coverage        0.0763
		stripeZones     1.97
		stripeTwist     0.128
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          72.8778305
		Density         0.00062214717
		Pressure        0.0938210002
		Greenhouse      6.34534454
		Bright          6.72
		Opacity         1.07
		SkyLight        0.382
		Hue             0.156
		Saturation      0.921

		Composition
		{
			CO2       	44.6
			Cl2       	36.4
			N2        	15.9
			Ar        	2.67
			NH3       	1.54
			H2S       	0.289
			C2H6      	0.143
			CH4       	0.0656
			CO        	0.0424
			C3H8      	0.00158
			C8H18     	0.000215
			SO2       	7.45e-05
			Ne        	2.5e-05
			Xe        	1.03e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  5.68
	}

	Aurora
	{
		Height         169
		NorthLat       77.3
		NorthLon       -15.9
		NorthRadius    857
		NorthWidth     565
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 72.1
		NorthMoveSpeed 0.907
		NorthParticles 50000
		SouthLat       -74.1
		SouthLon       167
		SouthRadius    391
		SouthWidth     358
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 64.4
		SouthMoveSpeed 1.08
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
		PeriodDays      62.7141439043
		SemiMajorAxisKm 622156.5
		Eccentricity    0.412274809
		Inclination     -181.793276
		AscendingNode   -8.77875435
		ArgOfPericenter -2.75980272
		MeanAnomaly     28.8972723
	}
}




