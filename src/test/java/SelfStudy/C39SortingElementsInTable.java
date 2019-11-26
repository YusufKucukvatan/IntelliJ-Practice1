package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C39SortingElementsInTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-table/");
        driver.findElement(By.xpath("//a[@target=\"_blank\"][1]")).click();
        WebElement table= driver.findElement(By.className("tsc_table_s13"));
        List<WebElement> list1=table.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr/td[4]"));

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();

        for (int i = 0; i <list1.size() ; i++) {
            list2.add(list1.get(i).getText());
            list3.add(list1.get(i).getText());
        }

        Collections.sort(list3);
        //Collections.reverse(list3); ==> reverse up-side down...
        System.out.println(list2);
        System.out.println(list3);

        Assert.assertTrue(!list2.equals(list3));

        if (!list2.equals(list3)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
        driver.quit();
    }
}
