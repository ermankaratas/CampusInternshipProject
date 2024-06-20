package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class SmokeRunner extends AbstractTestNGCucumberTests {
}
