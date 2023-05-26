package MateAcademy.ArrayPractice.SecondTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int countOccurrences(String str, String substr) {
        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }



       /* int count = 0;
        int startPosition = 0;
        while (true) {
            int index = str.indexOf(substr,startPosition);
            if (index >=0) {
                count++;
                startPosition = index + substr.length();
            }else {
                break;
            }
        }
        return count;
    }

        */
    public static void main(String[] args) {
        String str = "azyxxzyzy";
        String substr = "zy";
        int occurrences = countOccurrences(str, substr);
        System.out.println(occurrences);
    }
}
