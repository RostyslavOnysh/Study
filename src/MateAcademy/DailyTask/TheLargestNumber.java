package MateAcademy.DailyTask;

import java.util.Arrays;

public class TheLargestNumber {
    public static long getMaxNumber(long num) {
        String numStr = String.valueOf(num);
        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);

        StringBuilder result = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            result.append(digits[i]); // додаємо символи у зворотньому порядку
        }

        return Long.parseLong(result.toString());
    }
}


/*
Реалізуй метод getMaxNumber(), який приймає число num і повертає найбільше число, яке може бути утворене з цифр даного числа.

Примітки:

числа містять цифри [0; 9] включно
можливі дублікати цифр
в метод передаються тільки натуральні числа
Приклади:

213 => 321
2399783 => 9987332
 */