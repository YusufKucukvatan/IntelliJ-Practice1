package com.cybertek.tests.d04_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName= driver.findElement(By.name("full_name"));
        fullName.sendKeys("Cybertek");
        Thread.sleep(1000);
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("cybertek@school.com");
        Thread.sleep(1000);
        WebElement submitButton=driver.findElement(By.name("wooden_spoon"));
        submitButton.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
