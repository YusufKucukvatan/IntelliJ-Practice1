package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class C14CheckBoxLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://spicejet.com/");
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //If I choose assertTrue before selecting checkbox, condition will be false and test will stop at that point.
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(), "element is not selected dude...");
        //assertFalse does not affect test because the expectation is already false...
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(), "element is not selected dude...");
        // Mainly Assertion is a double check between expected and actual result. If those are not matching test will quit at that point...
        // We have to import Assert class to use it...
        driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
        driver.findElement(By.cssSelector("select[name='ctl00$mainContent$ddl_Adult']")).click();//Does not work
//      Select s=new Select(driver.findElement(By.id("adult")));
//      s.selectByIndex(4);
//      Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");
//      int checkBoxSize=driver.findElements(By.cssSelector("input[type='checkbox'")).size(); //IOT figure out number of checkboxes
//      System.out.println(checkBoxSize);
        driver.close();

    }
}
