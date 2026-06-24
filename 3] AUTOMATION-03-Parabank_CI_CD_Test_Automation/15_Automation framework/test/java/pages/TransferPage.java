package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By amount =
            By.id("amount");

    private By transferBtn =
            By.xpath("//input[@value='Transfer']");

    public TransferPage(WebDriver driver) {

        this.driver = driver;

        this.wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(20));
    }

    public void transferFunds(String amt) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(amount));

        driver.findElement(amount).clear();

        driver.findElement(amount).sendKeys(amt);

        wait.until(
                ExpectedConditions.elementToBeClickable(transferBtn))
                .click();
    }

    public boolean isTransferSuccessful() {

        return driver.getPageSource()
                .contains("Transfer Complete");
    }
}