package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.if078.taskManagementWizard.model.User;
import com.softserve.if078.taskManagementWizard.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User getOne(Integer ID) {
		return userRepository.getOne(ID);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findByEmailAndPass(String email, String pass) {
		return userRepository.findByEmailAndPass(email, pass);
	}

	@Override
	public void delete(Integer ID) {
		userRepository.delete(ID);
	}

}
