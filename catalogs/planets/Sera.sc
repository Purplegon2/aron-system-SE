Planet	"Sera"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.413258327
	Radius          4817.58105
	InertiaMoment   0.331164718
	Oblateness      0.00615430111
	RotationPeriod  16.5060039
	RotationEpoch   0
	Obliquity       118.946023
	EqAscendNode    177.314033

	AlbedoBond      0.244
	AlbedoGeom      0.344
	Brightness      0.687
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial/Aerial"
	}

	Surface
	{
		Preset         "terra_arid_earth_black.cfg"
		SurfStyle       0.0956
		Randomize      (0.109, 0.102, -0.181)
		colorDistMagn   0.0517
		colorDistFreq   1.2e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.0999
		snowLevel       2
		tropicLatitude  0.711
		icecapLatitude  2
		icecapHeight    0.614
		climatePole     0.562
		climateTropic   0.562
		climateEquator  0.562
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.178
		heightTempGrad  0.375
		beachWidth      0.00107
		tropicWidth     0.5
		mainFreq        1.08
		venusFreq       1.26
		venusMagn       0.757
		mareFreq        1.86
		mareDensity     0
		terraceProb     0.135
		erosion         0
		montesMagn      0.158
		montesFreq      423
		montesSpiky     0.971
		montesFraction  0.542
		dunesMagn       0.058
		dunesFreq       76.2
		dunesFraction   0.0677
		hillsMagn       0.123
		hillsFreq       1.24e+03
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.64
		riversSin       3.59
		riftsMagn       63.9
		riftsFreq       3.04
		riftsSin        6.81
		canyonsMagn     0.0695
		canyonsFreq     197
		canyonsFraction 0
		cracksMagn      0.0809
		cracksFreq      0.502
		cracksOctaves   0
		craterMagn      0.633
		craterFreq      18.6
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.655
		volcanoFreq     0.812
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.998
		volcanoRadius   0.471
		volcanoTemp     1.11e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.34
		stripeTwist     0.109
		cycloneMagn     3.24
		cycloneFreq     0.827
		cycloneDensity  0.308
		cycloneOctaves  4
		BumpHeight      16.8
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.9
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          36.3
		Velocity        7.61
		BumpHeight      6.72
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.755
		mainOctaves     10
		Coverage        0.214
		stripeZones     2.34
		stripeTwist     0.109
	}

	Clouds
	{
		Height          64.3
		Velocity        74
		BumpHeight      7.88
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.755
		mainOctaves     10
		Coverage        0.214
		stripeZones     2.34
		stripeTwist     0.109
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          147.210556
		Density         0.00507107191
		Pressure        0.783500016
		Greenhouse      76.3358765
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
		Period          0.399294856
		SemiMajorAxis   0.494842343
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
		PeriodDays      2.88111834084
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
	Mass            0.0000123
	Radius          263.232132
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
		PeriodDays      1.18943293297
		SemiMajorAxisKm 37467.4776
		Eccentricity    0.012160947595
		Inclination     2.35445654
		AscendingNode   99.9830836
		ArgOfPericenter 136.457251
		MeanAnomaly     27.2698647
	}
}

