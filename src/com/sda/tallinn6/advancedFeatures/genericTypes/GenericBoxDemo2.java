package com.sda.tallinn6.advancedFeatures.genericTypes;

import com.sda.tallinn6.advancedFeatures.inheritance.Circle;
import com.sda.tallinn6.advancedFeatures.inheritance.Rectangle;
import com.sda.tallinn6.advancedFeatures.inheritance.Shape;
//import com.sda.tallinn6.advancedFeatures.encapsulation.Student;


public class GenericBoxDemo2 {
    public static void main(String[] args) {
        //Student student = new Student("Milford", "Dawk", 23, true);
        //GenericBox2<Student> studentGenericBox = new GenericBox2<>(student);

        Circle circle = new Circle(5);
        GenericBox2<Circle> circleGenericBox = new GenericBox2<>(circle);

        Rectangle rectangle = new Rectangle(8, 4);
        GenericBox2<Rectangle> rectangleGenericBox = new GenericBox2<>(rectangle);

        Shape shape = new Rectangle(5, 3);

        GenericBox2<Shape> shapeGenericBox = new GenericBox2<>(shape);
        GenericBox2<Shape> shapeCircleGenericBox = new GenericBox2<>(circle);
        GenericBox2<Shape> shapeRectangleGenericBox = new GenericBox2<>(rectangle);
    }
}


