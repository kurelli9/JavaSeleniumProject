package com.praneeth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumbase.Common;


public class EbayTest {
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
        //driver = getDriver(); 
    }

    

    @Test
    public void ebayValidateWatches() {
        initTest();
        System.out.println("I'm in ebayValidateWatches.  ");
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        By category = By.cssSelector("#gh-shop-a");
        common.clickElement(category);
    }


    @Test
     public void printSearchResults() {
        initTest();
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        By pages = By.cssSelector("ol.pagination__items li a");
        List<WebElement> pagElements = common.getElements(pages);
        for (int page = 1; page <= pagElements.size(); page++) {   
            pagElements = common.getElements(pages);         
            if (page > 3) {
                break;
            }
            
            System.out.println("Search Results from Page " + page + ":");
            List<WebElement> searchResults = driver.findElements(By.className("s-item"));
            System.out.println("Search Results:");
            for (WebElement result : searchResults) {
                System.out.println("======================");
            
                System.out.println(result.getText());
                System.out.println("======================");
            }
            pagElements.get(page).click();
        }
    }

    @Test
    public void printNthProduct() {
        initTest();
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        List<WebElement> searchResults = driver.findElements(By.cssSelector("li.s-item span[role=heading]"));
        if (searchResults.size() == 0) {
            System.out.println("no search results found");

        } else {
            int n = searchResults.size();
            String nth = searchResults.get(n - 1).getText();
            System.out.println("search result is " + nth );
        }
    }


    @Test
    public void printAllProductsFromFirstPage() {
        initTest();
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        List<WebElement> searchResults = driver.findElements(By.cssSelector("#srp-river-results > ul"));
        System.out.println("All Products from First Page:");
        for (WebElement product : searchResults) {
            System.out.println(product.getText());
        }
        
    }


    @Test
    public void printAllProductsWithScroll() {
        initTest();
        By searchBox = By.id("gh-ac");
        common.enterData(searchBox, "Apple Watches");
        common.enterData(searchBox, Keys.ENTER);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]"));
        System.out.println("All Products with Scroll:");
        for (WebElement product : searchResults) {
            System.out.println(product.getText());
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm in after method. ");
        driver.quit();

    }


    public WebDriver getDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        return driver;
        
    }
}
