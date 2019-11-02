package com.cybertek.tests.d04_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(1000);
        WebElement homeButton= driver.findElement(By.className("nav-link"));
        homeButton.click();
        Thread.sleep(1000);
        WebElement multipleButtons= driver.findElement(By.linkText("Multiple Buttons"));
        multipleButtons.click();
        Thread.sleep(2000);
        WebElement button3= driver.findElement(By.xpath("//div[@class='container']/button[3]"));
        System.out.println(button3.getText());
        System.out.println(button3.getSize());
        System.out.println(button3.getAttribute(" "));
        System.out.println(button3.getTagName());
        button3.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
