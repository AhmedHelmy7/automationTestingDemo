package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropDownTest extends BaseTests {
    @Test
    public void testSelectedOption()
    {
        DropDownPage dropDownPage=homePage.dropDownSelect();
        dropDownPage.dropDownChoose("Option 1");
        List<String> selectedOptions=dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"wrong selection size");
        assertTrue(selectedOptions.contains("Option 1"),"wrong selection");

    }
}
