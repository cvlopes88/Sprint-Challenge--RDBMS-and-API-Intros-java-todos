package com.sprint.rdbms.repository;

import com.sprint.rdbms.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository  extends CrudRepository<Todo, Long> {


}
