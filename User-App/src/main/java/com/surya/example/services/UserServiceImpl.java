package com.surya.example.services;

import org.springframework.stereotype.Service;

import com.surya.example.entities.User;
import com.surya.example.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


	private final UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	
	
}
