package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.if078.taskManagementWizard.model.Status;
import com.softserve.if078.taskManagementWizard.repositories.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {

  @Autowired
  StatusRepository statusRepository;

  @Override
  public List<Status> findAll() {
    return statusRepository.findAll();
  }

  @Override
  public Status getOne(Integer ID) {
    return statusRepository.getOne(ID);
  }

  @Override
  public Status save(Status status) {
    return statusRepository.save(status);
  }

  @Override
  public Status findByName(String name) {
    return statusRepository.findByName(name);
  }

  @Override
  public void delete(Integer ID) {
    statusRepository.delete(ID);
  }

}
