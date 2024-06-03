package com.projetoteste.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoteste.cursoSpring.entities.OrderItem;
import com.projetoteste.cursoSpring.entities.pk.OrderitemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderitemPK> {
	
}
