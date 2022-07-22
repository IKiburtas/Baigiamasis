package pages.TestPages;

import pages.Common;
import pages.Locators;

public class FieldValidation {

    public static void open(){pages.Common.openUrl("https://testpages.herokuapp.com/styled/basic-javascript-validation-test.html");}

    public static void enterValue(String expectedValue){
        Common.sendKeysToElement(
                Locators.TestPages.FieldValidation.inputField, expectedValue);
    }

    public static void clickSubmitButton(){
        Common.clickElement(Locators.TestPages.FieldValidation.buttonSubmitValue);
    }

    public static String readMessage(){
        return Common.getElementText(Locators.TestPages.FieldValidation.submittedValue);
    }

    public static Boolean isAlertPresent() {return Common.isAlertPresent();}
}
