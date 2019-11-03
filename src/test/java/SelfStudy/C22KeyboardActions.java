package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C22KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a=new Actions(driver);
        WebElement element1= driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(element1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //Once we declare any statement with Actions class, we have to use .build the end of statement to make it ready to use...
        //.perform==> initiates the actions

        WebElement element2= driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(element2).contextClick().build().perform(); // contextClick()==> Right Click
        a.moveToElement(element2).doubleClick().build().perform();
        a.moveToElement(element2).click().sendKeys(Keys.COMMAND).build().perform(); //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().sendKeys(Keys.ENTER).build().perform(); //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().sendKeys(Keys.ARROW_DOWN).build().perform(); //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().sendKeys(Keys.F6).build().perform(); //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().keyDown(Keys.COMMAND).build().perform(); //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().keyDown(Keys.ENTER).build().perform();   //keyDown==>Holds any key pressed
        a.moveToElement(element2).click().keyDown(Keys.RETURN).build().perform();
        a.moveToElement(element2).click().keyDown(Keys.TAB).build().perform();
        a.moveToElement(element2).clickAndHold().build().perform();
        a.moveToElement(element2).dragAndDrop(element1,element2).build().perform(); // element1:source element2:target
        a.moveToElement(element2).release().build().perform(); // release
        // Actions is almost the same as human manual use of mouse and keyboard...


        Thread.sleep(3000);


        driver.close();

    }
}
