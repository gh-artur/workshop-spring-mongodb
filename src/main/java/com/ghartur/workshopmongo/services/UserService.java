package com.ghartur.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghartur.workshopmongo.domain.User;
import com.ghartur.workshopmongo.repository.UserRepository;
import com.ghartur.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService{

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
	
}
