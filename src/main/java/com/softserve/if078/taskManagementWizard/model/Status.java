package com.softserve.if078.taskManagementWizard.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Status implements Serializable {

  private static final long serialVersionUID = -8907127851833128890L;
  private int statusId;
  private String name;
  private List<Task> listTask;

  @Id
  @Column(name = "status_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getStatusId() {
    return statusId;
  }

  public void setStatusId(int statusId) {
    this.statusId = statusId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @OneToMany(mappedBy = "status")
  public List<Task> getListTask() {
    return listTask;
  }

  public void setListTask(List<Task> listTask) {
    this.listTask = listTask;
  }

  @Override
  public int hashCode() {

    return HashCodeBuilder.reflectionHashCode(this, true);
  }

  @Override
  public boolean equals(Object obj) {

    return EqualsBuilder.reflectionEquals(this, obj, true);
  }

  @Override
  public String toString() {

    return ToStringBuilder.reflectionToString(this);
  }
}
