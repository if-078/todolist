package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import com.softserve.if078.taskManagementWizard.model.Status;

public interface StatusService {

  List<Status> findAll();

  Status getOne(Integer ID);

  Status save(Status status);

  Status findByName(String name);

  void delete(Integer ID);

}
