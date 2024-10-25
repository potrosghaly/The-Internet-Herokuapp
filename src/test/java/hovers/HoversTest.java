package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTest extends BaseTest {

    int index = 2;
    @Test
    public void testHovers()
    {
        var hovers = homePage.clickonHoversLink();
        var caption = hovers.clickonFiger(index);
        String userName = caption.getUserName();
        String link = caption.getLink();
        assertEquals(userName, "name: user"+ index);
        assertEquals(link, "View profile");
    }

}
