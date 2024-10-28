package com.db.msApp.configurations;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

import java.security.Security;

@Configuration
public class BouncyCastleConfig {

    @PostConstruct
    public void addBouncyCastleProvider() {
        // Verificar si BouncyCastle ya está registrado, si no, agregarlo
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
            System.out.println("BouncyCastle provider registered.");
        } else {
            System.out.println("BouncyCastle provider already registered.");
        }
    }
}
