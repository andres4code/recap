package com.sda.tallinn6.advancedFeatures.Collections;

import java.util.ArrayList;

//list , loop, swap first element with last
public class Exercise99 {

    /*
    public static void main(String[] args) {
        ArrayList<int> greatList=new ArrayList<int>();
        greatList.add(0, 5);
        greatList.add(1,23);
        greatList.add(2, 47);
        greatList.add(3, 2);
        greatList.add(4, 89);

        for (int v : greatList){

        }

    }

     */
    public static void main(String[] args) {
        int[] numbersArray = {10, 5, 2, 20, 15, 1, 19, 25};

        /*
        int myMin = numbersArray[0];
        int
        for (int i:numbersArray) {
            if (numbersArray[i] > minimum){   //first element is minimum and compare it, change when needed
                minimum = numbersArray[i];


                //if first element is bigger than next then swap elements
         */

        /*
        int myMin = numbersArray[0];
        int myMinIndex = 0;
        for (j = 0; j < numbersArray.length; j++)
            if (numbersArray[j] < myMin){
                myMin = numbersArray[j];
                myMinIndex = j;
            }

            }
        }

         */
        //teachers version with arrays
        int[] arr = {10, 5, 2, 20, 15, 1, 19, 25};


        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int min = arr[0];
        int indexOfMin = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                indexOfMin = i;
            }
        }

        arr[indexOfMin] = arr[0];
        arr[0] = min;

        for( int i : arr){
            System.out.print(i + " ");
        }
    }
}
/*
int myMin = myScore[0];
        int myMinIndex = 0;
        for (j = 0; j < myScore.length; j++)
            if (myScore[j] < myMin){
                myMin = myScore[j];
                myMinIndex = j;
            }
 */
