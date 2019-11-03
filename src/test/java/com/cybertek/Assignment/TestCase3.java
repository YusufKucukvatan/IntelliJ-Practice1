package com.cybertek.Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.cssSelector("button[onclick=\"button1()\"]")).click();
        String expected="Clicked on button one!";
        String actaul= driver.findElement(By.cssSelector("#result")).getText();
        if (actaul.equals(expected)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("actaul = " + actaul);
            System.out.println("expected = " + expected);
        }

    }
}
