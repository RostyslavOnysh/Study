package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface.PracticeUsage;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
