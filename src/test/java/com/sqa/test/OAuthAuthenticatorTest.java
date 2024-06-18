package com.sqa.test;

import com.sqa.interfaces.Authenticator;
import com.sqa.procesos.OAuthAuthenticator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OAuthAuthenticatorTest {

    @Test
    public void testOAuthAuthenticationSuccess() {
        Authenticator authenticator = new OAuthAuthenticator();
        assertTrue(authenticator.authenticate("usuarioOAuth", "contraseñaOAuth"));
    }

    @Test
    public void testOAuthAuthenticationFailure() {
        Authenticator authenticator = new OAuthAuthenticator();
        assertFalse(authenticator.authenticate("usuarioOAuth", "usuarioOAuthIncorrecta"));
        assertFalse(authenticator.authenticate("usuarioOAuthIncorrecto", "contraseñaOAuth"));
    }
}

