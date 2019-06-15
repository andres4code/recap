package com.sda.tallinn6.advancedFeatures.Concurreny;

public class StopWatchThread extends Thread {

    public StopWatchThread(String name) {
        super(name);
    }

    @Override//any code you want to be executed simultaneously put in this override method
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(getName() + " Stop watch " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
