package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09CustomizedXPathsFromHTMLAttributes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kjbj");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }
}
//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
//input[@value='Log In']
//input[@type='email']