package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageElements {
    private WebDriver driver;
    private By StartButton=By.cssSelector("#start button");
    private By Loading=By.id("loading");
    private By TextReaderElement=By.id("finish");

    public DynamicLoadingPageElements(WebDriver driver)
    {
        this.driver=driver;
    }
    public String clickStartButton()
    {
        driver.findElement(StartButton).click();
        //WebDriverWait webDriverWait=new WebDriverWait(driver, 5);
        //webDriverWait.until(ExpectedConditions.invisibilityOf(driver.findElement(Loading)));
        FluentWait fluentWait=new FluentWait(driver).withTimeout(Duration.ofSeconds(5));
        fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(Loading)));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.ignoring(NoSuchElementException.class);

        return driver.findElement(TextReaderElement).getText();
    }

}
