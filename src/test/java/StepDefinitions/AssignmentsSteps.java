package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.testng.Assert;

public class AssignmentsSteps {
    DialogContent dc = new DialogContent();

    String numberOfAssignments;

    @When("User hovers over the Assignments menu")
    public void userHoversOverTheAssignmentsMenu() {
        dc.myVerifyContainsText(dc.assignments, "Assignments");
        dc.myHover(dc.assignments);
        numberOfAssignments = dc.numberOfAssignments.getText();
    }

    @Then("User should see the total number of Assignments")
    public void userShouldSeeTheTotalNumberOfAssignments() {
        dc.myDisplay(dc.numberOfAssignments);
    }

    @And("user should see all the assignments")
    public void userShouldSeeAllTheAssignments() {
        dc.myClick(dc.semester);
        dc.myClick(dc.allOption);
        int totalAssignments = Integer.parseInt(numberOfAssignments);
        dc.myWait(2);
        Assert.assertEquals(dc.assignmentsRow.size(), totalAssignments, "Total assignments mismatch!");
    }
}
