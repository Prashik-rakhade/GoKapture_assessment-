package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.service.StudentService;

@Controller
public class controller {
	@Autowired
	private StudentService ss;


@GetMapping("/")
public String preload() {
	return "main";
}
}