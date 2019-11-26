package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class C27OpenWindowsInDifferentTabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement footerFirstColumnDriver= driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        ArrayList<WebElement> links=new ArrayList<>(footerFirstColumnDriver.findElements(By.tagName("a")));
        System.out.println(links.size());
        System.out.println(links);
        Actions action = new Actions(driver);
        for (int i = 1; i < links.size(); i++) {
            action.moveToElement(links.get(i)).keyDown(Keys.COMMAND).click().build().perform();
            //String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
            //links.get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(1000);
        }
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> iter=windows.iterator();
        while (iter.hasNext()){
            driver.switchTo().window(iter.next());
            System.out.print("Title: ");
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
            driver.close();
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
