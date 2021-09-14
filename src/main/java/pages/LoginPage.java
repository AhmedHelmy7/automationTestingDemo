package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameTextField= By.id("username");
    private By passTextField= By.id("password");
    private By buttonLogin= By.cssSelector("#login button");
    private String username;
    private String password;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SecureAreaPage loginMethod()
    {
        driver.findElement(usernameTextField).sendKeys(username);
        driver.findElement(passTextField).sendKeys(password);
        driver.findElement(buttonLogin).click();
        return new SecureAreaPage(driver);

    }
}
