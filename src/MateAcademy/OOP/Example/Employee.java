package MateAcademy.OOP.Example;

public class Employee extends Person {
    private double BaseSalary;

    public Employee(double BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public double getSalary() {
        return BaseSalary * 1.1;
    }

    public double getSalary(double coef) {
        return BaseSalary * coef;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setSalary(double salary) {
        this.BaseSalary = salary;
    }

    @Override
    public String getPersonInfo() {
        return "Employee`s salary : " + getSalary();
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
