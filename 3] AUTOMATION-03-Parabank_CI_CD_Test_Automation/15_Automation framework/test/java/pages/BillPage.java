package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By payeeName = By.name("payee.name");
    private By address = By.name("payee.address.street");
    private By city = By.name("payee.address.city");
    private By state = By.name("payee.address.state");
    private By zipCode = By.name("payee.address.zipCode");
    private By phone = By.name("payee.phoneNumber");
    private By account = By.name("payee.accountNumber");
    private By verifyAccount = By.name("verifyAccount");
    private By amount = By.name("amount");

    private By sendPaymentBtn =
            By.xpath("//input[@value='Send Payment']");

    public BillPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void payBill(String payeeNameValue,
                        String addressValue,
                        String cityValue,
                        String stateValue,
                        String zipCodeValue,
                        String phoneValue,
                        String accountValue,
                        String verifyAccountValue,
                        String amountValue) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(payeeName))
                .sendKeys(payeeNameValue);

        driver.findElement(address)
                .sendKeys(addressValue);

        driver.findElement(city)
                .sendKeys(cityValue);

        driver.findElement(state)
                .sendKeys(stateValue);

        driver.findElement(zipCode)
                .sendKeys(zipCodeValue);

        driver.findElement(phone)
                .sendKeys(phoneValue);

        driver.findElement(account)
                .sendKeys(accountValue);

        driver.findElement(verifyAccount)
                .sendKeys(verifyAccountValue);

        driver.findElement(amount)
                .sendKeys(amountValue);

        wait.until(
                ExpectedConditions.elementToBeClickable(sendPaymentBtn))
                .click();
    }

    public boolean isBillPaymentSuccessful() {

        return driver.getPageSource()
                .contains("Bill Payment Complete");
    }
}