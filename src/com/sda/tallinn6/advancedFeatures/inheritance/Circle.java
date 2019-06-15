package com.sda.tallinn6.advancedFeatures.inheritance;

public class Circle extends Shape {
    private int radius;
    private final double PI = 3.1416;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }

    @Override
    public void printArea() {
        System.out.println("This is printArea method in Circle class");
    }


}
