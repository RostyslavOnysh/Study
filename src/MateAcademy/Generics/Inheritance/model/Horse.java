package MateAcademy.Generics.Inheritance.model;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("Horse is eating : " + food);
    }

    public boolean hasHorsesShoes() {
        return true;
    }
}
