package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.username, "Student_9");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.myVerifyContainsText(dc.headText, "Internship");
    }
}
