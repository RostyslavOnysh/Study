package MateAcademy.Generics.TypeErasure;

import MateAcademy.Generics.TypeErasure.model.Cat;

public class Main {

    public static void main(String[] args) {
        Cat catty = new Cat("catty");
        Cat cotte = new Cat("Cotte");

        Cat [] cats = new Cat[] {catty,cotte};

        Aviary <Cat> catsAviary = new Aviary<>(cats);
        catsAviary.containsElement(cotte);
    }
}
