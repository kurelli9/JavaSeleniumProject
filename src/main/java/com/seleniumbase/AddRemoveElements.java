package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {
    
    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/");
       driver.manage().window().maximize();
       WebElement addRemovebutton = driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a"));
       addRemovebutton.click();
       WebElement addElementbutton = driver.findElement(By.cssSelector("#content > div > button"));
       addElementbutton.click(); 
       try {
        Thread.sleep(2000);
       } catch (Exception e) {
        e.getStackTrace();
       }
       WebElement delete = driver.findElement(By.cssSelector("#elements > button"));
       delete.click();   
            
    }
}
