// See post window for the path of the recording
// Basic mouse Theremin with ability to record

(
s.record;
{SinOsc.ar(
	freq: MouseY.kr(60, 2500), 
	mul: MouseX.kr(0, 1))}.play;

s.stopRecording;
s.makeWindow;
)


	
