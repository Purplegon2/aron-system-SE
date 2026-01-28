DwarfPlanet	"Liata"
{
	ParentBody     "Fate"
	Class          "Aquaria"
	Mass            0.000532478385
	Radius          662.006958
	InertiaMoment   0.399612546
	Obliquity       -0.954299814
	EqAscendNode    3.39840601
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.799
		Randomize      (0.743, -0.970, 0.285)
		colorDistMagn   0.07
		colorDistFreq   94.1
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.195
		snowLevel       2
		tropicLatitude  0.491
		icecapLatitude  0.989
		icecapHeight    0.00562
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.476
		heightTempGrad  0.625
		beachWidth      0.00108
		tropicWidth     0.07
		mainFreq        1.69
		venusFreq       1.24
		venusMagn       0
		mareFreq        0.045
		mareDensity     0.139
		terraceProb     0.357
		erosion         0
		montesMagn      0.0463
		montesFreq      24.8
		montesSpiky     0.983
		montesFraction  0.822
		dunesMagn       0.0376
		dunesFreq       5.25
		dunesFraction   0.564
		hillsMagn       0.132
		hillsFreq       83.1
		hillsFraction   0.505
		hills2Fraction  0.0201
		riversMagn      0
		riversFreq      2.88
		riversSin       6.53
		riftsMagn       0
		riftsFreq       2.14
		riftsSin        5.38
		canyonsMagn     0.4
		canyonsFreq     0.254
		canyonsFraction 0
		cracksMagn      0.0395
		cracksFreq      0.238
		cracksOctaves   0
		craterMagn      0.587
		craterFreq      1.43
		craterDensity   0.842
		craterOctaves   18
		craterRayedFactor 0.246
		volcanoMagn     0.196
		volcanoFreq     0.767
		volcanoDensity  0.264
		volcanoOctaves  3
		volcanoActivity 0.279
		volcanoFlows    0.157
		volcanoRadius   0.154
		volcanoTemp     286
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
		Period          7.3478674
		SemiMajorAxis	3.993
		Eccentricity    0.0411527995
		Inclination     -0.954299814
		AscendingNode   3.39840601
		ArgOfPericenter -72.1571761
		MeanAnomaly     136.751567
	}
}

