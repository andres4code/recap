package com.sda.tallinn6.fundamentals.recap;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) { //
        //eliminate spaces from sides and spaces if they are too much e.g 2 or 3
        //ask which part of sentence you want to write
        System.out.println("Welcome stranger");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sentence.If you are done, write done");
            String input = scanner.nextLine();//nextline takes everything


            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Which order for the sentence you want to print");
                String numberOfWord = scanner.nextLine();//scans whole sentence

                int userRequestNumber = Integer.parseInt(numberOfWord);
                if (userRequestNumber<= 0) {//parse turns string into integer!!!!!!!
                    System.out.println("Cannot accept 0 or negative number");
                } else {
                    input = input.trim().replaceAll("\\s+" ," ");//spliting words according to spaces
                    String[] splittedWords = input.split(" ");
                    if (userRequestNumber>splittedWords.length){
                        System.out.println("Sentence is too short, cannot find the words.");
                    }else{
                        System.out.println("Result word: " + splittedWords[userRequestNumber-1]);


                        }
                    }
                }

            }

        }
    }

