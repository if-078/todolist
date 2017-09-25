package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.if078.taskManagementWizard.model.Task;
import com.softserve.if078.taskManagementWizard.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

  @Autowired
  TaskRepository taskRepository;

  @Override
  public List<Task> findAll() {
    return taskRepository.findAll();
  }

  @Override
  public Task getOne(Integer ID) {
    return taskRepository.findOne(ID);
  }

  @Override
  public Task save(Task task) {
    return taskRepository.save(task);
  }

  @Override
  public Task findByName(String name) {
    return taskRepository.findByName(name);
  }

  @Override
  public void delete(Integer ID) {
    taskRepository.delete(ID);

  }

}
