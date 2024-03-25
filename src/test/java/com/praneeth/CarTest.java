package com.praneeth;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void testCarMethods() {
        Car car = new Car();
        car.setCompany_name("Honda");
        car.setModel_name("Civic");
        car.setYear(2023);
        

       System.out.println("company_name: " + car.getCompany_name());
       System.out.println("model_name: " + car.getModel_name());
       System.out.println("model year: " + car.getYear());
       System.out.println("mileage of the car: " + car.getMileage());
    }

}
