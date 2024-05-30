package com.projetoteste.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
