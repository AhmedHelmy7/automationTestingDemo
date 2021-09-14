package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class loginTest extends BaseTests {
    @Test
public void testloginSucccessful()
{
    LoginPage loginpage =homePage.formAuthenticationClick();
    loginpage.setUsername("tomsmith");
    loginpage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage=loginpage.loginMethod();
    assertTrue(secureAreaPage.getMessage().contains("You logged into a secure area!"),"Alert text is incorrect");

}
}
