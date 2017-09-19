package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import com.softserve.if078.taskManagementWizard.model.User;

public interface UserService {

	List<User> findAll();

	User getOne(Integer ID);

	User save(User user);

	User findByEmailAndPass(String email, String pass);

	void delete(Integer ID);
}
