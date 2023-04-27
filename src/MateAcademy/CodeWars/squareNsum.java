package MateAcademy.CodeWars;

public class squareNsum {
    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.pow(n[i], 2);
            result += n[i];
        }
        return result;
    }
}