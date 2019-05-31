package com.oshop.OshopAuthServer.controller;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping("/authenticate")
	  public ResponseEntity<Principal> user(Principal user) {
	   return ResponseEntity.<Principal>ok(user);
	  }
	
	
	
	
	
	

}
