

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Random;

public class BaseTest{
    protected WebDriver driver;

    @BeforeClass
    public void setup(){

        //set property for browser driver
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\drivers\\chromedriver.exe");
        //create chrome instance

        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();

    }

    protected int randomAmount(int min,int max){
        Random random = new Random();
        int amount=0;
        amount = random.nextInt(max - min + 1) + min;
        return amount;
    }
    @AfterClass
    protected void teardown () {
        driver.quit();
    }
}