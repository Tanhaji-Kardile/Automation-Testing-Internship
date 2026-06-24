package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        Assert.assertTrue(
                driver.getCurrentUrl().contains("index.php"),
                "Login Failed");
    }
}