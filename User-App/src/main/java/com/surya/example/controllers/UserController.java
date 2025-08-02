package com.surya.example.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.example.entities.User;
import com.surya.example.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	
	

    @PostMapping("/addNewUser")	
	private User addUser(@RequestBody User user)
	{
		return userService.save(user);
	}
    
}
