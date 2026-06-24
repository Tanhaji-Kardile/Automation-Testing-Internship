package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.TransferPage;
import testdata.TestData;
import utils.ConfigReader;
import utils.ExcelReader;

public class TransferFundsTest extends BaseTest {

    @DataProvider(name = "transferData")
    public Object[][] transferData() {

        return ExcelReader.getExcelData(
                TestData.TRANSFER_DATA,
                "TransferFunds");
    }

    @Test(dataProvider = "transferData")
    public void transferFunds(String amount)
            throws InterruptedException {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        HomePage homePage =
                new HomePage(driver);

        homePage.clickTransferFunds();

        Thread.sleep(3000);

        TransferPage transferPage =
                new TransferPage(driver);

        transferPage.transferFunds(amount);

        Assert.assertTrue(
                transferPage.isTransferSuccessful(),
                "Transfer Funds Failed");
    }
}