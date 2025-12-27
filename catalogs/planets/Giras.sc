Planet	"Giras"
{
	ParentBody     "Hope"
	Class          "Jupiter"
	Mass            25.451
	Radius          22810.418
	InertiaMoment   0.190386653
	Oblateness      0.0312461052
	RotationPeriod  8.54682398
	RotationEpoch   0
	Obliquity       39.2554946
	EqAscendNode    28.5351968

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_frigid_uranus.cfg"
		SurfStyle       0.967
		Randomize      (0.378, -0.665, 0.642)
		detailScale     256
		tropicLatitude  0.578
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
		cycloneMagn     2.48
		cycloneFreq     0.746
		cycloneDensity  0.509
		cycloneOctaves  2
		BumpHeight      14.7
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
		Height          34.6
		Velocity        -1.89e+03
		BumpHeight      9.96
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.085
		mainOctaves     10
		Coverage        0.249
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
	}

	Clouds
	{
		Height          54.5
		Velocity        1.1e+03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.085
		mainOctaves     10
		Coverage        0.249
		stripeZones     1.29
		stripeFluct     0.335
		stripeTwist     2.71
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          213.827682
		Density         0.01074793
		Pressure        1
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.016
		Saturation      1.12

		Composition
		{
			H2        	93.2
			He        	6.45
			CH4       	0.257
			N2        	0.0354
			NH3       	0.0267
			O2        	0.00766
			C2H2      	0.00309
			C2H4      	0.00139
			Ne        	0.00106
			Ar        	0.000759
			C2H6      	0.000542
			C3H8      	0.00034
			C8H18     	0.000287
			H2O       	3.1e-06
			CO2       	1.54e-06
			H2S       	1.48e-06
			Kr        	3.69e-07
			Xe        	3.52e-08
			SO2       	8.53e-09
			Cl2       	3.26e-10
			CO        	3.04e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  311
	}

	Aurora
	{
		Height         299
		NorthLat       86.8
		NorthLon       88.5
		NorthRadius    5.5e+03
		NorthWidth     2.71e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 69.7
		NorthMoveSpeed 1.45
		NorthParticles 10000
		SouthLat       -85.6
		SouthLon       -87.2
		SouthRadius    5.64e+03
		SouthWidth     2.46e+03
		SouthRings     2
		SouthBright    1
		SouthFlashFreq 71.9
		SouthMoveSpeed 1.06
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
		Period          182.108469
		SemiMajorAxis   32.07
		Eccentricity    0.0781956299
		Inclination     0
		AscendingNode   25.3283104
		ArgOfPericenter 208.415638
		MeanAnomaly     204.329718
	}
}

Moon	"Mairelia"
{
	ParentBody     "Giras"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          564.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	

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
		Period		236.634
		SemiMajorAxis	0.0041
		Eccentricity    0.20243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

Moon	"Matha"
{
	ParentBody     "Giras"
	Class          "Aquaria"
	Mass            0.000276038569
	Radius          564.911499
	InertiaMoment   0.397296816
	Oblateness      0.00249899435
	Obliquity       0.887225691
	EqAscendNode    -107.027698
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	

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
		Period		236.634
		SemiMajorAxis	0.0071
		Eccentricity    0.00243081901
		Inclination     0.887225691
		AscendingNode   -107.027698
		ArgOfPericenter -7.81802589
		MeanAnomaly     126.264074
	}
}

