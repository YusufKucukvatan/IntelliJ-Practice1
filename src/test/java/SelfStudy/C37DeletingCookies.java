package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C37DeletingCookies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("asdf"); //==> Deletes a specific cookie.
        //driver.manage().addCookie(); ==> We do not use as tester...

        driver.close();
    }
}
