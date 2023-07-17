package MateAcademy.DailyTask;


import java.util.LinkedList;

public class MaxRotate {
    public static long getMaxRotations(long number) {
            String num = String.valueOf(number);

            for (int i = 0; i < num.length() - 1; i++) {
                num = num.substring(0, i)
                        +  num.substring(i + 1)
                        + num.charAt(i);
                if (Long.parseLong(num) > number) {
                    number = Long.parseLong(num);
                }
            }
            return number;
        }
    }