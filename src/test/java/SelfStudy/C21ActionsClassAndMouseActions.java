package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class C21ActionsClassAndMouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions act=new Actions(driver);
        WebElement element1= driver.findElement(By.id("nav-link-accountList"));
        act.moveToElement(element1).build().perform(); //==> Hover over element
        act.moveToElement(element1).click().build().perform();
        act.moveToElement(element1).doubleClick().build().perform();
        act.moveToElement(element1).contextClick().build().perform();
        act.moveToElement(element1).clickAndHold().build().perform();
        act.moveToElement(element1).release().build().perform();


        // build: only makes the action ready to perform.
        // perform: executes the action

        Thread.sleep(4000);
        driver.close();

    }
}
