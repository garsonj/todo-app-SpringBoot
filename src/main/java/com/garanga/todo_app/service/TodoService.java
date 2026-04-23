package com.garanga.todo_app.service;

import java.util.List;

import com.garanga.todo_app.Model.Todo;
import com.garanga.todo_app.repository.TodoRepository;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private final TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public List<Todo> findAll() {
		return todoRepository.findAll();
	}

	public Todo findById(Long id) {
		return todoRepository.findById(id).orElse(null);
	}

	public Todo save(Todo todo) {
		return todoRepository.save(todo);
	}

	public void deleteById(Long id) {
		todoRepository.deleteById(id);
	}

}
