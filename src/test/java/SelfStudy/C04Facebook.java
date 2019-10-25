package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04Facebook {
   //static WebDriver driver=new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code:)");
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.linkText("Forgot account?")).click();
        
    }
}
