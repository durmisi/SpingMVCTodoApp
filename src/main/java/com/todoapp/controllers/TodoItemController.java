package com.todoapp.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.model.TodoItem;
import com.todoapp.repo.TodoItemRepository;

@RestController
public class TodoItemController {
  
	@Autowired
    private TodoItemRepository todoItemRepo;
     
    @GetMapping("/todo/list")
    public List<TodoItem>  listAll() {
        List<TodoItem> listTodoItems = todoItemRepo.findAll();
         
        return listTodoItems;
    }
    
    
    @GetMapping("/todo/create")
    public TodoItem  create(String title) {
        
    	TodoItem todoItem = new TodoItem(title);
    	
    	todoItemRepo.save(todoItem);
         
        return todoItem;
    }
     
}