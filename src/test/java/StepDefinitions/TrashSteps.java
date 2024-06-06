package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class TrashSteps {
    DialogContent dc = new DialogContent();

    @Then("User should see the {string} menu")
    public void userShouldSeeTheMenu(String menuName) {
        dc.myVerifyContainsTextWithoutEsc(dc.getWebElement(menuName), menuName);
        //dc.myClick(dc.hamburgerMessaging);
    }

    @When("User clicks on the {string} menu")
    public void userClicksOnTheMenu(String menuName) {
        dc.myClick(dc.getWebElement(menuName));
    }

    @Then("User should go to {string} page successfully")
    public void userShouldGoToPageSuccessfully(String url) {
        dc.myVerifyContainsCurrentUrl(url);
    }

    @And("User should see the {string} icon on the page")
    public void userShouldSeeTheIconOnThePage(String iconName) {
        Assert.assertTrue(dc.myGetAttribute(dc.getWebElement(iconName), "icon").contains(iconName));
    }

    @When("User clicks on the {string} icon")
    public void userClicksOnTheIcon(String iconName) {
        dc.myJavaScriptClick(dc.getWebElement(iconName));
    }

    @Then("User gets a confirmation message")
    public void userGetsAConfirmationMessage() {
        dc.myVerifyContainsTextWithoutEsc(dc.successMessage, "success");
    }

    @Then("User should see confirmation message on the pop-up window")
    public void userShouldSeeConfirmationMessageOnThePopUpWindow() {
        dc.myVerifyContainsTextWithoutEsc(dc.deleteMessage, "delete");
    }

    @When("User clicks on the {string} button on the pop-up window")
    public void userClicksOnTheButtonOnThePopUpWindow(String buttonName) {
        dc.myClick(dc.getWebElement(buttonName));
    }
}
