package com.sqa.procesos;

import com.sqa.autenticacion.AbstractAuthenticator;

public class OAuthAuthenticator extends AbstractAuthenticator {
    public OAuthAuthenticator() {
        super("Autenticacion OAuth");
    }

    @Override
    public boolean authenticate(String username, String password) {
        logAttempt(username);
        return "usuarioOAuth".equals(username) && "contraseñaOAuth".equals(password);
    }
}

