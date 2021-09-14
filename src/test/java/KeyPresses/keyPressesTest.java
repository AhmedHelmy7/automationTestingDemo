package KeyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import static org.testng.Assert.*;

public class keyPressesTest extends BaseTests {
    @Test
    public void testKey()
    {
        KeyPressesPage keyPressesPage=homePage.keyPress();
        keyPressesPage.sendKeys("r"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","The result is incorrect");
    }
}
