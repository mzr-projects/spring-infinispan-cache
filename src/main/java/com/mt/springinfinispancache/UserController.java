package com.mt.springinfinispancache;

import com.mt.springinfinispancache.entities.UserDemo;
import com.mt.springinfinispancache.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/infinispan")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/user/all")
	public List<UserDemo> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public UserDemo getUserById(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}
}
