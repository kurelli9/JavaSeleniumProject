package com.seleniumbase;

public class Main {

    public static void main(String[] args) {
        
        Circle myCircle = new Circle(24);
        Square mySquare = new Square(21);

        System.out.println("Area of Circle: " + myCircle.calculateArea() + "," + " Perimeter of Circle: " + myCircle.calculatePerimeter());

        System.out.println("Area of Square: " + mySquare.calculateArea() + "," + " Perimeter of Square: " + mySquare.calculatePerimeter());
    }
}

