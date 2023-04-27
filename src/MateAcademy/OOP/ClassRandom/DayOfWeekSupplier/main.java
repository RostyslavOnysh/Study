package MateAcademy.OOP.ClassRandom.DayOfWeekSupplier;

public class main {
    public static void main(String[] args) {
        DayWeekRandom supplier = new DayWeekRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.getRandomDayOfWeek());
        }

    }
}
