package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C24Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        //WebElement target=driver.findElement(By.cssSelector("div#draggable"));
        // target.click(); ==> Selenium could't find the element because it is in a frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //==> We gave the location of the frame by CSS.
        // Now; We told selenium that you are gonna handle a frame and it will be able to find any element in this frame...
        Thread.sleep(2000);
        WebElement source=driver.findElement(By.cssSelector("div#draggable"));
        WebElement target= driver.findElement(By.cssSelector("div#droppable"));
        Actions a=new Actions(driver);
        a.dragAndDrop(source, target).build().perform();


        Thread.sleep(4000);
        driver.close();
    }
}
