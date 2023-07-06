package MateAcademy.DailyTask;

public class HumanTime {
    public static String convertTime(int second) {
        int hours = second / 3600;
        int min = (second / 60) % 60;
        int sec = second % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, min, sec);
        return formattedTime;

    }
}
