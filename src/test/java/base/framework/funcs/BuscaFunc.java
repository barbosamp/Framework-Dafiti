package base.framework.funcs;


import base.framework.common.BaseTest;
import base.framework.pages.BuscaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BuscaFunc extends BaseTest {

    BuscaPage buscaPage = new BuscaPage();


    public void buscarSku(String produto) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(this.buscaPage.getSearchInput()));
        this.buscaPage.getSearchInput().click();

        Thread.sleep(2000);
        this.buscaPage.getImageSearch().click();

        wait.until(ExpectedConditions.elementToBeClickable(this.buscaPage.getButtonNo()));
        this.buscaPage.getButtonNo().click();

        wait.until(ExpectedConditions.elementToBeClickable(this.buscaPage.getSearchInput()));
        this.buscaPage.getSearchInput().sendKeys(produto);

        String xpathProcuct = "//android.widget.TextView[@resource-id='br.com.dafiti:id/suggestion' and @text='"+produto+"']";
        driver.findElement(By.xpath(xpathProcuct)).click();

        acessarPrimeiroProdutoLista();
    }

    public void acessarPrimeiroProdutoLista() throws InterruptedException {
        Thread.sleep(2000);
        this.buscaPage.getProducts().get(0).click();
    }

    public void acessarSecao(){
        this.buscaPage.getSectionFeminime().click();
    }
}
