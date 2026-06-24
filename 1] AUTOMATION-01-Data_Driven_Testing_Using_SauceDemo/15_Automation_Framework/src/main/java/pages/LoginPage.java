package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By txtUsername = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");

    // Success locator
    By productsTitle = By.className("title");

    // Error locator
    By errorMessage =
            By.xpath("//h3[@data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btnLogin).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public boolean isLoginSuccessful() {

        try {

            return driver.findElement(productsTitle)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    public boolean isErrorDisplayed() {

        try {

            return driver.findElement(errorMessage)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}