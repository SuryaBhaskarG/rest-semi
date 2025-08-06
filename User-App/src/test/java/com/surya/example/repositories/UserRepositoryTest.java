package com.surya.example.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.surya.example.entities.User;


	@DataJpaTest
	class UserRepositoryTest {

	    @Autowired
	    private UserRepository userRepository;

	    @Test
	    void saveUserTest() {
	        User user = new User(null, "Surya", "surya@gmail.com");
	        User saved = userRepository.save(user);

	        Assertions.assertNotNull(saved.getId());
	    }
	}

	

