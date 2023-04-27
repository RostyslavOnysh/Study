package MateAcademy.PatternAndRecursion.Rrecursion;

public class getFibonacciSequence {

    public static void main(String[] args) {
        getFibonacciSequence result = new getFibonacciSequence();
        int fiboNumber = result.getFibonacciNumber(8);
        System.out.println(fiboNumber);
    }

    public int getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}


