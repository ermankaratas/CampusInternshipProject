package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _11_Finance {
    DialogContent dc = new DialogContent();
    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));

    @And("User should be able to pay using Stripe")
    public void userShouldBeAbleToPayUsingStripe(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strLinkList.get(i));
            dc.myJavaScriptClick(linkWebElement);
        }
    }


    @And("User inputs their credit card information, and completes the payment")
    public void userInputsTheirCreditCardInformationAndCompletesThePayment() {

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure payment input frame']")));
    WebElement iframe=GWD.getDriver().findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
    GWD.getDriver().switchTo().frame(iframe);
    String cardNummer="4242424242424242";
    dc.mySendKeys(dc.cardNumber,cardNummer);

    int month=dc.myRandomGenerator(12);
    String strmonth=String.valueOf(month);
    String year="26";

    String expiration=strmonth+year;
    dc.mySendKeys(dc.expiration,expiration);

    int cvc=dc.myRandomGenerator(999);
    String strcvc=String.valueOf(cvc);
    dc.mySendKeys(dc.cvc,strcvc);

        GWD.getDriver().switchTo().parentFrame();
        dc.myJavaScriptClick(dc.StripePaymentsButton);

    }

    @Then("User determines as $ {string} and clicks the pay Button")
    public void userDeterminesAs$AndClicksThePayButton(String amount) throws AWTException {
        dc.mySendKeys(dc.amountInput,amount);
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
        dc.myClick(dc.payButton);


    }
}
