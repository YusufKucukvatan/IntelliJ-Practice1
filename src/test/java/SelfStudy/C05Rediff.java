package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05Rediff {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://rediff.com");
        driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("jhgkhhgchjckhv");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
    }
}
