package SelfStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class C02GoogleTestChrome {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        String title1=driver.getTitle();
        Assert.assertEquals(title1,"Google");
        System.out.println(driver.getCurrentUrl()); //validate whether you are in correct page or not...
        //System.out.println(driver.getPageSource());
        driver.get("http://yahoo.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close(); //closes current browser...
        driver.quit(); // It closes all browsers opened by selenium script...



    }
}
//WebDriverManager.chromedriver().setup();
