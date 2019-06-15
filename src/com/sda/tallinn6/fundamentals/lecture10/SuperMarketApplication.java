package com.sda.tallinn6.fundamentals.lecture10;

import java.util.List;
import java.util.Scanner;

public class SuperMarketApplication {
    public static void main(String[] args) {
        System.out.println("Welcome Admin to the supermarket application");
        Scanner scanner = new Scanner(System.in);

        SuperMarket superMarket = new SuperMarket();

        superMarket.printAllProducts();
        System.out.println("Please enter your budget");
        double budget = Double.parseDouble(scanner.nextLine());
        Account account = new Account(budget);
        System.out.println("Your budget is " + account.getBalance());

        while (true) {
            System.out.println("What do you want to do: Add - Remove - Done");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Add")) {
                System.out.println("What is the name? ");
                String productName = scanner.nextLine();
                int index = superMarket.getIndexOfProduct(productName);
                if (index != -1) {
                    System.out.println("The product already exists");
                } else {
                    System.out.println("What is the price");
                    double productPrice = Double.parseDouble(scanner.nextLine());//turns input to double
                    Product product = new Product(productName, productPrice);//creates object of product
                    superMarket.insertProduct(product);
                    superMarket.printAllProducts();
                }

            } else if (input.equalsIgnoreCase("Remove")) {
                System.out.println("What product you want to remove(give product name)");//input expects name
                String productName = scanner.nextLine();
                int index = superMarket.getIndexOfProduct(productName);//IMPORTing method and assigning to variable
                if (index == -1) {
                    System.out.println("The product does not exist");
                } else {
                    System.out.println("Removing the product");
                    superMarket.removeProduct(index);
                    superMarket.printAllProducts();
                }
            } else if (input.equalsIgnoreCase("Done")) {
                break;
            } else {
                System.out.println("Invalid Comment");
            }
        }while(true) {
            System.out.println("What do you want to buy?");
            String requestedProductName = scanner.nextLine();
            if (requestedProductName.equalsIgnoreCase("done")) {
                break;
            }
            int indexOfProduct = superMarket.getIndexOfProduct(requestedProductName);
            if (indexOfProduct==-1){
                System.out.println("This item does not exist");


        }else{
                SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
                List<Product> listOfProducts = superMarket.getListOfProducts();
                Product selectedProduct = listOfProducts.get(indexOfProduct);
                System.out.println("How many of " + selectedProduct.getName() + " do you want to buy?");

                int requestedQuantity = Integer.parseInt(scanner.nextLine());

                double totalCost = selectedProduct.getPrice()*requestedQuantity;
                totalCost = superMarketUtilities.round(totalCost);
                boolean isEnoughMoney = account.deduct(totalCost);
                if(isEnoughMoney){
                    System.out.println("You bought " + selectedProduct.getName());

                    account.appUpdateProduct(selectedProduct.getName(), requestedQuantity);
                }
            }



        }
    }
}
