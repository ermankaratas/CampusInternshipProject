package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_08_HamburgerMenuFinance.feature",
                "src/test/java/FeatureFiles/_09_HamburgerMenuFinance.feature",
                "src/test/java/FeatureFiles/_11_HamburgerMenu_Finance.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class ExtentReportRunner extends AbstractTestNGCucumberTests {
}
