package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SQLInjectionPage {

    private WebDriver driver;

    public SQLInjectionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    private By userIdTextBox =
            By.name("id");

    private By submitButton =
            By.name("Submit");

    private By pageBody =
            By.tagName("body");

    // Actions

    public void enterPayload(String payload) {

        driver.findElement(userIdTextBox).clear();

        driver.findElement(userIdTextBox)
              .sendKeys(payload);
    }

    public void clickSubmit() {

        driver.findElement(submitButton)
              .click();
    }

    public void executePayload(String payload) {

        enterPayload(payload);

        clickSubmit();
    }

    public String getResponseText() {

        return driver.findElement(pageBody)
                     .getText();
    }

    public boolean containsUserData() {

        String response = getResponseText();

        return response.contains("First name")
                || response.contains("Surname")
                || response.contains("admin");
    }
}