package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class C18DropDownsRadioButtons {
    //qaclickacademy.com/practice
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

        WebElement element1=driver.findElement(By.xpath("//input[@value='radio2']"));
        element1.click();
        Assert.assertTrue(element1.isSelected());
        System.out.println(element1.isSelected());
        System.out.println(driver.findElement(By.cssSelector("label[for='radio2']")).getText());
        System.out.println(element1.getAttribute("name"));

        WebElement element2=driver.findElement(By.id("autocomplete"));
        element2.click();
        element2.sendKeys("united");
        for (int i = 0; i < 5; i++) {
            element2.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1000);
        }
        element2.sendKeys(Keys.ENTER);

        WebElement element3=driver.findElement(By.cssSelector("#dropdown-class-example"));
        Select s1=new Select(element3);
        s1.selectByIndex(1);
        Thread.sleep(1000);
        s1.selectByVisibleText("Option2");
        Thread.sleep(1000);
        s1.selectByValue("option3");

        WebElement element4= driver.findElement(By.name("checkBoxOption3"));
        element4.click();
        Assert.assertTrue(element4.isSelected());
        WebElement element5= driver.findElement(By.id("checkBoxOption2"));
        Assert.assertFalse(element5.isSelected());
        Assert.assertTrue(element5.isEnabled());
        Assert.assertTrue(element5.isDisplayed());

        WebElement element6= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend"));
        System.out.println(element6.getText());

        WebElement element7= driver.findElement(By.className("inputs"));
        element7.sendKeys("Yusuf");

        WebElement element8= driver.findElement(By.cssSelector("#alertbtn"));
        element8.click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());  // Switch to Alert
        driver.switchTo().alert().accept();

        Thread.sleep(1000);
        WebElement element9= driver.findElement(By.id("confirmbtn"));
        element9.click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());  //Printing Alert Message
        driver.switchTo().alert().dismiss();

        WebElement element10=driver.findElement(By.id("displayed-text"));
        System.out.println(element10.isDisplayed());
        System.out.println(element10.isEnabled());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(element10.isDisplayed());
        System.out.println(element10.isEnabled());

        Actions action = new Actions(driver);
        WebElement element11 = driver.findElement(By.id("mousehover"));
        action.moveToElement(element11).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mouse-hover-content']/a)[1]")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
