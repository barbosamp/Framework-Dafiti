package base.framework.steps;

import base.framework.funcs.BuscaFunc;
import base.framework.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;

public class LoginStep {

    private BuscaFunc buscaFunc = new BuscaFunc();
    private LoginFunc loginFunc = new LoginFunc();

    @Dado("que o cliente esteja logado no app")
    public void queOClienteEstejaLogadoNoApp() {
        this.buscaFunc.acessarSecao();
        this.loginFunc.login();
    }
}
