package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Messaging",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class MessageRunner extends AbstractTestNGCucumberTests {
}
