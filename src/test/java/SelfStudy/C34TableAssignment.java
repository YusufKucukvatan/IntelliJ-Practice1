package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class C34TableAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");

        WebElement table=driver.findElement(By.id("product"));

        int rowCount=table.findElements(By.tagName("tr")).size();
        System.out.println(rowCount);

        int columnCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
        System.out.println(columnCount);

        ArrayList<WebElement> rows=new ArrayList<>(table.findElements(By.xpath("//table[@id='product']/tbody/tr[3]")));

        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }
        driver.close();
    }
}
