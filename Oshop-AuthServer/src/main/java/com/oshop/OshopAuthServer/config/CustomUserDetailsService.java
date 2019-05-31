package com.oshop.OshopAuthServer.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.oshop.OshopAuthServer.model.Role;
import com.oshop.OshopAuthServer.model.User;
import com.oshop.OshopAuthServer.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User dbUser = this.userRepository.findByEmail(email);
		
		if (dbUser != null) {
			Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
			
			for (Role role : dbUser.getRoles()) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role.getRolename());
				grantedAuthorities.add(authority);
			}
					
			return new org.springframework.security.core.userdetails.User(
					dbUser.getEmail(), dbUser.getPassword(), grantedAuthorities);
		} else {
			throw new UsernameNotFoundException(String.format("User '%s' not found", email));
		}

		
	}

}
