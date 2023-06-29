package MateAcademy.DailyTask;

import java.util.Arrays;

public class WordsLenght {
    public static int getWordsLength(String[] words) {
        return Arrays.stream(words)
                .filter(word -> word.contains("a") && !word.contains("z"))
                .mapToInt(String::length)
                .sum();
    }
}
  /*      int totalLength = 0;
        if (words.length == 0) {
            return 0;
        }
      for (String word : words) {
          if (word.contains("a") && !word.contains("z")){
              totalLength += word.length();
          }
      }
      return totalLength;
        }
    }



Реалізуй метод getWordsLength(), який приймає масив строк words і повертає загальну довжину слів, які містять в собі малу літеру "a" але не містять малу літеру "z". Якщо масив words порожній - метод повинен повернути 0.

Поверни число з підрахунком, наприклад:

якщо words = ["java", "mad", "zoo"], то результат буде 7;
якщо words = ["jazz", "hazy", "lazy"], то результат буде 0;
якщо words = ["pizza", "apple", "legalize"],
 */