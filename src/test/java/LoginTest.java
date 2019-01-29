import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test(priority = 0)
    public void  verifyPageTitle(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.goToPage();
        loginPage.getPageTitle();
        Assert.assertEquals(loginPage.getPageTitle(),"Login");
    }

    @Test(priority = 1)
    public void LoginWithCredentials() throws IOException {
        LoginPage loginPage =new LoginPage(driver);
        loginPage.goToPage();
        loginPage.setEmail();
        loginPage.setPassword();
        loginPage.getLoginButton();
    }
}
