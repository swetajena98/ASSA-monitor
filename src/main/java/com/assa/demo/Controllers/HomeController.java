/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assa.demo.Controllers;

import com.assa.demo.TodoType;
import com.assa.demo.entities.Todo;
import com.assa.demo.mySqlRecords.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping(path = "/demo")
public class HomeController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TodoRepository TodoRepository;

    @GetMapping(path = "/")
    public @ResponseBody
    Iterable<Todo> getAllTodos() {
        // This returns a JSON or XML with the users
        return TodoRepository.findAll();
    }

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    Todo addNewTodo(@RequestBody TodoType todo) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Todo newTd = new Todo();
        newTd.setTitle(todo.title);
        TodoRepository.save(newTd);
    return newTd;
    }

}
