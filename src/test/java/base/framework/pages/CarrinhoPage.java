package base.framework.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static base.framework.common.BaseTest.driver;

public class CarrinhoPage {

    public CarrinhoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "buy_button")
    private AndroidElement buyButton;

    @AndroidFindBy(id = "size_item_label")
    private List<AndroidElement> sizeItemLabel;

    @AndroidFindBy(id = "current_price")
    private AndroidElement currentPrice;

    @AndroidFindBy(id = "product_name")
    private AndroidElement productName;

    @AndroidFindBy(id = "open_cart_button")
    private AndroidElement openCartButton;

    @AndroidFindBy(id = "cart_bottom_button")
    private AndroidElement cartBottomButton;

    @AndroidFindBy(id = "item_size")
    private AndroidElement itemSizeCart;

    @AndroidFindBy(id = "item_price_normal")
    private AndroidElement itemPriceNormal;

    @AndroidFindBy(id = "item_desc")
    private AndroidElement itemDescCart;

    public AndroidElement getItemDescCart() {
        return itemDescCart;
    }

    public AndroidElement getItemSizeCart() {
        return itemSizeCart;
    }

    public AndroidElement getItemPriceNormal() {
        return itemPriceNormal;
    }

    public AndroidElement getBuyButton() {
        return buyButton;
    }

    public List<AndroidElement> getSizeItemLabel() {
        return sizeItemLabel;
    }

    public AndroidElement getCurrentPrice() {
        return currentPrice;
    }

    public AndroidElement getProductName() {
        return productName;
    }

    public AndroidElement getOpenCartButton() {
        return openCartButton;
    }

    public AndroidElement getCartBottomButton() {
        return cartBottomButton;
    }
}
