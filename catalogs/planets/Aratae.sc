Planet	"Aratae"
{
	ParentBody     "Fate"
	Class          "Terra"
	Mass            0.0530404194
	Radius          2642.19971
	InertiaMoment   0.357732505
	Oblateness      0.0027937945
	RotationPeriod  35.2956017
	RotationEpoch   0
	Obliquity       -60.046842
	EqAscendNode    176.802784

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_default.cfg"
		SurfStyle       0.103
		Randomize      (0.709, 0.755, -0.862)
		colorDistMagn   0.0539
		colorDistFreq   276
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.136
		snowLevel       2
		tropicLatitude  0.852
		icecapLatitude  1.59
		icecapHeight    0.705
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41
		heightTempGrad  0.625
		beachWidth      0.000919
		tropicWidth     0.07
		mainFreq        1.91
		venusFreq       1.71
		venusMagn       0
		mareFreq        0.947
		mareDensity     0.116
		terraceProb     0.317
		erosion         0
		montesMagn      0.104
		montesFreq      111
		montesSpiky     0.866
		montesFraction  0.445
		dunesMagn       0.0302
		dunesFreq       15.9
		dunesFraction   0.451
		hillsMagn       0.126
		hillsFreq       281
		hillsFraction   0.0593
		hills2Fraction  0
		riversMagn      65.1
		riversFreq      2.8
		riversSin       6.22
		riftsMagn       49.5
		riftsFreq       3.41
		riftsSin        4.78
		canyonsMagn     0.305
		canyonsFreq     0.566
		canyonsFraction 0.949
		cracksMagn      0.0796
		cracksFreq      0.84
		cracksOctaves   0
		craterMagn      0.515
		craterFreq      7.13
		craterDensity   0.82
		craterOctaves   20
		craterRayedFactor 0.0615
		volcanoMagn     0.355
		volcanoFreq     0.824
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.46
		volcanoFlows    0.263
		volcanoRadius   0.247
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
		Period          1.33745854
		SemiMajorAxis   1.72838128
		Eccentricity    0.115537816
		Inclination     -1.56509341
		AscendingNode   178.580461
		ArgOfPericenter 102.066255
		MeanAnomaly     286.026691
	}
}

DwarfMoon	"Sarannu"
{
	ParentBody     "Aratae"
	Class          "Asteroid"
	AsterType      "Aten"
	Mass            2.19498004e-8
	Radius          24.101
	InertiaMoment   0.382679911
	Oblateness      0.18955678
	RotationPeriod  9.80114
	Obliquity       96.765452
	EqAscendNode    -36.136881

	AbsMagn         16.7
	SlopeParam      0.14
	Albedo          0.33
	Brightness      1.83
	BrightnessReal  1

	NoOcean         true
	NoClouds        true
	NoLava          true
	NoAtmosphere    true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.249578
		SemiMajorAxisKm 6291.324
		Eccentricity    0.3939167551
		Inclination     1.661753
		AscendingNode   -94.832402
		ArgOfPericenter -100.913763
		MeanAnomaly     21.137732
	}
}


