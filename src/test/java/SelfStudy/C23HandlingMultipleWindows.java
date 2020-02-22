package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class C23HandlingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://xxxxxxxxx");
        WebElement element1= driver.findElement(By.id("yyyyyyyyyyyy"));
        element1.click();

        Set<String> set=driver.getWindowHandles(); // returns the name of opened windows by driver

        Iterator<String> iter=set.iterator();      // It is a kind of id collector for windows
        ArrayList<String> windows=new ArrayList<>(); // We will add the names of windows to this ArrayList by using iter.next() in while loop

        while (iter.hasNext()){
            windows.add(iter.next());
        }
        driver.switchTo().window(windows.get(0));
        driver.switchTo().window(windows.get(1));
        driver.switchTo().window(windows.get(2));
        driver.switchTo().window(windows.get(3));

        Thread.sleep(3000);

        driver.close();
    }
}
