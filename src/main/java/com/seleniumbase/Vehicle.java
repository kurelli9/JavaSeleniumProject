package com.seleniumbase;

public interface Vehicle {
     void start();
     void stop();
    default void blowHorn() {
        System.out.println("Blowing Horn");
    }
    
}
