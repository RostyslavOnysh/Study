package MateAcademy.DailyTask;

public class PrimeString {
    public static boolean isPrime(String string) {
        if (string.isEmpty()) {
            return true;
        }
        int n = string.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String repeatedSubstring = string.substring(0, i);
                if (isConstructedByRepeatingSubstring(string, repeatedSubstring)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isConstructedByRepeatingSubstring(String string, String substring) {
        int m = substring.length();
        int n = string.length();

        if (n % m != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) != substring.charAt(i % m)) {
                return false;
            }
        }
        return true;
    }
}