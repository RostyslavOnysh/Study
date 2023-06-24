package MateAcademy.DailyTask;

public class SimpleMultiplication {
    private static final int EIGHT = 8;
    private static final byte NINE = 9;

    public static int multiplyNumber(int num) {
        return   num / 2 == 0 ? (num * 8) : (num * 9);
    }
}
