package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlert= By.xpath(".//button[text()='Click for JS Alert']");
    private By resultField= By.id("result");
    private By jsConfirm=By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPrompt=By.xpath(".//button[text()='Click for JS Prompt']");



    public AlertsPage( WebDriver driver)
    {
        this.driver=driver;
    }
    public void click_Js_Alert()
    {
        driver.findElement(triggerAlert).click();
    }
    public void click_Js_Confrim_Alert()
    {
        driver.findElement(jsConfirm).click();
    }
    public void click_JS_Prompt_Alert()
    {
        driver.findElement(jsPrompt).click();
    }
    public void WriteToAlertPrompt(String message)
    {
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }
    public void Accept_Alert()
    {
        driver.switchTo().alert().accept();
    }
    public void Reject_Alert()
    {
        driver.switchTo().alert().dismiss();
    }
    public String get_Alert_Text()
    {
        return driver.switchTo().alert().getText();
    }
    public String getResult()
    {
       return driver.findElement(resultField).getText();
    }

}
