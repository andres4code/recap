package com.sda.tallinn6.evgenii;

import java.util.Random;
/*
(Random character)
Write a program that
displays a random uppercase letter using the Math.random() method.
 */
public class RandomCharacter {

    public static void main(String[] args) {


//        for (int i = 'A'; i <= 'z'; i++) {
//            System.out.println((char) i + " -> " +Integer.valueOf(i));
//
//    }
        Random rG = new Random();
        int randomInt = rG.nextInt(200) + 0;
        long randomIntWithMath =
                Math.round( Math.random()*26 ) + 65;
        System.out.println((char) randomInt);

    }
}
