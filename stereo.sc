// Creates 3 channels:
// channel 1: freq 520, pulsating 2 times per second
// channel 2: freq 570, pulsating 3 times per second
// channel 3: freq 1000, pulsating 5 times per second

{Out.ar(0, SinOsc.ar(freq: [520, 570, 1000], mul: LFPulse.ar([2,3,5])))}.play;

// Creates a reverb bus.

r = {Out.ar(0, FreeVerb.ar(In.ar(55, 2), mix: 0.5, room: 0.9, mul: 0.4))}.play;

// Sends previous 3 channel signal to reverb bus.

{Out.ar(55, SinOsc.ar(freq: [520, 570, 1000], mul: LFPulse.ar([2,3,5])))}.play;
