package MateAcademy.PatternAndRecursion.Rrecursion;

public class Example2 {
    public static void main(String[] args) {
        int result = powerof(4);
        System.out.println(result);
    }

    public static int powerof(int sum) {
        if (sum == 0) {
            return 1;
        }
        return powerof(sum - 1) * 10;
    }
}

