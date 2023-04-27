package MateAcademy.JavaBasicExtended.ArraysExtended;

public class neighboursCells {
    public static void main(String[] args) {
        int rowIndex = 1;
        int columnIndex = 1;
        int[][] array = {{2, 3, 5},
                {1, 7, 1},
                {5, 9, 2}};

        int neighboursCellsSum = 0;

        if (rowIndex >= 0 && rowIndex < array.length && columnIndex >= 0 && columnIndex < array[rowIndex].length) {

            if (rowIndex > 0) {
                neighboursCellsSum += array[rowIndex - 1][columnIndex];
            }
            if (rowIndex < array.length - 1) {
                neighboursCellsSum += array[rowIndex + 1][columnIndex];
            }
            if (columnIndex > 0) {
                neighboursCellsSum += array[rowIndex][columnIndex - 1];
            }
            if (columnIndex < array[rowIndex].length - 1) {
                neighboursCellsSum += array[rowIndex][columnIndex + 1];
            }
        }
        System.out.println(neighboursCellsSum);
    }
}
