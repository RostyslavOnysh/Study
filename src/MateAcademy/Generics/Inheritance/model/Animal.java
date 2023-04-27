package MateAcademy.Generics.Inheritance.model;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void acceptFood(String food);
}
