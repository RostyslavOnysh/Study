package MateAcademy.Exception.TryCatchFinnaly;

public class Example {

    // try-catch-finally

    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            int b = 5 / 0;
            System.out.println("Try block completed");
        }catch (Exception e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }
    }
}
