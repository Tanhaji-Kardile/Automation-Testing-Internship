package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccountOverview() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        HomePage homePage =
                new HomePage(driver);

        homePage.clickAccountsOverview();

        AccountPage accountPage =
                new AccountPage(driver);

        Assert.assertTrue(
                accountPage.isAccountOverviewDisplayed(),
                "Account Overview Page is not displayed");
    }
}