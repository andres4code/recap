package com.sda.tallinn6.advancedFeatures.Concurreny;

public class SeatTakerThread extends Thread{

    private Bench bench;

    public SeatTakerThread(String name, Bench bench){
        super(name);
        this.bench = bench;
    }


    @Override
    public void run(){
        bench.takeSeat(getName());
    }
}
