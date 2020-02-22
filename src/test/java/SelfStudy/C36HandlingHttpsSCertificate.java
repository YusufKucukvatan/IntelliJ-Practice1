package SelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class C36HandlingHttpsSCertificate {
    public static void main(String[] args) {
        //Desired capabilities=> General chrome profile
        DesiredCapabilities dc=DesiredCapabilities.chrome();
        dc.acceptInsecureCerts();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Belows to your local driver
        ChromeOptions options=new ChromeOptions();
        options.merge(dc);

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);

        //ChromeOptions is class and used for setting up our local browser to give it additional capabilities
        // such as accepting insecure or SSL certificates...
    }
}
