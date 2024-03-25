package com.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FloatingMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        driver.manage().window().maximize();
    }
}
