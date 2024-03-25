package com.seleniumbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        By category = By.cssSelector("#gh-shop-a");
        common.clickElement(category);
    
    }
}    
        