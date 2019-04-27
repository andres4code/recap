package com.sda.tallinn6.fundamentals.classes;

public class BicycleDemo {

    public static void main(String[] args) { //type + name = new + type(the same)
        //bicycle objects
        Bicycle myBike = new Bicycle();  //com.sda.tallinn6.fundamentals.classes.Bicycle is type(like int), giving a name(myBike)
        Bicycle yourBike = new Bicycle(); //new creates new object(yourBike), type of objest is com.sda.tallinn6.fundamentals.classes.Bicycle
        System.out.println(myBike);
        System.out.println(yourBike);

        myBike.speed = 10;
        myBike.cadence = 2; //void means dont return anything
        myBike.gear = 2;
        System.out.println(myBike.speed);
        System.out.println(myBike.cadence);
        System.out.println(myBike.gear);

        yourBike.cadence = 2;
        yourBike.speed = 10;
        yourBike.gear = 4;
        System.out.println(yourBike.speed);
        System.out.println(yourBike.cadence);
        System.out.println(yourBike.gear);

        System.out.println("Invoking methods..");
        myBike.changeCadence(50);
        myBike.speedUp(10);
        myBike.changeGear(2); //dont write newValue, JUST THE NUMBER , newValue-word appears automatically
        myBike.printStates(); //to see the method printstates: command+click

        System.out.println("Invoking methods..");
        yourBike.changeCadence(50);
        yourBike.printStates();
        yourBike.speedUp(10);
        yourBike.printStates();
        yourBike.applyBrakes(4);
        yourBike.printStates();
        yourBike.changeGear(2); //dont write newValue, JUST THE NUMBER , newValue-word appears automatically
        yourBike.printStates(); //to see the method printstates: command+click

        Person person = new Person();




    }
}
