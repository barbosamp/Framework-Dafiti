package base.framework.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static base.framework.common.BaseTest.driver;

public class BuscaPage {

    public BuscaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "search_input")
    private AndroidElement searchInput;

    @AndroidFindBy(id = "image_search")
    private AndroidElement imageSearch;

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement buttonNo;

    @AndroidFindBy(id = "image")
    private List<AndroidElement> products;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"br.com.dafiti:id/segment_name\" and @text=\"Feminino\"]")
    private AndroidElement sectionFeminime;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='br.com.dafiti:id/text' and @text='Minha Conta']")
    private AndroidElement navigationAccount;

    public AndroidElement getNavigationAccount() {
        return navigationAccount;
    }

    public AndroidElement getImageSearch() {
        return imageSearch;
    }

    public List<AndroidElement> getProducts() {
        return products;
    }

    public AndroidElement getButtonNo() {
        return buttonNo;
    }

    public AndroidElement getSearchInput() {
        return searchInput;
    }

    public AndroidElement getSectionFeminime() {
        return sectionFeminime;
    }
}
