package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C33TableGrid {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22770/nz-vs-eng-5th-t20i-england-tour-of-new-zealand-2019");
        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

        //driver.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
        int rowNum=table.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/div[3]")).size();
        for (int i = 0; i < rowNum-2; i++) {
            System.out.println(table.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/div[3]")).get(i).getText());
        }

    }
}
