Planet	"Noi"
{
	ParentBody     "Fate"
	Class          "Neptune"
	Mass            9.71928596
	Radius          17703.9375
	InertiaMoment   0.234544456
	Oblateness      0.0227478612
	RotationPeriod  11.4997609
	RotationEpoch   0
	Obliquity       -105.248079
	EqAscendNode    51.6861451

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cold_default.cfg"
		SurfStyle       0.369
		Randomize      (-0.622, -0.531, -0.990)
		detailScale     256
		tropicLatitude  0.966
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.141
		stripeZones     1.73
		stripeFluct     0.415
		stripeTwist     11.3
		cycloneMagn     12.9
		cycloneFreq     1.07
		cycloneDensity  0.381
		cycloneOctaves  0
		cycloneMagn2     0.666
		cycloneFreq2     0.699
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      17.8
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          260
		Velocity        975
		BumpHeight      18.2
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.758
		mainOctaves     12
		Coverage        0.489
		stripeZones     1.73
		stripeFluct     0.415
		stripeTwist     11.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          622.950256
		Density         0.00817847811
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0189
		Saturation      1.78

		Composition
		{
			H2        	89.9
			He        	8.33
			CH4       	1.25
			C3H8      	0.115
			C8H18     	0.113
			C2H2      	0.105
			C2H4      	0.0442
			N2        	0.0391
			NH3       	0.0305
			C2H6      	0.0242
			O2        	0.00949
			Ne        	0.00123
			Ar        	0.000917
			CO2       	5.49e-05
			H2O       	2.93e-06
			H2S       	1.85e-06
			Kr        	4.25e-07
			Xe        	4.62e-08
			CO        	1.36e-08
			SO2       	1.15e-08
			Cl2       	3.36e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  333
	}

	Aurora
	{
		Height         187
		NorthLat       56
		NorthLon       88.2
		NorthRadius    5.78e+03
		NorthWidth     1.8e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 66
		NorthMoveSpeed 1.08
		NorthParticles 10000
		SouthLat       -55.3
		SouthLon       -98.6
		SouthRadius    5.73e+03
		SouthWidth     1.83e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 71.3
		SouthMoveSpeed 0.919
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     2.36e+04
		OuterRadius     3.81e+04
		EdgeRadius      3.75e+04
		MeanRadius      2.82e+04
		Thickness       0.141
		RocksMaxSize    0.00564
		RocksSpacing    1
		DustDrawDist    423
		ChartRadius     3.75e+04
		RotationPeriod  4.73
		Brightness      1
		FrontBright     2.47
		BackBright      4.38
		Density         0.96
		Opacity         0.96
		SelfShadow      0.96
		PlanetShadow    0.96
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       716
		densityScale    2.26
		densityOffset   -1.86
		densityPower    4.88
		colorContrast   0.0648
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          3.5733
		SemiMajorAxis   1.8819306
		Eccentricity    0.0320770373
		Inclination     -0.163891729
		AscendingNode   67.0212759
		ArgOfPericenter 106.565202
		MeanAnomaly     158.192602
	}
}

