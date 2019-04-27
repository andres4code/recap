package com.sda.tallinn6.fundamentals.arrays;

public class ArrayHomework {

    /**
     * 1. I have an array like this :
     *          int[] firstArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
     *          int[] secondArray = { 0, 11, 13, 6}
     *
     *  Your duty is to find common elements in these two arrays and print them :)
     *
     *
     */
    public static void main(String[] args) {
        int[] firstArray = new int[]{4, 2, 9, 6, 23, 12, 34, 0, 1};
        int[] secondArray = new int[]{0, 11, 13, 6};
        findCommonElements(firstArray, secondArray);
    }

    public static void findCommonElements(int[] firstArray, int[] secondArray) {

        //i get elements one by one and search if equals
        for(int i = 0; i<firstArray.length; i++){
            for (int j=0; j<secondArray.length;j++){
                if(firstArray[i] == secondArray[j]){
                    System.out.println(firstArray[i]);
                }
            }
        }


    }

}

