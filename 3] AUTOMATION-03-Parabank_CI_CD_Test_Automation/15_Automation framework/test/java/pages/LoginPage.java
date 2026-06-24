package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//input[@value='Log In']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String user, String pass) {

        WebElement userField =
                wait.until(ExpectedConditions.visibilityOfElementLocated(username));

        userField.clear();
        userField.sendKeys(user);

        WebElement passField =
                wait.until(ExpectedConditions.visibilityOfElementLocated(password));

        passField.clear();
        passField.sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}