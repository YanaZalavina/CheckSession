package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CartPage {
    private WebDriver driver;
    ArrayList<String> prices = new ArrayList<String>();

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//td[contains(text(), 'Total products')]/following-sibling::td[@class='price']")
    private WebElement totalCostField;
    @FindBy(xpath = "//td[@class='cart_unit']/span/span")
    private WebElement priceForItem;

    public CartPage openCartPage(){
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public String getTotalCost(){
        return totalCostField.getText().trim();
    }

    public String getPriceForItem(){
        return priceForItem.getText().trim();
    }

}
