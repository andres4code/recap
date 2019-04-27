package com.sda.tallinn6.fundamentals.Strings;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {
        System.out.println("elvis and lives are anagrams : " + isAnagram("elvis", "lives"));
        System.out.println("cimic and cimic are palindroms : " + isPalindrome("cimic cimic")); //!!!one string
        //1)TAKES two words, asks ANAGRAM method!!!!!!!
        //String based algorithms
        //find two string anagrams
    }

    private static boolean isAnagram(String first, String second) { //anagram changes word order(same letters)
        String sortedFirst = sort(first); //2)ANAGRAM asks SORT method!!!!!
        String sortedSecond = sort(second);
        return sortedFirst.equals(sortedSecond);
    }

    private static String prepare(String text) { //trim removes whitespace from EDGES, lowercase, replace(inside spaces)
        return text.toLowerCase().trim().replaceAll("\\s", "");
    }

    private static String sort(String text) {  //puts in ALPHABETICAL order
        char[] chars = prepare(text).toCharArray(); //)SORT method asks PREPARE method!!!!!

        Arrays.sort(chars);
        return new String(chars);
    }


    //||||||||||||||
    //how to REVERSE A STRING
    private static String reverseTex(String input) {
        return new StringBuilder(input).reverse().toString(); //stringbuilder comes from java library
        //string is IMMUTABLE, stringbuilder is not, strinbuilder does not require object??
        //only stringbuilder has reverse method inside, thats why we: reverse stringbuilder and then convert to string
    }
    //check if string is a palindrome - redivider, deified, cimic, madam //saad lugeda molemalt poolt, sama sona on
    public static boolean isPalindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);

    }

    }

