package checkbox;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Checkboxes extends BaseTest {
    // defult Box 1 is empty & Box2 is selected
    @Test
    public void testIfCheckBox1IsEmpty()
    {
        var checkbox = homePage.clickon_checkbox_button();
        assertFalse(checkbox.box1isempty());
    }
    @Test
    public void testSelectCheckBox1()
    {
        var checkbox = homePage.clickon_checkbox_button();
        assertTrue(checkbox.clickonBox1());
    }
    @Test
    public void testIFCheckbox2IsSelected()
    {
        var checkbox = homePage.clickon_checkbox_button();
        assertTrue(checkbox.box2isactive());
    }
    public void testClickonCheckBox2()
    {
        var checkbox = homePage.clickon_checkbox_button();
        assertFalse(checkbox.clickonBox2());
    }

}
