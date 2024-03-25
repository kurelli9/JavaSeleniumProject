package com.seleniumbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
           WebDriver driver = new ChromeDriver();
           driver.get("https://the-internet.herokuapp.com/checkboxes");
           driver.manage().window().maximize();
           WebElement checkBox1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
           checkBox1.click();          
           driver.close();

    }

}
