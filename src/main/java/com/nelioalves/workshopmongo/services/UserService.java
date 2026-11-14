package com.nelioalves.workshopmongo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	private  final UserRepository repo;

	public UserService(UserRepository userRepository) {
	    this.repo = userRepository;
	}

	
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
