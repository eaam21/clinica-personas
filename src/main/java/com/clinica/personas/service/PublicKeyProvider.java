package com.clinica.personas.service;

import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

@Component
public class PublicKeyProvider {
    private final PublicKey publicKey;

    public PublicKeyProvider() throws Exception {
        String key = Files.readString(Path.of("public.pem"))
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replace("-----END PUBLIC KEY-----", "")
                .replaceAll("\\s+", "");

        byte[] decoded = Base64.getDecoder().decode(key);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(decoded);
        this.publicKey = KeyFactory.getInstance("RSA").generatePublic(spec);
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }
}
