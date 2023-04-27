package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface.PracticeUsage;

public class Penguin extends Bird implements Swimmable{
    @Override
    public void sweam() {
        System.out.println("Penguin is swimming");
    }
}
