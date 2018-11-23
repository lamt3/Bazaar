package com.bazaar.marketplace;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketplaceApp{
	public static void main(final String... args) {
		final SpringApplication app = new SpringApplication(MarketplaceApp.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8086"));
		app.run(args);
	}

}
