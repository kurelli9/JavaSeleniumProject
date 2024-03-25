package com.seleniumbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ChallengingDOM {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
           WebDriver driver = new ChromeDriver();
           Common common = new Common(driver);
           Locators locator = new Locators();
           driver.get("https://the-internet.herokuapp.com/challenging_dom");
           driver.manage().window().maximize();
            List<WebElement> coloumNames = driver.findElements(By.cssSelector("table thead tr th"));
            int size = coloumNames.size();
            System.out.println(size);
            for (WebElement name: coloumNames) {
                String word = name.getText();
                System.out.println(word);
            }

            List<WebElement> rowNames = driver.findElements(By.cssSelector(".columns table tbody tr"));
            int num = rowNames.size();
            System.out.println(num);
            common.clickElement(locator.lastRowEdit());
            common.clickElement(locator.lastRowDelete());
            common.clickElement(locator.firstRowEdit());
            common.clickElement(locator.firstRowDelete());
            WebElement answer =driver.findElement(By.cssSelector("#content script"));  
            String word = answer.getText();
            System.out.println(word);
            /* driver.navigate().refresh();
            WebElement ansr =driver.findElement(By.id("canvas"));  
            String value = ansr.getText();
            System.out.println(value); */
            driver.quit();
            
            
    }
}
