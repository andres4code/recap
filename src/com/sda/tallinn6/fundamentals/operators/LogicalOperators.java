package com.sda.tallinn6.fundamentals.operators;

public class LogicalOperators {

    public static void main(String[] args) {
        // LOGICAL OPERATORS
        System.out.println("Logical operators");
        // &, |, &&, ||
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        boolean test6 = (value1 == 1) && (value2 == 2); //AND
        System.out.println("value1 is 1 AND value2 is 2 :" + test6);

        if((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1 ");
            }
        boolean test7 = ((value1 ==1) || (value2 == 1)); //OR
        System.out.println("value1 is 1 OR value2 is 2 :" + test7);

        // & and | operators always evaluate both sides  NOT USUALLY USED
        boolean conditionalOr1 = (value1 == 1) | (value2+1 == 3); //ANDOR
        System.out.println("value1 is 1 or value2 plus 1 is 3 :" + conditionalOr1);


    }
}
