package tests.TestPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Calculator extends BaseTest {

    @BeforeMethod
    public void intialise(){pages.TestPages.Calculator.open();}

    @Test
    public void TestCalculatorDivision(){
        float firstValue = 150;
        float secondValue = 20;
        float temp = firstValue / secondValue;
        String expectedValue = String.valueOf(temp);
        String actualValue;

        pages.TestPages.Calculator.enterFirstFieldValue(String.valueOf(firstValue));
        pages.TestPages.Calculator.enterSecondFieldValue(String.valueOf(secondValue));
        pages.TestPages.Calculator.selectFunctionFromDropdownList("divide");
        pages.TestPages.Calculator.calculate();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actualValue = pages.TestPages.Calculator.readResult();
        Assert.assertEquals(actualValue, expectedValue);
    }
}
