package MateAcademy.DailyTask;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {

        int percent;

        switch (rating.toLowerCase()) {
            case "terrible":
                percent = 0;
                break;
            case "poor":
                percent = 5;
                break;
            case "good":
                percent = 10;
                break;
            case "great":
                percent = 15;
                break;
            case "excellent":
                percent = 20;
                break;
            default:
                return null;
        }

        return (int) Math.ceil(amount * percent / 100);
    }

    public static void main(String[] args) {
        Integer good = calculateTip(107.65, "GReat");
        System.out.println(good);
    }
}
