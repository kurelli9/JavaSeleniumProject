package com.seleniumbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BrokenImage {
    
     public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/broken_images");
       driver.manage().window().maximize();
       List<WebElement> elementList= driver.findElements(By.tagName("img"));
       for (WebElement image : elementList) {
            String imageURL = image.getAttribute("src");
            Response response = RestAssured.get(imageURL);
            if (response.getStatusCode() != 200) {
                System.out.println("Broken image found: " + imageURL);
                System.out.println(response.getStatusCode());
            }
        }
     }
}
