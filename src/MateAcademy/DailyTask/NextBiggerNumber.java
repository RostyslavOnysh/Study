package MateAcademy.DailyTask;

import java.util.Arrays;

public class NextBiggerNumber {
    public static int getNextBiggerNumber(int n) {
        String numberToChar = String.valueOf(n);
        char[] digits = numberToChar.toCharArray();

        int i;
        for (i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }

        int x = digits[i - 1], smallest = i;
        for (int j = i + 1; j < digits.length; j++) {
            if (digits[j] > x && digits[j] < digits[smallest]){
                smallest = j;
            }
        }
        char temp = digits[i - 1];
        digits[i - 1] = digits[smallest];
        digits[smallest] = temp;

        Arrays.sort(digits, i, digits.length);

        int nextBiggerNumber;
        try {
            nextBiggerNumber = Integer.parseInt(new String(digits));
        } catch (NumberFormatException e) {
            nextBiggerNumber = -1; // Число перевищило межі типу int
        }

        return nextBiggerNumber;
    }
}
