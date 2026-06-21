Star	"Hope"
{
	ParentBody     "Hope & Fate System"
	Class          "K0 V"
	Luminosity      0.436
	LumBol          0.436
	MassSol         0.76
	Radius          542681
	Teff            5311

	Age             4.57

	InertiaMoment   0.0651550293
	Oblateness      9.00000032e-06
	RotationPeriod  609.119878
	RotationEpoch   0
	Obliquity       25.5797787
	EqAscendNode    259.90979

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.820 0.700)

	Surface
	{
		SurfStyle       0.722
		Randomize      (-0.858, 0.931, 0.213)
		colorDistMagn   0
		colorDistFreq   0
		detailScale     3.28e+04
		tropicLatitude  0.7
		icecapLatitude  1
		climatePole     0.448
		climateTropic   0.104
		mareFreq        40.5
		mareDensity     0.00849
		erosion         1
		montesMagn      0.03
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       5.16e+03
		canyonsMagn     0.268
		cracksOctaves   5
		BumpHeight      601
		BumpOffset      601
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.59
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          5427
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
		Radius      2.67603e+06
		Period      0.0206
		Brightness  0.5
		RayDensity  3.12
		RayCurv     17
	}

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Extrasolar"
		Period          220144.390226
		SemiMajorAxis	-1460.79553569
		Eccentricity    0
		Inclination     100.284081
		AscendingNode   84.9844666
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}


