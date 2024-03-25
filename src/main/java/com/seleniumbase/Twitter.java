package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        driver.manage().window().maximize();
        WebElement createAccount = driver.findElement(By.xpath("//input[@id='react-root']"));
        createAccount.click();
        driver.quit();
    }
}
