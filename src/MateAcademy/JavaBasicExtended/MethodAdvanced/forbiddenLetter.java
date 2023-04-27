package MateAcademy.JavaBasicExtended.MethodAdvanced;

public class forbiddenLetter {

        public static char[] removeLetter(String input) {
            if (input == null) {
                return new char[0];
            }

            // замінюємо всі символи 'r' на '!' і приводимо рядок до нижнього регістру
            input = input.toLowerCase().replaceAll("r", "!");

            // перетворюємо рядок у масив символів
            char[] charArray = input.toCharArray();
            return charArray;
        }
    }


