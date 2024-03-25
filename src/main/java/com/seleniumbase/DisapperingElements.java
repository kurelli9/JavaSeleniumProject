package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisapperingElements {
    
      public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
           WebDriver driver = new ChromeDriver();
           driver.get("https://the-internet.herokuapp.com/disappearing_elements");
           driver.manage().window().maximize();
           try {
                WebElement gallery = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(5) > a"));
                gallery.click();
           } catch (Exception e) {
                System.out.println(e.getMessage());
           }
           
      }
}
