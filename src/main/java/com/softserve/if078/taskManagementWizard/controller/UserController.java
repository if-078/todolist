package com.softserve.if078.taskManagementWizard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softserve.if078.taskManagementWizard.model.User;
import com.softserve.if078.taskManagementWizard.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	List<User> getAllUsers() {
		return userService.findAll();
	}

}
