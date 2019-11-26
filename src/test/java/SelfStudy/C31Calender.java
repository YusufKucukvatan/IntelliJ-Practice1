package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C31Calender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.path2usa.com/travel-companions");

        driver.findElement(By.id("travel_date")).click();
        WebElement month=driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]/table/thead/tr[1]/th[2]"));
        String monthText=month.getText();
        System.out.println(monthText);

        while(!monthText.contains("April 2020")){
            WebElement nextButton= driver.findElement(By.cssSelector("div[class=\"datepicker-days\"] th[class='next']"));
            nextButton.click();
            monthText=month.getText();
            Thread.sleep(1000);
        }
        System.out.println(monthText);

        List<WebElement> dates=driver.findElements(By.className("day"));
        System.out.println(dates.size());

        for (int i = 0; i < dates.size(); i++) {
            String text=dates.get(i).getText();
            if(text.equals("30") && dates.get(i).getAttribute("class").equals("day")){
                dates.get(i).click();
                break;
            }
        }
    }
}
