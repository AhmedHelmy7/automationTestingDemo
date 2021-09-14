package WindowHandling;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.multipleWindowPage;
import utils.WindowManager;

public class multipleWindowsTest extends BaseTests {
    @Test
    public void testWindow()
    {
        multipleWindowPage page= homePage.clickMultipleWindowPage();
        page.clickHere();
        WindowManager windowManager=homePage.getWindowHandler();
        windowManager.goToTab("New Window");
    }
}
