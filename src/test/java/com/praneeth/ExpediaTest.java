package com.praneeth;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumbase.Common;

public class ExpediaTest {

    WebDriver driver;
    
    Common common;
            public void initTest() {
                System.out.println("I'm a constructor.");
                driver = getDriver();
                common = new Common(driver);
            }
    

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm in before method. ");
    }

    @Test
    public void expediaSearch() {
        initTest();
        By searchButton = By.cssSelector("#lodging_search_form button[class*=uitk-form-field]");
        List<WebElement> buttons = common.getElements(searchButton);
        buttons.get(0).click();
        By anotherSearch = By.cssSelector("#destination_form_field");
        common.enterData(anotherSearch, "colorado");
        common.enterData(anotherSearch, Keys.ENTER);
        By dates = By.cssSelector("#lodging_search_form > div > div > div:nth-child(2) > div > div.uitk-layout-flex.uitk-layout-flex-flex-direction-row.uitk-layout-flex-gap-three > div > div > button");
        common.clickElement(dates);
        By dateStart = By.cssSelector("tr:nth-child(5) > td:nth-child(2)");
        List <WebElement> date = common.getElements(dateStart);
        date.get(0).click();
        By dateEnd = By.cssSelector(" tr:nth-child(5) > td:nth-child(4) > div");
        List <WebElement> endDate = common.getElements(dateEnd);
        endDate.get(0).click();
        By searchOptButton = By.cssSelector("#search_button");
        common.clickElement(searchOptButton);
        By keyValues = By.cssSelector("a[data-stid='open-hotel-information']");
        List <WebElement> valueKey = driver.findElements(keyValues);
        HashMap<String, String> expedia = new HashMap<>();
        for(WebElement key : valueKey) {
            key.click();
            
            String currentHandle= driver.getWindowHandle();
            Set<String> handles=driver.getWindowHandles();
            for(String actual: handles) {
                if(!actual.equalsIgnoreCase(currentHandle)) {
                    //Switch to the opened tab
                    driver.switchTo().window(actual);
                }
            }
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            By price = By.cssSelector("div[data-test-id='price-summary'] span div");
            List <WebElement> pricevalue = driver.findElements(price);
            String firstPrice = pricevalue.get(0).getText();

            
            By hotelName = By.cssSelector("div h1");
            List <WebElement> nameHotel = driver.findElements(hotelName);
            String hotel = nameHotel.get(1).getText();

            expedia.put(hotel, firstPrice);
            driver.close();
            driver.switchTo().window(currentHandle);
        }
        System.out.println("Hotel results" + expedia);
    }
    

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm in after method. ");
        

    }


    public WebDriver getDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
        driver.manage().window().maximize();
        return driver;
        
    }
    
}
