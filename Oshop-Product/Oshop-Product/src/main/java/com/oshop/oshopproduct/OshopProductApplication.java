package com.oshop.oshopproduct;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class OshopProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(OshopProductApplication.class, args);
	}
	
	@Bean
	public DozerBeanMapper dozerBean() {
		DozerBeanMapper dozerBean = new DozerBeanMapper();
		return dozerBean;
	}
	
	

}
