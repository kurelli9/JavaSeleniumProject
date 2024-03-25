package com.seleniumbase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
    
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
           
           WebDriver driver = new ChromeDriver();
           driver.get("https://the-internet.herokuapp.com/dropdown");
           driver.manage().window().maximize();
           WebElement optionList = driver.findElement(By.cssSelector("#dropdown"));
           Select select = new Select(optionList);
           List<WebElement> options = select.getOptions();
           List<String> givenList = new ArrayList<>();
           for (WebElement element : options) {
            String option = element.getText();
            givenList.add(option);
           }
           select.selectByIndex(2);
    }
}
