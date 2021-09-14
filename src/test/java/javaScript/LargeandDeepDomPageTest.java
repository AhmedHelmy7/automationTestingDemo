package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeandDeepDomPage;

public class LargeandDeepDomPageTest extends BaseTests {
    @Test
    public void testLargePage()
    {
        LargeandDeepDomPage largeandDeepDomPage=homePage.clickLargeandDeepDomPage();
        largeandDeepDomPage.ScrollToTable();
    }
}
