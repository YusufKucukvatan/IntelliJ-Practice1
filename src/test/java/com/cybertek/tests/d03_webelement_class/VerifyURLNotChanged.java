package com.cybertek.tests.d03_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLNotChanged {

    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        driver.navigate().to("https://google.com");
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon");
//        Thread.sleep(2000);
//        driver.navigate().back();
        String expectedUrl=driver.getCurrentUrl();
        // WebElement is the class that represents elements from the webpage...
        // .findElement is the method to find elements on the page...
        WebElement emailBox=driver.findElement(By.cssSelector("input[type='text']"));
        Faker faker=new Faker();
        String a=faker.internet().emailAddress();
        emailBox.sendKeys(a);
        Thread.sleep(2000);
        //WebElement retrievePasswordBtn = driver.findElement(By.id("form_submit"));
        //WebElement retrievePasswordBtn = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        retrievePasswordBtn.click();
        Thread.sleep(2000);
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.equalsIgnoreCase(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
