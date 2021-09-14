package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;

public class editorPageTest extends BaseTests {
    @Test
    public void testTextField()
    {
        WYSIWYGEditorPage wysiwygEditorPage=homePage.clickEditor();
        wysiwygEditorPage.clearTextField();
        wysiwygEditorPage.writeToTextField("hello ");
        wysiwygEditorPage.identation();
        wysiwygEditorPage.writeToTextField("world!");
        assertEquals(wysiwygEditorPage.getTextFieldText(),"hello world!","Text field doesn't have the right text");
    }
}
