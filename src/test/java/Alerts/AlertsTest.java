package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertsTest extends BaseTests {
    @Test
    public void testTriggerAlert()
    {
        AlertsPage alertsPage=homePage.clickJSAlerts();
        alertsPage.click_Js_Alert();
        alertsPage.Accept_Alert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","The result is incorrect");
    }
    @Test
    public void TestJsConfirmAlert()
    {
        AlertsPage alertsPage=homePage.clickJSAlerts();
        alertsPage.click_Js_Confrim_Alert();
        String message=alertsPage.get_Alert_Text();
        alertsPage.Reject_Alert();
        assertEquals(message,"I am a JS Confirm","The alert message is incorrect");
    }
    @Test
    public void TestJsPromptAlert()
    {
        AlertsPage alertsPage=homePage.clickJSAlerts();
        alertsPage.click_JS_Prompt_Alert();
        alertsPage.WriteToAlertPrompt("Hi There");
        String message=alertsPage.getResult();
        assertEquals(message, "You entered: Hi There", "The alert message is incorrect");
    }
}
