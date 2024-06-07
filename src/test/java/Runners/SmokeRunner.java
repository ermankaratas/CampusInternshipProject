package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class SmokeRunner extends AbstractTestNGCucumberTests {
}
