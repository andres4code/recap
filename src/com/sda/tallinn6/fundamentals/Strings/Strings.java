package com.sda.tallinn6.fundamentals.Strings;

public class Strings {

    public static void main(String[] args) {
        System.out.println("Creating String objects");
        System.out.println("Create two String objects by\n" + "using the operator new");

        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println(str1 == str2);

        String nameE = "Feride";
        String nameAndSurname = nameE + "Celik";

        //Another way to create a String object
        char[] name = new char[]{'P', 'a', 'u', 'l'};
        String boy = new String(name);
        System.out.println(boy);


        //Methods of the class String
        String name1 = new String("paul");
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(2));

        String letters = "ABCAB";
        System.out.println(letters.indexOf('B'));
        System.out.println(letters.indexOf("S"));
        System.out.println(letters.indexOf("CA"));

        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);

        String result = exam.substring(2, 4);
        System.out.println(result);

        String varWithSpaces = " AB CB";
        System.out.println(":");
        System.out.println(varWithSpaces);
        System.out.println(":");

        System.out.println(":");
        System.out.println(varWithSpaces.trim());
        System.out.println(":");

        String letters1 = "ABCAB";
        System.out.println(letters1.replace('B', 'b'));
        System.out.println(letters1.replace("CA", "12"));

        System.out.println("Shreya   ".length());


        String letters2 = "ABCAB";
        System.out.println(letters2.startsWith("AB"));
        System.out.println(letters2.startsWith("a"));
        System.out.println(letters2.startsWith("A", 3));

        System.out.println(letters2.endsWith("CAB"));
        System.out.println(letters2.endsWith("B"));
        System.out.println(letters2.endsWith("b"));


        //String class is immutable
        String day = "Sunday";
        day.replace('D', 'z').substring(3);
        System.out.println(day);

        //Determining equality of Strings

        String var1 = new String("java");
        String var2 = new String("Java");
        System.out.println(var1.equals(var1));
        System.out.println(var1 == var2);
        //The operator == compares the reference variables


        //var3 and var4 created in String pool
        String var3 = "code";
        String var4 = "code";
        System.out.println(var3.equals(var4));
        System.out.println(var3 == var4);
        System.out.println("||||||||||||||||||||||||||||||||||||||");

        //!!!!!!!!!String null and "" differences

        String nullString = null;
        String emptyString = "";
        String randomString = "Feride";
        if(nullString==randomString){
            System.out.println("same");
        }

        if (emptyString==randomString){
            System.out.println("same");
        }

        if (emptyString.equals(randomString)) {
            System.out.println("same");
        }

        //how do we do safe checks?
        //null checks

        String anyValue = null;
        String anotherValue = "";

        boolean unsafeComparisonWithNull = anyValue.equals(anotherValue);
        boolean unsafeComparisonWithEmpty = anotherValue.equals("");
        boolean safeComparison = anyValue != null && !anyValue.equals("");

        //Mutable strings: Stringbuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sl2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();












    }
}
