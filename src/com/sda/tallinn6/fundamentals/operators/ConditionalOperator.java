package com.sda.tallinn6.fundamentals.operators;

public class ConditionalOperator {

    public static void main(String[] args) {
        //CONDITIONAL OPERATOR
        // ? :
        //in other words : ternary

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        // if someCondition is true then value1 else value2
        result = someCondition ? value1 : value2;

        System.out.println(result);
        int anotherResult;
        //same as above
        if(someCondition) {
            anotherResult = value1;
        } else{
            anotherResult = value2;
        }
        System.out.println(anotherResult);

        //find the biggest number among two numbers

        //int anotherResult = value1>value1 ? value1 : value2;

        // homework: compareTwoStrings three numbers, convert if else with two ternary operations!!!!!!!


    }
}
