package tests;

import driver.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ConfigTests {
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver(){
        driver = DriverSetUp.getDriver();
    }

    @AfterMethod
    public void closeDriver(){
        DriverSetUp.closeDriver();
    }

}
