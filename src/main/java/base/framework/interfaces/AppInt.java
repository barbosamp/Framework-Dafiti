package base.framework.interfaces;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface AppInt {

    AppiumDriver getDriver() throws MalformedURLException;
}
