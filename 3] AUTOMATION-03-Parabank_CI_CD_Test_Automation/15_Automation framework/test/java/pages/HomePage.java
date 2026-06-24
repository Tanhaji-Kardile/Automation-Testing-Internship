package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By accountsOverview =
            By.linkText("Accounts Overview");

    private By transferFunds =
            By.linkText("Transfer Funds");

    private By billPay =
            By.linkText("Bill Pay");

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAccountsOverview() {

        wait.until(
                ExpectedConditions.elementToBeClickable(accountsOverview))
                .click();
    }

    public void clickTransferFunds() {

        wait.until(
                ExpectedConditions.elementToBeClickable(transferFunds))
                .click();
    }

    public void clickBillPay() {

        wait.until(
                ExpectedConditions.elementToBeClickable(billPay))
                .click();
    }
}