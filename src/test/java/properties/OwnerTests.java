package properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTests {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void credentialTest() {
        String login = config.login();
        String password = config.password();
        String baseUrl = config.baseUrl();
        System.out.println("Login: "+login);
        System.out.println("Password: "+password);
        System.out.println("baseUrl: "+baseUrl);
    }
}
