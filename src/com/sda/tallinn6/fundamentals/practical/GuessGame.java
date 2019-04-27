package com.sda.tallinn6.fundamentals.practical;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        System.out.println("Wanna play a game?...");
        System.out.println("Find what's the number in my mind...");
        Random random = new Random();
        int randomNumber = random.nextInt(101); //nullist sajani, kaasarvatud
        Scanner scanner = new Scanner(System.in);

        int attemptCount = 0;
        while(true){
            System.out.println("Please enter the number");
            int userNumber = scanner.nextInt();
                if(userNumber==randomNumber){
                    System.out.println("You are correct!");
                    break;
                }else{
                    System.out.println("You are wrong");
                    attemptCount++;
                    System.out.println("This was your attempt: " +attemptCount);

                    //lets give hint
                    int difference = Math.abs((userNumber-randomNumber));

                    if(difference<5){
                        System.out.println("It is burning");
                    }else if(difference<10){
                        System.out.println("It is very hot");
                    }else if(difference<25){
                        System.out.println("It is warm");
                    }else{
                        System.out.println("It is cold");
                    }
            }
        }
    }
}
