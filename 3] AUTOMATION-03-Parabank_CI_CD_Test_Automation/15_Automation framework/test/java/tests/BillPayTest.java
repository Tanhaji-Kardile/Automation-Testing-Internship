package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BillPage;
import pages.HomePage;
import pages.LoginPage;
import testdata.TestData;
import utils.ConfigReader;
import utils.ExcelReader;

public class BillPayTest extends BaseTest {

    @DataProvider(name = "billPayData")
    public Object[][] billPayData() {

        return ExcelReader.getExcelData(
                TestData.BILLPAY_DATA,
                "BillPay");
    }

    @Test(dataProvider = "billPayData")
    public void payBill(String payeeName,
                        String address,
                        String city,
                        String state,
                        String zipCode,
                        String phone,
                        String account,
                        String verifyAccount,
                        String amount) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        HomePage homePage =
                new HomePage(driver);

        homePage.clickBillPay();

        BillPage billPage =
                new BillPage(driver);

        billPage.payBill(
                payeeName,
                address,
                city,
                state,
                zipCode,
                phone,
                account,
                verifyAccount,
                amount);

        Assert.assertTrue(
                billPage.isBillPaymentSuccessful(),
                "Bill Payment Failed");
    }
}