package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Assignment",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class Assignment extends AbstractTestNGCucumberTests {
}
