package com.seleniumbase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
           driver.manage().window().maximize();
            WebElement contextMenu = driver.findElement(By.cssSelector("#hot-spot"));
            Actions action = new Actions(driver); 
            action.contextClick(contextMenu).perform();
            Alert alert = driver.switchTo().alert(); // switch to alert

            String alertMessage= driver.switchTo().alert().getText(); // capture alert message

            System.out.println(alertMessage);
            driver.switchTo().alert().accept();
            driver.quit();
    }
}
