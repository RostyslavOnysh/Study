package MateAcademy.BitManipulation;

public class DividerNumbToBinaryToString {
    public static String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        String binaryString = "";
        while (value > 0) {
            binaryString = (value % 2) + binaryString;
            value = value / 2;
        }
        return binaryString;
    }

    public static void main(String[] args) {
        String string = toBinaryString(15);
        System.out.println(string);
    }

}
