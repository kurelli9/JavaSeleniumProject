package com.seleniumbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>(); //List<String> list = new ArrayList<>();
		
		map.put("firstName", "Praneeth");
		map.put("lastName", "Kurelli");
		map.put("sub", "Selenium");
		map.put("location", "India");
		map.put("age", "20");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("firstName"));
        System.out.println(map.get("age"));


        Map<String, List<String>> list = new HashMap<String, List<String>>();
        List<String> subject = new ArrayList<String>();
        subject.add("selenium");
        subject.add("java");
        subject.add("maven");
        subject.add("javaScipt");
        subject.add("Devops");

        list.put("Subjects", subject);
        System.out.println(list);
    }
}
