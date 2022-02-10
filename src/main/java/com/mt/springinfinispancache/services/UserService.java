package com.mt.springinfinispancache.services;

import com.mt.springinfinispancache.entities.UserDemo;
import com.mt.springinfinispancache.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<UserDemo> getAllUsers() {
		return userRepository.findAll();
	}

	public UserDemo getUserById(Long userId){
		Optional<UserDemo> optionalUser = userRepository.findById(userId);
		return optionalUser.orElseGet(optionalUser::get);
	}
}
