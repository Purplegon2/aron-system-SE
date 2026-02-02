Planet	"Boreas"
{
	ParentBody     "Hope"
	Class          "Neptune"
	Mass            8.4343729
	Radius          21293.3652
	InertiaMoment   0.238852918
	RotationPeriod  11.2857048
	RotationEpoch   0
	Obliquity       124.488212
	EqAscendNode    -150.083637

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.382
	BrightnessReal  1.15

	Surface
	{
		Preset         "neptune_temperate_default.cfg"
		SurfStyle       0.97
		Randomize      (0.306, 0.443, 0.213)
		detailScale     257
		tropicLatitude  0.84
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.27
		stripeFluct     0.451
		stripeTwist     13.3
		cycloneMagn     9.08
		cycloneFreq     1.15
		cycloneDensity  0.53
		cycloneOctaves  0
		cycloneMagn2     0.374
		cycloneFreq2     0.682
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      17.3
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Gamma           0.1
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          400
		Velocity        -1.83e+03
		RotationOffset  -1.37
		BumpHeight      20.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.550 0.565 0.637)
		ModulateBright  1
		Opacity         0.748
		mainFreq        1.42
		mainOctaves     12
		Coverage        0.493
		stripeZones     1.27
		stripeFluct     0.451
		stripeTwist     13.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          982.576599
		Density         0.00538909854
		Pressure        5.40535736
		Greenhouse      0.8244286
		Bright          2.9
		Opacity         0.9
		SkyLight        0.611
		Hue             0.00382
		Saturation      0.687

		Composition
		{
			H2        	92.6
			He        	7.1
			CH4       	0.275
			N2        	0.0289
			NH3       	0.023
			O2        	0.00733
			C2H2      	0.00333
			C2H4      	0.00114
			Ne        	0.000904
			Ar        	0.000841
			C2H6      	0.00051
			C3H8      	0.000324
			C8H18     	0.000315
			H2O       	2.76e-06
			CO2       	1.45e-06
			H2S       	1.27e-06
			Kr        	3.67e-07
			Xe        	3.53e-08
			SO2       	8.68e-09
			CO        	3.26e-10
			Cl2       	2.6e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  681
	}

	Aurora
	{
		Height         248
		NorthLat       61.8
		NorthLon       157
		NorthRadius    4.68e+03
		NorthWidth     1.47e+03
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 67
		NorthMoveSpeed 1.42
		NorthParticles 10000
		SouthLat       -65.6
		SouthLon       -7.58
		SouthRadius    4.52e+03
		SouthWidth     746
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 68.6
		SouthMoveSpeed 0.943
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2457.9102879
		SemiMajorAxis   319.93045375
		Eccentricity    0.1758284087
		Inclination     3.61741774
		AscendingNode   -140.822219
		ArgOfPericenter 68.597272
		MeanAnomaly     250.490911
	}
}

