package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By accountTable = By.id("accountTable");

    public AccountPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isAccountOverviewDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(accountTable))
                .isDisplayed();
    }
}