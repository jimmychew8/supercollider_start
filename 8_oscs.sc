# 8 sine oscillators adding random micropolyphony. 

{8.do({{SinOsc.ar(Rand(1,4) * 330, 0 ,0.05)}.play; 1.wait;})}.fork;
