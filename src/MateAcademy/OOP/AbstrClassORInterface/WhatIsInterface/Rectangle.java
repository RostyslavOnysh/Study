package MateAcademy.OOP.AbstrClassORInterface.WhatIsInterface;

public class Rectangle implements Figure{
private int width;
private int height;

public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
}

    @Override
    public double getArea() {
        return 0;
    }
}
