package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multipleWindowPage {
    private WebDriver driver;
    private By clickHere= By.linkText("Click Here");
    public multipleWindowPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clickHere()
    {
        driver.findElement(clickHere).click();
    }

}
