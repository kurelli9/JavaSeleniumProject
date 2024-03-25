package com.seleniumbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://login.yahoo.com/");
       driver.manage().window().maximize();
        WebElement staySignedIn = driver.findElement(By.id("persistent"));
        staySignedIn.click();
        WebElement createAccountButton = driver.findElement(By.cssSelector("#createacc"));
        createAccountButton.click();

        WebElement monthSelector = driver.findElement((By.cssSelector("#usernamereg-month")));

        Select select = new Select(monthSelector);

        List<WebElement> options = select.getOptions(); // 13 Options
        List<String> optionList = new ArrayList<>();
        
        for(WebElement element : options) {
        String option = element.getText();
            optionList.add(option);
        }

        select.selectByIndex(4);

        select.selectByValue("5");

        select.selectByVisibleText("July");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        
        System.out.println(Arrays.asList(optionList));

        driver.quit();
    }
}
