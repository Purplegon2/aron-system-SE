Planet	"Hadea"
{
	ParentBody     "Fate"
	Class          "Terra"
	Mass            3.59617186
	Radius          8750.58887
	InertiaMoment   0.330291718
	RotationPeriod  273.248168
	Obliquity       0.496464778
	EqAscendNode    148.02263

	AbsMagn         -4.5
	SlopeParam      2.97
	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_arid_mars2_green.cfg"
		SurfStyle       0.244
		Randomize      (0.037, -0.755, -0.644)
		colorDistMagn   0.0676
		colorDistFreq   1.05e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.189
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.526
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.113
		heightTempGrad  0.375
		beachWidth      0.00096
		tropicWidth     0.5
		mainFreq        1.05
		venusFreq       1.15
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.301
		erosion         0
		montesMagn      0
		montesFreq      490
		montesSpiky     0.89
		montesFraction  0.12
		dunesMagn       0
		dunesFreq       83.9
		dunesFraction   0.89
		hillsMagn       0
		hillsFreq       1.16e+03
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.94
		riversSin       6.59
		riftsMagn       0
		riftsFreq       3.81
		riftsSin        5.32
		canyonsMagn     1
		canyonsFreq     242
		canyonsFraction 1
		cracksMagn      0
		cracksFreq      0.73
		cracksOctaves   0
		craterMagn      0
		craterFreq      26.6
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0
		volcanoFreq     1
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.683
		volcanoRadius   0.445
		volcanoTemp     1.04e+03
		lavaCoverTidal  0.219
		lavaCoverSun    0.109
		lavaCoverYoung  0.2
		stripeZones     2.4
		stripeTwist     0.308
		cycloneMagn     2.49
		cycloneFreq     0.759
		cycloneDensity  0.406
		cycloneOctaves  4
		BumpHeight      14.5
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.14
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoLava          true

	NoAtmosphere	true
	
	Climate
	{
		GlobalWindSpeed  12.6
	}

	Aurora
	{
		Height         163
		NorthLat       69.8
		NorthLon       71.4
		NorthRadius    3.06e+03
		NorthWidth     626
		NorthRings     4
		NorthBright    0.557
		NorthFlashFreq 73.3
		NorthMoveSpeed 1.25
		NorthParticles 50000
		SouthLat       -90
		SouthLon       -108
		SouthRadius    1.94e+03
		SouthWidth     639
		SouthRings     3
		SouthBright    0.557
		SouthFlashFreq 65.8
		SouthMoveSpeed 1.08
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   2.147
		GasToDust   0
		Particles   3166
		GasBright   0.0876
		DustBright  0.122
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0036722
		SemiMajorAxis   0.018330651
		Eccentricity    0.0603157627
		Inclination     0.496464778
		AscendingNode   148.02263
		ArgOfPericenter 265.470908
		MeanAnomaly     309.843962
	}
}

