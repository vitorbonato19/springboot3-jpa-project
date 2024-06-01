package com.projetoteste.cursoSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoteste.cursoSpring.entities.Order;
import com.projetoteste.cursoSpring.entities.User;
import com.projetoteste.cursoSpring.repositories.OrderRepository;
import com.projetoteste.cursoSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "890128358", "1230968");
		User u2 = new User(null, "Carlos White", "carlos@gmail.com", "535481348", "901283");
		User u3 = new User(null, "Matheus da Silva" , "matheus.silva@gmai.com", "46741546", "132467");
		
		Order o1 = new Order(null, Instant.parse("2024-05-29T20:23:06Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2024-05-30T19:19:03Z"), u2);
		Order o3 = new Order(null, Instant.parse("2024-05-31T22:46:02Z"), u3);
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
