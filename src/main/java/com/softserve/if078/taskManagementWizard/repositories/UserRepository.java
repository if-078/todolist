package com.softserve.if078.taskManagementWizard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.if078.taskManagementWizard.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  List<User> findAll();

  // User getOne(Integer ID);

  User save(User user);

  User findByEmailAndPass(String email, String pass);

  void delete(Integer ID);

}
