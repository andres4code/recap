package com.sda.tallinn6.evgenii.BuyVehicleHomework;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter birthDate in format: month/day/year of birth");
        CharSequence userInput = scanner.nextLine();
        System.out.println(userInput);


    }
}

/*
VERY MANDATORY!!!!!! NEST WEEK IS ABOUT THIS TOPIC
Andres Kolbassov 12/17/1996

*HOMEWORK:* Let’s buy a vehicle
a. Create class Person
b. Create class Parser
c. Create interface or an abstract class Vehicle
d. Create classes Car and Bike, that will implement/inherit Vehicle.

e. User will provide all of the details about the Person (buyer) using command-line (e.g.
“John Smith born 3/24/1984”. Provided information will be parsed using Regex within Parser class.
Parser class should receive char sequence
and return an object of type Person or Null if provided details will not have required information.
f. Created person will then buy a bike and car. Information about what and when was bought should be displayed.
g. Brand and model of car/bike should be stored using variable of type Enum.

!!!!!!!!!!NB!
application, unittest, gitrepo, send link to him via slack(Do it before friday)

information in format: firstname lastname month/day/year of birth

System.out.println("Please enter username in format: firstname lastname");
        String userName = scanner.nextLine();
        System.out.println("Please enter birthDate in format: month/day/year of birth");
        Integer birthDate = scanner.nextInt();

  */


