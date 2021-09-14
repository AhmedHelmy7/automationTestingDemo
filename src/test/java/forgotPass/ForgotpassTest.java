package forgotPass;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotpassTest extends BaseTests {
    public void testForgotPass()
    {
        String email="tau@example.com";
        ForgotPasswordPage forgotPasswordPage=homePage.forgetPass();
        forgotPasswordPage.setNPass(email);
    }
}
