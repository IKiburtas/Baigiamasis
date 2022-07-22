package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.Driver;

public class Common {

    public static void openUrl(String url) {Driver.getDriver().get(url);}

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {getElement(locator).click();}

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean isAlertPresent() {
        try { Driver.getDriver().switchTo().alert(); return true;}
        catch (NoAlertPresentException e) {return false;}
    }

    public static void acceptAlert() {Driver.getDriver().switchTo().alert().accept();}

    public static void declineAlert() {Driver.getDriver().switchTo().alert().dismiss();}

    public static void sendKeysToAlert(String keys) {Driver.getDriver().switchTo().alert().sendKeys(keys);}

}

