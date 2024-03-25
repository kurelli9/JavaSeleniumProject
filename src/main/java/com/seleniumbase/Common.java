package com.seleniumbase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    WebDriver driver = null;
    public Common (WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();

    } 

    public String getText(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String text = element.getText();
        return text;

    }

    public void enterData(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        boolean flag = element.isEnabled();
        if (flag) {
            element.sendKeys(text);
        } else {
            System.out.println("field is disabled");
        }
        
    }

    public void waitForElementEnabled(final WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until((ExpectedCondition<Boolean>) driver -> element.isEnabled());
        } catch (Exception e) {
                System.out.println(e + " : " + "Timed out waiting for element: " + element);
        }
    }

    public boolean isDisplayed(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        boolean flag = element.isDisplayed();
        if (flag) {
            return true;
        } else {
            return false;
        }
    }

    public void enterData(By locator, Keys keys ) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        boolean flag = element.isEnabled();
        if (flag) {
            element.sendKeys(keys);
        } else {
            System.out.println("field is disabled");
        }
    }


    public void validateCategories(String catLoc, String subCatLoc, String category) {
        
        By motors = By.cssSelector(catLoc);

        Map<String, List<String>> motorsCategory = new HashMap<String, List<String>>();

        List<String> motorsCategories = new ArrayList<>();
        List<WebElement> categoryList = driver.findElements(By.cssSelector(subCatLoc));
        
        for(WebElement list1: categoryList) {
            String cat = list1.getText();
            motorsCategories.add(cat);
        }

        String data = getText(motors);

        motorsCategory.put(data, motorsCategories);

        System.out.println(category + " " + motorsCategory);
    }



    public List<WebElement> getElements (By locator) {
        return driver.findElements(locator);
        
    }
}
