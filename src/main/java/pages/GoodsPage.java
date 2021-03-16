package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static waits.Waits.waitToBeVisibleForElement;

public class GoodsPage {
    private WebDriver driver;
    private String iframe = "//iframe[contains(@id,'fancybox-frame')]";

    public GoodsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//p[@id='add_to_cart']")
    private WebElement addToCartButton;

    public GoodsPage openGoodsPage(){
        driver.switchTo().frame(driver.findElement(By.xpath(iframe)));
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GoodsPage clickOnAddToCartButton(){
       waitToBeVisibleForElement(driver, addToCartButton);
        addToCartButton.click();
        return this;
    }
}
