package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test
    public void testContextMenu()
    {
        ContextMenuPage contextMenuPage=homePage.clickContextMenu();
        String message=contextMenuPage.rightClickBox();
        assertEquals(message,"You selected a context menu","The message is incorrect");
    }
}
