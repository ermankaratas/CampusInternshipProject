package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Home",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class HomeRunner extends AbstractTestNGCucumberTests {
}
