package com.cybertek.tests.d03_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedUrl = driver.getCurrentUrl();
        WebElement emailInput = driver.findElement(By.name("email"));
        Faker faker=new Faker();
        String a=faker.internet().emailAddress();
        emailInput.sendKeys(a);
        Thread.sleep(2000);
        driver.findElement(By.id("form_submit")).click();
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl==actualUrl){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        }

        driver.close();
    }
}
