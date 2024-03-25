package com.seleniumbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicContent {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dynamicContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("large-10")));
        String word = dynamicContent.getText();
        System.out.println("Dynamic Content: " + word);
    }
}
