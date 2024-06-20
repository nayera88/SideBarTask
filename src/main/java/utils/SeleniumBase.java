package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.configuration.getURL;

public class SeleniumBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
    }
    public void SetupEnvironment(){
        String value= getURL();
        driver.get(value);
    }
}
