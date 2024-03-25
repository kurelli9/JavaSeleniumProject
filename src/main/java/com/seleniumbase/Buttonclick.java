package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclick {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com" ;
        driver.get(url);
        driver.manage().window().minimize();
        String url1 = driver.getCurrentUrl();
        System.out.println("URL is: " + url1);
        String title = driver.getTitle();
        System.out.println("title is: " + title);
        WebElement button = driver.findElement(By.id("//*[@id=\"loginbutton\"]"));
        button.click();
        driver.quit();
    }
}
