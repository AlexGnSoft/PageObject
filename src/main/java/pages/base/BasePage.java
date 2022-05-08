package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static constants.Constants.TimeoutVariable.EXPLICIT_WAIT;


public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);

        if(!driver.getTitle().equals("REALT.BY: Недвижимость, коммерческая недвижимость в Минске и Беларуси")){
            throw new IllegalStateException("You're not at realt.by website. The current page is " + driver.getCurrentUrl())
        }
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
