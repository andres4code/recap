package com.sda.tallinn6.evgenii.July_6th.bus_package;

@FunctionalInterface
public interface Bus {
    public static final String NAME = "ddd";

    void fillTank(Double litters);

    default void drive(Double kms){
        System.out.println("KM: " + kms);
    };

    default void setDriverName(String name){
        System.out.println("nobody");
    }
}

