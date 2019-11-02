package com.cybertek.tests.d04_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("123");
        Thread.sleep(1000);
        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("cybertek@schhol.com");
        Thread.sleep(1000);
        WebElement submitButton= driver.findElement(By.className("radius"));
        submitButton.click();
        Thread.sleep(2000);
        WebElement mainMenu= driver.findElement(By.tagName("a"));
        mainMenu.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
