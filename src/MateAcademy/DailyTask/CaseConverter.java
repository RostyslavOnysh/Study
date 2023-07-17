package MateAcademy.DailyTask;

public class CaseConverter {
    public static String convertString(String string) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (char c : string.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        if (lowercaseCount == uppercaseCount) {
            return string.toLowerCase();
        }

        return (lowercaseCount > uppercaseCount) ? string.toLowerCase() : string.toUpperCase();
    }
}