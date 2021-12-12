/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assa.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Sciffer Laptop 10
 */
@Entity
public class Todo {

 // This tells Hibernate to make a table out of this class
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private Integer status;
  private String title;

  public Integer getId() {
    return id;
  }
 public String getTitle() {
    return title;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
 public void setTitle(String title) {
    this.title = title;
  }
}

