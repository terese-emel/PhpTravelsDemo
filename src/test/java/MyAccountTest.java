import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;

public class MyAccountTest extends BaseTest {

    @Test(priority = 0)
    public void  verifyPageTitleWithoutLogin(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.goToPage();
        myAccountPage.getPageTitle();
        Assert.assertEquals(myAccountPage.getPageTitle(),"Login");
    }

    @Test(priority = 1)
    public void  verifyPageTitleWithLogin() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        LoginPage loginPage=new LoginPage(driver);
        myAccountPage.goToPage();
        Assert.assertEquals(myAccountPage.getPageTitle(),"Login");
        loginPage.setEmail();
        loginPage.setPassword();
        loginPage.getLoginButton();
        myAccountPage.goToPage();
        Assert.assertEquals(myAccountPage.getPageTitle(),"My Account");
    }

}
