package MateAcademy.OOP.LinkedList.AlgorithmComplexity;

public class exmpl1 {
    public static void main(String[] args) {
        /*
        algorithm Complexity
         1. f(n) = c кількість операцій не залежить від розміру вхідних данних
         2. f(n) = a * n + b лінійна функція,коли кількість операцій лінійно залежить від н
         3. f(n) = a * n^2 + b*n + c і можуть будути квадратичної функцією

         Складність алгоритму позначають O(n) big O notation
         O(1) то складінсть алгоритму константна
         О(n) cкладність алгоритму лінійна
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
}
