package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utilities.CSVReaderUtil;

public class LoginTest extends BaseClass {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return CSVReaderUtil.getCSVData(
                "src/test/resources/LoginData.csv");
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username,
                            String password,
                            String expectedResult) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username, password);

        boolean loginSuccess =
                loginPage.isLoginSuccessful();

        boolean errorDisplayed =
                loginPage.isErrorDisplayed();

        if (expectedResult.equalsIgnoreCase("Valid")) {

            Assert.assertTrue(
                    loginSuccess,
                    "Expected successful login for user: "
                            + username);

        } else {

            Assert.assertTrue(
                    errorDisplayed,
                    "Expected login failure for user: "
                            + username);
        }
    }
}