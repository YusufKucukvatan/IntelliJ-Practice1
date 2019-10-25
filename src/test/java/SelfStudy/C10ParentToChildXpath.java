package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C10ParentToChildXpath {
    public static void main(String[] args) {

    }
    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("mirliva buca");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"));
    }
        @Test   public void test2(){



            System.setProperty("webdriver.chrome.driver", "/Users/yusufkucukvatan/Selenium/ChromeDriver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://google.com");
            driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("mirliva buca");
            WebElement signIn = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"));

        }
}