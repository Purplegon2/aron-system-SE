DwarfPlanet	"Priobe"
{
	ParentBody     "Hope"
	Class          "Aquaria"
	Mass            0.001158779415
	Radius          972.941467
	InertiaMoment   0.397931784
	Oblateness      0.00145780051
	RotationPeriod  76.564603
	Obliquity       0.256781819
	EqAscendNode    78.5249899

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.84
	BrightnessReal  0.534

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.0883
		Randomize      (-0.894, -0.094, 0.821)
		colorDistMagn   0.0539
		colorDistFreq   65.7
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.186
		snowLevel       2
		tropicLatitude  0.161
		icecapLatitude  0.674
		icecapHeight    0.161
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.205
		heightTempGrad  0.625
		beachWidth      0.00128
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       1.34
		venusMagn       0
		mareFreq        0
		mareDensity     0.133
		terraceProb     0.198
		erosion         0
		montesMagn      0.0514
		montesFreq      21.4
		montesSpiky     0.989
		montesFraction  0.269
		dunesMagn       0.0479
		dunesFreq       4.93
		dunesFraction   0.589
		hillsMagn       0.136
		hillsFreq       18.6
		hillsFraction   0.0015
		hills2Fraction  0.167
		riversMagn      0
		riversFreq      4.05
		riversSin       6.3
		riftsMagn       0
		riftsFreq       3.39
		riftsSin        6.07
		canyonsMagn     0.567
		canyonsFreq     0.256
		canyonsFraction 0
		cracksMagn      0.0289
		cracksFreq      0.339
		cracksOctaves   0
		craterMagn      0.52
		craterFreq      1.53
		craterDensity   0.922
		craterOctaves   17
		craterRayedFactor 0.193
		volcanoMagn     0.172
		volcanoFreq     0.682
		volcanoDensity  0.294
		volcanoOctaves  3
		volcanoActivity 0.346
		volcanoFlows    0.187
		volcanoRadius   0.137
		volcanoTemp     403
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
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
		GlobalWindSpeed  0.0001
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period      11649.93962298
		SemiMajorAxis 932.881
		Eccentricity    0.892890856
		Inclination     43.856781819
		AscendingNode   38.5249899
		ArgOfPericenter 154.498203
		MeanAnomaly     173.728307
	}
}

Moon	"Brinos"
{
	ParentBody     "Priobe"
	Class          "Asteroid"
	Mass            1.49820777e-08
	Radius          19.2441273
	InertiaMoment   0.399971634
	Oblateness     (0.000, 0.000, 0.117)
	RotationPeriod  441.329819
	RotationEpoch   0
	Obliquity       25.0437161
	EqAscendNode    84.696318

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.486
		Randomize      (0.621, -0.303, -0.850)
		colorDistMagn   0.568
		colorDistFreq   0.397
		detailScale     128
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.461
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
		humidity        0.475
		heightTempGrad  0.625
		beachWidth      0.000705
		tropicWidth     0.07
		mainFreq        0.684
		venusFreq       0.591
		venusMagn       0.543
		mareDensity     0
		terraceProb     0.369
		erosion         0
		montesMagn      0.395
		montesFreq      3.96
		montesSpiky     0.982
		montesFraction  0.276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77
		hillsFraction   0.812
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.263
		craterFreq      0.177
		craterDensity   0.802
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5
		volcanoTemp     264
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		RefPlane        "Equator"
		Perioddays      .5372661
		SemiMajorAxisKm 9230.1
		Eccentricity    0.214532463
		Inclination     16.7269063
		AscendingNode   87.1362799
		ArgOfPericenter 15.1712088
		MeanAnomaly     -158.631892
	}
}



