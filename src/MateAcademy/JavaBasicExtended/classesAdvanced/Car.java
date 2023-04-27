package MateAcademy.JavaBasicExtended.classesAdvanced;

public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car() {

    }

    Car Audi = new Car("Audi Q7", 2016, 50900);
    Car Lexus = new Car();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }
}


