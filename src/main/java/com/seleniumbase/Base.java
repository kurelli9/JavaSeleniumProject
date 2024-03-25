package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https:\\www.udemy.com" ;
        driver.get(url);
        driver.manage().window().maximize();
        String url1 = driver.getCurrentUrl();
        System.out.println("URL is: " + url1);
        String title = driver.getTitle();
        System.out.println("title is: " + title);
        WebElement element = driver.findElement(By.cssSelector("input[aria-autocomplete]"));
        element.sendKeys("java");
        element.sendKeys(Keys.ENTER);
        driver.quit();
    }
    
    
}
