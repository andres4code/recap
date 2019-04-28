package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger! Please enter your full name");
        Scanner scanner = new Scanner(System.in);
        String yourString = scanner.nextLine();
        String result = yourString.replace("", " ").trim();
        System.out.println(result);

    }
}
