Planet	"Maaya"
{
	ParentBody     "Fate"
	Class          "Aquaria"
	Mass            7.35754728
	Radius          12115.5703
	InertiaMoment   0.330715209
	Oblateness      0.0154729551
	RotationPeriod  10.7406614
	RotationEpoch   0
	Obliquity       -30.1427347
	EqAscendNode    27.9401029

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_arid_pluto_variant.cfg"
		SurfStyle       0.245
		Randomize      (-0.423, 0.242, -0.712)
		colorDistMagn   0.0765
		colorDistFreq   1.56e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.233
		snowLevel       0.85
		tropicLatitude  0.477
		icecapLatitude  2
		icecapHeight    0.368
		climatePole     0.563
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.222
		heightTempGrad  0.375
		beachWidth      0.00122
		tropicWidth     0.5
		mainFreq        1.7
		venusFreq       1.39
		venusMagn       0.247
		mareFreq        1.89
		mareDensity     0
		terraceProb     0.142
		erosion         0
		montesMagn      0.228
		montesFreq      711
		montesSpiky     0.774
		montesFraction  0.0931
		dunesMagn       0.031
		dunesFreq       124
		dunesFraction   0.404
		hillsMagn       0.148
		hillsFreq       1.4e+03
		hillsFraction   0.504
		hills2Fraction  0.288
		riversMagn      0
		riversFreq      2.82
		riversSin       5.96
		riftsMagn       0
		riftsFreq       3.84
		riftsSin        5.33
		canyonsMagn     0.278
		canyonsFreq     2.93
		canyonsFraction 0
		cracksMagn      0.0786
		cracksFreq      4.07
		cracksOctaves   8
		craterMagn      0.811
		craterFreq      27.6
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.577
		volcanoFreq     0.806
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.208
		volcanoRadius   0.575
		volcanoTemp     338
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.96
		stripeTwist     0.0976
		cycloneMagn     2.86
		cycloneFreq     0.764
		cycloneDensity  0.376
		cycloneOctaves  4
		BumpHeight      14
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.25
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          15
		Velocity        73.9
		BumpHeight      4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.01
		mainOctaves     10
		Coverage        0.296
		stripeZones     1.96
		stripeTwist     0.0976
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          28.0433407
		Density         115.663147
		Pressure        48.3586845
		Greenhouse      39.6063995
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0.5
		Saturation      1.5

		Composition
		{
			N2        	89.5
			CO        	9.85
			CO2       	0.671
			Ar        	0.000262
			Ne        	3.31e-05
			He        	2.44e-05
			SO2       	1.15e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  2.05
	}

	Aurora
	{
		Height         17.7
		NorthLat       49.8
		NorthLon       -88.4
		NorthRadius    2.89e+03
		NorthWidth     799
		NorthRings     3
		NorthBright    0.925
		NorthFlashFreq 60.5
		NorthMoveSpeed 0.794
		NorthParticles 50000
		SouthLat       -47.9
		SouthLon       100
		SouthRadius    3.16e+03
		SouthWidth     1.06e+03
		SouthRings     2
		SouthBright    0.925
		SouthFlashFreq 69.1
		SouthMoveSpeed 0.786
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.98425
		SemiMajorAxis   0.7620163
		Eccentricity    0.0327229392
		Inclination     -1.67281318
		AscendingNode   24.7044535
		ArgOfPericenter 94.8236642
		MeanAnomaly     346.992619
	}
}

