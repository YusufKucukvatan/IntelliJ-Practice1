package VyTrackAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class VyTrackNegativeScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //WebDriverManager.chromeDriver().setup();
        //WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement userName= driver.findElement(By.cssSelector("#prependedInput"));
        userName.sendKeys("Invalid User");
        Thread.sleep(2000);
        //userName.sendKeys(Keys.TAB);

        WebElement password= driver.findElement(By.id("prependedInput2"));
        password.sendKeys("Invalid Password");
        Thread.sleep(2000);

        password.sendKeys(Keys.ENTER);
        //driver.findElement(By.id("_submit")).click();

        String expected="Invalid user name or password.";
        String actual= driver.findElement(By.xpath("//form[@id=\"login-form\"]/fieldset/div/div[1]")).getText().trim();

        if (actual.equals(expected)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }

        Thread.sleep(2000);
        driver.close();
    }
}
