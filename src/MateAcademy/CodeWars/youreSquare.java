package MateAcademy.CodeWars;

public class youreSquare {
    public static boolean isSquare(int n) {
        double findSquare = Math.sqrt(n);
        int roudedValue = (int) Math.floor(findSquare);
        return roudedValue * roudedValue == n;
    }

    public static void main(String[] args) {
        int num = 3;
        boolean isSquareNumb = isSquare(num);
        System.out.println("Does " + num + " is square number ?  \n" + isSquareNumb);
    }
}
