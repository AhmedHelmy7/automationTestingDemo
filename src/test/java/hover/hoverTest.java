package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;
import static org.testng.Assert.*;

public class hoverTest extends BaseTests {

    @Test
    public void hoverOverFigures()
    {
        HoverPage hoverPage=homePage.hoverClick();
        var caption= hoverPage.hoverOverFigure(1);
        assertTrue(caption.isDisplayed(),"The caption is not displayed");
        assertTrue(caption.getLink().endsWith("/users/1"), "The link is not correct");
        assertEquals(caption.getTitle(), "name: user1","Tile is not correct");
        assertEquals(caption.getLinkText(), "View profile", "link text is not correct");
    }
}
