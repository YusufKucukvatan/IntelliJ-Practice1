package com.cybertek.tests.d02_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String source=driver.getPageSource();
        System.out.println(source);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sadfcsd");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123345");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        Thread.sleep(2000);
        //driver.close();

    }
}
