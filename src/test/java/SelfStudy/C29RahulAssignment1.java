package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class C29RahulAssignment1 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement checkButton=driver.findElement(By.cssSelector("#checkBoxOption2"));
        checkButton.click();
        String text=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        System.out.println(text);
        Assert.assertTrue(checkButton.isSelected());

        Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByVisibleText("Option2");

        driver.findElement(By.cssSelector("#name")).sendKeys("Option2");
        driver.findElement(By.id("alertbtn")).click();
        String actual=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        String expected=text;
        if (actual.contains(text)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expectd = " + expected);
        }
        driver.close();
    }
}
