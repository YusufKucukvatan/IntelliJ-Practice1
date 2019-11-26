package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class C26ScreenShot {
    public static <TakeScreenshot> void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        TakesScreenshot scrShot=(TakesScreenshot)driver;
        File scrFile=scrShot.getScreenshotAs(OutputType.FILE );
        FileUtils.copyFile(scrFile, new File("/Users/yusufkucukvatan/Desktop/SS"));
        driver.close();
    }


}
