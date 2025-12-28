DwarfPlanet	"Sienten"
{
	ParentBody     "Fate"
	Class          "Terra"
	Mass            0.000292507873
	Radius          629.200012
	InertiaMoment   0.399773806
	Obliquity       -0.637955273
	EqAscendNode    175.412029
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.07
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_moon.cfg"
		SurfStyle       0.905
		Randomize      (-0.418, -0.198, -0.721)
		colorDistMagn   0.0833
		colorDistFreq   72.7
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.397
		snowLevel       2
		tropicLatitude  0.798
		icecapLatitude  1.36
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
		humidity        0.417
		heightTempGrad  0.625
		beachWidth      0.000718
		tropicWidth     0.07
		mainFreq        2.21
		venusFreq       0.845
		venusMagn       0
		mareFreq        0
		mareDensity     0.139
		terraceProb     0.383
		erosion         0
		montesMagn      0.0585
		montesFreq      34
		montesSpiky     0.828
		montesFraction  0.964
		dunesMagn       0.0414
		dunesFreq       3.66
		dunesFraction   0.609
		hillsMagn       0.134
		hillsFreq       1.68e+03
		hillsFraction   0.902
		hills2Fraction  0
		riversMagn      52.8
		riversFreq      3.46
		riversSin       4.51
		riftsMagn       58
		riftsFreq       3.28
		riftsSin        6.01
		canyonsMagn     0.287
		canyonsFreq     0.143
		canyonsFraction 0.907
		cracksMagn      0.0581
		cracksFreq      0.16
		cracksOctaves   0
		craterMagn      0.627
		craterFreq      1.25
		craterDensity   0.884
		craterOctaves   17
		craterRayedFactor 0.19
		volcanoMagn     0.161
		volcanoFreq     1.25
		volcanoDensity  0.129
		volcanoOctaves  2
		volcanoActivity 0
		volcanoFlows    0.167
		volcanoRadius   0.122
		volcanoTemp     319
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
		ModulateColor  (0.791 0.816 0.689)
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
		Period     	57.4077038
		SemiMajorAxis	11.226
		Eccentricity    0.1266218817
		Inclination     -3.637955273
		AscendingNode   175.412029
		ArgOfPericenter -7.14657602
		MeanAnomaly     152.989753
	}
}

Moon	"Flanti"
{
	ParentBody     "Sienten"
	Class          "Aquaria"
	Mass            6.91416395e-05
	Radius          298.699997
	InertiaMoment   0.399295956
	Oblateness      0.00117859314
	Obliquity       -0.416265057
	EqAscendNode    53.5188883
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_ganymede.cfg"
		SurfStyle       0.34
		Randomize      (-0.769, 0.677, -0.772)
		colorDistMagn   0.0582
		colorDistFreq   59.1
		detailScale     1.02e+03
		drivenDarkening 0.7
		seaLevel        0.0534
		snowLevel       2
		tropicLatitude  0.192
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
		humidity        0.438
		heightTempGrad  0.625
		beachWidth      0.000719
		tropicWidth     0.07
		mainFreq        1.76
		venusFreq       1.54
		venusMagn       0
		mareFreq        0
		mareDensity     0.169
		terraceProb     0.381
		erosion         0
		montesMagn      0.0715
		montesFreq      16.2
		montesSpiky     0.924
		montesFraction  0.68
		dunesMagn       0.0442
		dunesFreq       4.09
		dunesFraction   0.79
		hillsMagn       0.134
		hillsFreq       12.3
		hillsFraction   0.398
		hills2Fraction  0.0755
		riversMagn      0
		riversFreq      4.01
		riversSin       5.13
		riftsMagn       0
		riftsFreq       3.55
		riftsSin        7
		canyonsMagn     0.485
		canyonsFreq     0.164
		canyonsFraction 0
		cracksMagn      0.0438
		cracksFreq      0.142
		cracksOctaves   0
		craterMagn      0.534
		craterFreq      0.763
		craterDensity   0.937
		craterOctaves   17
		craterRayedFactor 0.106
		volcanoMagn     0.191
		volcanoFreq     0.694
		volcanoDensity  0.215
		volcanoOctaves  3
		volcanoActivity 0.111
		volcanoFlows    0.244
		volcanoRadius   0.142
		volcanoTemp     296
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
		ModulateColor  (0.949 0.871 0.871)
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
		PeriodDays      2.28272685
		SemiMajorAxisKm 22471.383
		Eccentricity    0.0345925782
		Inclination     -0.916265057
		AscendingNode   53.5188883
		ArgOfPericenter -100.627965
		MeanAnomaly     172.498397
	}
}


