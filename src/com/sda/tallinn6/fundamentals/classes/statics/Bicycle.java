package com.sda.tallinn6.fundamentals.classes.statics;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    static int count = 0; //static means it only belongs to class
    public int instanceCount;


    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        count++;
        instanceCount++;

    }

        public static final double PI = 3.12159;
        public static final int TEMPERATURE_BOILING_WATER = 3;




    public static void main(String[] args) {
        System.out.println();

    }

    //public enum Bicycle {}
}
