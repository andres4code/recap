package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter password");
        String password1 = "Red4peace";
        String password2 = "Grey4peace";
        Scanner scanner = new Scanner(System.in);
        String first_guess = scanner.nextLine();

        if (compareTwoStrings(password1, first_guess)){
            System.out.println("OK, now second password");
            String second_guess = scanner.nextLine();
            if (compareTwoStrings(password2, second_guess)){
                System.out.println("Welcome to the club");
            }else{
                System.out.println("Nope go away");
            }


        }else{
            System.out.println("Sorry go away");
        }


        System.out.println();

    }
    public static boolean compareTwoStrings(String string1, String string2){  //void - ei tagasta aga prindib
        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();
        if(string1Array.length == string2Array.length) {
            for (int counter = 0; counter < string1Array.length; counter++){
                return string1Array[counter] == string2Array[counter];
            }
        }else{
            return false;
        }
        return false;
    }
}
/*
tochararray the answer and stored password
.length

for loop to compareTwoStrings
 */