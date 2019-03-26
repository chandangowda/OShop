package com.oshop.oshopregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OshopRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OshopRegistryApplication.class, args);
	}

}
