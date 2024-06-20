package Runners;

import io.cucumber.testng.*;

@CucumberOptions(
        tags = "@Grading",
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar calsitirilir
        glue = {"StepDefinitions"})

public class Grading extends AbstractTestNGCucumberTests {
}
