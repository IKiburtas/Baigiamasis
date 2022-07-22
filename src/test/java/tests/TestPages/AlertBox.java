package tests.TestPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AlertBox extends BaseTest {

    @BeforeMethod
    public void intialise(){pages.TestPages.AlertBox.open();}

    @Test
    public void TestToCloseSimpleAlertBox(){
        pages.TestPages.AlertBox.openSimpleAlertBox();
        Assert.assertTrue(pages.TestPages.AlertBox.isAlertPresent());

        pages.TestPages.AlertBox.clickOKAlertBox();
        Assert.assertFalse(pages.TestPages.AlertBox.isAlertPresent());
    }

    @Test
    public void TestToCancelConfirmAlertBox() {
        String expectedMessage = "false";
        String actualMessage;

        pages.TestPages.AlertBox.openConfirmAlertBox();
        Assert.assertTrue(pages.TestPages.AlertBox.isAlertPresent());

        pages.TestPages.AlertBox.clickCancelAlertBox();
        actualMessage = pages.TestPages.AlertBox.readReturnedValue();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void TestPromptAlertBox() {
        String expectedMessage = "Atsiprašau už vėlavimą";
        pages.TestPages.AlertBox.openPromptAlertBox();
        Assert.assertTrue(pages.TestPages.AlertBox.isAlertPresent());

        pages.TestPages.AlertBox.sendMessageToPromptBox(expectedMessage);
        pages.TestPages.AlertBox.clickOKAlertBox();

        String actualMessage = pages.TestPages.AlertBox.readChangedValue();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
