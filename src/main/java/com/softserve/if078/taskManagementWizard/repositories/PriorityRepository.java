package com.softserve.if078.taskManagementWizard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.if078.taskManagementWizard.model.Priority;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {
  List<Priority> findAll();

  // Priority getOne(Integer ID);

  Priority save(Priority priority);

  Priority findByName(String name);

  void delete(Integer ID);

}
