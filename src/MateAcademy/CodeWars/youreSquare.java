package MateAcademy.CodeWars;

public class youreSquare {
    public static boolean isSquare(int n) {
        //int squareRoot = (int) Math.sqrt(n);
        // return squareRoot * squareRoot == n ? true : false;
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        int num = 4;
        boolean isSquareNumb = isSquare(num);
        System.out.println("is " + num + " a square number ?  \n" + isSquareNumb);
    }
}
