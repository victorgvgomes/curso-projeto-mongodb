package com.nelioalves.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	private  final UserRepository repo;

	public UserService(UserRepository userRepository) {
	    this.repo = userRepository;
	}

	
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
	    Optional<User> obj = repo.findById(id);
	    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
}
