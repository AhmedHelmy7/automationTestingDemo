package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By Box= By.id("hot-spot");
    public ContextMenuPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String rightClickBox()
    {
        Actions actions=new Actions(driver);
        WebElement boxElement= driver.findElement(Box);
        actions.contextClick(boxElement).perform();
        String message=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return message;
    }
}
