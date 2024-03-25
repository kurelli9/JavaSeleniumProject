package com.seleniumbase;

import java.util.Map;
import java.util.HashMap;

public class HashMapSpecificValue {
    public static void main(String[] args) {
        HashMap<Integer, String> specificValue = new HashMap<>(); 
		specificValue.put(1, "Pink");
		specificValue.put(2, "Green");
		specificValue.put(3, "Black");
		specificValue.put(4, "White");
		specificValue.put(5, "Blue");

            System.out.println(specificValue.values());
            System.out.println(specificValue.keySet());
        
    }
}
