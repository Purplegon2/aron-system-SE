Planet	"Chressia"
{
	ParentBody     "Fate"
	Class          "Terra"
	Mass            1.84000003
	Radius          9654.56738
	InertiaMoment   0.35393545
	Oblateness      0.00155683537
	RotationPeriod  2.2012125
	Obliquity       -0.119892677
	EqAscendNode    -123.830841

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      0.992
	BrightnessReal  1

	Surface
	{
		Preset         "carbonia_airless_rust.cfg"
		SurfStyle       0.87
		Randomize      (0.412, -0.398, 0.888)
		colorDistMagn   0.0458
		colorDistFreq   195
		detailScale     187
		drivenDarkening 0
		seaLevel        0.55
		snowLevel       -0.542
		tropicLatitude  0.728
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
		humidity        0.134
		heightTempGrad  0.748
		beachWidth      0.00101
		tropicWidth     0.07
		mainFreq        2.09
		venusFreq       0.611
		venusMagn       0
		mareFreq        1.33
		mareDensity     0.116
		terraceProb     0.372
		erosion         0
		montesMagn      0.0962
		montesFreq      93.7
		montesSpiky     0.969
		montesFraction  0.85
		dunesMagn       0.0402
		dunesFreq       23.5
		dunesFraction   0.0637
		hillsMagn       0.121
		hillsFreq       188
		hillsFraction   0.0626
		hills2Fraction  0
		riversMagn      58
		riversFreq      4.07
		riversSin       4.61
		riftsMagn       66.5
		riftsFreq       4.12
		riftsSin        6.25
		eqridgeMagn     0.37
		eqridgeWidth    0.0216
		eqridgeModMagn  2.35
		eqridgeModFreq  10
		canyonsMagn     0.502
		canyonsFreq     0.666
		canyonsFraction 0.207
		cracksMagn      0.0608
		cracksFreq      1.21
		cracksOctaves   0
		craterMagn      0.608
		craterFreq      8.1
		craterDensity   0.885
		craterOctaves   19
		craterRayedFactor 0.113
		volcanoMagn     0.401
		volcanoFreq     0.828
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.72
		volcanoFlows    0.241
		volcanoRadius   0.309
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0.687
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (0.824 0.750 0.264)
		GlowBright      0.916
		TempMapMaxTemp  1.75e+03
	}

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          1130.92847
		Density         2.87088156
		Pressure        1.11122382
		Greenhouse      169.641235
		Bright          1.68
		Opacity         0.534
		SkyLight        0
		Hue             0.5
		Saturation      0.794

		Composition
		{
			SO2       	85
			N2		10.1
			Kr        	4.68
			C8H18     	0.206
			Cl2       	0.0429
			Xe        	0.00668
		}
	}

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
		RefPlane	"Equator"
		Period		1.113
		SemiMajorAxis	0.7914
		Eccentricity	0.0939481028
		Inclination	0
	}
}

