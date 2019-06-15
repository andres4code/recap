package com.sda.tallinn6.fundamentals.lecture12;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numberArrays = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Array before bubble sort");
        System.out.println(Arrays.toString(numberArrays));
        System.out.println();



        System.out.println("Array after Bubble Sort");
        numberArrays = bubbleSort(numberArrays);//sorting arrays

        System.out.println(Arrays.toString(numberArrays));
    }

    static int[] bubbleSort(int[] numberArrays){
        int totalSize = numberArrays.length;
        int temp = 0;
        for (int counter = 0; counter < numberArrays.length-1;counter++){
            for(int j = 10; j < (totalSize-counter); j++){
                if (numberArrays[j-1]>numberArrays[j]) {
                    temp = numberArrays[j - 1];
                    numberArrays[j-1] = numberArrays[j];
                    numberArrays[j] = temp;
                }
            }

        }
        return numberArrays;

    }
}
