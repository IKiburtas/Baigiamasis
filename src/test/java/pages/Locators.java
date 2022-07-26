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

        }

        public static class AlertBox{
            public static By simpleAlertBox = By.xpath("//input[@id='alertexamples']");

            public static By confirmAlertBox = By.xpath("//input[@id='confirmexample']");

            public static By promptAlertBox = By.xpath("//input[@id='promptexample']");

            public static By confirmReturnedValue = By.xpath("//*[@id='confirmreturn']");

            public static By confirmChangedValue = By.xpath("//*[@id='promptreturn']");

        }

        public static class Calculator{
            public static By firstInputField = By.xpath("//input[@id='number1']");

            public static By secondInputField = By.xpath("//input[@id='number2']");

            public static By functionDropdown = By.xpath("//select[@id='function']");

            public static By calculateButton = By.xpath("//input[@id='calculate']");

            public static By answerValue = By.xpath("//*[@id='answer']");
        }
    }
}
