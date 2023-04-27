package MateAcademy.CodeWars;

public class Cockroach {
        public int cockroachSpeed(double x){
            double ceil = Math.round(x * 27.7778);
        return (int) ceil;
        }
    }

//

    /*
    Example 2: Convert 80 km/h to cm/s

cm/s = (80 km/h) * 27.7778 = 222222.2 cm/s

Therefore, 80 km/h is equal to 222222.2 cm/s.
     */
/*
The cockroach is one of the fastest insects.
Write a function which takes its speed in km per hour and returns it in cm per second,
rounded down to the integer (= floored).

For example:1.08 --> 30
Note! The input is a Real number (actual type is language dependent) and is >= 0.
 The result should be an Integer.
 */