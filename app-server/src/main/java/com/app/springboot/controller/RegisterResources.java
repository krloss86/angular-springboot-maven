package com.app.springboot.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.dto.Registration;
import com.app.springboot.dto.Usuario;

@CrossOrigin(origins = "http://localhost:4200",methods = RequestMethod.POST)
@RestController
@RequestMapping("/users")
public class RegisterResources {

	@Autowired
	private HttpServletRequest contextRequest;
	
	@PostMapping("/register")
	public ResponseEntity<Usuario> login(@Valid @RequestBody Registration registration ) throws URISyntaxException {
				
		HttpHeaders headers = new HttpHeaders();
		
		headers.set("Authorization", "{JWTTOKEN:1}");

        return ResponseEntity.created(new URI(contextRequest.getContextPath()))
                .headers(headers)
                .body(new Usuario(1L, registration.getUsername()));
	}

}
