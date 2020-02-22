package com.cybertek.tests.d07_typeOfElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class RaidoButtonsTest {
//        @BeforeClass
//        public void preCondition() {
//        }
        WebDriver driver;
        @BeforeMethod
        public void preMethod() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            driver.get("http://practice.cybertekschool.com/radio_buttons");
        }

        @Test(priority = 1)
        public void test1(){
            WebElement blue= driver.findElement(By.id("blue"));
            WebElement red=driver.findElement(By.id("red"));
            SoftAssert soft=new SoftAssert();
            soft.assertTrue(blue.isSelected(), "blue is not selected");
            soft.assertTrue(red.isSelected(), "red is not selected");
            blue.click();
            //red.click();
            Assert.assertTrue(!blue.isSelected(), "blue is not selected");
            Assert.assertFalse(red.isSelected(), "red is selected.");
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("document.getElementsByClassName(ElementLocator).click();");

        }

        @AfterMethod
        public void post(){
            driver.quit();
        }
    }

