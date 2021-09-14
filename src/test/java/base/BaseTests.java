package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.EventReporter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    private EventFiringWebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.out.println("HIIII");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        goToHomePage();
        homePage=new HomePage(driver);
       //driver.quit();
    }
    @BeforeMethod
    public void goToHomePage()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void coco()
    {
        //driver.quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
