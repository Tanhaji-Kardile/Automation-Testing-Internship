package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import testdata.TestData;
import utils.ExcelReader;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return ExcelReader.getExcelData(
                TestData.LOGIN_DATA,
                "Login");
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username,
                            String password) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username, password);

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("overview"),
                "Login Failed - Account Overview Page Not Displayed");
    }
}