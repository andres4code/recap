package com.sda.tallinn6.fundamentals.classes;

public class InstanceOf {

    public static void main(String[] args) {
        Bicycle first = new Bicycle();
        boolean result = first instanceof Bicycle;
        Bicycle second = null;
        boolean result2 = second instanceof Bicycle;

        System.out.println("first is an instance of bicycle" + result);
        System.out.println("second is an instance of bicycle" + result2);

        boolean another = first instanceof Bicycle;

        //boolean another = first instanceof Bicycle

    }
}
