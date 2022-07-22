package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class TestPages{

        public static class DynamicButtons{
            public static By clickButton0 = By.xpath("//*[@id='button00']");

            public static By clickButton1 = By.xpath("//*[@id='button01']");

            public static By clickButton2 = By.xpath("//*[@id='button02']");

            public static By clickButton3 = By.xpath("//*[@id='button03']");

            public static By buttonMessage = By.xpath("//*[@id='buttonmessage']");
        }

        public static class FieldValidation{
            public static By inputField = By.xpath("//input[@id='lteq30']");

            public static By buttonSubmitValue = By.xpath("//input[@class='styled-click-button']");

            public static By submittedValue = By.xpath("//*[@id='_valuevalue']");

            //public static By alert = By.xpath("//[@id='a'")
        }
    }
}
