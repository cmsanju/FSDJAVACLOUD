package com.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello CGI Called in First Service";
	}
}
