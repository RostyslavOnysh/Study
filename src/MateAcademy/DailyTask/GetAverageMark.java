package MateAcademy.DailyTask;

public class GetAverageMark {
    public static int getAverageMark(int[] marks) {
        int value = 0;
        if (marks.length > 0) {
            for (int mark : marks) {
                value += mark;
            }
        }
        return value / marks.length;
    }
}

