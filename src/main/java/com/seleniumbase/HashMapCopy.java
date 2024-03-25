package com.seleniumbase;

import java.util.HashMap;

public class HashMapCopy {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        HashMap<String, Integer> veggies = new HashMap<>();
        fruits.put("apple", 1);
        fruits.put("orange", 2);
        fruits.put("bananna", 3);
        fruits.put("grapes", 4);
        System.out.println("hashMap fruits" + fruits);

        veggies.put("carrot", 5);
        veggies.put("capsicum", 6);
        veggies.put("tomato", 7);
        System.out.println("hashMap veggies" + veggies);

        veggies.putAll(fruits);
        System.out.println("Merge both fruits and veggies: " + veggies);
        
    }
}
