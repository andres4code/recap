package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;
/*
write string
write the char to search in the string- gives the amount of letters in the sentence(string)
 */

public class task9 {

    public static void main(String[] args) {
        System.out.println("Welcome stranger");
        System.out.println("Write string");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.println("Write the char to search in the string");
        String character = scan.nextLine();
        while(character.equals(" ")) {
            System.out.println("Space is not a character");
            System.out.println("Write the char to search in the string");
            character = scan.nextLine();
        }
        int counter = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(character)) {
                counter++;
            }
        }
        System.out.println("result: " + counter);
    }
}
