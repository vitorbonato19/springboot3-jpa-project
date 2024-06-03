package com.projetoteste.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoteste.cursoSpring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
