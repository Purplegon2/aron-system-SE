Star	"Fate"
{
	ParentBody     "Hope & Fate System"
	Class          "M0.9 V"
	Luminosity      0.0250620469
	LumBol          0.0434726886
	MassSol         0.456619143
	RadSol          0.464530766
	Teff            3733

	Age             0.382

	InertiaMoment   0.0455791168
	RotationPeriod  454.489746
	RotationEpoch   0
	Obliquity       100.284081
	EqAscendNode    84.9844666

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.610 0.313)

	Surface
	{
		SurfStyle       0.236
		Randomize      (-0.443, 0.639, 0.336)
		colorDistMagn   0
		colorDistFreq   0
		detailScale     8.19e+03
		tropicLatitude  0.727
		icecapLatitude  1.02
		climatePole     0.415
		climateTropic   0.112
		mareFreq        32.5
		mareDensity     0.0147
		erosion         1
		montesMagn      0.03
		montesFreq      537
		dunesMagn       0.529
		hillsMagn       0.03
		hillsFreq       1.85e+03
		canyonsMagn     0.288
		cracksOctaves   5
		BumpHeight      413
		BumpOffset      413
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.92
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          3231.74048
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      1.87e+06
		Period      0.0299
		Brightness  0.5
		RayDensity  2.96
		RayCurv     9.92
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		Period          2517.273
		SemiMajorAxis   2963.23958
		Eccentricity    0.12
		Inclination     100.284081
		AscendingNode   84.9844666
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

