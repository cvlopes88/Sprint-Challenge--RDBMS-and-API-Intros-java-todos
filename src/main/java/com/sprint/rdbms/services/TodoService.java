package com.sprint.rdbms.services;

import com.sprint.rdbms.models.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    Todo findTodoById(long id);

    Todo update(Todo todo, long id);
}
