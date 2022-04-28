package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constants.TimeoutVariable.EXPLICIT_WAIT;
import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver = null;

        switch(PLATFORM_AND_BROWSER){
            case "mac_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;
            case"mac_firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/aleksandrgnuskin/Documents/Tools/Webdriver/Firefox/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }

}
