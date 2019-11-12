package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPage extends BasePage {

    //String hotelsUrlInMyAccount= "https://www.phptravels.net/m-hotels";
    //By hotelsPage =By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[3]/a");
    private By destinationID = By.id("searchField");
    private By destinationDropdown = By.className("dropdown__list");
    private By checkInDate = By.name("check-in-date");
    private By checkOutDate = By.name("check-out-date");

    private By rooms_configuration = By.name("rooms-configuration");
    private By searchButton = By.xpath("//*[@id=\"homeBox\"]/div[1]/div[1]/div[1]/div/div[3]/button");

    public HotelPage(WebDriver driver) {
        super(driver);
    }

    public void setDestination() {
        super.click(destinationID);
        super.selectDropDown(destinationDropdown, "Oslo (16)");
    }

    public void setCheckInDate() {
        super.datePicker(checkInDate, "tis, 12 nov");
    }

    public void setCheckOutDate() {
        super.datePicker(checkOutDate, "fre, 15 nov");
    }
//    //public void setRooms_configuration()  { super.selectDropDown(rooms_configuration, "1 rum, 1 vuxen");
//        super.sendKeystroke(rooms_configuration, Keys.RETURN);
//    }
    //public void setNumberOfChildren()  { super.writeText(numberOfChildren, "1"); }

    public void getSearchButton() {
        super.click(searchButton);
    }

    public void goToPage() {
        super.driver.get(baseURL);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
