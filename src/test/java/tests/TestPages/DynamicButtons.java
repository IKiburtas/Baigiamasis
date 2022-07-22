package tests.TestPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import tests.BaseTest;

public class DynamicButtons extends BaseTest {

    @BeforeMethod
    public void intialise(){pages.TestPages.DynamicButtons.open();}

    @Test
    public void testDynamicButtons(){
        String expectedMessage = "All Buttons Clicked";
        String actualMessage;

        pages.TestPages.DynamicButtons.clickButtons();
        actualMessage = pages.TestPages.DynamicButtons.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
