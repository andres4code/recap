package com.sda.tallinn6.advancedFeatures.Concurreny;

public class SeatTakerDemo {

    public static void main(String[] args) throws InterruptedException{

        Bench bench = new Bench(4);

        SeatTakerThread seatTaker1 = new SeatTakerThread("seatTaker1 ", bench);
        SeatTakerThread seatTaker2 = new SeatTakerThread("seatTaker2 ", bench);

        seatTaker1.start();
        seatTaker2.start();


    }
    
}

