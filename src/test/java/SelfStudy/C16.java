package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C16 {
    public static void main(String[] args) {
        WebDriver driver=new WebDriverFactory().getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchButton = driver.findElement(By.xpath(""));

    }
}
