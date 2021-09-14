package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class testInfinitePage extends BaseTests {
    @Test
    public void InfinitePageTest()
    {
        InfiniteScrollPage infiniteScrollPage= homePage.clickInfiniteScrollPage();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
