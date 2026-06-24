package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.XSSPage;
import testdata.TestData;
import utilities.ConfigReader;

public class XSSTest extends BaseTest {

    @DataProvider(name = "xssData")
    public Object[][] xssData() {

        return TestData.xssPayloads();
    }

    @Test(dataProvider = "xssData")
    public void verifyXSSVulnerability(String payload) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        driver.get(
                "http://localhost/DVWA/vulnerabilities/xss_r/");

        XSSPage xssPage =
                new XSSPage(driver);

        xssPage.executePayload(payload);

        Assert.assertTrue(
                xssPage.getResponseText().length() > 0,
                "Response not received");
    }
}