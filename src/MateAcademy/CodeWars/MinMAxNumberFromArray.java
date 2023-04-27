package MateAcademy.CodeWars;

public class MinMAxNumberFromArray {
    public static int[] minMax(int[] arr) {
        int arrayMin = arr[0];
        int arrayMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arrayMin) {
                arrayMin = arr[i];
            } else if (arr[i] > arrayMax) {
                arrayMax = arr[i];
            }
        }
        int[] result = {arrayMin, arrayMax};
        return result;
    }
}
