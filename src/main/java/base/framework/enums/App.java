package base.framework.enums;

import base.framework.interfaces.AppInt;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public enum App implements AppInt {

    ANDROID("ANDROID") {
        @Override
        public AppiumDriver getDriver() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            String path = System.getProperty("user.dir");
            String apkFolder = path + "/src/test/java/app/base.apk";
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Xiaomi");
            capabilities.setCapability("appPackage", "br.com.dafiti");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("app",  apkFolder);
            capabilities.setCapability("autoGrantPermissions",true);
            capabilities.setCapability("udid","359dacab");
            return new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        }
    }

    ;
    App(String android) {
    }
}
