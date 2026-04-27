Planet	"Sera"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.493258327
	Radius          4817.58105
	InertiaMoment   0.331164718
	Oblateness      0.00615430111
	RotationPeriod  16.5060039
	RotationEpoch   0
	Obliquity       118.946023
	EqAscendNode    177.314033

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      0.687
	BrightnessReal  1

	Surface
	{
		Preset         "Sera.cfg"
		SurfStyle       0.965
		Randomize      (-0.046, -1.023, 0.265)
		colorDistMagn   0.0403
		colorDistFreq   577
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.103
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  2
		icecapHeight    0.825
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.383
		heightTempGrad  0.375
		beachWidth      0.000893
		tropicWidth     0.5
		mainFreq        1.07
		venusFreq       1.6
		venusMagn       0
		mareFreq        1.87
		mareDensity     0
		terraceProb     0.29
		erosion         0
		montesMagn      0.21
		montesFreq      397
		montesSpiky     0.83
		montesFraction  0.89
		dunesMagn       3
		dunesFreq       2
		dunesFraction   0.754
		hillsMagn       1.53
		hillsFreq       76.3
		hillsFraction   0
		hills2Fraction  0
		riversMagn      3.05
		riversFreq      0.687
		riversSin       5.04
		riftsMagn       14.5
		riftsFreq       0.0763
		riftsSin        1.98
		canyonsMagn     0.153
		canyonsFreq     2
		canyonsFraction 0.0992
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0.916
		craterFreq      19.1
		craterDensity   0.359
		craterOctaves   6
		volcanoMagn     0.603
		volcanoFreq     0.0916
		volcanoDensity  0.252
		volcanoOctaves  2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.664
		volcanoTemp     22.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.28
		stripeTwist     0.183
		cycloneMagn     3.82
		cycloneFreq     0.962
		cycloneDensity  0.319
		cycloneOctaves  3
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.638
		SpotBright      2.41
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.840 0.738 0.630)
	}

	NoOcean         true

	Clouds
	{
		Height          27.7
		Velocity        87.5
		BumpHeight      2.89
		Gamma           1.02
		Hapke           0.084
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.137
		ModulateBright  1.21
		Opacity         0.183
		mainFreq        0.252
		mainOctaves     4
		Coverage        0.115
		stripeZones     2.28
		stripeTwist     0.183
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          119.216362
		Density         0.00507107191
		Pressure        0.0144651737
		Greenhouse      15.4678259
		Bright          6.56
		Opacity         0.611
		SkyLight        3.66
		Hue             -0.00382
		Saturation      1.59

		Composition
		{
			H2O       	76.5
			C2H2      	11.2
			NH3       	6.12
			CO2       	2.74
			H2S       	1.53
			N2        	0.912
			CH4       	0.537
			C2H4      	0.195
			CO        	0.119
			SO2       	0.102
			C2H6      	0.0513
			C3H8      	0.0214
			C8H18     	0.000115
			Cl2       	4.65e-05
			Ar        	3.57e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  58.2
	}

	Aurora
	{
		Height         103
		NorthLat       62
		NorthLon       -24.8
		NorthRadius    1.25e+03
		NorthWidth     249
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 73.1
		NorthMoveSpeed 1.02
		NorthParticles 50000
		SouthLat       -72.4
		SouthLon       156
		SouthRadius    1.33e+03
		SouthWidth     409
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 68.1
		SouthMoveSpeed 0.964
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
		Period          0.65245
		SemiMajorAxis   0.751
		Eccentricity    0
		Inclination     0
		AscendingNode   179.395568
		ArgOfPericenter 225.307469
		MeanAnomaly     167.211679
	}
}

DwarfMoon	"Beluria"
{
	ParentBody     "Sera"
	Class          "Asteroid"
	Mass            8.18082269e-10
	Radius          8.65230274
	InertiaMoment   0.399918705
	RotationPeriod  1201.2821
	RotationEpoch   0
	Obliquity       184.396161
	EqAscendNode    -164.236885

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.828
		Randomize      (-0.084, -0.211, 0.948)
		colorDistMagn   0.875
		colorDistFreq   0.0397
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.415
		icecapLatitude  0.922
		icecapHeight    0.0454
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.376
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        0.612
		venusFreq       0.534
		venusMagn       0.616
		mareDensity     0
		terraceProb     0.173
		erosion         0
		montesMagn      0.405
		montesFreq      2.87
		montesSpiky     0.995
		montesFraction  0.495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.152
		hillsFraction   0.78
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28
		craterFreq      0.218
		craterDensity   0.78
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544
		volcanoTemp     370
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.79
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
		PeriodDays      4.43176
		SemiMajorAxisKm 67577.4
		Eccentricity    0.495290083
		Inclination     26.118832
		AscendingNode   -161.77013
		ArgOfPericenter 145.37281
		MeanAnomaly     -60.1965964
	}
}

Moon	"Eki"
{
	ParentBody     "Sera"
	Class          "Terra"
	Mass            1.37457005e-06
	Radius          93.232132
	InertiaMoment   0.39957273
	Oblateness     (0.014, 0.000, 0.007)
	Obliquity       1.35445654
	EqAscendNode    99.9830836
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.302
		Randomize      (-0.217, -0.357, -0.562)
		colorDistMagn   0.0851
		colorDistFreq   68.5
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.254
		snowLevel       2
		tropicLatitude  0.759
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
		humidity        0.368
		heightTempGrad  0.625
		beachWidth      0.00126
		tropicWidth     0.07
		mainFreq        1.5
		venusFreq       0.674
		venusMagn       0
		mareFreq        0
		mareDensity     0.174
		terraceProb     0.125
		erosion         0
		montesMagn      0.0641
		montesFreq      31.9
		montesSpiky     0.972
		montesFraction  0.0738
		dunesMagn       0.0429
		dunesFreq       3.42
		dunesFraction   0.707
		hillsMagn       0.106
		hillsFreq       70.9
		hillsFraction   0.659
		hills2Fraction  0
		riversMagn      58.3
		riversFreq      3.74
		riversSin       5.34
		riftsMagn       51.9
		riftsFreq       3.78
		riftsSin        5.95
		eqridgeMagn     0.373
		eqridgeWidth    0.0219
		eqridgeModMagn  2.5
		eqridgeModFreq  8.65
		canyonsMagn     0.588
		canyonsFreq     0.17
		canyonsFraction 0.107
		cracksMagn      0.0413
		cracksFreq      0.115
		cracksOctaves   0
		craterMagn      0.458
		craterFreq      1.62
		craterDensity   0.867
		craterOctaves   17
		craterRayedFactor 0.205
		volcanoMagn     0.188
		volcanoFreq     0.731
		volcanoDensity  0.24
		volcanoOctaves  3
		volcanoActivity 0.396
		volcanoFlows    0.17
		volcanoRadius   0.12
		volcanoTemp     1.34e+03
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
		PeriodDays      1.1893
		SemiMajorAxisKm 37467.4776
		Eccentricity    0.012160947595
		Inclination     2.35445654
		AscendingNode   99.9830836
		ArgOfPericenter 136.457251
		MeanAnomaly     27.2698647
	}
}

