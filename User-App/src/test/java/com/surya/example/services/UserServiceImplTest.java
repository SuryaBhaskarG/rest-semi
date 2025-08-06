package com.surya.example.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.surya.example.entities.User;
import com.surya.example.repositories.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServiceImpl userService;

	@Test
	@DisplayName("i am testing saveUserInUserServiceImpl")
	void saveUserTest() {
		User user = new User(null, "Surya", "surya@gmail.com");
		User savedUser = new User(1L, "Surya", "surya@gmail.com");

		Mockito.when(userRepository.save(user)).thenReturn(savedUser);

		User result = userService.save(user);
		Assertions.assertEquals(1L, result.getId());
		Assertions.assertEquals("Surya", result.getName());
		Assertions.assertEquals("s1urya@gmail.com", result.getEmail());
	}

}
