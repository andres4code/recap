package com.sda.tallinn6.advancedFeatures.genericTypes;

import com.sda.tallinn6.advancedFeatures.encapsulation.Student;
import com.sda.tallinn6.advancedFeatures.inheritance.Circle;
import com.sda.tallinn6.advancedFeatures.inheritance.Rectangle;
import com.sda.tallinn6.advancedFeatures.inheritance.Shape;

public class GenericBoxDemo {
    public static void main(String[] args) {
        Student student = new Student("Milford", "Dawk", 23, true);
        GenericBox<Student> studentGenericBox = new GenericBox<>(student);

        Circle circle = new Circle(6);
        GenericBox<Circle> circleGenericBox = new GenericBox<>(circle);

        Rectangle rectangle = new Rectangle(6, 4);
        GenericBox<Rectangle> rectangleGenericBox = new GenericBox<>(rectangle);

        Shape shape = new Circle(4);

        GenericBox<Shape> shapeGenericBox = new GenericBox<>(shape);
        GenericBox<Shape> shapeCircleGenericBox = new GenericBox<>(circle);
        GenericBox<Shape> shapeRectangleGenericBox = new GenericBox<>(rectangle);


        GenericBox<Object> objectGenericBox = new GenericBox<>(circle);


        printGenericObjectItem(objectGenericBox);
        printGenericObjectItem(studentGenericBox);
        printGenericObjectItem(shapeGenericBox);

    }

    public static void printGenericObjectItem(GenericBox<?> genericBox) {//on this line... inside <____>
        System.out.println(genericBox.getItem());//if you want method to take anything(use "?" instead of "object")
    }

    public static void printGenericObjectItem2(GenericBox<Student> genericBox) {//use <"?"> to take anything in
        System.out.println(genericBox.getItem());
    }
}


