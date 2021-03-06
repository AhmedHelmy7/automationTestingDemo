package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver)
    {
        this.driver=driver;
    }
    public void goBack()
    {
        driver.navigate().back();
    }
    public void goForward()
    {
        driver.navigate().forward();
    }
    public void refresh()
    {
        driver.navigate().refresh();
    }
    public void goTo(String url)
    {
        driver.navigate().to(url);
    }
    public void goToTab(String tabName)
    {
        var windows=driver.getWindowHandles();
        System.out.println("The number of tabs are "+windows.size());
        windows.forEach(System.out::println);
        for(String window: windows)
        {
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
            if(driver.getTitle().equals(tabName))
            {
                //break;
            }
        }
    }
}
