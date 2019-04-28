package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //new object creation = creates a memory spot
        System.out.println("Enter one number: ");
        int num1 = scanner.nextInt();
        Scanner input = new Scanner(System.in); //new object creation = creates a memory spot
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        } else if (num1 < num2) {
            System.out.println("The bigger number is: " + num2);
        } else {
            System.out.println("You entered two numbers: " + num1 + "-" + num2 + " The numbers are the same!");
        }


    }
}
