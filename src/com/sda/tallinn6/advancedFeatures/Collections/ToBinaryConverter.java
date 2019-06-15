package com.sda.tallinn6.advancedFeatures.Collections;

import java.util.Scanner;

public class ToBinaryConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + " in binary is " + convertToBinary(number));
    }
/*
    public static String convertToBinary(int number)
    {
        String result = "";

        while (number != 0) {
            result = (number % 2) + result;
            number /= 2;
        }

        return result;
    }

 */


    public static String convertToBinary(int number){
        String binary;
        binary = Integer.toBinaryString(number);
        return binary;
    }
}
