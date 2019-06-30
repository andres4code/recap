package com.sda.tallinn6.advancedFeatures.june15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class A_names {
    public static void main(String[] args) {
        String sArray[] = new String[]{"Andrew", "Brandon", "Michael", "Ayomide", "Nilan", "Aneli"};
        List<String> names = Arrays.asList(sArray);
        List<String> nameStartsWithA = new ArrayList<>();

        //loop thru and get names starting with a
        for (String name : names) {
            if (name.startsWith("A")) {
                nameStartsWithA.add(name);

            }
        }
        System.out.println(nameStartsWithA);

        //using streams

        List<String> namesStartingWithAUsingStreams = names.stream().filter(name -> name.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesStartingWithAUsingStreams);

        String nameWithOddLength = "";
        for (String name : names) {
            if (name.length() % 2 == 1) {
                nameWithOddLength = name;
                break;
            }
        }
        System.out.println("First name with odd length: " + nameWithOddLength);

        //using streams
        String nameWithOddLengthUsingStreams = "";//make it as empty and later fill- this way no red
        Optional<String> optionalName = names.stream().filter(name -> name.length() % 2 == 1)
                .findFirst();
        if (optionalName.isPresent()){//!!!!!!!!!!TRY TO UNDERSTAND IT ONE MORE TIME
            nameWithOddLengthUsingStreams = optionalName.get();
        }

        System.out.println(nameWithOddLengthUsingStreams);
        System.out.println("First name with odd length: " + nameWithOddLength);



        /*
        for (int i = 0; i < A_names_list.size(); i++) {
            if (String temp.char){


         */

        //System.out.println(A_names_list.get(i));

//charat(0).equalsignorecase(a)
    }
}