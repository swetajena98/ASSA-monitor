/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assa.demo.mySqlRecords;

import org.springframework.data.repository.CrudRepository;

import com.assa.demo.entities.Todo;
/**
 *
 * @author fakan
 */
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
