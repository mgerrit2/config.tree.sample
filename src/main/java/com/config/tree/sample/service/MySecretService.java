package com.config.tree.sample.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MySecretService {

    // Spring zoekt in de ConfigTree naar een bestand genaamd 'MY_SECRET_KEY'
    @Value("${SPRING_MAIL_PASSWORD}")
    private String secretKey;

    public String getMailSecret() {
        return secretKey;
    }
}
