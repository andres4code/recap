package com.sda.tallinn6.advancedFeatures.june15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nameLengthSums {
    //make a list containing lengths of names
    public static void main(String[] args) {
        //String names[] = new String[]{"Andrew", "Brandon", "Michael", "Ayomide", "Nilan", "Aneli", "Mark"};
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael", "Ayomide", "Nilan", "Aneli", "Mark");
        List<String> nameStartsWithA = new ArrayList<>();

        //int StringLengths = 0;
        List<Integer> nameLengths = new ArrayList<Integer>();

        for (String name : names) {
            nameLengths.add(name.length());
        }
        System.out.println(nameLengths);

        //using streams
/*
        List<Integer> nameLenthsUsingStreams =
                names(String::length)
                .collect(Collectors.toList());

        System.out.println(nameLenthsUsingStreams);


 */

        int sum = 0;
        for (String name : names) {
            sum += name.length();
        }
        System.out.println("Sum: " + sum);


        //same with streams

        int sumUsingStreams = names.stream().mapToInt(String::length).sum();
        System.out.println(sumUsingStreams);



        //check if all even
    }
}

//get used to Optionals, Streams,
//In Spring framework ,optionals are very much used


