package com.garanga.todo_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/")
	public String addTodo() {
		return "redirect:/";
	}

	@GetMapping("/edit")
	public String edit() {
		return "edit";
	}

	@PostMapping("/edit")
	public String updateTodo() {
		return "redirect:/";
	}

}
