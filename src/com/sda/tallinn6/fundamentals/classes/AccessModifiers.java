package com.sda.tallinn6.fundamentals.classes;

public class AccessModifiers {
    /**
     *
     * What is access modifiers ?
     *          Access Levels
     * Modifier 	Class	Package	Subclass	World(Accessed from anywhere)
     * public	       Y	Y	    Y	        Y
     * protected	   Y	Y	    Y	        N
     * no modifier	   Y	Y	    N	        N
     * private	       Y	N	    N	        N
     *
     * Access level modifiers determine
     * whether other classes can use a particular field or invoke a particular method
     *
     * package building;
     * class House {}
     * package library;
     * class Book {}
     *
     * Access modifiers control the accessibility of a class
     * including its members - methods,variables
     *
     */
//subclass in table means: outside package by subclass only!!!!!(Protected, Public)
    // Outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
//World in table means: outside package
//no modifier: a.k.a DEFAULT
    //Protected can be accessed from outside package only through INHERITANCE


}
