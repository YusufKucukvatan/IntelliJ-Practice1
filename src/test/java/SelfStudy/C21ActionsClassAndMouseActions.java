package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C21ActionsClassAndMouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a=new Actions(driver);
        WebElement element1= driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(element1).build().perform();
        // build: only makes the action ready to perform.
        // perform: makes the real action to bring cursor over the element

        Thread.sleep(3000);


        driver.close();

    }
}
