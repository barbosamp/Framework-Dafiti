package base.framework.funcs;

import base.framework.common.BaseTest;
import base.framework.common.VariaveisEstaticas;
import base.framework.pages.CarrinhoPage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarrinhoFunc extends BaseTest {

    private CarrinhoPage carrinhoPage = new CarrinhoPage();
    private VariaveisEstaticas variaveisEstaticas = new VariaveisEstaticas();

    public void adicionaProdutoAoCarrinho(){
        capturaDetalhes();
        this.carrinhoPage.getSizeItemLabel().get(0).click();
        this.carrinhoPage.getBuyButton().click();

    }

    void capturaDetalhes(){
        variaveisEstaticas.setTamanhoProduto(this.carrinhoPage.getSizeItemLabel().get(0).getText());
        variaveisEstaticas.setValorProduto(this.carrinhoPage.getCurrentPrice().getText());
        variaveisEstaticas.setNomeProduto(this.carrinhoPage.getProductName().getText());
    }

    public void acessaSacola(){
        wait.until(ExpectedConditions.visibilityOf(this.carrinhoPage.getOpenCartButton()));
        this.carrinhoPage.getOpenCartButton().click();

    }

    public void finalizarPedido(){
        this.carrinhoPage.getCartBottomButton().click();
    }

    public void validarDetalhes(){
        String itemPriceCart = this.carrinhoPage.getItemPriceNormal().getText();
        String itemSizeCart = this.carrinhoPage.getItemSizeCart().getText();
        String itemDescCart = this.carrinhoPage.getItemDescCart().getText();

        Assert.assertEquals(variaveisEstaticas.getNomeProduto(), itemDescCart);
        Assert.assertEquals(variaveisEstaticas.getTamanhoProduto(), itemSizeCart);
        Assert.assertEquals(variaveisEstaticas.getValorProduto(), itemPriceCart);


    }
}
