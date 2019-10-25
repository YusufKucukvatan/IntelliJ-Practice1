package com.cybertek.tests.d02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver= WebDriverFactory.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Magnesium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(2000);
        driver.close();

    }

}
