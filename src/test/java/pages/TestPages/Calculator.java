package pages.TestPages;

import pages.Common;
import pages.Locators;

public class Calculator {

    public static void open(){pages.Common.openUrl("https://testpages.herokuapp.com/styled/calculator");}

    public static void selectFunctionFromDropdownList(String value){
        Common.selectOptionByValue(Locators.TestPages.Calculator.functionDropdown, value);
    }

    public static void enterFirstFieldValue(String expectedValue){
        Common.sendKeysToElement(Locators.TestPages.Calculator.firstInputField, expectedValue);
    }

    public static void enterSecondFieldValue(String expectedValue){
        Common.sendKeysToElement(Locators.TestPages.Calculator.secondInputField, expectedValue);
    }

    public static String readResult(){
        return Common.getElementText(Locators.TestPages.Calculator.answerValue);
    }

    public static void calculate(){
        Common.clickElement(Locators.TestPages.Calculator.calculateButton);
    }
}

