package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class C19AddToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        WebDriverWait wait=new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        ArrayList<String> itemsNeeded=new ArrayList<>(Arrays.asList("Brocolli", "Cucumber", "Carrot", "Tomato"));

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        //ArrayList<WebElement> p=new ArrayList<>(driver.findElements(By.cssSelector("h4.product-name"))); ==> both work, list or arrayList
        //System.out.println(p.size());
        System.out.println(products.size());

        int count=0;
        for (int i = 0; i < products.size(); i++) {
            String item=products.get(i).getText().substring(0,products.get(i).getText().indexOf(" "));
            if(itemsNeeded.contains(item)){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']")));
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                Thread.sleep(4000);
                count++;
                if(count==4){
                    break;
                }
            }
        }
        WebElement goToCart=driver.findElement(By.cssSelector("img[alt='Cart']"));
        goToCart.click();
        Thread.sleep(2000);
        WebElement proceedCheckOut= driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
        proceedCheckOut.click();
        Thread.sleep(2000);
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".promoBtn")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("promoInfo"))));
        //Thread.sleep(2000);
        WebElement placeOrder= driver.findElement(By.xpath("//button[text()='Place Order']"));
        Thread.sleep(2000);
        placeOrder.click();
        Thread.sleep(2000);
        Select s=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")));
        s.selectByVisibleText("United States");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
