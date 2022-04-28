package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import static constants.Constants.ItemNumbers.NUMBER_OF_ITEMS_ON_THE_PAGE;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By cart = By.xpath("//div[@class='listing view-format']/div[contains(@class,'highlighted')]");

    public RealtListingPage checkCountCards(){
        int countCart = driver.findElements(cart).size();
        Assert.assertEquals(countCart, NUMBER_OF_ITEMS_ON_THE_PAGE);

        return this;
    }

}
