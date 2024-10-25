package dropdowntest;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDropdown extends BaseTest {
    @Test
    public void testSelectWithVisibleText()
    {
        var dropdown = homePage.clickonDropdownLink();
        dropdown.selectByVisibleText("Option 2");
        String actual = dropdown.getSelectText();
        String expect = "Option 2";
        assertEquals(actual,expect);
    }

    @Test
    public void testSelectWithValue()
    {
        var dropdown = homePage.clickonDropdownLink();
        dropdown.selectByValue("1");
    }

    @Test
    public void testSelectWithIndix()
    {
        var dropdown = homePage.clickonDropdownLink();
        dropdown.selectByIndix(1);
    }


}
