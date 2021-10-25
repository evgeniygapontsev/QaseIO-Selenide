package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.PropertyReader;
import utils.TestListener;


@Listeners(TestListener.class)
public class BaseTest {

String user;
String pass;

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 60000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = System.getenv().getOrDefault
                ("QASE_URL", PropertyReader.getProperty("qase.url"));
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;

        user = System.getenv().getOrDefault("QASE_USER", PropertyReader.getProperty("qase.user"));
        pass = System.getenv().getOrDefault("QASE_PASS", PropertyReader.getProperty("qase.pass"));

    }
}
