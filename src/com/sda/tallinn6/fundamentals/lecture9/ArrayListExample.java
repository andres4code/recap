package com.sda.tallinn6.fundamentals.lecture9;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args) {
        List<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("tiger");
        listOfAnimals.add("monkey");
        listOfAnimals.add("dog");
        listOfAnimals.add("cat");
        System.out.println(listOfAnimals);

        if (listOfAnimals.contains("donkey")) {
            System.out.println("error, monkey not good");
        }
        listOfAnimals.add(4, "Eagle");
        System.out.println(listOfAnimals);
//adds from one array to other the same things
        List<String> betterAnimals = new ArrayList<>();
        betterAnimals.addAll(listOfAnimals);
        System.out.println("betteranimals: " + betterAnimals);

        listOfAnimals.remove(0);
        System.out.println(betterAnimals);
        betterAnimals.remove(0);
        System.out.println(listOfAnimals);

    }

}

