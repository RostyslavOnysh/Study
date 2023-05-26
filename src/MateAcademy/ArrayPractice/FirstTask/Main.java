package MateAcademy.ArrayPractice.FirstTask;

public class Main {

    public static int[] toArrayOfDigits(int n) {
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = Math.abs(n);
        }
        String numberToString = String.valueOf(n);
        StringBuilder reversedNumb = new StringBuilder(numberToString).reverse();

        int [] array =  new int [reversedNumb.length()];
        for (int i = 0; i < reversedNumb.length(); i++) {
            array[i] = Character.getNumericValue(reversedNumb.charAt(i));
        }
        return array;
    }

    public static void main(String[] args) {
        int n = -12435678;
        int [] digits = toArrayOfDigits(n);
        System.out.println("Number :" + n);
        System.out.println("Digits : ");
      for (int digit : digits) {
          System.out.println(digit + " ");
      }
    }
}