package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface.PracticeUsage;

public class Bird extends Animal {
    @Override
    public void eat(Food food) {
        System.out.println("Bird accepted eat");
    }

    // bird can fly
}
