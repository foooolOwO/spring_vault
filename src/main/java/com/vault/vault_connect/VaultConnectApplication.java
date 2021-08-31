package com.vault.vault_connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaultConnectApplication {

	private static Logger log = LoggerFactory.getLogger(VaultConnectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VaultConnectApplication.class, args);
	}

}
