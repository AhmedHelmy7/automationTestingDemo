package HorizontalSlide;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;


public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testingSlider()
    {
        HorizontalSliderPage horizontalSliderPage=homePage.horizontalSlide();
        horizontalSliderPage.SliderMove();
        assertEquals(horizontalSliderPage.getResult(),"4","The result is incorrect!");
    }
}
