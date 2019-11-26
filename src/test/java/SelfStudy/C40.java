package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class C40 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkBox1=driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]"));
        //checkBox1.click();

        Assert.assertFalse(checkBox1.isDisplayed(), "Hamza Abi");
        Assert.assertTrue(checkBox1.isEnabled());
        Assert.assertFalse(checkBox1.isSelected());

        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Alihan NAMLI");

        driver.close();

    }
}
