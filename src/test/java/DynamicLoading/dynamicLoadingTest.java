package DynamicLoading;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.DynamicLoadingPageElements;

import static org.testng.Assert.assertEquals;

public class dynamicLoadingTest extends BaseTests {
    @Test
    public void testDynamicLoading()
    {
        DynamicLoadingPage dynamicLoadingPage=homePage.clickDynamicLoading();
        DynamicLoadingPageElements dynamicLoadingPageElements=dynamicLoadingPage.element1Click();
        String result=dynamicLoadingPageElements.clickStartButton();
        assertEquals(result,"Hello World!","The message is not correct");
    }
}
