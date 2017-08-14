import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static com.gargoylesoftware.htmlunit.BrowserVersion.CHROME;
import static screenshot.ScreenShot.capturesScreenshotFile;

public class HtmlUnitTest {
    public static HtmlUnitDriver driver;
    protected static final String BASE_URL = "https://192.168.100.26/";
    protected static final String BASE_URL1 = "https://mail.ru/";
    @BeforeClass
    public static void setUp()
    {
        driver = new HtmlUnitDriver(CHROME);
    //   driver = new HtmlUnitDriver();
        driver.setJavascriptEnabled(true);
    }

    @Test
    public void homePage() {
        driver.get(BASE_URL1);
        capturesScreenshotFile(driver, "HtmlUnitFile");
    }


}
