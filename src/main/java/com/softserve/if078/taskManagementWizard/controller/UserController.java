package com.softserve.if078.taskManagementWizard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softserve.if078.taskManagementWizard.model.User;
import com.softserve.if078.taskManagementWizard.service.UserService;

@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	List<User> getAllUsers() {
		return userService.findAll();
	}

}
