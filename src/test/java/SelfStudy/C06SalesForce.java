package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06SalesForce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://login.salesforce.com");
//        driver.findElement(By.id("username")).sendKeys("Hello"); //==> It works but not healthy, instead use xpath
//        driver.findElement(By.name("pw")).sendKeys("12345");     //==> It works but not healthy
//        driver.findElement(By.className("button r4 wide primary")).click(); //Error

        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();


    }
}
