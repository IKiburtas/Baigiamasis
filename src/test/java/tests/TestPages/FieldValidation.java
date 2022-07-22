package tests.TestPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FieldValidation extends BaseTest {

    @BeforeMethod
    public void intialise() {
        pages.TestPages.FieldValidation.open();
    }

    @Test
    public void inputLessThan30() {
        String expectedMessage = "15";
        String actualMessage;

        pages.TestPages.FieldValidation.enterValue(expectedMessage);
        pages.TestPages.FieldValidation.clickSubmitButton();
        actualMessage = pages.TestPages.FieldValidation.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void inputMoreThan30() {
        String expectedMessage = "50";

        pages.TestPages.FieldValidation.enterValue(expectedMessage);
        pages.TestPages.FieldValidation.clickSubmitButton();
        Assert.assertTrue(pages.TestPages.FieldValidation.isAlertPresent());
    }
}
