package com.softserve.if078.taskManagementWizard.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Task implements Serializable {

  private static final long serialVersionUID = -6218899735852949634L;
  private int id;
  private String name;
  private Status status;
  private Priority priority;
  private Date createdDate = new Date();
  private List<User> userList = new ArrayList<>(0);

  public void addUser(User user) {
    this.userList.add(user);
  }

  @Id
  @Column(name = "task_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @ManyToOne
  @JoinColumn(name = "status_id")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @ManyToOne
  @JoinColumn(name = "priority_id")
  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date")
  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date date) {
    this.createdDate = date;
  }

  @JsonIgnore
  @ManyToMany(mappedBy = "listTasks", cascade = { CascadeType.ALL })
  public List<User> getUsers() {
    return userList;
  }

  public void setUsers(List<User> users) {
    this.userList = users;
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
