package MateAcademy.PatternAndRecursion.Builder;

public class Main {
    public static void main(String[] args) {
        // Builder
        Car car = new Car.Builder().setModel("Audi").setColor("red").setYear(1998).build();
        System.out.println(car);
    }
}
