package base.framework.funcs;

import base.framework.common.BaseTest;
import base.framework.enums.Credentials;
import base.framework.pages.BuscaPage;
import base.framework.pages.CarrinhoPage;
import base.framework.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginFunc extends BaseTest {

    private LoginPage loginPage = new LoginPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();
    private BuscaPage buscaPage = new BuscaPage();

    public void login(){
        this.buscaPage.getNavigationAccount().click();
        this.loginPage.getButtonEntrance().click();
        wait.until(ExpectedConditions.visibilityOf(this.loginPage.getLoginButton()));
        this.loginPage.getLoginButton().click();
        wait.until(ExpectedConditions.visibilityOf(this.loginPage.getUserIdentification()));
        this.loginPage.getUserIdentification().sendKeys(Credentials.VALIDO.user());
        this.loginPage.getUserPassword().sendKeys(Credentials.VALIDO.password());
        this.loginPage.getLoginOrCreateButton().click();
    }

}
