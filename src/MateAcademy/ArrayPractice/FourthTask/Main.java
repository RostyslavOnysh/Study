package MateAcademy.ArrayPractice.FourthTask;

public class Main {
    public static boolean isArrayPretty(int[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if (isPresentInArray(array, currentElement - 1) || isPresentInArray(array, currentElement + 1)) {

            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isPresentInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}