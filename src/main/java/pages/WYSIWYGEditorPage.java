package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    String frameId="mce_0_ifr";
    private By textField= By.id("tinymce");
    private By identationButton=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");
    public WYSIWYGEditorPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void switchToSecondFrame()
    {
        driver.switchTo().frame(frameId);
    }
    public void switchToMainFrame()
    {
        driver.switchTo().parentFrame();
    }
    public void clearTextField()
    {
        switchToSecondFrame();
        driver.findElement(textField).clear();
        switchToMainFrame();
    }
    public void writeToTextField(String text)
    {
        switchToSecondFrame();
        driver.findElement(textField).sendKeys(text);
        switchToMainFrame();
    }
    public void identation()
    {
        driver.findElement(identationButton).click();
    }
    public String getTextFieldText()
    {
        switchToSecondFrame();
        String temp=driver.findElement(textField).getText();
        switchToMainFrame();
        return temp;
    }

}
