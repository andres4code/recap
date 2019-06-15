package com.sda.tallinn6.advancedFeatures.genericTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayExercise {
    public static void main(String[] args) {
        Double[] numbersArray = {23.0, 402.0, 900D};
        String[] namesArray = new String[]{"John, Anny, Patrick,Harry"};

        //methName(nonGenericList);

        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }
        double result = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            result = result + numbersArray[i];
            System.out.println(result);
        }
        //for each loop: for (each score:from where)
                            //totalScore += score;
        /*
        for(double score:scoresList){
            sout(score)
            totalScore += score;
        }
         */
        List<Double> list = Arrays.asList(numbersArray);//important to know!!!!!!!!!!!!!!!
        System.out.println(list);

        List<String> list2 = Arrays.asList(namesArray);//important to know!!!!!!!!!!!!!!!
        System.out.println(list2);//prints out like [name, name, name]

        //list for storing anything!!!!!!!!
        List nonGenericList = new ArrayList();
            nonGenericList.add("Hello");
            nonGenericList.add(45);
            //nonGenericList.add(new Student("Harvard","Done", ""));

        //VERY IMPORTANT!!!!!!!!!!!!!!!TYPE CASTING.
        //converting DATATYPE!!!!!
        double d = 15.0;
        int x = (int) d;//double converted tyo int


        String msg = (String) nonGenericList.get(0);
        System.out.println(msg);





    }
    public static void methName(List list){
        return;

    }
}

//print strings
//add numbers
//convert arrays into lists

/*
int[] spam = new int[] { 1, 2, 3 };
Arrays.asList(spam)

List<Integer> list = Arrays.asList(spam);

 */