package statuscodes;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodeTest extends BaseTest {


    String expectURL200 = "status_codes/200";
    String expectURL301 = "status_codes/301";
    String expectURL404 = "status_codes/404";
    String expectURL500 = "status_codes/500";

    @Test
    public void testStatus200()
    {
        var statuscode = homePage.clickon_statusCode_button();
        var code200 = statuscode.clickon_status200();
        String actualURL = code200.getActualURL();
        assertTrue(actualURL.contains(expectURL200));
    }
    @Test
    public void testStatus301()
    {
        var statuscode = homePage.clickon_statusCode_button();
        var code301 = statuscode.clickon_status301();
        String actualURL = code301.getActualURL();
        assertTrue(actualURL.contains(expectURL301));
    }

    @Test
    public void testStatus404()
    {
        var statuscode = homePage.clickon_statusCode_button();
        var code404 = statuscode.clickon_status404();
        String actualURL = code404.getActualURL();
        assertTrue(actualURL.contains(expectURL404));
    }
    @Test
    public void testStatus500()
    {
        var statuscode = homePage.clickon_statusCode_button();
        var code500 = statuscode.clickon_status500();
        String actualURL = code500.getActualURL();
        assertTrue(actualURL.contains(expectURL500));
    }

}
