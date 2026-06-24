package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XSSPage {

    private WebDriver driver;

    public XSSPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    private By nameField = By.name("name");

    private By submitButton = By.xpath("//input[@type='submit']");

    // Actions

    public void enterPayload(String payload) {

        driver.findElement(nameField).clear();

        driver.findElement(nameField)
              .sendKeys(payload);
    }

    public void clickSubmit() {

        driver.findElement(submitButton)
              .click();
    }

    public void executePayload(String payload) {

        enterPayload(payload);

        clickSubmit();

        handleAlertIfPresent();
    }

    private void handleAlertIfPresent() {

        try {

            WebDriverWait wait =
                    new WebDriverWait(driver, Duration.ofSeconds(2));

            Alert alert =
                    wait.until(ExpectedConditions.alertIsPresent());

            alert.accept();

        } catch (Exception e) {
            // No alert present, continue execution
        }
    }

    public String getResponseText() {

        try {

            WebDriverWait wait =
                    new WebDriverWait(driver, Duration.ofSeconds(5));

            wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.tagName("body")));

            return driver.findElement(By.tagName("body"))
                         .getText();

        } catch (NoAlertPresentException e) {

            return "";

        } catch (Exception e) {

            try {
                return driver.findElement(By.tagName("body"))
                             .getText();
            } catch (Exception ex) {
                return "";
            }
        }
    }
}