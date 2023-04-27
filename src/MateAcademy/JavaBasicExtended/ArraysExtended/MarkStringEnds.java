package MateAcademy.JavaBasicExtended.ArraysExtended;

public class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {

            int lastIndex = originalString.length() - 1;

            String firstChar = originalString.substring(0, 1).toUpperCase();
            String lastChar = originalString.substring(lastIndex).toUpperCase();
            String firstEnd = firstChar + originalString.substring(1);
            String secondEnd = originalString.substring(0, lastIndex) + lastChar;
            return new String[]{firstEnd, secondEnd};
        }
    }




/*
Цей код створює метод з назвою markStringEnds,
 який приймає рядок originalString і повертає масив рядків з двома елементами.
 Метод будує два рядки, які є варіантами початку та кінця рядка originalString,
  де кожен з кінців відрізняється від початкового рядка лише зміною першого
   або останнього символу на його верхній регістр.

Отже, першим кроком метод отримує довжину початкового рядка,
 щоб знайти індекс останнього символу. Далі метод витягує перший символ початкового рядка,
  перетворює його на верхній регістр і зберігає його в змінну firstChar.
  Аналогічно метод отримує останній символ рядка,
   перетворює його на верхній регістр і зберігає в змінну lastChar.

Далі метод формує два рядки, які будуть містити початок і кінець вихідного рядка.
 Перший рядок firstEnd формується з додавання до початкового рядка firstChar,
 перетвореного на верхній регістр, і залишка рядка originalString після першого символа.
  Другий рядок secondEnd формується шляхом додавання
  до початкового рядка залишку рядка originalString до останнього символа
  і останнього символу, перетвореного на верхній регістр.

Нарешті, метод повертає масив, що містить два елементи,
які представляють початок і кінець вихідного рядка,
де кожен кінець маркується верхнім регістром першого або останнього символу.
 */