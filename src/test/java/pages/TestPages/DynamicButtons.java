package pages.TestPages;


import pages.Common;
import pages.Locators;

public class DynamicButtons {

    public static void open(){pages.Common.openUrl("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");}

    public static void clickButtons(){
        Common.clickElement(Locators.TestPages.DynamicButtons.clickButton0);
        Common.waitForElementToBeClickable(Locators.TestPages.DynamicButtons.clickButton1);
        Common.clickElement(Locators.TestPages.DynamicButtons.clickButton1);
        Common.waitForElementToBeClickable(Locators.TestPages.DynamicButtons.clickButton2);
        Common.clickElement(Locators.TestPages.DynamicButtons.clickButton2);
        Common.waitForElementToBeClickable(Locators.TestPages.DynamicButtons.clickButton3);
        Common.clickElement(Locators.TestPages.DynamicButtons.clickButton3);
    }

    public static String readMessage(){
        return Common.getElementText(Locators.TestPages.DynamicButtons.buttonMessage);
    }
}
