package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialConfig credentials = ConfigFactory.create(CredentialConfig.class);
}
