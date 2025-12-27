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
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_arid_yellow_green_plants.cfg"
		SurfStyle       0.965
		Randomize      (-0.705, -0.837, 0.265)
		colorDistMagn   0.0403
		colorDistFreq   577
		detailScale     1.64e+04
		drivenDarkening 0
		seaLevel        0.103
		snowLevel       2
		tropicLatitude  0.871
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
		montesFreq      178
		montesSpiky     0.83
		montesFraction  0.89
		dunesMagn       0.0736
		dunesFreq       38.6
		dunesFraction   0.754
		hillsMagn       0.145
		hillsFreq       448
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.5
		riversSin       5.43
		riftsMagn       52.2
		riftsFreq       4.12
		riftsSin        6.9
		canyonsMagn     0.0352
		canyonsFreq     122
		canyonsFraction 0
		cracksMagn      0.136
		cracksFreq      0.4
		cracksOctaves   0
		craterMagn      0.595
		craterFreq      14.3
		craterDensity   0.543
		craterOctaves   13
		volcanoMagn     0.69
		volcanoFreq     0.666
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.543
		volcanoRadius   0.532
		volcanoTemp     1.13e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
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
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          174.467789
		Density         0.00507107191
		Pressure        0.0144651737
		Greenhouse      15.4678259
		Bright          6.79
		Opacity         1
		SkyLight        2.26
		Hue             0
		Saturation      1

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

DwarfMoon	"Jularia"
{
	ParentBody     "Sera"
	Class          "Asteroid"
	Mass            5.58608437e-10
	Radius          6.3959651
	InertiaMoment   0.398651421
	RotationPeriod  794.52832
	RotationEpoch   0
	Obliquity       113.561819
	EqAscendNode    -86.1509723

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.259
		Randomize      (-0.354, -0.041, 0.615)
		colorDistMagn   0.861
		colorDistFreq   0.00546
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.924
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
		humidity        0.478
		heightTempGrad  0.625
		beachWidth      0.000858
		tropicWidth     0.07
		mainFreq        0.368
		venusFreq       0.694
		venusMagn       0.622
		mareDensity     0
		terraceProb     0.458
		erosion         0
		montesMagn      0.557
		montesFreq      3.59
		montesSpiky     0.876
		montesFraction  0.415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0937
		hillsFraction   0.656
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.235
		craterFreq      0.264
		craterDensity   0.957
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495
		volcanoTemp     197
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.76
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
		PeriodDays      8.48491
		SemiMajorAxisKm 67501.8
		Eccentricity    0.275072292
		Inclination     143.344329
		AscendingNode   -82.5124664
		ArgOfPericenter 53.3422552
		MeanAnomaly     -18.2041313
	}
}

