package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;

import java.util.*;

public class HomeSteps {

    DialogContent dc = new DialogContent();

    @Then("User should be directed to the Company page page successfully")
    public void userShouldBeDirectedToTheCompanyPagePageSuccessfully() {
        Set<String> idler = GWD.getDriver().getWindowHandles();
        Iterator gosterge = idler.iterator(); // idlerin baş tarafına konumlan.
        String birinciSekmeId = gosterge.next().toString(); // ilk penrenin id sini aldım
        String ikinciSekmeId = gosterge.next().toString(); // ikinci penrenin id sini aldım

        dc.myWait(3);//burada yeni sayfanin acilmis ve hazir olmasi gerekiyor
        GWD.getDriver().switchTo().window(ikinciSekmeId);
        dc.myVerifyContainsCurrentUrl("techno");

    }
}
