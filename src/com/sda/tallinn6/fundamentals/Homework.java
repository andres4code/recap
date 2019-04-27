package com.sda.tallinn6.fundamentals;

public class Homework { //WHOLE HOMEWORK IN THIS, LATE NEED TO BE REARRANGED LIKE IN HOMEWORK DIRECTORY

    public static void main(String[] args) {

        for (int i = 7;
             i > 1;
             i--) { //1)beginning value; 2)condition when to work; 3)what to do
            System.out.println("Count is: " + i); //i-- is also possible(best with i>0)
        }
        // HOMEWORK

            // 1. Try to evaluate the a value after each step then find the final result!
            int a = 10;

            a = ++a + a + --a - --a + a++; //debug ja evaluate, 11+11+10+9+9
            System.out.println(a);

            // 2. Try to understand the difference the expressions below:

            int a1 = 10;
            int b1 = 20;
            System.out.println(a1 = b1); // what it prints? try to guess without running the main method(20 is printed)

            System.out.println(a1 == b1); // what it prints? try to guess without running the main method(comparison)


            // 3. try to understand what the expression below prints without running the main method

            int marks = 8;
            int total = 10;

            System.out.println("Short-circuit operators");
            System.out.println(total < marks && ++marks > 5);
            System.out.println("marks: " + marks);
            System.out.println(total == 10 || ++marks > 5);
            System.out.println(marks);
            System.out.println("Long-circuit operators");
            System.out.println(total < marks & ++marks > 5);
            System.out.println("marks: " + marks);
            System.out.println(total == 10 | ++marks > 5);
            System.out.println(marks);

        /**
         *
         * Given an integer n, perform the following conditional actions:
         * If n is odd, print Weird
         * If n is even and in the inclusive range of 2 to 5 print Not Weird
         * If n is even and in the inclusive range of 6 to 20 print Weird
         * If n is even and greater than 20 print Not Weird
         *
         * writing solution as a method recommended :)
         *
         */



        //if else HOMEWORK
        //Access-modifiers = public, protected, default, private + static!!!!!!!!!!!!!!!!!
        //void means it will not use return keyword. Void means i can print only
            System.out.println("|||||||||||||||||||||||||||||||||||||");
        //printed out things can not be used by other methods

            }

        }

/**
 *
 *     *******
 *     ******
 *     *****
 *     ****
 *     ***
 *     **
 *     *
 * 1. Write a method prints stars like above
 * 2. Write a method to calculate the sum of first 10 natural number.
 * 3. Write a method to calculate factorial number of given input!
 **/

/**
 * 1. Write a method returns if person ig older than 20 decides the person is adult or not
 *      - Please call your method in main method with different input parameters and check
 *      it gives expected results
 *
 * 2. Write a method swap given two numbers and print what are the values before swapping and
 * after swapping.
 *      - Please call your method in main method with different input parameters and
 *      check it gives expected result
 * 3.
 *
 */

/**
 *
 * Given an integer n, perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5 print Not Weird
 * If n is even and in the inclusive range of 6 to 20 print Weird
 * If n is even and greater than 20 print Not Weird
 *
 * writing solution as a method recommended :)
 *
 */

/**
 * 1. I have an array like this :
 *          int[] firstArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
 *          int[] secondArray = { 0, 11, 13, 6}
 *
 *  Your duty is to find common elements in these two arrays and print them :)
 *
 *
 */

/**
 * Access modifiers
 * e.g. public int(not static)- includes logic inside the method
 *
 */
