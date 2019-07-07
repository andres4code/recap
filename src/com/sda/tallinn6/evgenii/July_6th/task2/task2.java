package com.sda.tallinn6.evgenii.July_6th.task2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class task2 {

    public static void main(String[] args) {
        final Integer numericValue = 5;
        Function<Integer, Integer> doubleValue = (num) -> num*2;
        doubleValue.apply(numericValue);
        BiFunction<Integer, Integer, Integer> multiplyTwoValues = (num1, num2) -> num1*num2;
        multiplyTwoValues.apply(12, 12);


    }
}
