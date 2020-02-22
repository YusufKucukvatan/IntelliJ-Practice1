package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C13TakingErrorMessageToConsole {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("jhknhbvj");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

        driver.close();
    }
}
