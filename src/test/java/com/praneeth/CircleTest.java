package com.praneeth;

import org.testng.annotations.Test;

public class CircleTest {
    
    CircleRadius myCircle = new CircleRadius();

   @Test
   public void calculatePerimeter() {
    myCircle.setRadius(6);
    int radius = myCircle.getRadius();
    System.out.println("perimeter of circle is: " + 2 * Math.PI * radius);
   }

   @Test
   public void calculateArea() {
    myCircle.setRadius(6);
    int radius = myCircle.getRadius();
    System.out.println("Area of circle is: " +  Math.PI * radius * radius);
   }
}
