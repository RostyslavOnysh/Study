package MateAcademy.DailyTask;

public class BitsToInteger {
    public static int reverseBitsToInteger(int number) {
        if (number > 0) {
            String binaryString = Integer.toBinaryString(number);
            StringBuilder builder = new StringBuilder(binaryString).reverse();
            String reversed = builder.toString();
            return Integer.parseInt(reversed, 2);
        }
        return 0;
    }
}

