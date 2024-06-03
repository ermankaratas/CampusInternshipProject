package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarCoursePlanSteps {
    DialogContent dc = new DialogContent();

    @Then("User should see the todays Weekly Course Plan")
    public void userShouldSeeTheTodaysWeeklyCoursePlan() {
        dc.myWait(2);
        String dateRangeText = dc.weekDate.getText();
        int currentYear = LocalDate.now().getYear();
        String startDateStr = dateRangeText.split(" ")[0] + " " +
                dateRangeText.split(" ")[1].substring(0, 3) + " " + currentYear;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = startDate.plusDays(6);
        LocalDate today = LocalDate.now();
        Assert.assertFalse((today.isBefore(startDate) && today.isAfter(endDate)));
    }

    @And("User should see icons meanings")
    public void userShouldSeeIconsMeanings(DataTable icons) {
        List<List<String>> listIcons = icons.asLists(String.class);

        for (int i = 0; i < listIcons.size(); i++) {
            String[] text = dc.getWebElement(listIcons.get(i).get(0)).getText().split("\\r?\\n");
            Assert.assertEquals(listIcons.get(i).get(0), text[0]);
            Assert.assertEquals(listIcons.get(i).get(1), text[1]);
        }
    }

    @Then("User should see the {string} page")
    public void userShouldSeeThePage(String calendar) {

        dc.myVerifyContainsText(dc.googleCalendar, calendar);
    }

    @When("User clicks {string} icon {int} times")
    public void userClicksIconTimes(String icon, int times) {
        for (int i = 0; i < times; i++) {
            dc.myClick(dc.getWebElement(icon));
        }
    }

    @Then("User should navigate {string} in the calendar")
    public void userShouldNavigateInTheCalendar(String direction) {
        dc.myWait(2);
        String dateRangeText = dc.weekDate.getText();
        int currentYear = LocalDate.now().getYear();
        String startDateStr = dateRangeText.split(" ")[0] + " " +
                dateRangeText.split(" ")[1].substring(0, 3) + " " + currentYear;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate today = LocalDate.now();
        if (direction.equals("forward"))
            Assert.assertTrue((today.isBefore(startDate)));
        else
            Assert.assertTrue((today.isAfter(startDate)));
    }

    @When("User clicks {string} icon")
    public void userClicksIcon(String icon) {
        dc.myClick(dc.getWebElement(icon));
    }

    @When("User clicks on the course in the weekly course plan")
    public void userClicksOnTheCourseInTheWeeklyCoursePlan() {
        int lessonNumber = Pages.ParentPage.myRandomGenerator(20) + 1;
        dc.myClick(dc.getWebElement(String.valueOf(lessonNumber)));
    }
}
