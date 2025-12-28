DwarfPlanet	"Supaolupao"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            4.79944674e-07
	Radius          329.399994
	InertiaMoment   0.399072528
	Oblateness     (0.000, 0.000, 0.117)
	RotationPeriod  22.0982844
	Obliquity       -1.2113768
	EqAscendNode    177.549293

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.611
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.74
		Randomize      (-0.783, -0.165, 0.274)
		colorDistMagn   0.0777
		colorDistFreq   40.8
		detailScale     1.02e+03
		drivenDarkening 0.7
		seaLevel        0.164
		snowLevel       2
		tropicLatitude  0.0532
		icecapLatitude  0.576
		icecapHeight    0.225
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26
		heightTempGrad  0.625
		beachWidth      0.000825
		tropicWidth     0.07
		mainFreq        2.09
		venusFreq       1.2
		venusMagn       0
		mareFreq        0
		mareDensity     0.169
		terraceProb     0.292
		erosion         0
		montesMagn      0.0704
		montesFreq      20.7
		montesSpiky     0.944
		montesFraction  0.195
		dunesMagn       0.0475
		dunesFreq       3.16
		dunesFraction   0.282
		hillsMagn       0.148
		hillsFreq       10.6
		hillsFraction   0.759
		hills2Fraction  0.214
		riversMagn      0
		riversFreq      2.16
		riversSin       6.23
		riftsMagn       0
		riftsFreq       2.2
		riftsSin        5.68
		canyonsMagn     0.46
		canyonsFreq     0.0876
		canyonsFraction 0
		cracksMagn      0.0372
		cracksFreq      0.11
		cracksOctaves   0
		craterMagn      0.689
		craterFreq      0.921
		craterDensity   0.901
		craterOctaves   16
		craterRayedFactor 0.0532
		volcanoMagn     0.196
		volcanoFreq     0.719
		volcanoDensity  0.187
		volcanoOctaves  3
		volcanoActivity 0.127
		volcanoFlows    0.211
		volcanoRadius   0.152
		volcanoTemp     252
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.374
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
		Period          1873.712096246
		SemiMajorAxis   152.637061481
		Eccentricity    0.948047568
		Inclination     -25.2113768
		AscendingNode   177.549293
		ArgOfPericenter 39.0727456
		MeanAnomaly     161.410345
	}
}

