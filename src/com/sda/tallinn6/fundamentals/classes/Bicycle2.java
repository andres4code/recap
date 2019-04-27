package com.sda.tallinn6.fundamentals.classes;

import com.sda.tallinn6.fundamentals.data.types.FloatingPointPrimitives;

public class Bicycle2 {
    private final String colour = "Red";
    private int cadence; //only works inside this class(com.sda.tallinn6.fundamentals.classes.Bicycle 2)
    private int gear;
    private int speed;
    private boolean isBicycle; //default for number is 0 and for boolean False

    FloatingPointPrimitives pointPrimitives;
    Person person;

    private final String name; //final keyword- NEEDS TO BE DEFINED IN CONSTRUCTOR OR CLASS VARIABLE PART(RIGHT AWAY)
    //final keyword


    public Bicycle2(int cadence, int gear, int speed, String name) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.name = name;
    }

    public Bicycle2(String name) {
        this.name = name;
    }


    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed +=increment;
    }

    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear + " isBicycle:" + isBicycle);
    }


}
