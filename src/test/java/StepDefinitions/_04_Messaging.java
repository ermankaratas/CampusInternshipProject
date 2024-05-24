package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_Messaging extends GWD {
    DialogContent dc = new DialogContent();
    @Given("User hover over to the Messaging link at the Hamburger menu on the homepage")
    public void userHoverOverToTheMessagingLinkAtTheHamburgerMenuOnTheHomepage() {
        dc.myClick(dc.hamburgerMenu);
        dc.myHover(dc.hamburgerMessaging);
    }

    @When("User clicks on the New Message")
    public void userClicksOnTheNewMessage() {
        dc.myClick(dc.hamburgerNewMessage);
    }

    @Then("User should see the New Message page successfully")
    public void userShouldSeeTheNewMessagePageSuccessfully() {
        dc.myVerifyContainsText(dc.hamburgerNewMessage,"New Message");
    }
}
