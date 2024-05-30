package com.projetoteste.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoteste.cursoSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
