package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _10_FeeSteps extends GWD {

    DialogContent dc = new DialogContent();
    @Given("User hover over to the Finance link at the Hamburger menu on homepage")
    public void userHoverOverToTheFinanceLinkAtTheHamburgerMenuOnTheHomepage() {
        dc.myClick(dc.hamburgerMenu);
        dc.myHover(dc.hamburgerFinance);
    }
    @When("User clicks on My Finance")
    public void UserclicksontheMyFinance() {
        dc.myHover(dc.hamburgerMyFinance);
        dc.myClick(dc.hamburgerMyFinance);
   }

    @Then("User enters Payment page")
    public void UserentersPaymentpage() {
        dc.myClick(dc.Studentbutton);
    }
    @And("User selects Provider for Payment")
    public void UserselectsProviderforPayment() {
        dc.myClick(dc.Stripe);
    }

    @Then("User enters amount of paying")
    public void Userentersamountofpaying() {
        dc.myClick(dc.PayinFullButton);
        dc.myClick(dc.Payinput);
        dc.myClick(dc.Amountfield);
        dc.mySendKeys(dc.Amountfield, "1");
        dc.myClick(dc.Paybutton);
    }
    @And("User enters data of payments")
    public void Userentersdataofpayments() {
        dc.mySendKeys(dc.Cardnumberfield, "4242424242424242");
        dc.mySendKeys(dc.Expirationfield, "1228");
        dc.mySendKeys(dc.Cvcfield, "123");
        dc.myClick(dc.paymentbutton);
    }
    @Then("User should see the Payment Verify Text successfully")
    public void UsershouldseethePaymentVerifyTextsuccessfully() {
        dc.myVerifyContainsText(dc.Paymentverify,"Student Payment successfully created");

    }
    @When("User clicks on the Message Button")
    public void UserclicksontheMessageButton() {
     dc.myClick(dc.messagebutton);
    }
    @Then("User should click the last Payment")
    public void UsershouldclickthelastPayment() {
dc.myClick(dc.messagebutton);

    }
    @And("User click the last Payment Status")
    public void UserclickthelastPaymentStatus() {
    dc.myVerifyContainsText(dc.paymentstatus,"00:18");
    dc.myClick(dc.paymentstatusbttn);

    }
    @Then("User should see Verifying Text about the last Payment Status")
    public void UsershouldseeVerifyingTextaboutthelastPaymentStatus() {
    dc.myHover(dc.paymentstatustext);
    dc.myVerifyContainsText(dc.paymentstatustext, "pi_3PKpolLLiYGgcZNg0LjrJjfv");

    }

}
