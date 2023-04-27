package MateAcademy.matrix;

public class main {
    public class MatrixDiagonal {
        public int[] getDiagonal(int[][] matrix) {
            int[] diagonal = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                diagonal[i] = matrix[i][i];
            }
            return diagonal;
        }

        public int[] getCounterDiagonal(int[][] matrix) {
            int[] counter = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                counter[i] = matrix[i][matrix.length - 1 - i];
            }
            return counter;
        }
    }
}
/*
In the given code block, the statement counter[i] = matrix[i][matrix.length - 1 - i];
assigns the value of matrix[i][matrix.length - 1 - i] to the ith element of the counter array.

The reason for subtracting 1 from matrix.length
is to account for the fact that array indices start from 0,
 so the last index of the array is matrix.length - 1.

The reason for subtracting i from matrix.length - 1 is because the code is trying to access
 the element in the ith row and the (matrix.length - 1 - i)th column of the matrix array.
  As i increases, the column index decreases, so the ith row will have
   a different column index compared to the (i+1)th row.

For example, consider a 3x3 matrix with the following values:

Copy code
1 2 3
4 5 6
7 8 9
When i is 0, the code accesses matrix[0][2], which is 3. When i is 1,
the code accesses matrix[1][1], which is 5. When i is 2, the code accesses matrix[2][0],
 which is 7. So the (matrix.length - 1 - i)
 expression allows the code to access the diagonal elements of the matrix in reverse order.

Therefore, the subtraction of 1 and i are required to properly access the diagonal
 elements of the matrix.
 */