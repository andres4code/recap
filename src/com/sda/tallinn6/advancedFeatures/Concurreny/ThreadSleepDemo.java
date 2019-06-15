package com.sda.tallinn6.advancedFeatures.Concurreny;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main method");
        Thread.sleep(5000);
        System.out.println("After 1st pause");
        Thread.sleep(5000);
        System.out.println("After 2nd pause");
        Thread.sleep(5000);

    }
}
