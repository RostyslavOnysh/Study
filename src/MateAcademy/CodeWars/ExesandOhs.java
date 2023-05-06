package MateAcademy.CodeWars;

public class ExesandOhs {
    private static final char VALUE_X = 'x';
    private static final char VALUE_O = 'o';

    public static void main(String[] args) {
        String str = "ooxx";
        System.out.println(getXO(str));
    }

    public static boolean getXO(String str) {
        int CountX = 0;
        int CountO = 0;

        for (char ch : str.toLowerCase().toCharArray()) {

            if (ch == VALUE_X) {
                CountX++;
            }
            if (ch == VALUE_O) {
                CountO++;
            }
        }
        return CountX == CountO;
    }
}

/*
Цей код реалізує метод getXO(String str), який приймає рядок символів str як вхідний
 параметр та повертає логічне значення true, якщо кількість символів x дорівнює кількості
 символів o у рядку str. В іншому випадку, метод поверне false.

Метод getXO використовує дві змінні CountX та CountO, щоб відстежувати кількість символів
 x та o у рядку str відповідно. Потім метод використовує цикл for-each для ітерації по
  всіх символах рядка str, перетворивши кожен символ на нижній регістр за допомогою методу toLowerCase().
   Це зроблено для того, щоб різні регістри символів не впливали на порівняння.

У тілі циклу, якщо поточний символ є x, змінна CountX збільшується на 1, інакше, якщо поточний символ є
 o, змінна CountO збільшується на 1.

Нарешті, метод порівнює значення змінних CountX та CountO і повертає true,
 якщо вони дорівнюють один одному, або false, якщо вони не дорівнюють один одному.
 Таким чином, якщо в рядку str кількість символів x дорівнює кількості символів o,
  то метод поверне true. Наприклад, якщо на вхід методу передати рядок символів ooxx,
   метод поверне true, оскільки кількість символів x та o однакова (2).

 */
