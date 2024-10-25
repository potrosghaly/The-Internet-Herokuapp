package dynamicloading;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDynamicLoading extends BaseTest {
    @Test
    public void testExampleOneWhenMessageAppear()
    {
        var load = homePage.clickonDynamicLoadingPage();
        var example1 = load.clickonExampleOne();
        example1.clickonStartButton();
        String actual = example1.getActualMessage();
        assertEquals(actual,"Hello World!");
    }

    @Test
    public void testExampleTwoWhenLoadingIconHide()
    {
        var load = homePage.clickonDynamicLoadingPage();
        var example2 = load.clickonExampleTwo();
        example2.clickonStartButton();
        String actual = example2.getMessage();
        assertEquals(actual,"Hello World!");
    }
}
