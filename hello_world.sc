# 8 sine oscillators adding random micropolyphony offset by 1 second.

{8.do({{SinOsc.ar(Rand(1,4) * 330, 0 ,0.05)}.play; 1.wait;})}.fork;


# Major scale going down. 

(
SynthDef(\smooth, { |freq = 440, sustain = 1, amp = 0.5|
    var sig;
    sig = SinOscFB.ar(freq, 0, amp) * EnvGen.kr(Env.linen(0.05, sustain, 0.1), doneAction: 2);
    Out.ar(0, sig ! 2)
}).add;
)

(
p = Pbind(
        // the name of the SynthDef to use for each note
    \instrument, \smooth,
        // MIDI note numbers -- converted automatically to Hz
    \midinote, Pseq([67, 65, 64, 62, 60], 1),
        // rhythmic values
    \dur, Pseq([4, 3, 2, 1, 4], 1)
).play;
)  
