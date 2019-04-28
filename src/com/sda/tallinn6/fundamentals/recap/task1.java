
package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;

public class task1{

    public static void main(String[] args){
        Scanner Scanner = new Scanner (System.in);

        System.out.println("Enter your full name: "); //first word is set
        String var1 = Scanner.nextLine();

        String var2 = "James Bond";

        if (same (var1, var2))
            System.out.println("welcome 007");
        else
            System.out.println("bye bye");
    }

    public static boolean same (String var1, String var2){
        if (var1.equalsIgnoreCase(var2)){
            return true;
        }else{
            return false;
        }

    }
}