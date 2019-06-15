package com.sda.tallinn6.advancedFeatures.inheritance;

public class ShapeDemo {
    public static void main(String[] args) {

        double area;
        Circle circle = new Circle(5);
        circle.printArea();

        Rectangle rectangle = new Rectangle(3,8);
        rectangle.printArea();

        Shape shapeRef = new Rectangle(3,5);
        shapeRef.printArea();

        shapeRef=new Circle(10);
        shapeRef.printArea();
    }
}
