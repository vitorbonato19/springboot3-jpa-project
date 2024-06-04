package com.projetoteste.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetoteste.cursoSpring.entities.User;
import com.projetoteste.cursoSpring.repositories.UserRepository;
import com.projetoteste.cursoSpring.services.exceptions.DatabaseException;
import com.projetoteste.cursoSpring.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException ex) {
			throw new DatabaseException(ex.getMessage());
		}
		
	}
	
	public User udpate(Long id, User user) {
		try {
			User entity = userRepository.getReferenceById(id);
			updateData(entity, user);
			return userRepository.save(entity);
		} catch (EntityNotFoundException ex) {
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		
	}
}
