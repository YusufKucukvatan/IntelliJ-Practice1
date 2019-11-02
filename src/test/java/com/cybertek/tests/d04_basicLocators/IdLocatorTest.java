package com.cybertek.tests.d04_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.manage().window().fullscreen();
        //WebElement element1=driver.findElement(By.id("disappearing_button"));
        //WebElement element1=driver.findElement(By.cssSelector("#disappearing_button"));
        WebElement element1=driver.findElement(By.xpath("//button[@onclick='button6()']"));
        String text1=element1.getText();
        System.out.println(text1);
        element1.click();
        Thread.sleep(2000);
        WebElement element2=driver.findElement(By.cssSelector("button[onclick='button3()']"));
        element2.click();
        Thread.sleep(2000);
        driver.close();
    }
}
