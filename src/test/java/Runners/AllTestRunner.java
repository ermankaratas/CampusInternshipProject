package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"}
)

public class AllTestRunner extends AbstractTestNGCucumberTests {
}
