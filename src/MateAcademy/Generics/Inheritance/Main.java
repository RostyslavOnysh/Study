package MateAcademy.Generics.Inheritance;

import MateAcademy.Generics.Inheritance.model.Cat;
import MateAcademy.Generics.Inheritance.model.Horse;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("catty");
        Horse horse = new Horse("Ponny");

        Aviary <Cat> catsAviary = new Aviary<>(cat);
        Aviary <Horse> horseAviary = new Aviary(horse);

        Cat catFromAviary = catsAviary.getAnimal();


    }
}
