package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class testFrames extends BaseTests {
    @Test
    public void framesTest()
    {
        FramesPage framesPage=homePage.clickFrames();
        String leftMessage=framesPage.switchToLeftFrame();
        String bottomMessage=framesPage.switchToBottomFrame();
        assertEquals(leftMessage,"LEFT","left message is incorrect");
        assertEquals(bottomMessage,"BOTTOM","bottom message is incorrect");

    }
}
