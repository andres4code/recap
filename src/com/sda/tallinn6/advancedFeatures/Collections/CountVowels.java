package com.sda.tallinn6.advancedFeatures.Collections;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("The number of vowels in your word is: " + countNumberOfVowels(word));
    }

    public static int countNumberOfVowels(String word) {
        int count = 0;

        for (char ch : word.toCharArray()) {
            if (Character.toLowerCase(ch) == 'a'
                    || Character.toLowerCase(ch) == 'e'
                    || Character.toLowerCase(ch) == 'i'
                    || Character.toLowerCase(ch) == 'o'
                    || Character.toLowerCase(ch) == 'u'
            ) {
                count++;
            }
        }

        return count;
    }
}