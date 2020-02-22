package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class C16Alerts {
    public static void main(String[] args) throws AWTException {

//         There are two types of alert/pop up in Selenium. Selenium can handle only web based alerts by using Alert class.
//         Other type of alert/pop up is window based. We need use third party tools such as Robot class from Java.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.getText();
        alert.sendKeys("Test");

        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        SoftAssert soft = new SoftAssert();
        soft.assertAll();


    }
}
