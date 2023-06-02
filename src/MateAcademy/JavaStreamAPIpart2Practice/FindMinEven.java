package MateAcademy.JavaStreamAPIpart2Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinEven {

    /**
     * Given list of strings where each element contains 1+ numbers:
     * input = {"5,30,100", "0,22,7", ...}
     * return min integer value. One more thing - we're interested in even numbers.
     * If there is no needed data throw RuntimeException with message
     * "Can't get min value from list: < Here is our input 'numbers' >"
     */


    public static void main(String[] args) {
        List<String> numbers = List.of("5,30,100", "100,22,7", "12,8,3,5");
        int minEvenNumber = findMinEvenNumber(numbers);
        System.out.println(minEvenNumber);
    }

    public static int findMinEvenNumber(List<String> numbers) {
        int minIntInList = numbers.stream()
                .map(str -> str.split(","))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .filter(odd -> odd % 2 == 0)
                .min()
                .orElseThrow(() -> new RuntimeException("Can't get min value from list: " + numbers));
        return minIntInList;
    }
}