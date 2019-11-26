package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C30GroupStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement radioButton=driver.findElement(By.xpath("//input[@name='radioButton'][@value='radio3']"));
        radioButton.click();

        WebElement element2= driver.findElement(By.cssSelector("input[id=\"autocomplete\"]"));
        element2.sendKeys("uni");
        for (int i = 0; i < 6; i++) {
        element2.sendKeys(Keys.ARROW_DOWN);
        }
        element2.sendKeys(Keys.ENTER);


        Thread.sleep(3000);



        driver.close();
    }
}
