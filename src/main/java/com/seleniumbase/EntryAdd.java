package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryAdd {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        driver.manage().window().maximize();
        By closeAdButton = By.cssSelector("div.modal-footer p");
        if (common.isDisplayed(closeAdButton)) {
            common.clickElement(closeAdButton);
            System.out.println("Ad closed.");
        }
        By reanable = By.linkText("click here");
        common.clickElement(reanable);
        System.out.println("Ad re-enabled.");

    }
}
