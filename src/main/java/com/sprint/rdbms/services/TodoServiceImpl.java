package com.sprint.rdbms.services;

import com.sprint.rdbms.models.Todo;
import com.sprint.rdbms.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "todoService")
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepo;


    @Override
    public List<Todo> findAll() {
        List<Todo> rtnList = new ArrayList<>();
        todoRepo.findAll().iterator().forEachRemaining(rtnList::add);
        return rtnList;

    }

    @Override
    public Todo findTodoById(long id) {
        return null;
    }

    @Override
    public Todo update(Todo todo, long id) {
        return null;
    }
}
