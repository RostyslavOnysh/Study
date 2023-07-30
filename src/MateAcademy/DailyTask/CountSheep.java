package MateAcademy.DailyTask;

public class CountSheep {

    public static String countSheep(int number) {
        if (number == 0) {
            return "";
        }
        return countSheep(number - 1) + number + " sheep... ";
    }

    public static void main(String[] args) {
        System.out.println(countSheep(1)); // Output: "1 sheep..."
        System.out.println(countSheep(2)); // Output: "1 sheep...2 sheep..."
        System.out.println(countSheep(3)); // Output: "1 sheep...2 sheep...3 sheep..."
    }
}
