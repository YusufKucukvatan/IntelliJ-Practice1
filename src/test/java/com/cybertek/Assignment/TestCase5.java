package com.cybertek.Assignment;

import com.cybertek.utilities.FailPassContains;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement search=driver.findElement(By.cssSelector(".gh-tb.ui-autocomplete-input"));
        search.sendKeys("iphone 11 pro");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement results= driver.findElement(By.xpath("//h1[@class=\"srp-controls__count-heading\"]/span[1]"));
        System.out.println(results.getText());
        String expected="iphone 11 pro";
        String actual= driver.getTitle();
        FailPassContains.failPass(actual,expected);
        driver.close();
    }
}
