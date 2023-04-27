package MateAcademy.OOP.Task.Printer;

public class main {
    public static void main(String[] args) {
        int meow = 1323;
        String b = "Hello";
        String[] array = {"Check", "How", "It", "Work"};

        Printer print = new Printer();
        String print2 = print.print(meow);
        System.out.println(print2);
        String print1 = print.print(array);
        System.out.println(print1.toString());
    }
}
