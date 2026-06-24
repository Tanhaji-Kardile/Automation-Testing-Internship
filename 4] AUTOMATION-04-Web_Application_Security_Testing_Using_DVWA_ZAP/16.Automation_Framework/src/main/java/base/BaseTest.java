package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initializeDriver();

        driver.get("http://localhost/DVWA/login.php");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {

        return driver;
    }
}