package com.sda.tallinn6.evgenii.July_6th.task5;

public class TaskOne extends Thread{
    public TaskOne(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep((long) (Math.random()*100 + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread: "
                + Thread.currentThread().getName()
                + " is finished");
    }

}
