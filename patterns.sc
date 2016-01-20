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
