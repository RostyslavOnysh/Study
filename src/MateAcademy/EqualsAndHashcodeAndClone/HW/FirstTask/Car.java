package MateAcademy.EqualsAndHashcodeAndClone.HW.FirstTask;



public class Car implements Cloneable {
    private String model;
    private String make;
    private String color;
    private int numberOfDoors;
    private int year;
    Engine engine;

    public Car() { //please don't remove this constructor!
     //   this.model = model;
      //  this.make = make;
   //     this.color = color;
   //     this.numberOfDoors = numberOfDoors;
   //     this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    @Override
    public Car clone() {
        try {
           Car clonedCar = (Car) super.clone();
           clonedCar.setEngine(engine.clone());
           return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create Car clone", e);
        }
    }
}
