package com.softserve.if078.taskManagementWizard.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
public class Priority implements Serializable {

  private static final long serialVersionUID = 4906034498580064833L;
  private int priorityId;
  private String name;
  private List<Task> listTasks;

  @Id
  @Column(name = "priority_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getPriorityId() {
    return priorityId;
  }

  public void setPriorityId(int priorityId) {
    this.priorityId = priorityId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @OneToMany(mappedBy = "priority", cascade = { CascadeType.ALL })
  public List<Task> getListTasks() {
    return listTasks;
  }

  public void setListTasks(List<Task> listTasks) {
    this.listTasks = listTasks;
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
