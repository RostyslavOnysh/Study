package MateAcademy.DailyTask;

import java.text.DecimalFormat;

public class RoundNumbers {
    private static final DecimalFormat decfor = new DecimalFormat("0.##");

    public static double roundToHundredth(double num) {
        String roundedValue = decfor.format(num);
        roundedValue = roundedValue.replace(',', '.');
        return Double.parseDouble(roundedValue);
    }
}
