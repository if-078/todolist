package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import com.softserve.if078.taskManagementWizard.model.Priority;

public interface PriorityService {

  List<Priority> findAll();

  Priority getOne(Integer ID);

  Priority save(Priority priority);

  Priority findByName(String name);

  void delete(Integer ID);

}
