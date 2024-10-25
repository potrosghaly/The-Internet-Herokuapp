package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test
    public void testAlertButton()
    {
        var alert = homePage.clickJsAlertLink();
        alert.clickonAlertButton();
        String actual = alert.getResultMessage();
        String expect = "You successfully clicked an alert";
        assertEquals(actual,expect);
    }

    @Test
    public void testAcceptConfirmButton()
    {
        var alert = homePage.clickJsAlertLink();
        alert.clickAndAcceptConfirmButton();
        String actual = alert.getResultMessage();
        String expect = "You clicked: Ok";
        assertEquals(actual,expect);
    }

    @Test
    public void testCancelConfirmButton()
    {
        var alert = homePage.clickJsAlertLink();
        alert.clickAndcancelConfirmButton();
        String actual = alert.getResultMessage();
        String expect = "You clicked: Cancel";
        assertEquals(actual,expect);
    }

    @Test
    public void testSendTextToPromptButton()
    {
        var alert = homePage.clickJsAlertLink();
        alert.clickAndSendTextToPromptButton("Test One");
        String actual = alert.getResultMessage();
        String expect = "You entered: Test One";
        assertEquals(actual,expect);
    }

    @Test
    public void testCancelPromptButton()
    {
        var alert = homePage.clickJsAlertLink();
        alert.clickAndCancelPromptButton();
        String actual = alert.getResultMessage();
        String expect = "You entered: null";
        assertEquals(actual,expect);
    }

}
