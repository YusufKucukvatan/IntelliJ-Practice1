package com.cybertek.Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        List<WebElement> elements=driver.findElements(By.cssSelector("li.list-group-item"));
        System.out.println(elements.size());

        if (elements.size()==48){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("actual result = " + elements.size());
            System.out.println("expected result= " + 48);
        }


        Thread.sleep(2000);
        driver.close();
    }
}
