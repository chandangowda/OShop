package com.oshopgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableZuulProxy
@EnableWebSecurity
@EnableEurekaClient
public class OshopGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OshopGatewayApplication.class, args);
	}

}
