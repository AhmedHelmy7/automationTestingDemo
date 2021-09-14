package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    private WebDriver driver;
    private By fileUploadLink= By.id("file-upload");
    private By uploadButton=By.id("file-submit");
    private By uploadedFiles=By.id("uploaded-files");
    public UploadFilePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void uploadFile(String filePath)
    {
        driver.findElement(fileUploadLink).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }
    public String getUploadFilesNames()
    {
        return driver.findElement(uploadedFiles).getText();
    }

}
