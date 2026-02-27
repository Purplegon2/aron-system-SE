DwarfPlanet	"Enquitu"
{
	ParentBody     "Fate"
	Class          "Terra"
	Mass            0.00138375035
	Radius          931.213013
	InertiaMoment   0.394333899
	Oblateness      0.0104338266
	Obliquity       0.539289648
	EqAscendNode    127.33906
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.763
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.309
		Randomize      (-0.475, 0.642, 0.292)
		colorDistMagn   0.0848
		colorDistFreq   101
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.262
		snowLevel       2
		tropicLatitude  0.614
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
		humidity        0.454
		heightTempGrad  0.625
		beachWidth      0.00112
		tropicWidth     0.07
		mainFreq        1.96
		venusFreq       1.3
		venusMagn       0
		mareFreq        0.274
		mareDensity     0.119
		terraceProb     0.31
		erosion         0
		montesMagn      0.0763
		montesFreq      42.8
		montesSpiky     0.838
		montesFraction  0.704
		dunesMagn       0.0319
		dunesFreq       5.93
		dunesFraction   0.749
		hillsMagn       0.142
		hillsFreq       97.2
		hillsFraction   0.537
		hills2Fraction  0
		riversMagn      59.6
		riversFreq      3.86
		riversSin       4.2
		riftsMagn       60.6
		riftsFreq       2.52
		riftsSin        5.09
		eqridgeMagn     0.27
		eqridgeWidth    0.0259
		eqridgeModMagn  1.64
		eqridgeModFreq  9.29
		canyonsMagn     0.511
		canyonsFreq     0.356
		canyonsFraction 0.418
		cracksMagn      0.038
		cracksFreq      0.573
		cracksOctaves   0
		craterMagn      0.659
		craterFreq      1.96
		craterDensity   0.924
		craterOctaves   18
		craterRayedFactor 0.246
		volcanoMagn     0.163
		volcanoFreq     0.738
		volcanoDensity  0.371
		volcanoOctaves  3
		volcanoActivity 0.715
		volcanoFlows    0.337
		volcanoRadius   0.152
		volcanoTemp     300
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
		Period          48.612
		SemiMajorAxis   10.283030
		Eccentricity    0.331019565
		Inclination     -8.539289648
		AscendingNode   127.33906
		ArgOfPericenter -147.920966
		MeanAnomaly     133.457609
	}
}

