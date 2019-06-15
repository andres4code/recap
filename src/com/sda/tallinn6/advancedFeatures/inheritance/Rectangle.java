package com.sda.tallinn6.advancedFeatures.inheritance;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calculateArea(){
        return a*b;
    }


    @Override
    public void printArea() {
        System.out.println("This is printArea method in Rectangle class");
    }
}
