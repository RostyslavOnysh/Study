package MateAcademy.DailyTask;

public class TotalPoints {
    public static int countPoints(String[] games) {
        int totalResult = 0;
        for (String game : games) {
            String[] scores = game.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            if (x > y) {
                totalResult += 3;
            } else if (x == y) {
                totalResult += 1;
            }
        }
        return totalResult;
    }
}