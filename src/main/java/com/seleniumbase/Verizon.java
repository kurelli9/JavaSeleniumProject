package com.seleniumbase;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verizon {
    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       Common common = new Common(driver);
       driver.get("https://www.verizon.com/");
       driver.manage().window().maximize();
       try {
        Thread.sleep(5000);
       } catch (Exception e) {
        // TODO: handle exception
       }
       By dealsButton = By.cssSelector(" a.gnav20-menu-label.gnav20-menu-label-button");
       List<WebElement> deals = common.getElements(dealsButton);
       deals.get(2).click();
       By smartPhone = By.cssSelector("#section_copy div li:nth-child(2) > a");
       common.clickElement(smartPhone);
       By shopNow = By.cssSelector("#section_copy  div.btn-wrap > a");
       List<WebElement> shop = common.getElements(shopNow);
       shop.get(0).click();
       By color = By.cssSelector("#color-swatch-group label:nth-child(1) span");
       common.clickElement(color);
       By storage = By.cssSelector("#\\32 56 > div > label");
       common.clickElement(storage);
       By customer = By.cssSelector("#new > div > label");
       common.clickElement(customer);
       By paymentPlan = By.cssSelector("#\\32 56frp > div > div > label");
       common.clickElement(paymentPlan);
       By nextStepButton = By.cssSelector("#cta-btn div:nth-child(1) button");
       common.clickElement(nextStepButton);
       By pinCode = By.cssSelector("div[class*=Overlay] input[data-testid=zipInput]");
       common.enterData(pinCode, "45840");
       common.enterData(pinCode, Keys.ENTER);
       By cont = By.cssSelector("button[data-testid=zipConfirm]");
       common.clickElement(cont);
       try {
        Thread.sleep(5000);
       } catch (Exception e) {
        // TODO: handle exception
       }
       
       
       
       driver.quit();
    }
}
