DwarfPlanet	"Micherinos"
{
	ParentBody     "Hope"
	Class          "Terra"
	Mass            0.000108261222
	Radius          397.382904
	InertiaMoment   0.397417963
	Oblateness     (0.069, 0.000, 0.000)
	Obliquity       -1.40124269
	EqAscendNode    145.123031
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.3
	BrightnessReal  1

	Surface
	{
		Preset         "terra_airless_ganymede.cfg"
		SurfStyle       0.236
		Randomize      (0.216, 0.271, 0.174)
		colorDistMagn   0.0462
		colorDistFreq   39.1
		detailScale     1.02e+03
		drivenDarkening 0.084
		seaLevel        -0.084
		snowLevel       2
		tropicLatitude  0.806
		icecapLatitude  2
		icecapHeight    0.229
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.306
		heightTempGrad  0.625
		beachWidth      0.000775
		tropicWidth     0.07
		mainFreq        1.79
		venusFreq       0.381
		venusMagn       0
		mareFreq        0
		mareDensity     0.162
		terraceProb     0.194
		erosion         0
		montesMagn      0.0645
		montesFreq      0
		montesSpiky     0.366
		montesFraction  0.0916
		dunesMagn       0.992
		dunesFreq       5.5e+04
		dunesFraction   0.362
		hillsMagn       0.107
		hillsFreq       40.3
		hillsFraction   0.443
		hills2Fraction  0
		riversMagn      55.2
		riversFreq      3.67
		riversSin       5.63
		riftsMagn       58.1
		riftsFreq       3.04
		riftsSin        7.69
		eqridgeMagn     0.0611
		eqridgeWidth    0.00782
		eqridgeModMagn  0.153
		eqridgeModFreq  1.3
		canyonsMagn     0.512
		canyonsFreq     0.123
		canyonsFraction 0.443
		cracksMagn      0.0334
		cracksFreq      0.15
		cracksOctaves   0
		craterMagn      0.682
		craterFreq      0.795
		craterDensity   0.922
		craterOctaves   17
		craterRayedFactor 0.389
		volcanoMagn     0.181
		volcanoFreq     0.8
		volcanoDensity  0.245
		volcanoOctaves  3
		volcanoActivity 0.206
		volcanoFlows    0.847
		volcanoRadius   0.164
		volcanoTemp     1.08e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.9
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.573
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
		Period      	1.01312028
		SemiMajorAxis	141.3184
		Eccentricity    0.5756850734
		Inclination     -19.40124269
		AscendingNode   145.123031
		ArgOfPericenter -80.748021
		MeanAnomaly     -81.9958161
	}
}

