package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    String baseURL = "https://www.nordicchoicehotels.se/";
    InputStream inputStream;
    /* This is how to declare HashMap */
    HashMap<String, String> userInfo = new HashMap<>();
    private WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void selectDropDown(By elementBy, String textToSelect) {
//        Select dropdown = new Select(driver.findElement(elementBy));
//        dropdown.selectByVisibleText(textToSelect);

        WebElement dropdown = driver.findElement(elementBy);
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        List<WebElement> options = dropdown.findElements(By.tagName("li"));
        //System.out.println(options);
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().contains(textToSelect)) {
                option.click();
                break;
            }

        }

    }

    //Wait Wrapper Method
    protected void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    protected void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    protected void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        //driver.findElement(elementBy).clear();
        //System.out.println(text);
        driver.findElement(elementBy).sendKeys(text);
    }

    //select date
    protected void datePicker(By elementBy, String text) {
        WebElement dateWidget = driver.findElement(elementBy);
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

        for (WebElement cell : columns) {
            //Select Date
            if (cell.getText().equals(text)) {
                cell.findElement(By.linkText(text)).click();
                break;
            }
        }
    }

    //Send Keystroke
    protected void sendKeystroke(By elementBy, Keys key) {
        waitVisibility(elementBy);
        //driver.findElement(elementBy).clear();
        //System.out.println(text);
        driver.findElement(elementBy).sendKeys(key);
    }


    //Read Text
    protected String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    protected void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);

    }

    public void refresh() {
        driver.navigate().refresh();
    }


    protected List<WebElement> getTableRows(By elementBy) {
        // Get all the table row elements from the table
        WebElement tableElement = driver.findElement(elementBy);

        // And iterate over them and get all the cells
        return tableElement.findElements(By.tagName("tr"));
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void goToPage() {
        driver.get(baseURL);
    }
}
