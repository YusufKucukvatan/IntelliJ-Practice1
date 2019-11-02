package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C16 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://login.salesforce.com");
        driver.findElement(By.name("username")).sendKeys("yusuf");
        driver.findElement(By.id("password")).sendKeys("123345");
        driver.findElement(By.cssSelector("#Login")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());

        Thread.sleep(2000);
        driver.close();
    }
}
