package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;

public class _09_Finance {

    DialogContent dc = new DialogContent();

    @Given("User hover over to the Finance link at the Hamburger menu on the homepage")
    public void userHoverOverToTheFinanceLinkAtTheHamburgerMenuOnTheHomepage() {
        dc.myClick(dc.hamburgerMenu);
        dc.myClick(dc.hamburgerFinance);
    }

    @When("User click MyFinance button")
    public void userClickMyFinanceButton() {

        dc.myClick(dc.hamburgerMyFinance);
    }

    @Then("User should see the Students Fees page successfully")
    public void userShouldSeeTheStudentsFeesPageSuccessfully() {
        dc.myWait(2);
        dc.myVerifyContainsTextWithoutEsc(dc.StudentFees, "Students Fees");
    }

    @When("User click Username line")
    public void userClickUsernameLine() {
        dc.myWait(2);
        dc.myClick(dc.StudentLine);

    }


    @Then("User click Fee-Balance Detail button")
    public void userClickFeeBalanceDetailButton() {

        dc.myClick(dc.FeeBalanceDetail);
    }


    @And("User should see Finance table on the window")
    public void userShouldSeeFinanceTableOnTheWindow() {
        dc.myVerifyContainsText(dc.FinanceTable, "Date");

    }


}



