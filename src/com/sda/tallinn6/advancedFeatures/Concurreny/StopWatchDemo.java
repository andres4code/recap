package com.sda.tallinn6.advancedFeatures.Concurreny;

public class StopWatchDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start main method");
        Thread.sleep(100);
        StopWatchThread thread1 = new StopWatchThread("Thread1");
        StopWatchThread thread2 = new StopWatchThread("Thread2");
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        System.out.println("After starting thread");
        Thread.sleep(1000);

        Thread thread3 = new Thread("Thread3");
        Thread thread4 = new Thread("Thread4");
        thread3.start();
        System.out.println("After starting thread3");
        thread4.start();
        System.out.println("After starting thread4");


        System.out.println("End of main method");
    }
}
