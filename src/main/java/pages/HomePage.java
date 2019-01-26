package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    //*********Page Variables*********

    By myAccountLink = By.xpath("//*[@id=\"li_myaccount\"]/a");
    By loginLink = By.xpath("//*[@id=\"li_myaccount\"]/ul/li[1]/a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void executeMyAccount(){
       List<WebElement> links = driver.findElements(myAccountLink);
        //System.out.println(links.get(1).getText());
        links.get(1).click();
    }

    public void executeLogin(){
        List<WebElement> links = driver.findElements(loginLink);
        //System.out.println(links.get(1).getText());
        links.get(1).click();
    }

    public void goToPage(){
        driver.get(baseURL);
    }

}
