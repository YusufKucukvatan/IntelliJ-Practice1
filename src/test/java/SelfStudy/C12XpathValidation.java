package SelfStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C12XpathValidation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://login.salesforce.com");
        //driver.findElement("//*[@id=\'forgot_password_link\']");

    }
}
