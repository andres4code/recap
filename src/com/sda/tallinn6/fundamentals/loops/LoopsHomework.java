package com.sda.tallinn6.fundamentals.loops;

public class LoopsHomework {

    /**
     * *******
     * ******
     * *****
     * ****
     * ***
     * **
     * *
     * 1. Write a method prints stars like above
     * 2. Write a method to calculate the sum of first 10 natural number.
     * 3. Write a method to calculate factorial number of given input!
     */

    //Print stars
    public static void printStars(){
        for (int i = 7; i > 0; i--) {
            for (int j = 0; i > j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //calculate sum of first 10 natural numbers
    public static int sumNumbers(int n){
        int result = 0;
        for(int i = 1; i <=n; i++) {
            result = result + i;
        }
        return result;
    }

    //factorial
    public static int factorialIterative(int n){
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    //factorial recursive
    public static int factorialRecursive(int n) {
        if(n < 2)
            return n;
        return n * factorialRecursive(n-1);
        }


    public static void main(String[] args) {
        printStars();
        sumNumbers(10);
        factorialIterative(4);
        factorialRecursive(4);


        //stars

    }
}
