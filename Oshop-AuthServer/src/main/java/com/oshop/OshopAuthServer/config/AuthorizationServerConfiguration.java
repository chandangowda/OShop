package com.oshop.OshopAuthServer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

	private static String REALM = "MICRO_SERVICE_OAUTH";

	@Autowired
    private TokenStore tokenStore;

    @Autowired
    private UserApprovalHandler userApprovalHandler;

    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;


	final static Logger logger = LoggerFactory.getLogger(AuthorizationServerConfiguration.class);

	/*
	 * @Override public void configure(ClientDetailsServiceConfigurer clients)
	 * throws Exception { clients.jdbc(dataSource).passwordEncoder(passwordEncoder);
	 * 
	 * }
	 */

	/*
	 * @Override public void configure(AuthorizationServerEndpointsConfigurer
	 * endpoints) throws Exception {
	 * 
	 * endpoints.tokenStore(tokenStore).authorizationCodeServices(
	 * authorizationCodeServices) .userDetailsService(userAuthenticationServiceImpl)
	 * .authenticationManager(authenticationManager).tokenEnhancer(tokenEnhancer)
	 * .approvalStoreDisabled(); }
	 */

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
        .withClient("client_id")
        .secret("{noop}secret")
        .authorizedGrantTypes("password", "authorization_code", "refresh_token")
        .scopes("read", "write")
        .resourceIds("auth-server")
        .accessTokenValiditySeconds(600)
        .refreshTokenValiditySeconds(3600);
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(this.tokenStore).userApprovalHandler(this.userApprovalHandler)
				.authenticationManager(this.authenticationManager);
	}

	

	/*
	 * @Override public void configure(AuthorizationServerSecurityConfigurer
	 * security) throws Exception { security.realm(REALM +
	 * "/client").passwordEncoder(passwordEncoder); }
	 * 
	 * @Bean
	 * 
	 * @Primary public AuthorizationServerTokenServices tokenServices() {
	 * DefaultTokenServices tokenServices = new DefaultTokenServices();
	 * tokenServices.setTokenStore(tokenStore);
	 * tokenServices.setSupportRefreshToken(true);
	 * tokenServices.setTokenEnhancer(tokenEnhancer); return tokenServices; }
	 */
	
	@SuppressWarnings("deprecation")
	 public static NoOpPasswordEncoder passwordEncoder() {
	     return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	 }
}
