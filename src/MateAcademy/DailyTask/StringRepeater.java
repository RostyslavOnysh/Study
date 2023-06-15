package MateAcademy.DailyTask;

public class StringRepeater {
    public static String repeatString(int times, String string) {
        StringBuilder res = new StringBuilder();
        if (string.length() > 0) {
            res.append(string.repeat(Math.max(0, times)));
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