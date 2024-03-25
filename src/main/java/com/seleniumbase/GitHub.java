package com.seleniumbase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub {
    
    public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\kurel\\OneDrive\\Documents\\PRANEETH\\JAVA Project\\MavenProject\\myfirstmavenproject\\src\\main\\resources\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://github.com/");
       driver.manage().window().maximize();
       WebElement startFreeEnterpriseTrail = driver.findElement(By.xpath("//div[@class='pb-2']//a[contains(text(),'Start a free enterprise trial')]"));
       startFreeEnterpriseTrail.click();
       //List<WebElement> element = driver.findElements(By.cssSelector("a.btn-mktg"));
       //element.get(3).click();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement enterpriseServer = driver.findElement(By.xpath("//h2[text()='Enterprise Server']"));
        
       wait.until(ExpectedConditions.elementToBeClickable(enterpriseServer));
       enterpriseServer.click();
       WebElement nameField = driver.findElement(By.cssSelector("#contact_request_name"));
       nameField.sendKeys("praneeth kurelli");
       nameField.sendKeys(Keys.ENTER);
       WebElement companyField = driver.findElement(By.cssSelector("#contact_request_organization_name"));
       companyField.sendKeys("MVR logistics & co.");
       companyField.sendKeys(Keys.ENTER);
       WebElement emailRequest = driver.findElement(By.cssSelector("#contact_request_email"));
       emailRequest.sendKeys("praneethkumar");
       emailRequest.sendKeys(Keys.ENTER);
       WebElement phoneNumber = driver.findElement(By.cssSelector("#contact_request_phone"));
       phoneNumber.sendKeys("980967454");
       phoneNumber.sendKeys(Keys.ENTER);
       WebElement selectCountry = driver.findElement(By.cssSelector("#contact_request_country"));
       Select select = new Select(selectCountry);
       List<WebElement> options = select.getOptions();
       List<String> optionList = new ArrayList<>();
       for(WebElement element : options) {
        String option = element.getText();
        optionList.add(option);
       }
       select.selectByIndex(5);
       try {
        Thread.sleep(3000);
       } catch (Exception e) {
        e.printStackTrace();
       }
       System.out.println(optionList);
       driver.quit();
    }
}


//wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        
