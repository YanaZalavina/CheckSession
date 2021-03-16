package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static waits.Waits.*;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    private static final String BASE_URL = "http://automationpractice.com/index.php";

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "(//img[@title='Faded Short Sleeve T-shirts'])[1]")
    private WebElement tShort;

    public MainPage openMainPage(){
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return this;
    }

    public MainPage clickOntShort(){
        waitToBeClickableForElement(driver, tShort);
        tShort.click();
        return this;
    }
}
