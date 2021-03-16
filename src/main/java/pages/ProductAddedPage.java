package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ProductAddedPage {
    private WebDriver driver;

    public ProductAddedPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(@class, 'btn-default button button-medium')]")
    private WebElement proceedButton;
    @FindBy(xpath = "//span[@class= 'ajax_block_cart_total']")
    private WebElement totalCostField;

    public ProductAddedPage openProductAddedPageMainPage(){
        ArrayList<String> winHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(winHandles.get(winHandles.size()-1));
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public void clickOnProceedButton(){
        proceedButton.click();
    }

}
