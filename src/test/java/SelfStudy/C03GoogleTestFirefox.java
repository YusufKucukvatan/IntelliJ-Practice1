package SelfStudy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03GoogleTestFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");

        WebDriver driver=new FirefoxDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
