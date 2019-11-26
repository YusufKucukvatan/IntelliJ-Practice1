package com.cybertek.Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.cssSelector("button[class=\"pure-button pure-button-primary-progressive\"]")).submit();
        driver.findElement(By.cssSelector("a[title=\"Selenium (software)\"]")).click();
        String actual=driver.getCurrentUrl();
        String expected="Selenium_(software)";
        if(actual.endsWith(expected)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
        driver.close();

    }
}
