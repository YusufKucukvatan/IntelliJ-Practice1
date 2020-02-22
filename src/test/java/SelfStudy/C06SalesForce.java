package SelfStudy;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06SalesForce {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://login.salesforce.com");
//        driver.findElement(By.id("username")).sendKeys("Hello"); //==> It works but not healthy, instead use xpath
//        driver.findElement(By.name("pw")).sendKeys("12345");     //==> It works but not healthy
//        driver.findElement(By.className("button r4 wide primary")).click(); //Error
        Thread.sleep(2000);
        Dimension d = new Dimension(480,620);
        driver.manage().window().setSize(d);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\'Login\']")).getLocation());


    }
}
