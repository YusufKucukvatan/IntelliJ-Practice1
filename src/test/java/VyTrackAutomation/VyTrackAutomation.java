package VyTrackAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
        WebElement element1=driver.findElement(By.name("_username"));
        element1.sendKeys("storemanager51");
        Thread.sleep(2000);
        WebElement element2=driver.findElement(By.name("_password"));
        element2.sendKeys("UserUser123");
        Thread.sleep(2000);
        element2.sendKeys(Keys.ENTER);
//        WebElement element3= driver.findElement(By.id("_submit"));
//        element3.click();
        String expectedUrl="https://qa2.vytrack.com/";
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }
        Thread.sleep(2000);
        driver.close();
    }
}
