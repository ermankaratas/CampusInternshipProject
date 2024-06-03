package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;

public class _03_TOPButtonHome {
    DialogContent dc = new DialogContent();
    TopNav tn=new TopNav();
    
    
    @When("Click Coures Button")
    public void clickCouresButton() {
        dc.myClick(tn.coursesButton);
    }

    @Then("Should be Welcome")
    public void shouldBeWelcome() {
        dc.myVerifyContainsText(tn.welcomeText, "Welcome, Student_9 11A !");
    }

    @When("Click Calendar Button")
    public void clickCalendarButton() {
        dc.myClick(tn.calendarButton);
    }

    @Then("Should be Calendar word")
    public void shouldBeCalendarWord() {
        dc.myVerifyContainsText(tn.calendarText, "Calendar");
    }

    @When("Click Attendance button")
    public void clickAttendanceButton() {
        dc.myClick(tn.attendanceButton);
    }

    @Then("Should be Attendance word")
    public void shouldBeAttendanceWord() {
        dc.myVerifyContainsText(tn.attendanceText, "Attendance");
    }

    @When("Click Assignments button")
    public void clickAssignmentsButton() {
        dc.myClick(tn.assignmentsButton);
    }

    @Then("Should see Assifnments")
    public void shouldSeeAssifnments() {
        dc.myVerifyContainsText(tn.assigmentsText, "Assignments");
    }

    @When("Click Grading button")
    public void clickGradingButton() {
        dc.myClick(tn.gradingButton);
    }

    @Then("Should see Grading")
    public void shouldSeeGrading() {
        dc.myVerifyContainsText(tn.gradingText, "Grading");
    }

    @When("Click Hamburg button")
    public void clickHamburgButton() {
        dc.myClick(dc.hamburgerMenu);
    }

    @Then("Should see Messaging,Finance,Education,Video Conference,Surveyd")
    public void shouldSeeMessagingFinanceEducationVideoConferenceSurveyd() {
        List<String> stringList = Arrays.asList("Messaging", "Finance", "Education", "Video Conference", "Surveys");
        dc.myClick(tn.hamburgerMenu);
       dc.verifyMenuItems(tn.hamburgMenuList, stringList);
    }

    @When("Click Chats button")
    public void clickMessageButton() {
        dc.myClick(tn.chatsButton);
    }


    @Then("Should see Student_9_11A")
    public void shouldSeeStudent_9_11A_() {
        dc.myVerifyContainsText(tn.chatsWindow, "Student_9 11A");
    }

    @When("Click Messages button")
    public void clickMessagesButton() {
        dc.myClick(tn.messageBoxButton);
    }


    @Then("Should see Messages window")
    public void shouldSeeMessagesWindow() {
        dc.myVerifyContainsText(tn.messagesText, "Messages");
    }

    @When("Click Profile button")
    public void clickProfileButton() {
        dc.myClick(tn.profileButton);
    }

    @Then("Should see My Certificates,My Files,Change Password,Settings,Sign Out")
    public void shouldSeeMyCertificatesMyFilesChangePasswordSettingsSignOut() {
        List<String> stringList = Arrays.asList("My Certificates","My Files","Change Password","Settings","Sign Out");
        dc.verifyMenuItems(tn.profileButtonList,stringList);
    }
}
