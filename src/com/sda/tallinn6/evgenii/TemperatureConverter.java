package com.sda.tallinn6.evgenii;

import java.util.Scanner;
//Write a program that reads a Celsius degree in a double value from the console,
// then converts it to Fahrenheit and displays the result.
// The formula for the conversion is as follows:
//        fahrenheit = (9 / 5) * celsius + 32

//Write a program that reads a Celsius degree
//        in a double value from the console,
//        then converts it to Fahrenheit and displays
//        the result. The formula for the conversion
//        is as follows:
//        fahrenheit = (9 / 5) * celsius + 32


public class TemperatureConverter {

    public static void main(String[] args) {
//        boolean appRunning = true;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Celsius degree: ");
            String inputString = input.nextLine();
            if (inputString.equals("quit")) {
//                appRunning = false;
                break;
            }
            Double valueInFarenheit;
            try {
                Double temperatureCelsius = Double.valueOf(inputString);
                valueInFarenheit =  (9 / 5) *
                        temperatureCelsius + 32;

                System.out.println("The temperature is: "
                        + valueInFarenheit);
                //System.exit(1);
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            } finally {
                System.out.println("Finally is running");
            }
        }
    }

}