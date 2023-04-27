package MateAcademy.PatternAndRecursion.Rrecursion;

public class Example1 {
    public static void main(String[] args) {
        sayHi(5);
    }

    private static void sayHi(int number) {
        if (number == 0){
            System.out.println("Done !");
        }else {
            System.out.println(number);
            number--;
            sayHi(number);
        }


    }
}
