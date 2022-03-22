package base.framework.common;


import base.framework.interfaces.AppInt;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static AppiumDriver driver;
    public static Wait wait;

    protected void inicializarDriver(AppInt app) throws MalformedURLException {
        driver = app.getDriver();
        wait = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight() * 0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();

    }

    public String readProperties(String properties, String info) {
        String contents = null;
        try {
            FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/resources/address.properties");
            Properties p = new Properties();
            p.load(reader);
            contents = p.getProperty(info);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contents;
    }

    public void scrollUp() {
        Dimension dimension = driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight() * 0.2;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight() * 0.7;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();

    }

    public void quitDriver() {
        if (driver != null)
            driver.quit();
    }
}
