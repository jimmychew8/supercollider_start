// Pbind with Pwhite, Prand, Pseq
(
Pbind(
	// Pwhite(lower range, upper range) of randomness
	//Pseq([0,1,5,3,-3])
	\freq, Pwhite(250, 500),
	// Prand (descrete values to choose randomly).
	\dur, Prand([0.005, 0.05, 0.5, 1], inf),
	\amp, 0.2,
	\legato, 1,
).trace.play;
)

// Pxrand (choose randomly, but no repeats)
(
Pbind(
	\note, Pxrand([0, 2, 3, 5, 7, 8, 11, 12], inf),
	\dur, 0.15;
).trace.play;
)

// Pgeom (geometric series)
(
Pbind(
	\note, Pseq([0, 2, 3, 5, 7, 8, 11, 12], inf),
	\dur, Pgeom(0.1, 1.1, 25);
).play;
)

// Pseries
(
Pbind(
	\note, Pseries(0, 2, 15),
	\dur, 0.15;
).play;
)
