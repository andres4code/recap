package com.sda.tallinn6.fundamentals.data.types;

public class FloatingPointPrimitives {

    public static void main(String[] args) {
        float firstFloat = 123.4f; //f at the end is important
        float bigFloat = 1.234e2f;

        System.out.println("first float:"+ firstFloat);

        float withoutComma = 12.45f; // comma is not allowed

        double firstDouble = 12345;
        double firstDouble2 = 12345d;
        double firstDouble3 = 12.567;
        double firstDouble4 = 12.567d;
        double anotherDouble = 1.234e2;

        double max = Double.MAX_VALUE;
        System.out.println("Max double : "+ max);
        //The number is biggest double number which integer does not consist.
        //int maxDoubleInteger = 1.7976931348623157E308;

    }
}
