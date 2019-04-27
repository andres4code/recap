package com.sda.tallinn6.fundamentals.classes;

public class Bicycle {

    int cadence = 0;  // pace,how fast you are pedaling
    int speed = 0;
    int gear = 1;
    String color;

    public Bicycle() {

    }


    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }


    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }


}

class Person {
    public Person() { //this is default constructor(we dont need to write it, it comes by default)

    }
}
