package com.cybertek.tests.d07_typeOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blue= driver.findElement(By.id("blue"));
        WebElement green=driver.findElement(By.id("green"));
        Assert.assertTrue(blue.isEnabled());
        green.click();
        driver.close();


    }
}
