package com.sqa.test;

import com.sqa.interfaces.Authenticator;
import com.sqa.procesos.BasicAuthenticator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicAuthenticatorTest {

    @Test
    public void testBasicAuthenticationSuccess() {
        Authenticator authenticator = new BasicAuthenticator();
        assertTrue(authenticator.authenticate("usuario", "contraseña"));
    }

    @Test
    public void testBasicAuthenticationFailure() {
        Authenticator authenticator = new BasicAuthenticator();
        assertFalse(authenticator.authenticate("usuario", "contraseñaIncorrecta"));
        assertFalse(authenticator.authenticate("usuarioIncorrecto", "contraseña"));
    }
}
