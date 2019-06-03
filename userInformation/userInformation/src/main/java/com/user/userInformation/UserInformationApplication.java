package com.user.userInformation;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
public class UserInformationApplication extends ResourceServerConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(UserInformationApplication.class, args);
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId("UserInfo");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.anonymous().and().authorizeRequests().antMatchers("/user/saveuser").permitAll();
	}

	@Bean
	public DozerBeanMapper dozerBean() {
		return   new DozerBeanMapper();
	}

}
