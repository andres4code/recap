package com.sda.tallinn6.advancedFeatures.june15;

import java.util.Arrays;
import java.util.List;


public class A_names {
    public static void main(String[] args) {
        String sArray[] = new String[]{"Aspiridin","Brandon", "Andrestimate", "Andres"};
        List<String> names = Arrays.asList(sArray);
        List<String> nameStartsWithA = Arrays.asList(sArray);


        for (String name : names) {
            if (name.toUpperCase().startsWith("A")){
                nameStartsWithA.add(name);

            }
        }
        /*
        for (int i = 0; i < A_names_list.size(); i++) {
            if (String temp.char){


         */
            }
            //System.out.println(A_names_list.get(i));
        }
//charat(0).equalsignorecase(a)