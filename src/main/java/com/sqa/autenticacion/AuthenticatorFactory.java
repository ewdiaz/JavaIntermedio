package com.sqa.autenticacion;

import com.sqa.interfaces.Authenticator;
import com.sqa.procesos.BasicAuthenticator;
import com.sqa.procesos.OAuthAuthenticator;

public class AuthenticatorFactory {
    public static Authenticator createAuthenticator(String type) {
        switch (type) {
            case "basic":
                return new BasicAuthenticator();
            case "oauth":
                return new OAuthAuthenticator();
            default:
                throw new IllegalArgumentException("Autenticador desconocido: " + type);
        }
    }
}