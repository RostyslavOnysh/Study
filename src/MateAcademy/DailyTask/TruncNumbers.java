package MateAcademy.DailyTask;

public class TruncNumbers {
    public static double truncateToHundredth(double num) {
        int truncatedInt = (int) (num * 100);
        return (double) truncatedInt / 100;
    }

    public static void main(String[] args) {
        double toDo = 22.239;

        double v = truncateToHundredth(toDo);
        System.out.println(v);
    }
    // tets
}
