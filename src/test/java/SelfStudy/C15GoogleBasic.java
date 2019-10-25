package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C15GoogleBasic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement btn1=driver.findElement(By.id("gbqfbb"));
        System.out.println(btn1.getAttribute("value"));
        

        Thread.sleep(2000);
        driver.close();
    }
}
