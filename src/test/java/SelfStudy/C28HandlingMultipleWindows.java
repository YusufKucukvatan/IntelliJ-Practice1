package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C28HandlingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement footer= driver.findElement(By.cssSelector("div[class='navFooterLinkCol navAccessibility']:nth-of-type(1)"));
        List<WebElement> footerLinks=new ArrayList<>(driver.findElements(By.tagName("a")));
        System.out.println(footerLinks.size());

        Actions action = new Actions(driver);

//        for (int i = 0; i < footerLinks.size(); i++) {
//            action.moveToElement(footerLinks.get(i)).keyDown(Keys.COMMAND).click().build().perform();
//            //String openInNewTabCommand=Keys.chord(Keys.COMMAND, Keys.ENTER);
//            //footerLinks.get(i).sendKeys(openInNewTabCommand);
//        }

        Set<String> windows= driver.getWindowHandles();
        Iterator<String> iter=windows.iterator();

        while(iter.hasNext()){
            driver.switchTo().window(iter.next());
            System.out.println("Title: "+driver.getTitle());
            Thread.sleep(2000);
        }



        driver.quit();
    }
}
