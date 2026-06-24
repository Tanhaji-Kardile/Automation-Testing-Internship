package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SQLInjectionPage;
import testdata.TestData;
import utilities.ConfigReader;

public class SQLInjectionTest extends BaseTest {

    @DataProvider(name = "sqlData")
    public Object[][] sqlData() {

        return TestData.sqlPayloads();
    }

    @Test(dataProvider = "sqlData")
    public void verifySQLInjection(String payload) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        driver.get(
                "http://localhost/DVWA/vulnerabilities/sqli/");

        SQLInjectionPage sqlPage =
                new SQLInjectionPage(driver);

        sqlPage.executePayload(payload);

        Assert.assertTrue(
                sqlPage.getResponseText().length() > 0,
                "No response received");
    }
}