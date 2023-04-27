package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface.PracticeUsage;

public class Fish extends Animal implements Swimmable{
    @Override
    public void eat(Food food) {
        System.out.println("Fish accepted eat");
    }

    @Override
    public void sweam() {

    }
    // fish can swim
}
