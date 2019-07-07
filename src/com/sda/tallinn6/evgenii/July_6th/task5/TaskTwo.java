package com.sda.tallinn6.evgenii.July_6th.task5;

public class TaskTwo implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am from TaskTwo which implements Runnable interface. My name is:"
                + Thread.currentThread().getName());
    }
}
