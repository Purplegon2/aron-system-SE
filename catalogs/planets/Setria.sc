DwarfPlanet	"Setria"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.000425836392
	Radius          531.117798
	InertiaMoment   0.399109244
	Oblateness     (0.000, 0.007, 0.014)
	RotationPeriod  16.9982844
	Obliquity       -0.680506983
	EqAscendNode    -116.434222
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.76
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_mercury.cfg"
		SurfStyle       0.573
		Randomize      (0.250, 0.247, 0.380)
		colorDistMagn   0.052
		colorDistFreq   53.5
		detailScale     1.02e+03
		drivenDarkening 0
		seaLevel        -0.405
		snowLevel       2
		tropicLatitude  0.888
		icecapLatitude  2
		icecapHeight    0.541
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.191
		heightTempGrad  0.625
		beachWidth      0.000966
		tropicWidth     0.07
		mainFreq        1.51
		venusFreq       1.25
		venusMagn       0
		mareFreq        0
		mareDensity     0.167
		terraceProb     0.223
		erosion         0
		montesMagn      0.0762
		montesFreq      21.3
		montesSpiky     0.96
		montesFraction  0.937
		dunesMagn       0.0351
		dunesFreq       3.77
		dunesFraction   0.986
		hillsMagn       0.122
		hillsFreq       40.2
		hillsFraction   0.914
		hills2Fraction  0
		riversMagn      68.1
		riversFreq      4.22
		riversSin       5.91
		riftsMagn       62.2
		riftsFreq       3.25
		riftsSin        5.97
		canyonsMagn     0.584
		canyonsFreq     0.16
		canyonsFraction 0.184
		cracksMagn      0.611
		cracksFreq      3.55
		cracksOctaves   0
		craterMagn      1.22
		craterFreq      6.87
		craterDensity   0.29
		craterOctaves   22
		craterRayedFactor 0.212
		volcanoMagn     0.18
		volcanoFreq     0.819
		volcanoDensity  0.247
		volcanoOctaves  3
		volcanoActivity 0.321
		volcanoFlows    0.236
		volcanoRadius   0.151
		volcanoTemp     1.14e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.4
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
		Period      	465.508489625
		SemiMajorAxis   54.8136233075
		Eccentricity    0.378217692773
		Inclination     -9.680506983
		AscendingNode   -116.434222
		ArgOfPericenter -82.7188695
		MeanAnomaly     -148.845375
	}
}

Moon	"Nomata"
{
	ParentBody     "Setria"
	Class          "Asteroid"
	Mass            3.18769037e-06
	Radius          122.819717
	InertiaMoment   0.396737576
	Obliquity       -5.69644195
	EqAscendNode    -53.5083694
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.183
		Randomize      (0.327, -0.359, -0.075)
		colorDistMagn   0.139
		colorDistFreq   11.8
		detailScale     512
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.984
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.312
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.171
		heightTempGrad  0.625
		beachWidth      0.00139
		tropicWidth     0.07
		mainFreq        0.492
		venusFreq       0.623
		venusMagn       0.844
		mareDensity     0
		terraceProb     0.231
		erosion         0
		montesMagn      0.553
		montesFreq      3.18
		montesSpiky     0.911
		montesFraction  0.421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.5
		hillsFraction   0.709
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.557
		craterDensity   0.854
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549
		volcanoTemp     152
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
		PeriodDays      35.37
		SemiMajorAxisKm 32191
		Eccentricity    0.219246474
		Inclination     5.51907525
		AscendingNode   -53.9328494
		ArgOfPericenter -72.7690576
		MeanAnomaly     -11.088231
	}
}



