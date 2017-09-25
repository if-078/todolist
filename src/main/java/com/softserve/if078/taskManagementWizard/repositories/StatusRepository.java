package com.softserve.if078.taskManagementWizard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.if078.taskManagementWizard.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
  List<Status> findAll();

  // Status getOne(Integer ID);

  Status save(Status status);

  Status findByName(String name);

  void delete(Integer ID);

}
