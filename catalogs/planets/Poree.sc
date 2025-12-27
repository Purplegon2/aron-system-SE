Planet	"Poree"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            0.314805036
	Radius          4337.04
	InertiaMoment   0.334263504
	Oblateness      0.00883827172
	RotationPeriod  18.1391716
	RotationEpoch   0
	Obliquity       28.0687888
	EqAscendNode    -110.367709

	AlbedoBond      0.819
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.982
		Randomize      (0.512, -0.062, -0.398)
		colorDistMagn   0.0801
		colorDistFreq   798
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.215
		snowLevel       0.85
		tropicLatitude  0.368
		icecapLatitude  0.898
		icecapHeight    0.0561
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.264
		heightTempGrad  0.625
		beachWidth      0.00153
		tropicWidth     0.07
		mainFreq        1.53
		venusFreq       1.71
		venusMagn       0.184
		mareFreq        1.76
		mareDensity     0
		terraceProb     0.198
		erosion         0
		montesMagn      0.206
		montesFreq      409
		montesSpiky     0.958
		montesFraction  0.756
		dunesMagn       0.0358
		dunesFreq       73.9
		dunesFraction   0.498
		hillsMagn       0.148
		hillsFreq       763
		hillsFraction   0.0945
		hills2Fraction  0.113
		riversMagn      0
		riversFreq      3.41
		riversSin       4.98
		riftsMagn       0
		riftsFreq       3.58
		riftsSin        6.67
		canyonsMagn     0.492
		canyonsFreq     3.21
		canyonsFraction 0
		cracksMagn      0.0259
		cracksFreq      3.97
		cracksOctaves   6
		craterMagn      0.629
		craterFreq      20.1
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.577
		volcanoFreq     0.722
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.156
		volcanoRadius   0.532
		volcanoTemp     375
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.79
		stripeTwist     0.132
		cycloneMagn     2.59
		cycloneFreq     1.09
		cycloneDensity  0.437
		cycloneOctaves  4
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      1.26
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.5
		Velocity        128
		BumpHeight      2.23
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.967
		ModulateBright  1
		mainFreq        0.87
		mainOctaves     10
		Coverage        0.313
		stripeZones     2.79
		stripeTwist     0.132
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          60
		Density         3.64319038
		Pressure        0.771713793
		Greenhouse      3.97504401
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             -0.00583
		Saturation      0.963

		Composition
		{
			N2        	99.8
			CH4       	0.177
			CO        	0.0519
			CO2       	0.0105
			NH3       	0.00372
			Ne        	0.00161
			Ar        	0.0013
			H2O       	0.000729
			C2H4      	0.00012
			C2H2      	3.08e-05
			O2        	2.25e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  6.5
	}

	Aurora
	{
		Height         34.4
		NorthLat       54
		NorthLon       55.6
		NorthRadius    2.45e+03
		NorthWidth     686
		NorthRings     3
		NorthBright    0.355
		NorthFlashFreq 75.2
		NorthMoveSpeed 0.999
		NorthParticles 50000
		SouthLat       -39
		SouthLon       -129
		SouthRadius    1.78e+03
		SouthWidth     597
		SouthRings     2
		SouthBright    0.355
		SouthFlashFreq 70
		SouthMoveSpeed 0.822
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     2.54e+04
		OuterRadius     2.15e+04
		EdgeRadius      2.15e+04
		MeanRadius      1.34e+04
		Thickness       0.067
		RocksMaxSize    0.55
		RocksSpacing    16.6
		DustDrawDist    201
		ChartRadius     2.15e+04
		RotationPeriod  5.76
		Brightness      1
		FrontBright     2.95
		BackBright      4.24
		Density         0.967
		Opacity         0.967
		SelfShadow      0.967
		PlanetShadow    0.967
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       1.5e+03
		densityScale    2.15
		densityOffset   -1.46
		densityPower    5.06
		colorContrast   0.0736
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
		PeriodDays      889.31
		SemiMajorAxis   1.81
		Eccentricity    0.057016189
		Inclination     0
		AscendingNode   -116.972546
		ArgOfPericenter 352.429827
		MeanAnomaly     129.154196
	}
}

Moon	"Paite"
{
	ParentBody     "Poree"
	Class          "Asteroid"
	AsterType      "Amor"
	Mass            1.38439274
	Radius          0.5
	InertiaMoment   0.39936468
	Oblateness      0.231208667
	RotationPeriod  4.42601
	RotationEpoch   0
	Obliquity       356.829943
	EqAscendNode    263.288006

	AbsMagn         17.3
	SlopeParam      0.15
	Albedo          0.23
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.746
		Randomize      (0.383, -0.287, 0.863)
		colorDistMagn   0.49
		colorDistFreq   0.000204
		detailScale     8
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0933
		icecapLatitude  2
		icecapHeight    0.807
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.101
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.534
		venusFreq       0.561
		venusMagn       0.702
		mareDensity     0
		terraceProb     0.324
		erosion         0
		montesMagn      0.657
		montesFreq      3.4
		montesSpiky     0.93
		montesFraction  0.725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000752
		hillsFraction   0.674
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.253
		craterFreq      0.213
		craterDensity   0.917
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466
		volcanoTemp     245
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.504
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
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
		RefPlane        "Ecliptic"
		Epoch           2457400.5
		PeriodDays	2.81
		SemiMajorAxis   0.000512
		Eccentricity    0.4586428
		Inclination     2.18187
		AscendingNode   261.45418
		ArgOfPericenter 126.33098
		MeanAnomaly     67.34618
	}
}

