package com.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.manage().window().maximize();
    }
}
