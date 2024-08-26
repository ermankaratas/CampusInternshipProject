package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();  // her bir THREAD (HAT) e özel STATIC
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();  // her bir THREAD (HAT) e özel BROWSER

    // Hatta (Thread e) özel her şeyi THREADLOCAL e koyarız
    // örneğin data gönderirsek de bunu kullanırız

// threadDriver.get() -> bulunduğu hat taki driver ı ver
// threadDriver.set() -> bulunduğu hat a bir driver set et

    // her bir sürecin kendine özel STATIC driveri olmalı : LOCAL STATIC diyeceğiz
    // süreç = Thread (demek bilgisayar dilinde)
    // Thread.sleep => ilgili süreci durduruyor belli bir süre
    // her bir Thread in kendine özel STATIC i olmalı, yani LOCAL STATIC


    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");    // hiçbirşey gelmezse yani XML den çalışmayan durumlarda default değer atadık

        if (threadDriver.get() == null) {   // hatta driver yoksa 1 kez oluştur
//            WebDriver driver = new ChromeDriver();
//            threadDriver.set(driver);

            switch (threadBrowserName.get())   // ismi XML den gönderiyorum
            {
                case "chrome":
                    // Jenkins için eklenmesi gereken kısım, burası jenkins çalışmayacağı zaman eklenirse
                    // cucumber de çalışmaz
                    // ChromeOptions options = new ChromeOptions();
                    // options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    // ------- o nedenle if koşulu ekleyerek her durumda geçerli bir durum elde ettik ---------
                    if (isRunningOnJenkins()) {
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                        threadDriver.set(new ChromeDriver(options));  // bunu ben ekledim, else dekiyle aynı olsun diye
                    } else {
                        ChromeOptions options = new ChromeOptions();  // search engine sorusundan kurtulmak için eklendi
                        options.addArguments("--disable-search-engine-choice-screen"); // search engine sorusundan kurtulmak için eklendi
                        threadDriver.set(new ChromeDriver(options));
                    }
                    break;
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
            }

            // threadDriver.set(new ChromeDriver());               // bulunduğum hatta driver yoktu, 1 tane set ettim
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return threadDriver.get();
    }

    public static boolean isRunningOnJenkins() {      // Jenkins için eklendi
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }

    public static void quitDriver() {
        // test sonucu ekranı bir miktar beklesin
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {   // bu hatta driver var ise

            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();   // hattaki driverı aldım, garanti olsun diye böyle yapıyoruz
            driver = null;                  // içini boşalttım
            threadDriver.set(driver);      // null driver ı tekrar hatta atadım
        }
    }
}
