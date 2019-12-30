package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C25DeltaAirLines {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.delta.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id=\"fromAirportName\"]/span[1]")).click();
        driver.findElement(By.cssSelector("input[aria-describedby=\"resultStatus\"]")).clear();
        driver.findElement(By.cssSelector("input[aria-describedby=\"resultStatus\"]")).sendKeys("new");
        Thread.sleep(500);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.cssSelector("input[aria-describedby=\"resultStatus\"]")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1500);
        }
        driver.findElement(By.cssSelector("input[aria-describedby=\"resultStatus\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#toAirportName")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("search_input")).sendKeys("los");
        Thread.sleep(1500);
        driver.findElement(By.id("search_input")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1500);
        driver.findElement(By.id("search_input")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1500);
        driver.findElement(By.id("search_input")).sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.id("selectTripType-val")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("ui-list-selectTripType1")).click();
        Thread.sleep(500);
        driver.findElement(By.id("input_departureDate_1")).click();
        Thread.sleep(500);
        //driver.findElement(By.cssSelector("a[data-date=\"11/21/2019|T, Nov 21|21 November 2019, Thursday\"]")).click();
        driver.findElement(By.cssSelector("a[class=\"dl-state-default\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("passengers-val")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ui-list-passengers1")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("label[for=\"chkFlexDate\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("btn-book-submit")).click();


        Thread.sleep(2000);
        driver.close();
    }
}
