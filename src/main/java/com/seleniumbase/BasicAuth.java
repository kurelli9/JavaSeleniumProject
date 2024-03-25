package com.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {
    
    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       driver.manage().window().maximize();

    }
}
