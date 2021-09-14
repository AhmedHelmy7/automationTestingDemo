package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraph= By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void scrollToParagraph(int index)
    {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        String script="window.scrollTo(0,document.body.scrollHeight)";
        while(paragraphVisualized()<index)
        {
            javascriptExecutor.executeScript(script);
        }
    }
    public int paragraphVisualized()
    {
       return driver.findElements(paragraph).size();
    }
}
