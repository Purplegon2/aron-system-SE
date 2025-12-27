DwarfPlanet	"Liaka"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          664.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     true

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
		Period		342.95
		SemiMajorAxis	49.916
		Eccentricity    0.20243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

