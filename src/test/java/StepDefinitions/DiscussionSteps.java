package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DiscussionSteps {
    DialogContent dc = new DialogContent();
    String message;

    @When("User clicks a random assignment")
    public void userClicksARandomAssignment() {
        int randomNumber = dc.myRandomGenerator(dc.homeworks.size());
        dc.myClick(dc.homeworks.get(randomNumber));
        dc.myWait(2);
    }

    @Then("User should see the discussion icon")
    public void userShouldSeeTheDiscussionIcon() {
        dc.myDisplay(dc.discussionIcon);
    }

    @Then("User should select a person to initiate the discussion")
    public void userShouldSelectAPersonToInitiateTheDiscussion() {
        dc.myClick(dc.personIcon);
    }

    @When("User sends the message {string}")
    public void userSendsTheMessage(String message) {
        dc.myClick(dc.textarea);
        dc.textarea.sendKeys(message);
        dc.myClick(dc.sendIcon);
        this.message = message;
    }

    @Then("User should not see any confirmation message")
    public void userShouldNotSeeAnyConfirmationMessage() {
        dc.myNotFound(dc.successMessage);
    }

    @And("User should see the message text with date")
    public void userShouldSeeTheMessageTextWithDate() {
        dc.myVerifyEqualsText(dc.lastMessageInPopup, message);
        String dateString = dc.dateInPopup.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM d, yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
        LocalDate date = dateTime.toLocalDate();
        Assert.assertEquals(LocalDate.now(),date);
    }

    @Then("User should see the previous discussions")
    public void userShouldSeeThePreviousDiscussions() {
        dc.myWait(3);
        dc.myDisplay(dc.previousDiscuss);
    }
}
