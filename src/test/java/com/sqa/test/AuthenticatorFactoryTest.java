package com.sqa.test;

import com.sqa.autenticacion.AuthenticatorFactory;
import com.sqa.interfaces.Authenticator;
import com.sqa.procesos.BasicAuthenticator;
import com.sqa.procesos.OAuthAuthenticator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticatorFactoryTest {

    @Test
    public void testCreateBasicAuthenticator() {
        Authenticator authenticator = AuthenticatorFactory.createAuthenticator("basic");
        assertNotNull(authenticator);
        assertTrue(authenticator instanceof BasicAuthenticator);
    }

    @Test
    public void testCreateOAuthAuthenticator() {
        Authenticator authenticator = AuthenticatorFactory.createAuthenticator("oauth");
        assertNotNull(authenticator);
        assertTrue(authenticator instanceof OAuthAuthenticator);
    }

    @Test
    public void testCreateUnknownAuthenticator() {
        assertThrows(IllegalArgumentException.class, () -> {
            AuthenticatorFactory.createAuthenticator("unknown");
        });
    }
}

