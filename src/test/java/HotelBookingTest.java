import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelPage;

public class HotelBookingTest extends BaseTest {

    @Test
    public void verifyPageTitle() {

        HotelPage hotelPage = new HotelPage(driver);
        hotelPage.goToPage();
        hotelPage.getPageTitle();
        Assert.assertEquals(hotelPage.getPageTitle(), "Nordic Choice Hotels - över 200 hotell i hela Norden");

        try {
            hotelPage.goToPage();
            hotelPage.setDestination();
            hotelPage.setCheckInDate();
            hotelPage.setCheckOutDate();
            hotelPage.getSearchButton();

            Assert.assertEquals(hotelPage.getPageTitle(), "Hotell i Oslo - Boka nu | Nordic Choice Hotels");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
