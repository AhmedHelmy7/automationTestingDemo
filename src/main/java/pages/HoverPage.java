package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverPage {
    private WebDriver driver;
    private By figureBox= By.className("figure");
    private By figureCaptionElement= By.className("figcaption");

    public HoverPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public figureCaption hoverOverFigure(int index)
    {
        Actions actions=new Actions(driver);
        WebElement figure=driver.findElements(figureBox).get(index-1);
        actions.moveToElement(figure).perform();
        return new figureCaption(figure.findElement(figureCaptionElement));
    }
    public class figureCaption
    {
        WebElement caption;
        By title=By.tagName("h5");
        By link=By.tagName("a");
        public figureCaption(WebElement caption)
        {
            this.caption=caption;
        }
        public boolean isDisplayed()
        {
            return caption.isDisplayed();
        }
        public String getTitle()
        {
            return caption.findElement(title).getText();
        }
        public String getLink()
        {
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText()
        {
            return caption.findElement(link).getText();
        }

    }
}

