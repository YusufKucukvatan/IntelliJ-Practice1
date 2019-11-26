package SelfStudy;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class C38ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.get("http://google.com");

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/yusufkucukvatan/Desktop/Screen Shots://GoogleScreenshot.png"));

        driver.close();
    }
}
