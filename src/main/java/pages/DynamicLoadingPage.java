package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By Element1= By.linkText("Example 1: Element on page that is hidden");
    private By Element2= By.linkText("Example 2: Element rendered after the fact");
    private By Element2Button=By.id("start");

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public DynamicLoadingPageElements element1Click()
    {
        DynamicLoadingPageElements dynamicLoadingPageElements=new DynamicLoadingPageElements(driver);
        driver.findElement(Element1).click();
        return dynamicLoadingPageElements;
    }
    public DynamicLoadingPageElements element2Click()
    {
        DynamicLoadingPageElements dynamicLoadingPageElements=new DynamicLoadingPageElements(driver);
        driver.findElement(Element2).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        return dynamicLoadingPageElements;
    }
    public Boolean isTheButtonVisible()
    {
        return driver.findElement(Element2Button).isDisplayed();
    }
}
