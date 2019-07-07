package com.sda.tallinn6.evgenii;

import java.util.Scanner;

/*
(Find the number of days in a month)
Write a program that prompts the user to enter the month and year DONE
and displays the number of days in the month.!!!!!
For example, if the user entered month 2 and year 2012,
the program should display that February 2012 had 29 days.
If the user entered month 3 and year 2015,
the program should display that March 2015 had 31 days.
 */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year");
        Integer yearInput = scanner.nextInt();
        System.out.println("Please enter month as string");
        String monthInput = scanner.nextLine();
        System.out.println(yearInput);
        System.out.println(monthInput);
        int amountOfDays = 0;
        System.out.println(monthInput + " " + yearInput + " had " + amountOfDays + " days.");


    }
}
