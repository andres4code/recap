package com.sda.tallinn6.fundamentals.lecture10;

import java.util.ArrayList;
import java.util.List;


public class SuperMarket {
    private List<Product> listOfProducts = new ArrayList<>();


    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
//previous two were generated
    public void printAllProducts() {//doesnt need parameters bcuz can access the field
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(listOfProducts.get(i).getName() + " " + listOfProducts.get(i).getPrice());

        }
    }

    public void insertProduct(Product incomingProduct){
        listOfProducts.add(incomingProduct);
    }
    public void removeProduct(int index){//productname is bad for finding something
        listOfProducts.remove(index);
    }
    public int getIndexOfProduct(String name){
        for (int i = 0; i < listOfProducts.size(); i++) {
            if(listOfProducts.get(i).getName().equalsIgnoreCase(name)){//udemy aitas seda
                return i;//uuri paar tundi feride asju
            }//contains dont work: java ei tea kas
//if lause: get votab esimese indexi, gename votab nime mis sel indeksil on, equals vordleb nimesid
        }
        return -1;//nii ei pea if else panema

    }
    /*
    public int getIndexOf(String incomingProductName){
        for(int counter = 0; counter < listofProducts.size(); counter++)
            Product product = listofproducts.get(counter);
            String nameofthisProduct = product.getName();
            if (nameOfThisProduct.equalsIgnoreCase(IncomingProductName))
                return counter;
        }
        return -1;
     */
}
