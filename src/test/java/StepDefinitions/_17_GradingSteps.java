package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _17_GradingSteps extends GWD {
    DialogContent dc = new DialogContent();
    @Given("User hover over to the Grading link on the homepage")
    public void UserhoverovertotheGradinglinkonthehomepage() {
        dc.myClick(dc.Gradingbutton);
    }

    @When("User clicks on the Student Transcript")
    public void UserclicksontheStudentTranscript() {
        dc.myClick(dc.Studenttranscript);
    }

    @Then("User clics print button on the Student Transcript")
    public void UserclicsprintbuttonontheStudentTranscript() {
        dc.myWait(2);
        dc.myClick(dc.Studenttranscriptdownload);
    }

    @And("User prints the opened Page")
    public void UserprintstheopenedPage() {
        dc.myWait(2);
        dc.myClick(dc.Studenttranscriptprint);
    }

    @Then("User saves the File")
    public void UsersavestheFile() {
        dc.myWait(2);
        dc.myClick(dc.Studenttranscriptsave);
    }

    @When("User clicks on the Course Grade")
    public void UserclicksontheCourseGrade() {
        dc.myClick(dc.coursegrade);
    }

    @Then("User clicks download button on the Course Grade")
    public void UserclicksdownloadbuttonontheCourseGrade() {
        dc.myWait(2);
        dc.myClick(dc.coursegradedownload);
    }
    @And("User prints the opened Page2")
    public void UserprintstheopenedPage2() {
        dc.myWait(2);
        dc.myClick(dc.coursegradeprint);
    }

    @Then("User saves the File2")
    public void UsersavestheFile2() {
        dc.myWait(2);
        dc.myClick(dc.coursegradesave);
    }







}
