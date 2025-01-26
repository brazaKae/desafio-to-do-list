package com.kae.to_do_list.controller;

import com.kae.to_do_list.entity.Todo;
import com.kae.to_do_list.repository.TodoRepository;
import com.kae.to_do_list.service.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    public TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    List<Todo> create(Todo todo){
        return todoService.create(todo);
    }
    List<Todo> list(){
        return todoService.list();
    }
    List<Todo> update(Todo todo){
        return todoService.update(todo);
    }
    List<Todo> delete(Long id){
        return todoService.delete(id);
    }
}
