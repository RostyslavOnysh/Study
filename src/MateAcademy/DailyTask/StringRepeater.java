package MateAcademy.DailyTask;

public class StringRepeater {
    public static String repeatString(int times, String string) {
        StringBuilder res = new StringBuilder();
        if (string.length() > 0) {
            for (int i = 0; i < times; i++) {
                res.append(string);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String hello = "Hello";
        int t = 5;

        String string = repeatString(t, hello);
        System.out.println(string);
    }
}