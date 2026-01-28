DwarfPlanet	"Creonus"
{
	ParentBody     "Hope"
	Class          "Carbonia"
	Mass            0.000364605483
	Radius          508.615631
	InertiaMoment   0.39802888
	Oblateness      0.00512297498
	Obliquity       0.346432202
	EqAscendNode    -150.150113
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.41
	BrightnessReal  1.45

	Surface
	{
		Preset         "carbonia_airless_graphite.cfg"
		SurfStyle       0.369
		Randomize      (0.201, 0.388, 0.449)
		colorDistMagn   0.0635
		colorDistFreq   59.6
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.113
		snowLevel       2
		tropicLatitude  0.312
		icecapLatitude  1.4
		icecapHeight    0.504
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.171
		heightTempGrad  0.625
		beachWidth      0.000834
		tropicWidth     0.07
		mainFreq        1.82
		venusFreq       0.937
		venusMagn       0
		mareFreq        0
		mareDensity     0.111
		terraceProb     0.209
		erosion         0
		montesMagn      0.0349
		montesFreq      21.4
		montesSpiky     0.946
		montesFraction  0.911
		dunesMagn       0.0248
		dunesFreq       3.68
		dunesFraction   0.454
		hillsMagn       0.0924
		hillsFreq       60.8
		hillsFraction   0.826
		hills2Fraction  0
		riversMagn      62.5
		riversFreq      2.59
		riversSin       6.64
		riftsMagn       64.9
		riftsFreq       2.58
		riftsSin        5.42
		canyonsMagn     0.699
		canyonsFreq     0.205
		canyonsFraction 0.435
		cracksMagn      0.0212
		cracksFreq      0.147
		cracksOctaves   0
		craterMagn      0.916
		craterFreq      3.82
		craterDensity   0.443
		craterOctaves   14
		craterRayedFactor 0.13
		volcanoMagn     0.194
		volcanoFreq     0.779
		volcanoDensity  0.291
		volcanoOctaves  3
		volcanoActivity 0.411
		volcanoFlows    0.433
		volcanoRadius   0.146
		volcanoTemp     1.12e+03
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
		Gamma           1.23
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.772 0.798 0.816)
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
		Period      6.38321745
		SemiMajorAxis 2.63536
		Eccentricity    0.026707032319
		Inclination     4.346432202
		AscendingNode   -150.150113
		ArgOfPericenter -29.9984853
		MeanAnomaly     28.2151154
	}
}

