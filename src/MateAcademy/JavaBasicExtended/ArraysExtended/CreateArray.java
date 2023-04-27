package MateAcademy.JavaBasicExtended.ArraysExtended;

public class CreateArray {
    public static void main(String[] args) {
        char [][] sosSignal = new char[3][3];

        sosSignal[0][0] = 'x';
        sosSignal[0][1] = 'x';
        sosSignal[0][2] = 'x';

        sosSignal [1][0] = 'S';
        sosSignal [1][1] = 'O';
        sosSignal [1][2] = 'S';

        sosSignal[2][0] = 'x';
        sosSignal[2][1] = 'x';
        sosSignal[2][2] = 'x';

        for (int i = 0; i < sosSignal.length; i++) {
            System.out.println(sosSignal[i]);
        }

    }
}
