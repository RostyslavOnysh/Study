package MateAcademy.ArrayPractice.fifth;


import java.util.Map;

public class Main {
    public static int calculateSum(Map<String, Integer> data, String keyPart) {
        int sum = 0;
        if (data.isEmpty()) {
            return 0;
        }
        if (keyPart.isEmpty()) {
            for (Integer values : data.values()) {
                sum += values;
            }
            return sum;
        }

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (key.toLowerCase().contains(keyPart.toLowerCase())) {
                sum += value;
            }
        }
        return sum;
    }
}

