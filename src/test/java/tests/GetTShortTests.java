package tests;

import pages.CartPage;
import pages.GoodsPage;
import pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductAddedPage;

public class GetTShortTests extends ConfigTests {
    String totalCost="";
    String price = "";

    @Test
    public void gerPriceOftShort() {
      new MainPage(driver)
                .openMainPage()
                .clickOntShort();
       new GoodsPage(driver)
               .openGoodsPage()
               .clickOnAddToCartButton();
        new ProductAddedPage(driver)
               .openProductAddedPageMainPage()
                .clickOnProceedButton();
        totalCost = new CartPage(driver)
                .openCartPage()
                .getTotalCost();
        price = new CartPage(driver)
                .openCartPage()
                .getPriceForItem();

        Assert.assertTrue(totalCost.equalsIgnoreCase(price));
    }
}
