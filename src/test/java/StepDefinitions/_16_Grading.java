package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _16_Grading {
    DialogContent dc = new DialogContent();

    @And("User should be able to see transcripts")
    public void userShouldBeAbleToSeeTranscripts() {
        dc.myVerifyContainsText(dc.internShipText,"Internship");
    }

    @And("User should be able to see subject")
    public void userShouldBeAbleToSeeSubject() {
        dc.myVerifyContainsText(dc.subjectText,"Subject");
    }

    @And("User should be able to see grade")
    public void userShouldBeAbleToSeeGrade() {
        dc.myVerifyContainsText(dc.averageText,"AVERAGE");
    }
}
