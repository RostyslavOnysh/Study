package MateAcademy.CodeWars;

public class ChocolateBar {
    public static int breakChocolate(int n, int m) {
        if (n <= 0 || m <= 0) {
            return 0;
        }
        return (n * m) - 1;
    }
}


//   return (n <= 0 || m <= 0) ? 0 : (n * m) - 1;