package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "com")
public class Jenkins {
	@GetMapping(value = "hello")
	public String get() {
		return "Thanks";
	}
}
