DwarfPlanet	"Cuenive"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          564.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     false

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
		Period		    271.634
		SemiMajorAxis	41.976
		Eccentricity    0.00243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

Moon	"Chevimonusche"
{
	ParentBody     "Cuenive"
	Class          "Asteroid"
	AsterType      "Apollo"
	Mass            4.65589823e-8
	Radius          28.026
	InertiaMoment   0.40610682
	Oblateness      0.329832844
	RotationPeriod  17.38907
	Obliquity       18.964348
	EqAscendNode    -60.634303

	AbsMagn         18.2
	SlopeParam      0.25
	Albedo          0.29
	Brightness      1.32
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.79721
		SemiMajorAxisKm 2364.687
		Eccentricity    0.0058168047
		Inclination     2.685341
		AscendingNode   53.805158
		ArgOfPericenter -98.350994
		MeanAnomaly     93.908763
	}
}

Moon	"Nise"
{
	ParentBody     "Cuenive"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            3.54012328e-8
	Radius          28.22
	InertiaMoment   0.372441827
	Oblateness      0.109993879
	RotationPeriod  17.02875
	Obliquity       353.180923
	EqAscendNode    -143.689123

	AbsMagn         16.8
	SlopeParam      0.21
	Albedo          0.12
	Brightness      1.27
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.073552
		SemiMajorAxisKm 2883.636
		Eccentricity    0.4098212362
		Inclination     -2.083649
		AscendingNode   34.205128
		ArgOfPericenter 90.07581
		MeanAnomaly     -4.176511
	}
}

Moon	"Oatu"
{
	ParentBody     "Cuenive"
	Class          "Asteroid"
	AsterType      "Centaur"
	Mass            4.02376817e-9
	Radius          13.243
	InertiaMoment   0.374895389
	Oblateness      0.234892091
	RotationPeriod  4.73947
	Obliquity       286.520762
	EqAscendNode    173.989017

	AbsMagn         21.2
	SlopeParam      0.18
	Albedo          0.16
	Brightness      1.89
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.08343
		SemiMajorAxisKm 2901.297
		Eccentricity    0.4463447712
		Inclination     3.703309
		AscendingNode   71.02231
		ArgOfPericenter -62.674302
		MeanAnomaly     124.464646
	}
}

Moon	"Snus"
{
	ParentBody     "Cuenive"
	Class          "Asteroid"
	AsterType      "Atira"
	Mass            3.40145874e-8
	Radius          27.542
	InertiaMoment   0.375963402
	Oblateness      0.253472811
	RotationPeriod  15.98793
	Obliquity       35.596991
	EqAscendNode    40.557995

	AbsMagn         20.6
	SlopeParam      0.18
	Albedo          0.06
	Brightness      1.2
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.089551
		SemiMajorAxisKm 2912.216
		Eccentricity    0.4406956411
		Inclination     -0.015267
		AscendingNode   129.440557
		ArgOfPericenter 144.649947
		MeanAnomaly     124.842685
	}
}
