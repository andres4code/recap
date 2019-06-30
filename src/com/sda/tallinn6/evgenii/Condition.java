package com.sda.tallinn6.evgenii;

//(Sum the digits in an integer)
// Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
// For example, if an integer is 932, the sum of all its digits is 14.
public class Condition {
    public static void main(String[] args) {
        Integer num1 = 15;
        Integer num2 = 7;
        Integer num3 = 9;
        Integer num4 = 200;

        if (isLessThan(num1, num2) & isLessThan(num1, num2)){
            System.out.println("condition is working");
        }else {
            System.out.println("condition is not working");
        }


    }
    private static boolean isLessThan(Integer number1, Integer number2){//n1 is less than n2 - this method checks it
        System.out.println("Method isLessThan was executed");
        return number1 < number2;
    }

}
