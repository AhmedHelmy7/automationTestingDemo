package DynamicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import utils.WindowManager;

import static org.testng.Assert.assertTrue;

public class DynamicLoadingandChangingTabsTest extends BaseTests {
    @Test
    public void TestDynamicLoadingandChangingTabs()
    {
        DynamicLoadingPage dynamicLoadingPage= homePage.clickDynamicLoading();
        dynamicLoadingPage.element2Click();
        WindowManager windowManager=homePage.getWindowHandler();
        windowManager.goToTab("The Internet");
        assertTrue(dynamicLoadingPage.isTheButtonVisible(),"The button is not visible");
    }
}
