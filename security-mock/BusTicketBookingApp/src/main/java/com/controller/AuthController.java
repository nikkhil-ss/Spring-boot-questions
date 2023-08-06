package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.JwtUtility;
import com.repository.UserRepository;
import com.request.LoginRequest;
import com.response.JSONResponse;

import jakarta.validation.Valid;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private JwtUtility jwtUtility;
	
	private Logger log = LoggerFactory.getLogger(AuthController.class);
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateUser(@Valid @RequestBody LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		if(authentication.isAuthenticated()) {
			String token = jwtUtility.generateToken(authentication);
			List<String> roles = new ArrayList<>();
			authentication.getAuthorities().forEach(obj -> roles.add(obj.toString()));
			log.info(roles.get(0));
			JSONResponse jsonResponseObj = new JSONResponse(token, loginRequest.getUsername(), roles); 
			return ResponseEntity.ok(jsonResponseObj);
		}
		else {
			throw new UsernameNotFoundException("Username " + loginRequest.getUsername() + " is not valid");
		}																
	}
}
