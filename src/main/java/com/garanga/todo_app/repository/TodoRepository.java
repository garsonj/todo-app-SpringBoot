package com.garanga.todo_app.repository;

import com.garanga.todo_app.Model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
