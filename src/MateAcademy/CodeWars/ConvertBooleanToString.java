package MateAcademy.CodeWars;

public class ConvertBooleanToString {
    public static void main(String[] args) {
        boolean b = true;
        String bool = boolToWord(b);
        System.out.println(bool);
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}