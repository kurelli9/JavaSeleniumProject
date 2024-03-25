package com.seleniumbase;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<Integer, String> road = new HashMap<>();
        road.put(1, "SR Nagar");
        road.put(2, "Gandhi Nagar");
        road.put(3, "Indra Nagar");
        road.put(4, "Prem Nagar");
        road.put(123, "kumar Nagar");
        road.put(5, "Trt Nagar");
        road.put(6, "Panjagutta");
        System.out.println("Names of road: " + road);
        road.clear();

        System.out.println("Names of road: " + road);

    }
}
