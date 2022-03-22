package base.framework.configuration;

import base.framework.common.BaseTest;
import base.framework.enums.App;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;


public class Hooks extends BaseTest {

    @Before
    public void beforeTest() throws MalformedURLException {
        super.inicializarDriver(App.ANDROID);
    }

    @After
    public void afterTest(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        driver.quit();
    }

    

}
