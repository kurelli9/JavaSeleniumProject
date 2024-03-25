package com.seleniumbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayCategories {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
        WebDriver driver = new ChromeDriver();
        Common common = new Common(driver);
        driver.get("https://ebay.com/");
        driver.manage().window().maximize();
        By category = By.cssSelector("#gh-shop-a");
        common.clickElement(category);
        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(1) > h3:nth-child(1) > a",
             "#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(2) > li> a", "Motors");
        
        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(2) > h3:nth-child(1) > a",
        "#gh-sbc > tbody > tr > td:nth-child(2) > ul:nth-child(2) > li a" , "Electronics");     

        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(3) > h3:nth-child(1) > a",
        "#gh-sbc > tbody > tr > td:nth-child(3) > ul:nth-child(2) > li a", "Collectibles and Art");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(1) > h3:nth-child(3) > a",
        "#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(4) > li a", "Clothing");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(2) > h3:nth-child(3) > a", 
            "#gh-sbc > tbody > tr > td:nth-child(2) > ul:nth-child(4) > li a", "Bussiness");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(3) > h3:nth-child(3) > a",
            "#gh-sbc > tbody > tr > td:nth-child(3) > ul:nth-child(4) > li a", "Home");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(1) > h3:nth-child(5) > a",
            "#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(6) > li a", "Sports");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(2) > h3:nth-child(5) > a",
        "#gh-sbc > tbody > tr > td:nth-child(2) > ul:nth-child(6) > li a", "Jewels");


        common.validateCategories("#gh-sbc > tbody > tr > td:nth-child(3) > h3:nth-child(5) > a", 
            "#gh-sbc > tbody > tr > td:nth-child(3) > ul:nth-child(6) > li a", "Others");

        driver.quit();    

    }
}
