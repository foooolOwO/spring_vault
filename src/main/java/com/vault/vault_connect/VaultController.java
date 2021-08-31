package com.vault.vault_connect;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.vault.vault_connect.configuration.VaultConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.BeansException;

@RestController
@EnableConfigurationProperties(VaultConfiguration.class)
public class VaultController implements ApplicationContextAware {

    private ApplicationContext context;

    @GetMapping("/")
    public String getSecret() {
        VaultConfiguration config = context.getBean(VaultConfiguration.class);
        return "field : " + config.getField() + " , key : " + config.getKey();
//        return "";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
