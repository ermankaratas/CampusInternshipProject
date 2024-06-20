package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Assignment",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class Assignment extends AbstractTestNGCucumberTests {
}
