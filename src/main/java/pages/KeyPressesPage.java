package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By textField= By.id("target");
    private By readField=By.id("result");
    public KeyPressesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void sendKeys(String input)
    {
        driver.findElement(textField).sendKeys(input);
    }
    public String getResult()
    {
        return driver.findElement(readField).getText();
    }

}
