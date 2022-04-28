package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constants.Urls.REAL_HOME_PAGE;
    public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing(){
        basePage.open(REAL_HOME_PAGE);
        realHomePage
                .enterCountRooms()
                .clickToFind();
        realtListingPage.checkCountCards();
    }
}
