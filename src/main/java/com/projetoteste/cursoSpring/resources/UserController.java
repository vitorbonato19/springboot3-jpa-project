package com.projetoteste.cursoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoteste.cursoSpring.entities.User;

@RestController
@RequestMapping({"/users"})
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "23451");
		return ResponseEntity.ok().body(u);
	}
	
}
