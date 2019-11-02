package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class C17DropDowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected(),"This button is clicked");
        Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        Select s1=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
        s1.selectByIndex(4);
        Select s2=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
        s2.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[text='Bengaluru (BLR)']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id='Div1']")).click();
        driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[4]/td[6]/a")).click();
        Thread.sleep(1000);

        driver.quit();

    }
}
