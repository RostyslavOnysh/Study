package MateAcademy.ArrayPractice.ThirdTask;

public class Main {
    public static int[][] addMatrix(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;

        if (first.length == 0 && second.length == 0) {
            return null;
        }

        int[][] sumOfTwoArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumOfTwoArray[i][j] = first[i][j] + second[i][j];
            }
        }
        return sumOfTwoArray;
    }

    public static void main(String[] args) {
        int[][] firstTest = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondTest = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] sumOfTwoArray = addMatrix(firstTest, secondTest);
        System.out.println("Sum of two matrices:");
        for (int i = 0; i < sumOfTwoArray.length; i++) {
            for (int j = 0; j < sumOfTwoArray[i].length; j++) {
                System.out.print(sumOfTwoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

