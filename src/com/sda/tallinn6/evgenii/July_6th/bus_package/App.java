package com.sda.tallinn6.evgenii.July_6th.bus_package;

public class App {

    public static void main(String[] args) {
        Bus myBus = new Bus() {

            @Override
            public void fillTank(Double litters) {
                System.out.println("Tank is filled: " + litters);
            }
        };

        Bus myLambdaBus = (Double litters) ->
                System.out.println("Tank is filled: " + litters);


        myBus.drive(12.4);
        myBus.setDriverName("Drivername");
        myBus.fillTank(123.44);

        myLambdaBus.drive(212.4);
        myLambdaBus.setDriverName("Drivername 2");
        myLambdaBus.fillTank(12333.44);
    }
}

//Please create functional interface Multiplier
//with unimplemented Method do(Integer a, Integer b) it should return Integer