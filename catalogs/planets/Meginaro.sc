Comet	"Meginaro"
{
	ParentBody     "Hope"
	Class          "Asteroid"
	Mass            2.37350024e-15
	Radius          7.09223604
	InertiaMoment   0.398437023
	Oblateness     (0.330, 0.206, 0.213)
	RotationPeriod  52.8
	RotationEpoch   0
	Obliquity       163.76414
	EqAscendNode    58.1825052

	AbsMagn         1
	SlopeParam      4
	AlbedoBond      0.0545
	AlbedoGeom      0.0653
	Brightness      0.763
	BrightnessReal  1.76

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.511
		Randomize      (0.870, -0.901, -0.260)
		colorDistMagn   0.557
		colorDistFreq   0.000408
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0262
		icecapLatitude  0.961
		icecapHeight    0.00994
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.112
		heightTempGrad  0.625
		beachWidth      0.000986
		tropicWidth     0.07
		mainFreq        0.563
		venusFreq       0.519
		venusMagn       0.621
		mareDensity     0
		terraceProb     0.365
		erosion         0
		montesMagn      0.43
		montesFreq      2.47
		montesSpiky     0.982
		montesFraction  0.783
		dunesFraction   0
		hillsMagn       1.07
		hillsFreq       0.0749
		hillsFraction   0.655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.237
		craterFreq      0.252
		craterDensity   0.925
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466
		volcanoTemp     340
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.95
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.527
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Gamma           1.09
		Hapke           1
		SpotBright      6.26
		SpotWidth       0.0446
		DayAmbient      0.07
		ModulateColor  (0.805 0.795 0.795)
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

	CometTail
	{
		MaxLength   0.115
		GasToDust   0.191
		Particles   6700
		GasBright   0.0206
		DustBright  0.158
		GasColor   (0.786 0.846 0.906)
		DustColor  (0.668 0.676 0.707)
	}

	Orbit
	{
		RefPlane        "Ecliptic"
		Epoch           2449400.5
		Period          78.3158907
		SemiMajorAxis   29.8341443
		Eccentricity    0.967142908
		Inclination     162.262691
		AscendingNode   58.420081
		ArgOfPericenter 111.332485
		MeanAnomaly     38.3842645
	}
}

