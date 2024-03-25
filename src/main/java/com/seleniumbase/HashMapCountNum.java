package com.seleniumbase;

import java.util.HashMap;

public class HashMapCountNum {
    public static void main(String[] args) {
        HashMap<String, Integer> countNum = new HashMap<>();
        countNum.put("Honda", 1);
        countNum.put("BMW", 2);
        countNum.put("Benz", 3);
        countNum.put("toyota", 4);
        countNum.put("Jeep", 5);

        System.out.println("Count of all values combined is: " + countNum.size());
        
    }
}
