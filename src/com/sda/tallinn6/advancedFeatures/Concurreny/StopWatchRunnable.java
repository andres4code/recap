package com.sda.tallinn6.advancedFeatures.Concurreny;

public class StopWatchRunnable implements Runnable{
    private String name;

    public StopWatchRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(name + " : " + i);
        }

    }

}
