package com.seleniumbase;

public class Starter {

    public static void main(String[] args) {
        
        Car myCar = new Car("AP12", 100);
        Truck myTruck = new Truck("TS09", 120);

        myCar.start();
        myCar.stop();
        myCar.blowHorn();

        myTruck.start();
        myTruck.stop();
        myTruck.blowHorn();
    }
    
}
