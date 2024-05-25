package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AttendanceSteps {
    DialogContent dc = new DialogContent();
    @Then("User should see {string} pop-up window")
    public void userShouldSeePopUpWindow(String title) {
        dc.myVerifyContainsTextWithoutEsc(dc.dialogTitle,title);
    }

    @Given("User choose {string} and select {string}")
    public void userChooseAndSelect(String dateType, String selectedType) {
        dc.myClick(dc.getWebElement(dateType));
        dc.myClick(dc.getWebElement(selectedType));
    }

    @And("User choose a date {int} days later")
    public void userChooseADateDaysLater(int days) {
        dc.myClear(dc.date);
        dc.date.sendKeys(dc.getDateAfterDays(days));
    }

    @And("User types {string} message")
    public void userTypesMessage(String message) {
        dc.myClick(dc.excuseMessage);
        dc.excuseMessage.sendKeys(message);
    }

    @When("User clicks {string} button")
    public void userClicksButton(String buttonName) {
        dc.myJavaScriptClick(dc.getWebElement(buttonName));
    }

    @And("User selects {string}")
    public void userSelects(String option) {
        dc.myClick(dc.getWebElement(option));
    }

    @And("User enters the file path: {string} to the computer")
    public void userEntersTheFilePathToTheComputer(String filename) throws AWTException{
        Robot robot = new Robot();

        dc.myWait(1);

        dc.myCopyToClipboard(filename);

        robot.keyPress(KeyEvent.VK_CONTROL);
        dc.myWait(1);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @And("User choose a date {int} days later for {int} days")
    public void userChooseADateDaysLaterForDays(int dayFirst, int dayLength) {
        dc.myJavaScriptClick(dc.startDate);
        dc.startDate.sendKeys(dc.getDateAfterDays(dayFirst));
        dc.myJavaScriptClick(dc.endDate);
        dc.endDate.sendKeys(dc.getDateAfterDays(dayFirst + dayLength));
    }
}
