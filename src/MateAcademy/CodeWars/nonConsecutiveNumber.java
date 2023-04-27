package MateAcademy.CodeWars;

public class nonConsecutiveNumber {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {   // start to iterate form second element
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;   // if all elements are consecutive return null
    }
}

