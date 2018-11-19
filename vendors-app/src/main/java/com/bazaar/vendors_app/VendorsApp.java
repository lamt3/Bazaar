package com.bazaar.vendors_app;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendorsApp {
	public static void main(final String... args) {
		final SpringApplication app = new SpringApplication(VendorsApp.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
		app.run(args);
	}

}
