package com.softserve.if078.taskManagementWizard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.if078.taskManagementWizard.model.Priority;
import com.softserve.if078.taskManagementWizard.repositories.PriorityRepository;

@Service
public class PriorityServiceImpl implements PriorityService {

  @Autowired
  PriorityRepository priorityRepository;

  @Override
  public List<Priority> findAll() {
    return priorityRepository.findAll();
  }

  @Override
  public Priority getOne(Integer ID) {
    return priorityRepository.getOne(ID);
  }

  @Override
  public Priority save(Priority priority) {
    return priorityRepository.save(priority);
  }

  @Override
  public Priority findByName(String name) {
    return priorityRepository.findByName(name);
  }

  @Override
  public void delete(Integer ID) {
    priorityRepository.delete(ID);
  }

}
