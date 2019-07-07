package com.sda.tallinn6.evgenii.BuyVehicleHomework;

import java.util.Arrays;
//parsing = analyze (a sentence) into its parts and describe their syntactic roles
public class Parser {

    public static void main(String[] args) {
        String str1 = "I have to learn Java very well";

        //solution 1
        String[] str2 = str1.split(" ");
        System.out.println(str2);
        for (String el:str2){
            System.out.println(el);
        }
        System.out.println(Arrays.asList(str2));//prints [I, have, to, learn, Java, very, well]
        //array = [I, have, to, learn, Java, very, well]
        //System.out.println(Arrays.asList(str2).stream().max(->));

    }
}
