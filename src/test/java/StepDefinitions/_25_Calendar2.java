package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _25_Calendar2 {

    DialogContent dc=new DialogContent();
    @Given("As a Student  click CalendarMenu Button and Calendar")
    public void asAStudentClickCalendarMenuButtonAndCalendar() {
        dc.myClick(dc.CalendarMenu);
        dc.myClick(dc.calendarButton);

    }

    @When("Student click previous button")
    public void studentClickPreviousButton() {
        dc.myClick(dc.leftButton);
    }

    @Then("Student click on a ended course")
    public void studentClickOnAEndedCourse() {
        dc.myClick(dc.pubLesson);
    }

    @And("Click to Recording Button and click Starting")
    public void clickToRecordingButton() {
        dc.myWait(1);
        dc.myClick(dc.Recordingbutton);


        dc.myClick(dc.Playvideo);
    }


}
