package com.cybertek.Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("123");

        String expected1="first name can only consist of alphabetical letters";
        String actual1= driver.findElement(By.cssSelector("small[data-bv-for=\"firstname\"][data-bv-validator=\"regexp\"]")).getText();

        if (actual1.equals(expected1)){
            System.out.println("TEST-1 PASS");
        }
        else{
            System.out.println("TEST-1 FAIL");
            System.out.println("actual = " + actual1);
            System.out.println("expected = " + expected1);
        }
        Assert.assertFalse(driver.findElement(By.cssSelector("small[data-bv-for=\"lastname\"][data-bv-validator=\"regexp\"]")).isDisplayed());
        driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("123");
        Assert.assertTrue(driver.findElement(By.cssSelector("small[data-bv-for=\"lastname\"][data-bv-validator=\"regexp\"]")).isDisplayed());
        String expected2="The last name can only consist of alphabetical letters and dash";
        String actual2= driver.findElement(By.cssSelector("small[data-bv-for=\"lastname\"][data-bv-validator=\"regexp\"]")).getText();
        if (actual2.equals(expected2)){
            System.out.println("TEST-2 PASS");
        }
        else{
            System.out.println("TEST-2 FAIL");
            System.out.println("actual = " + actual2);
            System.out.println("expected = " + expected2);
        }

        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("user");
        String expected3="The username must be more than 6 and less than 30 characters long";
        String actual3= driver.findElement(By.cssSelector("small[data-bv-for=\"username\"][data-bv-validator=\"stringLength\"]")).getText();
        if (actual3.equals(expected3)){
            System.out.println("TEST-3 PASS");
        }
        else{
            System.out.println("TEST-3 FAIL");
            System.out.println("actual = " + actual3);
            System.out.println("expected = " + expected3);
        }
        
        driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("testers@email");
        String expected4="email address is not a valid\nEmail format is not correct";
        String actual4= driver.findElement(By.cssSelector("small[data-bv-for=\"email\"][data-bv-validator=\"emailAddress\"]")).getText()+"\n"+driver.findElement(By.cssSelector("small[data-bv-for=\"email\"][data-bv-validator=\"regexp\"]")).getText();
        if (actual4.equals(expected4)){
            System.out.println("TEST-4 PASS");
        }
        else{
            System.out.println("TEST-4 FAIL");
            System.out.println("actual = " + actual4);
            System.out.println("expected = " + expected4);
        }

        driver.findElement(By.cssSelector("input[type=\"tel\"]")).sendKeys("5711234354");
        String expected5="Phone format is not correct";
        String actual5= driver.findElement(By.cssSelector("small[data-bv-for=\"phone\"][data-bv-validator=\"regexp\"]")).getText();
        if (actual5.equals(expected5)){
            System.out.println("TEST-5 PASS");
        }
        else{
            System.out.println("TEST-5 FAIL");
            System.out.println("actual = " + actual5);
            System.out.println("expected = " + expected5);
        }

        Thread.sleep(2000);
        driver.close();


    }
}
