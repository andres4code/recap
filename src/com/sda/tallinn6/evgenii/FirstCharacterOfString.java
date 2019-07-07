package com.sda.tallinn6.evgenii;

import java.util.Scanner;

/*
(Process a string)
Write a program that prompts the user to enter a string
and displays its length and its first character.
 */
public class FirstCharacterOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string");
        String userString = scanner.nextLine();
        System.out.println("User chose string: " + userString);

        System.out.println("String length is: " + userString.length()
                + " \n First letter of string is: " + userString.charAt(0));
        System.out.println(userString);
    }


}
