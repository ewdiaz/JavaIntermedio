package com.sqa.procesos;

import com.sqa.autenticacion.AbstractAuthenticator;

public class BasicAuthenticator extends AbstractAuthenticator {
    public BasicAuthenticator() {
        super("Autenticacion basica");
    }

    @Override
    public boolean authenticate(String username, String password) {
        logAttempt(username);
        return "usuario".equals(username) && "contraseña".equals(password);
    }
}


