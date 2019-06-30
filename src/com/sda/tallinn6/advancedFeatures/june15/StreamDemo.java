package com.sda.tallinn6.advancedFeatures.june15;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {


    public static void main(String[] args) {
        String sArray[] = new String[]{"Andrew", "Brandon", "Michael", "Ayomide", "Nilan", "Aneli"};
        List<String> names = Arrays.asList(sArray);

        //qaboolean anyEventUsingStream = names.stream().anyMatch(n -> n % 2 == 0);


//        for (String name : names) {
//            System.out.println();





        //System.out.println(namesStartingWithAUsingStreams);
        String joinString = "";
        for (String name : names ){
            joinString += (name + ", ");

        }

       // String joinedString = names.stream("", (cu))
    }
}

