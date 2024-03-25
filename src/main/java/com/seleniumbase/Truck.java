package com.seleniumbase;

public class Truck implements Vehicle {

    private String licenseplate;
    private float maxVel;

    public Truck(String licenseplate, float maxVel) {
        this.licenseplate = licenseplate;
        this.maxVel = maxVel;
    }


    @Override
    public void start() {
        System.out.println("truck getting started: " + licenseplate);
        
    }

    @Override
    public void stop() {
        System.out.println("truck getting stopped: " + maxVel);
        
    }
    
}
