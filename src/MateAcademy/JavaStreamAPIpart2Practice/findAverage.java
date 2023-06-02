package MateAcademy.JavaStreamAPIpart2Practice;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class findAverage {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 9, 4, 5);

        try {
            double average = getOddNumsAverage(numbers);
            System.out.println("Average of odd numbers: " + average);
        } catch (NoSuchElementException e) {
            System.out.println("No odd numbers found.");
        }
    }

    public static Double getOddNumsAverage(List<Integer> numbers) {
        return IntStream.range(0, numbers.size())
                .mapToObj(index -> Map.entry(index, numbers.get(index)))
                .map(entry -> entry.getKey() % 2 == 1 ? entry.getValue() - 1 : entry.getValue())
                .filter(number -> number % 2 == 1)
                .mapToDouble(Double::valueOf)
                .average().orElseThrow(NoSuchElementException::new);
    }
}
