package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class IconsSteps {
    DialogContent dc = new DialogContent();

    @Given("User should see that each assignment has {string} icon")
    public void userShouldSeeThatEachAssignmentHasIcon(String icon) {
        dc.myWait(3);
        Assert.assertEquals(dc.assignmentsRow.size(), dc.getListWebElement(icon).size(), "Total assignments mismatch!");
    }

    @When("User clicks a random {string} icon")
    public void userClicksARandomIcon(String icon) {
        int randomNumber = dc.myRandomGenerator(dc.getListWebElement(icon).size());
        dc.myJavaScriptClick(dc.getListWebElement(icon).get(randomNumber));
    }

    @And("User should return from the page")
    public void userShouldReturnFromThePage() {
        dc.myClick(dc.returnButton);
        dc.myWait(2);
    }

    @And("User should close the pop-up window")
    public void userShouldCloseThePopUpWindow() {
        dc.myClick(dc.closeButton);
    }
}
