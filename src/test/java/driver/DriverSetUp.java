package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (null == driver){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        if(!(null==driver)){
            driver.quit();
            driver=null;
        }
    }

}
