package SelfStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01Cybertek {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://cybertekschool.com");
        System.out.println(driver.getTitle());
    }
}
