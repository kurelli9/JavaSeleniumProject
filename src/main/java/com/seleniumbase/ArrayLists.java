package com.seleniumbase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayLists {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.manage().window().maximize();
        ArrayList<String> names = new ArrayList<>();
        names.add("Lorem");
        names.add("Ipsum");
        names.add("Dolor");
        names.add("Sit");
        names.add("Amet");
        names.add("Diceret");
        names.add("Action");
        System.out.println("ArrayList: " + names);
    }
}
