package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class C23HandlingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://xxxxxxxxx");
        WebElement element1= driver.findElement(By.id("yyyyyyyyyyyy"));
        element1.click();
        Set<String> s=driver.getWindowHandles(); // returns the number of opened windows by driver
        Iterator<String> iterator=s.iterator();  // It is a kind of id collector for windows
        String parentID=iterator.next();         // Gets oldest window's ID
        String childID=iterator.next();          // Gets newest window's ID
        driver.switchTo().window(childID);       // Switches from oldest window to childID window
        driver.switchTo().window(parentID);


        Thread.sleep(3000);


        driver.close();
    }
}
