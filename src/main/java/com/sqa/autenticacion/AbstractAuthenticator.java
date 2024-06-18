package com.sqa.autenticacion;
import com.sqa.interfaces.Authenticator;

public abstract class AbstractAuthenticator implements Authenticator {
    protected String authType;

    public AbstractAuthenticator(String authType) {
        this.authType = authType;
    }

    protected void logAttempt(String username) {
        System.out.println("Autenticacion de usuario: " + username + " usando " + authType);
    }
}



