package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _06_DeletingMessages {
    DialogContent dc=new DialogContent();
    @Given("User clicks on Hamburger Menu>Messaging>Outbox link")
    public void userClicksOnHamburgerMenuMessagingOutboxLink() {
        dc.myClick(dc.hamburgerMenu);
        dc.myHover(dc.hamburgerMessaging);
        dc.myClick(dc.outbox);
    }

    @When("User clicks on the trash icon")
    public void userClicksOnTheTrashIcon() {dc.myClick(dc.moveToTrash);
    }

    @Then("User sees the Confirm pop up window")
    public void userSeesTheConfirmPopUpWindow() {
        Assert.assertTrue(dc.confirmDeleteOutboxMessage.isDisplayed(), "The confirm pop up window is not opened");
    }

    @And("User clicks on the Yes button in pop up window")
    public void userClicksOnTheYesButtonInPopUpWindow() {
        dc.myClick(dc.yesDelete);
    }
}
