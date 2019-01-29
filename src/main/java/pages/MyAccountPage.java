package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    By greetingsMessage = By.className("");
    String url = baseURL+"account";


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }


    public String getPageTitle() {
        return driver.getTitle();
    }
    public void goToPage() {
        driver.get(url);
    }
}
