package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class C20ImplicitAndExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        Thread.sleep(3000); //==> Thread Sleep

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //==> Implicit Wait
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xxxxxxx"))); //==>Explicit wait
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("xxxxxxx")))); //==>Explicit wait
        wait.until(ExpectedConditions.titleIs("xxxxxxx")); //==>Explicit wait
        wait.until(ExpectedConditions.urlContains("xxxxxxx")); //==>Explicit wait

        Wait<WebDriver> waitFluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class); //==>Fluent Wait

        WebElement element=waitFluent.until(new Function<WebDriver, WebElement>() {

            @Override
        public WebElement apply(WebDriver webDriver) {
            return driver.findElement(By.id("xxxxxx"));
        }
    });
        WebDriverWait wait1=new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.visibilityOf(element));
    }
}
