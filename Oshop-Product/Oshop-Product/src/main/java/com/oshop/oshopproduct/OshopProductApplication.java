package com.oshop.oshopproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableResourceServer
public class OshopProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(OshopProductApplication.class, args);
	}
	
	@GetMapping("/test123")
	public String hi() {
		return "hi";
	}

}
