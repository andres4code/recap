package com.sda.tallinn6.fundamentals.lecture9;

import java.util.Arrays;
import java.util.Stack;
//import java.util.Arrays;


public class StackExample {//FIFO- first in first out
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Jack"); //push means adding information in stack
        stackOfCards.push("Queen"); //pop means removing item from stack
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards);
        //Jack, Queen, Ace, King
        int[] s = new int[7];
        System.out.println(s.toString()); //toString method prints memory address of array!!!
        System.out.println(Arrays.toString(s)); //gets information of array and prints it out

        String theLastInfo = stackOfCards.pop();
        System.out.println(theLastInfo.toString());

        System.out.println(stackOfCards);

        String cardAtTop = stackOfCards.peek(); //peek looks at the last element, s[s.length-1]--1 is last element
        System.out.println("Check the card at top: " + cardAtTop);
        System.out.println("Cards in stack are: " + stackOfCards);


    }
}
