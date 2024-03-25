package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
    
    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://login.yahoo.com/");
       driver.manage().window().maximize();
       String url1 = driver.getCurrentUrl();
        System.out.println("URL is: " + url1);
        String title = driver.getTitle();
        System.out.println("title is: " + title);
        WebElement staySignedIn = driver.findElement(By.cssSelector(" .stay-signed-in label"));
        staySignedIn.click();
        WebElement createAccountButton = driver.findElement(By.cssSelector("#createacc"));
        createAccountButton.click();
        WebElement fullNameField = driver.findElement(By.cssSelector("#usernamereg-firstName"));
        fullNameField.sendKeys("praneeth kumar");
        fullNameField.sendKeys(Keys.ENTER);
        WebElement emailAddressField = driver.findElement(By.cssSelector("#usernamereg-userId"));
        emailAddressField.sendKeys("praneethemail");
        WebElement passwordField = driver.findElement(By.id("usernamereg-password"));
        passwordField.sendKeys("mypassword");
        WebElement monthDropdown = driver.findElement(By.id("usernamereg-month"));
        monthDropdown.sendKeys("July");  
        WebElement dayField = driver.findElement(By.id("usernamereg-day"));
        dayField.sendKeys("29");  
        WebElement yearField = driver.findElement(By.id("usernamereg-year"));
        yearField.sendKeys("1997"); 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        driver.quit();
    }
}
