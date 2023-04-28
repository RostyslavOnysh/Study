package MateAcademy.Generics.TypeErasure;

import MateAcademy.Generics.TypeErasure.model.Animal;

public class Aviary <T extends Animal>{

    private T [] animals;

    public Aviary(T[] animals) {
        this.animals = animals;
    }

    public boolean containsElement (T element) {
        for (T e : animals){
            if (e.equals(element)){
                return true;
            }
        }
        return false;
    }
}
