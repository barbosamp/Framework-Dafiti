package base.framework.steps;

import base.framework.funcs.CarrinhoFunc;
import base.framework.funcs.LoginFunc;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CarrinhoStep {

    private CarrinhoFunc carrinhoFunc = new CarrinhoFunc();
    private LoginFunc loginFunc = new LoginFunc();

    @E("adicionar o produto ao carrinho")
    public void adicionarOProdutoAoCarrinho() {
        this.carrinhoFunc.adicionaProdutoAoCarrinho();
        this.carrinhoFunc.acessaSacola();
    }

    @Quando("finalizar a compra com {string}")
    public void finalizarACompraCom(String formaPagamento) {
        this.carrinhoFunc.finalizarPedido();
    }

    @Entao("deve visualizar os detelhes do produto na sacola")
    public void deveVisualizarOsDetelhesDoProdutoNaSacola() {
        this.carrinhoFunc.validarDetalhes();
    }
}
