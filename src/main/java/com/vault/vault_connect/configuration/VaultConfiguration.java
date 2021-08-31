package com.vault.vault_connect.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("")
public class VaultConfiguration {
    private String field;
    private String key;

    public String getField() {
        return this.field;
    }

    public String getKey() {
        return this.key;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
