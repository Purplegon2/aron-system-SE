DwarfPlanet	"Tiecho"
{
	ParentBody     "Hope"
	Class          "Ferria"
	Mass            0.0313904323
	Radius          1270.07532
	InertiaMoment   0.354743063
	Obliquity       2.78580983
	EqAscendNode    -35.4327412
	TidalLocked     false

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "ferria_airless_sandy.cfg"
		SurfStyle       0.923
		Randomize      (0.269, 0.476, 0.834)
		colorDistMagn   0.0852
		colorDistFreq   269
		detailScale     8.19e+03
		drivenDarkening 0
		seaLevel        0.28
		snowLevel       2
		tropicLatitude  0.000744
		icecapLatitude  2
		icecapHeight    0.423
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.459
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        1.66
		venusFreq       1.39
		venusMagn       0
		mareFreq        0.797
		mareDensity     0.178
		terraceProb     0.427
		erosion         0
		montesMagn      0.0903
		montesFreq      98.8
		montesSpiky     0.802
		montesFraction  0.946
		dunesMagn       0.0388
		dunesFreq       12.9
		dunesFraction   0.599
		hillsMagn       0.14
		hillsFreq       243
		hillsFraction   0.217
		hills2Fraction  0
		riversMagn      60.6
		riversFreq      3.19
		riversSin       5.53
		riftsMagn       60.6
		riftsFreq       3.16
		riftsSin        6.25
		canyonsMagn     0.322
		canyonsFreq     0.67
		canyonsFraction 0.211
		cracksMagn      0.0396
		cracksFreq      0.861
		cracksOctaves   0
		craterMagn      0.633
		craterFreq      5.24
		craterDensity   0.772
		craterOctaves   19
		craterRayedFactor 0.106
		volcanoMagn     0.295
		volcanoFreq     0.785
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.53
		volcanoFlows    0.151
		volcanoRadius   0.238
		volcanoTemp     1.26e+03
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

	Atmosphere
	{
		Model          "Ethereal"
		Height          137.899536
		Density         1.94079476e-07
		Pressure        1.17261699e-07
		Bright          0.651
		Opacity         0
		SkyLight        0.217
		Hue             -0.0169
		Saturation      0.627

		Composition
		{
			C8H18     	100
			Xe        	0.0408
		}
	}

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
		Period          207.9276
		SemiMajorAxis   35.77
		Eccentricity    0.0957781393
		Inclination     2.74320525
		AscendingNode   -35.460334
		ArgOfPericenter 21.6038207
		MeanAnomaly     178.703484
	}
}

