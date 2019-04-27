package com.sda.tallinn6.fundamentals.operators;

public class BitwiseBitshiftOperators {

    public static void main(String[] args) {
        //BITWISE OPERATORS
        System.out.println("Bitwise operators");
        // &, |, control sign, ~

        //a = 60 b = 13
        // binary representations
        // a = 0011 1100 b 0000 1101
        int a = 0b0111100;
        System.out.println(a);
        int b = 0b0001101;
        System.out.println(b);

        // & (bitwise and) : Binary AND Operator copies a bit to the re...
        // (a & b) will give 12 which is 000 1100
        System.out.println("a&b :" + (a&b));

        // | (bitwise operator)
        //(a | b) will give 61 which is 0011 1101
        System.out.println("a | b : " + (a | b));

        // ^ bitwise xor
        // returns 0 if the numbers are the same
        //returns 1 if they different
        System.out.println("a ^ b : " + (a ^ b));

        //~ bitwise complement
        // is unary and has the effect of 'flipping' bits.
        // (~a) will give -61 which is 1100 0011

        // << (left shift)
        //binary left shift operator. The left operand value is moved
        //specified by right operand
        // a << 2 will give 240 which is 1111 0000
        System.out.println("a << 2:" + (a << 2));

        // >> (right shift)  //UNDERSTAND THIS
        //the left operand value is moved right by the number of bits
        System.out.println("a >> 2:" + (a >> 2));

        //

    }
}
