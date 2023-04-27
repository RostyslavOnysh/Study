package MateAcademy.Generics.Inheritance.model;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("cat is eating : " + food);
    }
}
