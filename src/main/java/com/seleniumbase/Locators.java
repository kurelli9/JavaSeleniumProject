package com.seleniumbase;

import org.openqa.selenium.By;

public class Locators {
    
    public By lastRowEdit () {
        return By.cssSelector(" tr:nth-child(10)  td:nth-child(7)  a:nth-child(1)");
    }

    public By lastRowDelete () {
        return By.cssSelector(" tr:nth-child(10) td:nth-child(7) a:nth-child(2)");      
    }

    public By firstRowEdit () {
        return By.cssSelector(" tr:nth-child(10)  td:nth-child(7)  a:nth-child(1)");
    }

    public By firstRowDelete () {
        return By.cssSelector(" tr:nth-child(10) td:nth-child(7) a:nth-child(2)");
    }

    //EbayLocators

    
}
