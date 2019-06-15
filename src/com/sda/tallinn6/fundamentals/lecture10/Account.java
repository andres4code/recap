package com.sda.tallinn6.fundamentals.lecture10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {

    double balance;
    List<Product> productList = new ArrayList<>();
    SuperMarketUtilities utilities = new SuperMarketUtilities();


    public Account(double balance) {//selle lisasin aga see pole budget constructor
        this.balance = balance;
    }

    public Account(double balance, List<Product> productList, SuperMarketUtilities utilities) {
        this.balance = balance;
        this.productList = productList;
        this.utilities = utilities;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getproductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public SuperMarketUtilities getUtilities() {
        return utilities;
    }

    public void setUtilities(SuperMarketUtilities utilities) {
        this.utilities = utilities;
    }

    public void printAccountInfo() {//print info of bought product name+quantities and balance of account
        System.out.println("------------------------------------");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Product name:" + productList.get(i).getName() + " Quantity: "
                    + productList.get(i).getPrice());

        }
        System.out.println("Last balance" + balance);
        System.out.println("------------------------------------");
    }

    public boolean deduct(double cost) {
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        cost = superMarketUtilities.round(cost);
        balance = superMarketUtilities.round(balance);
        if (balance < cost) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        }
    }

    public void appUpdateProduct(String productName, int amount) {
        for (Product boughtExistingProduct : productList) {
            if (boughtExistingProduct.getName().equalsIgnoreCase(productName)) {
                int updatedAmount = boughtExistingProduct.getQuantity() + amount;
                boughtExistingProduct.setQuantity(updatedAmount);
                return;
            }
        }
        Product newProduct = new Product(productName, amount);
        //newProduct.setName(productName);
        //newProduct.setQuantity(amount);
        productList.add(newProduct);

        /*
        what to buy?
        write done
        product in market- no not existing

        else: if exist: how many

         */

    }

}
/*
Please enter your budget.....
Create the budget assigned to this account


Then ask what do you want to buy if you are done write done
if the product name user inserted does not exist in the super market then say that this item does not exist.
if it exists... Ask how many you want to buy this product
    Check if there is enough money if there is then add the product to the account with the amount
    if not then ask again.. What do you want to buy...



 */