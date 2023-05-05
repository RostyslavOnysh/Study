package MateAcademy.OOP.LinkedList.AlgorithmComplexity;

public class matrix {
    // квадратична складність
    public static void main(String[] args) {
        int[][] first = new int[][]{{1}};
        int[][] second = new int[][]{{1, 2}, {3, 4}}; // 2*2
        int[][] third = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3*3
printMatrix(third);
    }

    private static void printMatrix(int[][] matrix) {
        int n = matrix.length; // n це довжина сторони,як по стовпчиках так і по рядках
        for (int i = 0; i < n; i++) {   // ітерування по всіх рядках   О(n) лінійна складність
            for (int j = 0; j < n; j++) {  // та по всіх елементах  O(n) лінійна складність
                System.out.println(matrix[i][j]);  //тут констнанта складність О(1)
            }
        }

    }
}
