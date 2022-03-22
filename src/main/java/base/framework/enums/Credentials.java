package base.framework.enums;

import base.framework.interfaces.CredentialsInt;

public enum Credentials implements CredentialsInt {

    VALIDO{
        @Override
        public String user() {
            return "automacaoframe@outlook.com";
        }

        @Override
        public String password() {
            return "Teste@123";
        }
    };
}
