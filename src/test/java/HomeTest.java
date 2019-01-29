import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void  verifyPageTitle(){
        HomePage homePage =new HomePage(driver);
        homePage.goToPage();
        homePage.getPageTitle();
        Assert.assertEquals(homePage.getPageTitle(),"PHPTRAVELS | Travel Technology Partner");
    }

}
