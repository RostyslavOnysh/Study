package MateAcademy.DailyTask;

import java.text.DecimalFormat;

public class Converter {
    private static final DecimalFormat decfor = new DecimalFormat("0.##");
    private static final float GALON_TO_LITERS = 4.54609188f;
    private static final float MILE_TO_KM = 1.609344f;

    public static float toKiloPerLiter(float mpg) {
        float kilometersPerLitr = mpg * MILE_TO_KM / GALON_TO_LITERS;
        String roundedValue = decfor.format(kilometersPerLitr);
        roundedValue = roundedValue.replace(',', '.');
        return Float.parseFloat(roundedValue);
    }
}
