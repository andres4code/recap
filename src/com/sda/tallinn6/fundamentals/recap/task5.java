package com.sda.tallinn6.fundamentals.recap;

import java.math.BigInteger;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //new object creation = creates a memory spot
        System.out.println("Enter one number: ");
        int num1 = scanner.nextInt();
        while (true) {
            if (num1 == -1) {
                break;
            } else if (num1 == 0) {
                System.out.println(1);
                break; //system.exit because break is only in for and while loops
            } else if (num1 < -1) {
                System.out.println("Error, factorial cant be made of negative number!");
                break;
            } else {
                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= num1; ++i) {
                    // factorial = factorial * i;
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }

                System.out.print(num1 + "! = ");
                for (int i = num1; i > 1; i--) {
                    System.out.print(i + "*");
                }
                System.out.println("1 = " + factorial);
                System.out.println("new number needs to be entered");
                num1 = scanner.nextInt();

            }
        }
    }
}
