package com.sqa.procesos;

import com.sqa.interfaces.Authenticator;

public class LoginManager {
    private Authenticator authenticator;

    public LoginManager(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean login(String username, String password) {
        return authenticator.authenticate(username, password);
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

}

