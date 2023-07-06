package MateAcademy.DailyTask;

import java.util.regex.Pattern;

public class PnoneNumber {
    public static boolean isValid(String phoneNumber) {
        return Pattern.matches("\\(\\d{3}\\) \\d{3}-\\d{4}", phoneNumber);
    }
}
