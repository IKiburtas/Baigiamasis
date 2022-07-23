# Baigiamasis darbas
Pasirinkta svetainė: https://testpages.herokuapp.com/

# Tests:
## Dynamic Buttons (https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html)
1. Click buttons one after each other
   * Click button "start"
   * Wait for the next button to appear
   * Click button "One"
   * Wait for the next button to appear
   * Click button "Two"
   * Wait for the next button to appear
   * Click button "Three"
   * Check for message "All Buttons Clicked"

## Field Validation (https://testpages.herokuapp.com/styled/basic-javascript-validation-test.html)
2. Input a value that is less than 30
   * Input a value which is less than 30 (in this case 15)
   * Click "Submit Value" button
   * Check if the inputted value is the same as submitted value
3. Input a value that is greater than 30
   * Input a value which is greater than 30 (in this case 50)
   * Click "Submit Value" button
   * Check if an alert has popped up warning that the value is greater than 30

## Alert Boxes (https://testpages.herokuapp.com/styled/alerts/alert-test.html)
4. Opening and closing an Alert box
   * Click on "Show alert box" button
   * Test if Alert box has successfully opened
   * Click OK on the newly opened alert box
   * Test if Alert box has closed
5. Opening and cancelling a Confirm box
   * Click on "Show confirm box" button
   * Test if Confirm box has successfully opened
   * Click Cancel on the newly opened Confirm box
   * Check if the message below the button reads "false"
6. Opening and inputting a text into a Prompt box
   * Click on "Show prompt box" button
   * Test if Prompt box has successfully opened
   * Input "Atsiprašau už vėlavimą" into Prompt box text field
   * Click OK on the Prompt box
   * Check if the message below the button reads "Atsiprašau už vėlavimą"

## Calculator (https://testpages.herokuapp.com/styled/calculator)
1. Division
   * Enter a number in the first field
   * Enter a number in the second field
   * Select "divide" from the dropdown menu
   * Press the "Calculate" button
   * Wait for 3 seconds as the website calculates
   * Test if the answer is correct
