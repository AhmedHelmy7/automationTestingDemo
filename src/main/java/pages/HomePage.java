package pages;

import org.openqa.selenium.*;
import utils.WindowManager;

import java.util.List;

public class HomePage {
    private By formAuthentication=By.linkText("Form Authentication");
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public LoginPage formAuthenticationClick()
    {
       findElement("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage dropDownSelect()
    {
        findElement("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgotPasswordPage forgetPass()
    {
        findElement("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public HoverPage hoverClick()
    {
        findElement("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage keyPress()
    {
        findElement("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage horizontalSlide()
    {
        findElement("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage clickJSAlerts()
    {
        findElement("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public UploadFilePage clickUploadFile()
    {
        findElement("File Upload");
        return new UploadFilePage(driver);
    }
    public ContextMenuPage clickContextMenu()
    {
        findElement("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WYSIWYGEditorPage clickEditor()
    {
        findElement("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public FramesPage clickFrames()
    {
        findElement("Frames");
        findElement("Nested Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading()
    {
        findElement("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeandDeepDomPage clickLargeandDeepDomPage()
    {
        findElement("Large & Deep DOM");
        return new LargeandDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollPage()
    {
        findElement("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public WindowManager getWindowHandler()
    {
        return new WindowManager(driver);
    }
    public multipleWindowPage clickMultipleWindowPage()
    {
        findElement("Multiple Windows");
        return new multipleWindowPage(driver);
    }
    private void findElement(String element)
    {
        driver.findElement(By.linkText(element)).click();
    }



}
