package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ResourceBundle;

public class LoginPage extends BasePage {

    String url = baseURL+"login";
    By emailLink = By.name("username");
    By passwordLink = By.name("password");
    By loginButton =By.className("loginbtn");
    private static ResourceBundle rb = ResourceBundle.getBundle("config");


    public LoginPage(WebDriver driver) { super(driver); }
    public void setEmail() throws IOException { super.writeText(emailLink,rb.getString("email")); }
    public void setPassword() throws IOException { super.writeText(passwordLink, rb.getString("password")); }
    public void getLoginButton() { super.click(loginButton); }
    public void goToPage(){
        driver.get(url);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
}
