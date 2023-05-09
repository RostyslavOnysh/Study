package MateAcademy.OOP.LinkedList.AlgorithmComplexity;

public class exmpl1 {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
      //  printArray(array);
        getPosition(array,2);
        /*
        algorithm Complexity
         1. f(n) = c кількість операцій не залежить від розміру вхідних данних
         2. f(n) = a * n + b лінійна функція,коли кількість операцій лінійно залежить від н
         3. f(n) = a * n^2 + b*n + c і можуть будути квадратичної функцією

         Складність алгоритму позначають O(n) big O notation
         O(1) то складінсть алгоритму константна constant
         О(n) cкладність алгоритму лінійна Linear
         якщо O(n^2) то складність квадратична
         */
    }


    /*
    таким чином 2 * O(1)
    на 2 помножуется тому що в мене дві операції які виконуются за константний час
    в результаті відпровідь буде О(n) --> constant
     */
    private static int getSum(int a, int b) {
        int sum = a + b; // ця операція виконуєтся за сталий час О(1).Це іде константна складність алгоритму
        System.out.println(sum);
        return sum;
    }

    private static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) { // O(n)  Елемент буде виведено n кількість разів,
            // таким чином цикли дають алгоритмічну складність O(n),тобто лінійну
            System.out.println(array[i]); // O(1)
        }
    }
/*
визначення найкращого і найгіршого варіанту при обчисленні алгоритмічної складності

метод який прийматиме на вхід масив і потрібно знайти позицію певного елементую
 */

    private static int getPosition(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
