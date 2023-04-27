package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface.PracticeUsage;

public abstract class Animal {
    private String name;
    private boolean isHungry;

    // every animal can eat

    public abstract void eat(Food food);
}
