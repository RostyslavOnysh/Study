package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface;

public class Circle implements Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
