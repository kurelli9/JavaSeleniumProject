package com.seleniumbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        boolean flag = checkbox.isEnabled();
        if(flag) {
            System.out.println("This checkbox is enabled");
        } else {
            System.out.println("This checkbox is not enabled");
        }
        checkbox.isSelected();
        if(flag) {
            System.out.println("This checkbox is selected");
        } else {
            System.out.println("This checkbox is not selected");
        }
        checkbox.isDisplayed();
        if(flag) {
            System.out.println("This checkbox is displayed");
        } else {
            System.out.println("This checkbox is not displayed");
        }
        checkbox.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example > button"));
        enableButton.click();       
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=text]")));
        WebElement inputField = driver.findElement(By.cssSelector("input[type=text]"));
        inputField.sendKeys("Its working");
        inputField.sendKeys(Keys.ENTER);
    }
}
