package com.sda.tallinn6.advancedFeatures.abstractClass;

// abstract classes cannot be made into objects
// it has to be extended to be used
// abstract class might include abstract methods - methods without implementation
// fields, non-abstract and static methods work the same way
public abstract class AbstractVehicle { // Abstract class is needed so the developed can't forget to implement some essential methods.
    public abstract int move(); // this is an abstract method that the child class MUST override and implement.


    }
