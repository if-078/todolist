package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import com.softserve.if078.taskManagementWizard.model.Task;

public interface TaskService {
  List<Task> findAll();

  Task getOne(Integer ID);

  Task save(Task task);

  Task findByName(String name);

  void delete(Integer ID);

}
