package com.cybertek.tests.d02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        String title=driver.getTitle();
        System.out.println("Title is "+title);
        String url=driver.getCurrentUrl();
        System.out.println("Current URL is "+url);
        String pageSource=driver.getPageSource();
        System.out.println("Page source is "+pageSource);


        Thread.sleep(2000);
        driver.quit();
    }
}
