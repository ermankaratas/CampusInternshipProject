package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.*;
import org.openqa.selenium.*;

public class Hooks {
    @Before// Cucumber ın Annotation ı
    public void before() {
        // System.out.println("Senaryo başladı");
    }

    @After // Cucumber ın Annotation ı
    // her senaryodan sonra çalışır
    public void after(Scenario senaryo) {

        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestSonuclari.xlsx",
                senaryo.getName() + " " + (senaryo.isFailed() ? "Failed" : "Passed"));

        //senaryo fail olduysa ekran kaydı al
        if (senaryo.isFailed()) {
// aşağıdaki bölüm sadece extend report plugini devrede ise açılır
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        GWD.quitDriver();
    }
}
