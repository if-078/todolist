package com.softserve.if078.taskManagementWizard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.if078.taskManagementWizard.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

  List<Task> findAll();

  // Task getOne(Integer ID);

  Task save(Task user);

  Task findByName(String name);

  void delete(Integer ID);

}
