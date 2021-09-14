package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailText= By.id("email");
    private By submitButton=By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setNPass(String email)
    {
        driver.findElement(emailText).sendKeys(email);
        driver.findElement(submitButton).click();


    }


}
