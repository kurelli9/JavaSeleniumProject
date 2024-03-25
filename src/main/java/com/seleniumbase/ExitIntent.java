package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExitIntent {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/exit_intent");
        driver.manage().window().maximize();
        WebElement outsideViewport = driver.findElement(By.cssSelector("#flash-messages"));
        actions.moveToElement(outsideViewport).moveByOffset(400,350).perform();
        
        }
}
