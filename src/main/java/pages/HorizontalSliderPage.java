package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderContainer= By.tagName("input");
    private By result= By.id("range");

    public HorizontalSliderPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void SliderMove()
    {
        driver.findElement(sliderContainer).sendKeys(Keys.chord(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT));
    }
    public String getResult()
    {
        return driver.findElement(result).getText();
    }
}
