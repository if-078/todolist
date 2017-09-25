package com.softserve.if078.taskManagementWizard.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {

  private static final long serialVersionUID = -621667797282692035L;

  private int id;
  private String name;
  private String pass;
  private String email;
  private List<Task> listTasks = new ArrayList<>(0);

  public void addTask(Task task) {
    this.listTasks.add(task);
  }

  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "pass")
  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @JsonIgnore
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "users_tags", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "task_id"))
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
