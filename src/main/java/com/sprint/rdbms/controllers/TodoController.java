package com.sprint.rdbms.controllers;


import com.sprint.rdbms.models.Todo;
import com.sprint.rdbms.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PutMapping(value = "/todo/{todoid}", consumes = {"application/json"})
    public ResponseEntity<?> updateTodo(@PathVariable long todoid, @RequestBody Todo todo){
        todoService.update(todo, todoid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
