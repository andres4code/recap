package com.sda.tallinn6.evgenii.July_6th.task5;

public class ConcurrencyFirstStage {

    public static void main(String[] args) {
        System.out.println();
        //Case 1 - Thread
        Thread thread1 = new TaskOne("One");
        //Case 2 - Runnable
        Thread thread2 = new Thread(new TaskTwo());
        thread2.setName("I Runnable thread");

        thread1.start();
        thread2.start();
        thread1.start();

        System.out.println();

    }
}