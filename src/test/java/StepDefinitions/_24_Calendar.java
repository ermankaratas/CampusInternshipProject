package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _24_Calendar {

    DialogContent dc = new DialogContent();

    @Given("Student click Calendar Menu button and Weekly Course Plan")
    public void studentClickCalendarMenuButtonAndWeeklyCoursePlan() {

        dc.myClick(dc.CalendarMenu);
        dc.myClick(dc.weeklyPlan);
    }


    @When("Student click an any course and verify course name information")
    public void studentClickAnAnyCourseAndVerifyCourseInformation() {
        dc.myWait(2);
        dc.myClick(dc.biology);

        dc.myVerifyContainsText(dc.biology,"Biology");

    }



    @Then("Student click on a course that is not published and verify teacher name information")
    public void studentClickOnACourseThatIsNotPublishedAndVerifyTeacherNameInformation() {

        dc.myVerifyContainsText(dc.DialogPage,"Teacher");
    }


}
