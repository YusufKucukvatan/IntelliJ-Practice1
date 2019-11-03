package com.cybertek.Assignment;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver= WebDriverFactory.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element1 = driver.findElement(By.linkText("Sign Up For Mailing List"));
        Thread.sleep(2000);
        element1.click();
        Thread.sleep(2000);
        Faker faker=new Faker();
        String name=faker.name().fullName();
        String email=faker.internet().emailAddress();
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(email);
        WebElement signUp = driver.findElement(By.cssSelector(".radius"));
        System.out.println(signUp.isDisplayed());
        System.out.println(signUp.isEnabled());
        Assert.assertTrue(signUp.isDisplayed());
        Assert.assertTrue(signUp.isEnabled());
        Thread.sleep(2000);
        signUp.click();
        Thread.sleep(2000);

        String expected="Thank you for signing up. Click the button below to return to the home page.";
        String actual= driver.findElement(By.cssSelector("h3.subheader")).getText();

        if (expected.equals(actual)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }


        driver.quit();
    }
}
