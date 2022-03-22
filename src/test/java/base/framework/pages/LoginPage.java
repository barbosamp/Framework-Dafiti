package base.framework.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static base.framework.common.BaseTest.driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "login_button")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "user_identification")
    private AndroidElement userIdentification;

    @AndroidFindBy(id = "user_password")
    private AndroidElement userPassword;

    @AndroidFindBy(id = "login_or_create_button")
    private AndroidElement loginOrCreateButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"br.com.dafiti:id/label\" and @text=\"Entrar\"]")
    private AndroidElement buttonEntrance;

    public AndroidElement getButtonEntrance() {
        return buttonEntrance;
    }

    public AndroidElement getLoginButton() {
        return loginButton;
    }

    public AndroidElement getUserIdentification() {
        return userIdentification;
    }

    public AndroidElement getUserPassword() {
        return userPassword;
    }

    public AndroidElement getLoginOrCreateButton() {
        return loginOrCreateButton;
    }
}
