package com.seleniumbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclick3 {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com/" ;
        driver.get(url);
        driver.manage().window().minimize();
        String url1 = driver.getCurrentUrl();
        System.out.println("URL is: " + url1);
        String title = driver.getTitle();
        System.out.println("title is: " + title);
        WebElement button = driver.findElement(By.id("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        button.click();
        driver.quit();
    }
}
