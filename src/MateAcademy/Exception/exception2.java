package MateAcademy.Exception;

public class exception2 {
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Throwable t) {
            System.out.println("statement 1");
        }
        System.out.println("statement 2");
    }
}