package MateAcademy.BitManipulation;

public class Example {
    public static void main(String[] args) {
        /*
        Bitwise OR (|)
        Bitwise AND (&)
        Bitwise XOR (^)
        Bitwise Complement (~)
         */

        int a = 5; // 0101
        int b = 6; // 0110
        int c = a | b; //0111
        System.out.println(c);

        int c1 = a & b; //0100
        System.out.println(c1);

        int c2 = a ^ b; //0011
        System.out.println(c2);

        int c3 = ~a; //1010
        System.out.println(c3);
    }
}
