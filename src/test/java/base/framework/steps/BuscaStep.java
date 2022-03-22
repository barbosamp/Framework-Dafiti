package base.framework.steps;

import base.framework.funcs.BuscaFunc;
import io.cucumber.java.pt.E;

public class BuscaStep {
     BuscaFunc buscaFunc =  new BuscaFunc();

    @E("que o cliente realize a busca do produto {string}")
    public void queOClienteRealizeABuscaDoProduto(String produto) throws InterruptedException {
        this.buscaFunc.buscarSku(produto);
    }
}
