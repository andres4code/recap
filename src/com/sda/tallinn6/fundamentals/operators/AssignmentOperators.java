package com.sda.tallinn6.fundamentals.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        //ASSIGNMENT OPERATORS
        // =, +=, -=, *=, /=
        System.out.println("Assignment operators");
        // = : simple assignment operators
        int speed = 0;
        System.out.println("speed:" + speed);
        boolean b = true;
        char c = 'c';
        int another = speed;
        System.out.println("another:" + another);


        // += : Add and assignment operator
        speed += 100; //same as: speed = speed + 40 UPDATING
        System.out.println("Speed value now: " + speed);
        //subtract and assignment operator
        speed -= 50;
        System.out.println("Speed value now :" + speed);
        //multiply and assignment operator
        speed = 30;
        speed *= 5;
        System.out.println("Speed value now :" + speed);
        //divide
        speed /= 10;
        System.out.println("Speed value now :" + speed);
        //MODULO
        speed %= 5;
        System.out.println("Remainder when we divide speed to 5: " + speed);
        System.out.println("Speed value now :" + speed);
        speed %= 2;
        System.out.println("Remainder when we divide speed to 2: " + speed);
    }
}
