package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Calendar",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})
public class Calendar extends AbstractTestNGCucumberTests {
}
