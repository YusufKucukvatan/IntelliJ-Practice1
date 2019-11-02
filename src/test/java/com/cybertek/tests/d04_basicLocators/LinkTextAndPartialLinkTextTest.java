package com.cybertek.tests.d04_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link= driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());
        WebElement linkPartial= driver.findElement(By.partialLinkText("6: Loading"));
        System.out.println(linkPartial.getText());
        Thread.sleep(2000);
        driver.quit();

    }
}
