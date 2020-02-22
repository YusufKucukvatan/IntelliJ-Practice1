package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;

public class C35JavacsriptFindingHiddenElements {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do");
        WebElement from=driver.findElement(By.id("fromPlaceName"));
        from.sendKeys("BENG");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ARROW_DOWN);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="return document.getElementById(\"fromPlaceName\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
        // In this test script there is a hidden element in window.
        // Java cannot extract hidden elements.
        // We have to use JavaScript HTML DOM(Document Object Model) to extract hidden elements.
        //https://www.w3schools.com/js/js_htmldom_document.asp ==> You may find all the methods here about DOM




    }
}
