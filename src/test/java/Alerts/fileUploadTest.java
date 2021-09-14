package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.UploadFilePage;
import static org.testng.Assert.*;


public class fileUploadTest extends BaseTests {
    @Test
    public void testFileUpload()
    {
        UploadFilePage uploadFilePage=homePage.clickUploadFile();
        uploadFilePage.uploadFile("D:\\automationTestingDemo\\resources\\chromedriver.exe");
        String name=uploadFilePage.getUploadFilesNames();
        assertEquals(name,"chromedriver.exe","file name is not correct");
    }
}
