package com.seleniumbase;

public class Car implements Vehicle {

    private String licenseplate;
    private float maxVel;

    public Car(String licenseplate, float maxVel) {
        this.licenseplate = licenseplate;
        this.maxVel = maxVel;
    }

    
    @Override
    public void start() {

        System.out.println("car getting started: " + licenseplate);
      
    }

    @Override
    public void stop() {
       
        System.out.println("car getting stoped: " + maxVel);
    }


    
}
