package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By leftBody= By.tagName("body");
    private By bottomBody=By.tagName("body");
    public FramesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String switchToLeftFrame()
    {
        //driver.switchTo().frame(1);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String temp=driver.findElement(leftBody).getText();
        switchToMainFrame();
        switchToMainFrame();
        return temp;
    }
    public String switchToBottomFrame()
    {
        driver.switchTo().frame("frame-bottom");
        String temp=driver.findElement(bottomBody).getText();
        switchToMainFrame();
        return temp;
    }
    public void switchToMainFrame()
    {
        driver.switchTo().parentFrame();
    }
}
