package entryAdd;

import base.BaseTest;
import org.testng.annotations.Test;

public class EntryAddTest extends BaseTest {
    @Test
    public void testOpenAdd()
    {
        var entryadd = homePage.clickEntryAddLink();
        entryadd.clickUntilPopupAppears();

    }
}
