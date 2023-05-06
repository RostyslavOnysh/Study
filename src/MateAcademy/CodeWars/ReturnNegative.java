package MateAcademy.CodeWars;

public class ReturnNegative {
    public static void main(String[] args) {
        int x = -100;
        System.out.println(makeNegative(x));
    }

    public static int makeNegative(final int x) {
        return x < 0 ? x : (~(x - 1));

    }
}
