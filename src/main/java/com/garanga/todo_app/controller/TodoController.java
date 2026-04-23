package com.garanga.todo_app.controller;

import com.garanga.todo_app.Model.Todo;
import com.garanga.todo_app.service.TodoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	private final TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("todos", todoService.findAll());
		model.addAttribute("todo", new Todo());
		return "index";
	}

	@PostMapping("/")
	public String addTodo(@ModelAttribute Todo todo) {
		todoService.save(todo);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Todo todo = todoService.findById(id);
		if (todo == null) {
			return "redirect:/";
		}
		model.addAttribute("todo", todo);
		return "edit";
	}

	@PostMapping("/edit")
	public String updateTodo(@ModelAttribute Todo todo) {
		todoService.save(todo);
		return "redirect:/";
	}

	@PostMapping("/todo/{id}/toggle")
	public String toggleTodo(@PathVariable Long id) {
		Todo todo = todoService.findById(id);
		if (todo != null) {
			todo.setCompleted(!todo.isCompleted());
			todoService.save(todo);
		}
		return "redirect:/";
	}

	@PostMapping("/todo/{id}/delete")
	public String deleteTodo(@PathVariable Long id) {
		todoService.deleteById(id);
		return "redirect:/";
	}

}
