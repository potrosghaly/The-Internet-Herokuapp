package forgetpassword;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTest extends BaseTest {
    String email = "test@test.com";

    @Test
    public void testForgetPassword()
    {
        var forgetpage = homePage.clickon_forget_password();
        forgetpage.writeEmail(email);
        var lastpage = forgetpage.clickonForgetButton();
        String actual = lastpage.getActualText();
        String expect = "Internal Server Error";
        assertTrue(actual.contains(expect));
    }
}
