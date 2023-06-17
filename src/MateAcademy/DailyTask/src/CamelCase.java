package MateAcademy.DailyTask.src;

public class CamelCase {
    public static String convertToCamelCase(String string) {
        if (string.isEmpty()) {
        return string;
        }
            String[] split = string.split("[-_]+");
            StringBuilder builder = new StringBuilder();
            builder.append(split[0]);
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            builder.append(word.substring(0, 1).toUpperCase());
            builder.append(word.substring(1));
        }
            return builder.toString();
        }

    public static void main(String[] args) {
        String check = "hello_its_me";
        System.out.println(convertToCamelCase(check));
    }
}

/*
Цей цикл виконує ітерації для кожного елементу у масиві split, починаючи з індексу 1 (ігноруючи перший елемент split[0]).

Кожен елемент word масиву split є окремим словом, отриманим шляхом розділення по сплітеру ("-" або "_").

Для кожного слова word ми виконуємо наступні дії:

word.substring(0, 1) повертає підстроку з першим символом слова. Наприклад, якщо word дорівнює "def", то word.substring(0, 1) поверне "d".
toUpperCase() викликається на підстроці, отриманій з попереднього кроку, для перетворення першої літери на велику.
word.substring(1) повертає підстроку, що починається з другого символу слова. Наприклад, якщо word дорівнює "def", то word.substring(1) поверне "ef".
Обидві підстроки отримані з попередніх кроків (перший символ великий і решта слова) додаються до result за допомогою append().
Отже, у результаті циклу кожне слово в split, починаючи з індексу 1, перетворюється на "camel case" формат, де перша літера стає великою, а решта залишається без змін. Наприклад, якщо масив split містить ["abc", "def", "ghi"], то після циклу result буде містити "abcDefGhi".
 */