package pages.TestPages;

import org.xml.sax.Locator;
import pages.Common;
import pages.Locators;

public class AlertBox {

    public static void open(){pages.Common.openUrl("https://testpages.herokuapp.com/styled/alerts/alert-test.html");}

    public static void openSimpleAlertBox(){
        Common.clickElement(Locators.TestPages.AlertBox.simpleAlertBox);
    }

    public static void openConfirmAlertBox(){
        Common.clickElement(Locators.TestPages.AlertBox.confirmAlertBox);
    }

    public static void openPromptAlertBox(){
        Common.clickElement(Locators.TestPages.AlertBox.promptAlertBox);
    }

    public static boolean isAlertPresent(){return pages.Common.isAlertPresent();}

    public static void clickOKAlertBox(){pages.Common.acceptAlert();}

    public static void clickCancelAlertBox(){pages.Common.declineAlert();}

    public static void sendMessageToPromptBox(String message){pages.Common.sendKeysToAlert(message);}

    public static String readReturnedValue(){
        return Common.getElementText(Locators.TestPages.AlertBox.confirmReturnedValue);
    }
    public static String readChangedValue(){
        return Common.getElementText(Locators.TestPages.AlertBox.confirmChangedValue);
    }
}
