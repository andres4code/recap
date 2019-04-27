package com.sda.tallinn6.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    //https://regex101.com/

    public static void main(String[] args) {
        // . means any chat - <([{\...
        System.out.println(" AbcDef .cD - means it can be any char before cD");
        System.out.println(isMatch(".cd", "AbcDef"));
        System.out.println(isMatch(".cd", "Ab*cDef"));
        System.out.println(isMatch(".cd", "Ab/Def"));
        System.out.println(isMatch(".cd", "AbcDef"));
        System.out.println(".AbcDef cD. - means it can be any" + "char after cD");
        System.out.println(isMatch(".cd", "Ab*cD/ef"));
        System.out.println(isMatch(".cd", "Ab/cDe_f"));

        //check upper case
        System.out.println(isMatch("[A-Z]", "aaandkdsnc dcdsvhk"));

        //check lower case
        System.out.println(isMatch("[a-z]", "ADVAHSVDJAH"));

        //BOTH CASE
        System.out.println(isMatch("[a-zA-Z]", "EsnCmo"));

        //number range
        System.out.println(isMatch("[1-5]", "d8Hqnk3"));

        //char classes
        //https://regexr.com
        //
        System.out.println(isMatch("\\d\\d", "1212"));

        System.out.println(isMatch("[tT]rue", "True"));

        // "|" aka pipe is OR





    }

    public static boolean isMatch(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches > 0;


    }
}
