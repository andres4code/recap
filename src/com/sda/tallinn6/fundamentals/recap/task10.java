
package com.sda.tallinn6.fundamentals.recap;
import java.util.Scanner;


public class task10 {
    public static void main(String[] args) {
        String[] items = {"", "", "", "", ""};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome buddy");

        int totalAmountOfItems = 0;
        //int items = 0;

        while (true) {
            System.out.println("Do you want to add/remove/view/search/done ?");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;

            } else if (input.equalsIgnoreCase("View")) {

                if (totalAmountOfItems == 0) {
                    System.out.println("Array is empty");
                }
                //Print array info
                boolean isFirst = true;
                for (int counter = 0; counter < items.length; counter++) {
                    if (!items[counter].isEmpty()) {
                        if (isFirst) {
                            isFirst = false;
                            System.out.println(items[counter]);
                        } else {
                            System.out.println("," + items[counter]);
                        }
                    }
                }
                if (isFirst) {
                    System.out.println();
                }

            } else if (input.equalsIgnoreCase("Add")) {
                if (totalAmountOfItems == items.length) {
                    System.out.println("array is full. We cannot add any item");
                } else {
                    System.out.println("What item you want to add?");
                    String itemAdded = scanner.nextLine();

                    boolean found = false;
                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemAdded)) {
                            System.out.println("Item located at index " + counter + " No need to add.");
                            found = true;
                        }
                    }
                    if (!found) {
                        for (int counter = 0; counter < items.length; counter++) {
                            if (items[counter].isEmpty()) {
                                items[counter] = itemAdded;
                                totalAmountOfItems++;
                                System.out.println("Item added");
                                break;
                            }
                        }
                    }
                }
            }else if(input.equalsIgnoreCase("Remove")){
                if (totalAmountOfItems == 0){
                    System.out.println("array is empty, nothing to remove");
                }else{
                    System.out.println("What do you want to remove");
                    String itemRemoved = scanner.nextLine();

                    boolean found = false;
                    for (int counter = 0; counter < items.length; counter++){
                        if (items[counter].equalsIgnoreCase(itemRemoved)){
                            System.out.println("Item removed");
                            items[counter] = "";
                            found = true;
                            totalAmountOfItems--;
                        }
                    }
                    if (!found){
                        System.out.println("Item not found!");
                    }
                }


            }else if(input.equalsIgnoreCase("Search")){
                if (totalAmountOfItems == 0) {
                    System.out.println("array is empty, nothing to search");
                }else{
                    System.out.println("What do you want to search");
                    String itemFound = scanner.nextLine();

                    boolean found = false;
                    //for(int i = 0; i < question.length; i++) {
                        //System.out.println("Current index is: " + i);

                            System.out.println("Item found");
                            found = true;
                        }
                }
                    //if (!found){
                        System.out.println("Item not found!");
                    }

                //item not found
                //item found, print the inex
                //
                /*
                search will print the index which is located at in the array.
                If it is not located then print could not find.done will finish.
                 */
            }
        }





















