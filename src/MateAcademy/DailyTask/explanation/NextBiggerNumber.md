```java 
public class example {
    public static int getNextBiggerNumber(int n) {
// Перетворюємо число n на рядок для зручності маніпуляцій
        String number = Integer.toString(n);

        // Конвертуємо рядок в масив символів для легшої обробки
        char[] digits = number.toCharArray();

        // Знаходимо позицію першого елементу, з якого можна почати змінювати цифри
        int pivotIndex = findPivotIndex(digits);

        // Якщо немає можливості змінити цифри, повертаємо -1
        if (pivotIndex == -1) {
            return -1;
        }

        // Знаходимо наступну більшу цифру, яку можна обміняти з цифрою на позиції pivotIndex
        int nextBiggerIndex = findNextBiggerIndex(digits, pivotIndex);

        // Міняємо цифри місцями
        swap(digits, pivotIndex, nextBiggerIndex);

        // Сортуємо цифри після позиції pivotIndex в порядку зростання
        sortDigits(digits, pivotIndex + 1);

        // Повертаємо число, яке отримали шляхом злиття відсортованого масиву цифр
        return Integer.parseInt(new String(digits));
    }

    // Метод для знаходження позиції першого елементу, з якого можна почати змінювати цифри
    private static int findPivotIndex(char[] digits) {
        int pivotIndex = -1;

        // Проходимо від кінця масиву до початку
        for (int i = digits.length - 2; i >= 0; i--) {
            // Шукаємо перший елемент, який менший за наступний елемент
            if (digits[i] < digits[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        return pivotIndex;
    }

    // Метод для знаходження позиції наступної більшої цифри для обміну
    private static int findNextBiggerIndex(char[] digits, int pivotIndex) {
        int nextBiggerIndex = pivotIndex + 1;

        // Проходимо від кінця масиву до позиції pivotIndex
        for (int i = digits.length - 1; i > pivotIndex; i--) {
            // Знаходимо найменшу більшу цифру від цифри на позиції pivotIndex
            if (digits[i] > digits[pivotIndex] && digits[i] < digits[nextBiggerIndex]) {
                nextBiggerIndex = i;
            }
        }

        return nextBiggerIndex;
    }

    // Метод для обміну двох цифр у масиві
    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    // Метод для сортування цифр після позиції startIndex в порядку зростання
    private static void sortDigits(char[] digits, int startIndex) {
        Arrays.sort(digits, startIndex, digits.length);
    }
}
```
Основна ідея цього коду полягає в знаходженні наступного більшого числа, що містить ті самі цифри, для заданого числа n.

Основний алгоритм включає такі кроки:

Перетворення числа n на рядок для зручності маніпуляцій.
Конвертування рядка в масив символів для легшої обробки.
Знаходження позиції першого елементу, з якого можна почати змінювати цифри. Це зроблено за допомогою методу findPivotIndex().
Якщо немає можливості змінити цифри, повертаємо -1.
Знаходження наступної більшої цифри, яку можна обміняти з цифрою на позиції pivotIndex. Це зроблено за допомогою методу findNextBiggerIndex().
Міняємо цифри місцями за допомогою методу swap().
Сортуємо цифри після позиції pivotIndex в порядку зростання за допомогою методу sortDigits().
Повертаємо число, яке отримали шляхом злиття відсортованого масиву цифр.
Наприклад, якщо ми маємо число 6008, спочатку знайдемо позицію першого елементу, з якого можна почати змінювати цифри (в цьому випадку це 0, оскільки воно менше за наступний елемент 8). Потім знайдемо наступну більшу цифру, яку можна обміняти з 0 (в цьому випадку це 6, оскільки воно більше за 0 і менше за 8). Потім ми поміняємо цифри місцями, отримаємо число 6800, і нарешті, відсортуємо цифри після позиції 0, що дасть нам число 6080.

Цей алгоритм дозволяє знайти наступне більше число з тими самими цифрами. Якщо немає більшого числа з такими самими цифрами, повертається -1.



```java 
public class example {
    public static int getNextBiggerNumber(int n) {
  String numberStr = String.valueOf(n);
    char[] digits = numberStr.toCharArray();

    int i;
    for (i = digits.length - 1; i > 0; i--) {
        if (digits[i] > digits[i - 1]) {
            break;
        }
    }

    if (i == 0) {
        return -1; // Всі цифри впорядковані за спаданням
    }

    int x = digits[i - 1], smallest = i;
    for (int j = i + 1; j < digits.length; j++) {
        if (digits[j] > x && digits[j] < digits[smallest]) {
            smallest = j;
        }
    }

    char temp = digits[i - 1];
    digits[i - 1] = digits[smallest];
    digits[smallest] = temp;

    Arrays.sort(digits, i, digits.length);

    int nextBiggerNumber;
    try {
        nextBiggerNumber = Integer.parseInt(new String(digits));
    } catch (NumberFormatException e) {
        nextBiggerNumber = -1; // Число перевищило межі типу int
    }

    return nextBiggerNumber;
}
        }
```


Перетворіть число n на рядок, щоб можна було легко отримати його цифри.

Знайдіть позицію першої цифри, з якої починається спадна послідовність цифр. Це означає, що цифра на цій позиції менша за свою попередню цифру.

Якщо такої позиції немає (всі цифри вже впорядковані за спаданням), поверніть -1, оскільки немає більшого числа з такими самими цифрами.

Якщо позицію знайдено, знайдіть найменшу цифру у спадній послідовності, яка є більшою за цифру на позиції, знайденій на кроці 2. Це буде наступне більше число з такими самими цифрами.

Поміняйте цифри на знайденій позиції та позиції найменшої цифри. Сортуйте позиції від позиції з кроку 2 до кінця в порядку зростання.

Перетворіть рядок назад у число і поверніть його як результат.