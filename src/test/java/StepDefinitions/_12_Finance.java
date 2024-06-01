package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _12_Finance {
    DialogContent dc = new DialogContent();

    @Given("Click on the Element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement2(strLinkList.get(i));
            dc.myClick(linkWebElement);
        }
    }


    @When("User clicks on the My Finance")
    public void userClicksOnTheMyFinance() {
        dc.myHover(dc.hamburgerFinance);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.hamburgerMyFinance));
        dc.myClick(dc.hamburgerMyFinance);
    }
}
