package MateAcademy.EqualsAndHashcodeAndClone.HW.FirstTask;

public class Engine implements Cloneable {

    private String fuelType;
    private String engineType;
    private int cylinders;
    private int horsepower;
    private int torque;


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("can`t clone Engine class", e);
        }

    }

    //write your code here
}
